package com.amazon.aps.iva.da;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.provider.Settings;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.f1.u;
import com.amazon.aps.iva.ma.g;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.s1.f;
import com.amazon.aps.iva.s1.z0;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.n0;
import com.google.android.gms.ads.AdRequest;
import java.util.Map;
import okhttp3.internal.http2.Http2;
/* compiled from: LottieAnimation.kt */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: LottieAnimation.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.z9.h h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<Float> i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ n0 n;
        public final /* synthetic */ boolean o;
        public final /* synthetic */ m p;
        public final /* synthetic */ com.amazon.aps.iva.a1.a q;
        public final /* synthetic */ com.amazon.aps.iva.s1.f r;
        public final /* synthetic */ boolean s;
        public final /* synthetic */ Map<String, Typeface> t;
        public final /* synthetic */ int u;
        public final /* synthetic */ int v;
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.xb0.a<Float> aVar, com.amazon.aps.iva.a1.f fVar, boolean z, boolean z2, boolean z3, n0 n0Var, boolean z4, m mVar, com.amazon.aps.iva.a1.a aVar2, com.amazon.aps.iva.s1.f fVar2, boolean z5, Map<String, ? extends Typeface> map, int i, int i2, int i3) {
            super(2);
            this.h = hVar;
            this.i = aVar;
            this.j = fVar;
            this.k = z;
            this.l = z2;
            this.m = z3;
            this.n = n0Var;
            this.o = z4;
            this.p = mVar;
            this.q = aVar2;
            this.r = fVar2;
            this.s = z5;
            this.t = map;
            this.u = i;
            this.v = i2;
            this.w = i3;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            g.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, iVar, this.u | 1, this.v, this.w);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: LottieAnimation.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.e, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.z9.h h;
        public final /* synthetic */ com.amazon.aps.iva.s1.f i;
        public final /* synthetic */ com.amazon.aps.iva.a1.a j;
        public final /* synthetic */ Matrix k;
        public final /* synthetic */ d0 l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ n0 n;
        public final /* synthetic */ Map<String, Typeface> o;
        public final /* synthetic */ m p;
        public final /* synthetic */ boolean q;
        public final /* synthetic */ boolean r;
        public final /* synthetic */ boolean s;
        public final /* synthetic */ boolean t;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<Float> u;
        public final /* synthetic */ q1<m> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.s1.f fVar, com.amazon.aps.iva.a1.a aVar, Matrix matrix, d0 d0Var, boolean z, n0 n0Var, Map<String, ? extends Typeface> map, m mVar, boolean z2, boolean z3, boolean z4, boolean z5, com.amazon.aps.iva.xb0.a<Float> aVar2, q1<m> q1Var) {
            super(1);
            this.h = hVar;
            this.i = fVar;
            this.j = aVar;
            this.k = matrix;
            this.l = d0Var;
            this.m = z;
            this.n = n0Var;
            this.o = map;
            this.p = mVar;
            this.q = z2;
            this.r = z3;
            this.s = z4;
            this.t = z5;
            this.u = aVar2;
            this.v = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.e eVar) {
            com.amazon.aps.iva.h1.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$Canvas");
            com.amazon.aps.iva.a1.a aVar = this.j;
            u a = eVar2.R0().a();
            com.amazon.aps.iva.z9.h hVar = this.h;
            long d = com.amazon.aps.iva.ab.r.d(hVar.j.width(), hVar.j.height());
            long a2 = com.amazon.aps.iva.o2.k.a(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.d(eVar2.h())), com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.b(eVar2.h())));
            long a3 = this.i.a(d, eVar2.h());
            long a4 = aVar.a(com.amazon.aps.iva.o2.k.a((int) (z0.a(a3) * com.amazon.aps.iva.e1.g.d(d)), (int) (z0.b(a3) * com.amazon.aps.iva.e1.g.b(d))), a2, eVar2.getLayoutDirection());
            Matrix matrix = this.k;
            matrix.reset();
            matrix.preTranslate((int) (a4 >> 32), com.amazon.aps.iva.o2.h.b(a4));
            matrix.preScale(z0.a(a3), z0.b(a3));
            d0 d0Var = this.l;
            boolean z = d0Var.n;
            boolean z2 = this.m;
            if (z != z2) {
                d0Var.n = z2;
                if (d0Var.b != null) {
                    d0Var.c();
                }
            }
            d0Var.v = this.n;
            d0Var.e();
            d0Var.m(hVar);
            Map<String, Typeface> map = d0Var.l;
            Map<String, Typeface> map2 = this.o;
            if (map2 != map) {
                d0Var.l = map2;
                d0Var.invalidateSelf();
            }
            q1<m> q1Var = this.v;
            m value = q1Var.getValue();
            m mVar = this.p;
            if (mVar != value) {
                if (q1Var.getValue() == null) {
                    if (mVar == null) {
                        q1Var.setValue(mVar);
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            boolean z3 = d0Var.t;
            boolean z4 = this.q;
            if (z3 != z4) {
                d0Var.t = z4;
                com.amazon.aps.iva.ia.c cVar = d0Var.q;
                if (cVar != null) {
                    cVar.s(z4);
                }
            }
            d0Var.u = this.r;
            d0Var.o = this.s;
            boolean z5 = d0Var.p;
            boolean z6 = this.t;
            if (z6 != z5) {
                d0Var.p = z6;
                com.amazon.aps.iva.ia.c cVar2 = d0Var.q;
                if (cVar2 != null) {
                    cVar2.H = z6;
                }
                d0Var.invalidateSelf();
            }
            d0Var.x(this.u.invoke().floatValue());
            d0Var.setBounds(0, 0, hVar.j.width(), hVar.j.height());
            Canvas canvas = com.amazon.aps.iva.f1.h.a;
            com.amazon.aps.iva.yb0.j.f(a, "<this>");
            Canvas canvas2 = ((com.amazon.aps.iva.f1.g) a).a;
            com.amazon.aps.iva.ia.c cVar3 = d0Var.q;
            com.amazon.aps.iva.z9.h hVar2 = d0Var.b;
            if (cVar3 != null && hVar2 != null) {
                if (d0Var.w) {
                    canvas2.save();
                    canvas2.concat(matrix);
                    d0Var.k(canvas2, cVar3);
                    canvas2.restore();
                } else {
                    cVar3.h(canvas2, matrix, d0Var.r);
                }
                d0Var.J = false;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: LottieAnimation.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.z9.h h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<Float> i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ n0 n;
        public final /* synthetic */ boolean o;
        public final /* synthetic */ m p;
        public final /* synthetic */ com.amazon.aps.iva.a1.a q;
        public final /* synthetic */ com.amazon.aps.iva.s1.f r;
        public final /* synthetic */ boolean s;
        public final /* synthetic */ Map<String, Typeface> t;
        public final /* synthetic */ int u;
        public final /* synthetic */ int v;
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.xb0.a<Float> aVar, com.amazon.aps.iva.a1.f fVar, boolean z, boolean z2, boolean z3, n0 n0Var, boolean z4, m mVar, com.amazon.aps.iva.a1.a aVar2, com.amazon.aps.iva.s1.f fVar2, boolean z5, Map<String, ? extends Typeface> map, int i, int i2, int i3) {
            super(2);
            this.h = hVar;
            this.i = aVar;
            this.j = fVar;
            this.k = z;
            this.l = z2;
            this.m = z3;
            this.n = n0Var;
            this.o = z4;
            this.p = mVar;
            this.q = aVar2;
            this.r = fVar2;
            this.s = z5;
            this.t = map;
            this.u = i;
            this.v = i2;
            this.w = i3;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            g.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, iVar, this.u | 1, this.v, this.w);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: LottieAnimation.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Float> {
        public final /* synthetic */ h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.da.b bVar) {
            super(0);
            this.h = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Float invoke() {
            return Float.valueOf(this.h.getValue().floatValue());
        }
    }

    /* compiled from: LottieAnimation.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ com.amazon.aps.iva.z9.h h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ j l;
        public final /* synthetic */ float m;
        public final /* synthetic */ int n;
        public final /* synthetic */ boolean o;
        public final /* synthetic */ boolean p;
        public final /* synthetic */ boolean q;
        public final /* synthetic */ n0 r;
        public final /* synthetic */ boolean s;
        public final /* synthetic */ boolean t;
        public final /* synthetic */ m u;
        public final /* synthetic */ com.amazon.aps.iva.a1.a v;
        public final /* synthetic */ com.amazon.aps.iva.s1.f w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ Map<String, Typeface> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.a1.f fVar, boolean z, boolean z2, j jVar, float f, int i, boolean z3, boolean z4, boolean z5, n0 n0Var, boolean z6, boolean z7, m mVar, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.s1.f fVar2, boolean z8, Map<String, ? extends Typeface> map, int i2, int i3, int i4) {
            super(2);
            this.h = hVar;
            this.i = fVar;
            this.j = z;
            this.k = z2;
            this.l = jVar;
            this.m = f;
            this.n = i;
            this.o = z3;
            this.p = z4;
            this.q = z5;
            this.r = n0Var;
            this.s = z6;
            this.t = z7;
            this.u = mVar;
            this.v = aVar;
            this.w = fVar2;
            this.x = z8;
            this.y = map;
            this.z = i2;
            this.A = i3;
            this.B = i4;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            g.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, iVar, this.z | 1, this.A, this.B);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.a1.f fVar, boolean z, boolean z2, j jVar, float f, int i, boolean z3, boolean z4, boolean z5, n0 n0Var, boolean z6, boolean z7, m mVar, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.s1.f fVar2, boolean z8, Map<String, ? extends Typeface> map, com.amazon.aps.iva.o0.i iVar, int i2, int i3, int i4) {
        com.amazon.aps.iva.o0.j g = iVar.g(185154698);
        f.a aVar2 = (i4 & 2) != 0 ? f.a.c : fVar;
        boolean z9 = true;
        boolean z10 = (i4 & 4) != 0 ? true : z;
        boolean z11 = (i4 & 8) != 0 ? true : z2;
        j jVar2 = (i4 & 16) != 0 ? null : jVar;
        float f2 = (i4 & 32) != 0 ? 1.0f : f;
        int i5 = (i4 & 64) != 0 ? 1 : i;
        boolean z12 = (i4 & 128) != 0 ? false : z3;
        boolean z13 = (i4 & 256) != 0 ? false : z4;
        boolean z14 = (i4 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? false : z5;
        n0 n0Var2 = (i4 & 1024) != 0 ? n0.AUTOMATIC : n0Var;
        boolean z15 = (i4 & 2048) != 0 ? false : z6;
        boolean z16 = (i4 & 4096) != 0 ? false : z7;
        m mVar2 = (i4 & 8192) != 0 ? null : mVar;
        com.amazon.aps.iva.a1.b bVar = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? a.C0097a.e : aVar;
        f.a.d dVar = (32768 & i4) != 0 ? f.a.b : fVar2;
        boolean z17 = (65536 & i4) != 0 ? true : z8;
        Map<String, ? extends Typeface> map2 = (131072 & i4) != 0 ? null : map;
        g.s(-180607681);
        i iVar2 = i.Immediately;
        if (i5 > 0) {
            if (Float.isInfinite(f2) || Float.isNaN(f2)) {
                z9 = false;
            }
            if (z9) {
                g.s(-610207901);
                g.s(-3687241);
                Object e0 = g.e0();
                i.a.C0550a c0550a = i.a.a;
                if (e0 == c0550a) {
                    e0 = new f();
                    g.K0(e0);
                }
                g.U(false);
                com.amazon.aps.iva.da.b bVar2 = (com.amazon.aps.iva.da.b) e0;
                g.U(false);
                g.s(-3687241);
                Object e02 = g.e0();
                if (e02 == c0550a) {
                    e02 = com.amazon.aps.iva.cq.b.c0(Boolean.valueOf(z10));
                    g.K0(e02);
                }
                g.U(false);
                g.s(-180606834);
                g.a aVar3 = com.amazon.aps.iva.ma.g.a;
                n0 n0Var3 = n0Var2;
                boolean z18 = z14;
                float f3 = f2 / Settings.Global.getFloat(((Context) g.i(androidx.compose.ui.platform.d.b)).getContentResolver(), "animator_duration_scale", 1.0f);
                g.U(false);
                float f4 = f2;
                boolean z19 = z13;
                x0.e(new Object[]{hVar, Boolean.valueOf(z10), jVar2, Float.valueOf(f3), Integer.valueOf(i5)}, new com.amazon.aps.iva.da.a(z10, z11, bVar2, hVar, i5, z15, f3, jVar2, iVar2, false, (q1) e02, null), g);
                g.U(false);
                g.s(-3686930);
                boolean H = g.H(bVar2);
                Object e03 = g.e0();
                if (H || e03 == c0550a) {
                    e03 = new d(bVar2);
                    g.K0(e03);
                }
                g.U(false);
                int i6 = i2 >> 12;
                int i7 = ((i2 << 3) & 896) | 134217736 | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | ((i3 << 18) & 3670016);
                int i8 = i3 << 15;
                int i9 = i7 | (29360128 & i8) | (i8 & 1879048192);
                int i10 = i3 >> 15;
                b(hVar, (com.amazon.aps.iva.xb0.a) e03, aVar2, z12, z19, z18, n0Var3, z16, mVar2, bVar, dVar, z17, map2, g, i9, (i10 & 112) | (i10 & 14) | AdRequest.MAX_CONTENT_URL_LENGTH, 0);
                j2 X = g.X();
                if (X == null) {
                    return;
                }
                X.d = new e(hVar, aVar2, z10, z11, jVar2, f4, i5, z12, z19, z18, n0Var3, z15, z16, mVar2, bVar, dVar, z17, map2, i2, i3, i4);
                return;
            }
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f2 + '.').toString());
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Iterations must be a positive number (", i5, ").").toString());
    }

    public static final void b(com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.xb0.a<Float> aVar, com.amazon.aps.iva.a1.f fVar, boolean z, boolean z2, boolean z3, n0 n0Var, boolean z4, m mVar, com.amazon.aps.iva.a1.a aVar2, com.amazon.aps.iva.s1.f fVar2, boolean z5, Map<String, ? extends Typeface> map, com.amazon.aps.iva.o0.i iVar, int i, int i2, int i3) {
        com.amazon.aps.iva.o0.j jVar;
        com.amazon.aps.iva.yb0.j.f(aVar, "progress");
        com.amazon.aps.iva.o0.j g = iVar.g(185150686);
        f.a aVar3 = (i3 & 4) != 0 ? f.a.c : fVar;
        boolean z6 = (i3 & 8) != 0 ? false : z;
        boolean z7 = (i3 & 16) != 0 ? false : z2;
        boolean z8 = (i3 & 32) != 0 ? false : z3;
        n0 n0Var2 = (i3 & 64) != 0 ? n0.AUTOMATIC : n0Var;
        boolean z9 = (i3 & 128) != 0 ? false : z4;
        m mVar2 = (i3 & 256) != 0 ? null : mVar;
        com.amazon.aps.iva.a1.b bVar = (i3 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? a.C0097a.e : aVar2;
        f.a.d dVar = (i3 & 1024) != 0 ? f.a.b : fVar2;
        boolean z10 = (i3 & 2048) != 0 ? true : z5;
        Map<String, ? extends Typeface> map2 = (i3 & 4096) != 0 ? null : map;
        g.s(-3687241);
        Object e0 = g.e0();
        i.a.C0550a c0550a = i.a.a;
        if (e0 == c0550a) {
            e0 = new d0();
            g.K0(e0);
        }
        g.U(false);
        d0 d0Var = (d0) e0;
        g.s(-3687241);
        Object e02 = g.e0();
        if (e02 == c0550a) {
            e02 = new Matrix();
            g.K0(e02);
        }
        g.U(false);
        Matrix matrix = (Matrix) e02;
        g.s(-3687241);
        Object e03 = g.e0();
        if (e03 == c0550a) {
            e03 = com.amazon.aps.iva.cq.b.c0(null);
            g.K0(e03);
        }
        g.U(false);
        q1 q1Var = (q1) e03;
        g.s(185151463);
        if (hVar != null) {
            if (!(hVar.b() == 0.0f)) {
                g.U(false);
                float c2 = com.amazon.aps.iva.ma.g.c();
                com.amazon.aps.iva.a1.f fVar3 = aVar3;
                com.amazon.aps.iva.a0.q.a(androidx.compose.foundation.layout.e.k(aVar3, hVar.j.width() / c2, hVar.j.height() / c2), new b(hVar, dVar, bVar, matrix, d0Var, z8, n0Var2, map2, mVar2, z6, z7, z9, z10, aVar, q1Var), g, 0);
                j2 X = g.X();
                if (X == null) {
                    return;
                }
                X.d = new c(hVar, aVar, fVar3, z6, z7, z8, n0Var2, z9, mVar2, bVar, dVar, z10, map2, i, i2, i3);
                return;
            }
        }
        com.amazon.aps.iva.a1.f fVar4 = aVar3;
        g.U(false);
        j2 X2 = g.X();
        if (X2 == null) {
            jVar = g;
        } else {
            jVar = g;
            X2.d = new a(hVar, aVar, fVar4, z6, z7, z8, n0Var2, z9, mVar2, bVar, dVar, z10, map2, i, i2, i3);
        }
        com.amazon.aps.iva.d0.f.a(fVar4, jVar, (i >> 6) & 14);
    }
}
