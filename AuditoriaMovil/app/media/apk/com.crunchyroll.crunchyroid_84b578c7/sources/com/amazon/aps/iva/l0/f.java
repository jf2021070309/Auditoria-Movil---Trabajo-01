package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.j0.d1;
import com.amazon.aps.iva.l0.f;
/* compiled from: TextPreparedSelection.kt */
/* loaded from: classes.dex */
public abstract class f<T extends f<T>> {
    public final com.amazon.aps.iva.c2.b a;
    public final long b;
    public final com.amazon.aps.iva.c2.y c;
    public final com.amazon.aps.iva.i2.q d;
    public final j0 e;
    public long f;
    public final com.amazon.aps.iva.c2.b g;

    public f(com.amazon.aps.iva.c2.b bVar, long j, com.amazon.aps.iva.c2.y yVar, com.amazon.aps.iva.i2.q qVar, j0 j0Var) {
        com.amazon.aps.iva.yb0.j.f(bVar, "originalText");
        com.amazon.aps.iva.yb0.j.f(qVar, "offsetMapping");
        com.amazon.aps.iva.yb0.j.f(j0Var, "state");
        this.a = bVar;
        this.b = j;
        this.c = yVar;
        this.d = qVar;
        this.e = j0Var;
        this.f = j;
        this.g = bVar;
    }

    public final Integer a() {
        com.amazon.aps.iva.c2.y yVar = this.c;
        if (yVar != null) {
            int d = com.amazon.aps.iva.c2.z.d(this.f);
            com.amazon.aps.iva.i2.q qVar = this.d;
            return Integer.valueOf(qVar.a(yVar.f(yVar.g(qVar.b(d)), true)));
        }
        return null;
    }

    public final Integer b() {
        com.amazon.aps.iva.c2.y yVar = this.c;
        if (yVar != null) {
            int e = com.amazon.aps.iva.c2.z.e(this.f);
            com.amazon.aps.iva.i2.q qVar = this.d;
            return Integer.valueOf(qVar.a(yVar.k(yVar.g(qVar.b(e)))));
        }
        return null;
    }

    public final Integer c() {
        int length;
        com.amazon.aps.iva.c2.y yVar = this.c;
        if (yVar != null) {
            int x = x();
            while (true) {
                com.amazon.aps.iva.c2.b bVar = this.a;
                if (x >= bVar.length()) {
                    length = bVar.length();
                    break;
                }
                int length2 = this.g.b.length() - 1;
                if (x <= length2) {
                    length2 = x;
                }
                long o = yVar.o(length2);
                if (com.amazon.aps.iva.c2.z.c(o) <= x) {
                    x++;
                } else {
                    length = this.d.a(com.amazon.aps.iva.c2.z.c(o));
                    break;
                }
            }
            return Integer.valueOf(length);
        }
        return null;
    }

