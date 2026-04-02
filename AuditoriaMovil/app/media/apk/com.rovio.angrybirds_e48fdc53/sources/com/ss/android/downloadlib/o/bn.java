package com.ss.android.downloadlib.o;

import android.content.Context;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class bn implements com.ss.android.socialbase.appdownloader.o.g {
    private Context dr;

    public bn(Context context) {
        this.dr = context.getApplicationContext();
    }

    @Override // com.ss.android.socialbase.appdownloader.o.g
    public void dr(Context context, String str) {
        com.ss.android.downloadlib.dr.dr().dr(str);
    }

    @Override // com.ss.android.socialbase.appdownloader.o.g
    public void dr(int i, int i2, String str, int i3, long j) {
        DownloadInfo downloadInfo;
        com.ss.android.downloadad.api.dr.ge dr;
        Context context = this.dr;
        if (context != null && (downloadInfo = Downloader.getInstance(context).getDownloadInfo(i)) != null && downloadInfo.getStatus() != 0 && (dr = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo)) != null) {
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 == 7) {
                                com.ss.android.downloadlib.g.dr.dr().dr("download_notification", "download_notification_click", dr);
                                return;
                            }
                            return;
                        }
                        com.ss.android.downloadlib.g.dr.dr().dr("download_notification", "download_notification_continue", dr);
                        return;
                    }
                    com.ss.android.downloadlib.g.dr.dr().dr("download_notification", "download_notification_pause", dr);
                    return;
                }
                com.ss.android.downloadlib.g.dr.dr().dr("download_notification", "download_notification_install", com.ss.android.downloadlib.dr.ge(new JSONObject(), downloadInfo), dr);
                return;
            }
            com.ss.android.downloadlib.dr.dr(downloadInfo, dr);
            if (AdBaseConstants.MIME_APK.equals(downloadInfo.getMimeType())) {
                com.ss.android.downloadlib.addownload.dr.dr().dr(downloadInfo, dr.ge(), dr.yk(), dr.q(), downloadInfo.getTitle(), dr.g(), downloadInfo.getTargetFilePath());
            }
        }
    }

    @Override // com.ss.android.socialbase.appdownloader.o.g
    public boolean dr(int i, boolean z) {
        if (wb.v() == null) {
            return false;
        }
        return wb.v().dr(z);
    }

    @Override // com.ss.android.socialbase.appdownloader.o.g
    public void dr(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        com.ss.android.downloadlib.rb.dr().dr(downloadInfo);
        if (DownloadSetting.obtain(downloadInfo.getId()).optInt("report_download_cancel", 1) == 1) {
            com.ss.android.downloadlib.g.dr.dr().dr(downloadInfo, new BaseException(1012, ""));
        } else {
            com.ss.android.downloadlib.g.dr.dr().ge(downloadInfo, new BaseException(1012, ""));
        }
    }

    @Override // com.ss.android.socialbase.appdownloader.o.g
    public void dr(int i, int i2, String str, String str2, String str3) {
        DownloadInfo downloadInfo;
        Context context = this.dr;
        if (context == null || (downloadInfo = Downloader.getInstance(context).getDownloadInfo(i)) == null || downloadInfo.getStatus() != -3) {
            return;
        }
        downloadInfo.setPackageName(str2);
        com.ss.android.downloadlib.addownload.ge.dr().dr(this.dr, downloadInfo);
    }

    @Override // com.ss.android.socialbase.appdownloader.o.g
    public boolean dr() {
        return com.ss.android.downloadlib.addownload.ge.dr().ge();
    }
}
