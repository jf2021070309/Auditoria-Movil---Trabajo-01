package com.ss.android.downloadlib;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.downloadlib.addownload.t;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes3.dex */
public class xu {
    private static volatile xu dr;
    private long bn;
    private final com.ss.android.downloadad.api.dr g;
    private final com.ss.android.download.api.dr ge;
    private final rb o;
    private com.ss.android.downloadad.api.ge q;

    public static xu dr(final Context context) {
        if (dr == null) {
            synchronized (xu.class) {
                if (dr == null) {
                    com.ss.android.downloadlib.q.ge.dr(new Runnable() { // from class: com.ss.android.downloadlib.xu.1
                        @Override // java.lang.Runnable
                        public void run() {
                            xu unused = xu.dr = new xu(context);
                        }
                    });
                }
            }
        }
        return dr;
    }

    private xu(Context context) {
        this.o = rb.dr();
        this.ge = new q();
        this.bn = System.currentTimeMillis();
        ge(context);
        this.g = dr.dr();
    }

    private void ge(Context context) {
        wb.dr(context);
        Downloader.getInstance(wb.getContext());
        com.ss.android.downloadlib.addownload.ge.bn.dr().ge();
        com.ss.android.socialbase.appdownloader.g.wb().dr(wb.getContext(), "misc_config", new com.ss.android.downloadlib.o.rb(), new com.ss.android.downloadlib.o.bn(context), new o());
        com.ss.android.downloadlib.o.g gVar = new com.ss.android.downloadlib.o.g();
        com.ss.android.socialbase.appdownloader.g.wb().dr(gVar);
        Downloader.getInstance(context).registerDownloadCacheSyncListener(gVar);
        com.ss.android.socialbase.appdownloader.g.wb().dr(new t());
        DownloadComponentManager.setDownloadEventListener(new com.ss.android.downloadlib.o.q());
        com.ss.android.socialbase.appdownloader.g.wb().dr(com.ss.android.downloadlib.bn.o.dr());
    }

    public com.ss.android.download.api.dr dr() {
        return this.ge;
    }

    public com.ss.android.download.api.dr dr(String str) {
        com.ss.android.download.api.config.bn ge = bn.dr().ge();
        if (ge != null && ge.dr(str)) {
            return ge.ge(str);
        }
        return this.ge;
    }

    public long ge() {
        return this.bn;
    }

    public void o() {
        this.bn = System.currentTimeMillis();
    }

    public com.ss.android.downloadad.api.dr g() {
        return this.g;
    }

    public com.ss.android.downloadad.api.ge q() {
        if (this.q == null) {
            this.q = ge.dr();
        }
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rb xu() {
        return this.o;
    }

    public void dr(final Context context, final int i, final DownloadStatusChangeListener downloadStatusChangeListener, final DownloadModel downloadModel) {
        com.ss.android.downloadlib.q.ge.dr(new Runnable() { // from class: com.ss.android.downloadlib.xu.4
            @Override // java.lang.Runnable
            public void run() {
                xu.this.xu().dr(context, i, downloadStatusChangeListener, downloadModel);
            }
        });
    }

    public void dr(final String str, final long j, final int i, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController, final OnItemClickListener onItemClickListener, final IDownloadButtonClickListener iDownloadButtonClickListener) {
        com.ss.android.downloadlib.q.ge.dr(new Runnable() { // from class: com.ss.android.downloadlib.xu.5
            @Override // java.lang.Runnable
            public void run() {
                xu.this.xu().dr(str, j, i, downloadEventConfig, downloadController, onItemClickListener, iDownloadButtonClickListener);
            }
        });
    }

    public void dr(final String str, final long j, final int i, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController) {
        com.ss.android.downloadlib.q.ge.dr(new Runnable() { // from class: com.ss.android.downloadlib.xu.6
            @Override // java.lang.Runnable
            public void run() {
                xu.this.xu().dr(str, j, i, downloadEventConfig, downloadController);
            }
        });
    }

    public void dr(final String str, final long j, final int i, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController, final IDownloadButtonClickListener iDownloadButtonClickListener) {
        com.ss.android.downloadlib.q.ge.dr(new Runnable() { // from class: com.ss.android.downloadlib.xu.7
            @Override // java.lang.Runnable
            public void run() {
                xu.this.xu().dr(str, j, i, downloadEventConfig, downloadController, iDownloadButtonClickListener);
            }
        });
    }

    public void dr(final String str, final int i) {
        com.ss.android.downloadlib.q.ge.dr(new Runnable() { // from class: com.ss.android.downloadlib.xu.2
            @Override // java.lang.Runnable
            public void run() {
                xu.this.xu().dr(str, i);
            }
        });
    }

    public void dr(final String str, final boolean z) {
        com.ss.android.downloadlib.q.ge.dr(new Runnable() { // from class: com.ss.android.downloadlib.xu.3
            @Override // java.lang.Runnable
            public void run() {
                xu.this.xu().dr(str, z);
            }
        });
    }

    public void dr(com.ss.android.download.api.download.dr.dr drVar) {
        xu().dr(drVar);
    }

    public String bn() {
        return wb.cu();
    }

    public void rb() {
        g.dr().q();
    }

    public DownloadInfo ge(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return com.ss.android.socialbase.appdownloader.g.wb().dr(wb.getContext(), str);
    }
}
