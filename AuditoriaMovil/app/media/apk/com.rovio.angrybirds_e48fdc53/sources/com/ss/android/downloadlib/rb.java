package com.ss.android.downloadlib;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes3.dex */
public class rb {
    private static volatile rb dr = null;
    private long bn;
    private final List<com.ss.android.downloadlib.addownload.bn> o = new CopyOnWriteArrayList();
    private final Map<String, com.ss.android.downloadlib.addownload.bn> g = new ConcurrentHashMap();
    private final CopyOnWriteArrayList<Object> q = new CopyOnWriteArrayList<>();
    private final Handler ge = new Handler(Looper.getMainLooper());

    private rb() {
    }

    public static rb dr() {
        if (dr == null) {
            synchronized (rb.class) {
                if (dr == null) {
                    dr = new rb();
                }
            }
        }
        return dr;
    }

    public void dr(Context context, int i, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel) {
        if (downloadModel == null || TextUtils.isEmpty(downloadModel.getDownloadUrl())) {
            return;
        }
        com.ss.android.downloadlib.addownload.bn bnVar = this.g.get(downloadModel.getDownloadUrl());
        if (bnVar != null) {
            bnVar.ge(context).ge(i, downloadStatusChangeListener).ge(downloadModel).dr();
        } else if (!this.o.isEmpty()) {
            ge(context, i, downloadStatusChangeListener, downloadModel);
        } else {
            o(context, i, downloadStatusChangeListener, downloadModel);
        }
    }

