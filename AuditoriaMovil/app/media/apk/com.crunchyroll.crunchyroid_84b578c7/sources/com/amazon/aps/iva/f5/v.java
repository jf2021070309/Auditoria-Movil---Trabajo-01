package com.amazon.aps.iva.f5;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.amazon.aps.iva.f5.e;
import com.amazon.aps.iva.f5.f;
/* compiled from: SingleRow.java */
/* loaded from: classes.dex */
public final class v extends e {
    public final e.a j = new e.a(0);

    public v() {
        m(1);
    }

    @Override // com.amazon.aps.iva.f5.e
    public final boolean a(int i, boolean z) {
        int i2;
        if (((f.b) this.b).c() == 0) {
            return false;
        }
        if (!z && b(i)) {
            return false;
        }
        int n = n();
        boolean z2 = false;
        while (n < ((f.b) this.b).c()) {
            Object[] objArr = this.a;
            int b = ((f.b) this.b).b(n, true, objArr, false);
            if (this.f >= 0 && this.g >= 0) {
                if (this.c) {
                    int i3 = n - 1;
                    i2 = (((f.b) this.b).d(i3) - ((f.b) this.b).e(i3)) - this.d;
                } else {
                    int i4 = n - 1;
                    i2 = this.d + ((f.b) this.b).e(i4) + ((f.b) this.b).d(i4);
                }
                this.g = n;
            } else {
                if (this.c) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
                this.f = n;
                this.g = n;
            }
            ((f.b) this.b).a(objArr[0], n, b, 0, i2);
            if (z || b(i)) {
                return true;
            }
            n++;
            z2 = true;
        }
        return z2;
    }

    @Override // com.amazon.aps.iva.f5.e
    public final void d(int i, int i2, RecyclerView.p.c cVar) {
        int o;
        int d;
        int i3;
        if (!this.c ? i2 < 0 : i2 > 0) {
            if (this.f == 0) {
                return;
            }
            o = o();
            d = ((f.b) this.b).d(this.f);
            i3 = this.c ? this.d : -this.d;
        } else if (this.g == ((f.b) this.b).c() - 1) {
            return;
        } else {
            o = n();
            d = ((f.b) this.b).e(this.g) + this.d;
            i3 = ((f.b) this.b).d(this.g);
            if (this.c) {
                d = -d;
            }
        }
        ((p.b) cVar).a(o, Math.abs((d + i3) - i));
    }

    @Override // com.amazon.aps.iva.f5.e
    public final int f(int[] iArr, int i, boolean z) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        if (this.c) {
            return ((f.b) this.b).d(i);
        }
        return ((f.b) this.b).d(i) + ((f.b) this.b).e(i);
    }

    @Override // com.amazon.aps.iva.f5.e
    public final int h(int[] iArr, int i, boolean z) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        if (this.c) {
            return ((f.b) this.b).d(i) - ((f.b) this.b).e(i);
        }
        return ((f.b) this.b).d(i);
    }

    @Override // com.amazon.aps.iva.f5.e
    public final com.amazon.aps.iva.x.d[] i(int i, int i2) {
        com.amazon.aps.iva.x.d dVar = this.h[0];
        dVar.c = dVar.b;
        dVar.a(i);
        this.h[0].a(i2);
        return this.h;
    }

    @Override // com.amazon.aps.iva.f5.e
    public final e.a j(int i) {
        return this.j;
    }

    @Override // com.amazon.aps.iva.f5.e
    public final boolean l(int i, boolean z) {
        int i2;
        if (((f.b) this.b).c() == 0) {
            return false;
        }
        if (!z && c(i)) {
            return false;
        }
        int i3 = f.this.f;
        boolean z2 = false;
        for (int o = o(); o >= i3; o--) {
            Object[] objArr = this.a;
            int b = ((f.b) this.b).b(o, false, objArr, false);
            if (this.f >= 0 && this.g >= 0) {
                if (this.c) {
                    i2 = ((f.b) this.b).d(o + 1) + this.d + b;
                } else {
                    i2 = (((f.b) this.b).d(o + 1) - this.d) - b;
                }
                this.f = o;
            } else {
                if (this.c) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                this.f = o;
                this.g = o;
            }
            ((f.b) this.b).a(objArr[0], o, b, 0, i2);
            z2 = true;
            if (z || c(i)) {
                break;
            }
        }
        return z2;
    }

    public final int n() {
        int i = this.g;
        if (i >= 0) {
            return i + 1;
        }
        int i2 = this.i;
        if (i2 != -1) {
            return Math.min(i2, ((f.b) this.b).c() - 1);
        }
        return 0;
    }

    public final int o() {
        int i = this.f;
        if (i >= 0) {
            return i - 1;
        }
        int i2 = this.i;
        if (i2 != -1) {
            return Math.min(i2, ((f.b) this.b).c() - 1);
        }
        return ((f.b) this.b).c() - 1;
    }
}
