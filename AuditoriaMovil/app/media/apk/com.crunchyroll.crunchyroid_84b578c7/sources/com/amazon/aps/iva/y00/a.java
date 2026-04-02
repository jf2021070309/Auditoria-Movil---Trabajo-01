package com.amazon.aps.iva.y00;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nw.g;
import com.amazon.aps.iva.sv.e2;
import com.amazon.aps.iva.sv.f2;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.yb0.i;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: LocalVideosPresenterImpl.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<b> implements com.amazon.aps.iva.sg.a, g0 {
    public final InternalDownloadsManager b;
    public C0879a c;
    public final f2<a> d;

    /* compiled from: LocalVideosPresenterImpl.kt */
    /* renamed from: com.amazon.aps.iva.y00.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0879a extends i implements com.amazon.aps.iva.xb0.a<q> {
        public C0879a(h hVar) {
            super(0, hVar, b.class, "showFullStorageDialog", "showFullStorageDialog()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ((b) this.receiver).Zd();
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.s00.a aVar, com.amazon.aps.iva.xb0.a aVar2, InternalDownloadsManager internalDownloadsManager) {
        super(aVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(internalDownloadsManager, "downloadsManager");
        this.b = internalDownloadsManager;
        this.d = new f2<>(aVar2, this, e2.h);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void A0(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        getView().u4(e0Var);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J3(g gVar) {
        getView().ga(gVar);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        getView().u4(e0Var);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void L0() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void M3(List<? extends e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
        e0[] e0VarArr = (e0[]) list.toArray(new e0[0]);
        getView().u4((e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void P5(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void T3() {
        C0879a c0879a = this.c;
        if (c0879a != null) {
            c0879a.invoke();
        }
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void V4(List<? extends PlayableAsset> list) {
        com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void c3(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void f7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        getView().u4(e0Var);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.addEventListener(this.d);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onDestroy() {
        this.b.removeEventListener(this.d);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onPause() {
        this.c = null;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        this.c = new C0879a(getView());
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s3(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        getView().u4(e0Var);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s8(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        getView().u4(e0Var);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void t3() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void u7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        getView().u4(e0Var);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void v5(ArrayList arrayList) {
        e0[] e0VarArr = (e0[]) arrayList.toArray(new e0[0]);
        getView().u4((e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void x6(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        getView().G8(str);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void y7(List<? extends e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
        e0[] e0VarArr = (e0[]) list.toArray(new e0[0]);
        getView().u4((e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z1(List<? extends PlayableAsset> list) {
        com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z3(e0 e0Var, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        getView().u4(e0Var);
    }
}
