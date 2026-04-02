package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.c0;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e1;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.l0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.p0;
import com.amazon.aps.iva.ee0.q0;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ee0.u0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.ee0.y;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.oc0.a1;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.w;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.yb0.e0;
import java.util.Collection;
import java.util.List;
/* compiled from: ClassicTypeSystemContext.kt */
/* loaded from: classes4.dex */
public interface b extends com.amazon.aps.iva.he0.n {

    /* compiled from: ClassicTypeSystemContext.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static com.amazon.aps.iva.he0.r A(com.amazon.aps.iva.he0.k kVar) {
            com.amazon.aps.iva.yb0.j.f(kVar, "$receiver");
            if (kVar instanceof j1) {
                v1 c = ((j1) kVar).c();
                com.amazon.aps.iva.yb0.j.e(c, "this.projectionKind");
                return com.amazon.aps.iva.he0.o.a(c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + e0.a(kVar.getClass())).toString());
        }

        public static com.amazon.aps.iva.he0.r B(com.amazon.aps.iva.he0.m mVar) {
            com.amazon.aps.iva.yb0.j.f(mVar, "$receiver");
            if (mVar instanceof y0) {
                v1 i = ((y0) mVar).i();
                com.amazon.aps.iva.yb0.j.e(i, "this.variance");
                return com.amazon.aps.iva.he0.o.a(i);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + e0.a(mVar.getClass())).toString());
        }

        public static boolean C(com.amazon.aps.iva.he0.h hVar, com.amazon.aps.iva.nd0.c cVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "$receiver");
            if (hVar instanceof com.amazon.aps.iva.ee0.e0) {
                return ((com.amazon.aps.iva.ee0.e0) hVar).getAnnotations().A(cVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + e0.a(hVar.getClass())).toString());
        }

        public static boolean D(com.amazon.aps.iva.he0.m mVar, com.amazon.aps.iva.he0.l lVar) {
            boolean z;
            if (mVar instanceof y0) {
                if (lVar == null) {
                    z = true;
                } else {
                    z = lVar instanceof c1;
                }
                if (z) {
                    return com.amazon.aps.iva.da0.a.q((y0) mVar, (c1) lVar, null);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + e0.a(mVar.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + e0.a(mVar.getClass())).toString());
        }

        public static boolean E(com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.i iVar2) {
            com.amazon.aps.iva.yb0.j.f(iVar, "a");
            com.amazon.aps.iva.yb0.j.f(iVar2, "b");
            if (iVar instanceof m0) {
                if (iVar2 instanceof m0) {
                    if (((m0) iVar).G0() == ((m0) iVar2).G0()) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar2 + ", " + e0.a(iVar2.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + e0.a(iVar.getClass())).toString());
        }

        public static boolean F(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                return com.amazon.aps.iva.lc0.k.K((c1) lVar, o.a.a);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static boolean G(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                return ((c1) lVar).k() instanceof com.amazon.aps.iva.oc0.e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static boolean H(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.oc0.e eVar;
            boolean z;
            if (lVar instanceof c1) {
                com.amazon.aps.iva.oc0.h k = ((c1) lVar).k();
                if (k instanceof com.amazon.aps.iva.oc0.e) {
                    eVar = (com.amazon.aps.iva.oc0.e) k;
                } else {
                    eVar = null;
                }
                if (eVar == null) {
                    return false;
                }
                if (eVar.o() == b0.FINAL && eVar.getKind() != com.amazon.aps.iva.oc0.f.ENUM_CLASS) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || eVar.getKind() == com.amazon.aps.iva.oc0.f.ENUM_ENTRY || eVar.getKind() == com.amazon.aps.iva.oc0.f.ANNOTATION_CLASS) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static boolean I(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                return ((c1) lVar).l();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static boolean J(com.amazon.aps.iva.he0.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "$receiver");
            if (hVar instanceof com.amazon.aps.iva.ee0.e0) {
                return l1.D((com.amazon.aps.iva.ee0.e0) hVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + e0.a(hVar.getClass())).toString());
        }

        public static boolean K(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.oc0.e eVar;
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                com.amazon.aps.iva.oc0.h k = ((c1) lVar).k();
                a1<m0> a1Var = null;
                if (k instanceof com.amazon.aps.iva.oc0.e) {
                    eVar = (com.amazon.aps.iva.oc0.e) k;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    a1Var = eVar.R();
                }
                return a1Var instanceof w;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static boolean L(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                return lVar instanceof com.amazon.aps.iva.sd0.p;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static boolean M(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                return lVar instanceof c0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static boolean N(com.amazon.aps.iva.he0.i iVar) {
            com.amazon.aps.iva.yb0.j.f(iVar, "$receiver");
            if (iVar instanceof m0) {
                return ((m0) iVar).J0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + e0.a(iVar.getClass())).toString());
        }

        public static boolean O(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                return com.amazon.aps.iva.lc0.k.K((c1) lVar, o.a.b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static boolean P(com.amazon.aps.iva.he0.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "$receiver");
            if (hVar instanceof com.amazon.aps.iva.ee0.e0) {
                return s1.g((com.amazon.aps.iva.ee0.e0) hVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + e0.a(hVar.getClass())).toString());
        }

        public static boolean Q(com.amazon.aps.iva.he0.i iVar) {
            com.amazon.aps.iva.yb0.j.f(iVar, "$receiver");
            if (iVar instanceof com.amazon.aps.iva.ee0.e0) {
                return com.amazon.aps.iva.lc0.k.H((com.amazon.aps.iva.ee0.e0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + e0.a(iVar.getClass())).toString());
        }

        public static boolean R(com.amazon.aps.iva.he0.d dVar) {
            if (dVar instanceof h) {
                return ((h) dVar).h;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + e0.a(dVar.getClass())).toString());
        }

        public static boolean S(com.amazon.aps.iva.he0.k kVar) {
            com.amazon.aps.iva.yb0.j.f(kVar, "$receiver");
            if (kVar instanceof j1) {
                return ((j1) kVar).b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + e0.a(kVar.getClass())).toString());
        }

        public static boolean T(com.amazon.aps.iva.he0.i iVar) {
            boolean z;
            com.amazon.aps.iva.yb0.j.f(iVar, "$receiver");
            if (iVar instanceof m0) {
                com.amazon.aps.iva.ee0.e0 e0Var = (com.amazon.aps.iva.ee0.e0) iVar;
                if (e0Var instanceof com.amazon.aps.iva.ee0.d) {
                    return true;
                }
                if ((e0Var instanceof com.amazon.aps.iva.ee0.q) && (((com.amazon.aps.iva.ee0.q) e0Var).c instanceof com.amazon.aps.iva.ee0.d)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + e0.a(iVar.getClass())).toString());
        }

        public static boolean U(com.amazon.aps.iva.he0.i iVar) {
            boolean z;
            com.amazon.aps.iva.yb0.j.f(iVar, "$receiver");
            if (iVar instanceof m0) {
                com.amazon.aps.iva.ee0.e0 e0Var = (com.amazon.aps.iva.ee0.e0) iVar;
                if (e0Var instanceof u0) {
                    return true;
                }
                if ((e0Var instanceof com.amazon.aps.iva.ee0.q) && (((com.amazon.aps.iva.ee0.q) e0Var).c instanceof u0)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + e0.a(iVar.getClass())).toString());
        }

        public static boolean V(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                com.amazon.aps.iva.oc0.h k = ((c1) lVar).k();
                if (k != null && com.amazon.aps.iva.lc0.k.L(k)) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static m0 W(com.amazon.aps.iva.he0.f fVar) {
            if (fVar instanceof y) {
                return ((y) fVar).c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + e0.a(fVar.getClass())).toString());
        }

        public static u1 X(com.amazon.aps.iva.he0.d dVar) {
            if (dVar instanceof h) {
                return ((h) dVar).e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + e0.a(dVar.getClass())).toString());
        }

        public static u1 Y(com.amazon.aps.iva.he0.h hVar) {
            if (hVar instanceof u1) {
                return q0.a((u1) hVar, false);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + e0.a(hVar.getClass())).toString());
        }

        public static m0 Z(com.amazon.aps.iva.he0.e eVar) {
            if (eVar instanceof com.amazon.aps.iva.ee0.q) {
                return ((com.amazon.aps.iva.ee0.q) eVar).c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + eVar + ", " + e0.a(eVar.getClass())).toString());
        }

        public static boolean a(com.amazon.aps.iva.he0.l lVar, com.amazon.aps.iva.he0.l lVar2) {
            com.amazon.aps.iva.yb0.j.f(lVar, "c1");
            com.amazon.aps.iva.yb0.j.f(lVar2, "c2");
            if (lVar instanceof c1) {
                if (lVar2 instanceof c1) {
                    return com.amazon.aps.iva.yb0.j.a(lVar, lVar2);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar2 + ", " + e0.a(lVar2.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static int a0(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                return ((c1) lVar).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static int b(com.amazon.aps.iva.he0.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "$receiver");
            if (hVar instanceof com.amazon.aps.iva.ee0.e0) {
                return ((com.amazon.aps.iva.ee0.e0) hVar).G0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + e0.a(hVar.getClass())).toString());
        }

        public static Collection<com.amazon.aps.iva.he0.h> b0(b bVar, com.amazon.aps.iva.he0.i iVar) {
            com.amazon.aps.iva.yb0.j.f(iVar, "$receiver");
            c1 i = bVar.i(iVar);
            if (i instanceof com.amazon.aps.iva.sd0.p) {
                return ((com.amazon.aps.iva.sd0.p) i).c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + e0.a(iVar.getClass())).toString());
        }

        public static com.amazon.aps.iva.he0.j c(com.amazon.aps.iva.he0.i iVar) {
            com.amazon.aps.iva.yb0.j.f(iVar, "$receiver");
            if (iVar instanceof m0) {
                return (com.amazon.aps.iva.he0.j) iVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + e0.a(iVar.getClass())).toString());
        }

        public static j1 c0(com.amazon.aps.iva.he0.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "$receiver");
            if (cVar instanceof j) {
                return ((j) cVar).a;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + e0.a(cVar.getClass())).toString());
        }

        public static com.amazon.aps.iva.he0.d d(b bVar, com.amazon.aps.iva.he0.i iVar) {
            com.amazon.aps.iva.yb0.j.f(iVar, "$receiver");
            if (iVar instanceof m0) {
                if (iVar instanceof p0) {
                    return bVar.C(((p0) iVar).c);
                }
                if (iVar instanceof h) {
                    return (h) iVar;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + e0.a(iVar.getClass())).toString());
        }

        public static c d0(b bVar, com.amazon.aps.iva.he0.i iVar) {
            if (iVar instanceof m0) {
                return new c(bVar, q1.e(e1.b.a((com.amazon.aps.iva.ee0.e0) iVar)));
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + e0.a(iVar.getClass())).toString());
        }

        public static com.amazon.aps.iva.ee0.q e(com.amazon.aps.iva.he0.i iVar) {
            com.amazon.aps.iva.yb0.j.f(iVar, "$receiver");
            if (iVar instanceof m0) {
                if (iVar instanceof com.amazon.aps.iva.ee0.q) {
                    return (com.amazon.aps.iva.ee0.q) iVar;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + e0.a(iVar.getClass())).toString());
        }

        public static Collection e0(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                Collection<com.amazon.aps.iva.ee0.e0> g = ((c1) lVar).g();
                com.amazon.aps.iva.yb0.j.e(g, "this.supertypes");
                return g;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static com.amazon.aps.iva.ee0.v f(y yVar) {
            if (yVar instanceof com.amazon.aps.iva.ee0.v) {
                return (com.amazon.aps.iva.ee0.v) yVar;
            }
            return null;
        }

        public static c1 f0(com.amazon.aps.iva.he0.i iVar) {
            com.amazon.aps.iva.yb0.j.f(iVar, "$receiver");
            if (iVar instanceof m0) {
                return ((m0) iVar).I0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + e0.a(iVar.getClass())).toString());
        }

        public static y g(com.amazon.aps.iva.he0.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "$receiver");
            if (hVar instanceof com.amazon.aps.iva.ee0.e0) {
                u1 L0 = ((com.amazon.aps.iva.ee0.e0) hVar).L0();
                if (L0 instanceof y) {
                    return (y) L0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + e0.a(hVar.getClass())).toString());
        }

        public static j g0(com.amazon.aps.iva.he0.d dVar) {
            com.amazon.aps.iva.yb0.j.f(dVar, "$receiver");
            if (dVar instanceof h) {
                return ((h) dVar).d;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + e0.a(dVar.getClass())).toString());
        }

        public static l0 h(y yVar) {
            if (yVar instanceof l0) {
                return (l0) yVar;
            }
            return null;
        }

        public static m0 h0(com.amazon.aps.iva.he0.f fVar) {
            if (fVar instanceof y) {
                return ((y) fVar).d;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + e0.a(fVar.getClass())).toString());
        }

        public static m0 i(com.amazon.aps.iva.he0.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "$receiver");
            if (hVar instanceof com.amazon.aps.iva.ee0.e0) {
                u1 L0 = ((com.amazon.aps.iva.ee0.e0) hVar).L0();
                if (L0 instanceof m0) {
                    return (m0) L0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + e0.a(hVar.getClass())).toString());
        }

        public static m0 i0(com.amazon.aps.iva.he0.i iVar, boolean z) {
            com.amazon.aps.iva.yb0.j.f(iVar, "$receiver");
            if (iVar instanceof m0) {
                return ((m0) iVar).M0(z);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + e0.a(iVar.getClass())).toString());
        }

        public static com.amazon.aps.iva.ee0.l1 j(com.amazon.aps.iva.he0.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "$receiver");
            if (hVar instanceof com.amazon.aps.iva.ee0.e0) {
                return com.amazon.aps.iva.da0.a.j((com.amazon.aps.iva.ee0.e0) hVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + e0.a(hVar.getClass())).toString());
        }

        public static com.amazon.aps.iva.he0.h j0(b bVar, com.amazon.aps.iva.he0.h hVar) {
            if (hVar instanceof com.amazon.aps.iva.he0.i) {
                return bVar.k0((com.amazon.aps.iva.he0.i) hVar, true);
            }
            if (hVar instanceof com.amazon.aps.iva.he0.f) {
                com.amazon.aps.iva.he0.f fVar = (com.amazon.aps.iva.he0.f) hVar;
                return bVar.l(bVar.k0(bVar.s(fVar), true), bVar.k0(bVar.U(fVar), true));
            }
            throw new IllegalStateException("sealed".toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.amazon.aps.iva.ee0.m0 k(com.amazon.aps.iva.he0.i r21, com.amazon.aps.iva.he0.b r22) {
            /*
                Method dump skipped, instructions count: 447
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fe0.b.a.k(com.amazon.aps.iva.he0.i, com.amazon.aps.iva.he0.b):com.amazon.aps.iva.ee0.m0");
        }

        public static com.amazon.aps.iva.he0.b l(com.amazon.aps.iva.he0.d dVar) {
            com.amazon.aps.iva.yb0.j.f(dVar, "$receiver");
            if (dVar instanceof h) {
                return ((h) dVar).c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + e0.a(dVar.getClass())).toString());
        }

        public static u1 m(b bVar, com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.i iVar2) {
            com.amazon.aps.iva.yb0.j.f(iVar, "lowerBound");
            com.amazon.aps.iva.yb0.j.f(iVar2, "upperBound");
            if (iVar instanceof m0) {
                if (iVar2 instanceof m0) {
                    return f0.c((m0) iVar, (m0) iVar2);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + e0.a(bVar.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + e0.a(bVar.getClass())).toString());
        }

        public static com.amazon.aps.iva.he0.k n(com.amazon.aps.iva.he0.h hVar, int i) {
            com.amazon.aps.iva.yb0.j.f(hVar, "$receiver");
            if (hVar instanceof com.amazon.aps.iva.ee0.e0) {
                return ((com.amazon.aps.iva.ee0.e0) hVar).G0().get(i);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + e0.a(hVar.getClass())).toString());
        }

        public static List o(com.amazon.aps.iva.he0.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "$receiver");
            if (hVar instanceof com.amazon.aps.iva.ee0.e0) {
                return ((com.amazon.aps.iva.ee0.e0) hVar).G0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + e0.a(hVar.getClass())).toString());
        }

        public static com.amazon.aps.iva.nd0.d p(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                com.amazon.aps.iva.oc0.h k = ((c1) lVar).k();
                com.amazon.aps.iva.yb0.j.d(k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return com.amazon.aps.iva.ud0.b.h((com.amazon.aps.iva.oc0.e) k);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static com.amazon.aps.iva.he0.m q(com.amazon.aps.iva.he0.l lVar, int i) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                y0 y0Var = ((c1) lVar).getParameters().get(i);
                com.amazon.aps.iva.yb0.j.e(y0Var, "this.parameters[index]");
                return y0Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static List r(c1 c1Var) {
            List<y0> parameters = c1Var.getParameters();
            com.amazon.aps.iva.yb0.j.e(parameters, "this.parameters");
            return parameters;
        }

        public static com.amazon.aps.iva.lc0.l s(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                com.amazon.aps.iva.oc0.h k = ((c1) lVar).k();
                com.amazon.aps.iva.yb0.j.d(k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return com.amazon.aps.iva.lc0.k.s((com.amazon.aps.iva.oc0.e) k);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static com.amazon.aps.iva.lc0.l t(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                com.amazon.aps.iva.oc0.h k = ((c1) lVar).k();
                com.amazon.aps.iva.yb0.j.d(k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return com.amazon.aps.iva.lc0.k.u((com.amazon.aps.iva.oc0.e) k);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static com.amazon.aps.iva.ee0.e0 u(com.amazon.aps.iva.he0.m mVar) {
            if (mVar instanceof y0) {
                return com.amazon.aps.iva.da0.a.o((y0) mVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + e0.a(mVar.getClass())).toString());
        }

        public static u1 v(com.amazon.aps.iva.he0.k kVar) {
            com.amazon.aps.iva.yb0.j.f(kVar, "$receiver");
            if (kVar instanceof j1) {
                return ((j1) kVar).getType().L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + e0.a(kVar.getClass())).toString());
        }

        public static y0 w(com.amazon.aps.iva.he0.q qVar) {
            if (qVar instanceof n) {
                return ((n) qVar).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + qVar + ", " + e0.a(qVar.getClass())).toString());
        }

        public static y0 x(com.amazon.aps.iva.he0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "$receiver");
            if (lVar instanceof c1) {
                com.amazon.aps.iva.oc0.h k = ((c1) lVar).k();
                if (k instanceof y0) {
                    return (y0) k;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e0.a(lVar.getClass())).toString());
        }

        public static m0 y(com.amazon.aps.iva.he0.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "$receiver");
            if (hVar instanceof com.amazon.aps.iva.ee0.e0) {
                return com.amazon.aps.iva.qd0.k.f((com.amazon.aps.iva.ee0.e0) hVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + e0.a(hVar.getClass())).toString());
        }

        public static List z(com.amazon.aps.iva.he0.m mVar) {
            if (mVar instanceof y0) {
                List<com.amazon.aps.iva.ee0.e0> upperBounds = ((y0) mVar).getUpperBounds();
                com.amazon.aps.iva.yb0.j.e(upperBounds, "this.upperBounds");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + e0.a(mVar.getClass())).toString());
        }
    }

    u1 l(com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.i iVar2);
}
