package com.amazon.aps.iva.j1;

import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.h1.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.f0;
import com.amazon.aps.iva.o0.g0;
import com.amazon.aps.iva.o0.j0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.u0;
import com.amazon.aps.iva.o0.v0;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.o0.y1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: VectorPainter.kt */
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.i1.c {
    public final y1 b = com.amazon.aps.iva.cq.b.c0(new com.amazon.aps.iva.e1.g(com.amazon.aps.iva.e1.g.b));
    public final y1 c = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
    public final k d;
    public f0 e;
    public final y1 f;
    public float g;
    public y h;

    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v0, u0> {
        public final /* synthetic */ f0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f0 f0Var) {
            super(1);
            this.h = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final u0 invoke(v0 v0Var) {
            com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
            return new q(this.h);
        }
    }

    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String i;
        public final /* synthetic */ float j;
        public final /* synthetic */ float k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.r<Float, Float, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, float f, float f2, com.amazon.aps.iva.xb0.r<? super Float, ? super Float, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> rVar, int i) {
            super(2);
            this.i = str;
            this.j = f;
            this.k = f2;
            this.l = rVar;
            this.m = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            r.this.a(this.i, this.j, this.k, this.l, iVar, com.amazon.aps.iva.ff0.b.I(this.m | 1));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            r.this.f.setValue(Boolean.TRUE);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public r() {
        k kVar = new k();
        kVar.e = new c();
        this.d = kVar;
        this.f = com.amazon.aps.iva.cq.b.c0(Boolean.TRUE);
        this.g = 1.0f;
    }

    public final void a(String str, float f, float f2, com.amazon.aps.iva.xb0.r<? super Float, ? super Float, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> rVar, com.amazon.aps.iva.o0.i iVar, int i) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(rVar, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.o0.j g = iVar.g(1264894527);
        e0.b bVar = e0.a;
        k kVar = this.d;
        kVar.getClass();
        com.amazon.aps.iva.j1.c cVar = kVar.b;
        cVar.getClass();
        cVar.h = str;
        cVar.c();
        boolean z2 = false;
        if (kVar.g == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            kVar.g = f;
            kVar.c = true;
            kVar.e.invoke();
        }
        if (kVar.h == f2) {
            z2 = true;
        }
        if (!z2) {
            kVar.h = f2;
            kVar.c = true;
            kVar.e.invoke();
        }
        g0 g0 = com.amazon.aps.iva.cq.b.g0(g);
        f0 f0Var = this.e;
        if (f0Var == null || f0Var.f()) {
            f0Var = j0.a(new j(cVar), g0);
        }
        this.e = f0Var;
        f0Var.m(com.amazon.aps.iva.v0.b.c(-1916507005, new s(rVar, this), true));
        x0.a(f0Var, new a(f0Var), g);
        j2 X = g.X();
        if (X != null) {
            X.d = new b(str, f, f2, rVar, i);
        }
    }

    @Override // com.amazon.aps.iva.i1.c
    public final boolean applyAlpha(float f) {
        this.g = f;
        return true;
    }

    @Override // com.amazon.aps.iva.i1.c
    public final boolean applyColorFilter(y yVar) {
        this.h = yVar;
        return true;
    }

    @Override // com.amazon.aps.iva.i1.c
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo16getIntrinsicSizeNHjbRc() {
        return ((com.amazon.aps.iva.e1.g) this.b.getValue()).a;
    }

    @Override // com.amazon.aps.iva.i1.c
    public final void onDraw(com.amazon.aps.iva.h1.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
        y yVar = this.h;
        k kVar = this.d;
        if (yVar == null) {
            yVar = (y) kVar.f.getValue();
        }
        if (((Boolean) this.c.getValue()).booleanValue() && eVar.getLayoutDirection() == com.amazon.aps.iva.o2.l.Rtl) {
            long Z0 = eVar.Z0();
            a.b R0 = eVar.R0();
            long h = R0.h();
            R0.a().n();
            R0.a.e(Z0);
            kVar.e(eVar, this.g, yVar);
            R0.a().g();
            R0.b(h);
        } else {
            kVar.e(eVar, this.g, yVar);
        }
        y1 y1Var = this.f;
        if (((Boolean) y1Var.getValue()).booleanValue()) {
            y1Var.setValue(Boolean.FALSE);
        }
    }
}
