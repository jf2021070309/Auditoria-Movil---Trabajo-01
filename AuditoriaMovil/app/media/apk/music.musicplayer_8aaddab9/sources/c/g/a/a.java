package c.g.a;

import c.g.a.b;
import java.util.Arrays;
/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: b  reason: collision with root package name */
    public final b f1669b;

    /* renamed from: c  reason: collision with root package name */
    public final c f1670c;
    public int a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f1671d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f1672e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f1673f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f1674g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f1675h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f1676i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1677j = false;

    public a(b bVar, c cVar) {
        this.f1669b = bVar;
        this.f1670c = cVar;
    }

    @Override // c.g.a.b.a
    public int a() {
        return this.a;
    }

    @Override // c.g.a.b.a
    public boolean b(g gVar) {
        int i2 = this.f1675h;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (this.f1672e[i2] == gVar.f1706c) {
                return true;
            }
            i2 = this.f1673f[i2];
        }
        return false;
    }

    @Override // c.g.a.b.a
    public float c(b bVar, boolean z) {
        float j2 = j(bVar.a);
        i(bVar.a, z);
        b.a aVar = bVar.f1680d;
        int a = aVar.a();
        for (int i2 = 0; i2 < a; i2++) {
            g e2 = aVar.e(i2);
            f(e2, aVar.j(e2) * j2, z);
        }
        return j2;
    }

    @Override // c.g.a.b.a
    public final void clear() {
        int i2 = this.f1675h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            g gVar = this.f1670c.f1684d[this.f1672e[i2]];
            if (gVar != null) {
                gVar.b(this.f1669b);
            }
            i2 = this.f1673f[i2];
        }
        this.f1675h = -1;
        this.f1676i = -1;
        this.f1677j = false;
        this.a = 0;
    }

    @Override // c.g.a.b.a
    public final void d(g gVar, float f2) {
        if (f2 == 0.0f) {
            i(gVar, true);
            return;
        }
        int i2 = this.f1675h;
        if (i2 == -1) {
            this.f1675h = 0;
            this.f1674g[0] = f2;
            this.f1672e[0] = gVar.f1706c;
            this.f1673f[0] = -1;
            gVar.f1716m++;
            gVar.a(this.f1669b);
            this.a++;
            if (this.f1677j) {
                return;
            }
            int i3 = this.f1676i + 1;
            this.f1676i = i3;
            int[] iArr = this.f1672e;
            if (i3 >= iArr.length) {
                this.f1677j = true;
                this.f1676i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.a; i5++) {
            int[] iArr2 = this.f1672e;
            int i6 = iArr2[i2];
            int i7 = gVar.f1706c;
            if (i6 == i7) {
                this.f1674g[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i4 = i2;
            }
            i2 = this.f1673f[i2];
        }
        int i8 = this.f1676i;
        int i9 = i8 + 1;
        if (this.f1677j) {
            int[] iArr3 = this.f1672e;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f1672e;
        if (i8 >= iArr4.length && this.a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f1672e;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f1672e;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.f1671d * 2;
            this.f1671d = i11;
            this.f1677j = false;
            this.f1676i = i8 - 1;
            this.f1674g = Arrays.copyOf(this.f1674g, i11);
            this.f1672e = Arrays.copyOf(this.f1672e, this.f1671d);
            this.f1673f = Arrays.copyOf(this.f1673f, this.f1671d);
        }
        this.f1672e[i8] = gVar.f1706c;
        this.f1674g[i8] = f2;
        if (i4 != -1) {
            int[] iArr7 = this.f1673f;
            iArr7[i8] = iArr7[i4];
            iArr7[i4] = i8;
        } else {
            this.f1673f[i8] = this.f1675h;
            this.f1675h = i8;
        }
        gVar.f1716m++;
        gVar.a(this.f1669b);
        int i12 = this.a + 1;
        this.a = i12;
        if (!this.f1677j) {
            this.f1676i++;
        }
        int[] iArr8 = this.f1672e;
        if (i12 >= iArr8.length) {
            this.f1677j = true;
        }
        if (this.f1676i >= iArr8.length) {
            this.f1677j = true;
            this.f1676i = iArr8.length - 1;
        }
    }

    @Override // c.g.a.b.a
    public g e(int i2) {
        int i3 = this.f1675h;
        for (int i4 = 0; i3 != -1 && i4 < this.a; i4++) {
            if (i4 == i2) {
                return this.f1670c.f1684d[this.f1672e[i3]];
            }
            i3 = this.f1673f[i3];
        }
        return null;
    }

    @Override // c.g.a.b.a
    public void f(g gVar, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.f1675h;
            if (i2 == -1) {
                this.f1675h = 0;
                this.f1674g[0] = f2;
                this.f1672e[0] = gVar.f1706c;
                this.f1673f[0] = -1;
                gVar.f1716m++;
                gVar.a(this.f1669b);
                this.a++;
                if (this.f1677j) {
                    return;
                }
                int i3 = this.f1676i + 1;
                this.f1676i = i3;
                int[] iArr = this.f1672e;
                if (i3 >= iArr.length) {
                    this.f1677j = true;
                    this.f1676i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.a; i5++) {
                int[] iArr2 = this.f1672e;
                int i6 = iArr2[i2];
                int i7 = gVar.f1706c;
                if (i6 == i7) {
                    float[] fArr = this.f1674g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.f1675h) {
                            this.f1675h = this.f1673f[i2];
                        } else {
                            int[] iArr3 = this.f1673f;
                            iArr3[i4] = iArr3[i2];
                        }
                        if (z) {
                            gVar.b(this.f1669b);
                        }
                        if (this.f1677j) {
                            this.f1676i = i2;
                        }
                        gVar.f1716m--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i4 = i2;
                }
                i2 = this.f1673f[i2];
            }
            int i8 = this.f1676i;
            int i9 = i8 + 1;
            if (this.f1677j) {
                int[] iArr4 = this.f1672e;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f1672e;
            if (i8 >= iArr5.length && this.a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f1672e;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f1672e;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.f1671d * 2;
                this.f1671d = i11;
                this.f1677j = false;
                this.f1676i = i8 - 1;
                this.f1674g = Arrays.copyOf(this.f1674g, i11);
                this.f1672e = Arrays.copyOf(this.f1672e, this.f1671d);
                this.f1673f = Arrays.copyOf(this.f1673f, this.f1671d);
            }
            this.f1672e[i8] = gVar.f1706c;
            this.f1674g[i8] = f2;
            if (i4 != -1) {
                int[] iArr8 = this.f1673f;
                iArr8[i8] = iArr8[i4];
                iArr8[i4] = i8;
            } else {
                this.f1673f[i8] = this.f1675h;
                this.f1675h = i8;
            }
            gVar.f1716m++;
            gVar.a(this.f1669b);
            this.a++;
            if (!this.f1677j) {
                this.f1676i++;
            }
            int i12 = this.f1676i;
            int[] iArr9 = this.f1672e;
            if (i12 >= iArr9.length) {
                this.f1677j = true;
                this.f1676i = iArr9.length - 1;
            }
        }
    }

    @Override // c.g.a.b.a
    public void g() {
        int i2 = this.f1675h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            float[] fArr = this.f1674g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f1673f[i2];
        }
    }

    @Override // c.g.a.b.a
    public float h(int i2) {
        int i3 = this.f1675h;
        for (int i4 = 0; i3 != -1 && i4 < this.a; i4++) {
            if (i4 == i2) {
                return this.f1674g[i3];
            }
            i3 = this.f1673f[i3];
        }
        return 0.0f;
    }

    @Override // c.g.a.b.a
    public final float i(g gVar, boolean z) {
        int i2 = this.f1675h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.f1672e[i2] == gVar.f1706c) {
                if (i2 == this.f1675h) {
                    this.f1675h = this.f1673f[i2];
                } else {
                    int[] iArr = this.f1673f;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    gVar.b(this.f1669b);
                }
                gVar.f1716m--;
                this.a--;
                this.f1672e[i2] = -1;
                if (this.f1677j) {
                    this.f1676i = i2;
                }
                return this.f1674g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f1673f[i2];
        }
        return 0.0f;
    }

    @Override // c.g.a.b.a
    public final float j(g gVar) {
        int i2 = this.f1675h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (this.f1672e[i2] == gVar.f1706c) {
                return this.f1674g[i2];
            }
            i2 = this.f1673f[i2];
        }
        return 0.0f;
    }

    @Override // c.g.a.b.a
    public void k(float f2) {
        int i2 = this.f1675h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            float[] fArr = this.f1674g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f1673f[i2];
        }
    }

    public String toString() {
        int i2 = this.f1675h;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            StringBuilder y = e.a.d.a.a.y(e.a.d.a.a.k(str, " -> "));
            y.append(this.f1674g[i2]);
            y.append(" : ");
            StringBuilder y2 = e.a.d.a.a.y(y.toString());
            y2.append(this.f1670c.f1684d[this.f1672e[i2]]);
            str = y2.toString();
            i2 = this.f1673f[i2];
        }
        return str;
    }
}
