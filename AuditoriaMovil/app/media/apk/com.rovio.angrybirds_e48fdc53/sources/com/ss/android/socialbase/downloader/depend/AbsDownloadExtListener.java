package com.ss.android.socialbase.downloader.depend;

import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes3.dex */
public abstract class AbsDownloadExtListener extends AbsDownloadListener implements IDownloadExtListener {
    private static final String TAG = AbsDownloadExtListener.class.getSimpleName();

    public void onWaitingDownloadCompleteHandler(DownloadInfo downloadInfo) {
        if (Logger.debug() && downloadInfo != null) {
            String str = TAG;
            Logger.d(str, " onWaitingDownloadCompleteHandler -- " + downloadInfo.getName());
        }
    }
}
