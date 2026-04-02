package com.kwad.components.core.c;

import android.util.SparseArray;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import com.kwad.sdk.internal.api.SceneImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class d implements com.kwad.components.core.c.c {
    private static volatile d Iq;
    private static boolean Ir = true;
    private SparseArray<com.kwad.components.core.c.c> Ip;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Comparator<AdTemplate> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        private static int a(AdTemplate adTemplate, AdTemplate adTemplate2) {
            int cz = com.kwad.sdk.core.response.b.d.cz(adTemplate2) - com.kwad.sdk.core.response.b.d.cz(adTemplate);
            if (cz != 0) {
                return cz;
            }
            if (adTemplate.fromCache && adTemplate2.fromCache) {
                return 0;
            }
            return adTemplate.fromCache ? 1 : -1;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(AdTemplate adTemplate, AdTemplate adTemplate2) {
            return a(adTemplate, adTemplate2);
        }
    }

    /* loaded from: classes.dex */
    static class b extends p<com.kwad.components.core.request.a, AdResultData> {
        private com.kwad.components.core.request.model.a Iw;

        public b(com.kwad.components.core.request.model.a aVar) {
            this.Iw = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
        /* renamed from: a */
        public void onSuccess(com.kwad.components.core.request.a aVar, final AdResultData adResultData) {
            super.onSuccess(aVar, adResultData);
            GlobalThreadPools.CV().submit(new Runnable() { // from class: com.kwad.components.core.c.d.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b bVar = b.this;
                    b.f(adResultData);
                }
            });
            if (a(this.Iw, adResultData)) {
                return;
            }
            com.kwad.components.core.request.model.a.a(this.Iw, adResultData, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void f(AdResultData adResultData) {
            List<AdTemplate> proceedTemplateList = adResultData.getProceedTemplateList();
            com.kwad.components.core.c.a mk = com.kwad.components.core.c.a.mk();
            if (mk == null || proceedTemplateList.size() <= 0) {
                return;
            }
            com.kwad.components.core.c.e p = com.kwad.components.core.c.e.p(adResultData.getPosId());
            mk.ml();
            mk.g(g.a(p, adResultData));
            mk.a(com.kwad.components.core.c.e.L(proceedTemplateList.get(0)));
        }

        @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
        /* renamed from: a */
        public void onError(com.kwad.components.core.request.a aVar, int i, String str) {
            super.onError(aVar, i, str);
            com.kwad.components.core.request.model.a.a(this.Iw, i, str, false);
        }

        protected boolean a(com.kwad.components.core.request.model.a aVar, AdResultData adResultData) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void ms();
    }

    /* renamed from: com.kwad.components.core.c.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0188d implements com.kwad.components.core.c.c {
        @Override // com.kwad.components.core.c.c
        public final void c(com.kwad.components.core.request.model.a aVar) {
            d.a(aVar, new b(aVar));
        }
    }

    /* loaded from: classes.dex */
    public static class e implements com.kwad.components.core.c.c {
        @Override // com.kwad.components.core.c.c
        public final void c(final com.kwad.components.core.request.model.a aVar) {
            GlobalThreadPools.CV().submit(new Runnable() { // from class: com.kwad.components.core.c.d.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    AdResultData d = d.d(aVar);
                    if (d != null && !d.isAdResultDataEmpty()) {
                        com.kwad.components.core.request.model.a.a(aVar, d, true);
                        return;
                    }
                    com.kwad.components.core.request.model.a aVar2 = aVar;
                    d.a(aVar2, new b(aVar2));
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class f implements com.kwad.components.core.c.c {

        /* renamed from: com.kwad.components.core.c.d$f$1  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass1 extends b {
            final /* synthetic */ com.kwad.components.core.request.model.a bv;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(com.kwad.components.core.request.model.a aVar, com.kwad.components.core.request.model.a aVar2) {
                super(aVar);
                this.bv = aVar2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(SceneImpl sceneImpl, AdResultData adResultData, int i, c cVar) {
                AdResultData d = d.d(this.bv);
                if (d == null || d.isAdResultDataEmpty()) {
                    if (cVar != null) {
                        cVar.ms();
                        return;
                    }
                    return;
                }
                List a = d.a(d.getProceedTemplateList());
                List subList = a.subList(0, Math.min(i, a.size()));
                if (subList.size() > 0) {
                    if (adResultData == null) {
                        adResultData = new AdResultData(sceneImpl);
                    }
                    com.kwad.components.core.request.model.a.a(this.bv, new AdResultData(adResultData, sceneImpl, subList), false);
                }
            }

            @Override // com.kwad.components.core.c.d.b, com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public final void onError(final com.kwad.components.core.request.a aVar, final int i, final String str) {
                GlobalThreadPools.CV().submit(new Runnable() { // from class: com.kwad.components.core.c.d.f.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1.this.a(aVar.getScene(), null, aVar.getAdNum(), new c() { // from class: com.kwad.components.core.c.d.f.1.2.1
                            @Override // com.kwad.components.core.c.d.c
                            public final void ms() {
                                com.kwad.components.core.request.model.a.a(AnonymousClass1.this.bv, i, str, false);
                            }
                        });
                    }
                });
            }

            @Override // com.kwad.components.core.c.d.b
            protected final boolean a(final com.kwad.components.core.request.model.a aVar, final AdResultData adResultData) {
                AdResultData d;
                final SceneImpl adScene = adResultData.getAdScene(aVar.getPosId());
                final int adNum = adScene.getAdNum();
                if (adResultData.isAdResultDataEmpty()) {
                    GlobalThreadPools.CV().submit(new Runnable() { // from class: com.kwad.components.core.c.d.f.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass1.this.a(adScene, adResultData, adNum, new c() { // from class: com.kwad.components.core.c.d.f.1.1.1
                                @Override // com.kwad.components.core.c.d.c
                                public final void ms() {
                                    com.kwad.components.core.request.model.a.a(aVar, adResultData, false);
                                }
                            });
                        }
                    });
                    return true;
                }
                if (adResultData.isBidding() && (d = d.d(aVar)) != null && !d.isAdResultDataEmpty()) {
                    List a = d.a(d.getProceedTemplateList(), adResultData.getProceedTemplateList());
                    List subList = a.subList(0, Math.min(adNum, a.size()));
                    if (subList != null && subList.size() > 0) {
                        com.kwad.components.core.request.model.a.a(aVar, new AdResultData(adResultData, adScene, subList), true);
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // com.kwad.components.core.c.c
        public final void c(com.kwad.components.core.request.model.a aVar) {
            d.a(aVar, new AnonymousClass1(aVar, aVar));
        }
    }

    private d() {
        SparseArray<com.kwad.components.core.c.c> sparseArray = new SparseArray<>();
        this.Ip = sparseArray;
        sparseArray.append(1, new f());
        this.Ip.append(2, new e());
        this.Ip.append(0, new C0188d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends com.kwad.components.core.request.a> T a(com.kwad.sdk.g.c<T> cVar) {
        return cVar.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<AdTemplate> a(List<AdTemplate>... listArr) {
        if (listArr == null) {
            return null;
        }
        ArrayList<AdTemplate> arrayList = new ArrayList();
        for (List<AdTemplate> list : listArr) {
            arrayList.addAll(list);
        }
        Collections.sort(arrayList, new a((byte) 0));
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (AdTemplate adTemplate : arrayList) {
            long cu = com.kwad.sdk.core.response.b.d.cu(adTemplate);
            if (!hashSet.contains(Long.valueOf(cu))) {
                hashSet.add(Long.valueOf(cu));
                arrayList2.add(adTemplate);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final com.kwad.components.core.request.model.a aVar, p<com.kwad.components.core.request.a, AdResultData> pVar) {
        new com.kwad.components.core.m.a(aVar.Lp) { // from class: com.kwad.components.core.c.d.1
            @Override // com.kwad.components.core.m.a, com.kwad.sdk.core.network.m
            /* renamed from: ai */
            public final AdResultData parseData(String str) {
                KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(KSLoggerReporter.cs(aVar.getAdStyle()), "requestFinish").report();
                return AdResultData.createFromResponseJson(str, aVar.Lp.adScene);
            }

            @Override // com.kwad.components.core.m.a, com.kwad.sdk.core.network.a
            /* renamed from: mq */
            public final com.kwad.components.core.request.a createRequest() {
                return d.a(new com.kwad.sdk.g.c<com.kwad.components.core.request.a>() { // from class: com.kwad.components.core.c.d.1.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.kwad.sdk.g.c
                    /* renamed from: mr */
                    public com.kwad.components.core.request.a get() {
                        if (aVar.getAdStyle() == 4) {
                            aVar.PN = ((com.kwad.components.ad.b.h) com.kwad.sdk.components.c.f(com.kwad.components.ad.b.h.class)).R();
                        }
                        return new com.kwad.components.core.request.a(aVar);
                    }
                });
            }
        }.request(pVar);
    }

    static /* synthetic */ boolean a(d dVar) {
        return mo();
    }

    static /* synthetic */ com.kwad.components.core.c.c b(d dVar) {
        return dVar.mp();
    }

    static /* synthetic */ SparseArray c(d dVar) {
        return dVar.Ip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AdResultData d(com.kwad.components.core.request.model.a aVar) {
        com.kwad.components.core.c.a mk = com.kwad.components.core.c.a.mk();
        if (mk == null) {
            return null;
        }
        int adNum = aVar.getAdNum();
        List<g> b2 = mk.b(String.valueOf(aVar.getPosId()), System.currentTimeMillis() / 1000, com.kwad.components.core.c.e.p(aVar.getPosId()).mv());
        if (com.kwad.sdk.core.config.d.zS()) {
            h(b2);
        }
        if (b2 == null || b2.size() <= 0) {
            return null;
        }
        Collections.sort(b2);
        return g.i(b2.subList(0, Math.min(b2.size(), adNum)));
    }

    private static void h(List<g> list) {
        if (list == null) {
            return;
        }
        Iterator<g> it = list.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (com.kwad.components.core.c.f.my().a(next)) {
                com.kwad.sdk.core.e.c.d("AdCacheFetcherHolder", "filterByMemCached contain: " + next.mF());
                it.remove();
            }
        }
    }

    public static d mn() {
        if (Iq == null) {
            synchronized (d.class) {
                if (Iq == null) {
                    Iq = new d();
                }
            }
        }
        return Iq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mo() {
        if (Ir) {
            try {
                Class.forName("com.kwad.devTools.PosConfigFetcher");
                Ir = true;
            } catch (ClassNotFoundException e2) {
                Ir = false;
            }
            return Ir;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.kwad.components.core.c.c mp() {
        return this.Ip.get(0);
    }

    @Override // com.kwad.components.core.c.c
    public final void c(final com.kwad.components.core.request.model.a aVar) {
        GlobalThreadPools.CV().submit(new Runnable() { // from class: com.kwad.components.core.c.d.2
            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.kwad.components.core.c.d.a(com.kwad.components.core.c.d):boolean
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
                	... 1 more
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    r2 = this;
                    com.kwad.components.core.request.model.a r0 = r2
                    long r0 = r0.getPosId()
                    com.kwad.components.core.c.e r0 = com.kwad.components.core.c.e.p(r0)
                    com.kwad.components.core.c.d$2$1 r1 = new com.kwad.components.core.c.d$2$1
                    r1.<init>()
                    com.kwad.sdk.utils.bj.runOnUiThread(r1)
                    com.kwad.components.core.c.d r1 = com.kwad.components.core.c.d.this
                    boolean r1 = com.kwad.components.core.c.d.a(r1)
                    if (r1 != 0) goto L38
                    boolean r1 = r0.isDefault()
                    if (r1 != 0) goto L27
                    boolean r1 = r0.isEnable()
                    if (r1 != 0) goto L27
                    goto L38
                L27:
                    com.kwad.components.core.c.d r1 = com.kwad.components.core.c.d.this
                    android.util.SparseArray r1 = com.kwad.components.core.c.d.c(r1)
                    int r0 = r0.mu()
                    java.lang.Object r0 = r1.get(r0)
                    com.kwad.components.core.c.c r0 = (com.kwad.components.core.c.c) r0
                    goto L3e
                L38:
                    com.kwad.components.core.c.d r0 = com.kwad.components.core.c.d.this
                    com.kwad.components.core.c.c r0 = com.kwad.components.core.c.d.b(r0)
                L3e:
                    if (r0 != 0) goto L4d
                    com.kwad.components.core.c.d r0 = com.kwad.components.core.c.d.this
                    android.util.SparseArray r0 = com.kwad.components.core.c.d.c(r0)
                    r1 = 1
                    java.lang.Object r0 = r0.get(r1)
                    com.kwad.components.core.c.c r0 = (com.kwad.components.core.c.c) r0
                L4d:
                    com.kwad.components.core.request.model.a r1 = r2
                    r0.c(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.core.c.d.AnonymousClass2.run():void");
            }
        });
    }
}
