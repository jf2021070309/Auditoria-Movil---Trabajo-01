package com.amazon.aps.iva.mf;

import android.os.Handler;
import com.amazon.aps.iva.q.j1;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
/* compiled from: NetworkChangePresenter.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.wy.b<d> implements b {
    public final com.crunchyroll.connectivity.d b;
    public final q c;
    public final Handler d;
    public boolean e;

    public c(d dVar, com.crunchyroll.connectivity.d dVar2, r rVar, Handler handler) {
        super(dVar, new j[0]);
        this.b = dVar2;
        this.c = rVar;
        this.d = handler;
        this.e = true;
    }

    @Override // com.amazon.aps.iva.mf.b
    public final void a0() {
        this.e = false;
        this.b.b(this);
        getView().R4();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
        getView().A2();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
        getView().gh();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        if (this.e) {
            q6();
            this.b.a(this);
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        if (this.e) {
            q6();
        }
    }

    public final void q6() {
        if (this.c.c()) {
            getView().R4();
            return;
        }
        getView().f9();
        this.d.postDelayed(new j1(this, 5), 100L);
    }

    @Override // com.amazon.aps.iva.mf.b
    public final void x1() {
        this.e = true;
        this.b.a(this);
        if (this.c.c()) {
            getView().gh();
        } else {
            getView().A2();
        }
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }
}
