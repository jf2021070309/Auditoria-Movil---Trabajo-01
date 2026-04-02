package com.amazon.aps.iva.f1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: AndroidPath.android.kt */
/* loaded from: classes.dex */
public final class m implements m0 {
    public final Path a;
    public final RectF b;
    public final float[] c;
    public final Matrix d;

    public m() {
        this(0);
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final boolean a() {
        return this.a.isConvex();
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void b(float f, float f2) {
        this.a.rMoveTo(f, f2);
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void close() {
        this.a.close();
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void d(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void e(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void f(int i) {
        Path.FillType fillType;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        this.a.setFillType(fillType);
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final int g() {
        if (this.a.getFillType() == Path.FillType.EVEN_ODD) {
            return 1;
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void h(com.amazon.aps.iva.e1.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "roundRect");
        RectF rectF = this.b;
        rectF.set(fVar.a, fVar.b, fVar.c, fVar.d);
        long j = fVar.e;
        float b = com.amazon.aps.iva.e1.a.b(j);
        float[] fArr = this.c;
        fArr[0] = b;
        fArr[1] = com.amazon.aps.iva.e1.a.c(j);
        long j2 = fVar.f;
        fArr[2] = com.amazon.aps.iva.e1.a.b(j2);
        fArr[3] = com.amazon.aps.iva.e1.a.c(j2);
        long j3 = fVar.g;
        fArr[4] = com.amazon.aps.iva.e1.a.b(j3);
        fArr[5] = com.amazon.aps.iva.e1.a.c(j3);
        long j4 = fVar.h;
        fArr[6] = com.amazon.aps.iva.e1.a.b(j4);
        fArr[7] = com.amazon.aps.iva.e1.a.c(j4);
        this.a.addRoundRect(rectF, fArr, Path.Direction.CCW);
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void i() {
        this.a.rewind();
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void j(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final boolean k(m0 m0Var, m0 m0Var2, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        Path.Op op;
        com.amazon.aps.iva.yb0.j.f(m0Var, "path1");
        boolean z4 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            op = Path.Op.DIFFERENCE;
        } else {
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                op = Path.Op.INTERSECT;
            } else {
                if (i == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else {
                    if (i == 2) {
                        z4 = true;
                    }
                    if (z4) {
                        op = Path.Op.UNION;
                    } else {
                        op = Path.Op.XOR;
                    }
                }
            }
        }
        if (m0Var instanceof m) {
            m mVar = (m) m0Var;
            if (m0Var2 instanceof m) {
                return this.a.op(mVar.a, ((m) m0Var2).a, op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void l(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void m(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void n(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void o(m0 m0Var, long j) {
        if (m0Var instanceof m) {
            this.a.addPath(((m) m0Var).a, com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void p(com.amazon.aps.iva.e1.e eVar) {
        float f = eVar.a;
        if (!Float.isNaN(f)) {
            float f2 = eVar.b;
            if (!Float.isNaN(f2)) {
                float f3 = eVar.c;
                if (!Float.isNaN(f3)) {
                    float f4 = eVar.d;
                    if (!Float.isNaN(f4)) {
                        RectF rectF = this.b;
                        rectF.set(f, f2, f3, f4);
                        this.a.addRect(rectF, Path.Direction.CCW);
                        return;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    public final boolean q() {
        return this.a.isEmpty();
    }

    public final void r(long j) {
        Matrix matrix = this.d;
        matrix.reset();
        matrix.setTranslate(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j));
        this.a.transform(matrix);
    }

    @Override // com.amazon.aps.iva.f1.m0
    public final void reset() {
        this.a.reset();
    }

    public m(Path path) {
        com.amazon.aps.iva.yb0.j.f(path, "internalPath");
        this.a = path;
        this.b = new RectF();
        this.c = new float[8];
        this.d = new Matrix();
    }

    public /* synthetic */ m(int i) {
        this(new Path());
    }
}
