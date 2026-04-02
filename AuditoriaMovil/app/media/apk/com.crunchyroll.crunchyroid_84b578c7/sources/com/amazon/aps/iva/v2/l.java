package com.amazon.aps.iva.v2;

import com.amazon.aps.iva.u2.d;
import com.amazon.aps.iva.u2.e;
import com.amazon.aps.iva.v2.f;
import com.amazon.aps.iva.v2.p;
import java.util.ArrayList;
/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public final class l extends p {
    public static final int[] k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
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

    public l(com.amazon.aps.iva.u2.e eVar) {
        super(eVar);
        this.h.e = f.a.LEFT;
        this.i.e = f.a.RIGHT;
        this.f = 0;
    }

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0248, code lost:
        if (r15 != 1) goto L127;
     */
    @Override // com.amazon.aps.iva.v2.p, com.amazon.aps.iva.v2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.amazon.aps.iva.v2.d r23) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v2.l.a(com.amazon.aps.iva.v2.d):void");
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void d() {
        com.amazon.aps.iva.u2.e eVar;
        com.amazon.aps.iva.u2.e eVar2;
        e.b bVar;
        com.amazon.aps.iva.u2.e eVar3;
        com.amazon.aps.iva.u2.e eVar4;
        e.b bVar2;
        com.amazon.aps.iva.u2.e eVar5 = this.b;
        boolean z = eVar5.a;
        g gVar = this.e;
        if (z) {
            gVar.d(eVar5.r());
        }
        boolean z2 = gVar.j;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z2) {
            com.amazon.aps.iva.u2.e eVar6 = this.b;
            e.b bVar3 = eVar6.V[0];
            this.d = bVar3;
            if (bVar3 != e.b.MATCH_CONSTRAINT) {
                e.b bVar4 = e.b.MATCH_PARENT;
                if (bVar3 == bVar4 && (eVar4 = eVar6.W) != null && ((bVar2 = eVar4.V[0]) == e.b.FIXED || bVar2 == bVar4)) {
                    int r = (eVar4.r() - this.b.K.e()) - this.b.M.e();
                    p.b(fVar2, eVar4.d.h, this.b.K.e());
                    p.b(fVar, eVar4.d.i, -this.b.M.e());
                    gVar.d(r);
                    return;
                } else if (bVar3 == e.b.FIXED) {
                    gVar.d(eVar6.r());
                }
            }
        } else {
            e.b bVar5 = this.d;
            e.b bVar6 = e.b.MATCH_PARENT;
            if (bVar5 == bVar6 && (eVar2 = (eVar = this.b).W) != null && ((bVar = eVar2.V[0]) == e.b.FIXED || bVar == bVar6)) {
                p.b(fVar2, eVar2.d.h, eVar.K.e());
                p.b(fVar, eVar2.d.i, -this.b.M.e());
                return;
            }
        }
        if (gVar.j) {
            com.amazon.aps.iva.u2.e eVar7 = this.b;
            if (eVar7.a) {
                com.amazon.aps.iva.u2.d[] dVarArr = eVar7.S;
                com.amazon.aps.iva.u2.d dVar = dVarArr[0];
                com.amazon.aps.iva.u2.d dVar2 = dVar.f;
                if (dVar2 != null && dVarArr[1].f != null) {
                    if (eVar7.y()) {
                        fVar2.f = this.b.S[0].e();
                        fVar.f = -this.b.S[1].e();
                        return;
                    }
                    f h = p.h(this.b.S[0]);
                    if (h != null) {
                        p.b(fVar2, h, this.b.S[0].e());
                    }
                    f h2 = p.h(this.b.S[1]);
                    if (h2 != null) {
                        p.b(fVar, h2, -this.b.S[1].e());
                    }
                    fVar2.b = true;
                    fVar.b = true;
                    return;
                } else if (dVar2 != null) {
                    f h3 = p.h(dVar);
                    if (h3 != null) {
                        p.b(fVar2, h3, this.b.S[0].e());
                        p.b(fVar, fVar2, gVar.g);
                        return;
                    }
                    return;
                } else {
                    com.amazon.aps.iva.u2.d dVar3 = dVarArr[1];
                    if (dVar3.f != null) {
                        f h4 = p.h(dVar3);
                        if (h4 != null) {
                            p.b(fVar, h4, -this.b.S[1].e());
                            p.b(fVar2, fVar, -gVar.g);
                            return;
                        }
                        return;
                    } else if (!(eVar7 instanceof com.amazon.aps.iva.u2.i) && eVar7.W != null && eVar7.j(d.b.CENTER).f == null) {
                        com.amazon.aps.iva.u2.e eVar8 = this.b;
                        p.b(fVar2, eVar8.W.d.h, eVar8.s());
                        p.b(fVar, fVar2, gVar.g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.d == e.b.MATCH_CONSTRAINT) {
            com.amazon.aps.iva.u2.e eVar9 = this.b;
            int i = eVar9.s;
            ArrayList arrayList = gVar.k;
            ArrayList arrayList2 = gVar.l;
            if (i != 2) {
                if (i == 3) {
                    if (eVar9.t == 3) {
                        fVar2.a = this;
                        fVar.a = this;
                        n nVar = eVar9.e;
                        nVar.h.a = this;
                        nVar.i.a = this;
                        gVar.a = this;
                        if (eVar9.z()) {
                            arrayList2.add(this.b.e.e);
                            this.b.e.e.k.add(gVar);
                            n nVar2 = this.b.e;
                            nVar2.e.a = this;
                            arrayList2.add(nVar2.h);
                            arrayList2.add(this.b.e.i);
                            this.b.e.h.k.add(gVar);
                            this.b.e.i.k.add(gVar);
                        } else if (this.b.y()) {
                            this.b.e.e.l.add(gVar);
                            arrayList.add(this.b.e.e);
                        } else {
                            this.b.e.e.l.add(gVar);
                        }
                    } else {
                        g gVar2 = eVar9.e.e;
                        arrayList2.add(gVar2);
                        gVar2.k.add(gVar);
                        this.b.e.h.k.add(gVar);
                        this.b.e.i.k.add(gVar);
                        gVar.b = true;
                        arrayList.add(fVar2);
                        arrayList.add(fVar);
                        fVar2.l.add(gVar);
                        fVar.l.add(gVar);
                    }
                }
            } else {
                com.amazon.aps.iva.u2.e eVar10 = eVar9.W;
                if (eVar10 != null) {
                    g gVar3 = eVar10.e.e;
                    arrayList2.add(gVar3);
                    gVar3.k.add(gVar);
                    gVar.b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            }
        }
        com.amazon.aps.iva.u2.e eVar11 = this.b;
        com.amazon.aps.iva.u2.d[] dVarArr2 = eVar11.S;
        com.amazon.aps.iva.u2.d dVar4 = dVarArr2[0];
        com.amazon.aps.iva.u2.d dVar5 = dVar4.f;
        if (dVar5 != null && dVarArr2[1].f != null) {
            if (eVar11.y()) {
                fVar2.f = this.b.S[0].e();
                fVar.f = -this.b.S[1].e();
                return;
            }
            f h5 = p.h(this.b.S[0]);
            f h6 = p.h(this.b.S[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = p.b.CENTER;
        } else if (dVar5 != null) {
            f h7 = p.h(dVar4);
            if (h7 != null) {
                p.b(fVar2, h7, this.b.S[0].e());
                c(fVar, fVar2, 1, gVar);
            }
        } else {
            com.amazon.aps.iva.u2.d dVar6 = dVarArr2[1];
            if (dVar6.f != null) {
                f h8 = p.h(dVar6);
                if (h8 != null) {
                    p.b(fVar, h8, -this.b.S[1].e());
                    c(fVar2, fVar, -1, gVar);
                }
            } else if (!(eVar11 instanceof com.amazon.aps.iva.u2.i) && (eVar3 = eVar11.W) != null) {
                p.b(fVar2, eVar3.d.h, eVar11.s());
                c(fVar, fVar2, 1, gVar);
            }
        }
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.b.b0 = fVar.g;
        }
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // com.amazon.aps.iva.v2.p
    public final boolean k() {
        if (this.d != e.b.MATCH_CONSTRAINT || this.b.s == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.g = false;
        f fVar = this.h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.k0;
    }
}
