package com.amazon.aps.iva.s2;

import com.amazon.aps.iva.s2.b;
import java.util.Arrays;
/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public final class a implements b.a {
    public final b b;
    public final c c;
    public int a = 0;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public a(b bVar, c cVar) {
        this.b = bVar;
        this.c = cVar;
    }

    @Override // com.amazon.aps.iva.s2.b.a
    public final float a(h hVar, boolean z) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.e[i] == hVar.c) {
                if (i == this.h) {
                    this.h = this.f[i];
                } else {
                    int[] iArr = this.f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    hVar.b(this.b);
                }
                hVar.m--;
                this.a--;
                this.e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.g[i];
            }
            i2++;
            i3 = i;
            i = this.f[i];
        }
        return 0.0f;
    }

    @Override // com.amazon.aps.iva.s2.b.a
    public final h b(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.c.c[this.e[i2]];
            }
            i2 = this.f[i2];
        }
        return null;
    }

    @Override // com.amazon.aps.iva.s2.b.a
    public final void c() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f[i];
        }
    }

    @Override // com.amazon.aps.iva.s2.b.a
    public final void clear() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            h hVar = this.c.c[this.e[i]];
            if (hVar != null) {
                hVar.b(this.b);
            }
            i = this.f[i];
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    @Override // com.amazon.aps.iva.s2.b.a
    public final float d(b bVar, boolean z) {
        float g = g(bVar.a);
        a(bVar.a, z);
        b.a aVar = bVar.d;
        int f = aVar.f();
        for (int i = 0; i < f; i++) {
            h b = aVar.b(i);
            e(b, aVar.g(b) * g, z);
        }
        return g;
    }

    @Override // com.amazon.aps.iva.s2.b.a
    public final void e(h hVar, float f, boolean z) {
        if (f > -0.001f && f < 0.001f) {
            return;
        }
        int i = this.h;
        b bVar = this.b;
        if (i == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = hVar.c;
            this.f[0] = -1;
            hVar.m++;
            hVar.a(bVar);
            this.a++;
            if (!this.j) {
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.e;
                if (i2 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.e[i];
            int i6 = hVar.c;
            if (i5 == i6) {
                float[] fArr = this.g;
                float f2 = fArr[i] + f;
                if (f2 > -0.001f && f2 < 0.001f) {
                    f2 = 0.0f;
                }
                fArr[i] = f2;
                if (f2 == 0.0f) {
                    if (i == this.h) {
                        this.h = this.f[i];
                    } else {
                        int[] iArr2 = this.f;
                        iArr2[i3] = iArr2[i];
                    }
                    if (z) {
                        hVar.b(bVar);
                    }
                    if (this.j) {
                        this.i = i;
                    }
                    hVar.m--;
                    this.a--;
                    return;
                }
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.j) {
            int[] iArr3 = this.e;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.e;
        if (i7 >= iArr4.length && this.a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.e;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.e;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.j = false;
            this.i = i7 - 1;
            this.g = Arrays.copyOf(this.g, i10);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[i7] = hVar.c;
        this.g[i7] = f;
        if (i3 != -1) {
            int[] iArr7 = this.f;
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            this.f[i7] = this.h;
            this.h = i7;
        }
        hVar.m++;
        hVar.a(bVar);
        this.a++;
        if (!this.j) {
            this.i++;
        }
        int i11 = this.i;
        int[] iArr8 = this.e;
        if (i11 >= iArr8.length) {
            this.j = true;
            this.i = iArr8.length - 1;
        }
    }

    @Override // com.amazon.aps.iva.s2.b.a
    public final int f() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.s2.b.a
    public final float g(h hVar) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.e[i] == hVar.c) {
                return this.g[i];
            }
            i = this.f[i];
        }
        return 0.0f;
    }

    @Override // com.amazon.aps.iva.s2.b.a
    public final float h(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.g[i2];
            }
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    @Override // com.amazon.aps.iva.s2.b.a
    public final void i(h hVar, float f) {
        if (f == 0.0f) {
            a(hVar, true);
            return;
        }
        int i = this.h;
        b bVar = this.b;
        if (i == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = hVar.c;
            this.f[0] = -1;
            hVar.m++;
            hVar.a(bVar);
            this.a++;
            if (!this.j) {
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.e;
                if (i2 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.e[i];
            int i6 = hVar.c;
            if (i5 == i6) {
                this.g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.j) {
            int[] iArr2 = this.e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.e;
        if (i7 >= iArr3.length && this.a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.j = false;
            this.i = i7 - 1;
            this.g = Arrays.copyOf(this.g, i10);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[i7] = hVar.c;
        this.g[i7] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f[i7] = this.h;
            this.h = i7;
        }
        hVar.m++;
        hVar.a(bVar);
        int i11 = this.a + 1;
        this.a = i11;
        if (!this.j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i11 >= iArr7.length) {
            this.j = true;
        }
        if (this.i >= iArr7.length) {
            this.j = true;
            this.i = iArr7.length - 1;
        }
    }

    @Override // com.amazon.aps.iva.s2.b.a
    public final boolean j(h hVar) {
        int i = this.h;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.e[i] == hVar.c) {
                return true;
            }
            i = this.f[i];
        }
        return false;
    }

    @Override // com.amazon.aps.iva.s2.b.a
    public final void k(float f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] / f;
            i = this.f[i];
        }
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            StringBuilder b = defpackage.c.b(com.amazon.aps.iva.c80.a.f(str, " -> "));
            b.append(this.g[i]);
            b.append(" : ");
            StringBuilder b2 = defpackage.c.b(b.toString());
            b2.append(this.c.c[this.e[i]]);
            str = b2.toString();
            i = this.f[i];
        }
        return str;
    }
}
