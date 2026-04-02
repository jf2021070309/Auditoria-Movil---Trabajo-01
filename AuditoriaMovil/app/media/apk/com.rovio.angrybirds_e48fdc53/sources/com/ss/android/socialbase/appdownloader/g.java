package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.socialbase.appdownloader.o.cu;
import com.ss.android.socialbase.appdownloader.o.wb;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener;
import com.ss.android.socialbase.downloader.depend.IInstallAppHandler;
import com.ss.android.socialbase.downloader.depend.IOpenInstallerListener;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.IReserveWifiStatusListener;
import com.ss.android.socialbase.downloader.impls.RetryScheduler;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class g {
    private cu cu;
    private String g;
    private wb il;
    private com.ss.android.socialbase.appdownloader.o.o ll;
    private IOpenInstallerListener lp;
    private String o;
    private DownloadReceiver q;
    private com.ss.android.socialbase.appdownloader.o.xu t;
    private com.ss.android.socialbase.appdownloader.o.bn v;
    private com.ss.android.socialbase.appdownloader.o.g wb;
    private IInstallAppHandler x;
    private boolean xu = false;
    private com.ss.android.socialbase.appdownloader.o.rb yk;
    private static final String dr = g.class.getSimpleName();
    private static volatile g ge = null;
    private static boolean bn = false;
    private static boolean rb = false;

    public com.ss.android.socialbase.appdownloader.o.o dr() {
        return this.ll;
    }

    public com.ss.android.socialbase.appdownloader.o.g ge() {
        return this.wb;
    }

    public com.ss.android.socialbase.appdownloader.o.xu o() {
        return this.t;
    }

    public void dr(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.g = str;
    }

    public String g() {
        return this.g;
    }

    public com.ss.android.socialbase.appdownloader.o.bn q() {
        return this.v;
    }

    public boolean bn() {
        return DownloadSetting.getGlobalSettings().optInt(DownloadSettingKeys.PACKAGE_FLAG_CONFIG, 1) == 1;
    }

    public wb rb() {
        return this.il;
    }

    public void dr(wb wbVar) {
        this.il = wbVar;
    }

    public File xu() {
        return Downloader.getInstance(DownloadComponentManager.getAppContext()).getGlobalSaveDir();
    }

    public String ll() {
        return this.o;
    }

    private g() {
    }

    public static g wb() {
        if (ge == null) {
            synchronized (g.class) {
                if (ge == null) {
                    ge = new g();
                }
            }
        }
        return ge;
    }

    @Deprecated
    public void dr(Context context, String str, com.ss.android.socialbase.appdownloader.o.o oVar, com.ss.android.socialbase.appdownloader.o.g gVar, com.ss.android.socialbase.appdownloader.o.xu xuVar) {
        if (oVar != null) {
            this.ll = oVar;
        }
        if (gVar != null) {
            this.wb = gVar;
        }
        if (xuVar != null) {
            this.t = xuVar;
        }
        o(context);
    }

    private void o(Context context) {
        if (context != null && !bn) {
            DownloadConstants.setMimeApk(AdBaseConstants.MIME_APK);
            DownloadComponentManager.setAppContext(context);
            DownloadComponentManager.setDownloadLaunchHandler(new com.ss.android.socialbase.appdownloader.g.ge());
            lp();
            de();
            bn = true;
        }
    }

    public void ge(String str) {
        Downloader.getInstance(DownloadComponentManager.getAppContext()).setDefaultSavePath(str);
    }

    private void lp() {
        if (rb) {
            return;
        }
        if (this.q == null) {
            this.q = new DownloadReceiver();
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.intent.action.BOOT_COMPLETED");
            intentFilter.addAction("android.ss.intent.action.DOWNLOAD_COMPLETE");
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter2.addDataScheme("package");
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("android.intent.action.MEDIA_MOUNTED");
            intentFilter3.addDataScheme("file");
            DownloadComponentManager.getAppContext().registerReceiver(this.q, intentFilter);
            DownloadComponentManager.getAppContext().registerReceiver(this.q, intentFilter2);
            DownloadComponentManager.getAppContext().registerReceiver(this.q, intentFilter3);
            rb = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void de() {
        if (Build.VERSION.SDK_INT >= 21) {
            RetryScheduler.setRetryScheduleHandler(new RetryScheduler.RetryScheduleHandler() { // from class: com.ss.android.socialbase.appdownloader.g.1
                @Override // com.ss.android.socialbase.downloader.impls.RetryScheduler.RetryScheduleHandler
                public void scheduleRetry(DownloadInfo downloadInfo, long j, boolean z, int i) {
                    RetryJobSchedulerService.dr(downloadInfo, j, z, i);
                }

                @Override // com.ss.android.socialbase.downloader.impls.RetryScheduler.RetryScheduleHandler
                public void cancelRetry(int i) {
                    RetryJobSchedulerService.dr(i);
                }
            });
        }
    }

    public static boolean dr(Context context, int i) {
        return o.dr(context, i, true) == 1;
    }

    public void dr(Context context, int i, int i2) {
        try {
            switch (i2) {
                case -4:
                case -1:
                    Downloader.getInstance(context).restart(i);
                    break;
                case -3:
                    o.dr(context, i, true);
                    break;
                case -2:
                    Downloader.getInstance(context).resume(i);
                    break;
                case 0:
                case 6:
                default:
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                    Downloader.getInstance(context).pause(i);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:39|(2:43|44)|47|(1:119)(1:54)|55|(22:57|(1:62)|114|(1:116)(1:117)|64|(1:66)(1:113)|67|(3:69|(2:72|70)|73)|74|75|76|(1:78)(1:111)|79|80|(6:85|(1:108)(1:89)|90|(1:94)|(1:(1:106)(1:105))|107)|109|(1:87)|108|90|(2:92|94)|(0)|107)(1:118)|63|64|(0)(0)|67|(0)|74|75|76|(0)(0)|79|80|(8:82|85|(0)|108|90|(0)|(0)|107)|109|(0)|108|90|(0)|(0)|107) */
    /* JADX WARN: Removed duplicated region for block: B:102:0x034d A[Catch: all -> 0x03b0, TryCatch #0 {all -> 0x03b0, blocks: (B:8:0x0012, B:11:0x0025, B:15:0x002e, B:17:0x003c, B:18:0x0044, B:20:0x004c, B:22:0x0058, B:25:0x005f, B:27:0x006b, B:31:0x007a, B:33:0x0088, B:35:0x008f, B:37:0x0095, B:40:0x009d, B:42:0x00b1, B:47:0x00cd, B:50:0x00e6, B:52:0x00ec, B:56:0x00fd, B:58:0x0103, B:60:0x0109, B:70:0x0150, B:72:0x0156, B:74:0x015e, B:76:0x0168, B:77:0x016c, B:79:0x0172, B:80:0x017c, B:88:0x01aa, B:90:0x01b0, B:96:0x01bc, B:98:0x01c9, B:100:0x01d9, B:102:0x034d, B:104:0x0357, B:107:0x0362, B:109:0x0368, B:111:0x036e, B:113:0x0378, B:115:0x0381, B:116:0x0391, B:64:0x0116, B:66:0x011c, B:67:0x012c), top: B:125:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0156 A[Catch: all -> 0x03b0, TryCatch #0 {all -> 0x03b0, blocks: (B:8:0x0012, B:11:0x0025, B:15:0x002e, B:17:0x003c, B:18:0x0044, B:20:0x004c, B:22:0x0058, B:25:0x005f, B:27:0x006b, B:31:0x007a, B:33:0x0088, B:35:0x008f, B:37:0x0095, B:40:0x009d, B:42:0x00b1, B:47:0x00cd, B:50:0x00e6, B:52:0x00ec, B:56:0x00fd, B:58:0x0103, B:60:0x0109, B:70:0x0150, B:72:0x0156, B:74:0x015e, B:76:0x0168, B:77:0x016c, B:79:0x0172, B:80:0x017c, B:88:0x01aa, B:90:0x01b0, B:96:0x01bc, B:98:0x01c9, B:100:0x01d9, B:102:0x034d, B:104:0x0357, B:107:0x0362, B:109:0x0368, B:111:0x036e, B:113:0x0378, B:115:0x0381, B:116:0x0391, B:64:0x0116, B:66:0x011c, B:67:0x012c), top: B:125:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168 A[Catch: all -> 0x03b0, TryCatch #0 {all -> 0x03b0, blocks: (B:8:0x0012, B:11:0x0025, B:15:0x002e, B:17:0x003c, B:18:0x0044, B:20:0x004c, B:22:0x0058, B:25:0x005f, B:27:0x006b, B:31:0x007a, B:33:0x0088, B:35:0x008f, B:37:0x0095, B:40:0x009d, B:42:0x00b1, B:47:0x00cd, B:50:0x00e6, B:52:0x00ec, B:56:0x00fd, B:58:0x0103, B:60:0x0109, B:70:0x0150, B:72:0x0156, B:74:0x015e, B:76:0x0168, B:77:0x016c, B:79:0x0172, B:80:0x017c, B:88:0x01aa, B:90:0x01b0, B:96:0x01bc, B:98:0x01c9, B:100:0x01d9, B:102:0x034d, B:104:0x0357, B:107:0x0362, B:109:0x0368, B:111:0x036e, B:113:0x0378, B:115:0x0381, B:116:0x0391, B:64:0x0116, B:66:0x011c, B:67:0x012c), top: B:125:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0187 A[Catch: all -> 0x01a9, TryCatch #1 {all -> 0x01a9, blocks: (B:81:0x0181, B:83:0x0187, B:85:0x0192, B:84:0x018d), top: B:126:0x0181 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018d A[Catch: all -> 0x01a9, TryCatch #1 {all -> 0x01a9, blocks: (B:81:0x0181, B:83:0x0187, B:85:0x0192, B:84:0x018d), top: B:126:0x0181 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bc A[Catch: all -> 0x03b0, TryCatch #0 {all -> 0x03b0, blocks: (B:8:0x0012, B:11:0x0025, B:15:0x002e, B:17:0x003c, B:18:0x0044, B:20:0x004c, B:22:0x0058, B:25:0x005f, B:27:0x006b, B:31:0x007a, B:33:0x0088, B:35:0x008f, B:37:0x0095, B:40:0x009d, B:42:0x00b1, B:47:0x00cd, B:50:0x00e6, B:52:0x00ec, B:56:0x00fd, B:58:0x0103, B:60:0x0109, B:70:0x0150, B:72:0x0156, B:74:0x015e, B:76:0x0168, B:77:0x016c, B:79:0x0172, B:80:0x017c, B:88:0x01aa, B:90:0x01b0, B:96:0x01bc, B:98:0x01c9, B:100:0x01d9, B:102:0x034d, B:104:0x0357, B:107:0x0362, B:109:0x0368, B:111:0x036e, B:113:0x0378, B:115:0x0381, B:116:0x0391, B:64:0x0116, B:66:0x011c, B:67:0x012c), top: B:125:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int dr(com.ss.android.socialbase.appdownloader.bn r22) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.g.dr(com.ss.android.socialbase.appdownloader.bn):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dr(DownloadTask downloadTask, int i, boolean z) {
        if (downloadTask == null) {
            return;
        }
        downloadTask.download();
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            downloadInfo.setAntiHijackErrorCode(i);
        }
        if (downloadInfo != null && z) {
            downloadInfo.setSavePathRedirected(z);
        }
    }

    private List<HttpHeader> dr(List<HttpHeader> list) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                if (httpHeader != null && !TextUtils.isEmpty(httpHeader.getName()) && !TextUtils.isEmpty(httpHeader.getValue())) {
                    if (httpHeader.getName().equals("User-Agent")) {
                        z = true;
                    }
                    arrayList.add(new HttpHeader(httpHeader.getName(), httpHeader.getValue()));
                }
            }
        }
        if (!z) {
            arrayList.add(new HttpHeader("User-Agent", com.ss.android.socialbase.appdownloader.ge.dr.dr));
        }
        return arrayList;
    }

    public String dr(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str.endsWith(".apk") && !o.o(str2)) {
            return AdBaseConstants.MIME_APK;
        }
        return str2;
    }

    private IDownloadNotificationEventListener dr(final com.ss.android.socialbase.appdownloader.o.q qVar) {
        if (qVar == null) {
            return null;
        }
        return new IDownloadNotificationEventListener() { // from class: com.ss.android.socialbase.appdownloader.g.4
            @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener
            public void onNotificationEvent(int i, DownloadInfo downloadInfo, String str, String str2) {
                if (i != 1 && i != 3) {
                    switch (i) {
                        case 5:
                        case 6:
                        case 7:
                            break;
                        case 8:
                            qVar.dr(i, downloadInfo.getPackageName(), str, str2);
                            return;
                        case 9:
                            qVar.dr(DownloadComponentManager.getAppContext(), str);
                            return;
                        case 10:
                            qVar.dr(downloadInfo);
                            return;
                        default:
                            return;
                    }
                }
                qVar.dr(i, str, downloadInfo.getStatus(), downloadInfo.getDownloadTime());
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener
            public boolean interceptAfterNotificationSuccess(boolean z) {
                return qVar.dr(z);
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener
            public String getNotifyProcessName() {
                return qVar.dr();
            }
        };
    }

    public DownloadInfo dr(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        try {
            DownloadInfo dr2 = dr(context, str, xu());
            if (dr2 == null) {
                dr2 = dr(context, str, context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));
            }
            if (dr2 == null) {
                dr2 = dr(context, str, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
            }
            if (dr2 == null) {
                dr2 = dr(context, str, context.getFilesDir());
            }
            boolean optBugFix = DownloadSetting.obtainGlobal().optBugFix(DownloadSettingKeys.BugFix.BUGFIX_GET_DOWNLOAD_INFO_BY_LIST);
            if (dr2 == null && optBugFix) {
                return ge(context, str);
            }
            return dr2;
        } catch (Throwable th) {
            Logger.d(dr, String.format("getAppDownloadInfo error:%s", th.getMessage()));
            return null;
        }
    }

    private DownloadInfo dr(Context context, String str, File file) {
        if (context == null || TextUtils.isEmpty(str) || file == null) {
            return null;
        }
        return Downloader.getInstance(context).getDownloadInfo(str, file.getAbsolutePath());
    }

    private DownloadInfo ge(Context context, String str) {
        List<DownloadInfo> downloadInfoList = Downloader.getInstance(context).getDownloadInfoList(str);
        if (downloadInfoList != null) {
            for (DownloadInfo downloadInfo : downloadInfoList) {
                if (downloadInfo != null && downloadInfo.isSavePathRedirected()) {
                    return downloadInfo;
                }
            }
            return null;
        }
        return null;
    }

    public List<DownloadInfo> dr(Context context) {
        return Downloader.getInstance(context).getUnCompletedDownloadInfosWithMimeType(AdBaseConstants.MIME_APK);
    }

    public List<DownloadInfo> ge(Context context) {
        return Downloader.getInstance(context).getDownloadingDownloadInfosWithMimeType(AdBaseConstants.MIME_APK);
    }

    public cu t() {
        return this.cu;
    }

    public com.ss.android.socialbase.appdownloader.o.rb yk() {
        return this.yk;
    }

    public void dr(com.ss.android.socialbase.appdownloader.o.rb rbVar) {
        this.yk = rbVar;
    }

    public IReserveWifiStatusListener cu() {
        return Downloader.getInstance(DownloadComponentManager.getAppContext()).getReserveWifiStatusListener();
    }

    public void dr(IReserveWifiStatusListener iReserveWifiStatusListener) {
        Downloader.getInstance(DownloadComponentManager.getAppContext()).setReserveWifiStatusListener(iReserveWifiStatusListener);
    }

    public void dr(IInstallAppHandler iInstallAppHandler) {
        this.x = iInstallAppHandler;
    }

    public IInstallAppHandler v() {
        return this.x;
    }

    public void dr(IOpenInstallerListener iOpenInstallerListener) {
        this.lp = iOpenInstallerListener;
    }

    public IOpenInstallerListener il() {
        return this.lp;
    }
}
