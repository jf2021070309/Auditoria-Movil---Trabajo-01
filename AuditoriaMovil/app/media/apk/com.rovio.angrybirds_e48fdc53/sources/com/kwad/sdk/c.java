package com.kwad.sdk;

import android.content.Context;
import com.kwad.framework.filedownloader.f.c;
import com.kwad.framework.filedownloader.r;
import com.kwad.framework.filedownloader.services.c;
import com.kwad.sdk.DownloadTask;
import com.kwad.sdk.k;
import com.kwad.sdk.utils.ad;
import com.kwad.sdk.utils.ak;
import com.kwad.sdk.utils.av;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class c {
    private com.kwad.sdk.a agY;
    private d aha;
    private Context mContext;
    private final Map<Integer, DownloadTask> agW = new ConcurrentHashMap();
    private final Map<String, Integer> agX = new ConcurrentHashMap();
    private boolean agZ = false;

    /* loaded from: classes.dex */
    static final class a {
        private static final c ahc = new c();
    }

    private void a(int i, DownloadTask.DownloadRequest downloadRequest) {
        DownloadTask downloadTask = this.agW.get(Integer.valueOf(i));
        if (downloadTask != null) {
            downloadTask.resume(downloadRequest);
        }
    }

    private void a(int i, com.kwad.sdk.a... aVarArr) {
        DownloadTask downloadTask = this.agW.get(Integer.valueOf(i));
        if (downloadTask != null) {
            for (int i2 = 0; i2 < 2; i2++) {
                com.kwad.sdk.a aVar = aVarArr[i2];
                if (aVar != null) {
                    aVar.setId(i);
                    downloadTask.addListener(aVar);
                }
            }
        }
    }

    private void bM(int i) {
        DownloadTask downloadTask = this.agW.get(Integer.valueOf(i));
        if (downloadTask != null) {
            downloadTask.clearListener();
        }
    }

    private void h(DownloadTask downloadTask) {
        this.agW.remove(Integer.valueOf(downloadTask.getId()));
        this.agX.remove(downloadTask.getUrl());
    }

    public static c wO() {
        return a.ahc;
    }

    public static boolean wR() {
        try {
            Class.forName("com.kwad.sdk.api.proxy.app.BaseFragmentActivity.RequestInstallPermissionActivity");
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private void wS() {
        k.a aVar;
        try {
            aVar = new k.a(true);
        } catch (Throwable th) {
            th.printStackTrace();
            aVar = null;
        }
        if (aVar != null) {
            com.kwad.framework.filedownloader.download.b.us().b(new c.b().bC(Integer.MAX_VALUE).a(aVar));
            this.agZ = true;
        }
    }

    private static void wT() {
        k.a aVar;
        try {
            aVar = new k.a(false);
        } catch (Throwable th) {
            th.printStackTrace();
            aVar = null;
        }
        if (aVar != null) {
            com.kwad.framework.filedownloader.download.b.us().b(new c.b().bC(Integer.MAX_VALUE).a(aVar));
        }
    }

    public final int a(DownloadTask.DownloadRequest downloadRequest, com.kwad.sdk.a aVar) {
        DownloadTask downloadTask = new DownloadTask(downloadRequest);
        if (downloadRequest.getDownloadUrl().contains("downali.game.uc.cn")) {
            wS();
        } else if (this.agZ) {
            wT();
        }
        if (this.agW.get(Integer.valueOf(downloadTask.getId())) != null) {
            a(downloadTask.getId(), downloadRequest);
            bM(downloadTask.getId());
        } else {
            this.agW.put(Integer.valueOf(downloadTask.getId()), downloadTask);
            this.agX.put(downloadTask.getUrl(), Integer.valueOf(downloadTask.getId()));
            downloadTask.submit();
        }
        a(downloadTask.getId(), null, this.agY);
        return downloadTask.getId();
    }

    public final void a(com.kwad.sdk.a aVar) {
        this.agY = aVar;
    }

    public final DownloadTask bL(int i) {
        return this.agW.get(Integer.valueOf(i));
    }

    public final void bN(int i) {
        DownloadTask bL = bL(i);
        if (bL == null) {
            return;
        }
        if (bL.isUserPause()) {
            resume(i);
        } else {
            pause(i);
        }
    }

    public final void cancel(int i) {
        DownloadTask downloadTask = this.agW.get(Integer.valueOf(i));
        if (downloadTask != null) {
            downloadTask.cancel();
            h(downloadTask);
        }
    }

    public final void g(DownloadTask downloadTask) {
        if (ak.an(this.mContext, downloadTask.getTargetFilePath())) {
            com.kwad.sdk.core.download.c.Av().cN(ad.bq(downloadTask.getUrl()));
        }
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final void init(Context context) {
        this.mContext = context;
        r.a(context, new c.b().bC(Integer.MAX_VALUE).a(new c.a() { // from class: com.kwad.sdk.c.1
            @Override // com.kwad.framework.filedownloader.services.c.a
            public final c.b uy() {
                try {
                    k.a aVar = new k.a(false);
                    aVar.ba("");
                    return aVar;
                } catch (Throwable th) {
                    return null;
                }
            }
        }));
    }

    public final void pause(int i) {
        DownloadTask downloadTask = this.agW.get(Integer.valueOf(i));
        if (downloadTask != null) {
            downloadTask.userPause();
        }
    }

    public final void resume(int i) {
        a(i, (DownloadTask.DownloadRequest) null);
    }

    public final File wP() {
        return av.cM(this.mContext);
    }

    public final d wQ() {
        if (this.aha == null) {
            this.aha = new com.kwad.sdk.core.download.b.a();
        }
        return this.aha;
    }

    public final boolean wU() {
        while (true) {
            boolean z = false;
            for (Map.Entry<Integer, DownloadTask> entry : this.agW.entrySet()) {
                DownloadTask value = entry.getValue();
                if (value != null) {
                    int status = value.getStatus();
                    if (status != -2 && status != 1 && status != 2 && status != 3 && status != 5 && status != 6 && status != 10 && status != 11 && Math.abs(value.getStatusUpdateTime() - System.currentTimeMillis()) > 120000) {
                        z = true;
                    }
                }
            }
            return z;
        }
    }
}
