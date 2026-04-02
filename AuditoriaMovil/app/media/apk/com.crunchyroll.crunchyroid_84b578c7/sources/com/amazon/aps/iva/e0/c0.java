package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.s1.v0;
import java.util.List;
/* compiled from: LazyListMeasuredItem.kt */
/* loaded from: classes.dex */
public final class c0 implements j {
    public final int a;
    public final List<u0> b;
    public final boolean c;
    public final a.b d;
    public final a.c e;
    public final com.amazon.aps.iva.o2.l f;
    public final boolean g;
    public final int h;
    public final long i;
    public final Object j;
    public final Object k;
    public final int l;
    public final int m;
    public final int n;
    public int o;
    public final int[] p;

    public c0() {
        throw null;
    }

    public c0(int i, List list, boolean z, a.b bVar, a.c cVar, com.amazon.aps.iva.o2.l lVar, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2) {
        int i5;
        int i6;
        com.amazon.aps.iva.yb0.j.f(list, "placeables");
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = bVar;
        this.e = cVar;
        this.f = lVar;
        this.g = z2;
        this.h = i4;
        this.i = j;
        this.j = obj;
        this.k = obj2;
        this.o = Integer.MIN_VALUE;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            u0 u0Var = (u0) list.get(i9);
            boolean z3 = this.c;
            if (z3) {
                i5 = u0Var.c;
            } else {
                i5 = u0Var.b;
            }
            i7 += i5;
            if (!z3) {
                i6 = u0Var.c;
            } else {
                i6 = u0Var.b;
            }
            i8 = Math.max(i8, i6);
        }
        this.l = i7;
        int i10 = i7 + this.h;
        this.m = i10 >= 0 ? i10 : 0;
        this.n = i8;
        this.p = new int[this.b.size() * 2];
    }

    public final long a(int i) {
        int i2 = i * 2;
        int[] iArr = this.p;
        return com.amazon.aps.iva.e.w.e(iArr[i2], iArr[i2 + 1]);
    }

    public final Object b(int i) {
        return this.b.get(i).b();
    }

    public final int c() {
        return this.b.size();
    }

    public final void d(u0.a aVar) {
        boolean z;
        com.amazon.aps.iva.f0.e eVar;
        int b;
        int i;
        int i2;
        com.amazon.aps.iva.yb0.j.f(aVar, "scope");
        if (this.o != Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int c = c();
            for (int i3 = 0; i3 < c; i3++) {
                u0 u0Var = this.b.get(i3);
                boolean z2 = this.c;
                if (z2) {
                    int i4 = u0Var.c;
                } else {
                    int i5 = u0Var.b;
                }
                long a = a(i3);
                Object b2 = b(i3);
                if (b2 instanceof com.amazon.aps.iva.f0.e) {
                    eVar = (com.amazon.aps.iva.f0.e) b2;
                } else {
                    eVar = null;
                }
                if (eVar == null) {
                    if (this.g) {
                        int i6 = com.amazon.aps.iva.o2.h.c;
                        int i7 = (int) (a >> 32);
                        if (!z2) {
                            int i8 = this.o - i7;
                            if (z2) {
                                i2 = u0Var.c;
                            } else {
                                i2 = u0Var.b;
                            }
                            i7 = i8 - i2;
                        }
                        if (z2) {
                            int b3 = this.o - com.amazon.aps.iva.o2.h.b(a);
                            if (z2) {
                                i = u0Var.c;
                            } else {
                                i = u0Var.b;
                            }
                            b = b3 - i;
                        } else {
                            b = com.amazon.aps.iva.o2.h.b(a);
                        }
                        a = com.amazon.aps.iva.e.w.e(i7, b);
                    }
                    long j = this.i;
                    long e = com.amazon.aps.iva.e.w.e(((int) (a >> 32)) + ((int) (j >> 32)), com.amazon.aps.iva.o2.h.b(j) + com.amazon.aps.iva.o2.h.b(a));
                    if (z2) {
                        u0.a.k(aVar, u0Var, e);
                    } else {
                        u0.a.C0692a c0692a = u0.a.a;
                        v0.a aVar2 = v0.a;
                        com.amazon.aps.iva.yb0.j.f(aVar2, "layerBlock");
                        if (aVar.a() != com.amazon.aps.iva.o2.l.Ltr && aVar.b() != 0) {
                            long e2 = com.amazon.aps.iva.e.w.e((aVar.b() - u0Var.b) - ((int) (e >> 32)), com.amazon.aps.iva.o2.h.b(e));
                            long j2 = u0Var.f;
                            u0Var.r0(com.amazon.aps.iva.e.w.e(((int) (e2 >> 32)) + ((int) (j2 >> 32)), com.amazon.aps.iva.o2.h.b(j2) + com.amazon.aps.iva.o2.h.b(e2)), 0.0f, aVar2);
                        } else {
                            long j3 = u0Var.f;
                            u0Var.r0(com.amazon.aps.iva.e.w.e(((int) (e >> 32)) + ((int) (j3 >> 32)), com.amazon.aps.iva.o2.h.b(j3) + com.amazon.aps.iva.o2.h.b(e)), 0.0f, aVar2);
                        }
                    }
                } else {
                    throw null;
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void e(int i, int i2, int i3) {
        int i4;
        int i5;
        boolean z = this.c;
        if (z) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        this.o = i4;
        List<u0> list = this.b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            u0 u0Var = list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.p;
            if (z) {
                a.b bVar = this.d;
                if (bVar != null) {
                    iArr[i7] = bVar.a(u0Var.b, i2, this.f);
                    iArr[i7 + 1] = i;
                    i5 = u0Var.c;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                a.c cVar = this.e;
                if (cVar != null) {
                    iArr[i8] = cVar.a(u0Var.c, i3);
                    i5 = u0Var.b;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            i += i5;
        }
    }

    @Override // com.amazon.aps.iva.e0.j
    public final int getIndex() {
        return this.a;
    }
}
