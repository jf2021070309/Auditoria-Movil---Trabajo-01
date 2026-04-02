package com.amazon.aps.iva.f1;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import com.amazon.aps.iva.f1.l;
/* compiled from: AndroidPaint.android.kt */
/* loaded from: classes.dex */
public final class k implements l0 {
    public final Paint a;
    public int b;
    public Shader c;
    public y d;

    public k(Paint paint) {
        com.amazon.aps.iva.yb0.j.f(paint, "internalPaint");
        this.a = paint;
        this.b = 3;
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final float a() {
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final long b() {
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        return defpackage.i.d(paint.getColor());
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final void c(int i) {
        boolean z;
        if (this.b == i) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.b = i;
            Paint paint = this.a;
            com.amazon.aps.iva.yb0.j.f(paint, "$this$setNativeBlendMode");
            if (Build.VERSION.SDK_INT >= 29) {
                c1.a.a(paint, i);
            } else {
                paint.setXfermode(new PorterDuffXfermode(f.b(i)));
            }
        }
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final y d() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final void e(int i) {
        boolean z;
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "$this$setNativeFilterQuality");
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        paint.setFilterBitmap(!z);
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final void f(long j) {
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "$this$setNativeColor");
        paint.setColor(defpackage.i.G(j));
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final void g(float f) {
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final int h() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final Paint i() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final void j(Shader shader) {
        this.c = shader;
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        paint.setShader(shader);
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final Shader k() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final void l(y yVar) {
        ColorFilter colorFilter;
        this.d = yVar;
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        if (yVar != null) {
            colorFilter = yVar.a;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    @Override // com.amazon.aps.iva.f1.l0
    public final int m() {
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        return paint.isFilterBitmap() ? 1 : 0;
    }

    public final int n() {
        int i;
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = l.a.a[strokeCap.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
        }
        return 0;
    }

    public final int o() {
        int i;
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = l.a.b[strokeJoin.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 1;
            }
        }
        return 0;
    }

    public final float p() {
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public final float q() {
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public final void r(com.amazon.aps.iva.cq.b bVar) {
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        paint.setPathEffect(null);
    }

    public final void s(int i) {
        boolean z;
        boolean z2;
        Paint.Cap cap;
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "$this$setNativeStrokeCap");
        boolean z3 = false;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cap = Paint.Cap.SQUARE;
        } else {
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                cap = Paint.Cap.ROUND;
            } else {
                if (i == 0) {
                    z3 = true;
                }
                if (z3) {
                    cap = Paint.Cap.BUTT;
                } else {
                    cap = Paint.Cap.BUTT;
                }
            }
        }
        paint.setStrokeCap(cap);
    }

    public final void t(int i) {
        boolean z;
        boolean z2;
        Paint.Join join;
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "$this$setNativeStrokeJoin");
        boolean z3 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            join = Paint.Join.MITER;
        } else {
            if (i == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                join = Paint.Join.BEVEL;
            } else {
                if (i == 1) {
                    z3 = true;
                }
                if (z3) {
                    join = Paint.Join.ROUND;
                } else {
                    join = Paint.Join.MITER;
                }
            }
        }
        paint.setStrokeJoin(join);
    }

    public final void u(float f) {
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public final void v(float f) {
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    public final void w(int i) {
        Paint.Style style;
        Paint paint = this.a;
        com.amazon.aps.iva.yb0.j.f(paint, "$this$setNativeStyle");
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }
}
