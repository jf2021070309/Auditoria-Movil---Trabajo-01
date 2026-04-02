package com.amazon.aps.iva.dl;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.cj.m;
import com.amazon.aps.iva.el.c0;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.vk.f;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.x50.n;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ControlsVisibilityViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.ez.b implements c, f {
    public final m b;
    public final com.amazon.aps.iva.x50.m c;
    public final v<com.amazon.aps.iva.ez.d<c0>> d;

    /* compiled from: ControlsVisibilityViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            d.this.d.i(new com.amazon.aps.iva.ez.d<>(c0.HIDDEN));
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m mVar) {
        super(new j[0]);
        n nVar = new n(new Handler(Looper.getMainLooper()));
        com.amazon.aps.iva.yb0.j.f(mVar, "playerConfiguration");
        this.b = mVar;
        this.c = nVar;
        this.d = new v<>(new com.amazon.aps.iva.ez.d(c0.SHOWN));
        N8();
    }

    @Override // com.amazon.aps.iva.vk.f
    public final void N1() {
        this.d.k(new com.amazon.aps.iva.ez.d<>(c0.FORCE_SHOWN));
        this.c.a();
    }

    public final void N8() {
        a aVar = new a();
        this.b.a();
        this.c.b(aVar, 4000L);
    }

    @Override // com.amazon.aps.iva.vk.f
    public final void O4() {
        this.c.a();
        N8();
        this.d.i(new com.amazon.aps.iva.ez.d<>(c0.SHOWN));
    }

    @Override // com.amazon.aps.iva.dl.c
    public final v R0() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.dl.c
    public final void e0() {
        this.c.a();
        this.d.i(new com.amazon.aps.iva.ez.d<>(c0.HIDDEN));
    }

    @Override // com.amazon.aps.iva.dl.c
    public final void x8() {
        c0 c0Var;
        v<com.amazon.aps.iva.ez.d<c0>> vVar = this.d;
        com.amazon.aps.iva.ez.d<c0> d = vVar.d();
        if (d != null) {
            c0Var = d.b;
        } else {
            c0Var = null;
        }
        if (c0Var != c0.FORCE_SHOWN) {
            this.c.a();
            N8();
            vVar.i(new com.amazon.aps.iva.ez.d<>(c0.SHOWN));
        }
    }
}
