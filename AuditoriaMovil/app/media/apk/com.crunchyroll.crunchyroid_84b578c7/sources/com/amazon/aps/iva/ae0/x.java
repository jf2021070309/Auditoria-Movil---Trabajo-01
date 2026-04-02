package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.ae0.e0;
import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.q0;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.rc0.o0;
import com.amazon.aps.iva.rc0.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: MemberDeserializer.kt */
/* loaded from: classes4.dex */
public final class x {
    public final n a;
    public final f b;

    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.pc0.c>> {
        public final /* synthetic */ com.amazon.aps.iva.od0.p i;
        public final /* synthetic */ com.amazon.aps.iva.ae0.c j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.od0.p pVar, com.amazon.aps.iva.ae0.c cVar) {
            super(0);
            this.i = pVar;
            this.j = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends com.amazon.aps.iva.pc0.c> invoke() {
            List<? extends com.amazon.aps.iva.pc0.c> list;
            x xVar = x.this;
            e0 a = xVar.a(xVar.a.c);
            if (a != null) {
                list = com.amazon.aps.iva.lb0.x.X0(xVar.a.a.e.g(a, this.i, this.j));
            } else {
                list = null;
            }
            if (list == null) {
                return com.amazon.aps.iva.lb0.z.b;
            }
            return list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.pc0.c>> {
        public final /* synthetic */ boolean i;
        public final /* synthetic */ com.amazon.aps.iva.id0.m j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, com.amazon.aps.iva.id0.m mVar) {
            super(0);
            this.i = z;
            this.j = mVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends com.amazon.aps.iva.pc0.c> invoke() {
            List<? extends com.amazon.aps.iva.pc0.c> list;
            x xVar = x.this;
            e0 a = xVar.a(xVar.a.c);
            if (a != null) {
                n nVar = xVar.a;
                boolean z = this.i;
                com.amazon.aps.iva.id0.m mVar = this.j;
                if (z) {
                    list = com.amazon.aps.iva.lb0.x.X0(nVar.a.e.f(a, mVar));
                } else {
                    list = com.amazon.aps.iva.lb0.x.X0(nVar.a.e.b(a, mVar));
                }
            } else {
                list = null;
            }
            if (list == null) {
                return com.amazon.aps.iva.lb0.z.b;
            }
            return list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.pc0.c>> {
        public final /* synthetic */ e0 i;
        public final /* synthetic */ com.amazon.aps.iva.od0.p j;
        public final /* synthetic */ com.amazon.aps.iva.ae0.c k;
        public final /* synthetic */ int l;
        public final /* synthetic */ com.amazon.aps.iva.id0.t m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0 e0Var, com.amazon.aps.iva.od0.p pVar, com.amazon.aps.iva.ae0.c cVar, int i, com.amazon.aps.iva.id0.t tVar) {
            super(0);
            this.i = e0Var;
            this.j = pVar;
            this.k = cVar;
            this.l = i;
            this.m = tVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends com.amazon.aps.iva.pc0.c> invoke() {
            return com.amazon.aps.iva.lb0.x.X0(x.this.a.a.e.j(this.i, this.j, this.k, this.l, this.m));
        }
    }

    public x(n nVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "c");
        this.a = nVar;
        l lVar = nVar.a;
        this.b = new f(lVar.b, lVar.l);
    }

    public final e0 a(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar instanceof com.amazon.aps.iva.oc0.f0) {
            com.amazon.aps.iva.nd0.c c2 = ((com.amazon.aps.iva.oc0.f0) kVar).c();
            n nVar = this.a;
            return new e0.b(c2, nVar.b, nVar.d, nVar.g);
        } else if (kVar instanceof com.amazon.aps.iva.ce0.d) {
            return ((com.amazon.aps.iva.ce0.d) kVar).x;
        } else {
            return null;
        }
    }

    public final com.amazon.aps.iva.pc0.h b(com.amazon.aps.iva.od0.p pVar, int i, com.amazon.aps.iva.ae0.c cVar) {
        if (!com.amazon.aps.iva.kd0.b.c.c(i).booleanValue()) {
            return h.a.a;
        }
        return new com.amazon.aps.iva.ce0.r(this.a.a.a, new a(pVar, cVar));
    }

    public final com.amazon.aps.iva.pc0.h c(com.amazon.aps.iva.id0.m mVar, boolean z) {
        if (!com.amazon.aps.iva.kd0.b.c.c(mVar.e).booleanValue()) {
            return h.a.a;
        }
        return new com.amazon.aps.iva.ce0.r(this.a.a.a, new b(z, mVar));
    }

    public final com.amazon.aps.iva.ce0.c d(com.amazon.aps.iva.id0.c cVar, boolean z) {
        n a2;
        n nVar = this.a;
        com.amazon.aps.iva.oc0.k kVar = nVar.c;
        com.amazon.aps.iva.yb0.j.d(kVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        com.amazon.aps.iva.oc0.e eVar = (com.amazon.aps.iva.oc0.e) kVar;
        int i = cVar.e;
        com.amazon.aps.iva.ae0.c cVar2 = com.amazon.aps.iva.ae0.c.FUNCTION;
        com.amazon.aps.iva.ce0.c cVar3 = new com.amazon.aps.iva.ce0.c(eVar, null, b(cVar, i, cVar2), z, b.a.DECLARATION, cVar, nVar.b, nVar.d, nVar.e, nVar.g, null);
        a2 = nVar.a(cVar3, com.amazon.aps.iva.lb0.z.b, nVar.b, nVar.d, nVar.e, nVar.f);
        List<com.amazon.aps.iva.id0.t> list = cVar.f;
        com.amazon.aps.iva.yb0.j.e(list, "proto.valueParameterList");
        cVar3.R0(a2.i.h(list, cVar, cVar2), g0.a((com.amazon.aps.iva.id0.w) com.amazon.aps.iva.kd0.b.d.c(cVar.e)));
        cVar3.O0(eVar.m());
        cVar3.s = eVar.g0();
        cVar3.x = !com.amazon.aps.iva.kd0.b.n.c(cVar.e).booleanValue();
        return cVar3;
    }

    public final com.amazon.aps.iva.ce0.o e(com.amazon.aps.iva.id0.h hVar) {
        boolean z;
        int i;
        boolean z2;
        com.amazon.aps.iva.pc0.h hVar2;
        com.amazon.aps.iva.kd0.h hVar3;
        n a2;
        o0 o0Var;
        com.amazon.aps.iva.oc0.e eVar;
        q0 q0Var;
        com.amazon.aps.iva.ee0.e0 g;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(hVar, "proto");
        boolean z4 = true;
        if ((hVar.d & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = hVar.e;
        } else {
            int i2 = hVar.f;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        int i3 = i;
        com.amazon.aps.iva.ae0.c cVar = com.amazon.aps.iva.ae0.c.FUNCTION;
        com.amazon.aps.iva.pc0.h b2 = b(hVar, i3, cVar);
        int i4 = hVar.d;
        if ((i4 & 32) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if ((i4 & 64) == 64) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                z4 = false;
            }
        }
        com.amazon.aps.iva.pc0.h hVar4 = h.a.a;
        n nVar = this.a;
        if (z4) {
            hVar2 = new com.amazon.aps.iva.ce0.a(nVar.a.a, new y(this, hVar, cVar));
        } else {
            hVar2 = hVar4;
        }
        com.amazon.aps.iva.nd0.c g2 = com.amazon.aps.iva.ud0.b.g(nVar.c);
        int i5 = hVar.g;
        com.amazon.aps.iva.kd0.c cVar2 = nVar.b;
        if (com.amazon.aps.iva.yb0.j.a(g2.c(com.amazon.aps.iva.aq.j.w(cVar2, i5)), h0.a)) {
            hVar3 = com.amazon.aps.iva.kd0.h.b;
        } else {
            hVar3 = nVar.e;
        }
        com.amazon.aps.iva.pc0.h hVar5 = hVar2;
        com.amazon.aps.iva.ce0.o oVar = new com.amazon.aps.iva.ce0.o(nVar.c, null, b2, com.amazon.aps.iva.aq.j.w(cVar2, hVar.g), g0.b((com.amazon.aps.iva.id0.i) com.amazon.aps.iva.kd0.b.o.c(i3)), hVar, nVar.b, nVar.d, hVar3, nVar.g, null);
        List<com.amazon.aps.iva.id0.r> list = hVar.j;
        com.amazon.aps.iva.yb0.j.e(list, "proto.typeParameterList");
        a2 = nVar.a(oVar, list, nVar.b, nVar.d, nVar.e, nVar.f);
        com.amazon.aps.iva.kd0.g gVar = nVar.d;
        com.amazon.aps.iva.id0.p b3 = com.amazon.aps.iva.kd0.f.b(hVar, gVar);
        i0 i0Var = a2.h;
        if (b3 != null && (g = i0Var.g(b3)) != null) {
            o0Var = com.amazon.aps.iva.qd0.h.h(oVar, g, hVar5);
        } else {
            o0Var = null;
        }
        com.amazon.aps.iva.oc0.k kVar = nVar.c;
        if (kVar instanceof com.amazon.aps.iva.oc0.e) {
            eVar = (com.amazon.aps.iva.oc0.e) kVar;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            q0Var = eVar.F0();
        } else {
            q0Var = null;
        }
        com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
        ArrayList arrayList = hVar.m;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list2 = hVar.n;
            com.amazon.aps.iva.yb0.j.e(list2, "contextReceiverTypeIdList");
            List<Integer> list3 = list2;
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
            for (Integer num : list3) {
                com.amazon.aps.iva.yb0.j.e(num, "it");
                arrayList2.add(gVar.a(num.intValue()));
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        int i6 = 0;
        for (Object obj : arrayList) {
            int i7 = i6 + 1;
            if (i6 >= 0) {
                o0 b4 = com.amazon.aps.iva.qd0.h.b(oVar, i0Var.g((com.amazon.aps.iva.id0.p) obj), null, hVar4, i6);
                if (b4 != null) {
                    arrayList3.add(b4);
                }
                i6 = i7;
            } else {
                f1.S();
                throw null;
            }
        }
        List<y0> b5 = i0Var.b();
        List<com.amazon.aps.iva.id0.t> list4 = hVar.p;
        com.amazon.aps.iva.yb0.j.e(list4, "proto.valueParameterList");
        oVar.T0(o0Var, q0Var, arrayList3, b5, a2.i.h(list4, hVar, com.amazon.aps.iva.ae0.c.FUNCTION), i0Var.g(com.amazon.aps.iva.kd0.f.c(hVar, gVar)), f0.a((com.amazon.aps.iva.id0.j) com.amazon.aps.iva.kd0.b.e.c(i3)), g0.a((com.amazon.aps.iva.id0.w) com.amazon.aps.iva.kd0.b.d.c(i3)), com.amazon.aps.iva.lb0.a0.b);
        oVar.n = l1.c(com.amazon.aps.iva.kd0.b.p, i3, "IS_OPERATOR.get(flags)");
        oVar.o = l1.c(com.amazon.aps.iva.kd0.b.q, i3, "IS_INFIX.get(flags)");
        oVar.p = l1.c(com.amazon.aps.iva.kd0.b.t, i3, "IS_EXTERNAL_FUNCTION.get(flags)");
        oVar.q = l1.c(com.amazon.aps.iva.kd0.b.r, i3, "IS_INLINE.get(flags)");
        oVar.r = l1.c(com.amazon.aps.iva.kd0.b.s, i3, "IS_TAILREC.get(flags)");
        oVar.w = l1.c(com.amazon.aps.iva.kd0.b.u, i3, "IS_SUSPEND.get(flags)");
        oVar.s = l1.c(com.amazon.aps.iva.kd0.b.v, i3, "IS_EXPECT_FUNCTION.get(flags)");
        oVar.x = !com.amazon.aps.iva.kd0.b.w.c(i3).booleanValue();
        nVar.a.m.a(hVar, oVar, gVar, i0Var);
        return oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.ce0.n f(com.amazon.aps.iva.id0.m r31) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ae0.x.f(com.amazon.aps.iva.id0.m):com.amazon.aps.iva.ce0.n");
    }

    public final com.amazon.aps.iva.ce0.p g(com.amazon.aps.iva.id0.q qVar) {
        n nVar;
        com.amazon.aps.iva.pc0.h iVar;
        n a2;
        boolean z;
        boolean z2;
        com.amazon.aps.iva.id0.p a3;
        boolean z3;
        com.amazon.aps.iva.id0.p a4;
        com.amazon.aps.iva.yb0.j.f(qVar, "proto");
        List<com.amazon.aps.iva.id0.a> list = qVar.l;
        com.amazon.aps.iva.yb0.j.e(list, "proto.annotationList");
        List<com.amazon.aps.iva.id0.a> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            nVar = this.a;
            if (!hasNext) {
                break;
            }
            com.amazon.aps.iva.id0.a aVar = (com.amazon.aps.iva.id0.a) it.next();
            com.amazon.aps.iva.yb0.j.e(aVar, "it");
            arrayList.add(this.b.a(aVar, nVar.b));
        }
        if (arrayList.isEmpty()) {
            iVar = h.a.a;
        } else {
            iVar = new com.amazon.aps.iva.pc0.i(arrayList);
        }
        com.amazon.aps.iva.ce0.p pVar = new com.amazon.aps.iva.ce0.p(nVar.a.a, nVar.c, iVar, com.amazon.aps.iva.aq.j.w(nVar.b, qVar.f), g0.a((com.amazon.aps.iva.id0.w) com.amazon.aps.iva.kd0.b.d.c(qVar.e)), qVar, nVar.b, nVar.d, nVar.e, nVar.g);
        List<com.amazon.aps.iva.id0.r> list3 = qVar.g;
        com.amazon.aps.iva.yb0.j.e(list3, "proto.typeParameterList");
        a2 = nVar.a(pVar, list3, nVar.b, nVar.d, nVar.e, nVar.f);
        i0 i0Var = a2.h;
        List<y0> b2 = i0Var.b();
        com.amazon.aps.iva.kd0.g gVar = nVar.d;
        com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
        int i = qVar.d;
        boolean z4 = true;
        if ((i & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a3 = qVar.h;
            com.amazon.aps.iva.yb0.j.e(a3, "underlyingType");
        } else {
            if ((i & 8) == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                a3 = gVar.a(qVar.i);
            } else {
                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
            }
        }
        m0 d = i0Var.d(a3, false);
        com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
        int i2 = qVar.d;
        if ((i2 & 16) == 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            a4 = qVar.j;
            com.amazon.aps.iva.yb0.j.e(a4, "expandedType");
        } else {
            if ((i2 & 32) != 32) {
                z4 = false;
            }
            if (z4) {
                a4 = gVar.a(qVar.k);
            } else {
                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
            }
        }
        pVar.E0(b2, d, i0Var.d(a4, false));
        return pVar;
    }

    public final List<c1> h(List<com.amazon.aps.iva.id0.t> list, com.amazon.aps.iva.od0.p pVar, com.amazon.aps.iva.ae0.c cVar) {
        int i;
        com.amazon.aps.iva.pc0.h hVar;
        boolean z;
        boolean z2;
        com.amazon.aps.iva.id0.p pVar2;
        com.amazon.aps.iva.ee0.e0 e0Var;
        n nVar = this.a;
        com.amazon.aps.iva.oc0.k kVar = nVar.c;
        com.amazon.aps.iva.yb0.j.d(kVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        com.amazon.aps.iva.oc0.a aVar = (com.amazon.aps.iva.oc0.a) kVar;
        com.amazon.aps.iva.oc0.k d = aVar.d();
        com.amazon.aps.iva.yb0.j.e(d, "callableDescriptor.containingDeclaration");
        e0 a2 = a(d);
        List<com.amazon.aps.iva.id0.t> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                com.amazon.aps.iva.id0.t tVar = (com.amazon.aps.iva.id0.t) obj;
                boolean z3 = true;
                if ((tVar.d & 1) != 1) {
                    z3 = false;
                }
                if (z3) {
                    i = tVar.e;
                } else {
                    i = 0;
                }
                if (a2 != null && l1.c(com.amazon.aps.iva.kd0.b.c, i, "HAS_ANNOTATIONS.get(flags)")) {
                    hVar = new com.amazon.aps.iva.ce0.r(nVar.a.a, new c(a2, pVar, cVar, i2, tVar));
                } else {
                    hVar = h.a.a;
                }
                com.amazon.aps.iva.nd0.f w = com.amazon.aps.iva.aq.j.w(nVar.b, tVar.f);
                com.amazon.aps.iva.kd0.g gVar = nVar.d;
                com.amazon.aps.iva.id0.p e = com.amazon.aps.iva.kd0.f.e(tVar, gVar);
                i0 i0Var = nVar.h;
                com.amazon.aps.iva.ee0.e0 g = i0Var.g(e);
                boolean c2 = l1.c(com.amazon.aps.iva.kd0.b.G, i, "DECLARES_DEFAULT_VALUE.get(flags)");
                boolean c3 = l1.c(com.amazon.aps.iva.kd0.b.H, i, "IS_CROSSINLINE.get(flags)");
                Boolean c4 = com.amazon.aps.iva.kd0.b.I.c(i);
                com.amazon.aps.iva.yb0.j.e(c4, "IS_NOINLINE.get(flags)");
                boolean booleanValue = c4.booleanValue();
                com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
                int i4 = tVar.d;
                if ((i4 & 16) == 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    pVar2 = tVar.i;
                } else {
                    if ((i4 & 32) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        pVar2 = gVar.a(tVar.j);
                    } else {
                        pVar2 = null;
                    }
                }
                if (pVar2 != null) {
                    e0Var = i0Var.g(pVar2);
                } else {
                    e0Var = null;
                }
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new v0(aVar, null, i2, hVar, w, g, c2, c3, booleanValue, e0Var, t0.a));
                arrayList = arrayList2;
                i2 = i3;
            } else {
                f1.S();
                throw null;
            }
        }
        return com.amazon.aps.iva.lb0.x.X0(arrayList);
    }
}
