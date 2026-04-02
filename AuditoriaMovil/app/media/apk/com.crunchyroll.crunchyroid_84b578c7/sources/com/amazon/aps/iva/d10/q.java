package com.amazon.aps.iva.d10;

import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: DownloadedPanelsListener.kt */
/* loaded from: classes2.dex */
public abstract class q implements g0 {
    public final ConcurrentHashMap<String, e0> b = new ConcurrentHashMap<>();

    /* compiled from: DownloadedPanelsListener.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ e0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var) {
            super(0);
            this.i = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            boolean z;
            e0.a aVar;
            String str;
            e0.a aVar2;
            q qVar = q.this;
            ConcurrentHashMap<String, e0> concurrentHashMap = qVar.b;
            boolean isEmpty = concurrentHashMap.isEmpty();
            e0 e0Var = this.i;
            if (!isEmpty) {
                for (Map.Entry<String, e0> entry : concurrentHashMap.entrySet()) {
                    e0 value = entry.getValue();
                    String str2 = null;
                    if (value instanceof e0.a) {
                        aVar = (e0.a) value;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        str = aVar.p();
                    } else {
                        str = null;
                    }
                    if (e0Var instanceof e0.a) {
                        aVar2 = (e0.a) e0Var;
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        str2 = aVar2.p();
                    }
                    if (com.amazon.aps.iva.yb0.j.a(str, str2)) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                qVar.c();
            } else {
                qVar.d(e0Var.e());
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadedPanelsListener.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ e0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var) {
            super(0);
            this.i = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            q.this.d(this.i.e());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void A0(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        a(e0Var, new a(e0Var));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J3(com.amazon.aps.iva.nw.g gVar) {
        c();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        d(e0Var.e());
        b(e0Var.e());
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void L0() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void M3(List<? extends e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
        c();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void P5(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        d(str);
        b(str);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void T3() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void V4(List<? extends PlayableAsset> list) {
        com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
    }

    public final void a(e0 e0Var, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        e0.b bVar;
        ConcurrentHashMap<String, e0> concurrentHashMap = this.b;
        e0 e0Var2 = concurrentHashMap.get(e0Var.e());
        e0.b g = e0Var.g();
        if (e0Var2 != null) {
            bVar = e0Var2.g();
        } else {
            bVar = null;
        }
        if (g != bVar || (e0Var2.m() && e0Var.l())) {
            aVar.invoke();
        }
        concurrentHashMap.put(e0Var.e(), e0Var);
    }

    public final void b(String str) {
        this.b.remove(str);
    }

    public abstract void c();

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void c3(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        d(str);
        b(str);
    }

    public abstract void d(String str);

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void f7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        d(e0Var.e());
        b(e0Var.e());
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s3(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        a(e0Var, new b(e0Var));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s8(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        d(e0Var.e());
        b(e0Var.e());
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void t3() {
        c();
        this.b.clear();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void u7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        d(e0Var.e());
        b(e0Var.e());
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void v5(ArrayList arrayList) {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void x6(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        c();
        b(str);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void y7(List<? extends e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z1(List<? extends PlayableAsset> list) {
        com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z3(e0 e0Var, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        d(e0Var.e());
        b(e0Var.e());
    }
}
