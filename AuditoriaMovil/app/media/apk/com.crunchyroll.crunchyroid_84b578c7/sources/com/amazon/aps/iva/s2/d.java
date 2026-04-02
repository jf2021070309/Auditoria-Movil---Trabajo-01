package com.amazon.aps.iva.s2;

import com.amazon.aps.iva.s2.h;
import java.util.Arrays;
/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public final class d {
    public static boolean p = false;
    public static int q = 1000;
    public final g c;
    public b[] f;
    public final c l;
    public b o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public h[] m = new h[q];
    public int n = 0;

    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public interface a {
        h a(boolean[] zArr);
    }

    public d() {
        this.f = null;
        this.f = new b[32];
        for (int i = 0; i < this.j; i++) {
            b[] bVarArr = this.f;
            b bVar = bVarArr[i];
            if (bVar != null) {
                f fVar = this.l.a;
                int i2 = fVar.b;
                Object[] objArr = fVar.a;
                if (i2 < objArr.length) {
                    objArr[i2] = bVar;
                    fVar.b = i2 + 1;
                }
            }
            bVarArr[i] = null;
        }
        c cVar = new c();
        this.l = cVar;
        this.c = new g(cVar);
        this.o = new b(cVar);
    }

    public static int n(com.amazon.aps.iva.u2.d dVar) {
        h hVar = dVar.i;
        if (hVar != null) {
            return (int) (hVar.f + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final h a(h.a aVar) {
        f fVar = this.l.b;
        int i = fVar.b;
        h hVar = null;
        if (i > 0) {
            int i2 = i - 1;
            ?? r3 = fVar.a;
            ?? r4 = r3[i2];
            r3[i2] = 0;
            fVar.b = i2;
            hVar = r4;
        }
        h hVar2 = hVar;
        if (hVar2 == null) {
            hVar2 = new h(aVar);
            hVar2.j = aVar;
        } else {
            hVar2.c();
            hVar2.j = aVar;
        }
        int i3 = this.n;
        int i4 = q;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            q = i5;
            this.m = (h[]) Arrays.copyOf(this.m, i5);
        }
        h[] hVarArr = this.m;
        int i6 = this.n;
        this.n = i6 + 1;
        hVarArr[i6] = hVar2;
        return hVar2;
    }

    public final void b(h hVar, h hVar2, int i, float f, h hVar3, h hVar4, int i2, int i3) {
        b l = l();
        if (hVar2 == hVar3) {
            l.d.i(hVar, 1.0f);
            l.d.i(hVar4, 1.0f);
            l.d.i(hVar2, -2.0f);
        } else if (f == 0.5f) {
            l.d.i(hVar, 1.0f);
            l.d.i(hVar2, -1.0f);
            l.d.i(hVar3, -1.0f);
            l.d.i(hVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                l.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            l.d.i(hVar, -1.0f);
            l.d.i(hVar2, 1.0f);
            l.b = i;
        } else if (f >= 1.0f) {
            l.d.i(hVar4, -1.0f);
            l.d.i(hVar3, 1.0f);
            l.b = -i2;
        } else {
            float f2 = 1.0f - f;
            l.d.i(hVar, f2 * 1.0f);
            l.d.i(hVar2, f2 * (-1.0f));
            l.d.i(hVar3, (-1.0f) * f);
            l.d.i(hVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                l.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            l.b(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
        if (r4.m <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c3, code lost:
        if (r4.m <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c6, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e1, code lost:
        if (r4.m <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ea, code lost:
        if (r4.m <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ed, code lost:
        r14 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.amazon.aps.iva.s2.b r17) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s2.d.c(com.amazon.aps.iva.s2.b):void");
    }

    public final void d(h hVar, int i) {
        int i2 = hVar.d;
        if (i2 == -1) {
            hVar.f(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                h hVar2 = this.l.c[i3];
            }
        } else if (i2 != -1) {
            b bVar = this.f[i2];
            if (bVar.e) {
                bVar.b = i;
            } else if (bVar.d.f() == 0) {
                bVar.e = true;
                bVar.b = i;
            } else {
                b l = l();
                if (i < 0) {
                    l.b = i * (-1);
                    l.d.i(hVar, 1.0f);
                } else {
                    l.b = i;
                    l.d.i(hVar, -1.0f);
                }
                c(l);
            }
        } else {
            b l2 = l();
            l2.a = hVar;
            float f = i;
            hVar.f = f;
            l2.b = f;
            l2.e = true;
            c(l2);
        }
    }

    public final void e(h hVar, h hVar2, int i, int i2) {
        if (i2 == 8 && hVar2.g && hVar.d == -1) {
            hVar.f(this, hVar2.f + i);
            return;
        }
        b l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        if (!z) {
            l.d.i(hVar, -1.0f);
            l.d.i(hVar2, 1.0f);
        } else {
            l.d.i(hVar, 1.0f);
            l.d.i(hVar2, -1.0f);
        }
        if (i2 != 8) {
            l.b(this, i2);
        }
        c(l);
    }

    public final void f(h hVar, h hVar2, int i, int i2) {
        b l = l();
        h m = m();
        m.e = 0;
        l.c(hVar, hVar2, m, i);
        if (i2 != 8) {
            l.d.i(j(i2), (int) (l.d.g(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(h hVar, h hVar2, int i, int i2) {
        b l = l();
        h m = m();
        m.e = 0;
        l.d(hVar, hVar2, m, i);
        if (i2 != 8) {
            l.d.i(j(i2), (int) (l.d.g(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(b bVar) {
        int i;
        if (bVar.e) {
            bVar.a.f(this, bVar.b);
        } else {
            b[] bVarArr = this.f;
            int i2 = this.j;
            bVarArr[i2] = bVar;
            h hVar = bVar.a;
            hVar.d = i2;
            this.j = i2 + 1;
            hVar.h(this, bVar);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f[i3];
                if (bVar2 != null && bVar2.e) {
                    bVar2.a.f(this, bVar2.b);
                    f fVar = this.l.a;
                    int i4 = fVar.b;
                    Object[] objArr = fVar.a;
                    if (i4 < objArr.length) {
                        objArr[i4] = bVar2;
                        fVar.b = i4 + 1;
                    }
                    this.f[i3] = null;
                    int i5 = i3 + 1;
                    int i6 = i5;
                    while (true) {
                        i = this.j;
                        if (i5 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f;
                        int i7 = i5 - 1;
                        b bVar3 = bVarArr2[i5];
                        bVarArr2[i7] = bVar3;
                        h hVar2 = bVar3.a;
                        if (hVar2.d == i5) {
                            hVar2.d = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i) {
                        this.f[i6] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            b bVar = this.f[i];
            bVar.a.f = bVar.b;
        }
    }

    public final h j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        h a2 = a(h.a.ERROR);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        a2.c = i2;
        a2.e = i;
        this.l.c[i2] = a2;
        g gVar = this.c;
        gVar.i.a = a2;
        float[] fArr = a2.i;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.e] = 1.0f;
        gVar.j(a2);
        return a2;
    }

    public final h k(Object obj) {
        h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (obj instanceof com.amazon.aps.iva.u2.d) {
            com.amazon.aps.iva.u2.d dVar = (com.amazon.aps.iva.u2.d) obj;
            hVar = dVar.i;
            if (hVar == null) {
                dVar.k();
                hVar = dVar.i;
            }
            int i = hVar.c;
            c cVar = this.l;
            if (i == -1 || i > this.b || cVar.c[i] == null) {
                if (i != -1) {
                    hVar.c();
                }
                int i2 = this.b + 1;
                this.b = i2;
                this.i++;
                hVar.c = i2;
                hVar.j = h.a.UNRESTRICTED;
                cVar.c[i2] = hVar;
            }
        }
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final b l() {
        b bVar;
        c cVar = this.l;
        f fVar = cVar.a;
        int i = fVar.b;
        if (i > 0) {
            int i2 = i - 1;
            ?? r4 = fVar.a;
            ?? r5 = r4[i2];
            r4[i2] = 0;
            fVar.b = i2;
            bVar = r5;
        } else {
            bVar = null;
        }
        b bVar2 = bVar;
        if (bVar2 == null) {
            return new b(cVar);
        }
        bVar2.a = null;
        bVar2.d.clear();
        bVar2.b = 0.0f;
        bVar2.e = false;
        return bVar2;
    }

    public final h m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        h a2 = a(h.a.SLACK);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        a2.c = i;
        this.l.c[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (b[]) Arrays.copyOf(this.f, i);
        c cVar = this.l;
        cVar.c = (h[]) Arrays.copyOf(cVar.c, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() throws Exception {
        g gVar = this.c;
        if (gVar.e()) {
            i();
        } else if (this.g) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < this.j) {
                    if (!this.f[i].e) {
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                q(gVar);
            } else {
                i();
            }
        } else {
            q(gVar);
        }
    }

    public final void q(g gVar) throws Exception {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 < this.j) {
                b bVar = this.f[i2];
                if (bVar.a.j != h.a.UNRESTRICTED && bVar.b < 0.0f) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.j) {
                    b bVar2 = this.f[i6];
                    if (bVar2.a.j != h.a.UNRESTRICTED && !bVar2.e && bVar2.b < f) {
                        int f3 = bVar2.d.f();
                        int i8 = 0;
                        while (i8 < f3) {
                            h b = bVar2.d.b(i8);
                            float g = bVar2.d.g(b);
                            if (g > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f4 = b.h[i9] / g;
                                    if ((f4 < f2 && i9 == i7) || i9 > i7) {
                                        i5 = b.c;
                                        i7 = i9;
                                        f2 = f4;
                                        i4 = i6;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i6++;
                    f = 0.0f;
                }
                if (i4 != -1) {
                    b bVar3 = this.f[i4];
                    bVar3.a.d = -1;
                    bVar3.g(this.l.c[i5]);
                    h hVar = bVar3.a;
                    hVar.d = i4;
                    hVar.h(this, bVar3);
                } else {
                    z2 = true;
                }
                if (i3 > this.i / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        r(gVar);
        i();
    }

    public final void r(b bVar) {
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.i * 2) {
                return;
            }
            h hVar = bVar.a;
            if (hVar != null) {
                this.h[hVar.c] = true;
            }
            h a2 = bVar.a(this.h);
            if (a2 != null) {
                boolean[] zArr = this.h;
                int i3 = a2.c;
                if (zArr[i3]) {
                    return;
                }
                zArr[i3] = true;
            }
            if (a2 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.j; i5++) {
                    b bVar2 = this.f[i5];
                    if (bVar2.a.j != h.a.UNRESTRICTED && !bVar2.e && bVar2.d.j(a2)) {
                        float g = bVar2.d.g(a2);
                        if (g < 0.0f) {
                            float f2 = (-bVar2.b) / g;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    b bVar3 = this.f[i4];
                    bVar3.a.d = -1;
                    bVar3.g(a2);
                    h hVar2 = bVar3.a;
                    hVar2.d = i4;
                    hVar2.h(this, bVar3);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        c cVar;
        int i = 0;
        while (true) {
            cVar = this.l;
            h[] hVarArr = cVar.c;
            if (i >= hVarArr.length) {
                break;
            }
            h hVar = hVarArr[i];
            if (hVar != null) {
                hVar.c();
            }
            i++;
        }
        h[] hVarArr2 = this.m;
        int i2 = this.n;
        f fVar = cVar.b;
        fVar.getClass();
        if (i2 > hVarArr2.length) {
            i2 = hVarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            h hVar2 = hVarArr2[i3];
            int i4 = fVar.b;
            Object[] objArr = fVar.a;
            if (i4 < objArr.length) {
                objArr[i4] = hVar2;
                fVar.b = i4 + 1;
            }
        }
        this.n = 0;
        Arrays.fill(cVar.c, (Object) null);
        this.b = 0;
        g gVar = this.c;
        gVar.h = 0;
        gVar.b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.j; i5++) {
            b bVar = this.f[i5];
        }
        for (int i6 = 0; i6 < this.j; i6++) {
            b[] bVarArr = this.f;
            b bVar2 = bVarArr[i6];
            if (bVar2 != null) {
                f fVar2 = cVar.a;
                int i7 = fVar2.b;
                Object[] objArr2 = fVar2.a;
                if (i7 < objArr2.length) {
                    objArr2[i7] = bVar2;
                    fVar2.b = i7 + 1;
                }
            }
            bVarArr[i6] = null;
        }
        this.j = 0;
        this.o = new b(cVar);
    }
}
