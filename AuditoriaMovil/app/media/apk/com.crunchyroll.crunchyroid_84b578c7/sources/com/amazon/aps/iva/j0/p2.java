package com.amazon.aps.iva.j0;
/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class p2 {
    public e1 a;
    public final com.amazon.aps.iva.o0.i2 b;
    public final com.amazon.aps.iva.i2.h c = new com.amazon.aps.iva.i2.h();
    public com.amazon.aps.iva.i2.n0 d;
    public final com.amazon.aps.iva.o0.y1 e;
    public final com.amazon.aps.iva.o0.y1 f;
    public com.amazon.aps.iva.s1.q g;
    public final com.amazon.aps.iva.o0.y1 h;
    public com.amazon.aps.iva.c2.b i;
    public final com.amazon.aps.iva.o0.y1 j;
    public boolean k;
    public final com.amazon.aps.iva.o0.y1 l;
    public final com.amazon.aps.iva.o0.y1 m;
    public final com.amazon.aps.iva.o0.y1 n;
    public boolean o;
    public final s0 p;
    public com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> q;
    public final b r;
    public final a s;
    public final com.amazon.aps.iva.f1.k t;

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.i2.k, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.i2.k kVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar;
            com.amazon.aps.iva.kb0.q qVar;
            boolean z9;
            boolean z10;
            com.amazon.aps.iva.i2.n0 n0Var;
            int i = kVar.a;
            s0 s0Var = p2.this.p;
            s0Var.getClass();
            boolean z11 = false;
            if (i == 7) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                lVar = s0Var.a().a;
            } else {
                if (i == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    lVar = s0Var.a().b;
                } else {
                    if (i == 6) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        lVar = s0Var.a().c;
                    } else {
                        if (i == 5) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            lVar = s0Var.a().d;
                        } else {
                            if (i == 3) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                lVar = s0Var.a().e;
                            } else {
                                if (i == 4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    lVar = s0Var.a().f;
                                } else {
                                    if (i == 1) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7 || i == 0) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        lVar = null;
                                    } else {
                                        throw new IllegalStateException("invalid ImeAction".toString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (lVar != null) {
                lVar.invoke(s0Var);
                qVar = com.amazon.aps.iva.kb0.q.a;
            } else {
                qVar = null;
            }
            if (qVar == null) {
                if (i == 6) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    com.amazon.aps.iva.d1.j jVar = s0Var.b;
                    if (jVar != null) {
                        jVar.g(1);
                    } else {
                        com.amazon.aps.iva.yb0.j.m("focusManager");
                        throw null;
                    }
                } else {
                    if (i == 5) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        com.amazon.aps.iva.d1.j jVar2 = s0Var.b;
                        if (jVar2 != null) {
                            jVar2.g(2);
                        } else {
                            com.amazon.aps.iva.yb0.j.m("focusManager");
                            throw null;
                        }
                    } else {
                        if (i == 7) {
                            z11 = true;
                        }
                        if (z11 && (n0Var = s0Var.c) != null && n0Var.a()) {
                            n0Var.b.b();
                        }
                    }
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.i2.e0 e0Var) {
            String str;
            com.amazon.aps.iva.i2.e0 e0Var2 = e0Var;
            com.amazon.aps.iva.yb0.j.f(e0Var2, "it");
            String str2 = e0Var2.a.b;
            p2 p2Var = p2.this;
            com.amazon.aps.iva.c2.b bVar = p2Var.i;
            if (bVar != null) {
                str = bVar.b;
            } else {
                str = null;
            }
            if (!com.amazon.aps.iva.yb0.j.a(str2, str)) {
                i0 i0Var = i0.None;
                com.amazon.aps.iva.yb0.j.f(i0Var, "<set-?>");
                p2Var.j.setValue(i0Var);
            }
            p2Var.q.invoke(e0Var2);
            p2Var.b.invalidate();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.i2.e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public p2(e1 e1Var, com.amazon.aps.iva.o0.i2 i2Var) {
        this.a = e1Var;
        this.b = i2Var;
        Boolean bool = Boolean.FALSE;
        this.e = com.amazon.aps.iva.cq.b.c0(bool);
        this.f = com.amazon.aps.iva.cq.b.c0(new com.amazon.aps.iva.o2.e(0));
        this.h = com.amazon.aps.iva.cq.b.c0(null);
        this.j = com.amazon.aps.iva.cq.b.c0(i0.None);
        this.l = com.amazon.aps.iva.cq.b.c0(bool);
        this.m = com.amazon.aps.iva.cq.b.c0(bool);
        this.n = com.amazon.aps.iva.cq.b.c0(bool);
        this.o = true;
        this.p = new s0();
        this.q = c.h;
        this.r = new b();
        this.s = new a();
        this.t = com.amazon.aps.iva.f1.l.a();
    }

    public final i0 a() {
        return (i0) this.j.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final q2 c() {
        return (q2) this.h.getValue();
    }
}
