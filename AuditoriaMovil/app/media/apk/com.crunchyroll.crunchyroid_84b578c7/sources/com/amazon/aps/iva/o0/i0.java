package com.amazon.aps.iva.o0;

import android.os.Trace;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Composition.kt */
/* loaded from: classes.dex */
public final class i0 implements o0, l2 {
    public final g0 b;
    public final d<?> c;
    public final AtomicReference<Object> d;
    public final Object e;
    public final HashSet<v2> f;
    public final z2 g;
    public final com.amazon.aps.iva.p0.d<j2> h;
    public final HashSet<j2> i;
    public final com.amazon.aps.iva.p0.d<r0<?>> j;
    public final ArrayList k;
    public final ArrayList l;
    public final com.amazon.aps.iva.p0.d<j2> m;
    public com.amazon.aps.iva.p0.b<j2, com.amazon.aps.iva.p0.c<Object>> n;
    public boolean o;
    public i0 p;
    public int q;
    public final j r;
    public final com.amazon.aps.iva.ob0.g s;
    public boolean t;
    public com.amazon.aps.iva.xb0.p<? super i, ? super Integer, com.amazon.aps.iva.kb0.q> u;

    /* compiled from: Composition.kt */
    /* loaded from: classes.dex */
    public static final class a implements u2 {
        public final Set<v2> a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public ArrayList e;
        public ArrayList f;

        public a(HashSet hashSet) {
            com.amazon.aps.iva.yb0.j.f(hashSet, "abandoning");
            this.a = hashSet;
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        @Override // com.amazon.aps.iva.o0.u2
        public final void a(g gVar) {
            com.amazon.aps.iva.yb0.j.f(gVar, "instance");
            ArrayList arrayList = this.f;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f = arrayList;
            }
            arrayList.add(gVar);
        }

        @Override // com.amazon.aps.iva.o0.u2
        public final void b(v2 v2Var) {
            com.amazon.aps.iva.yb0.j.f(v2Var, "instance");
            ArrayList arrayList = this.b;
            int lastIndexOf = arrayList.lastIndexOf(v2Var);
            if (lastIndexOf >= 0) {
                arrayList.remove(lastIndexOf);
                this.a.remove(v2Var);
                return;
            }
            this.c.add(v2Var);
        }

        @Override // com.amazon.aps.iva.o0.u2
        public final void c(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "effect");
            this.d.add(aVar);
        }

