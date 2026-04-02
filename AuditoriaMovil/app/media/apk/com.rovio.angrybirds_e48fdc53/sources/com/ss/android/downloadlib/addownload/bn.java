package com.ss.android.downloadlib.addownload;

import android.content.Context;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
/* loaded from: classes3.dex */
public interface bn {
    bn dr(long j);

    bn dr(IDownloadButtonClickListener iDownloadButtonClickListener);

    bn dr(OnItemClickListener onItemClickListener);

    void dr();

    void dr(boolean z);

    boolean dr(int i);

    long g();

    bn ge(int i, DownloadStatusChangeListener downloadStatusChangeListener);

    bn ge(Context context);

    bn ge(DownloadController downloadController);

    bn ge(DownloadEventConfig downloadEventConfig);

    bn ge(DownloadModel downloadModel);

    void ge(int i);

    boolean ge();

    void xu();
}
