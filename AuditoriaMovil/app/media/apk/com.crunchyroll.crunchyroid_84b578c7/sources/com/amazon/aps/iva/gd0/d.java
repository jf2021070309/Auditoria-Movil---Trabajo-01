package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.ae0.e0;
import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.gd0.a;
import com.amazon.aps.iva.gd0.d.a;
import com.amazon.aps.iva.gd0.w;
import com.amazon.aps.iva.id0.b;
import com.amazon.aps.iva.ld0.a;
import com.amazon.aps.iva.md0.d;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.od0.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* loaded from: classes4.dex */
public abstract class d<A, S extends a<? extends A>> implements com.amazon.aps.iva.ae0.g<A> {
    public final r a;

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* loaded from: classes4.dex */
    public static abstract class a<A> {
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* loaded from: classes4.dex */
    public enum b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.ae0.c.values().length];
            try {
                iArr[com.amazon.aps.iva.ae0.c.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.ae0.c.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.ae0.c.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public d(com.amazon.aps.iva.tc0.f fVar) {
        this.a = fVar;
    }

    public static /* synthetic */ List m(d dVar, e0 e0Var, w wVar, boolean z, Boolean bool, boolean z2, int i) {
        boolean z3;
        boolean z4;
        if ((i & 4) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        return dVar.l(e0Var, wVar, z3, false, bool2, z4);
    }

    public static w n(com.amazon.aps.iva.od0.p pVar, com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.kd0.g gVar, com.amazon.aps.iva.ae0.c cVar2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(pVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
        com.amazon.aps.iva.yb0.j.f(cVar2, "kind");
        if (pVar instanceof com.amazon.aps.iva.id0.c) {
            com.amazon.aps.iva.od0.f fVar = com.amazon.aps.iva.md0.h.a;
            d.b a2 = com.amazon.aps.iva.md0.h.a((com.amazon.aps.iva.id0.c) pVar, cVar, gVar);
            if (a2 == null) {
                return null;
            }
            return w.a.a(a2);
        } else if (pVar instanceof com.amazon.aps.iva.id0.h) {
            com.amazon.aps.iva.od0.f fVar2 = com.amazon.aps.iva.md0.h.a;
            d.b c2 = com.amazon.aps.iva.md0.h.c((com.amazon.aps.iva.id0.h) pVar, cVar, gVar);
            if (c2 == null) {
                return null;
            }
            return w.a.a(c2);
        } else if (!(pVar instanceof com.amazon.aps.iva.id0.m)) {
            return null;
        } else {
            h.f<com.amazon.aps.iva.id0.m, a.c> fVar3 = com.amazon.aps.iva.ld0.a.d;
            com.amazon.aps.iva.yb0.j.e(fVar3, "propertySignature");
            a.c cVar3 = (a.c) com.amazon.aps.iva.kd0.e.a((h.d) pVar, fVar3);
            if (cVar3 == null) {
                return null;
            }
            int i = c.a[cVar2.ordinal()];
            boolean z2 = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return f.a((com.amazon.aps.iva.id0.m) pVar, cVar, gVar, true, true, z);
                }
                if ((cVar3.c & 8) == 8) {
                    z2 = true;
                }
                if (!z2) {
                    return null;
                }
                a.b bVar = cVar3.g;
                com.amazon.aps.iva.yb0.j.e(bVar, "signature.setter");
                String string = cVar.getString(bVar.d);
                String string2 = cVar.getString(bVar.e);
                com.amazon.aps.iva.yb0.j.f(string, AppMeasurementSdk.ConditionalUserProperty.NAME);
                com.amazon.aps.iva.yb0.j.f(string2, "desc");
                return new w(string.concat(string2));
            }
            if ((cVar3.c & 4) == 4) {
                z2 = true;
            }
            if (!z2) {
                return null;
            }
            a.b bVar2 = cVar3.f;
            com.amazon.aps.iva.yb0.j.e(bVar2, "signature.getter");
            String string3 = cVar.getString(bVar2.d);
            String string4 = cVar.getString(bVar2.e);
            com.amazon.aps.iva.yb0.j.f(string3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.f(string4, "desc");
            return new w(string3.concat(string4));
        }
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final ArrayList a(com.amazon.aps.iva.id0.r rVar, com.amazon.aps.iva.kd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(rVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        Object f = rVar.f(com.amazon.aps.iva.ld0.a.h);
        com.amazon.aps.iva.yb0.j.e(f, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<com.amazon.aps.iva.id0.a> iterable = (Iterable) f;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable));
        for (com.amazon.aps.iva.id0.a aVar : iterable) {
            com.amazon.aps.iva.yb0.j.e(aVar, "it");
            arrayList.add(((h) this).e.a(aVar, cVar));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final List<A> b(e0 e0Var, com.amazon.aps.iva.id0.m mVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "proto");
        return s(e0Var, mVar, b.BACKING_FIELD);
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final List c(e0.a aVar, com.amazon.aps.iva.id0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "container");
        com.amazon.aps.iva.yb0.j.f(fVar, "proto");
        String string = aVar.a.getString(fVar.e);
        String c2 = aVar.f.c();
        com.amazon.aps.iva.yb0.j.e(c2, "container as ProtoContai…Class).classId.asString()");
        String b2 = com.amazon.aps.iva.md0.b.b(c2);
        com.amazon.aps.iva.yb0.j.f(string, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(b2, "desc");
        return m(this, aVar, new w(string + '#' + b2), false, null, false, 60);
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final List<A> d(e0 e0Var, com.amazon.aps.iva.od0.p pVar, com.amazon.aps.iva.ae0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "kind");
        w n = n(pVar, e0Var.a, e0Var.b, cVar, false);
        if (n != null) {
            return m(this, e0Var, new w(defpackage.b.c(new StringBuilder(), n.a, "@0")), false, null, false, 60);
        }
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final List<A> f(e0 e0Var, com.amazon.aps.iva.id0.m mVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "proto");
        return s(e0Var, mVar, b.DELEGATE_FIELD);
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final List<A> g(e0 e0Var, com.amazon.aps.iva.od0.p pVar, com.amazon.aps.iva.ae0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "kind");
        if (cVar == com.amazon.aps.iva.ae0.c.PROPERTY) {
            return s(e0Var, (com.amazon.aps.iva.id0.m) pVar, b.PROPERTY);
        }
        w n = n(pVar, e0Var.a, e0Var.b, cVar, false);
        if (n == null) {
            return com.amazon.aps.iva.lb0.z.b;
        }
        return m(this, e0Var, n, false, null, false, 60);
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final ArrayList h(com.amazon.aps.iva.id0.p pVar, com.amazon.aps.iva.kd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        Object f = pVar.f(com.amazon.aps.iva.ld0.a.f);
        com.amazon.aps.iva.yb0.j.e(f, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<com.amazon.aps.iva.id0.a> iterable = (Iterable) f;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable));
        for (com.amazon.aps.iva.id0.a aVar : iterable) {
            com.amazon.aps.iva.yb0.j.e(aVar, "it");
            arrayList.add(((h) this).e.a(aVar, cVar));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final ArrayList i(e0.a aVar) {
        v vVar;
        com.amazon.aps.iva.yb0.j.f(aVar, "container");
        t0 t0Var = aVar.c;
        t tVar = null;
        if (t0Var instanceof v) {
            vVar = (v) t0Var;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            tVar = vVar.b;
        }
        if (tVar != null) {
            ArrayList arrayList = new ArrayList(1);
            tVar.a(new e(this, arrayList));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.a()).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r10 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
        if (r10 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
        if (r10.h != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0077, code lost:
        r1 = 1;
     */
    @Override // com.amazon.aps.iva.ae0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<A> j(com.amazon.aps.iva.ae0.e0 r9, com.amazon.aps.iva.od0.p r10, com.amazon.aps.iva.ae0.c r11, int r12, com.amazon.aps.iva.id0.t r13) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gd0.d.j(com.amazon.aps.iva.ae0.e0, com.amazon.aps.iva.od0.p, com.amazon.aps.iva.ae0.c, int, com.amazon.aps.iva.id0.t):java.util.List");
    }

    public final List<A> l(e0 e0Var, w wVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        v vVar;
        t o = o(e0Var, z, z2, bool, z3);
        if (o == null) {
            if (e0Var instanceof e0.a) {
                t0 t0Var = ((e0.a) e0Var).c;
                if (t0Var instanceof v) {
                    vVar = (v) t0Var;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    o = vVar.b;
                }
            }
            o = null;
        }
        com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
        if (o == null) {
            return zVar;
        }
        List<A> list = ((a.C0300a) ((c.k) ((com.amazon.aps.iva.gd0.a) this).b).invoke(o)).a.get(wVar);
        if (list != null) {
            return list;
        }
        return zVar;
    }

    public final t o(e0 e0Var, boolean z, boolean z2, Boolean bool, boolean z3) {
        e0.a aVar;
        v vVar;
        o oVar;
        com.amazon.aps.iva.vd0.b bVar;
        com.amazon.aps.iva.yb0.j.f(e0Var, "container");
        r rVar = this.a;
        t0 t0Var = e0Var.c;
        if (z) {
            if (bool != null) {
                if (e0Var instanceof e0.a) {
                    e0.a aVar2 = (e0.a) e0Var;
                    if (aVar2.g == b.c.INTERFACE) {
                        return s.a(rVar, aVar2.f.d(com.amazon.aps.iva.nd0.f.h("DefaultImpls")), ((h) this).f);
                    }
                }
                if (bool.booleanValue() && (e0Var instanceof e0.b)) {
                    if (t0Var instanceof o) {
                        oVar = (o) t0Var;
                    } else {
                        oVar = null;
                    }
                    if (oVar != null) {
                        bVar = oVar.c;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        String e = bVar.e();
                        com.amazon.aps.iva.yb0.j.e(e, "facadeClassName.internalName");
                        return s.a(rVar, com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c(com.amazon.aps.iva.oe0.m.e0(e, '/', '.'))), ((h) this).f);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + e0Var + ')').toString());
            }
        }
        if (z2 && (e0Var instanceof e0.a)) {
            e0.a aVar3 = (e0.a) e0Var;
            if (aVar3.g == b.c.COMPANION_OBJECT && (aVar = aVar3.e) != null) {
                b.c cVar = b.c.CLASS;
                b.c cVar2 = aVar.g;
                if (cVar2 == cVar || cVar2 == b.c.ENUM_CLASS || (z3 && (cVar2 == b.c.INTERFACE || cVar2 == b.c.ANNOTATION_CLASS))) {
                    t0 t0Var2 = aVar.c;
                    if (t0Var2 instanceof v) {
                        vVar = (v) t0Var2;
                    } else {
                        vVar = null;
                    }
                    if (vVar == null) {
                        return null;
                    }
                    return vVar.b;
                }
            }
        }
        if (!(e0Var instanceof e0.b) || !(t0Var instanceof o)) {
            return null;
        }
        com.amazon.aps.iva.yb0.j.d(t0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        o oVar2 = (o) t0Var;
        t tVar = oVar2.d;
        if (tVar == null) {
            return s.a(rVar, oVar2.d(), ((h) this).f);
        }
        return tVar;
    }

    public final boolean p(com.amazon.aps.iva.nd0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "classId");
        if (bVar.g() != null && com.amazon.aps.iva.yb0.j.a(bVar.j().b(), "Container")) {
            t a2 = s.a(this.a, bVar, ((h) this).f);
            if (a2 != null) {
                LinkedHashSet linkedHashSet = com.amazon.aps.iva.kc0.b.a;
                com.amazon.aps.iva.yb0.z zVar = new com.amazon.aps.iva.yb0.z();
                a2.a(new com.amazon.aps.iva.kc0.a(zVar));
                if (zVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract i q(com.amazon.aps.iva.nd0.b bVar, t0 t0Var, List list);

    public final i r(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.tc0.b bVar2, List list) {
        com.amazon.aps.iva.yb0.j.f(list, "result");
        if (com.amazon.aps.iva.kc0.b.a.contains(bVar)) {
            return null;
        }
        return q(bVar, bVar2, list);
    }

    public final List<A> s(e0 e0Var, com.amazon.aps.iva.id0.m mVar, b bVar) {
        boolean c2 = l1.c(com.amazon.aps.iva.kd0.b.A, mVar.e, "IS_CONST.get(proto.flags)");
        boolean d = com.amazon.aps.iva.md0.h.d(mVar);
        b bVar2 = b.PROPERTY;
        com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
        if (bVar == bVar2) {
            w b2 = f.b(mVar, e0Var.a, e0Var.b, false, true, 40);
            if (b2 == null) {
                return zVar;
            }
            return m(this, e0Var, b2, true, Boolean.valueOf(c2), d, 8);
        }
        w b3 = f.b(mVar, e0Var.a, e0Var.b, true, false, 48);
        if (b3 == null) {
            return zVar;
        }
        boolean z = false;
        boolean i0 = com.amazon.aps.iva.oe0.q.i0(b3.a, "$delegate", false);
        if (bVar == b.DELEGATE_FIELD) {
            z = true;
        }
        if (i0 != z) {
            return zVar;
        }
        return l(e0Var, b3, true, true, Boolean.valueOf(c2), d);
    }
}