    public final Integer d() {
        int i;
        com.amazon.aps.iva.c2.y yVar = this.c;
        if (yVar != null) {
            int x = x();
            while (true) {
                if (x <= 0) {
                    i = 0;
                    break;
                }
                int length = this.g.b.length() - 1;
                if (x <= length) {
                    length = x;
                }
                int o = (int) (yVar.o(length) >> 32);
                if (o >= x) {
                    x--;
                } else {
                    i = this.d.a(o);
                    break;
                }
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public final boolean e() {
        com.amazon.aps.iva.n2.g gVar;
        com.amazon.aps.iva.c2.y yVar = this.c;
        if (yVar != null) {
            gVar = yVar.n(x());
        } else {
            gVar = null;
        }
        if (gVar != com.amazon.aps.iva.n2.g.Rtl) {
            return true;
        }
        return false;
    }

    public final int f(com.amazon.aps.iva.c2.y yVar, int i) {
        int x = x();
        j0 j0Var = this.e;
        if (j0Var.a == null) {
            j0Var.a = Float.valueOf(yVar.c(x).a);
        }
        int g = yVar.g(x) + i;
        if (g < 0) {
            return 0;
        }
        if (g >= yVar.b.f) {
            return this.g.b.length();
        }
        float e = yVar.e(g) - 1;
        Float f = j0Var.a;
        com.amazon.aps.iva.yb0.j.c(f);
        float floatValue = f.floatValue();
        if ((e() && floatValue >= yVar.j(g)) || (!e() && floatValue <= yVar.i(g))) {
            return yVar.f(g, true);
        }
        return this.d.a(yVar.m(com.amazon.aps.iva.e1.d.d(f.floatValue(), e)));
    }

    public final void g() {
        boolean z;
        this.e.a = null;
        if (this.g.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (e()) {
                l();
            } else {
                i();
            }
        }
    }

    public final void h() {
        boolean z;
        this.e.a = null;
        if (this.g.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (e()) {
                n();
            } else {
                k();
            }
        }
    }

    public final void i() {
        boolean z;
        this.e.a = null;
        com.amazon.aps.iva.c2.b bVar = this.g;
        if (bVar.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int v = com.amazon.aps.iva.e.z.v(com.amazon.aps.iva.c2.z.c(this.f), bVar.b);
            if (v != -1) {
                w(v, v);
            }
        }
    }

    public final void j() {
        boolean z;
        this.e.a = null;
        com.amazon.aps.iva.c2.b bVar = this.g;
        if (bVar.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int d = d1.d(com.amazon.aps.iva.c2.z.d(this.f), bVar.b);
            w(d, d);
        }
    }

    public final void k() {
        boolean z;
        Integer c;
        this.e.a = null;
        if (this.g.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (c = c()) != null) {
            int intValue = c.intValue();
            w(intValue, intValue);
        }
    }

    public final void l() {
        boolean z;
        this.e.a = null;
        com.amazon.aps.iva.c2.b bVar = this.g;
        if (bVar.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int w = com.amazon.aps.iva.e.z.w(com.amazon.aps.iva.c2.z.c(this.f), bVar.b);
            if (w != -1) {
                w(w, w);
            }
        }
    }

    public final void m() {
        boolean z;
        this.e.a = null;
        com.amazon.aps.iva.c2.b bVar = this.g;
        int i = 0;
        if (bVar.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int e = com.amazon.aps.iva.c2.z.e(this.f);
            String str = bVar.b;
            com.amazon.aps.iva.yb0.j.f(str, "<this>");
            int i2 = e - 1;
            while (true) {
                if (i2 <= 0) {
                    break;
                }
                int i3 = i2 - 1;
                if (str.charAt(i3) == '\n') {
                    i = i2;
                    break;
                }
                i2 = i3;
            }
            w(i, i);
        }
    }

    public final void n() {
        boolean z;
        Integer d;
        this.e.a = null;
        if (this.g.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (d = d()) != null) {
            int intValue = d.intValue();
            w(intValue, intValue);
        }
    }

    public final void o() {
        boolean z;
        this.e.a = null;
        if (this.g.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (e()) {
                i();
            } else {
                l();
            }
        }
    }

    public final void p() {
        boolean z;
        this.e.a = null;
        if (this.g.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (e()) {
                k();
            } else {
                n();
            }
        }
    }

    public final void q() {
        boolean z;
        this.e.a = null;
        com.amazon.aps.iva.c2.b bVar = this.g;
        if (bVar.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = bVar.b.length();
            w(length, length);
        }
    }

    public final void r() {
        boolean z;
        Integer a;
        this.e.a = null;
        if (this.g.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (a = a()) != null) {
            int intValue = a.intValue();
            w(intValue, intValue);
        }
    }

    public final void s() {
        boolean z;
        this.e.a = null;
        if (this.g.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (e()) {
                u();
            } else {
                r();
            }
        }
    }

    public final void t() {
        boolean z;
        this.e.a = null;
        if (this.g.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (e()) {
                r();
            } else {
                u();
            }
        }
    }

    public final void u() {
        boolean z;
        Integer b;
        this.e.a = null;
        if (this.g.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (b = b()) != null) {
            int intValue = b.intValue();
            w(intValue, intValue);
        }
    }

    public final void v() {
        boolean z;
        if (this.g.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = com.amazon.aps.iva.c2.z.c;
            this.f = com.amazon.aps.iva.ab.x.f((int) (this.b >> 32), com.amazon.aps.iva.c2.z.c(this.f));
        }
    }

    public final void w(int i, int i2) {
        this.f = com.amazon.aps.iva.ab.x.f(i, i2);
    }

    public final int x() {
        return this.d.b(com.amazon.aps.iva.c2.z.c(this.f));
    }
}
