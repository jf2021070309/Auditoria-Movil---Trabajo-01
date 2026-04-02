package com.amazon.aps.iva.v1;

import android.graphics.Rect;
/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes.dex */
public final class e extends b {
    public static e e;
    public static final com.amazon.aps.iva.n2.g f = com.amazon.aps.iva.n2.g.Rtl;
    public static final com.amazon.aps.iva.n2.g g = com.amazon.aps.iva.n2.g.Ltr;
    public com.amazon.aps.iva.c2.y c;
    public com.amazon.aps.iva.a2.r d;

    public e() {
        new Rect();
    }

    @Override // com.amazon.aps.iva.v1.g
    public final int[] a(int i) {
        int i2;
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        try {
            com.amazon.aps.iva.a2.r rVar = this.d;
            if (rVar != null) {
                com.amazon.aps.iva.e1.e e2 = rVar.e();
                int a = com.amazon.aps.iva.ob0.f.a(e2.d - e2.b);
                if (i <= 0) {
                    i = 0;
                }
                com.amazon.aps.iva.c2.y yVar = this.c;
                if (yVar != null) {
                    int g2 = yVar.g(i);
                    com.amazon.aps.iva.c2.y yVar2 = this.c;
                    if (yVar2 != null) {
                        float l = yVar2.l(g2) + a;
                        com.amazon.aps.iva.c2.y yVar3 = this.c;
                        if (yVar3 != null) {
                            if (l < yVar3.l(yVar3.b.f - 1)) {
                                com.amazon.aps.iva.c2.y yVar4 = this.c;
                                if (yVar4 != null) {
                                    i2 = yVar4.h(l);
                                } else {
                                    com.amazon.aps.iva.yb0.j.m("layoutResult");
                                    throw null;
                                }
                            } else {
                                com.amazon.aps.iva.c2.y yVar5 = this.c;
                                if (yVar5 != null) {
                                    i2 = yVar5.b.f;
                                } else {
                                    com.amazon.aps.iva.yb0.j.m("layoutResult");
                                    throw null;
                                }
                            }
                            return c(i, e(i2 - 1, g) + 1);
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
            com.amazon.aps.iva.yb0.j.m("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.amazon.aps.iva.v1.g
    public final int[] b(int i) {
        int i2;
        if (d().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            com.amazon.aps.iva.a2.r rVar = this.d;
            if (rVar != null) {
                com.amazon.aps.iva.e1.e e2 = rVar.e();
                int a = com.amazon.aps.iva.ob0.f.a(e2.d - e2.b);
                int length = d().length();
                if (length <= i) {
                    i = length;
                }
                com.amazon.aps.iva.c2.y yVar = this.c;
                if (yVar != null) {
                    int g2 = yVar.g(i);
                    com.amazon.aps.iva.c2.y yVar2 = this.c;
                    if (yVar2 != null) {
                        float l = yVar2.l(g2) - a;
                        if (l > 0.0f) {
                            com.amazon.aps.iva.c2.y yVar3 = this.c;
                            if (yVar3 != null) {
                                i2 = yVar3.h(l);
                            } else {
                                com.amazon.aps.iva.yb0.j.m("layoutResult");
                                throw null;
                            }
                        } else {
                            i2 = 0;
                        }
                        if (i == d().length() && i2 < g2) {
                            i2++;
                        }
                        return c(e(i2, f), i);
                    }
                    com.amazon.aps.iva.yb0.j.m("layoutResult");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("layoutResult");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
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
