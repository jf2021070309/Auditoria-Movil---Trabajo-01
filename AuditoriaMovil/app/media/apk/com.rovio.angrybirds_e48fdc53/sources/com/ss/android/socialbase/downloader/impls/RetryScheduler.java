package com.ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.common.AppStatusManager;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.IDownloadLaunchHandler;
import com.ss.android.socialbase.downloader.downloader.IReserveWifiStatusListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class RetryScheduler implements Handler.Callback, AppStatusManager.AppStatusChangeListener {
    private static final int MIN_INTERVAL_MS = 3000;
    private static final int MIN_INTERVAL_MS_ACCELERATION = 5000;
    public static final int NET_TYPE_COMMON = 1;
    public static final int NET_TYPE_NONE = 0;
    public static final int NET_TYPE_WIFI = 2;
    public static final int RETRY_SCHEDULE_NORMAL = 1;
    public static final int RETRY_SCHEDULE_WHEN_APP_BACKGROUND = 3;
    public static final int RETRY_SCHEDULE_WHEN_APP_FOREGROUND = 4;
    public static final int RETRY_SCHEDULE_WHEN_OTHER_CONNECTED = 5;
    public static final int RETRY_SCHEDULE_WHEN_OTHER_SUCCEED = 2;
    private static final int SCHEDULE_ALL_TASK_RETRY_DELAY = 2000;
    private static final int SCHEDULE_ALL_TASK_RETRY_MIN_INTERVAL = 10000;
    private static final String TAG = "RetryScheduler";
    private static volatile RetryScheduler sInstance;
    private static RetryScheduleHandler sRetryScheduleHandler;
    private ConnectivityManager mConnectivityManager;
    private final boolean mIsDownloaderProcess;
    private long mLastHandleAllTaskTime;
    private final Handler mHandler = new Handler(Looper.getMainLooper(), this);
    private final SparseArray<RetryInfo> mRetryInfoList = new SparseArray<>();
    private int mWaitingRetryTasksCount = 0;
    private final Context mContext = DownloadComponentManager.getAppContext();

    /* loaded from: classes3.dex */
    public interface RetryScheduleHandler {
        void cancelRetry(int i);

        void scheduleRetry(DownloadInfo downloadInfo, long j, boolean z, int i);
    }

    private RetryScheduler() {
        registerNetworkCallback();
        this.mIsDownloaderProcess = DownloadUtils.isDownloaderProcess();
        AppStatusManager.getInstance().registerAppSwitchListener(this);
    }

    public static RetryScheduler getInstance() {
        if (sInstance == null) {
            synchronized (RetryScheduler.class) {
                if (sInstance == null) {
                    sInstance = new RetryScheduler();
                }
            }
        }
        return sInstance;
    }

    public static void setRetryScheduleHandler(RetryScheduleHandler retryScheduleHandler) {
        sRetryScheduleHandler = retryScheduleHandler;
    }

    private void registerNetworkCallback() {
        if (DownloadSetting.obtainGlobal().optInt(DownloadSettingKeys.USE_NETWORK_CALLBACK, 0) != 1) {
            return;
        }
        DownloadComponentManager.getCPUThreadExecutor().execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.RetryScheduler.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (RetryScheduler.this.mContext != null && Build.VERSION.SDK_INT >= 21) {
                        RetryScheduler retryScheduler = RetryScheduler.this;
                        retryScheduler.mConnectivityManager = (ConnectivityManager) retryScheduler.mContext.getApplicationContext().getSystemService("connectivity");
                        RetryScheduler.this.mConnectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), new ConnectivityManager.NetworkCallback() { // from class: com.ss.android.socialbase.downloader.impls.RetryScheduler.1.1
                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onAvailable(Network network) {
                                Logger.d(RetryScheduler.TAG, "network onAvailable: ");
                                RetryScheduler.this.scheduleAllTaskRetry(1, true);
                            }
                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void tryStartScheduleRetry(DownloadInfo downloadInfo) {
        if (downloadInfo == null || TextUtils.isEmpty(DownloadConstants.MIME_APK) || !DownloadConstants.MIME_APK.equals(downloadInfo.getMimeType())) {
            return;
        }
        tryStartScheduleRetry(downloadInfo, downloadInfo.isOnlyWifi() || downloadInfo.isPauseReserveOnWifi(), getNetWorkType());
    }

    private void tryStartScheduleRetry(DownloadInfo downloadInfo, boolean z, int i) {
        BaseException failedException = downloadInfo.getFailedException();
        if (failedException == null) {
            return;
        }
        RetryInfo obtainRetryInfo = obtainRetryInfo(downloadInfo.getId());
        if (obtainRetryInfo.mRetryCount <= obtainRetryInfo.maxCount) {
            int errorCode = failedException.getErrorCode();
            if (!DownloadUtils.isInsufficientSpaceError(failedException) && !DownloadUtils.isNetworkError(failedException) && (!downloadInfo.statusInPause() || !downloadInfo.isPauseReserveOnWifi())) {
                if (!canRetryForAllowErrorCode(obtainRetryInfo, errorCode)) {
                    return;
                }
                Logger.i(TAG, "allow error code, id = " + obtainRetryInfo.id + ", error code = " + errorCode);
            }
            obtainRetryInfo.mNeedWifi = z;
            synchronized (this.mRetryInfoList) {
                if (!obtainRetryInfo.mIsWaitingRetry) {
                    obtainRetryInfo.mIsWaitingRetry = true;
                    this.mWaitingRetryTasksCount++;
                }
            }
            int currentRetryIntervalMs = obtainRetryInfo.getCurrentRetryIntervalMs();
            Logger.i(TAG, "tryStartScheduleRetry: id = " + obtainRetryInfo.id + ", delayTimeMills = " + currentRetryIntervalMs + ", mWaitingRetryTasks = " + this.mWaitingRetryTasksCount);
            if (obtainRetryInfo.useJobScheduler) {
                if (i == 0) {
                    obtainRetryInfo.resetRetryInterval();
                }
                RetryScheduleHandler retryScheduleHandler = sRetryScheduleHandler;
                if (retryScheduleHandler != null) {
                    retryScheduleHandler.scheduleRetry(downloadInfo, currentRetryIntervalMs, z, i);
                }
                if (this.mIsDownloaderProcess) {
                    obtainRetryInfo.updateRetryTimeStamp(System.currentTimeMillis());
                    obtainRetryInfo.increaseRetryCount();
                    obtainRetryInfo.increaseRetryInterval();
                    return;
                }
                return;
            } else if (z) {
                return;
            } else {
                this.mHandler.removeMessages(downloadInfo.getId());
                this.mHandler.sendEmptyMessageDelayed(downloadInfo.getId(), currentRetryIntervalMs);
                return;
            }
        }
        Logger.w(TAG, "tryStartScheduleRetry, id = " + obtainRetryInfo.id + ", mRetryCount = " + obtainRetryInfo.mRetryCount + ", maxCount = " + obtainRetryInfo.maxCount);
    }

    public void tryCancelScheduleRetry(int i) {
        synchronized (this.mRetryInfoList) {
            RetryInfo retryInfo = this.mRetryInfoList.get(i);
            if (retryInfo == null) {
                return;
            }
            if (retryInfo.mIsWaitingRetry) {
                retryInfo.mIsWaitingRetry = false;
                int i2 = this.mWaitingRetryTasksCount - 1;
                this.mWaitingRetryTasksCount = i2;
                if (i2 < 0) {
                    this.mWaitingRetryTasksCount = 0;
                }
            }
            if (retryInfo.useJobScheduler) {
                RetryScheduleHandler retryScheduleHandler = sRetryScheduleHandler;
                if (retryScheduleHandler != null) {
                    retryScheduleHandler.cancelRetry(i);
                    return;
                }
                return;
            }
            this.mHandler.removeMessages(i);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            doScheduleAllTaskRetry(message.arg1, message.arg2 == 1);
        } else {
            Logger.i(TAG, "handleMessage, doSchedulerRetry, id = " + message.what);
            doSchedulerRetry(message.what);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleAllTaskRetry(int i, boolean z) {
        if (this.mWaitingRetryTasksCount <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (!z) {
                if (currentTimeMillis - this.mLastHandleAllTaskTime < 10000) {
                    return;
                }
            }
            this.mLastHandleAllTaskTime = currentTimeMillis;
            Logger.i(TAG, "scheduleAllTaskRetry, level = [" + i + "], force = [" + z + "]");
            if (z) {
                this.mHandler.removeMessages(0);
            }
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.arg1 = i;
            obtain.arg2 = z ? 1 : 0;
            this.mHandler.sendMessageDelayed(obtain, 2000L);
        }
    }

    private void doScheduleAllTaskRetry(final int i, final boolean z) {
        DownloadComponentManager.getCPUThreadExecutor().execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.RetryScheduler.2
            @Override // java.lang.Runnable
            public void run() {
                int netWorkType;
                try {
                    if (RetryScheduler.this.mWaitingRetryTasksCount > 0 && (netWorkType = RetryScheduler.this.getNetWorkType()) != 0) {
                        Logger.i(RetryScheduler.TAG, "doScheduleAllTaskRetry: mWaitingRetryTasksCount = " + RetryScheduler.this.mWaitingRetryTasksCount);
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList<RetryInfo> arrayList = new ArrayList();
                        synchronized (RetryScheduler.this.mRetryInfoList) {
                            for (int i2 = 0; i2 < RetryScheduler.this.mRetryInfoList.size(); i2++) {
                                RetryInfo retryInfo = (RetryInfo) RetryScheduler.this.mRetryInfoList.valueAt(i2);
                                if (retryInfo != null && retryInfo.canRetry(currentTimeMillis, i, netWorkType, z)) {
                                    if (z) {
                                        retryInfo.resetRetryInterval();
                                    }
                                    arrayList.add(retryInfo);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            for (RetryInfo retryInfo2 : arrayList) {
                                RetryScheduler.this.doSchedulerRetryInSubThread(retryInfo2.id, netWorkType, false);
                            }
                        }
                    }
                } catch (Exception e) {
                }
            }
        });
    }

    public void doSchedulerRetry(final int i) {
        DownloadComponentManager.getCPUThreadExecutor().execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.RetryScheduler.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    RetryScheduler retryScheduler = RetryScheduler.this;
                    retryScheduler.doSchedulerRetryInSubThread(i, retryScheduler.getNetWorkType(), true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doSchedulerRetryInSubThread(int i, int i2, boolean z) {
        IReserveWifiStatusListener reserveWifiStatusListener;
        boolean z2;
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        synchronized (this.mRetryInfoList) {
            RetryInfo retryInfo = this.mRetryInfoList.get(i);
            if (retryInfo == null) {
                return;
            }
            boolean z3 = true;
            if (retryInfo.mIsWaitingRetry) {
                retryInfo.mIsWaitingRetry = false;
                int i3 = this.mWaitingRetryTasksCount - 1;
                this.mWaitingRetryTasksCount = i3;
                if (i3 < 0) {
                    this.mWaitingRetryTasksCount = 0;
                }
            }
            Logger.i(TAG, "doSchedulerRetryInSubThread: downloadId = " + i + ", retryCount = " + retryInfo.mRetryCount + ", mWaitingRetryTasksCount = " + this.mWaitingRetryTasksCount);
            DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i);
            if (downloadInfo == null) {
                removeRetryInfo(i);
                return;
            }
            Logger.e(TAG, "doSchedulerRetryInSubThread，id:" + i);
            int realStatus = downloadInfo.getRealStatus();
            if (realStatus == -3 || realStatus == -4) {
                removeRetryInfo(i);
            } else if (realStatus == -5 || (realStatus == -2 && downloadInfo.isPauseReserveOnWifi())) {
                if (realStatus == -2 && (reserveWifiStatusListener = Downloader.getInstance(DownloadComponentManager.getAppContext()).getReserveWifiStatusListener()) != null) {
                    reserveWifiStatusListener.onStatusChanged(downloadInfo, 4, 3);
                }
                IDownloadLaunchHandler downloadLaunchHandler = DownloadComponentManager.getDownloadLaunchHandler();
                if (downloadLaunchHandler != null) {
                    downloadLaunchHandler.onLaunchResume(Collections.singletonList(downloadInfo), 3);
                }
                removeRetryInfo(i);
            } else if (realStatus != -1) {
            } else {
                if (i2 != 0) {
                    z2 = true;
                } else if (retryInfo.useJobScheduler) {
                    z2 = false;
                } else {
                    return;
                }
                BaseException failedException = downloadInfo.getFailedException();
                if (z2 && DownloadUtils.isInsufficientSpaceError(failedException)) {
                    z2 = canRetryWhenInsufficientSpace(downloadInfo, failedException);
                }
                retryInfo.increaseRetryCount();
                if (z2) {
                    Logger.i(TAG, "doSchedulerRetry: restart task, ****** id = " + retryInfo.id);
                    retryInfo.updateRetryTimeStamp(System.currentTimeMillis());
                    if (z) {
                        retryInfo.increaseRetryInterval();
                    }
                    downloadInfo.setRetryScheduleCount(retryInfo.mRetryCount);
                    if (downloadInfo.getStatus() == -1) {
                        Downloader.getInstance(context).restart(downloadInfo.getId());
                        return;
                    }
                    return;
                }
                if (z) {
                    retryInfo.increaseRetryInterval();
                }
                if (!downloadInfo.isOnlyWifi() && !downloadInfo.isPauseReserveOnWifi()) {
                    z3 = false;
                }
                tryStartScheduleRetry(downloadInfo, z3, i2);
            }
        }
    }

    private boolean canRetryForAllowErrorCode(RetryInfo retryInfo, int i) {
        int[] iArr = retryInfo.allowErrorCode;
        if (iArr == null || iArr.length == 0) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private RetryInfo obtainRetryInfo(int i) {
        RetryInfo retryInfo = this.mRetryInfoList.get(i);
        if (retryInfo == null) {
            synchronized (this.mRetryInfoList) {
                retryInfo = this.mRetryInfoList.get(i);
                if (retryInfo == null) {
                    retryInfo = createRetryInfo(i);
                }
                this.mRetryInfoList.put(i, retryInfo);
            }
        }
        return retryInfo;
    }

    private void removeRetryInfo(int i) {
        synchronized (this.mRetryInfoList) {
            this.mRetryInfoList.remove(i);
        }
    }

    private RetryInfo createRetryInfo(int i) {
        int[] iArr;
        int i2;
        int i3;
        boolean z;
        DownloadSetting obtain = DownloadSetting.obtain(i);
        boolean z2 = false;
        int optInt = obtain.optInt(DownloadSettingKeys.RETRY_SCHEDULE, 0);
        JSONObject optJSONObject = obtain.optJSONObject(DownloadSettingKeys.RETRY_SCHEDULE_CONFIG);
        int i4 = 60;
        if (optJSONObject != null) {
            int optInt2 = optJSONObject.optInt(DownloadSettingKeys.RetryScheduleConfig.MAX_COUNT, 60);
            int optInt3 = optJSONObject.optInt(DownloadSettingKeys.RetryScheduleConfig.INTERVAL_SEC, 60);
            int optInt4 = optJSONObject.optInt(DownloadSettingKeys.RetryScheduleConfig.INTERVAL_SEC_ACCELERATION, 60);
            if (Build.VERSION.SDK_INT >= 21 && sRetryScheduleHandler != null && optJSONObject.optInt(DownloadSettingKeys.RetryScheduleConfig.USE_JOB_SCHEDULER, 0) == 1) {
                z2 = true;
            }
            iArr = parserAllowErrorCode(optJSONObject.optString(DownloadSettingKeys.RetryScheduleConfig.ALLOW_ERROR_CODE));
            i2 = optInt4;
            z = z2;
            i3 = optInt2;
            i4 = optInt3;
        } else {
            iArr = null;
            i2 = 60;
            i3 = 60;
            z = false;
        }
        return new RetryInfo(i, optInt, i3, i4 * 1000, i2 * 1000, z, iArr);
    }

    private int[] parserAllowErrorCode(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length <= 0) {
                return null;
            }
            int[] iArr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr[i] = Integer.parseInt(split[i]);
            }
            return iArr;
        } catch (Throwable th) {
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
    public void onAppForeground() {
        scheduleAllTaskRetry(4, false);
    }

    @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
    public void onAppBackground() {
        scheduleAllTaskRetry(3, false);
    }

    public void scheduleRetryWhenHasTaskSucceed() {
        scheduleAllTaskRetry(2, true);
    }

    public void scheduleRetryWhenHasTaskConnected() {
        scheduleAllTaskRetry(5, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getNetWorkType() {
        try {
            if (this.mConnectivityManager == null) {
                this.mConnectivityManager = (ConnectivityManager) this.mContext.getApplicationContext().getSystemService("connectivity");
            }
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return activeNetworkInfo.getType() == 1 ? 2 : 1;
            }
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }

    private boolean canRetryWhenInsufficientSpace(DownloadInfo downloadInfo, BaseException baseException) {
        long j;
        long totalBytes;
        try {
            j = DownloadUtils.getAvailableSpaceBytes(downloadInfo.getTempPath());
        } catch (BaseException e) {
            e.printStackTrace();
            j = 0;
        }
        if (baseException instanceof DownloadOutOfSpaceException) {
            totalBytes = ((DownloadOutOfSpaceException) baseException).getRequiredSpaceBytes();
        } else {
            totalBytes = downloadInfo.getTotalBytes() - downloadInfo.getCurBytes();
        }
        if (j < totalBytes) {
            DownloadSetting obtain = DownloadSetting.obtain(downloadInfo.getId());
            if (obtain.optInt(DownloadSettingKeys.SPACE_FILL_PART_DOWNLOAD, 0) != 1) {
                return false;
            }
            if (j > 0) {
                int optInt = obtain.optInt(DownloadSettingKeys.SPACE_FILL_MIN_KEEP_MB, 100);
                if (optInt > 0) {
                    long j2 = j - (optInt * 1048576);
                    Logger.i(TAG, "retry schedule: available = " + DownloadUtils.byteToMb(j) + "MB, minKeep = " + optInt + "MB, canDownload = " + DownloadUtils.byteToMb(j2) + "MB");
                    if (j2 <= 0) {
                        Logger.w(TAG, "doSchedulerRetryInSubThread: canDownload <= 0 , canRetry = false !!!!");
                        return false;
                    }
                }
            } else if (obtain.optInt(DownloadSettingKeys.DOWNLOAD_WHEN_SPACE_NEGATIVE, 0) != 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class RetryInfo {
        final int[] allowErrorCode;
        final int id;
        final int intervalMs;
        final int intervalMsAcceleration;
        final int level;
        private int mCurrentIntervalMs;
        private boolean mIsWaitingRetry;
        private long mLastRetryTime;
        private boolean mNeedWifi;
        private int mRetryCount;
        final int maxCount;
        final boolean useJobScheduler;

        RetryInfo(int i, int i2, int i3, int i4, int i5, boolean z, int[] iArr) {
            i4 = i4 < 3000 ? 3000 : i4;
            i5 = i5 < 5000 ? 5000 : i5;
            this.id = i;
            this.level = i2;
            this.maxCount = i3;
            this.intervalMs = i4;
            this.intervalMsAcceleration = i5;
            this.useJobScheduler = z;
            this.allowErrorCode = iArr;
            this.mCurrentIntervalMs = i4;
        }

        boolean canRetry(long j, int i, int i2, boolean z) {
            if (!this.mIsWaitingRetry) {
                Logger.i(RetryScheduler.TAG, "canRetry: mIsWaitingRetry is false, return false!!!");
                return false;
            } else if (this.level >= i && this.mRetryCount < this.maxCount) {
                if (!this.mNeedWifi || i2 == 2) {
                    return z || j - this.mLastRetryTime >= ((long) this.intervalMs);
                }
                return false;
            } else {
                return false;
            }
        }

        synchronized void increaseRetryInterval() {
            this.mCurrentIntervalMs += this.intervalMsAcceleration;
        }

        synchronized void updateRetryTimeStamp(long j) {
            this.mLastRetryTime = j;
        }

        synchronized void increaseRetryCount() {
            this.mRetryCount++;
        }

        void resetRetryInterval() {
            this.mCurrentIntervalMs = this.intervalMs;
        }

        int getCurrentRetryIntervalMs() {
            return this.mCurrentIntervalMs;
        }
    }
}
