package c.g.a;

import c.g.a.d;
import c.g.a.g;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: d  reason: collision with root package name */
    public a f1680d;
    public g a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f1678b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<g> f1679c = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f1681e = false;

    /* loaded from: classes.dex */
    public interface a {
        int a();

        boolean b(g gVar);

        float c(b bVar, boolean z);

        void clear();

        void d(g gVar, float f2);

        g e(int i2);

        void f(g gVar, float f2, boolean z);

        void g();

        float h(int i2);

        float i(g gVar, boolean z);

        float j(g gVar);

        void k(float f2);
    }

    public b() {
    }

    public b(c cVar) {
        this.f1680d = new c.g.a.a(this, cVar);
    }

    @Override // c.g.a.d.a
    public g a(d dVar, boolean[] zArr) {
        return i(zArr, null);
    }

    @Override // c.g.a.d.a
    public void b(g gVar) {
        float f2;
        int i2 = gVar.f1708e;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
            this.f1680d.d(gVar, f2);
        }
        f2 = 1.0f;
        this.f1680d.d(gVar, f2);
    }

    public b c(d dVar, int i2) {
        this.f1680d.d(dVar.k(i2, "ep"), 1.0f);
        this.f1680d.d(dVar.k(i2, "em"), -1.0f);
        return this;
    }

    @Override // c.g.a.d.a
    public void clear() {
        this.f1680d.clear();
        this.a = null;
        this.f1678b = 0.0f;
    }

    public b d(g gVar, g gVar2, g gVar3, g gVar4, float f2) {
        this.f1680d.d(gVar, -1.0f);
        this.f1680d.d(gVar2, 1.0f);
        this.f1680d.d(gVar3, f2);
        this.f1680d.d(gVar4, -f2);
        return this;
    }

    public b e(g gVar, g gVar2, g gVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1678b = i2;
        }
        if (z) {
            this.f1680d.d(gVar, 1.0f);
            this.f1680d.d(gVar2, -1.0f);
            this.f1680d.d(gVar3, -1.0f);
        } else {
            this.f1680d.d(gVar, -1.0f);
            this.f1680d.d(gVar2, 1.0f);
            this.f1680d.d(gVar3, 1.0f);
        }
        return this;
    }

    public b f(g gVar, g gVar2, g gVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1678b = i2;
        }
        if (z) {
            this.f1680d.d(gVar, 1.0f);
            this.f1680d.d(gVar2, -1.0f);
            this.f1680d.d(gVar3, 1.0f);
        } else {
            this.f1680d.d(gVar, -1.0f);
            this.f1680d.d(gVar2, 1.0f);
            this.f1680d.d(gVar3, -1.0f);
        }
        return this;
    }

    public b g(g gVar, g gVar2, g gVar3, g gVar4, float f2) {
        this.f1680d.d(gVar3, 0.5f);
        this.f1680d.d(gVar4, 0.5f);
        this.f1680d.d(gVar, -0.5f);
        this.f1680d.d(gVar2, -0.5f);
        this.f1678b = -f2;
        return this;
    }

    public final boolean h(g gVar) {
        return gVar.f1716m <= 1;
    }

    public final g i(boolean[] zArr, g gVar) {
        g.a aVar;
        int a2 = this.f1680d.a();
        g gVar2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < a2; i2++) {
            float h2 = this.f1680d.h(i2);
            if (h2 < 0.0f) {
                g e2 = this.f1680d.e(i2);
                if ((zArr == null || !zArr[e2.f1706c]) && e2 != gVar && (((aVar = e2.f1713j) == g.a.SLACK || aVar == g.a.ERROR) && h2 < f2)) {
                    f2 = h2;
                    gVar2 = e2;
                }
            }
        }
        return gVar2;
    }

    @Override // c.g.a.d.a
    public boolean isEmpty() {
        return this.a == null && this.f1678b == 0.0f && this.f1680d.a() == 0;
    }

    public void j(g gVar) {
        g gVar2 = this.a;
        if (gVar2 != null) {
            this.f1680d.d(gVar2, -1.0f);
            this.a.f1707d = -1;
            this.a = null;
        }
        float i2 = this.f1680d.i(gVar, true) * (-1.0f);
        this.a = gVar;
        if (i2 == 1.0f) {
            return;
        }
        this.f1678b /= i2;
        this.f1680d.k(i2);
    }

    public void k(d dVar, g gVar, boolean z) {
        if (gVar.f1710g) {
            float j2 = this.f1680d.j(gVar);
            this.f1678b = (gVar.f1709f * j2) + this.f1678b;
            this.f1680d.i(gVar, z);
            if (z) {
                gVar.b(this);
            }
            if (this.f1680d.a() == 0) {
                this.f1681e = true;
                dVar.f1687d = true;
            }
        }
    }

    public void l(d dVar, b bVar, boolean z) {
        float c2 = this.f1680d.c(bVar, z);
        this.f1678b = (bVar.f1678b * c2) + this.f1678b;
        if (z) {
            bVar.a.b(this);
        }
        if (this.a == null || this.f1680d.a() != 0) {
            return;
        }
        this.f1681e = true;
        dVar.f1687d = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r8 = this;
            c.g.a.g r0 = r8.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = e.a.d.a.a.y(r0)
            c.g.a.g r1 = r8.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = e.a.d.a.a.k(r0, r1)
            float r1 = r8.f1678b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L33
            java.lang.StringBuilder r0 = e.a.d.a.a.y(r0)
            float r1 = r8.f1678b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L34
        L33:
            r1 = 0
        L34:
            c.g.a.b$a r4 = r8.f1680d
            int r4 = r4.a()
        L3a:
            if (r3 >= r4) goto L9c
            c.g.a.b$a r5 = r8.f1680d
            c.g.a.g r5 = r5.e(r3)
            if (r5 != 0) goto L45
            goto L99
        L45:
            c.g.a.b$a r6 = r8.f1680d
            float r6 = r6.h(r3)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L50
            goto L99
        L50:
            java.lang.String r5 = r5.toString()
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L63
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = e.a.d.a.a.k(r0, r1)
            goto L74
        L63:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L6e
            java.lang.String r1 = " + "
            java.lang.String r0 = e.a.d.a.a.k(r0, r1)
            goto L76
        L6e:
            java.lang.String r1 = " - "
            java.lang.String r0 = e.a.d.a.a.k(r0, r1)
        L74:
            float r6 = r6 * r7
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = e.a.d.a.a.k(r0, r5)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = 1
        L99:
            int r3 = r3 + 1
            goto L3a
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = e.a.d.a.a.k(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.a.b.toString():java.lang.String");
    }
}
