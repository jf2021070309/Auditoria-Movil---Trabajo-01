package com.ss.android.downloadlib.o;

import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.ss.android.downloadlib.addownload.ge.ll;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.constants.SpJsonConstants;
import com.ss.android.socialbase.downloader.depend.IDownloadCacheSyncStatusListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class g implements com.ss.android.socialbase.appdownloader.o.rb, IDownloadCacheSyncStatusListener {
    @Override // com.ss.android.socialbase.appdownloader.o.rb
    public void dr(List<DownloadInfo> list) {
    }

    @Override // com.ss.android.socialbase.appdownloader.o.rb
    public void dr(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo == null) {
            return;
        }
        dr(downloadInfo, downloadInfo.getRealStatus(), z);
    }

    public void dr(DownloadInfo downloadInfo, int i, boolean z) {
        com.ss.android.downloadlib.addownload.ge.bn.dr().ge();
        com.ss.android.downloadad.api.dr.ge dr = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo);
        if (dr == null) {
            return;
        }
        try {
            if (z) {
                dr.o(downloadInfo.getFailedResumeCount());
            } else if (dr.qx() == -1) {
                return;
            } else {
                dr.o(-1);
            }
            ll.dr().dr(dr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_ID, downloadInfo.getId());
            jSONObject.put("name", downloadInfo.getName());
            jSONObject.put("url", downloadInfo.getUrl());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_TIME, downloadInfo.getDownloadTime());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_STATUS, i);
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_CUR_BYTES, downloadInfo.getCurBytes());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_TOTAL_BYTES, downloadInfo.getTotalBytes());
            int i2 = 1;
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_ONLY_WIFI, downloadInfo.isOnlyWifi() ? 1 : 0);
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_CHUNK_COUNT, downloadInfo.getChunkCount());
            if (!z) {
                i2 = 2;
            }
            jSONObject.put("launch_resumed", i2);
            jSONObject.put("failed_resume_count", downloadInfo.getFailedResumeCount());
            com.ss.android.downloadlib.g.dr.dr().dr("embeded_ad", "download_uncompleted", jSONObject, dr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadCacheSyncStatusListener
    public void onStart() {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadCacheSyncStatusListener
    public void onSuccess() {
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.o.g.1
            @Override // java.lang.Runnable
            public void run() {
                DownloadInfo downloadInfo;
                int spIntVal;
                com.ss.android.downloadlib.addownload.ge.bn.dr().ge();
                for (com.ss.android.downloadad.api.dr.ge geVar : com.ss.android.downloadlib.addownload.ge.bn.dr().o().values()) {
                    int i = geVar.i();
                    if (i != 0) {
                        DownloadSetting obtain = DownloadSetting.obtain(i);
                        if (obtain.optInt("notification_opt_2") == 1 && (downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(i)) != null) {
                            if (yk.ge(geVar) && !yk.o(geVar.q())) {
                                int spIntVal2 = downloadInfo.getSpIntVal(SpJsonConstants.RESTART_NOTIFY_OPEN_APP_COUNT);
                                if (spIntVal2 < obtain.optInt("noti_open_restart_times", 1)) {
                                    xu.dr().q(geVar);
                                    downloadInfo.setSpValue(SpJsonConstants.RESTART_NOTIFY_OPEN_APP_COUNT, String.valueOf(spIntVal2 + 1));
                                }
                            } else if (downloadInfo.getRealStatus() == -2) {
                                int spIntVal3 = downloadInfo.getSpIntVal(SpJsonConstants.RESTART_NOTIFY_CONTINUE_COUNT);
                                if (spIntVal3 < obtain.optInt("noti_continue_restart_times", 1)) {
                                    xu.dr().dr(geVar);
                                    downloadInfo.setSpValue(SpJsonConstants.RESTART_NOTIFY_CONTINUE_COUNT, String.valueOf(spIntVal3 + 1));
                                }
                            } else if (downloadInfo.getRealStatus() == -3 && DownloadUtils.isFileDownloaded(downloadInfo) && !yk.ge(geVar) && (spIntVal = downloadInfo.getSpIntVal(SpJsonConstants.RESTART_NOTIFY_INSTALL_COUNT)) < obtain.optInt("noti_install_restart_times", 1)) {
                                xu.dr().o(geVar);
                                downloadInfo.setSpValue(SpJsonConstants.RESTART_NOTIFY_INSTALL_COUNT, String.valueOf(spIntVal + 1));
                            }
                        }
                    }
                }
            }
        }, PushUIConfig.dismissTime);
    }
}
