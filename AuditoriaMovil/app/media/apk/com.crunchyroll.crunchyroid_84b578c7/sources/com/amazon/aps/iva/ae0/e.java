package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.ae0.e0;
import com.amazon.aps.iva.id0.a;
import com.amazon.aps.iva.od0.h;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes4.dex */
public final class e implements d<com.amazon.aps.iva.pc0.c, com.amazon.aps.iva.sd0.g<?>> {
    public final com.amazon.aps.iva.zd0.a a;
    public final f b;

    /* compiled from: AnnotationAndConstantLoaderImpl.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public e(com.amazon.aps.iva.oc0.c0 c0Var, com.amazon.aps.iva.oc0.e0 e0Var, com.amazon.aps.iva.be0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "module");
        com.amazon.aps.iva.yb0.j.f(aVar, "protocol");
        this.a = aVar;
        this.b = new f(c0Var, e0Var);
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final ArrayList a(com.amazon.aps.iva.id0.r rVar, com.amazon.aps.iva.kd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(rVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        Iterable iterable = (List) rVar.f(this.a.p);
        if (iterable == null) {
            iterable = com.amazon.aps.iva.lb0.z.b;
        }
        Iterable<com.amazon.aps.iva.id0.a> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable2));
        for (com.amazon.aps.iva.id0.a aVar : iterable2) {
            arrayList.add(this.b.a(aVar, cVar));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final List<com.amazon.aps.iva.pc0.c> b(e0 e0Var, com.amazon.aps.iva.id0.m mVar) {
        List list;
        com.amazon.aps.iva.yb0.j.f(mVar, "proto");
        h.f<com.amazon.aps.iva.id0.m, List<com.amazon.aps.iva.id0.a>> fVar = this.a.j;
        if (fVar != null) {
            list = (List) mVar.f(fVar);
        } else {
            list = null;
        }
        if (list == null) {
            list = com.amazon.aps.iva.lb0.z.b;
        }
        List<com.amazon.aps.iva.id0.a> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (com.amazon.aps.iva.id0.a aVar : list2) {
            arrayList.add(this.b.a(aVar, e0Var.a));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final List c(e0.a aVar, com.amazon.aps.iva.id0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "container");
        com.amazon.aps.iva.yb0.j.f(fVar, "proto");
        Iterable iterable = (List) fVar.f(this.a.l);
        if (iterable == null) {
            iterable = com.amazon.aps.iva.lb0.z.b;
        }
        Iterable<com.amazon.aps.iva.id0.a> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable2));
        for (com.amazon.aps.iva.id0.a aVar2 : iterable2) {
            arrayList.add(this.b.a(aVar2, aVar.a));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final List<com.amazon.aps.iva.pc0.c> d(e0 e0Var, com.amazon.aps.iva.od0.p pVar, c cVar) {
        List list;
        com.amazon.aps.iva.yb0.j.f(pVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "kind");
        boolean z = pVar instanceof com.amazon.aps.iva.id0.h;
        com.amazon.aps.iva.zd0.a aVar = this.a;
        if (z) {
            h.f<com.amazon.aps.iva.id0.h, List<com.amazon.aps.iva.id0.a>> fVar = aVar.e;
            if (fVar != null) {
                list = (List) ((com.amazon.aps.iva.id0.h) pVar).f(fVar);
            }
            list = null;
        } else if (pVar instanceof com.amazon.aps.iva.id0.m) {
            int i = a.a[cVar.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + cVar).toString());
            }
            h.f<com.amazon.aps.iva.id0.m, List<com.amazon.aps.iva.id0.a>> fVar2 = aVar.i;
            if (fVar2 != null) {
                list = (List) ((com.amazon.aps.iva.id0.m) pVar).f(fVar2);
            }
            list = null;
        } else {
            throw new IllegalStateException(("Unknown message: " + pVar).toString());
        }
        if (list == null) {
            list = com.amazon.aps.iva.lb0.z.b;
        }
        List<com.amazon.aps.iva.id0.a> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (com.amazon.aps.iva.id0.a aVar2 : list2) {
            arrayList.add(this.b.a(aVar2, e0Var.a));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ae0.d
    public final com.amazon.aps.iva.sd0.g<?> e(e0 e0Var, com.amazon.aps.iva.id0.m mVar, com.amazon.aps.iva.ee0.e0 e0Var2) {
        com.amazon.aps.iva.yb0.j.f(mVar, "proto");
        return null;
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final List<com.amazon.aps.iva.pc0.c> f(e0 e0Var, com.amazon.aps.iva.id0.m mVar) {
        List list;
        com.amazon.aps.iva.yb0.j.f(mVar, "proto");
        h.f<com.amazon.aps.iva.id0.m, List<com.amazon.aps.iva.id0.a>> fVar = this.a.k;
        if (fVar != null) {
            list = (List) mVar.f(fVar);
        } else {
            list = null;
        }
        if (list == null) {
            list = com.amazon.aps.iva.lb0.z.b;
        }
        List<com.amazon.aps.iva.id0.a> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (com.amazon.aps.iva.id0.a aVar : list2) {
            arrayList.add(this.b.a(aVar, e0Var.a));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final List<com.amazon.aps.iva.pc0.c> g(e0 e0Var, com.amazon.aps.iva.od0.p pVar, c cVar) {
        List list;
        com.amazon.aps.iva.yb0.j.f(pVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "kind");
        boolean z = pVar instanceof com.amazon.aps.iva.id0.c;
        com.amazon.aps.iva.zd0.a aVar = this.a;
        if (z) {
            list = (List) ((com.amazon.aps.iva.id0.c) pVar).f(aVar.b);
        } else if (pVar instanceof com.amazon.aps.iva.id0.h) {
            list = (List) ((com.amazon.aps.iva.id0.h) pVar).f(aVar.d);
        } else if (pVar instanceof com.amazon.aps.iva.id0.m) {
            int i = a.a[cVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        list = (List) ((com.amazon.aps.iva.id0.m) pVar).f(aVar.h);
                    } else {
                        throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                    }
                } else {
                    list = (List) ((com.amazon.aps.iva.id0.m) pVar).f(aVar.g);
                }
            } else {
                list = (List) ((com.amazon.aps.iva.id0.m) pVar).f(aVar.f);
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + pVar).toString());
        }
        if (list == null) {
            list = com.amazon.aps.iva.lb0.z.b;
        }
        List<com.amazon.aps.iva.id0.a> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (com.amazon.aps.iva.id0.a aVar2 : list2) {
            arrayList.add(this.b.a(aVar2, e0Var.a));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final ArrayList h(com.amazon.aps.iva.id0.p pVar, com.amazon.aps.iva.kd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        Iterable iterable = (List) pVar.f(this.a.o);
        if (iterable == null) {
            iterable = com.amazon.aps.iva.lb0.z.b;
        }
        Iterable<com.amazon.aps.iva.id0.a> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable2));
        for (com.amazon.aps.iva.id0.a aVar : iterable2) {
            arrayList.add(this.b.a(aVar, cVar));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final ArrayList i(e0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "container");
        Iterable iterable = (List) aVar.d.f(this.a.c);
        if (iterable == null) {
            iterable = com.amazon.aps.iva.lb0.z.b;
        }
        Iterable<com.amazon.aps.iva.id0.a> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable2));
        for (com.amazon.aps.iva.id0.a aVar2 : iterable2) {
            arrayList.add(this.b.a(aVar2, aVar.a));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ae0.g
    public final List<com.amazon.aps.iva.pc0.c> j(e0 e0Var, com.amazon.aps.iva.od0.p pVar, c cVar, int i, com.amazon.aps.iva.id0.t tVar) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "container");
        com.amazon.aps.iva.yb0.j.f(pVar, "callableProto");
        com.amazon.aps.iva.yb0.j.f(cVar, "kind");
        com.amazon.aps.iva.yb0.j.f(tVar, "proto");
        Iterable iterable = (List) tVar.f(this.a.n);
        if (iterable == null) {
            iterable = com.amazon.aps.iva.lb0.z.b;
        }
        Iterable<com.amazon.aps.iva.id0.a> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable2));
        for (com.amazon.aps.iva.id0.a aVar : iterable2) {
            arrayList.add(this.b.a(aVar, e0Var.a));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ae0.d
    public final com.amazon.aps.iva.sd0.g<?> k(e0 e0Var, com.amazon.aps.iva.id0.m mVar, com.amazon.aps.iva.ee0.e0 e0Var2) {
        com.amazon.aps.iva.yb0.j.f(mVar, "proto");
        a.b.c cVar = (a.b.c) com.amazon.aps.iva.kd0.e.a(mVar, this.a.m);
        if (cVar == null) {
            return null;
        }
        return this.b.c(e0Var2, cVar, e0Var.a);
    }
}
