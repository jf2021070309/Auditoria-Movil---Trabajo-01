package com.amazon.aps.iva.sv;

import com.amazon.aps.iva.sv.i;
import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
/* compiled from: DownloadsAgent.kt */
/* loaded from: classes2.dex */
public final class l implements k {
    public final o1 b;
    public final InternalDownloadsManager c;
    public final com.amazon.aps.iva.b10.e d;
    public final com.amazon.aps.iva.zv.h e;
    public final com.amazon.aps.iva.xb0.a<Boolean> f;
    public final com.ellation.crunchyroll.application.d g;
    public final com.amazon.aps.iva.x50.q h;
    public final com.amazon.aps.iva.wg.a i;

    public l(p1 p1Var, DownloadsManagerImpl downloadsManagerImpl, com.amazon.aps.iva.b10.f fVar, com.amazon.aps.iva.zv.h hVar, i.c cVar, com.ellation.crunchyroll.application.d dVar, com.amazon.aps.iva.x50.r rVar, com.amazon.aps.iva.rw.e eVar) {
        this.b = p1Var;
        this.c = downloadsManagerImpl;
        this.d = fVar;
        this.e = hVar;
        this.f = cVar;
        this.g = dVar;
        this.h = rVar;
        this.i = eVar;
    }

    @Override // com.amazon.aps.iva.sv.k
    public final void A4() {
        if (!this.h.a()) {
            this.c.Y0();
        }
    }

    @Override // com.amazon.aps.iva.sv.k
    public final void W() {
        this.d.f();
    }

    public final void init() {
        this.c.addEventListener(this.d);
        this.g.Lf(this);
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        if (this.f.invoke().booleanValue() && this.h.c()) {
            this.c.b1();
        }
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
    }

    @Override // com.amazon.aps.iva.sv.k
    public final void onSignIn() {
        boolean z;
        String b = this.e.b();
        if (b.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        o1 o1Var = this.b;
        boolean a = com.amazon.aps.iva.yb0.j.a(o1Var.b(), b);
        InternalDownloadsManager internalDownloadsManager = this.c;
        if (!a) {
            internalDownloadsManager.r();
            this.i.H2();
        } else {
            internalDownloadsManager.q1();
        }
        o1Var.a(b);
    }

    @Override // com.amazon.aps.iva.sv.k
    public final void onSignOut() {
        this.c.Y0();
        this.d.f();
    }
}
