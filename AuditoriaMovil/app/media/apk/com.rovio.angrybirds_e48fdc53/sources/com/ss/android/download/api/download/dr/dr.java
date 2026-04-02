package com.ss.android.download.api.download.dr;

import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes3.dex */
public interface dr {
    void dr(DownloadModel downloadModel, DownloadController downloadController, DownloadEventConfig downloadEventConfig);

    void dr(DownloadInfo downloadInfo);

    void dr(DownloadInfo downloadInfo, BaseException baseException, String str);

    void dr(DownloadInfo downloadInfo, String str);

    void ge(DownloadInfo downloadInfo, String str);
}
