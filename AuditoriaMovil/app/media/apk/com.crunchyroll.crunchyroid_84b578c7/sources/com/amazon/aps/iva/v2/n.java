package com.amazon.aps.iva.v2;

import com.amazon.aps.iva.u2.d;
import com.amazon.aps.iva.u2.e;
import com.amazon.aps.iva.v2.f;
import com.amazon.aps.iva.v2.p;
import java.util.ArrayList;
/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public final class n extends p {
    public final f k;
    public com.amazon.aps.iva.v2.a l;

    /* compiled from: VerticalWidgetRun.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[p.b.values().length];
            a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(com.amazon.aps.iva.u2.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.k = fVar;
        this.l = null;
        this.h.e = f.a.TOP;
        this.i.e = f.a.BOTTOM;
        fVar.e = f.a.BASELINE;
        this.f = 1;
    }

    @Override // com.amazon.aps.iva.v2.p, com.amazon.aps.iva.v2.d
    public final void a(d dVar) {
        g gVar;
        float f;
        float f2;
        float f3;
        int i;
        if (a.a[this.j.ordinal()] != 3) {
            g gVar2 = this.e;
            if (gVar2.c && !gVar2.j && this.d == e.b.MATCH_CONSTRAINT) {
                com.amazon.aps.iva.u2.e eVar = this.b;
                int i2 = eVar.t;
                if (i2 != 2) {
                    if (i2 == 3) {
                        g gVar3 = eVar.d.e;
                        if (gVar3.j) {
                            int i3 = eVar.a0;
                            if (i3 != -1) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        i = 0;
                                        gVar2.d(i);
                                    } else {
                                        f = gVar3.g;
                                        f2 = eVar.Z;
                                    }
                                } else {
                                    f3 = gVar3.g * eVar.Z;
                                    i = (int) (f3 + 0.5f);
                                    gVar2.d(i);
                                }
                            } else {
                                f = gVar3.g;
                                f2 = eVar.Z;
                            }
                            f3 = f / f2;
                            i = (int) (f3 + 0.5f);
                            gVar2.d(i);
                        }
                    }
                } else {
                    com.amazon.aps.iva.u2.e eVar2 = eVar.W;
                    if (eVar2 != null) {
                        if (eVar2.e.e.j) {
                            gVar2.d((int) ((gVar.g * eVar.A) + 0.5f));
                        }
                    }
                }
            }
            f fVar = this.h;
            if (fVar.c) {
                f fVar2 = this.i;
                if (fVar2.c) {
                    if (fVar.j && fVar2.j && gVar2.j) {
                        return;
                    }
                    boolean z = gVar2.j;
                    ArrayList arrayList = fVar.l;
                    ArrayList arrayList2 = fVar2.l;
                    if (!z && this.d == e.b.MATCH_CONSTRAINT) {
                        com.amazon.aps.iva.u2.e eVar3 = this.b;
                        if (eVar3.s == 0 && !eVar3.z()) {
                            int i4 = ((f) arrayList.get(0)).g + fVar.f;
                            int i5 = ((f) arrayList2.get(0)).g + fVar2.f;
                            fVar.d(i4);
                            fVar2.d(i5);
                            gVar2.d(i5 - i4);
                            return;
                        }
                    }
                    if (!gVar2.j && this.d == e.b.MATCH_CONSTRAINT && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        int i6 = (((f) arrayList2.get(0)).g + fVar2.f) - (((f) arrayList.get(0)).g + fVar.f);
                        int i7 = gVar2.m;
                        if (i6 < i7) {
                            gVar2.d(i6);
                        } else {
                            gVar2.d(i7);
                        }
                    }
                    if (gVar2.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i8 = fVar3.g;
                        int i9 = fVar.f + i8;
                        int i10 = fVar4.g;
                        int i11 = fVar2.f + i10;
                        float f4 = this.b.h0;
                        if (fVar3 == fVar4) {
                            f4 = 0.5f;
                        } else {
                            i8 = i9;
                            i10 = i11;
                        }
                        fVar.d((int) ((((i10 - i8) - gVar2.g) * f4) + i8 + 0.5f));
                        fVar2.d(fVar.g + gVar2.g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        com.amazon.aps.iva.u2.e eVar4 = this.b;
        l(eVar4.L, eVar4.N, 1);
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void d() {
        com.amazon.aps.iva.u2.e eVar;
        com.amazon.aps.iva.u2.e eVar2;
        com.amazon.aps.iva.u2.e eVar3;
        com.amazon.aps.iva.u2.e eVar4;
        com.amazon.aps.iva.u2.e eVar5 = this.b;
        boolean z = eVar5.a;
        g gVar = this.e;
        if (z) {
            gVar.d(eVar5.l());
        }
        boolean z2 = gVar.j;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z2) {
            com.amazon.aps.iva.u2.e eVar6 = this.b;
            this.d = eVar6.V[1];
            if (eVar6.F) {
                this.l = new com.amazon.aps.iva.v2.a(this);
            }
            e.b bVar = this.d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVar4 = this.b.W) != null && eVar4.V[1] == e.b.FIXED) {
                    int l = (eVar4.l() - this.b.L.e()) - this.b.N.e();
                    p.b(fVar2, eVar4.e.h, this.b.L.e());
                    p.b(fVar, eVar4.e.i, -this.b.N.e());
                    gVar.d(l);
                    return;
                } else if (bVar == e.b.FIXED) {
                    gVar.d(this.b.l());
                }
            }
        } else if (this.d == e.b.MATCH_PARENT && (eVar2 = (eVar = this.b).W) != null && eVar2.V[1] == e.b.FIXED) {
            p.b(fVar2, eVar2.e.h, eVar.L.e());
            p.b(fVar, eVar2.e.i, -this.b.N.e());
            return;
        }
        boolean z3 = gVar.j;
        f fVar3 = this.k;
        if (z3) {
            com.amazon.aps.iva.u2.e eVar7 = this.b;
            if (eVar7.a) {
                com.amazon.aps.iva.u2.d[] dVarArr = eVar7.S;
                com.amazon.aps.iva.u2.d dVar = dVarArr[2];
                com.amazon.aps.iva.u2.d dVar2 = dVar.f;
                if (dVar2 != null && dVarArr[3].f != null) {
                    if (eVar7.z()) {
                        fVar2.f = this.b.S[2].e();
                        fVar.f = -this.b.S[3].e();
                    } else {
                        f h = p.h(this.b.S[2]);
                        if (h != null) {
                            p.b(fVar2, h, this.b.S[2].e());
                        }
                        f h2 = p.h(this.b.S[3]);
                        if (h2 != null) {
                            p.b(fVar, h2, -this.b.S[3].e());
                        }
                        fVar2.b = true;
                        fVar.b = true;
                    }
                    com.amazon.aps.iva.u2.e eVar8 = this.b;
                    if (eVar8.F) {
                        p.b(fVar3, fVar2, eVar8.d0);
                        return;
                    }
                    return;
                } else if (dVar2 != null) {
                    f h3 = p.h(dVar);
                    if (h3 != null) {
                        p.b(fVar2, h3, this.b.S[2].e());
                        p.b(fVar, fVar2, gVar.g);
                        com.amazon.aps.iva.u2.e eVar9 = this.b;
                        if (eVar9.F) {
                            p.b(fVar3, fVar2, eVar9.d0);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    com.amazon.aps.iva.u2.d dVar3 = dVarArr[3];
                    if (dVar3.f != null) {
                        f h4 = p.h(dVar3);
                        if (h4 != null) {
                            p.b(fVar, h4, -this.b.S[3].e());
                            p.b(fVar2, fVar, -gVar.g);
                        }
                        com.amazon.aps.iva.u2.e eVar10 = this.b;
                        if (eVar10.F) {
                            p.b(fVar3, fVar2, eVar10.d0);
                            return;
                        }
                        return;
                    }
                    com.amazon.aps.iva.u2.d dVar4 = dVarArr[4];
                    if (dVar4.f != null) {
                        f h5 = p.h(dVar4);
                        if (h5 != null) {
                            p.b(fVar3, h5, 0);
                            p.b(fVar2, fVar3, -this.b.d0);
                            p.b(fVar, fVar2, gVar.g);
                            return;
                        }
                        return;
                    } else if (!(eVar7 instanceof com.amazon.aps.iva.u2.i) && eVar7.W != null && eVar7.j(d.b.CENTER).f == null) {
                        com.amazon.aps.iva.u2.e eVar11 = this.b;
                        p.b(fVar2, eVar11.W.e.h, eVar11.t());
                        p.b(fVar, fVar2, gVar.g);
                        com.amazon.aps.iva.u2.e eVar12 = this.b;
                        if (eVar12.F) {
                            p.b(fVar3, fVar2, eVar12.d0);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        ArrayList arrayList = gVar.l;
        if (!z3 && this.d == e.b.MATCH_CONSTRAINT) {
            com.amazon.aps.iva.u2.e eVar13 = this.b;
            int i = eVar13.t;
            ArrayList arrayList2 = gVar.k;
            if (i != 2) {
                if (i == 3 && !eVar13.z()) {
                    com.amazon.aps.iva.u2.e eVar14 = this.b;
                    if (eVar14.s != 3) {
                        g gVar2 = eVar14.d.e;
                        arrayList.add(gVar2);
                        gVar2.k.add(gVar);
                        gVar.b = true;
                        arrayList2.add(fVar2);
                        arrayList2.add(fVar);
                    }
                }
            } else {
                com.amazon.aps.iva.u2.e eVar15 = eVar13.W;
                if (eVar15 != null) {
                    g gVar3 = eVar15.e.e;
                    arrayList.add(gVar3);
                    gVar3.k.add(gVar);
                    gVar.b = true;
                    arrayList2.add(fVar2);
                    arrayList2.add(fVar);
                }
            }
        } else {
            gVar.b(this);
        }
        com.amazon.aps.iva.u2.e eVar16 = this.b;
        com.amazon.aps.iva.u2.d[] dVarArr2 = eVar16.S;
        com.amazon.aps.iva.u2.d dVar5 = dVarArr2[2];
        com.amazon.aps.iva.u2.d dVar6 = dVar5.f;
        if (dVar6 != null && dVarArr2[3].f != null) {
            if (eVar16.z()) {
                fVar2.f = this.b.S[2].e();
                fVar.f = -this.b.S[3].e();
            } else {
                f h6 = p.h(this.b.S[2]);
                f h7 = p.h(this.b.S[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = p.b.CENTER;
            }
            if (this.b.F) {
                c(fVar3, fVar2, 1, this.l);
            }
        } else if (dVar6 != null) {
            f h8 = p.h(dVar5);
            if (h8 != null) {
                p.b(fVar2, h8, this.b.S[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.b.F) {
                    c(fVar3, fVar2, 1, this.l);
                }
                e.b bVar2 = this.d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3) {
                    com.amazon.aps.iva.u2.e eVar17 = this.b;
                    if (eVar17.Z > 0.0f) {
                        l lVar = eVar17.d;
                        if (lVar.d == bVar3) {
                            lVar.e.k.add(gVar);
                            arrayList.add(this.b.d.e);
                            gVar.a = this;
                        }
                    }
                }
            }
        } else {
            com.amazon.aps.iva.u2.d dVar7 = dVarArr2[3];
            if (dVar7.f != null) {
                f h9 = p.h(dVar7);
                if (h9 != null) {
                    p.b(fVar, h9, -this.b.S[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.b.F) {
                        c(fVar3, fVar2, 1, this.l);
                    }
                }
            } else {
                com.amazon.aps.iva.u2.d dVar8 = dVarArr2[4];
                if (dVar8.f != null) {
                    f h10 = p.h(dVar8);
                    if (h10 != null) {
                        p.b(fVar3, h10, 0);
                        c(fVar2, fVar3, -1, this.l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(eVar16 instanceof com.amazon.aps.iva.u2.i) && (eVar3 = eVar16.W) != null) {
                    p.b(fVar2, eVar3.e.h, eVar16.t());
                    c(fVar, fVar2, 1, gVar);
                    if (this.b.F) {
                        c(fVar3, fVar2, 1, this.l);
                    }
                    e.b bVar4 = this.d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5) {
                        com.amazon.aps.iva.u2.e eVar18 = this.b;
                        if (eVar18.Z > 0.0f) {
                            l lVar2 = eVar18.d;
                            if (lVar2.d == bVar5) {
                                lVar2.e.k.add(gVar);
                                arrayList.add(this.b.d.e);
                                gVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            gVar.c = true;
        }
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.b.c0 = fVar.g;
        }
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // com.amazon.aps.iva.v2.p
    public final boolean k() {
        if (this.d != e.b.MATCH_CONSTRAINT || this.b.t == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.g = false;
        f fVar = this.h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.j = false;
        f fVar3 = this.k;
        fVar3.c();
        fVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.k0;
    }
}
