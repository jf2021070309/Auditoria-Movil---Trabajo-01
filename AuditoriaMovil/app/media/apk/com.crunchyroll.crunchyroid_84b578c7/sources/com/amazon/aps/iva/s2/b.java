package com.amazon.aps.iva.s2;

import com.amazon.aps.iva.s2.d;
import com.amazon.aps.iva.s2.h;
import java.util.ArrayList;
/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements d.a {
    public a d;
    public h a = null;
    public float b = 0.0f;
    public final ArrayList<h> c = new ArrayList<>();
    public boolean e = false;

    /* compiled from: ArrayRow.java */
    /* loaded from: classes.dex */
    public interface a {
        float a(h hVar, boolean z);

        h b(int i);

        void c();

        void clear();

        float d(b bVar, boolean z);

        void e(h hVar, float f, boolean z);

        int f();

        float g(h hVar);

        float h(int i);

        void i(h hVar, float f);

        boolean j(h hVar);

        void k(float f);
    }

    public b() {
    }

    @Override // com.amazon.aps.iva.s2.d.a
    public h a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(d dVar, int i) {
        this.d.i(dVar.j(i), 1.0f);
        this.d.i(dVar.j(i), -1.0f);
    }

    public final void c(h hVar, h hVar2, h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.d.i(hVar, -1.0f);
            this.d.i(hVar2, 1.0f);
            this.d.i(hVar3, 1.0f);
            return;
        }
        this.d.i(hVar, 1.0f);
        this.d.i(hVar2, -1.0f);
        this.d.i(hVar3, -1.0f);
    }

    public final void d(h hVar, h hVar2, h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.d.i(hVar, -1.0f);
            this.d.i(hVar2, 1.0f);
            this.d.i(hVar3, -1.0f);
            return;
        }
        this.d.i(hVar, 1.0f);
        this.d.i(hVar2, -1.0f);
        this.d.i(hVar3, 1.0f);
    }

    public boolean e() {
        if (this.a == null && this.b == 0.0f && this.d.f() == 0) {
            return true;
        }
        return false;
    }

    public final h f(boolean[] zArr, h hVar) {
        h.a aVar;
        int f = this.d.f();
        h hVar2 = null;
        float f2 = 0.0f;
        for (int i = 0; i < f; i++) {
            float h = this.d.h(i);
            if (h < 0.0f) {
                h b = this.d.b(i);
                if ((zArr == null || !zArr[b.c]) && b != hVar && (((aVar = b.j) == h.a.SLACK || aVar == h.a.ERROR) && h < f2)) {
                    f2 = h;
                    hVar2 = b;
                }
            }
        }
        return hVar2;
    }

    public final void g(h hVar) {
        h hVar2 = this.a;
        if (hVar2 != null) {
            this.d.i(hVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float a2 = this.d.a(hVar, true) * (-1.0f);
        this.a = hVar;
        if (a2 == 1.0f) {
            return;
        }
        this.b /= a2;
        this.d.k(a2);
    }

    public final void h(d dVar, h hVar, boolean z) {
        if (hVar != null && hVar.g) {
            float g = this.d.g(hVar);
            this.b = (hVar.f * g) + this.b;
            this.d.a(hVar, z);
            if (z) {
                hVar.b(this);
            }
            if (this.d.f() == 0) {
                this.e = true;
                dVar.a = true;
            }
        }
    }

    public void i(d dVar, b bVar, boolean z) {
        float d = this.d.d(bVar, z);
        this.b = (bVar.b * d) + this.b;
        if (z) {
            bVar.a.b(this);
        }
        if (this.a != null && this.d.f() == 0) {
            this.e = true;
            dVar.a = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            com.amazon.aps.iva.s2.h r0 = r9.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            com.amazon.aps.iva.s2.h r1 = r9.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = com.amazon.aps.iva.c80.a.f(r0, r1)
            float r1 = r9.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = defpackage.c.b(r0)
            float r1 = r9.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            com.amazon.aps.iva.s2.b$a r5 = r9.d
            int r5 = r5.f()
        L3c:
            if (r4 >= r5) goto L9b
            com.amazon.aps.iva.s2.b$a r6 = r9.d
            com.amazon.aps.iva.s2.h r6 = r6.b(r4)
            if (r6 != 0) goto L47
            goto L98
        L47:
            com.amazon.aps.iva.s2.b$a r7 = r9.d
            float r7 = r7.h(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L98
        L52:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L63
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L75
            java.lang.String r1 = "- "
            java.lang.String r0 = com.amazon.aps.iva.c80.a.f(r0, r1)
            goto L72
        L63:
            if (r8 <= 0) goto L6c
            java.lang.String r1 = " + "
            java.lang.String r0 = com.amazon.aps.iva.c80.a.f(r0, r1)
            goto L75
        L6c:
            java.lang.String r1 = " - "
            java.lang.String r0 = com.amazon.aps.iva.c80.a.f(r0, r1)
        L72:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L75:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L80
            java.lang.String r0 = com.amazon.aps.iva.c80.a.f(r0, r6)
            goto L97
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L97:
            r1 = r3
        L98:
            int r4 = r4 + 1
            goto L3c
        L9b:
            if (r1 != 0) goto La3
            java.lang.String r1 = "0.0"
            java.lang.String r0 = com.amazon.aps.iva.c80.a.f(r0, r1)
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s2.b.toString():java.lang.String");
    }

    public b(c cVar) {
        this.d = new com.amazon.aps.iva.s2.a(this, cVar);
    }
}
