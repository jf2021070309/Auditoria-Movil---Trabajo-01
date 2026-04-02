package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.f0.f;
import com.amazon.aps.iva.s1.c;
/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
/* loaded from: classes.dex */
public final class g implements com.amazon.aps.iva.t1.g<com.amazon.aps.iva.s1.c>, com.amazon.aps.iva.s1.c {
    public static final a h = new a();
    public final h c;
    public final f d;
    public final boolean e;
    public final com.amazon.aps.iva.o2.l f;
    public final com.amazon.aps.iva.b0.f0 g;

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    /* loaded from: classes.dex */
    public static final class a implements c.a {
        @Override // com.amazon.aps.iva.s1.c.a
        public final boolean a() {
            return false;
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.o2.l.values().length];
            try {
                iArr[com.amazon.aps.iva.o2.l.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.o2.l.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    /* loaded from: classes.dex */
    public static final class c implements c.a {
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<f.a> b;
        public final /* synthetic */ int c;

        public c(com.amazon.aps.iva.yb0.d0<f.a> d0Var, int i) {
            this.b = d0Var;
            this.c = i;
        }

        @Override // com.amazon.aps.iva.s1.c.a
        public final boolean a() {
            return g.this.p(this.b.b, this.c);
        }
    }

    public g(com.amazon.aps.iva.e0.g gVar, f fVar, boolean z, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.b0.f0 f0Var) {
        com.amazon.aps.iva.yb0.j.f(gVar, "state");
        com.amazon.aps.iva.yb0.j.f(fVar, "beyondBoundsInfo");
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        this.c = gVar;
        this.d = fVar;
        this.e = z;
        this.f = lVar;
        this.g = f0Var;
    }

    @Override // com.amazon.aps.iva.t1.g
    public final com.amazon.aps.iva.t1.i<com.amazon.aps.iva.s1.c> getKey() {
        return com.amazon.aps.iva.s1.d.a;
    }

    @Override // com.amazon.aps.iva.s1.c
    public final <T> T l(int i, com.amazon.aps.iva.xb0.l<? super c.a, ? extends T> lVar) {
        int e;
        com.amazon.aps.iva.p0.f<f.a> fVar;
        h hVar = this.c;
        if (hVar.b() > 0 && hVar.d()) {
            if (x(i)) {
                e = hVar.f();
            } else {
                e = hVar.e();
            }
            com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
            f fVar2 = this.d;
            fVar2.getClass();
            T t = (T) new f.a(e, e);
            fVar2.a.b(t);
            d0Var.b = t;
            T t2 = null;
            while (true) {
                fVar = fVar2.a;
                if (t2 != null || !p((f.a) d0Var.b, i)) {
                    break;
                }
                f.a aVar = (f.a) d0Var.b;
                int i2 = aVar.a;
                boolean x = x(i);
                int i3 = aVar.b;
                if (x) {
                    i3++;
                } else {
                    i2--;
                }
                T t3 = (T) new f.a(i2, i3);
                fVar.b(t3);
                f.a aVar2 = (f.a) d0Var.b;
                com.amazon.aps.iva.yb0.j.f(aVar2, "interval");
                fVar.k(aVar2);
                d0Var.b = t3;
                hVar.c();
                t2 = lVar.invoke(new c(d0Var, i));
            }
            f.a aVar3 = (f.a) d0Var.b;
            com.amazon.aps.iva.yb0.j.f(aVar3, "interval");
            fVar.k(aVar3);
            hVar.c();
            return t2;
        }
        return lVar.invoke(h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0017, code lost:
        if (r3 == com.amazon.aps.iva.b0.f0.Horizontal) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002d, code lost:
        if (r3 == com.amazon.aps.iva.b0.f0.Vertical) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002f, code lost:
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(com.amazon.aps.iva.f0.f.a r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            r1 = 1
            r2 = 0
            if (r6 != r0) goto L7
            r0 = r1
            goto L8
        L7:
            r0 = r2
        L8:
            if (r0 == 0) goto Lb
            goto Le
        Lb:
            r0 = 6
            if (r6 != r0) goto L10
        Le:
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            com.amazon.aps.iva.b0.f0 r3 = r4.g
            if (r0 == 0) goto L1a
            com.amazon.aps.iva.b0.f0 r0 = com.amazon.aps.iva.b0.f0.Horizontal
            if (r3 != r0) goto L41
            goto L2f
        L1a:
            r0 = 3
            if (r6 != r0) goto L1f
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r0 == 0) goto L23
            goto L26
        L23:
            r0 = 4
            if (r6 != r0) goto L28
        L26:
            r0 = r1
            goto L29
        L28:
            r0 = r2
        L29:
            if (r0 == 0) goto L31
            com.amazon.aps.iva.b0.f0 r0 = com.amazon.aps.iva.b0.f0.Vertical
            if (r3 != r0) goto L41
        L2f:
            r0 = r1
            goto L42
        L31:
            if (r6 != r1) goto L35
            r0 = r1
            goto L36
        L35:
            r0 = r2
        L36:
            if (r0 == 0) goto L39
            goto L3c
        L39:
            r0 = 2
            if (r6 != r0) goto L3e
        L3c:
            r0 = r1
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L5e
        L41:
            r0 = r2
        L42:
            if (r0 == 0) goto L45
            return r2
        L45:
            boolean r6 = r4.x(r6)
            if (r6 == 0) goto L57
            int r5 = r5.b
            com.amazon.aps.iva.f0.h r6 = r4.c
            int r6 = r6.b()
            int r6 = r6 - r1
            if (r5 >= r6) goto L5c
            goto L5d
        L57:
            int r5 = r5.a
            if (r5 <= 0) goto L5c
            goto L5d
        L5c:
            r1 = r2
        L5d:
            return r1
        L5e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f0.g.p(com.amazon.aps.iva.f0.f$a, int):boolean");
    }

    public final boolean x(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (i == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (i == 5) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = this.e;
            if (!z3) {
                if (i == 6) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (z7) {
                        return false;
                    }
                } else {
                    if (i == 3) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    com.amazon.aps.iva.o2.l lVar = this.f;
                    if (z5) {
                        int i2 = b.a[lVar.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                if (z7) {
                                    return false;
                                }
                            } else {
                                throw new com.amazon.aps.iva.kb0.h();
                            }
                        }
                    } else {
                        if (i == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            int i3 = b.a[lVar.ordinal()];
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new com.amazon.aps.iva.kb0.h();
                                }
                            } else if (z7) {
                                return false;
                            }
                        } else {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                        }
                    }
                }
            }
            return z7;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.t1.g
    public final com.amazon.aps.iva.s1.c getValue() {
        return this;
    }
}
