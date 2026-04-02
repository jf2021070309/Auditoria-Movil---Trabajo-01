package com.amazon.aps.iva.mc0;

import com.amazon.aps.iva.de0.l;
import com.amazon.aps.iva.ec0.i;
import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.nd0.f;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.f0;
import com.amazon.aps.iva.oc0.k;
import com.amazon.aps.iva.oc0.q;
import com.amazon.aps.iva.oc0.u;
import com.amazon.aps.iva.oc0.w0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.rc0.t0;
import com.amazon.aps.iva.xd0.i;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: FunctionClassDescriptor.kt */
/* loaded from: classes4.dex */
public final class b extends com.amazon.aps.iva.rc0.b {
    public static final com.amazon.aps.iva.nd0.b m = new com.amazon.aps.iva.nd0.b(o.k, f.h("Function"));
    public static final com.amazon.aps.iva.nd0.b n = new com.amazon.aps.iva.nd0.b(o.h, f.h("KFunction"));
    public final l f;
    public final f0 g;
    public final c h;
    public final int i;
    public final a j;
    public final d k;
    public final List<y0> l;

    /* compiled from: FunctionClassDescriptor.kt */
    /* loaded from: classes4.dex */
    public final class a extends com.amazon.aps.iva.ee0.b {

        /* compiled from: FunctionClassDescriptor.kt */
        /* renamed from: com.amazon.aps.iva.mc0.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0510a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.Function.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.KFunction.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.SuspendFunction.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.KSuspendFunction.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        public a() {
            super(b.this.f);
        }

        @Override // com.amazon.aps.iva.ee0.h
        public final Collection<e0> d() {
            List J;
            boolean z;
            Iterable iterable;
            b bVar = b.this;
            int i = C0510a.a[bVar.h.ordinal()];
            if (i != 1) {
                int i2 = bVar.i;
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            J = f1.K(b.n, new com.amazon.aps.iva.nd0.b(o.e, c.SuspendFunction.numberedClassName(i2)));
                        } else {
                            throw new h();
                        }
                    } else {
                        J = f1.J(b.m);
                    }
                } else {
                    J = f1.K(b.n, new com.amazon.aps.iva.nd0.b(o.k, c.Function.numberedClassName(i2)));
                }
            } else {
                J = f1.J(b.m);
            }
            c0 d = bVar.g.d();
            List<com.amazon.aps.iva.nd0.b> list = J;
            ArrayList arrayList = new ArrayList(r.Y(list));
            for (com.amazon.aps.iva.nd0.b bVar2 : list) {
                com.amazon.aps.iva.oc0.e a = u.a(d, bVar2);
                if (a != null) {
                    int size = a.h().getParameters().size();
                    List<y0> list2 = bVar.l;
                    j.f(list2, "<this>");
                    if (size >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (size == 0) {
                            iterable = z.b;
                        } else {
                            int size2 = list2.size();
                            if (size >= size2) {
                                iterable = x.X0(list2);
                            } else if (size == 1) {
                                iterable = f1.J(x.D0(list2));
                            } else {
                                ArrayList arrayList2 = new ArrayList(size);
                                if (list2 instanceof RandomAccess) {
                                    for (int i3 = size2 - size; i3 < size2; i3++) {
                                        arrayList2.add(list2.get(i3));
                                    }
                                } else {
                                    ListIterator<y0> listIterator = list2.listIterator(size2 - size);
                                    while (listIterator.hasNext()) {
                                        arrayList2.add(listIterator.next());
                                    }
                                }
                                iterable = arrayList2;
                            }
                        }
                        Iterable<y0> iterable2 = iterable;
                        ArrayList arrayList3 = new ArrayList(r.Y(iterable2));
                        for (y0 y0Var : iterable2) {
                            arrayList3.add(new l1(y0Var.m()));
                        }
                        a1.c.getClass();
                        arrayList.add(com.amazon.aps.iva.ee0.f0.e(a1.d, a, arrayList3));
                    } else {
                        throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Requested element count ", size, " is less than zero.").toString());
                    }
                } else {
                    throw new IllegalStateException(("Built-in class " + bVar2 + " not found").toString());
                }
            }
            return x.X0(arrayList);
        }

        @Override // com.amazon.aps.iva.ee0.c1
        public final List<y0> getParameters() {
            return b.this.l;
        }

        @Override // com.amazon.aps.iva.ee0.h
        public final w0 h() {
            return w0.a.a;
        }

        @Override // com.amazon.aps.iva.ee0.b, com.amazon.aps.iva.ee0.c1
        public final com.amazon.aps.iva.oc0.h k() {
            return b.this;
        }

        @Override // com.amazon.aps.iva.ee0.c1
        public final boolean l() {
            return true;
        }

        @Override // com.amazon.aps.iva.ee0.b
        public final com.amazon.aps.iva.oc0.e p() {
            return b.this;
        }

        public final String toString() {
            return b.this.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, com.amazon.aps.iva.lc0.b bVar, c cVar, int i) {
        super(lVar, cVar.numberedClassName(i));
        j.f(lVar, "storageManager");
        j.f(bVar, "containingDeclaration");
        j.f(cVar, "functionKind");
        this.f = lVar;
        this.g = bVar;
        this.h = cVar;
        this.i = i;
        this.j = new a();
        this.k = new d(lVar, this);
        ArrayList arrayList = new ArrayList();
        com.amazon.aps.iva.ec0.j jVar = new com.amazon.aps.iva.ec0.j(1, i);
        ArrayList arrayList2 = new ArrayList(r.Y(jVar));
        i it = jVar.iterator();
        while (it.d) {
            int b = it.b();
            v1 v1Var = v1.IN_VARIANCE;
            arrayList.add(t0.K0(this, v1Var, f.h("P" + b), arrayList.size(), this.f));
            arrayList2.add(q.a);
        }
        arrayList.add(t0.K0(this, v1.OUT_VARIANCE, f.h("R"), arrayList.size(), this.f));
        this.l = x.X0(arrayList);
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.oc0.d D() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.a1<m0> R() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean U() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean X() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean a0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final k d() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final /* bridge */ /* synthetic */ Collection e() {
        return z.b;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean f0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.n
    public final com.amazon.aps.iva.oc0.t0 g() {
        return com.amazon.aps.iva.oc0.t0.a;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean g0() {
        return false;
    }

    @Override // com.amazon.aps.iva.pc0.a
    public final com.amazon.aps.iva.pc0.h getAnnotations() {
        return h.a.a;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.f getKind() {
        return com.amazon.aps.iva.oc0.f.INTERFACE;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.r getVisibility() {
        q.h hVar = com.amazon.aps.iva.oc0.q.e;
        j.e(hVar, "PUBLIC");
        return hVar;
    }

    @Override // com.amazon.aps.iva.oc0.h
    public final c1 h() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.xd0.i h0() {
        return i.b.b;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.oc0.e i0() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean isExternal() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean isInline() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.i
    public final List<y0> n() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.a0
    public final b0 o() {
        return b0.ABSTRACT;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean s() {
        return false;
    }

    @Override // com.amazon.aps.iva.rc0.b0
    public final com.amazon.aps.iva.xd0.i s0(com.amazon.aps.iva.fe0.f fVar) {
        j.f(fVar, "kotlinTypeRefiner");
        return this.k;
    }

    public final String toString() {
        String b = getName().b();
        j.e(b, "name.asString()");
        return b;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final /* bridge */ /* synthetic */ Collection x() {
        return z.b;
    }

    @Override // com.amazon.aps.iva.oc0.i
    public final boolean z() {
        return false;
    }
}
