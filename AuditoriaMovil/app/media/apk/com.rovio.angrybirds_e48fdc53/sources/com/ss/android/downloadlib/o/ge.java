package com.ss.android.downloadlib.o;

import android.content.pm.PackageInfo;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.socialbase.downloader.depend.IDownloadCompleteHandler;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes3.dex */
public class ge implements IDownloadCompleteHandler {
    @Override // com.ss.android.socialbase.downloader.depend.IDownloadCompleteHandler
    public void handle(DownloadInfo downloadInfo) throws BaseException {
        PackageInfo dr = com.ss.android.socialbase.appdownloader.o.dr(wb.getContext(), downloadInfo, downloadInfo.getSavePath(), downloadInfo.getName());
        if (dr != null) {
            downloadInfo.setAppVersionCode(dr.versionCode);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadCompleteHandler
    public boolean needHandle(DownloadInfo downloadInfo) {
        if (downloadInfo != null && com.ss.android.downloadlib.rb.q.ge() && downloadInfo.getPackageInfo() == null) {
            return true;
        }
        return false;
    }
}
