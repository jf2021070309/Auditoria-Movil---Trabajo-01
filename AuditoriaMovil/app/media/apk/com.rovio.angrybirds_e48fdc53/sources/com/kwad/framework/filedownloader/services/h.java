package com.kwad.framework.filedownloader.services;

import android.util.SparseArray;
import com.kwad.framework.filedownloader.download.DownloadLaunchRunnable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h {
    private ThreadPoolExecutor aeL;
    private int aeN;
    private SparseArray<DownloadLaunchRunnable> aeK = new SparseArray<>();
    private final String aeM = "Network";
    private int aeO = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(int i) {
        this.aeL = com.kwad.framework.filedownloader.f.b.j(i, "Network");
        this.aeN = i;
    }

    private synchronized void vJ() {
        SparseArray<DownloadLaunchRunnable> sparseArray = new SparseArray<>();
        int size = this.aeK.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.aeK.keyAt(i);
            DownloadLaunchRunnable downloadLaunchRunnable = this.aeK.get(keyAt);
            if (downloadLaunchRunnable.isAlive()) {
                sparseArray.put(keyAt, downloadLaunchRunnable);
            }
        }
        this.aeK = sparseArray;
    }

    public final void a(DownloadLaunchRunnable downloadLaunchRunnable) {
        int i;
        downloadLaunchRunnable.uC();
        synchronized (this) {
            this.aeK.put(downloadLaunchRunnable.getId(), downloadLaunchRunnable);
        }
        this.aeL.execute(downloadLaunchRunnable);
        int i2 = this.aeO;
        if (i2 >= 600) {
            vJ();
            i = 0;
        } else {
            i = i2 + 1;
        }
        this.aeO = i;
    }

    public final boolean bF(int i) {
        DownloadLaunchRunnable downloadLaunchRunnable = this.aeK.get(i);
        return downloadLaunchRunnable != null && downloadLaunchRunnable.isAlive();
    }

    public final synchronized boolean bs(int i) {
        if (vK() > 0) {
            com.kwad.framework.filedownloader.f.d.d(this, "Can't change the max network thread count, because the  network thread pool isn't in IDLE, please try again after all running tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
            return false;
        }
        int bG = com.kwad.framework.filedownloader.f.e.bG(i);
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "change the max network thread count, from %d to %d", Integer.valueOf(this.aeN), Integer.valueOf(bG));
        }
        List<Runnable> shutdownNow = this.aeL.shutdownNow();
        this.aeL = com.kwad.framework.filedownloader.f.b.j(bG, "Network");
        if (shutdownNow.size() > 0) {
            com.kwad.framework.filedownloader.f.d.d(this, "recreate the network thread pool and discard %d tasks", Integer.valueOf(shutdownNow.size()));
        }
        this.aeN = bG;
        return true;
    }

    public final void cancel(int i) {
        vJ();
        synchronized (this) {
            DownloadLaunchRunnable downloadLaunchRunnable = this.aeK.get(i);
            if (downloadLaunchRunnable != null) {
                downloadLaunchRunnable.pause();
                boolean remove = this.aeL.remove(downloadLaunchRunnable);
                if (com.kwad.framework.filedownloader.f.d.aeU) {
                    com.kwad.framework.filedownloader.f.d.c(this, "successful cancel %d %B", Integer.valueOf(i), Boolean.valueOf(remove));
                }
            }
            this.aeK.remove(i);
        }
    }

    public final int l(String str, int i) {
        if (str == null) {
            return 0;
        }
        int size = this.aeK.size();
        for (int i2 = 0; i2 < size; i2++) {
            DownloadLaunchRunnable valueAt = this.aeK.valueAt(i2);
            if (valueAt != null && valueAt.isAlive() && valueAt.getId() != i && str.equals(valueAt.uH())) {
                return valueAt.getId();
            }
        }
        return 0;
    }

    public final synchronized int vK() {
        vJ();
        return this.aeK.size();
    }

    public final synchronized List<Integer> vL() {
        ArrayList arrayList;
        vJ();
        arrayList = new ArrayList();
        for (int i = 0; i < this.aeK.size(); i++) {
            SparseArray<DownloadLaunchRunnable> sparseArray = this.aeK;
            arrayList.add(Integer.valueOf(sparseArray.get(sparseArray.keyAt(i)).getId()));
        }
        return arrayList;
    }
}