        @Override // com.amazon.aps.iva.o0.u2
        public final void d(g gVar) {
            com.amazon.aps.iva.yb0.j.f(gVar, "instance");
            ArrayList arrayList = this.e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.e = arrayList;
            }
            arrayList.add(gVar);
        }

        @Override // com.amazon.aps.iva.o0.u2
        public final void e(v2 v2Var) {
            com.amazon.aps.iva.yb0.j.f(v2Var, "instance");
            ArrayList arrayList = this.c;
            int lastIndexOf = arrayList.lastIndexOf(v2Var);
            if (lastIndexOf >= 0) {
                arrayList.remove(lastIndexOf);
                this.a.remove(v2Var);
                return;
            }
            this.b.add(v2Var);
        }

        public final void f() {
            Set<v2> set = this.a;
            if (!set.isEmpty()) {
                Trace.beginSection("Compose:abandons");
                try {
                    Iterator<v2> it = set.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().onAbandoned();
                    }
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                } finally {
                    Trace.endSection();
                }
            }
        }

        public final void g() {
            boolean z;
            ArrayList arrayList = this.e;
            boolean z2 = false;
            if (arrayList != null && !arrayList.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                Trace.beginSection("Compose:deactivations");
                try {
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        ((g) arrayList.get(size)).b();
                    }
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    Trace.endSection();
                    arrayList.clear();
                } finally {
                }
            }
            ArrayList arrayList2 = this.c;
            boolean z3 = !arrayList2.isEmpty();
            Set<v2> set = this.a;
            if (z3) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        v2 v2Var = (v2) arrayList2.get(size2);
                        if (!set.contains(v2Var)) {
                            v2Var.onForgotten();
                        }
                    }
                    com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                } finally {
                }
            }
            ArrayList arrayList3 = this.b;
            if (!arrayList3.isEmpty()) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    int size3 = arrayList3.size();
                    for (int i = 0; i < size3; i++) {
                        v2 v2Var2 = (v2) arrayList3.get(i);
                        set.remove(v2Var2);
                        v2Var2.onRemembered();
                    }
                    com.amazon.aps.iva.kb0.q qVar3 = com.amazon.aps.iva.kb0.q.a;
                } finally {
                }
            }
            ArrayList arrayList4 = this.f;
            if (!((arrayList4 == null || arrayList4.isEmpty()) ? true : true)) {
                Trace.beginSection("Compose:releases");
                try {
                    for (int size4 = arrayList4.size() - 1; -1 < size4; size4--) {
                        ((g) arrayList4.get(size4)).a();
                    }
                    com.amazon.aps.iva.kb0.q qVar4 = com.amazon.aps.iva.kb0.q.a;
                    Trace.endSection();
                    arrayList4.clear();
                } finally {
                }
            }
        }

        public final void h() {
            ArrayList arrayList = this.d;
            if (!arrayList.isEmpty()) {
                Trace.beginSection("Compose:sideeffects");
                try {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((com.amazon.aps.iva.xb0.a) arrayList.get(i)).invoke();
                    }
                    arrayList.clear();
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    public i0() {
        throw null;
    }

    public i0(g0 g0Var, com.amazon.aps.iva.o0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "parent");
        this.b = g0Var;
        this.c = aVar;
        this.d = new AtomicReference<>(null);
        this.e = new Object();
        HashSet<v2> hashSet = new HashSet<>();
        this.f = hashSet;
        z2 z2Var = new z2();
        this.g = z2Var;
        this.h = new com.amazon.aps.iva.p0.d<>();
        this.i = new HashSet<>();
        this.j = new com.amazon.aps.iva.p0.d<>();
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.l = arrayList2;
        this.m = new com.amazon.aps.iva.p0.d<>();
        this.n = new com.amazon.aps.iva.p0.b<>();
        j jVar = new j(aVar, g0Var, z2Var, hashSet, arrayList, arrayList2, this);
        g0Var.l(jVar);
        this.r = jVar;
        this.s = null;
        boolean z = g0Var instanceof m2;
        this.u = f.a;
    }

    public final b1 A(j2 j2Var, c cVar, Object obj) {
        boolean z;
        synchronized (this.e) {
            i0 i0Var = this.p;
            if (i0Var == null || !this.g.e(this.q, cVar)) {
                i0Var = null;
            }
            if (i0Var == null) {
                j jVar = this.r;
                boolean z2 = true;
                if (jVar.D && jVar.D0(j2Var, obj)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return b1.IMMINENT;
                } else if (obj == null) {
                    this.n.c(j2Var, null);
                } else {
                    com.amazon.aps.iva.p0.b<j2, com.amazon.aps.iva.p0.c<Object>> bVar = this.n;
                    Object obj2 = j0.a;
                    bVar.getClass();
                    com.amazon.aps.iva.yb0.j.f(j2Var, "key");
                    if (bVar.a(j2Var) < 0) {
                        z2 = false;
                    }
                    if (z2) {
                        com.amazon.aps.iva.p0.c<Object> b = bVar.b(j2Var);
                        if (b != null) {
                            b.add(obj);
                        }
                    } else {
                        com.amazon.aps.iva.p0.c<Object> cVar2 = new com.amazon.aps.iva.p0.c<>();
                        cVar2.add(obj);
                        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                        bVar.c(j2Var, cVar2);
                    }
                }
            }
            if (i0Var != null) {
                return i0Var.A(j2Var, cVar, obj);
            }
            this.b.h(this);
            if (this.r.D) {
                return b1.DEFERRED;
            }
            return b1.SCHEDULED;
        }
    }

    public final void B(Object obj) {
        com.amazon.aps.iva.p0.d<j2> dVar = this.h;
        int d = dVar.d(obj);
        if (d >= 0) {
            com.amazon.aps.iva.p0.c<j2> g = dVar.g(d);
            Object[] objArr = g.c;
            int i = g.b;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj2 = objArr[i2];
                com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                j2 j2Var = (j2) obj2;
                if (j2Var.a(obj) == b1.IMMINENT) {
                    this.m.a(obj, j2Var);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.o0.o0, com.amazon.aps.iva.o0.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r0 = "value"
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            com.amazon.aps.iva.o0.j r0 = r5.r
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto Lf
            r1 = r3
            goto L10
        Lf:
            r1 = r2
        L10:
            if (r1 != 0) goto L81
            com.amazon.aps.iva.o0.j2 r0 = r0.a0()
            if (r0 == 0) goto L81
            int r1 = r0.a
            r1 = r1 | r3
            r0.a = r1
            r1 = r1 & 32
            if (r1 == 0) goto L23
            r1 = r3
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto L27
            goto L58
        L27:
            com.amazon.aps.iva.p0.a r1 = r0.f
            if (r1 != 0) goto L32
            com.amazon.aps.iva.p0.a r1 = new com.amazon.aps.iva.p0.a
            r1.<init>()
            r0.f = r1
        L32:
            int r4 = r0.e
            int r1 = r1.a(r6, r4)
            int r4 = r0.e
            if (r1 != r4) goto L3d
            goto L59
        L3d:
            boolean r1 = r6 instanceof com.amazon.aps.iva.o0.r0
            if (r1 == 0) goto L58
            com.amazon.aps.iva.p0.b<com.amazon.aps.iva.o0.r0<?>, java.lang.Object> r1 = r0.g
            if (r1 != 0) goto L4c
            com.amazon.aps.iva.p0.b r1 = new com.amazon.aps.iva.p0.b
            r1.<init>()
            r0.g = r1
        L4c:
            r3 = r6
            com.amazon.aps.iva.o0.r0 r3 = (com.amazon.aps.iva.o0.r0) r3
            com.amazon.aps.iva.o0.q0$a r3 = r3.z()
            java.lang.Object r3 = r3.f
            r1.c(r6, r3)
        L58:
            r3 = r2
        L59:
            if (r3 != 0) goto L81
            com.amazon.aps.iva.p0.d<com.amazon.aps.iva.o0.j2> r1 = r5.h
            r1.a(r6, r0)
            boolean r0 = r6 instanceof com.amazon.aps.iva.o0.r0
            if (r0 == 0) goto L81
            com.amazon.aps.iva.p0.d<com.amazon.aps.iva.o0.r0<?>> r0 = r5.j
            r0.f(r6)
            r1 = r6
            com.amazon.aps.iva.o0.r0 r1 = (com.amazon.aps.iva.o0.r0) r1
            com.amazon.aps.iva.o0.q0$a r1 = r1.z()
            java.lang.Object[] r1 = r1.c()
            int r3 = r1.length
        L75:
            if (r2 >= r3) goto L81
            r4 = r1[r2]
            if (r4 == 0) goto L81
            r0.a(r4, r6)
            int r2 = r2 + 1
            goto L75
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.i0.a(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object[]] */
    @Override // com.amazon.aps.iva.o0.o0
    public final void b(com.amazon.aps.iva.p0.c cVar) {
        Object obj;
        boolean z;
        boolean a2;
        com.amazon.aps.iva.p0.c cVar2;
        com.amazon.aps.iva.yb0.j.f(cVar, "values");
        do {
            obj = this.d.get();
            z = true;
            if (obj == null) {
                a2 = true;
            } else {
                a2 = com.amazon.aps.iva.yb0.j.a(obj, j0.a);
            }
            if (a2) {
                cVar2 = cVar;
            } else if (obj instanceof Set) {
                cVar2 = new Set[]{obj, cVar};
            } else if (obj instanceof Object[]) {
                com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = cVar;
                cVar2 = copyOf;
            } else {
                throw new IllegalStateException(("corrupt pendingModifications: " + this.d).toString());
            }
            AtomicReference<Object> atomicReference = this.d;
            while (true) {
                if (!atomicReference.compareAndSet(obj, cVar2)) {
                    if (atomicReference.get() != obj) {
                        z = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z);
        if (obj == null) {
            synchronized (this.e) {
                z();
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
        }
    }

    @Override // com.amazon.aps.iva.o0.l2
    public final b1 c(j2 j2Var, Object obj) {
        boolean z;
        boolean z2;
        i0 i0Var;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(j2Var, "scope");
        int i = j2Var.a;
        boolean z4 = false;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j2Var.a = i | 4;
        }
        c cVar = j2Var.c;
        if (cVar != null) {
            if (cVar.a != Integer.MIN_VALUE) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (!this.g.k(cVar)) {
                    synchronized (this.e) {
                        i0Var = this.p;
                    }
                    if (i0Var != null) {
                        j jVar = i0Var.r;
                        if (jVar.D && jVar.D0(j2Var, obj)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            z4 = true;
                        }
                    }
                    if (z4) {
                        return b1.IMMINENT;
                    }
                    return b1.IGNORED;
                }
                if (j2Var.d != null) {
                    z4 = true;
                }
                if (!z4) {
                    return b1.IGNORED;
                }
                return A(j2Var, cVar, obj);
            }
        }
        return b1.IGNORED;
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final void d(l1 l1Var) {
        a aVar = new a(this.f);
        b3 j = l1Var.a.j();
        try {
            e0.e(j, aVar);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            j.f();
            aVar.g();
        } catch (Throwable th) {
            j.f();
            throw th;
        }
    }

    @Override // com.amazon.aps.iva.o0.f0
    public final void dispose() {
        boolean z;
        synchronized (this.e) {
            if (!this.t) {
                this.t = true;
                com.amazon.aps.iva.v0.a aVar = f.a;
                this.u = f.b;
                ArrayList arrayList = this.r.J;
                if (arrayList != null) {
                    w(arrayList);
                }
                if (this.g.c > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || (true ^ this.f.isEmpty())) {
                    a aVar2 = new a(this.f);
                    if (z) {
                        this.c.getClass();
                        b3 j = this.g.j();
                        e0.e(j, aVar2);
                        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                        j.f();
                        this.c.clear();
                        this.c.d();
                        aVar2.g();
                    }
                    aVar2.f();
                }
                this.r.R();
            }
            com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
        }
        this.b.p(this);
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final void e() {
        synchronized (this.e) {
            try {
                if (!this.l.isEmpty()) {
                    w(this.l);
                }
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            } catch (Throwable th) {
                try {
                    if (!this.f.isEmpty()) {
                        HashSet<v2> hashSet = this.f;
                        com.amazon.aps.iva.yb0.j.f(hashSet, "abandoning");
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        if (!hashSet.isEmpty()) {
                            Trace.beginSection("Compose:abandons");
                            try {
                                Iterator<v2> it = hashSet.iterator();
                                while (it.hasNext()) {
                                    it.remove();
                                    it.next().onAbandoned();
                                }
                                com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                                Trace.endSection();
                            } catch (Throwable th2) {
                                Trace.endSection();
                                throw th2;
                            }
                        }
                    }
                    throw th;
                } catch (Exception e) {
                    t();
                    throw e;
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.o0.f0
    public final boolean f() {
        return this.t;
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final boolean g(com.amazon.aps.iva.p0.c cVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i < cVar.b) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            int i2 = i + 1;
            Object obj = cVar.c[i];
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (this.h.c(obj) || this.j.c(obj)) {
                break;
            }
            i = i2;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final <R> R h(o0 o0Var, int i, com.amazon.aps.iva.xb0.a<? extends R> aVar) {
        if (o0Var != null && !com.amazon.aps.iva.yb0.j.a(o0Var, this) && i >= 0) {
            this.p = (i0) o0Var;
            this.q = i;
            try {
                return aVar.invoke();
            } finally {
                this.p = null;
                this.q = 0;
            }
        }
        return aVar.invoke();
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final boolean i() {
        boolean j0;
        synchronized (this.e) {
            y();
            com.amazon.aps.iva.p0.b<j2, com.amazon.aps.iva.p0.c<Object>> bVar = this.n;
            this.n = new com.amazon.aps.iva.p0.b<>();
            try {
                j0 = this.r.j0(bVar);
                if (!j0) {
                    z();
                }
            } catch (Exception e) {
                this.n = bVar;
                throw e;
            }
        }
        return j0;
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final void invalidateAll() {
        Object[] objArr;
        j2 j2Var;
        synchronized (this.e) {
            for (Object obj : this.g.d) {
                if (obj instanceof j2) {
                    j2Var = (j2) obj;
                } else {
                    j2Var = null;
                }
                if (j2Var != null) {
                    j2Var.invalidate();
                }
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final void j(com.amazon.aps.iva.v0.a aVar) {
        try {
            synchronized (this.e) {
                y();
                com.amazon.aps.iva.p0.b<j2, com.amazon.aps.iva.p0.c<Object>> bVar = this.n;
                this.n = new com.amazon.aps.iva.p0.b<>();
                try {
                    this.r.M(bVar, aVar);
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                } catch (Exception e) {
                    this.n = bVar;
                    throw e;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f.isEmpty()) {
                    HashSet<v2> hashSet = this.f;
                    com.amazon.aps.iva.yb0.j.f(hashSet, "abandoning");
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        Iterator<v2> it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            it.next().onAbandoned();
                        }
                        com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                        Trace.endSection();
                    }
                }
                throw th;
            } catch (Exception e2) {
                t();
                throw e2;
            }
        }
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                if (!com.amazon.aps.iva.yb0.j.a(((m1) ((com.amazon.aps.iva.kb0.j) arrayList.get(i)).b).c, this)) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        e0.f(z);
        try {
            j jVar = this.r;
            jVar.getClass();
            jVar.c0(arrayList);
            jVar.L();
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } catch (Throwable th) {
            HashSet<v2> hashSet = this.f;
            try {
                if (!hashSet.isEmpty()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        Iterator<v2> it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            it.next().onAbandoned();
                        }
                        com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                        Trace.endSection();
                    }
                }
                throw th;
            } catch (Exception e) {
                t();
                throw e;
            }
        }
    }

    @Override // com.amazon.aps.iva.o0.l2
    public final void l(j2 j2Var) {
        com.amazon.aps.iva.yb0.j.f(j2Var, "scope");
        this.o = true;
    }

    @Override // com.amazon.aps.iva.o0.f0
    public final void m(com.amazon.aps.iva.xb0.p<? super i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar) {
        if (!this.t) {
            this.u = pVar;
            this.b.a(this, (com.amazon.aps.iva.v0.a) pVar);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final void n() {
        synchronized (this.e) {
            try {
                w(this.k);
                z();
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            } catch (Throwable th) {
                try {
                    if (!this.f.isEmpty()) {
                        HashSet<v2> hashSet = this.f;
                        com.amazon.aps.iva.yb0.j.f(hashSet, "abandoning");
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        if (!hashSet.isEmpty()) {
                            Trace.beginSection("Compose:abandons");
                            try {
                                Iterator<v2> it = hashSet.iterator();
                                while (it.hasNext()) {
                                    it.remove();
                                    it.next().onAbandoned();
                                }
                                com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                                Trace.endSection();
                            } catch (Throwable th2) {
                                Trace.endSection();
                                throw th2;
                            }
                        }
                    }
                    throw th;
                } catch (Exception e) {
                    t();
                    throw e;
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final boolean o() {
        return this.r.D;
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final void p(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "value");
        synchronized (this.e) {
            B(obj);
            com.amazon.aps.iva.p0.d<r0<?>> dVar = this.j;
            int d = dVar.d(obj);
            if (d >= 0) {
                com.amazon.aps.iva.p0.c<r0<?>> g = dVar.g(d);
                Object[] objArr = g.c;
                int i = g.b;
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj2 = objArr[i2];
                    com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    B((r0) obj2);
                }
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final void q(p2 p2Var) {
        j jVar = this.r;
        jVar.getClass();
        if (!jVar.D) {
            jVar.D = true;
            try {
                p2Var.invoke();
                return;
            } finally {
                jVar.D = false;
            }
        }
        e0.c("Preparing a composition while composing is not supported".toString());
        throw null;
    }

    @Override // com.amazon.aps.iva.o0.f0
    public final boolean r() {
        boolean z;
        synchronized (this.e) {
            if (this.n.c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.amazon.aps.iva.o0.o0
    public final void s() {
        synchronized (this.e) {
            try {
                j jVar = this.r;
                jVar.O();
                ((SparseArray) jVar.u.b).clear();
                if (!this.f.isEmpty()) {
                    HashSet<v2> hashSet = this.f;
                    com.amazon.aps.iva.yb0.j.f(hashSet, "abandoning");
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        Iterator<v2> it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            it.next().onAbandoned();
                        }
                        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                        Trace.endSection();
                    }
                }
                com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
            } catch (Throwable th) {
                try {
                    if (!this.f.isEmpty()) {
                        HashSet<v2> hashSet2 = this.f;
                        com.amazon.aps.iva.yb0.j.f(hashSet2, "abandoning");
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        if (!hashSet2.isEmpty()) {
                            Trace.beginSection("Compose:abandons");
                            try {
                                Iterator<v2> it2 = hashSet2.iterator();
                                while (it2.hasNext()) {
                                    it2.remove();
                                    it2.next().onAbandoned();
                                }
                                com.amazon.aps.iva.kb0.q qVar3 = com.amazon.aps.iva.kb0.q.a;
                                Trace.endSection();
                            } catch (Throwable th2) {
                                Trace.endSection();
                                throw th2;
                            }
                        }
                    }
                    throw th;
                } catch (Exception e) {
                    t();
                    throw e;
                }
            }
        }
    }

    public final void t() {
        this.d.set(null);
        this.k.clear();
        this.l.clear();
        this.f.clear();
    }

    public final HashSet<j2> u(HashSet<j2> hashSet, Object obj, boolean z) {
        boolean z2;
        com.amazon.aps.iva.p0.d<j2> dVar = this.h;
        int d = dVar.d(obj);
        if (d >= 0) {
            com.amazon.aps.iva.p0.c<j2> g = dVar.g(d);
            Object[] objArr = g.c;
            int i = g.b;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj2 = objArr[i2];
                com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                j2 j2Var = (j2) obj2;
                if (!this.m.e(obj, j2Var) && j2Var.a(obj) != b1.IGNORED) {
                    if (j2Var.g != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && !z) {
                        this.i.add(j2Var);
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>();
                        }
                        hashSet.add(j2Var);
                    }
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(java.util.Set<? extends java.lang.Object> r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.i0.v(java.util.Set, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.util.ArrayList r20) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.i0.w(java.util.ArrayList):void");
    }

    public final void x() {
        boolean z;
        com.amazon.aps.iva.p0.d<r0<?>> dVar = this.j;
        int[] iArr = dVar.a;
        com.amazon.aps.iva.p0.c<r0<?>>[] cVarArr = dVar.c;
        Object[] objArr = dVar.b;
        int i = dVar.d;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i2];
            com.amazon.aps.iva.p0.c<r0<?>> cVar = cVarArr[i4];
            com.amazon.aps.iva.yb0.j.c(cVar);
            Object[] objArr2 = cVar.c;
            int i5 = cVar.b;
            int i6 = 0;
            int i7 = 0;
            while (i7 < i5) {
                Object obj = objArr2[i7];
                com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                com.amazon.aps.iva.p0.c<r0<?>>[] cVarArr2 = cVarArr;
                if (!(!this.h.c((r0) obj))) {
                    if (i6 != i7) {
                        objArr2[i6] = obj;
                    }
                    i6++;
                }
                i7++;
                cVarArr = cVarArr2;
            }
            com.amazon.aps.iva.p0.c<r0<?>>[] cVarArr3 = cVarArr;
            for (int i8 = i6; i8 < i5; i8++) {
                objArr2[i8] = null;
            }
            cVar.b = i6;
            if (i6 > 0) {
                if (i3 != i2) {
                    int i9 = iArr[i3];
                    iArr[i3] = i4;
                    iArr[i2] = i9;
                }
                i3++;
            }
            i2++;
            cVarArr = cVarArr3;
        }
        int i10 = dVar.d;
        for (int i11 = i3; i11 < i10; i11++) {
            objArr[iArr[i11]] = null;
        }
        dVar.d = i3;
        HashSet<j2> hashSet = this.i;
        if (!hashSet.isEmpty()) {
            Iterator<j2> it = hashSet.iterator();
            com.amazon.aps.iva.yb0.j.e(it, "iterator()");
            while (it.hasNext()) {
                if (it.next().g != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }

    public final void y() {
        AtomicReference<Object> atomicReference = this.d;
        Object obj = j0.a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (!com.amazon.aps.iva.yb0.j.a(andSet, obj)) {
                if (andSet instanceof Set) {
                    v((Set) andSet, true);
                    return;
                } else if (andSet instanceof Object[]) {
                    for (Set<? extends Object> set : (Set[]) andSet) {
                        v(set, true);
                    }
                    return;
                } else {
                    e0.c("corrupt pendingModifications drain: " + atomicReference);
                    throw null;
                }
            }
            e0.c("pending composition has not been applied");
            throw null;
        }
    }

    public final void z() {
        AtomicReference<Object> atomicReference = this.d;
        Object andSet = atomicReference.getAndSet(null);
        if (!com.amazon.aps.iva.yb0.j.a(andSet, j0.a)) {
            if (andSet instanceof Set) {
                v((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set<? extends Object> set : (Set[]) andSet) {
                    v(set, false);
                }
            } else if (andSet == null) {
                e0.c("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw null;
            } else {
                e0.c("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
        }
    }
}
