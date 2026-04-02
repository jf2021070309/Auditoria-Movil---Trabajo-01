package com.amazon.aps.iva.aw;

import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.n40.d;
import com.amazon.aps.iva.nw.g;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.extension.LifecycleExtensionsKt;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: DownloadingDetailsMonitorImpl.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.kg.c, g0 {
    public final com.amazon.aps.iva.kg.b b;
    public final com.amazon.aps.iva.sv.c c;
    public final InternalDownloadsManager d;
    public final LinkedHashMap e;
    public final v<com.amazon.aps.iva.kg.a> f;

    /* compiled from: DownloadingDetailsMonitorImpl.kt */
    /* renamed from: com.amazon.aps.iva.aw.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0118a extends l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, q> {
        public C0118a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends e0> list) {
            List<? extends e0> list2 = list;
            j.f(list2, "localVideos");
            e0[] e0VarArr = (e0[]) list2.toArray(new e0[0]);
            a aVar = a.this;
            aVar.getClass();
            i.d(aVar.c, null, null, new c((e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length), aVar, null), 3);
            return q.a;
        }
    }

    /* compiled from: DownloadingDetailsMonitorImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(d.a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.a, ((f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public a(com.amazon.aps.iva.kg.b bVar, com.amazon.aps.iva.sv.c cVar, InternalDownloadsManager internalDownloadsManager) {
        j.f(cVar, "coroutineScope");
        j.f(internalDownloadsManager, "downloadsManager");
        this.b = bVar;
        this.c = cVar;
        this.d = internalDownloadsManager;
        this.e = new LinkedHashMap();
        this.f = new v<>();
        internalDownloadsManager.a7(bVar.a, new C0118a());
        internalDownloadsManager.addEventListener(this);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void A0(e0 e0Var) {
        j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J3(g gVar) {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J7(e0 e0Var) {
        j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void L0() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void M3(List<? extends e0> list) {
        j.f(list, "localVideos");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void P5(String str) {
        j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void T3() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void V4(List<? extends PlayableAsset> list) {
        j.f(list, "playableAssets");
    }

    @Override // com.amazon.aps.iva.kg.c
    public final void a(o oVar, d.a aVar) {
        j.f(oVar, "owner");
        LifecycleExtensionsKt.b(oVar.getLifecycle(), new com.amazon.aps.iva.aw.b(this));
        this.f.e(oVar, new b(aVar));
    }

    public final void b() {
        v<com.amazon.aps.iva.kg.a> vVar = this.f;
        LinkedHashMap linkedHashMap = this.e;
        int size = linkedHashMap.size();
        Collection<Number> values = linkedHashMap.values();
        j.f(values, "<this>");
        long j = 0;
        for (Number number : values) {
            j += number.longValue();
        }
        vVar.i(new com.amazon.aps.iva.kg.a(size, j, this.b.b));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void c3(String str) {
        j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void f7(e0 e0Var) {
        j.f(e0Var, "localVideo");
        i.d(this.c, null, null, new c(new e0[]{e0Var}, this, null), 3);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s3(e0 e0Var) {
        j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s8(e0 e0Var) {
        j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void t3() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void u7(e0 e0Var) {
        j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void v5(ArrayList arrayList) {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void x6(String str) {
        j.f(str, "downloadId");
        this.e.remove(str);
        b();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void y7(List<? extends e0> list) {
        j.f(list, "localVideos");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z1(List<? extends PlayableAsset> list) {
        j.f(list, "playableAssets");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z3(e0 e0Var, Throwable th) {
        g0.a.a(e0Var, th);
    }
}
