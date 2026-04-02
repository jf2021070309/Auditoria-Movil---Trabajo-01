package com.amazon.aps.iva.ba;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.h0;
/* compiled from: GradientStrokeContent.java */
/* loaded from: classes.dex */
public final class h extends a {
    public final com.amazon.aps.iva.ca.k A;
    public com.amazon.aps.iva.ca.r B;
    public final String r;
    public final boolean s;
    public final com.amazon.aps.iva.x.f<LinearGradient> t;
    public final com.amazon.aps.iva.x.f<RadialGradient> u;
    public final RectF v;
    public final com.amazon.aps.iva.ha.f w;
    public final int x;
    public final com.amazon.aps.iva.ca.e y;
    public final com.amazon.aps.iva.ca.k z;

    public h(d0 d0Var, com.amazon.aps.iva.ia.b bVar, com.amazon.aps.iva.ha.e eVar) {
        super(d0Var, bVar, eVar.h.toPaintCap(), eVar.i.toPaintJoin(), eVar.j, eVar.d, eVar.g, eVar.k, eVar.l);
        this.t = new com.amazon.aps.iva.x.f<>();
        this.u = new com.amazon.aps.iva.x.f<>();
        this.v = new RectF();
        this.r = eVar.a;
        this.w = eVar.b;
        this.s = eVar.m;
        this.x = (int) (d0Var.b.b() / 32.0f);
        com.amazon.aps.iva.ca.a<com.amazon.aps.iva.ha.c, com.amazon.aps.iva.ha.c> d = eVar.c.d();
        this.y = (com.amazon.aps.iva.ca.e) d;
        d.a(this);
        bVar.g(d);
        com.amazon.aps.iva.ca.a<PointF, PointF> d2 = eVar.e.d();
        this.z = (com.amazon.aps.iva.ca.k) d2;
        d2.a(this);
        bVar.g(d2);
        com.amazon.aps.iva.ca.a<PointF, PointF> d3 = eVar.f.d();
        this.A = (com.amazon.aps.iva.ca.k) d3;
        d3.a(this);
        bVar.g(d3);
    }

    public final int[] g(int[] iArr) {
        com.amazon.aps.iva.ca.r rVar = this.B;
        if (rVar != null) {
            Integer[] numArr = (Integer[]) rVar.f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // com.amazon.aps.iva.ba.b
    public final String getName() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.ba.a, com.amazon.aps.iva.ba.d
    public final void h(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        float f;
        float f2;
        if (this.s) {
            return;
        }
        f(this.v, matrix, false);
        com.amazon.aps.iva.ha.f fVar = com.amazon.aps.iva.ha.f.LINEAR;
        com.amazon.aps.iva.ha.f fVar2 = this.w;
        com.amazon.aps.iva.ca.e eVar = this.y;
        com.amazon.aps.iva.ca.k kVar = this.A;
        com.amazon.aps.iva.ca.k kVar2 = this.z;
        if (fVar2 == fVar) {
            long j = j();
            com.amazon.aps.iva.x.f<LinearGradient> fVar3 = this.t;
            shader = (LinearGradient) fVar3.d(j, null);
            if (shader == null) {
                PointF f3 = kVar2.f();
                PointF f4 = kVar.f();
                com.amazon.aps.iva.ha.c f5 = eVar.f();
                shader = new LinearGradient(f3.x, f3.y, f4.x, f4.y, g(f5.b), f5.a, Shader.TileMode.CLAMP);
                fVar3.f(j, shader);
            }
        } else {
            long j2 = j();
            com.amazon.aps.iva.x.f<RadialGradient> fVar4 = this.u;
            shader = (RadialGradient) fVar4.d(j2, null);
            if (shader == null) {
                PointF f6 = kVar2.f();
                PointF f7 = kVar.f();
                com.amazon.aps.iva.ha.c f8 = eVar.f();
                int[] g = g(f8.b);
                float[] fArr = f8.a;
                shader = new RadialGradient(f6.x, f6.y, (float) Math.hypot(f7.x - f, f7.y - f2), g, fArr, Shader.TileMode.CLAMP);
                fVar4.f(j2, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.i.setShader(shader);
        super.h(canvas, matrix, i);
    }

    @Override // com.amazon.aps.iva.ba.a, com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        super.i(cVar, obj);
        if (obj == h0.L) {
            com.amazon.aps.iva.ca.r rVar = this.B;
            com.amazon.aps.iva.ia.b bVar = this.f;
            if (rVar != null) {
                bVar.q(rVar);
            }
            if (cVar == null) {
                this.B = null;
                return;
            }
            com.amazon.aps.iva.ca.r rVar2 = new com.amazon.aps.iva.ca.r(cVar, null);
            this.B = rVar2;
            rVar2.a(this);
            bVar.g(this.B);
        }
    }

    public final int j() {
        int i;
        float f = this.z.d;
        float f2 = this.x;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.A.d * f2);
        int round3 = Math.round(this.y.d * f2);
        if (round != 0) {
            i = round * 527;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }
}
