package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.gd0.t;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.e0;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.rc0.g0;
import com.amazon.aps.iva.sd0.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes4.dex */
public final class h extends com.amazon.aps.iva.gd0.a<com.amazon.aps.iva.pc0.c, com.amazon.aps.iva.sd0.g<?>> {
    public final c0 c;
    public final e0 d;
    public final com.amazon.aps.iva.ae0.f e;
    public com.amazon.aps.iva.md0.e f;

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    /* loaded from: classes4.dex */
    public abstract class a implements t.a {

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: com.amazon.aps.iva.gd0.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0302a implements t.b {
            public final ArrayList<com.amazon.aps.iva.sd0.g<?>> a = new ArrayList<>();
            public final /* synthetic */ h b;
            public final /* synthetic */ com.amazon.aps.iva.nd0.f c;
            public final /* synthetic */ a d;

            /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
            /* renamed from: com.amazon.aps.iva.gd0.h$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0303a implements t.a {
                public final /* synthetic */ t.a a;
                public final /* synthetic */ t.a b;
                public final /* synthetic */ C0302a c;
                public final /* synthetic */ ArrayList<com.amazon.aps.iva.pc0.c> d;

                public C0303a(i iVar, C0302a c0302a, ArrayList arrayList) {
                    this.b = iVar;
                    this.c = c0302a;
                    this.d = arrayList;
                    this.a = iVar;
                }

                @Override // com.amazon.aps.iva.gd0.t.a
                public final void a() {
                    this.b.a();
                    this.c.a.add(new com.amazon.aps.iva.sd0.a((com.amazon.aps.iva.pc0.c) com.amazon.aps.iva.lb0.x.P0(this.d)));
                }

                @Override // com.amazon.aps.iva.gd0.t.a
                public final t.b b(com.amazon.aps.iva.nd0.f fVar) {
                    return this.a.b(fVar);
                }

                @Override // com.amazon.aps.iva.gd0.t.a
                public final void c(Object obj, com.amazon.aps.iva.nd0.f fVar) {
                    this.a.c(obj, fVar);
                }

                @Override // com.amazon.aps.iva.gd0.t.a
                public final t.a d(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar) {
                    return this.a.d(bVar, fVar);
                }

                @Override // com.amazon.aps.iva.gd0.t.a
                public final void e(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar2) {
                    this.a.e(fVar, bVar, fVar2);
                }

                @Override // com.amazon.aps.iva.gd0.t.a
                public final void f(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.sd0.f fVar2) {
                    this.a.f(fVar, fVar2);
                }
            }

            public C0302a(h hVar, com.amazon.aps.iva.nd0.f fVar, a aVar) {
                this.b = hVar;
                this.c = fVar;
                this.d = aVar;
            }

            @Override // com.amazon.aps.iva.gd0.t.b
            public final void a() {
                ArrayList<com.amazon.aps.iva.sd0.g<?>> arrayList = this.a;
                i iVar = (i) this.d;
                iVar.getClass();
                com.amazon.aps.iva.yb0.j.f(arrayList, "elements");
                com.amazon.aps.iva.nd0.f fVar = this.c;
                if (fVar != null) {
                    c1 j = com.amazon.aps.iva.hc.m.j(fVar, iVar.d);
                    if (j != null) {
                        HashMap<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> hashMap = iVar.b;
                        List l = com.amazon.aps.iva.a60.b.l(arrayList);
                        com.amazon.aps.iva.ee0.e0 type = j.getType();
                        com.amazon.aps.iva.yb0.j.e(type, "parameter.type");
                        hashMap.put(fVar, new com.amazon.aps.iva.sd0.y(l, type));
                    } else if (iVar.c.p(iVar.e) && com.amazon.aps.iva.yb0.j.a(fVar.b(), "value")) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<com.amazon.aps.iva.sd0.g<?>> it = arrayList.iterator();
                        while (it.hasNext()) {
                            com.amazon.aps.iva.sd0.g<?> next = it.next();
                            if (next instanceof com.amazon.aps.iva.sd0.a) {
                                arrayList2.add(next);
                            }
                        }
                        List<com.amazon.aps.iva.pc0.c> list = iVar.f;
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            list.add((com.amazon.aps.iva.pc0.c) ((com.amazon.aps.iva.sd0.a) it2.next()).a);
                        }
                    }
                }
            }

            @Override // com.amazon.aps.iva.gd0.t.b
            public final t.a b(com.amazon.aps.iva.nd0.b bVar) {
                ArrayList arrayList = new ArrayList();
                return new C0303a(this.b.q(bVar, t0.a, arrayList), this, arrayList);
            }

            @Override // com.amazon.aps.iva.gd0.t.b
            public final void c(com.amazon.aps.iva.sd0.f fVar) {
                this.a.add(new com.amazon.aps.iva.sd0.t(fVar));
            }

            @Override // com.amazon.aps.iva.gd0.t.b
            public final void d(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar) {
                this.a.add(new com.amazon.aps.iva.sd0.j(bVar, fVar));
            }

            @Override // com.amazon.aps.iva.gd0.t.b
            public final void e(Object obj) {
                this.a.add(h.u(this.b, this.c, obj));
            }
        }

        public a() {
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final t.b b(com.amazon.aps.iva.nd0.f fVar) {
            return new C0302a(h.this, fVar, this);
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void c(Object obj, com.amazon.aps.iva.nd0.f fVar) {
            ((i) this).b.put(fVar, h.u(h.this, fVar, obj));
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final t.a d(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar) {
            ArrayList arrayList = new ArrayList();
            return new g(h.this.q(bVar, t0.a, arrayList), this, fVar, arrayList);
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void e(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar2) {
            ((i) this).b.put(fVar, new com.amazon.aps.iva.sd0.j(bVar, fVar2));
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void f(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.sd0.f fVar2) {
            ((i) this).b.put(fVar, new com.amazon.aps.iva.sd0.t(fVar2));
        }

        public abstract void g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.sd0.g<?> gVar);
    }

    public h(g0 g0Var, e0 e0Var, com.amazon.aps.iva.de0.c cVar, com.amazon.aps.iva.tc0.f fVar) {
        super(cVar, fVar);
        this.c = g0Var;
        this.d = e0Var;
        this.e = new com.amazon.aps.iva.ae0.f(g0Var, e0Var);
        this.f = com.amazon.aps.iva.md0.e.g;
    }

    public static final com.amazon.aps.iva.sd0.g u(h hVar, com.amazon.aps.iva.nd0.f fVar, Object obj) {
        com.amazon.aps.iva.sd0.g b = com.amazon.aps.iva.sd0.h.b(obj, hVar.c);
        if (b == null) {
            String str = "Unsupported annotation argument: " + fVar;
            com.amazon.aps.iva.yb0.j.f(str, "message");
            return new k.a(str);
        }
        return b;
    }

    @Override // com.amazon.aps.iva.gd0.d
    public final i q(com.amazon.aps.iva.nd0.b bVar, t0 t0Var, List list) {
        com.amazon.aps.iva.yb0.j.f(list, "result");
        return new i(this, com.amazon.aps.iva.oc0.u.c(this.c, bVar, this.d), bVar, list, t0Var);
    }
}
