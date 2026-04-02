package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.o0.h3;
import com.amazon.aps.iva.o0.q0;
import com.amazon.aps.iva.o0.r0;
import com.amazon.aps.iva.o0.s0;
import com.amazon.aps.iva.o0.s3;
import com.amazon.aps.iva.u1.w0;
import com.amazon.aps.iva.y0.h;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SnapshotStateObserver.kt */
/* loaded from: classes.dex */
public final class y {
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.kb0.q> a;
    public boolean c;
    public g g;
    public boolean h;
    public a i;
    public final AtomicReference<Object> b = new AtomicReference<>(null);
    public final b d = new b();
    public final c e = new c();
    public final com.amazon.aps.iva.p0.f<a> f = new com.amazon.aps.iva.p0.f<>(new a[16]);

    /* compiled from: SnapshotStateObserver.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> a;
        public Object b;
        public com.amazon.aps.iva.p0.a c;
        public int d;
        public final com.amazon.aps.iva.p0.d<Object> e;
        public final com.amazon.aps.iva.p0.b<Object, com.amazon.aps.iva.p0.a> f;
        public final com.amazon.aps.iva.p0.c<Object> g;
        public final com.amazon.aps.iva.p0.f<r0<?>> h;
        public final C0878a i;
        public int j;
        public final com.amazon.aps.iva.p0.d<r0<?>> k;
        public final HashMap<r0<?>, Object> l;

        /* compiled from: SnapshotStateObserver.kt */
        /* renamed from: com.amazon.aps.iva.y0.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0878a implements s0 {
            public C0878a() {
            }

            @Override // com.amazon.aps.iva.o0.s0
            public final void a(r0<?> r0Var) {
                com.amazon.aps.iva.yb0.j.f(r0Var, "derivedState");
                a aVar = a.this;
                aVar.j--;
            }

            @Override // com.amazon.aps.iva.o0.s0
            public final void b(r0<?> r0Var) {
                com.amazon.aps.iva.yb0.j.f(r0Var, "derivedState");
                a.this.j++;
            }
        }

        public a(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "onChanged");
            this.a = lVar;
            this.d = -1;
            this.e = new com.amazon.aps.iva.p0.d<>();
            this.f = new com.amazon.aps.iva.p0.b<>();
            this.g = new com.amazon.aps.iva.p0.c<>();
            this.h = new com.amazon.aps.iva.p0.f<>(new r0[16]);
            this.i = new C0878a();
            this.k = new com.amazon.aps.iva.p0.d<>();
            this.l = new HashMap<>();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object obj, c cVar, com.amazon.aps.iva.xb0.a aVar) {
            boolean z;
            com.amazon.aps.iva.yb0.j.f(obj, "scope");
            com.amazon.aps.iva.yb0.j.f(cVar, "readObserver");
            com.amazon.aps.iva.yb0.j.f(aVar, "block");
            Object obj2 = this.b;
            com.amazon.aps.iva.p0.a aVar2 = this.c;
            int i = this.d;
            this.b = obj;
            this.c = this.f.b(obj);
            if (this.d == -1) {
                this.d = m.k().d();
            }
            C0878a c0878a = this.i;
            com.amazon.aps.iva.p0.f K = com.amazon.aps.iva.cq.b.K();
            boolean z2 = true;
            try {
                K.b(c0878a);
                h.a.a(cVar, aVar);
                K.l(K.d - 1);
                Object obj3 = this.b;
                com.amazon.aps.iva.yb0.j.c(obj3);
                int i2 = this.d;
                com.amazon.aps.iva.p0.a aVar3 = this.c;
                if (aVar3 != null) {
                    Object[] objArr = aVar3.b;
                    int[] iArr = aVar3.c;
                    int i3 = aVar3.a;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < i3) {
                        Object obj4 = objArr[i4];
                        com.amazon.aps.iva.yb0.j.d(obj4, "null cannot be cast to non-null type kotlin.Any");
                        int i6 = iArr[i4];
                        if (i6 != i2) {
                            z = z2;
                        } else {
                            z = false;
                        }
                        if (z) {
                            com.amazon.aps.iva.p0.d<Object> dVar = this.e;
                            dVar.e(obj4, obj3);
                            if ((obj4 instanceof r0) && !dVar.c(obj4)) {
                                this.k.f(obj4);
                                this.l.remove(obj4);
                            }
                        }
                        if (!z) {
                            if (i5 != i4) {
                                objArr[i5] = obj4;
                                iArr[i5] = i6;
                            }
                            i5++;
                        }
                        i4++;
                        z2 = true;
                    }
                    for (int i7 = i5; i7 < i3; i7++) {
                        objArr[i7] = null;
                    }
                    aVar3.a = i5;
                }
                this.b = obj2;
                this.c = aVar2;
                this.d = i;
            } catch (Throwable th) {
                K.l(K.d - 1);
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r17v0, types: [com.amazon.aps.iva.o0.h3] */
        public final boolean b(Set<? extends Object> set) {
            boolean z;
            int d;
            int d2;
            HashMap<r0<?>, Object> hashMap = this.l;
            boolean z2 = set instanceof com.amazon.aps.iva.p0.c;
            s3 s3Var = s3.a;
            com.amazon.aps.iva.p0.f<r0<?>> fVar = this.h;
            com.amazon.aps.iva.p0.d<r0<?>> dVar = this.k;
            com.amazon.aps.iva.p0.d<Object> dVar2 = this.e;
            com.amazon.aps.iva.p0.c<Object> cVar = this.g;
            if (z2) {
                com.amazon.aps.iva.p0.c cVar2 = (com.amazon.aps.iva.p0.c) set;
                Object[] objArr = cVar2.c;
                int i = cVar2.b;
                int i2 = 0;
                z = false;
                while (i2 < i) {
                    Object obj = objArr[i2];
                    com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (dVar.c(obj) && (d2 = dVar.d(obj)) >= 0) {
                        com.amazon.aps.iva.p0.c<r0<?>> g = dVar.g(d2);
                        Object[] objArr2 = g.c;
                        int i3 = g.b;
                        int i4 = 0;
                        while (i4 < i3) {
                            int i5 = i;
                            Object obj2 = objArr2[i4];
                            com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            r0 r0Var = (r0) obj2;
                            Object[] objArr3 = objArr;
                            Object obj3 = hashMap.get(r0Var);
                            ?? b = r0Var.b();
                            s3 s3Var2 = s3Var;
                            if (b != 0) {
                                s3Var = b;
                            }
                            Object[] objArr4 = objArr2;
                            if (!s3Var.a(r0Var.z().f, obj3)) {
                                int d3 = dVar2.d(r0Var);
                                if (d3 >= 0) {
                                    com.amazon.aps.iva.p0.c<Object> g2 = dVar2.g(d3);
                                    Object[] objArr5 = g2.c;
                                    int i6 = g2.b;
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        Object obj4 = objArr5[i7];
                                        com.amazon.aps.iva.yb0.j.d(obj4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        cVar.add(obj4);
                                        i7++;
                                        z = true;
                                    }
                                }
                            } else {
                                fVar.b(r0Var);
                            }
                            i4++;
                            i = i5;
                            objArr = objArr3;
                            objArr2 = objArr4;
                            s3Var = s3Var2;
                        }
                    }
                    int i8 = i;
                    Object[] objArr6 = objArr;
                    s3 s3Var3 = s3Var;
                    int d4 = dVar2.d(obj);
                    if (d4 >= 0) {
                        com.amazon.aps.iva.p0.c<Object> g3 = dVar2.g(d4);
                        Object[] objArr7 = g3.c;
                        int i9 = g3.b;
                        int i10 = 0;
                        while (i10 < i9) {
                            Object obj5 = objArr7[i10];
                            com.amazon.aps.iva.yb0.j.d(obj5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            cVar.add(obj5);
                            i10++;
                            z = true;
                        }
                    }
                    i2++;
                    i = i8;
                    objArr = objArr6;
                    s3Var = s3Var3;
                }
            } else {
                Iterator it = set.iterator();
                z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (dVar.c(next) && (d = dVar.d(next)) >= 0) {
                        com.amazon.aps.iva.p0.c<r0<?>> g4 = dVar.g(d);
                        Object[] objArr8 = g4.c;
                        int i11 = g4.b;
                        int i12 = 0;
                        while (i12 < i11) {
                            Object obj6 = objArr8[i12];
                            com.amazon.aps.iva.yb0.j.d(obj6, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            r0 r0Var2 = (r0) obj6;
                            Object obj7 = hashMap.get(r0Var2);
                            h3 b2 = r0Var2.b();
                            Iterator it2 = it;
                            if (b2 == null) {
                                b2 = s3Var;
                            }
                            if (!b2.a(r0Var2.z().f, obj7)) {
                                int d5 = dVar2.d(r0Var2);
                                if (d5 >= 0) {
                                    com.amazon.aps.iva.p0.c<Object> g5 = dVar2.g(d5);
                                    Object[] objArr9 = g5.c;
                                    int i13 = g5.b;
                                    int i14 = 0;
                                    while (i14 < i13) {
                                        Object obj8 = objArr9[i14];
                                        com.amazon.aps.iva.yb0.j.d(obj8, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        cVar.add(obj8);
                                        i14++;
                                        z = true;
                                    }
                                }
                            } else {
                                fVar.b(r0Var2);
                            }
                            i12++;
                            it = it2;
                        }
                    }
                    Iterator it3 = it;
                    int d6 = dVar2.d(next);
                    if (d6 >= 0) {
                        com.amazon.aps.iva.p0.c<Object> g6 = dVar2.g(d6);
                        Object[] objArr10 = g6.c;
                        int i15 = g6.b;
                        int i16 = 0;
                        while (i16 < i15) {
                            Object obj9 = objArr10[i16];
                            com.amazon.aps.iva.yb0.j.d(obj9, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            cVar.add(obj9);
                            i16++;
                            z = true;
                        }
                    }
                    it = it3;
                }
            }
            if (fVar.j()) {
                int i17 = fVar.d;
                if (i17 > 0) {
                    r0<?>[] r0VarArr = fVar.b;
                    int i18 = 0;
                    do {
                        r0<?> r0Var3 = r0VarArr[i18];
                        com.amazon.aps.iva.yb0.j.f(r0Var3, "derivedState");
                        int d7 = m.k().d();
                        int d8 = dVar2.d(r0Var3);
                        if (d8 >= 0) {
                            com.amazon.aps.iva.p0.c<Object> g7 = dVar2.g(d8);
                            Object[] objArr11 = g7.c;
                            int i19 = g7.b;
                            for (int i20 = 0; i20 < i19; i20++) {
                                Object obj10 = objArr11[i20];
                                com.amazon.aps.iva.yb0.j.d(obj10, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                com.amazon.aps.iva.p0.b<Object, com.amazon.aps.iva.p0.a> bVar = this.f;
                                com.amazon.aps.iva.p0.a b3 = bVar.b(obj10);
                                if (b3 == null) {
                                    b3 = new com.amazon.aps.iva.p0.a();
                                    bVar.c(obj10, b3);
                                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                                }
                                c(r0Var3, d7, obj10, b3);
                            }
                        }
                        i18++;
                    } while (i18 < i17);
                    fVar.f();
                } else {
                    fVar.f();
                }
            }
            return z;
        }

        public final void c(Object obj, int i, Object obj2, com.amazon.aps.iva.p0.a aVar) {
            if (this.j > 0) {
                return;
            }
            int a = aVar.a(obj, i);
            if ((obj instanceof r0) && a != i) {
                q0.a z = ((r0) obj).z();
                this.l.put(obj, z.f);
                Object[] c = z.c();
                com.amazon.aps.iva.p0.d<r0<?>> dVar = this.k;
                dVar.f(obj);
                for (Object obj3 : c) {
                    if (obj3 == null) {
                        break;
                    }
                    dVar.a(obj3, obj);
                }
            }
            if (a == -1) {
                this.e.a(obj, obj2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(w0 w0Var) {
            com.amazon.aps.iva.p0.b<Object, com.amazon.aps.iva.p0.a> bVar = this.f;
            int i = bVar.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = bVar.a[i3];
                com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                com.amazon.aps.iva.p0.a aVar = (com.amazon.aps.iva.p0.a) bVar.b[i3];
                Boolean bool = (Boolean) w0Var.invoke(obj);
                if (bool.booleanValue()) {
                    Object[] objArr = aVar.b;
                    int[] iArr = aVar.c;
                    int i4 = aVar.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        Object obj2 = objArr[i5];
                        com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i6 = iArr[i5];
                        com.amazon.aps.iva.p0.d<Object> dVar = this.e;
                        dVar.e(obj2, obj);
                        if ((obj2 instanceof r0) && !dVar.c(obj2)) {
                            this.k.f(obj2);
                            this.l.remove(obj2);
                        }
                    }
                }
                if (!bool.booleanValue()) {
                    if (i2 != i3) {
                        bVar.a[i2] = obj;
                        Object[] objArr2 = bVar.b;
                        objArr2[i2] = objArr2[i3];
                    }
                    i2++;
                }
            }
            int i7 = bVar.c;
            if (i7 > i2) {
                for (int i8 = i2; i8 < i7; i8++) {
                    bVar.a[i8] = null;
                    bVar.b[i8] = null;
                }
                bVar.c = i2;
            }
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Set<? extends Object>, h, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(Set<? extends Object> set, h hVar) {
            y yVar;
            boolean z;
            List L0;
            Set<? extends Object> set2 = set;
            com.amazon.aps.iva.yb0.j.f(set2, "applied");
            com.amazon.aps.iva.yb0.j.f(hVar, "<anonymous parameter 1>");
            do {
                yVar = y.this;
                AtomicReference<Object> atomicReference = yVar.b;
                Object obj = atomicReference.get();
                z = true;
                if (obj == null) {
                    L0 = set2;
                } else if (obj instanceof Set) {
                    L0 = f1.K(obj, set2);
                } else if (obj instanceof List) {
                    L0 = com.amazon.aps.iva.lb0.x.L0(f1.J(set2), (Collection) obj);
                } else {
                    com.amazon.aps.iva.o0.e0.c("Unexpected notification");
                    throw null;
                }
                while (true) {
                    if (!atomicReference.compareAndSet(obj, L0)) {
                        if (atomicReference.get() != obj) {
                            z = false;
                            continue;
                            break;
                        }
                    }
                }
            } while (!z);
            if (y.a(yVar)) {
                yVar.a.invoke(new z(yVar));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
            com.amazon.aps.iva.yb0.j.f(obj, "state");
            y yVar = y.this;
            if (!yVar.h) {
                synchronized (yVar.f) {
                    a aVar = yVar.i;
                    com.amazon.aps.iva.yb0.j.c(aVar);
                    Object obj2 = aVar.b;
                    com.amazon.aps.iva.yb0.j.c(obj2);
                    int i = aVar.d;
                    com.amazon.aps.iva.p0.a aVar2 = aVar.c;
                    if (aVar2 == null) {
                        aVar2 = new com.amazon.aps.iva.p0.a();
                        aVar.c = aVar2;
                        aVar.f.c(obj2, aVar2);
                        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    }
                    aVar.c(obj, i, obj2, aVar2);
                    com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.kb0.q> lVar) {
        this.a = lVar;
    }

    public static final boolean a(y yVar) {
        boolean z;
        Set<? extends Object> set;
        Object[] objArr;
        synchronized (yVar.f) {
            z = yVar.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference<Object> atomicReference = yVar.b;
            Object obj = atomicReference.get();
            Set<? extends Object> set2 = null;
            r4 = null;
            Object subList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    set = (Set) list.get(0);
                    if (list.size() == 2) {
                        subList = list.get(1);
                    } else if (list.size() > 2) {
                        subList = list.subList(1, list.size());
                    }
                } else {
                    com.amazon.aps.iva.o0.e0.c("Unexpected notification");
                    throw null;
                }
                Object obj2 = subList;
                while (true) {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        objArr = 1;
                        break;
                    } else if (atomicReference.get() != obj) {
                        objArr = null;
                        break;
                    }
                }
                if (objArr != null) {
                    set2 = set;
                } else {
                    continue;
                }
            }
            if (set2 == null) {
                return z2;
            }
            synchronized (yVar.f) {
                com.amazon.aps.iva.p0.f<a> fVar = yVar.f;
                int i = fVar.d;
                if (i > 0) {
                    a[] aVarArr = fVar.b;
                    int i2 = 0;
                    do {
                        if (!aVarArr[i2].b(set2) && !z2) {
                            z2 = false;
                            i2++;
                        }
                        z2 = true;
                        i2++;
                    } while (i2 < i);
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                } else {
                    com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f) {
            com.amazon.aps.iva.p0.f<a> fVar = this.f;
            int i = fVar.d;
            if (i > 0) {
                a[] aVarArr = fVar.b;
                int i2 = 0;
                do {
                    a aVar = aVarArr[i2];
                    aVar.e.b();
                    com.amazon.aps.iva.p0.b<Object, com.amazon.aps.iva.p0.a> bVar = aVar.f;
                    bVar.c = 0;
                    com.amazon.aps.iva.lb0.m.K(bVar.a, null);
                    com.amazon.aps.iva.lb0.m.K(bVar.b, null);
                    aVar.k.b();
                    aVar.l.clear();
                    i2++;
                } while (i2 < i);
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            } else {
                com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
            }
        }
    }

    public final <T> void c(T t, com.amazon.aps.iva.xb0.l<? super T, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        a aVar2;
        a aVar3;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(t, "scope");
        com.amazon.aps.iva.yb0.j.f(lVar, "onValueChangedForScope");
        com.amazon.aps.iva.yb0.j.f(aVar, "block");
        synchronized (this.f) {
            com.amazon.aps.iva.p0.f<a> fVar = this.f;
            int i = fVar.d;
            if (i > 0) {
                a[] aVarArr = fVar.b;
                int i2 = 0;
                do {
                    aVar2 = aVarArr[i2];
                    if (aVar2.a == lVar) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                } while (i2 < i);
                aVar2 = null;
            } else {
                aVar2 = null;
            }
            aVar3 = aVar2;
            if (aVar3 == null) {
                com.amazon.aps.iva.yb0.h0.e(1, lVar);
                aVar3 = new a(lVar);
                fVar.b(aVar3);
            }
        }
        boolean z2 = this.h;
        a aVar4 = this.i;
        try {
            this.h = false;
            this.i = aVar3;
            aVar3.a(t, this.e, aVar);
        } finally {
            this.i = aVar4;
            this.h = z2;
        }
    }

    public final void d() {
        b bVar = this.d;
        com.amazon.aps.iva.yb0.j.f(bVar, "observer");
        m.f(m.a);
        synchronized (m.c) {
            m.h.add(bVar);
        }
        this.g = new g(bVar);
    }
}
