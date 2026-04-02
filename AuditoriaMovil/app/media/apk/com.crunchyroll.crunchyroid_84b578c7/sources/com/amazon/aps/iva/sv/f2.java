package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: FilteredLocalVideoListener.kt */
/* loaded from: classes2.dex */
public final class f2<T extends com.ellation.crunchyroll.downloading.g0> implements com.ellation.crunchyroll.downloading.g0 {
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hg.g> b;
    public final T c;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> d;
    public final Set<String> e;

    /* compiled from: FilteredLocalVideoListener.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f2<T> h;
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f2<T> f2Var, String str) {
            super(1);
            this.h = f2Var;
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "$this$onNewEvent");
            this.h.c.P5(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FilteredLocalVideoListener.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f2<T> h;
        public final /* synthetic */ com.ellation.crunchyroll.downloading.e0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f2<T> f2Var, com.ellation.crunchyroll.downloading.e0 e0Var) {
            super(1);
            this.h = f2Var;
            this.i = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "$this$onNewEvent");
            this.h.c.f7(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FilteredLocalVideoListener.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f2<T> h;
        public final /* synthetic */ com.ellation.crunchyroll.downloading.e0 i;
        public final /* synthetic */ Throwable j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f2<T> f2Var, com.ellation.crunchyroll.downloading.e0 e0Var, Throwable th) {
            super(1);
            this.h = f2Var;
            this.i = e0Var;
            this.j = th;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "$this$onNewKalturaEvent");
            this.h.c.z3(this.i, this.j);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FilteredLocalVideoListener.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f2<T> h;
        public final /* synthetic */ com.ellation.crunchyroll.downloading.e0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f2<T> f2Var, com.ellation.crunchyroll.downloading.e0 e0Var) {
            super(1);
            this.h = f2Var;
            this.i = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "$this$onNewKalturaEvent");
            this.h.c.A0(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FilteredLocalVideoListener.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f2<T> h;
        public final /* synthetic */ com.ellation.crunchyroll.downloading.e0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f2<T> f2Var, com.ellation.crunchyroll.downloading.e0 e0Var) {
            super(1);
            this.h = f2Var;
            this.i = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "$this$onNewKalturaEvent");
            this.h.c.s8(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FilteredLocalVideoListener.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f2<T> h;
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f2<T> f2Var, String str) {
            super(1);
            this.h = f2Var;
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "$this$onNewEvent");
            this.h.c.x6(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FilteredLocalVideoListener.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f2<T> h;
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f2<T> f2Var, String str) {
            super(1);
            this.h = f2Var;
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "$this$onNewEvent");
            this.h.c.c3(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FilteredLocalVideoListener.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f2<T> h;
        public final /* synthetic */ com.ellation.crunchyroll.downloading.e0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(f2<T> f2Var, com.ellation.crunchyroll.downloading.e0 e0Var) {
            super(1);
            this.h = f2Var;
            this.i = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "$this$onNewEvent");
            this.h.c.J7(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FilteredLocalVideoListener.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f2<T> h;
        public final /* synthetic */ com.ellation.crunchyroll.downloading.e0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f2<T> f2Var, com.ellation.crunchyroll.downloading.e0 e0Var) {
            super(1);
            this.h = f2Var;
            this.i = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "$this$onNewEvent");
            this.h.c.s3(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FilteredLocalVideoListener.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f2<T> h;
        public final /* synthetic */ com.ellation.crunchyroll.downloading.e0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f2<T> f2Var, com.ellation.crunchyroll.downloading.e0 e0Var) {
            super(1);
            this.h = f2Var;
            this.i = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "$this$onNewEvent");
            this.h.c.u7(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public f2(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hg.g> aVar, T t, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        com.amazon.aps.iva.yb0.j.f(t, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.amazon.aps.iva.yb0.j.f(aVar2, "onAnyUpdate");
        this.b = aVar;
        this.c = t;
        this.d = aVar2;
        this.e = Collections.synchronizedSet(new LinkedHashSet());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[LOOP:1: B:14:0x0029->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.amazon.aps.iva.hg.g r8, java.lang.String... r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.util.List<com.ellation.crunchyroll.model.PlayableAsset> r8 = r8.d
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r1 = r8 instanceof java.util.Collection
            if (r1 == 0) goto L17
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L17
            goto L7a
        L17:
            java.util.Iterator r8 = r8.iterator()
        L1b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r8.next()
            com.ellation.crunchyroll.model.PlayableAsset r1 = (com.ellation.crunchyroll.model.PlayableAsset) r1
            int r2 = r9.length
            r3 = r0
        L29:
            r4 = 1
            if (r3 >= r2) goto L76
            r5 = r9[r3]
            java.lang.String r6 = r1.getId()
            boolean r6 = com.amazon.aps.iva.yb0.j.a(r6, r5)
            if (r6 != 0) goto L6e
            java.util.List r6 = r1.getVersions()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L4c
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4c
            goto L68
        L4c:
            java.util.Iterator r6 = r6.iterator()
        L50:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L68
            java.lang.Object r7 = r6.next()
            com.ellation.crunchyroll.model.PlayableAssetVersion r7 = (com.ellation.crunchyroll.model.PlayableAssetVersion) r7
            java.lang.String r7 = r7.getAssetId()
            boolean r7 = com.amazon.aps.iva.yb0.j.a(r7, r5)
            if (r7 == 0) goto L50
            r5 = r4
            goto L69
        L68:
            r5 = r0
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r5 = r0
            goto L6f
        L6e:
            r5 = r4
        L6f:
            if (r5 == 0) goto L73
            r1 = r4
            goto L77
        L73:
            int r3 = r3 + 1
            goto L29
        L76:
            r1 = r0
        L77:
            if (r1 == 0) goto L1b
            r0 = r4
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.f2.a(com.amazon.aps.iva.hg.g, java.lang.String[]):boolean");
    }

    public static boolean b(com.amazon.aps.iva.hg.g gVar, String... strArr) {
        if (gVar == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (PlayableAsset playableAsset : gVar.d) {
            List<PlayableAssetVersion> versions = playableAsset.getVersions();
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(versions));
            for (PlayableAssetVersion playableAssetVersion : versions) {
                arrayList2.add(playableAssetVersion.getAssetId());
            }
            com.amazon.aps.iva.lb0.t.d0(arrayList, com.amazon.aps.iva.lb0.x.M0(arrayList2, playableAsset.getId()));
        }
        return !arrayList.containsAll(com.amazon.aps.iva.lb0.o.b0(strArr));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void A0(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        if (b(this.b.invoke(), e0Var.e())) {
            this.c.A0(e0Var);
            this.d.invoke();
            return;
        }
        d(e0Var.e(), new d(this, e0Var));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J3(com.amazon.aps.iva.nw.g gVar) {
        this.c.J3(gVar);
        this.d.invoke();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J7(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        c(e0Var.e(), new h(this, e0Var));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void L0() {
        this.c.L0();
        this.d.invoke();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void M3(List<? extends com.ellation.crunchyroll.downloading.e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
        List<? extends com.ellation.crunchyroll.downloading.e0> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (com.ellation.crunchyroll.downloading.e0 e0Var : list2) {
            arrayList.add(e0Var.e());
        }
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hg.g> aVar = this.b;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (!a(aVar.invoke(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
            if (!b(aVar.invoke(), (String[]) Arrays.copyOf(strArr2, strArr2.length))) {
                return;
            }
        }
        this.c.M3(list);
        this.e.removeAll(arrayList);
        this.d.invoke();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void P5(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        c(str, new a(this, str));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void T3() {
        this.c.T3();
        this.d.invoke();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void V4(List<? extends PlayableAsset> list) {
        com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
        List<? extends PlayableAsset> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (PlayableAsset playableAsset : list2) {
            arrayList.add(playableAsset.getId());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (a(this.b.invoke(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            this.c.V4(list);
            this.d.invoke();
        }
    }

    public final void c(String str, com.amazon.aps.iva.xb0.l<? super com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> lVar) {
        if (a(this.b.invoke(), str)) {
            lVar.invoke(this);
            this.d.invoke();
        }
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void c3(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        c(str, new g(this, str));
    }

    public final void d(String str, com.amazon.aps.iva.xb0.l<? super com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> lVar) {
        if (a(this.b.invoke(), str) && !this.e.contains(str)) {
            lVar.invoke(this);
            this.d.invoke();
        }
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void f7(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        c(e0Var.e(), new b(this, e0Var));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s3(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        c(e0Var.e(), new i(this, e0Var));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s8(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        d(e0Var.e(), new e(this, e0Var));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void t3() {
        this.c.t3();
        this.d.invoke();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void u7(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        c(e0Var.e(), new j(this, e0Var));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void v5(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.ellation.crunchyroll.downloading.e0) it.next()).e());
        }
        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
        if (a(this.b.invoke(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            this.c.v5(arrayList);
        }
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void x6(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        this.e.add(str);
        c(str, new f(this, str));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void y7(List<? extends com.ellation.crunchyroll.downloading.e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
        List<? extends com.ellation.crunchyroll.downloading.e0> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (com.ellation.crunchyroll.downloading.e0 e0Var : list2) {
            arrayList.add(e0Var.e());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (a(this.b.invoke(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            this.c.y7(list);
        }
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z1(List<? extends PlayableAsset> list) {
        com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
        List<? extends PlayableAsset> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (PlayableAsset playableAsset : list2) {
            arrayList.add(playableAsset.getId());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (a(this.b.invoke(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            this.c.z1(list);
            this.d.invoke();
        }
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z3(com.ellation.crunchyroll.downloading.e0 e0Var, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        d(e0Var.e(), new c(this, e0Var, th));
    }
}
