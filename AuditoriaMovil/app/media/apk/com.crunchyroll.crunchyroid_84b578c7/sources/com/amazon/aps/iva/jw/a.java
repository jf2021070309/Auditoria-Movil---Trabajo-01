package com.amazon.aps.iva.jw;

import com.amazon.aps.iva.nw.g;
import com.amazon.aps.iva.q00.e;
import com.amazon.aps.iva.sv.i;
import com.amazon.aps.iva.sv.t2;
import com.amazon.aps.iva.sv.u2;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ys.d;
import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.List;
/* compiled from: OutOfStorageManager.kt */
/* loaded from: classes2.dex */
public final class a implements g0, d {
    public final InternalDownloadsManager b;
    public final t2 c;
    public final com.amazon.aps.iva.q00.d d;
    public final q e;
    public final com.amazon.aps.iva.xb0.a<Boolean> f;

    public a(DownloadsManagerImpl downloadsManagerImpl, u2 u2Var, e eVar, r rVar, i.f fVar) {
        this.b = downloadsManagerImpl;
        this.c = u2Var;
        this.d = eVar;
        this.e = rVar;
        this.f = fVar;
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

    public final void a() {
        boolean booleanValue = this.f.invoke().booleanValue();
        InternalDownloadsManager internalDownloadsManager = this.b;
        if (booleanValue && this.e.c() && !this.d.a() && this.c.a()) {
            internalDownloadsManager.q1();
        } else {
            internalDownloadsManager.Y0();
        }
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void c3(String str) {
        j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void f7(e0 e0Var) {
        j.f(e0Var, "localVideo");
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        a();
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
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
        a();
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
