package com.amazon.aps.iva.l40;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.qz.b;
import com.amazon.aps.iva.sv.e2;
import com.amazon.aps.iva.sv.f2;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.List;
/* compiled from: OfflineShowPageViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends v1 implements com.ellation.crunchyroll.downloading.g0 {
    public final EventDispatcher<com.ellation.crunchyroll.downloading.g0> v;
    public final com.amazon.aps.iva.qz.b w;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.m50.b>> x;
    public final f2<d> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.o40.a aVar, InternalDownloadsManager internalDownloadsManager, com.amazon.aps.iva.r40.e eVar, com.amazon.aps.iva.m40.d dVar, g gVar, com.amazon.aps.iva.qz.b bVar) {
        super(aVar, eVar, dVar, gVar, bVar);
        com.amazon.aps.iva.yb0.j.f(aVar, "showContentInteractor");
        com.amazon.aps.iva.yb0.j.f(internalDownloadsManager, "downloadManager");
        this.v = internalDownloadsManager;
        this.w = bVar;
        this.x = new com.amazon.aps.iva.i5.v<>();
        f2<d> f2Var = new f2<>(new c(this), this, e2.h);
        this.y = f2Var;
        internalDownloadsManager.addEventListener(f2Var);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void A0(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        b.a.a(this.w, Q8(), 4);
        U8();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J3(com.amazon.aps.iva.nw.g gVar) {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J7(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void L0() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void M3(List<? extends com.ellation.crunchyroll.downloading.e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
        b.a.a(this.w, Q8(), 4);
        U8();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void P5(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void T3() {
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
    public final void f7(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.amazon.aps.iva.l40.v1, com.amazon.aps.iva.ez.b, com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        super.onCleared();
        this.v.removeEventListener(this.y);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s3(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s8(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void t3() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void u7(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void v5(ArrayList arrayList) {
    }

    @Override // com.amazon.aps.iva.l40.v1, com.amazon.aps.iva.l40.j1
    public final LiveData x() {
        return this.x;
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void x6(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        this.w.r1(Q8(), false, true);
        U8();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void y7(List<? extends com.ellation.crunchyroll.downloading.e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z1(List<? extends PlayableAsset> list) {
        com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z3(com.ellation.crunchyroll.downloading.e0 e0Var, Throwable th) {
        g0.a.a(e0Var, th);
    }
}
