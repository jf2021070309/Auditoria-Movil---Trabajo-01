package com.google.zxing.pdf417.decoder;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
/* loaded from: classes2.dex */
final class c {
    private BitMatrix a;
    private ResultPoint b;
    private ResultPoint c;
    private ResultPoint d;
    private ResultPoint e;
    private int f;
    private int g;
    private int h;
    private int i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        if ((resultPoint == null && resultPoint3 == null) || ((resultPoint2 == null && resultPoint4 == null) || ((resultPoint != null && resultPoint2 == null) || (resultPoint3 != null && resultPoint4 == null)))) {
            throw NotFoundException.getNotFoundInstance();
        }
        a(bitMatrix, resultPoint, resultPoint2, resultPoint3, resultPoint4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(c cVar) {
        a(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e);
    }

    private void a(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        this.a = bitMatrix;
        this.b = resultPoint;
        this.c = resultPoint2;
        this.d = resultPoint3;
        this.e = resultPoint4;
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(c cVar, c cVar2) {
        if (cVar == null) {
            return cVar2;
        }
        return cVar2 == null ? cVar : new c(cVar.a, cVar.b, cVar.c, cVar2.d, cVar2.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c a(int i, int i2, boolean z) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3 = this.b;
        ResultPoint resultPoint4 = this.c;
        ResultPoint resultPoint5 = this.d;
        ResultPoint resultPoint6 = this.e;
        if (i > 0) {
            ResultPoint resultPoint7 = z ? this.b : this.d;
            int y = ((int) resultPoint7.getY()) - i;
            if (y < 0) {
                y = 0;
            }
            resultPoint = new ResultPoint(resultPoint7.getX(), y);
            if (!z) {
                resultPoint5 = resultPoint;
                resultPoint = resultPoint3;
            }
        } else {
            resultPoint = resultPoint3;
        }
        if (i2 > 0) {
            ResultPoint resultPoint8 = z ? this.c : this.e;
            int y2 = ((int) resultPoint8.getY()) + i2;
            if (y2 >= this.a.getHeight()) {
                y2 = this.a.getHeight() - 1;
            }
            resultPoint2 = new ResultPoint(resultPoint8.getX(), y2);
            if (!z) {
                resultPoint6 = resultPoint2;
                resultPoint2 = resultPoint4;
            }
        } else {
            resultPoint2 = resultPoint4;
        }
        i();
        return new c(this.a, resultPoint, resultPoint2, resultPoint5, resultPoint6);
    }

    private void i() {
        if (this.b == null) {
            this.b = new ResultPoint(0.0f, this.d.getY());
            this.c = new ResultPoint(0.0f, this.e.getY());
        } else if (this.d == null) {
            this.d = new ResultPoint(this.a.getWidth() - 1, this.b.getY());
            this.e = new ResultPoint(this.a.getWidth() - 1, this.c.getY());
        }
        this.f = (int) Math.min(this.b.getX(), this.c.getX());
        this.g = (int) Math.max(this.d.getX(), this.e.getX());
        this.h = (int) Math.min(this.b.getY(), this.d.getY());
        this.i = (int) Math.max(this.c.getY(), this.e.getY());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResultPoint e() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResultPoint f() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResultPoint g() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResultPoint h() {
        return this.e;
    }
}
