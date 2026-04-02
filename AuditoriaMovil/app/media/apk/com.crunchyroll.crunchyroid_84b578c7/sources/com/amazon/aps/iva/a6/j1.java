package com.amazon.aps.iva.a6;

import android.util.Pair;
import com.amazon.aps.iva.o6.j0;
import com.amazon.aps.iva.o6.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: MediaSourceList.java */
/* loaded from: classes.dex */
public final class j1 {
    public final com.amazon.aps.iva.b6.p1 a;
    public final d e;
    public final com.amazon.aps.iva.b6.a h;
    public final com.amazon.aps.iva.t5.l i;
    public boolean k;
    public com.amazon.aps.iva.w5.y l;
    public com.amazon.aps.iva.o6.j0 j = new j0.a();
    public final IdentityHashMap<com.amazon.aps.iva.o6.u, c> c = new IdentityHashMap<>();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap<c, b> f = new HashMap<>();
    public final HashSet g = new HashSet();

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes.dex */
    public final class a implements com.amazon.aps.iva.o6.z, com.amazon.aps.iva.g6.e {
        public final c b;

        public a(c cVar) {
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.o6.z
        public final void G(int i, v.b bVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar) {
            Pair<Integer, v.b> a = a(i, bVar);
            if (a != null) {
                j1.this.i.i(new f1(this, a, qVar, tVar, 0));
            }
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void I(int i, v.b bVar) {
            Pair<Integer, v.b> a = a(i, bVar);
            if (a != null) {
                j1.this.i.i(new i1(0, this, a));
            }
        }

        @Override // com.amazon.aps.iva.o6.z
        public final void N(int i, v.b bVar, com.amazon.aps.iva.o6.t tVar) {
            Pair<Integer, v.b> a = a(i, bVar);
            if (a != null) {
                j1.this.i.i(new b1(this, 0, a, tVar));
            }
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void Q(int i, v.b bVar) {
            Pair<Integer, v.b> a = a(i, bVar);
            if (a != null) {
                j1.this.i.i(new com.amazon.aps.iva.o4.b(1, this, a));
            }
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void R(int i, v.b bVar, int i2) {
            Pair<Integer, v.b> a = a(i, bVar);
            if (a != null) {
                j1.this.i.i(new e1(this, i2, 0, a));
            }
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void S(int i, v.b bVar, Exception exc) {
            Pair<Integer, v.b> a = a(i, bVar);
            if (a != null) {
                j1.this.i.i(new com.amazon.aps.iva.n4.h(this, 2, a, exc));
            }
        }

        @Override // com.amazon.aps.iva.o6.z
        public final void T(int i, v.b bVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar) {
            Pair<Integer, v.b> a = a(i, bVar);
            if (a != null) {
                j1.this.i.i(new c1(this, a, qVar, tVar, 0));
            }
        }

        @Override // com.amazon.aps.iva.o6.z
        public final void U(int i, v.b bVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar) {
            Pair<Integer, v.b> a = a(i, bVar);
            if (a != null) {
                j1.this.i.i(new d1(this, a, qVar, tVar, 0));
            }
        }

        @Override // com.amazon.aps.iva.o6.z
        public final void Y(int i, v.b bVar, com.amazon.aps.iva.o6.t tVar) {
            Pair<Integer, v.b> a = a(i, bVar);
            if (a != null) {
                j1.this.i.i(new com.amazon.aps.iva.i4.d(this, 2, a, tVar));
            }
        }

        public final Pair<Integer, v.b> a(int i, v.b bVar) {
            v.b bVar2;
            c cVar = this.b;
            v.b bVar3 = null;
            if (bVar != null) {
                int i2 = 0;
                while (true) {
                    if (i2 < cVar.c.size()) {
                        if (((v.b) cVar.c.get(i2)).d == bVar.d) {
                            Object obj = cVar.b;
                            int i3 = com.amazon.aps.iva.a6.a.j;
                            bVar2 = bVar.b(Pair.create(obj, bVar.a));
                            break;
                        }
                        i2++;
                    } else {
                        bVar2 = null;
                        break;
                    }
                }
                if (bVar2 == null) {
                    return null;
                }
                bVar3 = bVar2;
            }
            return Pair.create(Integer.valueOf(i + cVar.d), bVar3);
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void a0(int i, v.b bVar) {
            Pair<Integer, v.b> a = a(i, bVar);
            if (a != null) {
                j1.this.i.i(new g1(0, this, a));
            }
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void f0(int i, v.b bVar) {
            Pair<Integer, v.b> a = a(i, bVar);
            if (a != null) {
                j1.this.i.i(new com.amazon.aps.iva.o4.c(1, this, a));
            }
        }

        @Override // com.amazon.aps.iva.o6.z
        public final void j0(int i, v.b bVar, final com.amazon.aps.iva.o6.q qVar, final com.amazon.aps.iva.o6.t tVar, final IOException iOException, final boolean z) {
            final Pair<Integer, v.b> a = a(i, bVar);
            if (a != null) {
                j1.this.i.i(new Runnable() { // from class: com.amazon.aps.iva.a6.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.amazon.aps.iva.o6.q qVar2 = qVar;
                        com.amazon.aps.iva.o6.t tVar2 = tVar;
                        IOException iOException2 = iOException;
                        boolean z2 = z;
                        com.amazon.aps.iva.b6.a aVar = j1.this.h;
                        Pair pair = a;
                        aVar.j0(((Integer) pair.first).intValue(), (v.b) pair.second, qVar2, tVar2, iOException2, z2);
                    }
                });
            }
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final com.amazon.aps.iva.o6.v a;
        public final v.c b;
        public final a c;

        public b(com.amazon.aps.iva.o6.s sVar, a1 a1Var, a aVar) {
            this.a = sVar;
            this.b = a1Var;
            this.c = aVar;
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes.dex */
    public static final class c implements z0 {
        public final com.amazon.aps.iva.o6.s a;
        public int d;
        public boolean e;
        public final ArrayList c = new ArrayList();
        public final Object b = new Object();

        public c(com.amazon.aps.iva.o6.v vVar, boolean z) {
            this.a = new com.amazon.aps.iva.o6.s(vVar, z);
        }

        @Override // com.amazon.aps.iva.a6.z0
        public final Object a() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.a6.z0
        public final com.amazon.aps.iva.q5.r0 b() {
            return this.a.o;
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    public j1(d dVar, com.amazon.aps.iva.b6.a aVar, com.amazon.aps.iva.t5.l lVar, com.amazon.aps.iva.b6.p1 p1Var) {
        this.a = p1Var;
        this.e = dVar;
        this.h = aVar;
        this.i = lVar;
    }

    public final com.amazon.aps.iva.q5.r0 a(int i, List<c> list, com.amazon.aps.iva.o6.j0 j0Var) {
        if (!list.isEmpty()) {
            this.j = j0Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                c cVar = list.get(i2 - i);
                ArrayList arrayList = this.b;
                if (i2 > 0) {
                    c cVar2 = (c) arrayList.get(i2 - 1);
                    cVar.d = cVar2.a.o.q() + cVar2.d;
                    cVar.e = false;
                    cVar.c.clear();
                } else {
                    cVar.d = 0;
                    cVar.e = false;
                    cVar.c.clear();
                }
                int q = cVar.a.o.q();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((c) arrayList.get(i3)).d += q;
                }
                arrayList.add(i2, cVar);
                this.d.put(cVar.b, cVar);
                if (this.k) {
                    e(cVar);
                    if (this.c.isEmpty()) {
                        this.g.add(cVar);
                    } else {
                        b bVar = this.f.get(cVar);
                        if (bVar != null) {
                            bVar.a.e(bVar.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final com.amazon.aps.iva.q5.r0 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return com.amazon.aps.iva.q5.r0.b;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            c cVar = (c) arrayList.get(i2);
            cVar.d = i;
            i += cVar.a.o.q();
        }
        return new n1(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.c.isEmpty()) {
                b bVar = this.f.get(cVar);
                if (bVar != null) {
                    bVar.a.e(bVar.b);
                }
                it.remove();
            }
        }
    }

    public final void d(c cVar) {
        if (cVar.e && cVar.c.isEmpty()) {
            b remove = this.f.remove(cVar);
            remove.getClass();
            v.c cVar2 = remove.b;
            com.amazon.aps.iva.o6.v vVar = remove.a;
            vVar.n(cVar2);
            a aVar = remove.c;
            vVar.f(aVar);
            vVar.i(aVar);
            this.g.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.amazon.aps.iva.o6.v$c, com.amazon.aps.iva.a6.a1] */
    public final void e(c cVar) {
        com.amazon.aps.iva.o6.s sVar = cVar.a;
        ?? r1 = new v.c() { // from class: com.amazon.aps.iva.a6.a1
            @Override // com.amazon.aps.iva.o6.v.c
            public final void b(com.amazon.aps.iva.o6.v vVar, com.amazon.aps.iva.q5.r0 r0Var) {
                ((q0) j1.this.e).i.k(22);
            }
        };
        a aVar = new a(cVar);
        this.f.put(cVar, new b(sVar, r1, aVar));
        sVar.g(com.amazon.aps.iva.t5.g0.n(null), aVar);
        sVar.d.a(com.amazon.aps.iva.t5.g0.n(null), aVar);
        sVar.d(r1, this.l, this.a);
    }

    public final void f(com.amazon.aps.iva.o6.u uVar) {
        IdentityHashMap<com.amazon.aps.iva.o6.u, c> identityHashMap = this.c;
        c remove = identityHashMap.remove(uVar);
        remove.getClass();
        remove.a.c(uVar);
        remove.c.remove(((com.amazon.aps.iva.o6.r) uVar).b);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(remove);
    }

    public final void g(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.b;
            c cVar = (c) arrayList.remove(i3);
            this.d.remove(cVar.b);
            int i4 = -cVar.a.o.q();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((c) arrayList.get(i5)).d += i4;
            }
            cVar.e = true;
            if (this.k) {
                d(cVar);
            }
        }
    }
}