    public com.ss.android.downloadlib.addownload.q dr(String str) {
        Map<String, com.ss.android.downloadlib.addownload.bn> map = this.g;
        if (map == null || map.size() == 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        com.ss.android.downloadlib.addownload.bn bnVar = this.g.get(str);
        if (bnVar instanceof com.ss.android.downloadlib.addownload.q) {
            return (com.ss.android.downloadlib.addownload.q) bnVar;
        }
        return null;
    }

    private synchronized void ge(Context context, int i, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel) {
        if (this.o.size() <= 0) {
            o(context, i, downloadStatusChangeListener, downloadModel);
        } else {
            com.ss.android.downloadlib.addownload.bn remove = this.o.remove(0);
            remove.ge(context).ge(i, downloadStatusChangeListener).ge(downloadModel).dr();
            this.g.put(downloadModel.getDownloadUrl(), remove);
        }
    }

    private void o(Context context, int i, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel) {
        if (downloadModel == null) {
            return;
        }
        com.ss.android.downloadlib.addownload.q qVar = new com.ss.android.downloadlib.addownload.q();
        qVar.ge(context).ge(i, downloadStatusChangeListener).ge(downloadModel).dr();
        this.g.put(downloadModel.getDownloadUrl(), qVar);
    }

    public void dr(String str, int i) {
        com.ss.android.downloadlib.addownload.bn bnVar;
        if (TextUtils.isEmpty(str) || (bnVar = this.g.get(str)) == null) {
            return;
        }
        if (bnVar.dr(i)) {
            this.o.add(bnVar);
            this.g.remove(str);
        }
        o();
    }

    public void dr(String str, boolean z) {
        com.ss.android.downloadlib.addownload.bn bnVar;
        if (!TextUtils.isEmpty(str) && (bnVar = this.g.get(str)) != null) {
            bnVar.dr(z);
        }
    }

    public void dr(String str, long j, int i, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        dr(str, j, i, downloadEventConfig, downloadController, null, null);
    }

    public void dr(String str, long j, int i, DownloadEventConfig downloadEventConfig, DownloadController downloadController, IDownloadButtonClickListener iDownloadButtonClickListener) {
        dr(str, j, i, downloadEventConfig, downloadController, null, iDownloadButtonClickListener);
    }

    public void dr(String str, long j, int i, DownloadEventConfig downloadEventConfig, DownloadController downloadController, OnItemClickListener onItemClickListener, IDownloadButtonClickListener iDownloadButtonClickListener) {
        com.ss.android.downloadlib.addownload.bn bnVar;
        if (!TextUtils.isEmpty(str) && (bnVar = this.g.get(str)) != null) {
            bnVar.dr(j).ge(downloadEventConfig).ge(downloadController).dr(onItemClickListener).dr(iDownloadButtonClickListener).ge(i);
        }
    }

    public void dr(com.ss.android.download.api.download.dr.dr drVar) {
        if (drVar != null) {
            if (DownloadSetting.obtainGlobal().optBugFix("fix_listener_oom", false)) {
                this.q.add(new SoftReference(drVar));
            } else {
                this.q.add(drVar);
            }
        }
    }

    private void o() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.bn < 300000) {
            return;
        }
        this.bn = currentTimeMillis;
        if (!this.o.isEmpty()) {
            g();
        }
    }

    private void g() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.downloadlib.addownload.bn bnVar : this.o) {
            if (!bnVar.ge() && currentTimeMillis - bnVar.g() > 300000) {
                bnVar.xu();
                arrayList.add(bnVar);
            }
        }
        if (!arrayList.isEmpty()) {
            this.o.removeAll(arrayList);
        }
    }

    public void dr(final DownloadModel downloadModel, final DownloadController downloadController, final DownloadEventConfig downloadEventConfig) {
        this.ge.post(new Runnable() { // from class: com.ss.android.downloadlib.rb.1
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = rb.this.q.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof com.ss.android.download.api.download.dr.dr) {
                        ((com.ss.android.download.api.download.dr.dr) next).dr(downloadModel, downloadController, downloadEventConfig);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.dr.dr) {
                            ((com.ss.android.download.api.download.dr.dr) softReference.get()).dr(downloadModel, downloadController, downloadEventConfig);
                        }
                    }
                }
            }
        });
    }

    public void dr(final DownloadInfo downloadInfo, final BaseException baseException, final String str) {
        this.ge.post(new Runnable() { // from class: com.ss.android.downloadlib.rb.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = rb.this.q.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof com.ss.android.download.api.download.dr.dr) {
                        ((com.ss.android.download.api.download.dr.dr) next).dr(downloadInfo, baseException, str);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.dr.dr) {
                            ((com.ss.android.download.api.download.dr.dr) softReference.get()).dr(downloadInfo, baseException, str);
                        }
                    }
                }
            }
        });
    }

    public void dr(final DownloadInfo downloadInfo, final String str) {
        this.ge.post(new Runnable() { // from class: com.ss.android.downloadlib.rb.3
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = rb.this.q.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof com.ss.android.download.api.download.dr.dr) {
                        ((com.ss.android.download.api.download.dr.dr) next).dr(downloadInfo, str);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.dr.dr) {
                            ((com.ss.android.download.api.download.dr.dr) softReference.get()).dr(downloadInfo, str);
                        }
                    }
                }
            }
        });
    }

    public void ge(final DownloadInfo downloadInfo, final String str) {
        this.ge.post(new Runnable() { // from class: com.ss.android.downloadlib.rb.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = rb.this.q.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof com.ss.android.download.api.download.dr.dr) {
                        ((com.ss.android.download.api.download.dr.dr) next).ge(downloadInfo, str);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.dr.dr) {
                            ((com.ss.android.download.api.download.dr.dr) softReference.get()).ge(downloadInfo, str);
                        }
                    }
                }
            }
        });
    }

    public void dr(final DownloadInfo downloadInfo) {
        this.ge.post(new Runnable() { // from class: com.ss.android.downloadlib.rb.5
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = rb.this.q.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof com.ss.android.download.api.download.dr.dr) {
                        ((com.ss.android.download.api.download.dr.dr) next).dr(downloadInfo);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.dr.dr) {
                            ((com.ss.android.download.api.download.dr.dr) softReference.get()).dr(downloadInfo);
                        }
                    }
                }
            }
        });
    }

    public Handler ge() {
        return this.ge;
    }
}
