package com.amazon.aps.iva.v1;
/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes.dex */
public final class d extends b {
    public static d d;
    public static final com.amazon.aps.iva.n2.g e = com.amazon.aps.iva.n2.g.Rtl;
    public static final com.amazon.aps.iva.n2.g f = com.amazon.aps.iva.n2.g.Ltr;
    public com.amazon.aps.iva.c2.y c;

    @Override // com.amazon.aps.iva.v1.g
    public final int[] a(int i) {
        int i2;
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        com.amazon.aps.iva.n2.g gVar = e;
        if (i < 0) {
            com.amazon.aps.iva.c2.y yVar = this.c;
            if (yVar != null) {
                i2 = yVar.g(0);
            } else {
                com.amazon.aps.iva.yb0.j.m("layoutResult");
                throw null;
            }
        } else {
            com.amazon.aps.iva.c2.y yVar2 = this.c;
            if (yVar2 != null) {
                int g = yVar2.g(i);
                if (e(g, gVar) == i) {
                    i2 = g;
                } else {
                    i2 = g + 1;
                }
            } else {
                com.amazon.aps.iva.yb0.j.m("layoutResult");
                throw null;
            }
        }
        com.amazon.aps.iva.c2.y yVar3 = this.c;
        if (yVar3 != null) {
            if (i2 >= yVar3.b.f) {
                return null;
            }
            return c(e(i2, gVar), e(i2, f) + 1);
        }
        com.amazon.aps.iva.yb0.j.m("layoutResult");
        throw null;
    }

    @Override // com.amazon.aps.iva.v1.g
    public final int[] b(int i) {
        int i2;
        if (d().length() <= 0 || i <= 0) {
            return null;
        }
        int length = d().length();
        com.amazon.aps.iva.n2.g gVar = f;
        if (i > length) {
            com.amazon.aps.iva.c2.y yVar = this.c;
            if (yVar != null) {
                i2 = yVar.g(d().length());
            } else {
                com.amazon.aps.iva.yb0.j.m("layoutResult");
                throw null;
            }
        } else {
            com.amazon.aps.iva.c2.y yVar2 = this.c;
            if (yVar2 != null) {
                int g = yVar2.g(i);
                if (e(g, gVar) + 1 == i) {
                    i2 = g;
                } else {
                    i2 = g - 1;
                }
            } else {
                com.amazon.aps.iva.yb0.j.m("layoutResult");
                throw null;
            }
        }
        if (i2 < 0) {
            return null;
        }
        return c(e(i2, e), e(i2, gVar) + 1);
    }

    public final int e(int i, com.amazon.aps.iva.n2.g gVar) {
        com.amazon.aps.iva.c2.y yVar = this.c;
        if (yVar != null) {
            int k = yVar.k(i);
            com.amazon.aps.iva.c2.y yVar2 = this.c;
            if (yVar2 != null) {
                if (gVar != yVar2.n(k)) {
                    com.amazon.aps.iva.c2.y yVar3 = this.c;
                    if (yVar3 != null) {
                        return yVar3.k(i);
                    }
                    com.amazon.aps.iva.yb0.j.m("layoutResult");
                    throw null;
                }
                com.amazon.aps.iva.c2.y yVar4 = this.c;
                if (yVar4 != null) {
                    return yVar4.f(i, false) - 1;
                }
                com.amazon.aps.iva.yb0.j.m("layoutResult");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("layoutResult");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("layoutResult");
        throw null;
    }
}
