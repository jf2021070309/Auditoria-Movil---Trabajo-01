package c.g.a;

import c.g.a.g;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class d {
    public static boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    public static int f1685b = 1000;

    /* renamed from: c  reason: collision with root package name */
    public static long f1686c;

    /* renamed from: f  reason: collision with root package name */
    public a f1689f;

    /* renamed from: i  reason: collision with root package name */
    public b[] f1692i;
    public final c o;
    public a r;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1687d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f1688e = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f1690g = 32;

    /* renamed from: h  reason: collision with root package name */
    public int f1691h = 32;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1693j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f1694k = new boolean[32];

    /* renamed from: l  reason: collision with root package name */
    public int f1695l = 1;

    /* renamed from: m  reason: collision with root package name */
    public int f1696m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f1697n = 32;
    public g[] p = new g[f1685b];
    public int q = 0;

    /* loaded from: classes.dex */
    public interface a {
        g a(d dVar, boolean[] zArr);

        void b(g gVar);

        void clear();

        boolean isEmpty();
    }

    public d() {
        this.f1692i = null;
        this.f1692i = new b[32];
        t();
        c cVar = new c();
        this.o = cVar;
        this.f1689f = new f(cVar);
        this.r = new b(cVar);
    }

    public final g a(g.a aVar, String str) {
        g a2 = this.o.f1683c.a();
        if (a2 == null) {
            a2 = new g(aVar);
            a2.f1713j = aVar;
        } else {
            a2.c();
            a2.f1713j = aVar;
        }
        int i2 = this.q;
        int i3 = f1685b;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f1685b = i4;
            this.p = (g[]) Arrays.copyOf(this.p, i4);
        }
        g[] gVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        gVarArr[i5] = a2;
        return a2;
    }

    public void b(g gVar, g gVar2, int i2, float f2, g gVar3, g gVar4, int i3, int i4) {
        b m2 = m();
        if (gVar2 == gVar3) {
            m2.f1680d.d(gVar, 1.0f);
            m2.f1680d.d(gVar4, 1.0f);
            m2.f1680d.d(gVar2, -2.0f);
        } else if (f2 == 0.5f) {
            m2.f1680d.d(gVar, 1.0f);
            m2.f1680d.d(gVar2, -1.0f);
            m2.f1680d.d(gVar3, -1.0f);
            m2.f1680d.d(gVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                m2.f1678b = (-i2) + i3;
            }
        } else if (f2 <= 0.0f) {
            m2.f1680d.d(gVar, -1.0f);
            m2.f1680d.d(gVar2, 1.0f);
            m2.f1678b = i2;
        } else if (f2 >= 1.0f) {
            m2.f1680d.d(gVar4, -1.0f);
            m2.f1680d.d(gVar3, 1.0f);
            m2.f1678b = -i3;
        } else {
            float f3 = 1.0f - f2;
            m2.f1680d.d(gVar, f3 * 1.0f);
            m2.f1680d.d(gVar2, f3 * (-1.0f));
            m2.f1680d.d(gVar3, (-1.0f) * f2);
            m2.f1680d.d(gVar4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                m2.f1678b = (i3 * f2) + ((-i2) * f3);
            }
        }
        if (i4 != 8) {
            m2.c(this, i4);
        }
        c(m2);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(c.g.a.b r17) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.a.d.c(c.g.a.b):void");
    }

    public b d(g gVar, g gVar2, int i2, int i3) {
        if (i3 == 8 && gVar2.f1710g && gVar.f1707d == -1) {
            gVar.d(this, gVar2.f1709f + i2);
            return null;
        }
        b m2 = m();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            m2.f1678b = i2;
        }
        if (z) {
            m2.f1680d.d(gVar, 1.0f);
            m2.f1680d.d(gVar2, -1.0f);
        } else {
            m2.f1680d.d(gVar, -1.0f);
            m2.f1680d.d(gVar2, 1.0f);
        }
        if (i3 != 8) {
            m2.c(this, i3);
        }
        c(m2);
        return m2;
    }

    public void e(g gVar, int i2) {
        int i3 = gVar.f1707d;
        if (i3 == -1) {
            gVar.d(this, i2);
            for (int i4 = 0; i4 < this.f1688e + 1; i4++) {
                g gVar2 = this.o.f1684d[i4];
            }
        } else if (i3 == -1) {
            b m2 = m();
            m2.a = gVar;
            float f2 = i2;
            gVar.f1709f = f2;
            m2.f1678b = f2;
            m2.f1681e = true;
            c(m2);
        } else {
            b bVar = this.f1692i[i3];
            if (bVar.f1681e) {
                bVar.f1678b = i2;
            } else if (bVar.f1680d.a() == 0) {
                bVar.f1681e = true;
                bVar.f1678b = i2;
            } else {
                b m3 = m();
                if (i2 < 0) {
                    m3.f1678b = i2 * (-1);
                    m3.f1680d.d(gVar, 1.0f);
                } else {
                    m3.f1678b = i2;
                    m3.f1680d.d(gVar, -1.0f);
                }
                c(m3);
            }
        }
    }

    public void f(g gVar, g gVar2, int i2, int i3) {
        b m2 = m();
        g n2 = n();
        n2.f1708e = 0;
        m2.e(gVar, gVar2, n2, i2);
        if (i3 != 8) {
            m2.f1680d.d(k(i3, null), (int) (m2.f1680d.j(n2) * (-1.0f)));
        }
        c(m2);
    }

    public void g(g gVar, g gVar2, int i2, int i3) {
        b m2 = m();
        g n2 = n();
        n2.f1708e = 0;
        m2.f(gVar, gVar2, n2, i2);
        if (i3 != 8) {
            m2.f1680d.d(k(i3, null), (int) (m2.f1680d.j(n2) * (-1.0f)));
        }
        c(m2);
    }

    public void h(g gVar, g gVar2, g gVar3, g gVar4, float f2, int i2) {
        b m2 = m();
        m2.d(gVar, gVar2, gVar3, gVar4, f2);
        if (i2 != 8) {
            m2.c(this, i2);
        }
        c(m2);
    }

    public final void i(b bVar) {
        int i2;
        if (bVar.f1681e) {
            bVar.a.d(this, bVar.f1678b);
        } else {
            b[] bVarArr = this.f1692i;
            int i3 = this.f1696m;
            bVarArr[i3] = bVar;
            g gVar = bVar.a;
            gVar.f1707d = i3;
            this.f1696m = i3 + 1;
            gVar.e(this, bVar);
        }
        if (this.f1687d) {
            int i4 = 0;
            while (i4 < this.f1696m) {
                if (this.f1692i[i4] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f1692i;
                if (bVarArr2[i4] != null && bVarArr2[i4].f1681e) {
                    b bVar2 = bVarArr2[i4];
                    bVar2.a.d(this, bVar2.f1678b);
                    this.o.f1682b.b(bVar2);
                    this.f1692i[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f1696m;
                        if (i5 >= i2) {
                            break;
                        }
                        b[] bVarArr3 = this.f1692i;
                        int i7 = i5 - 1;
                        bVarArr3[i7] = bVarArr3[i5];
                        if (bVarArr3[i7].a.f1707d == i5) {
                            bVarArr3[i7].a.f1707d = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f1692i[i6] = null;
                    }
                    this.f1696m = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f1687d = false;
        }
    }

    public final void j() {
        for (int i2 = 0; i2 < this.f1696m; i2++) {
            b bVar = this.f1692i[i2];
            bVar.a.f1709f = bVar.f1678b;
        }
    }

    public g k(int i2, String str) {
        if (this.f1695l + 1 >= this.f1691h) {
            p();
        }
        g a2 = a(g.a.ERROR, str);
        int i3 = this.f1688e + 1;
        this.f1688e = i3;
        this.f1695l++;
        a2.f1706c = i3;
        a2.f1708e = i2;
        this.o.f1684d[i3] = a2;
        this.f1689f.b(a2);
        return a2;
    }

    public g l(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f1695l + 1 >= this.f1691h) {
            p();
        }
        if (obj instanceof c.g.a.i.c) {
            c.g.a.i.c cVar = (c.g.a.i.c) obj;
            gVar = cVar.f1740i;
            if (gVar == null) {
                cVar.i();
                gVar = cVar.f1740i;
            }
            int i2 = gVar.f1706c;
            if (i2 == -1 || i2 > this.f1688e || this.o.f1684d[i2] == null) {
                if (i2 != -1) {
                    gVar.c();
                }
                int i3 = this.f1688e + 1;
                this.f1688e = i3;
                this.f1695l++;
                gVar.f1706c = i3;
                gVar.f1713j = g.a.UNRESTRICTED;
                this.o.f1684d[i3] = gVar;
            }
        }
        return gVar;
    }

    public b m() {
        b a2 = this.o.f1682b.a();
        if (a2 == null) {
            a2 = new b(this.o);
            f1686c++;
        } else {
            a2.a = null;
            a2.f1680d.clear();
            a2.f1678b = 0.0f;
            a2.f1681e = false;
        }
        g.a++;
        return a2;
    }

    public g n() {
        if (this.f1695l + 1 >= this.f1691h) {
            p();
        }
        g a2 = a(g.a.SLACK, null);
        int i2 = this.f1688e + 1;
        this.f1688e = i2;
        this.f1695l++;
        a2.f1706c = i2;
        this.o.f1684d[i2] = a2;
        return a2;
    }

    public int o(Object obj) {
        g gVar = ((c.g.a.i.c) obj).f1740i;
        if (gVar != null) {
            return (int) (gVar.f1709f + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i2 = this.f1690g * 2;
        this.f1690g = i2;
        this.f1692i = (b[]) Arrays.copyOf(this.f1692i, i2);
        c cVar = this.o;
        cVar.f1684d = (g[]) Arrays.copyOf(cVar.f1684d, this.f1690g);
        int i3 = this.f1690g;
        this.f1694k = new boolean[i3];
        this.f1691h = i3;
        this.f1697n = i3;
    }

    public void q() throws Exception {
        if (this.f1689f.isEmpty()) {
            j();
        } else if (!this.f1693j) {
            r(this.f1689f);
        } else {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f1696m) {
                    z = true;
                    break;
                } else if (!this.f1692i[i2].f1681e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                j();
            } else {
                r(this.f1689f);
            }
        }
    }

    public void r(a aVar) throws Exception {
        float f2;
        int i2;
        boolean z;
        int i3 = 0;
        while (true) {
            f2 = 0.0f;
            i2 = 1;
            if (i3 >= this.f1696m) {
                z = false;
                break;
            }
            b[] bVarArr = this.f1692i;
            if (bVarArr[i3].a.f1713j != g.a.UNRESTRICTED && bVarArr[i3].f1678b < 0.0f) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            boolean z2 = false;
            int i4 = 0;
            while (!z2) {
                i4 += i2;
                float f3 = Float.MAX_VALUE;
                int i5 = 0;
                int i6 = -1;
                int i7 = -1;
                int i8 = 0;
                while (i5 < this.f1696m) {
                    b bVar = this.f1692i[i5];
                    if (bVar.a.f1713j != g.a.UNRESTRICTED && !bVar.f1681e && bVar.f1678b < f2) {
                        int a2 = bVar.f1680d.a();
                        int i9 = 0;
                        while (i9 < a2) {
                            g e2 = bVar.f1680d.e(i9);
                            float j2 = bVar.f1680d.j(e2);
                            if (j2 > f2) {
                                for (int i10 = 0; i10 < 9; i10++) {
                                    float f4 = e2.f1711h[i10] / j2;
                                    if ((f4 < f3 && i10 == i8) || i10 > i8) {
                                        i7 = e2.f1706c;
                                        i8 = i10;
                                        f3 = f4;
                                        i6 = i5;
                                    }
                                }
                            }
                            i9++;
                            f2 = 0.0f;
                        }
                    }
                    i5++;
                    f2 = 0.0f;
                }
                if (i6 != -1) {
                    b bVar2 = this.f1692i[i6];
                    bVar2.a.f1707d = -1;
                    bVar2.j(this.o.f1684d[i7]);
                    g gVar = bVar2.a;
                    gVar.f1707d = i6;
                    gVar.e(this, bVar2);
                } else {
                    z2 = true;
                }
                if (i4 > this.f1695l / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
                i2 = 1;
            }
        }
        s(aVar);
        j();
    }

    public final int s(a aVar) {
        for (int i2 = 0; i2 < this.f1695l; i2++) {
            this.f1694k[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            if (i3 >= this.f1695l * 2) {
                return i3;
            }
            g gVar = ((b) aVar).a;
            if (gVar != null) {
                this.f1694k[gVar.f1706c] = true;
            }
            g a2 = aVar.a(this, this.f1694k);
            if (a2 != null) {
                boolean[] zArr = this.f1694k;
                int i4 = a2.f1706c;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (a2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f1696m; i6++) {
                    b bVar = this.f1692i[i6];
                    if (bVar.a.f1713j != g.a.UNRESTRICTED && !bVar.f1681e && bVar.f1680d.b(a2)) {
                        float j2 = bVar.f1680d.j(a2);
                        if (j2 < 0.0f) {
                            float f3 = (-bVar.f1678b) / j2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.f1692i[i5];
                    bVar2.a.f1707d = -1;
                    bVar2.j(a2);
                    g gVar2 = bVar2.a;
                    gVar2.f1707d = i5;
                    gVar2.e(this, bVar2);
                }
            } else {
                z = true;
            }
        }
        return i3;
    }

    public final void t() {
        for (int i2 = 0; i2 < this.f1696m; i2++) {
            b bVar = this.f1692i[i2];
            if (bVar != null) {
                this.o.f1682b.b(bVar);
            }
            this.f1692i[i2] = null;
        }
    }

    public void u() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.o;
            g[] gVarArr = cVar.f1684d;
            if (i2 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i2];
            if (gVar != null) {
                gVar.c();
            }
            i2++;
        }
        e<g> eVar = cVar.f1683c;
        g[] gVarArr2 = this.p;
        int i3 = this.q;
        Objects.requireNonNull(eVar);
        if (i3 > gVarArr2.length) {
            i3 = gVarArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            g gVar2 = gVarArr2[i4];
            int i5 = eVar.f1698b;
            Object[] objArr = eVar.a;
            if (i5 < objArr.length) {
                objArr[i5] = gVar2;
                eVar.f1698b = i5 + 1;
            }
        }
        this.q = 0;
        Arrays.fill(this.o.f1684d, (Object) null);
        this.f1688e = 0;
        this.f1689f.clear();
        this.f1695l = 1;
        for (int i6 = 0; i6 < this.f1696m; i6++) {
            b[] bVarArr = this.f1692i;
            if (bVarArr[i6] != null) {
                Objects.requireNonNull(bVarArr[i6]);
            }
        }
        t();
        this.f1696m = 0;
        this.r = new b(this.o);
    }
}
