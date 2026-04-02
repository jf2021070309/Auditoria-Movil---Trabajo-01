package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.os.Environment;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.download.api.config.z;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.download.api.model.DownloadShortInfo;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadlib.rb.cu;
import com.ss.android.downloadlib.rb.wb;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.depend.AbsDownloadExtListener;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class rb implements cu.dr {
    private long dr;
    private q g;
    private com.ss.android.downloadlib.addownload.ge.q ge;
    private boolean o = false;
    private ge q;

    /* loaded from: classes3.dex */
    public interface ge {
        void dr(DownloadInfo downloadInfo);
    }

    public rb(q qVar) {
        this.g = qVar;
    }

    public void dr(long j) {
        this.dr = j;
        com.ss.android.downloadlib.addownload.ge.q q = com.ss.android.downloadlib.addownload.ge.bn.dr().q(j);
        this.ge = q;
        if (q.n()) {
            com.ss.android.downloadlib.q.o.dr().dr("setAdId ModelBox notValid");
        }
    }

    public void dr(DownloadInfo downloadInfo) {
        this.o = false;
        ge(downloadInfo);
    }

    public void ge(DownloadInfo downloadInfo) {
        ge geVar = this.q;
        if (geVar != null) {
            geVar.dr(downloadInfo);
            this.q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean dr(Context context, int i, boolean z) {
        if (com.ss.android.downloadlib.rb.yk.dr(this.ge.ge)) {
            com.ss.android.downloadad.api.dr.ge g = com.ss.android.downloadlib.addownload.ge.bn.dr().g(this.ge.dr);
            if (g != null) {
                DownloadNotificationManager.getInstance().cancelNotification(g.i());
            }
            return com.ss.android.downloadlib.ge.dr.dr(this.ge);
        } else if (dr(i) && !TextUtils.isEmpty(this.ge.ge.getPackageName()) && wb.ll().optInt("disable_market") != 1) {
            if (com.ss.android.downloadlib.ge.dr.dr(this.ge, i)) {
                return true;
            }
            return this.g.ll() && this.g.g(true);
        } else if (z && this.ge.g.getDownloadMode() == 4 && !this.g.q()) {
            this.g.o(true);
            return true;
        } else {
            return false;
        }
    }

    private boolean dr(int i) {
        if (this.ge.g.getDownloadMode() == 2 && i == 2) {
            return true;
        }
        return this.ge.g.getDownloadMode() == 2 && i == 1 && wb.ll().optInt("disable_lp_if_market", 0) == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean dr(boolean z) {
        return !z && this.ge.g.getDownloadMode() == 1;
    }

    private boolean o() {
        return g() && q();
    }

    private boolean g() {
        return (this.ge.ge == null || TextUtils.isEmpty(this.ge.ge.getPackageName()) || TextUtils.isEmpty(this.ge.ge.getDownloadUrl())) ? false : true;
    }

    private boolean q() {
        return this.ge.g.isAddToDownloadManage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dr(final z zVar) {
        if (!TextUtils.isEmpty(this.ge.ge.getFilePath())) {
            String filePath = this.ge.ge.getFilePath();
            if (filePath.startsWith(Environment.getDataDirectory().getAbsolutePath())) {
                zVar.dr();
                return;
            }
            try {
                if (filePath.startsWith(wb.getContext().getExternalCacheDir().getParent())) {
                    zVar.dr();
                    return;
                }
            } catch (Exception e) {
            }
        }
        ge(new z() { // from class: com.ss.android.downloadlib.addownload.rb.1
            @Override // com.ss.android.download.api.config.z
            public void dr() {
                zVar.dr();
            }

            @Override // com.ss.android.download.api.config.z
            public void dr(String str) {
                wb.o().dr(1, wb.getContext(), rb.this.ge.ge, "您已禁止使用存储权限，请授权后再下载", null, 1);
                com.ss.android.downloadlib.g.dr.dr().ge(rb.this.dr, 1);
                zVar.dr(str);
            }
        });
    }

    private void ge(final z zVar) {
        if (com.ss.android.downloadlib.rb.wb.ge(com.kuaishou.weapon.p0.g.j)) {
            if (zVar != null) {
                zVar.dr();
                return;
            }
            return;
        }
        com.ss.android.downloadlib.rb.wb.dr(new String[]{com.kuaishou.weapon.p0.g.j}, new wb.dr() { // from class: com.ss.android.downloadlib.addownload.rb.2
            @Override // com.ss.android.downloadlib.rb.wb.dr
            public void dr() {
                z zVar2 = zVar;
                if (zVar2 != null) {
                    zVar2.dr();
                }
            }

            @Override // com.ss.android.downloadlib.rb.wb.dr
            public void dr(String str) {
                z zVar2 = zVar;
                if (zVar2 != null) {
                    zVar2.dr(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dr(Message message, DownloadShortInfo downloadShortInfo, Map<Integer, Object> map) {
        ge geVar;
        if (message == null || message.what != 3) {
            return;
        }
        DownloadInfo downloadInfo = (DownloadInfo) message.obj;
        if (message.arg1 != 1 && message.arg1 != 6 && message.arg1 == 2) {
            if (downloadInfo.getIsFirstDownload()) {
                com.ss.android.downloadlib.rb.dr().dr(this.ge.ge, this.ge.g, this.ge.o);
                downloadInfo.setFirstDownload(false);
            }
            com.ss.android.downloadlib.g.dr.dr().dr(downloadInfo);
        }
        downloadShortInfo.updateFromNewDownloadInfo(downloadInfo);
        ll.dr(downloadShortInfo);
        int dr2 = com.ss.android.socialbase.appdownloader.o.dr(downloadInfo.getStatus());
        long totalBytes = downloadInfo.getTotalBytes();
        int i = (totalBytes > 0L ? 1 : (totalBytes == 0L ? 0 : -1));
        int curBytes = i > 0 ? (int) ((downloadInfo.getCurBytes() * 100) / totalBytes) : 0;
        if ((i > 0 || DownloadSetting.obtainGlobal().optBugFix("fix_click_start")) && (geVar = this.q) != null) {
            geVar.dr(downloadInfo);
            this.q = null;
        }
        for (DownloadStatusChangeListener downloadStatusChangeListener : dr(map)) {
            if (dr2 != 1) {
                if (dr2 == 2) {
                    downloadStatusChangeListener.onDownloadPaused(downloadShortInfo, ll.dr(downloadInfo.getId(), curBytes));
                } else if (dr2 == 3) {
                    if (downloadInfo.getStatus() == -4) {
                        downloadStatusChangeListener.onIdle();
                    } else if (downloadInfo.getStatus() == -1) {
                        downloadStatusChangeListener.onDownloadFailed(downloadShortInfo);
                    } else if (downloadInfo.getStatus() == -3) {
                        if (com.ss.android.downloadlib.rb.yk.dr(this.ge.ge)) {
                            downloadStatusChangeListener.onInstalled(downloadShortInfo);
                        } else {
                            downloadStatusChangeListener.onDownloadFinished(downloadShortInfo);
                        }
                    }
                }
            } else if (downloadInfo.getStatus() != 11) {
                downloadStatusChangeListener.onDownloadActive(downloadShortInfo, ll.dr(downloadInfo.getId(), curBytes));
            } else {
                for (com.ss.android.download.api.download.dr drVar : ge(map)) {
                    drVar.dr(downloadInfo);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(DownloadInfo downloadInfo) {
        if (xu.dr(this.ge.ge) && !this.o) {
            com.ss.android.downloadlib.g.dr.dr().dr("file_status", (downloadInfo == null || !com.ss.android.downloadlib.rb.yk.ge(downloadInfo.getTargetFilePath())) ? 2 : 1, this.ge);
            this.o = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dr() {
        if (this.q == null) {
            this.q = new ge() { // from class: com.ss.android.downloadlib.addownload.rb.3
                @Override // com.ss.android.downloadlib.addownload.rb.ge
                public void dr(DownloadInfo downloadInfo) {
                    com.ss.android.downloadlib.g.dr.dr().dr(rb.this.dr, 2, downloadInfo);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(DownloadInfo downloadInfo) {
        return bn() || q(downloadInfo);
    }

    private boolean q(DownloadInfo downloadInfo) {
        return !com.ss.android.downloadlib.rb.yk.dr(this.ge.ge) && bn(downloadInfo);
    }

    private boolean bn() {
        return com.ss.android.downloadlib.rb.yk.dr(this.ge.ge) && xu.dr(this.ge.g.getLinkMode());
    }

    private boolean bn(DownloadInfo downloadInfo) {
        return downloadInfo != null && downloadInfo.getStatus() == -3 && DownloadUtils.isFileExist(downloadInfo.getSavePath(), downloadInfo.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int dr(Context context, IDownloadListener iDownloadListener) {
        HttpHeader dr2;
        if (context == null) {
            return 0;
        }
        Map<String, String> headers = this.ge.ge.getHeaders();
        ArrayList arrayList = new ArrayList();
        if (wb.ll().optInt("enable_send_click_id_in_apk", 1) == 1 && !TextUtils.isEmpty(this.ge.ge.getLogExtra()) && (dr2 = dr(this.ge.ge.getLogExtra())) != null) {
            arrayList.add(dr2);
        }
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                if (entry != null) {
                    arrayList.add(new HttpHeader(entry.getKey(), entry.getValue()));
                }
            }
        }
        String dr3 = com.ss.android.downloadlib.rb.g.dr(String.valueOf(this.ge.ge.getId()), this.ge.ge.getNotificationJumpUrl(), this.ge.ge.isShowToast(), String.valueOf(this.ge.ge.getModelType()));
        DownloadSetting ge2 = com.ss.android.downloadlib.rb.q.ge(this.ge.ge);
        JSONObject dr4 = com.ss.android.downloadlib.rb.q.dr(this.ge.ge);
        if (!this.ge.g.enableAH()) {
            dr4 = com.ss.android.downloadlib.rb.yk.dr(dr4);
            com.ss.android.downloadlib.rb.yk.dr(dr4, DownloadSettingKeys.KEY_AH_PLANS, new JSONArray());
        }
        this.ge.ge.getExecutorGroup();
        int i = (this.ge.ge.isAd() || xu.ge(this.ge.ge)) ? 4 : 4;
        String dr5 = dr(ge2);
        DownloadInfo downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(DownloadComponentManager.getDownloadId(this.ge.ge.getDownloadUrl(), dr5));
        if (downloadInfo != null && 3 == this.ge.ge.getModelType()) {
            downloadInfo.setFirstDownload(true);
        }
        com.ss.android.socialbase.appdownloader.bn il = new com.ss.android.socialbase.appdownloader.bn(context, this.ge.ge.getDownloadUrl()).ge(this.ge.ge.getBackupUrls()).dr(this.ge.ge.getName()).g(dr3).dr(arrayList).dr(this.ge.ge.isShowNotification()).o(this.ge.ge.isNeedWifi()).ge(this.ge.ge.getFileName()).o(dr5).wb(this.ge.ge.getAppIcon()).rb(this.ge.ge.getMd5()).ll(this.ge.ge.getSdkMonitorScene()).dr(this.ge.ge.getExpectFileLength()).dr(iDownloadListener).yk(this.ge.ge.needIndependentProcess() || ge2.optInt(MonitorConstants.EXTRA_DOWNLOAD_NEED_INDEPENDENT_PROCESS, 0) == 1).dr(this.ge.ge.getDownloadFileUriProvider()).ge(this.ge.ge.autoInstallWithoutNotification()).bn(this.ge.ge.getPackageName()).g(1000).q(100).dr(dr4).ll(true).wb(true).ge(ge2.optInt(MonitorConstants.EXTRA_DOWNLOAD_RETRY_COUNT, 5)).o(ge2.optInt("backup_url_retry_count", 0)).wb(true).cu(ge2.optInt("need_head_connection", 0) == 1).g(ge2.optInt("need_https_to_http_retry", 0) == 1).xu(ge2.optInt(MonitorConstants.EXTRA_NEED_CHUNK_DOWNGRADE_RETRY, 1) == 1).rb(ge2.optInt(MonitorConstants.EXTRA_DOWNLOAD_NEED_RETRY_DELAY, 0) == 1).xu(ge2.optString("retry_delay_time_array")).t(ge2.optInt("need_reuse_runnable", 0) == 1).bn(i).x(this.ge.ge.isAutoInstall()).il(this.ge.ge.distinctDir());
        if (!TextUtils.isEmpty(this.ge.ge.getMimeType())) {
            il.q(this.ge.ge.getMimeType());
        } else {
            il.q(AdBaseConstants.MIME_APK);
        }
        if (ge2.optInt("notification_opt_2", 0) == 1) {
            il.dr(false);
            il.ge(true);
        }
        com.ss.android.downloadlib.addownload.o.dr drVar = null;
        if (ge2.optInt("clear_space_use_disk_handler", 0) == 1) {
            drVar = new com.ss.android.downloadlib.addownload.o.dr();
            il.dr(drVar);
        }
        int dr6 = xu.dr(this.ge, o(), il);
        if (drVar != null) {
            drVar.dr(dr6);
        }
        return dr6;
    }

    private String dr(DownloadSetting downloadSetting) {
        if (!TextUtils.isEmpty(this.ge.ge.getFilePath())) {
            return this.ge.ge.getFilePath();
        }
        DownloadInfo dr2 = com.ss.android.socialbase.appdownloader.g.wb().dr(wb.getContext(), this.ge.ge.getDownloadUrl());
        boolean ge2 = com.ss.android.downloadlib.rb.wb.ge(com.kuaishou.weapon.p0.g.j);
        String ge3 = ge();
        if (dr2 != null && !TextUtils.isEmpty(dr2.getSavePath())) {
            String savePath = dr2.getSavePath();
            if (ge2) {
                return savePath;
            }
            if (savePath.startsWith(Environment.getDataDirectory().getAbsolutePath())) {
                return savePath;
            }
            try {
                if (!TextUtils.isEmpty(ge3)) {
                    if (savePath.startsWith(ge3)) {
                        return savePath;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Downloader.getInstance(DownloadComponentManager.getAppContext()).cancel(dr2.getId());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("ttdownloader_code", Integer.valueOf(ge2 ? 1 : 2));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.ss.android.downloadlib.g.dr.dr().dr("label_external_permission", jSONObject, this.ge);
        String str = null;
        try {
            str = com.ss.android.socialbase.appdownloader.o.ge();
        } catch (Exception e3) {
        }
        int dr3 = com.ss.android.downloadlib.rb.q.dr(downloadSetting);
        if (dr3 != 0) {
            if (dr3 == 4 || (!ge2 && dr3 == 2)) {
                File filesDir = wb.getContext().getFilesDir();
                if (!filesDir.exists()) {
                    filesDir.mkdirs();
                }
                if (!filesDir.exists()) {
                    return str;
                }
                return filesDir.getAbsolutePath();
            } else if ((dr3 == 3 || (!ge2 && dr3 == 1)) && !TextUtils.isEmpty(ge3)) {
                return ge3;
            }
        }
        return str;
    }

    public String ge() {
        File externalFilesDir = wb.getContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir != null) {
            if (!externalFilesDir.exists()) {
                externalFilesDir.mkdirs();
            }
            if (externalFilesDir.exists()) {
                return externalFilesDir.getAbsolutePath();
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dr(DownloadInfo downloadInfo, boolean z) {
        if (this.ge.ge == null || downloadInfo == null || downloadInfo.getId() == 0) {
            return;
        }
        int status = downloadInfo.getStatus();
        if (status == -1 || status == -4) {
            com.ss.android.downloadlib.g.dr.dr().dr(this.dr, 2);
        } else if (xu.dr(this.ge.ge)) {
            com.ss.android.downloadlib.g.dr.dr().dr(this.dr, 2);
        } else if (z && com.ss.android.downloadlib.g.o.dr().o() && (status == -2 || status == -3)) {
            com.ss.android.downloadlib.g.dr.dr().dr(this.dr, 2);
        }
        switch (status) {
            case -4:
            case -1:
                dr();
                com.ss.android.downloadlib.addownload.ge.bn.dr().dr(new com.ss.android.downloadad.api.dr.ge(this.ge.ge, this.ge.o, this.ge.g, downloadInfo.getId()));
                return;
            case -3:
                if (com.ss.android.downloadlib.rb.yk.dr(this.ge.ge)) {
                    com.ss.android.downloadlib.q.o.dr().ge("SUCCESSED isInstalledApp");
                    return;
                }
                com.ss.android.downloadlib.g.dr.dr().dr(this.dr, 5, downloadInfo);
                if (z && com.ss.android.downloadlib.g.o.dr().ge() && !com.ss.android.downloadlib.g.o.dr().ge(this.dr, this.ge.ge.getLogExtra())) {
                    com.ss.android.downloadlib.g.dr.dr().dr(this.dr, 2);
                    return;
                }
                return;
            case -2:
                com.ss.android.downloadlib.g.dr.dr().dr(this.dr, 4, downloadInfo);
                if (z && com.ss.android.downloadlib.g.o.dr().ge() && !com.ss.android.downloadlib.g.o.dr().ge(this.dr, this.ge.ge.getLogExtra())) {
                    com.ss.android.downloadlib.g.dr.dr().dr(this.dr, 2);
                    return;
                }
                return;
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
                com.ss.android.downloadlib.g.dr.dr().dr(this.dr, 3, downloadInfo);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dr(DownloadInfo downloadInfo, DownloadShortInfo downloadShortInfo, List<DownloadStatusChangeListener> list) {
        int i;
        if (list.isEmpty()) {
            return;
        }
        if (downloadInfo == null || downloadShortInfo == null) {
            for (DownloadStatusChangeListener downloadStatusChangeListener : list) {
                downloadStatusChangeListener.onIdle();
            }
            return;
        }
        int i2 = 0;
        try {
            i = downloadInfo.getTotalBytes() > 0 ? (int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes()) : 0;
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (i >= 0) {
            i2 = i;
        }
        downloadShortInfo.updateFromNewDownloadInfo(downloadInfo);
        ll.dr(downloadShortInfo);
        for (DownloadStatusChangeListener downloadStatusChangeListener2 : list) {
            switch (downloadInfo.getStatus()) {
                case -4:
                case 0:
                    if (com.ss.android.downloadlib.rb.yk.dr(this.ge.ge)) {
                        downloadShortInfo.status = -3;
                        downloadStatusChangeListener2.onInstalled(downloadShortInfo);
                        break;
                    } else {
                        downloadStatusChangeListener2.onIdle();
                        break;
                    }
                case -3:
                    if (com.ss.android.downloadlib.rb.yk.dr(this.ge.ge)) {
                        downloadStatusChangeListener2.onInstalled(downloadShortInfo);
                        break;
                    } else {
                        downloadStatusChangeListener2.onDownloadFinished(downloadShortInfo);
                        break;
                    }
                case -2:
                    downloadStatusChangeListener2.onDownloadPaused(downloadShortInfo, ll.dr(downloadInfo.getId(), i2));
                    break;
                case -1:
                    downloadStatusChangeListener2.onDownloadFailed(downloadShortInfo);
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                    downloadStatusChangeListener2.onDownloadActive(downloadShortInfo, ll.dr(downloadInfo.getId(), i2));
                    break;
                case 11:
                    if (downloadStatusChangeListener2 instanceof com.ss.android.download.api.download.dr) {
                        ((com.ss.android.download.api.download.dr) downloadStatusChangeListener2).dr(downloadInfo);
                        break;
                    } else {
                        downloadStatusChangeListener2.onDownloadActive(downloadShortInfo, ll.dr(downloadInfo.getId(), i2));
                        break;
                    }
            }
        }
    }

    @Override // com.ss.android.downloadlib.rb.cu.dr
    public void dr(Message message) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class dr extends AbsDownloadExtListener {
        private cu dr;

        /* JADX INFO: Access modifiers changed from: package-private */
        public dr(cu cuVar) {
            this.dr = cuVar;
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onPrepare(DownloadInfo downloadInfo) {
            dr(downloadInfo, 1);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onStart(DownloadInfo downloadInfo) {
            dr(downloadInfo, 2);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onProgress(DownloadInfo downloadInfo) {
            dr(downloadInfo, 4);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onPause(DownloadInfo downloadInfo) {
            dr(downloadInfo, -2);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onSuccessed(DownloadInfo downloadInfo) {
            dr(downloadInfo, -3);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            dr(downloadInfo, -1);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onCanceled(DownloadInfo downloadInfo) {
            dr(downloadInfo, -4);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadExtListener, com.ss.android.socialbase.downloader.depend.IDownloadExtListener
        public void onWaitingDownloadCompleteHandler(DownloadInfo downloadInfo) {
            dr(downloadInfo, 11);
        }

        private void dr(DownloadInfo downloadInfo, int i) {
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.obj = downloadInfo;
            obtain.arg1 = i;
            this.dr.sendMessage(obtain);
        }
    }

    public static List<DownloadStatusChangeListener> dr(Map<Integer, Object> map) {
        ArrayList arrayList = new ArrayList();
        if (map == null || map.isEmpty()) {
            return arrayList;
        }
        for (Object obj : map.values()) {
            if (obj instanceof DownloadStatusChangeListener) {
                arrayList.add((DownloadStatusChangeListener) obj);
            } else if (obj instanceof SoftReference) {
                SoftReference softReference = (SoftReference) obj;
                if (softReference.get() instanceof DownloadStatusChangeListener) {
                    arrayList.add((DownloadStatusChangeListener) softReference.get());
                }
            }
        }
        return arrayList;
    }

    public static List<com.ss.android.download.api.download.dr> ge(Map<Integer, Object> map) {
        ArrayList arrayList = new ArrayList();
        if (map == null || map.isEmpty()) {
            return arrayList;
        }
        for (Object obj : map.values()) {
            if (obj instanceof com.ss.android.download.api.download.dr) {
                arrayList.add((com.ss.android.download.api.download.dr) obj);
            } else if (obj instanceof SoftReference) {
                SoftReference softReference = (SoftReference) obj;
                if (softReference.get() instanceof com.ss.android.download.api.download.dr) {
                    arrayList.add((com.ss.android.download.api.download.dr) softReference.get());
                }
            }
        }
        return arrayList;
    }

    private HttpHeader dr(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new HttpHeader("clickid", new JSONObject(str).optString("clickid"));
            }
            return null;
        } catch (JSONException e) {
            wb.i().dr(e, "parseLogExtra Error");
            return null;
        }
    }
}
