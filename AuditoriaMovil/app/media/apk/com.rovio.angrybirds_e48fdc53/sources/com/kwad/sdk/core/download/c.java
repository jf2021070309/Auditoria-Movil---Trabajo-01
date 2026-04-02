package com.kwad.sdk.core.download;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.DownloadTask;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.LruHashMap;
import com.kwad.sdk.utils.ad;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class c {
    private static final Map<String, Integer> anK = Collections.synchronizedMap(new LruHashMap(10));
    private static final Map<String, String> anN = new LruHashMap(10);
    private final WeakHashMap<d, AdTemplate> anI;
    private final Map<d, AdTemplate> anJ;
    private final HashMap<String, AdTemplate> anL;
    private final Map<String, AdTemplate> anM;
    private final com.kwad.sdk.b.a anO;
    private volatile boolean mHasInit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        static final c anW = new c((byte) 0);
    }

    private c() {
        WeakHashMap<d, AdTemplate> weakHashMap = new WeakHashMap<>();
        this.anI = weakHashMap;
        this.anJ = Collections.synchronizedMap(weakHashMap);
        this.mHasInit = false;
        HashMap<String, AdTemplate> hashMap = new HashMap<>();
        this.anL = hashMap;
        this.anM = Collections.synchronizedMap(hashMap);
        this.anO = new com.kwad.sdk.b.a() { // from class: com.kwad.sdk.core.download.c.3
            @Override // com.kwad.sdk.b.a
            public final void S(String str) {
                c.this.cP(str);
            }
        };
    }

    /* synthetic */ c(byte b) {
        this();
    }

    public static c Av() {
        return a.anW;
    }

    private void a(String str, com.kwad.sdk.g.a<d> aVar) {
        Set<d> keySet = this.anJ.keySet();
        synchronized (this.anJ) {
            for (d dVar : keySet) {
                if (dVar != null && TextUtils.equals(dVar.nB(), str)) {
                    try {
                        aVar.accept(dVar);
                    } catch (Exception e) {
                        com.kwad.sdk.core.e.c.printStackTrace(e);
                    }
                }
            }
        }
    }

    public static int cI(String str) {
        Integer num;
        if (TextUtils.isEmpty(str) || (num = anK.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cP(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f fVar = new f();
        synchronized (this.anJ) {
            for (d dVar : this.anJ.keySet()) {
                if (dVar != null && !TextUtils.isEmpty(str) && TextUtils.equals(str, dVar.nC())) {
                    dVar.a((String) null, 0, fVar);
                }
            }
        }
        com.kwad.sdk.d wQ = com.kwad.sdk.c.wO().wQ();
        if (wQ != null) {
            wQ.bO(str);
        }
        synchronized (this.anM) {
            Iterator<Map.Entry<String, AdTemplate>> it = this.anM.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, AdTemplate> next = it.next();
                if (next != null) {
                    String key = next.getKey();
                    if (!TextUtils.isEmpty(str) && TextUtils.equals(str, key)) {
                        it.remove();
                    }
                }
            }
        }
    }

    private void f(String str, f fVar) {
        AdTemplate value;
        for (Map.Entry<String, AdTemplate> entry : this.anM.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null) {
                AdInfo ck = com.kwad.sdk.core.response.b.d.ck(value);
                com.kwad.sdk.core.a.yQ().c(str, value);
                if (!TextUtils.isEmpty(str) && ck.downloadId.equals(str) && !value.mDownloadFinishReported) {
                    if (fVar.Ay()) {
                        b bVar = (b) ServiceProvider.get(b.class);
                        if (bVar != null) {
                            bVar.b(1, value);
                        }
                        fVar.Ax();
                    }
                    value.mDownloadFinishReported = true;
                }
            }
        }
    }

    public final void E(final String str, final String str2) {
        final f fVar = new f();
        anK.put(str, 8);
        a(str, new com.kwad.sdk.g.a<d>() { // from class: com.kwad.sdk.core.download.c.6
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: b */
            public void accept(d dVar) {
                dVar.a(str, str2, fVar);
            }
        });
        f(str, fVar);
    }

    public final void a(d dVar) {
        this.anJ.remove(dVar);
    }

    public final void a(d dVar, AdTemplate adTemplate) {
        this.anJ.put(dVar, adTemplate);
    }

    public final void a(final String str, final int i, final int i2, final int i3) {
        anK.put(str, 2);
        a(str, new com.kwad.sdk.g.a<d>() { // from class: com.kwad.sdk.core.download.c.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: b */
            public void accept(d dVar) {
                dVar.a(str, i, i2, i3);
            }
        });
    }

    public final synchronized void aX(Context context) {
        if (!this.mHasInit || context == null) {
            return;
        }
        com.kwad.sdk.b.b.yy().b(this.anO);
        this.anJ.clear();
        this.anM.clear();
        this.mHasInit = false;
    }

    public final void at(AdTemplate adTemplate) {
        try {
            String aq = com.kwad.sdk.core.response.b.a.aq(com.kwad.sdk.core.response.b.d.ck(adTemplate));
            if (TextUtils.isEmpty(aq)) {
                return;
            }
            this.anM.put(aq, adTemplate);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }

    public final void b(final String str, int i, final String str2) {
        anK.put(str, 7);
        final f fVar = new f();
        a(str, new com.kwad.sdk.g.a<d>() { // from class: com.kwad.sdk.core.download.c.7
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: b */
            public void accept(d dVar) {
                dVar.a(str, r3, str2, fVar);
            }
        });
    }

    public final void cJ(final String str) {
        anK.put(str, 1);
        final f fVar = new f();
        a(str, new com.kwad.sdk.g.a<d>() { // from class: com.kwad.sdk.core.download.c.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: b */
            public void accept(d dVar) {
                dVar.a(str, fVar);
            }
        });
    }

    public final void cK(final String str) {
        final f fVar = new f();
        anK.put(str, 4);
        a(str, new com.kwad.sdk.g.a<d>() { // from class: com.kwad.sdk.core.download.c.8
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: b */
            public void accept(d dVar) {
                dVar.b(str, fVar);
            }
        });
    }

    public final void cL(final String str) {
        final f fVar = new f();
        anK.put(str, 1);
        a(str, new com.kwad.sdk.g.a<d>() { // from class: com.kwad.sdk.core.download.c.9
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: b */
            public void accept(d dVar) {
                dVar.c(str, fVar);
            }
        });
    }

    public final void cM(final String str) {
        final f fVar = new f();
        anK.put(str, 5);
        a(str, new com.kwad.sdk.g.a<d>() { // from class: com.kwad.sdk.core.download.c.10
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: b */
            public void accept(d dVar) {
                dVar.d(str, fVar);
            }
        });
    }

    public final void cN(final String str) {
        final f fVar = new f();
        anK.put(str, 9);
        a(str, new com.kwad.sdk.g.a<d>() { // from class: com.kwad.sdk.core.download.c.11
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: b */
            public void accept(d dVar) {
                dVar.e(str, fVar);
            }
        });
    }

    public final void cO(final String str) {
        final f fVar = new f();
        a(str, new com.kwad.sdk.g.a<d>() { // from class: com.kwad.sdk.core.download.c.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: b */
            public void accept(d dVar) {
                dVar.ao(str);
            }
        });
    }

    public final synchronized void init(Context context) {
        if (!this.mHasInit && context != null) {
            com.kwad.sdk.c.wO().a(new com.kwad.sdk.b() { // from class: com.kwad.sdk.core.download.c.1
                private static String m(DownloadTask downloadTask) {
                    String url = downloadTask.getUrl();
                    String str = (String) c.anN.get(url);
                    if (TextUtils.isEmpty(str)) {
                        String bq = ad.bq(downloadTask.getUrl());
                        c.anN.put(url, bq);
                        return bq;
                    }
                    return str;
                }

                @Override // com.kwad.sdk.b, com.kwad.sdk.a
                public final void a(DownloadTask downloadTask) {
                    c.this.E(m(downloadTask), downloadTask.getTargetFilePath());
                }

                @Override // com.kwad.sdk.b, com.kwad.sdk.a
                public final void a(DownloadTask downloadTask, int i, int i2) {
                    c.this.a(m(downloadTask), i2 > 0 ? (int) ((i * 100.0f) / i2) : 0, i, i2);
                }

                @Override // com.kwad.sdk.b, com.kwad.sdk.a
                public final void a(DownloadTask downloadTask, Throwable th) {
                    String str;
                    if (th == null || th.getStackTrace().length <= 0) {
                        str = "";
                    } else {
                        str = th.getMessage() + " @ " + th.getStackTrace()[0].getFileName() + th.getStackTrace()[0].getClassName() + th.getStackTrace()[0].getLineNumber();
                    }
                    c.this.b(m(downloadTask), 0, str);
                }

                @Override // com.kwad.sdk.b, com.kwad.sdk.a
                public final void b(DownloadTask downloadTask) {
                    if (downloadTask.getSmallFileSoFarBytes() == 0) {
                        if (com.kwad.framework.a.a.mp.booleanValue()) {
                            com.kwad.sdk.core.e.c.d("DownloadStatusManager", "onDownloadStart(), id=" + m(downloadTask));
                        }
                        c.this.cJ(m(downloadTask));
                    }
                }

                @Override // com.kwad.sdk.b, com.kwad.sdk.a
                public final void c(DownloadTask downloadTask) {
                    c.this.cK(m(downloadTask));
                }

                @Override // com.kwad.sdk.b, com.kwad.sdk.a
                public final void d(DownloadTask downloadTask) {
                    c.this.cM(m(downloadTask));
                }

                @Override // com.kwad.sdk.b, com.kwad.sdk.a
                public final void e(DownloadTask downloadTask) {
                    c.this.cL(m(downloadTask));
                }

                @Override // com.kwad.sdk.b, com.kwad.sdk.a
                public final void f(DownloadTask downloadTask) {
                    c.this.cO(m(downloadTask));
                }
            });
            com.kwad.sdk.b.b.yy().a(this.anO);
            this.mHasInit = true;
        }
    }
}
