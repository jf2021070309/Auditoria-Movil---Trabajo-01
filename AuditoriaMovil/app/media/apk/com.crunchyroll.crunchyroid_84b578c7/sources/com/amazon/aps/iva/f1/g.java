package com.amazon.aps.iva.f1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
/* compiled from: AndroidCanvas.android.kt */
/* loaded from: classes.dex */
public final class g implements u {
    public Canvas a = h.a;
    public final Rect b = new Rect();
    public final Rect c = new Rect();

    @Override // com.amazon.aps.iva.f1.u
    public final void a(long j, long j2, l0 l0Var) {
        this.a.drawLine(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j), com.amazon.aps.iva.e1.c.c(j2), com.amazon.aps.iva.e1.c.d(j2), l0Var.i());
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void b(i0 i0Var, long j, long j2, long j3, long j4, l0 l0Var) {
        com.amazon.aps.iva.yb0.j.f(i0Var, "image");
        Canvas canvas = this.a;
        Bitmap a = j.a(i0Var);
        int i = com.amazon.aps.iva.o2.h.c;
        int i2 = (int) (j >> 32);
        Rect rect = this.b;
        rect.left = i2;
        rect.top = com.amazon.aps.iva.o2.h.b(j);
        rect.right = i2 + ((int) (j2 >> 32));
        rect.bottom = com.amazon.aps.iva.o2.j.b(j2) + com.amazon.aps.iva.o2.h.b(j);
        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        int i3 = (int) (j3 >> 32);
        Rect rect2 = this.c;
        rect2.left = i3;
        rect2.top = com.amazon.aps.iva.o2.h.b(j3);
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = com.amazon.aps.iva.o2.j.b(j4) + com.amazon.aps.iva.o2.h.b(j3);
        canvas.drawBitmap(a, rect, rect2, l0Var.i());
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void d() {
        this.a.scale(-1.0f, 1.0f);
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void e(float f, float f2, float f3, float f4, int i) {
        boolean z;
        Region.Op op;
        Canvas canvas = this.a;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void f(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void g() {
        this.a.restore();
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void h(m0 m0Var, int i) {
        boolean z;
        Region.Op op;
        com.amazon.aps.iva.yb0.j.f(m0Var, "path");
        Canvas canvas = this.a;
        if (m0Var instanceof m) {
            m mVar = (m) m0Var;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                op = Region.Op.DIFFERENCE;
            } else {
                op = Region.Op.INTERSECT;
            }
            canvas.clipPath(mVar.a, op);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void j() {
        v.a(this.a, true);
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void k(i0 i0Var, long j, l0 l0Var) {
        com.amazon.aps.iva.yb0.j.f(i0Var, "image");
        this.a.drawBitmap(j.a(i0Var), com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j), l0Var.i());
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void l(com.amazon.aps.iva.e1.e eVar, l0 l0Var) {
        com.amazon.aps.iva.yb0.j.f(l0Var, "paint");
        this.a.saveLayer(eVar.a, eVar.b, eVar.c, eVar.d, l0Var.i(), 31);
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void m(m0 m0Var, l0 l0Var) {
        com.amazon.aps.iva.yb0.j.f(m0Var, "path");
        Canvas canvas = this.a;
        if (m0Var instanceof m) {
            canvas.drawPath(((m) m0Var).a, l0Var.i());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void n() {
        this.a.save();
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void o() {
        v.a(this.a, false);
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void p(float f, float f2, float f3, float f4, float f5, float f6, l0 l0Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, l0Var.i());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    @Override // com.amazon.aps.iva.f1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(float[] r24) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f1.g.q(float[]):void");
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void s() {
        this.a.rotate(45.0f);
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, l0 l0Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, l0Var.i());
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void u(float f, long j, l0 l0Var) {
        this.a.drawCircle(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j), f, l0Var.i());
    }

    @Override // com.amazon.aps.iva.f1.u
    public final void v(float f, float f2, float f3, float f4, l0 l0Var) {
        com.amazon.aps.iva.yb0.j.f(l0Var, "paint");
        this.a.drawRect(f, f2, f3, f4, l0Var.i());
    }

    public final Canvas w() {
        return this.a;
    }

    public final void x(Canvas canvas) {
        com.amazon.aps.iva.yb0.j.f(canvas, "<set-?>");
        this.a = canvas;
    }
}
