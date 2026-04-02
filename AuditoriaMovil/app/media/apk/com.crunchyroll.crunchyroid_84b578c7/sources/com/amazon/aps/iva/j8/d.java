package com.amazon.aps.iva.j8;

import com.amazon.aps.iva.j8.a;
import com.amazon.aps.iva.j8.g;
import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.q.c0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: ContiguousPagedList.java */
/* loaded from: classes.dex */
public final class d<K, V> extends h<V> {
    public final com.amazon.aps.iva.j8.c<K, V> p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public final a u;

    /* compiled from: ContiguousPagedList.java */
    /* loaded from: classes.dex */
    public class a extends g.a<V> {
        public a() {
        }

        @Override // com.amazon.aps.iva.j8.g.a
        public final void a(int i, g<V> gVar) {
            boolean z;
            boolean z2;
            boolean z3;
            gVar.getClass();
            boolean z4 = true;
            if (gVar == g.f) {
                z = true;
            } else {
                z = false;
            }
            d dVar = d.this;
            if (z) {
                dVar.e();
            } else if (dVar.l()) {
            } else {
                j<T> jVar = dVar.f;
                List<V> list = gVar.a;
                if (i == 0) {
                    int i2 = gVar.b;
                    int i3 = gVar.c;
                    int i4 = gVar.d;
                    jVar.g(i2, i3, i4, list);
                    dVar.q(0, jVar.size());
                    if (dVar.g == -1) {
                        dVar.g = (list.size() / 2) + i2 + i4;
                    }
                } else if (i == 1) {
                    jVar.getClass();
                    int size = list.size();
                    if (size != 0) {
                        int i5 = jVar.g;
                        ArrayList<List<T>> arrayList = jVar.c;
                        if (i5 > 0) {
                            int size2 = ((List) arrayList.get(arrayList.size() - 1)).size();
                            int i6 = jVar.g;
                            if (size2 != i6 || size > i6) {
                                jVar.g = -1;
                            }
                        }
                        arrayList.add(list);
                        jVar.f += size;
                        int min = Math.min(jVar.d, size);
                        int i7 = size - min;
                        if (min != 0) {
                            jVar.d -= min;
                        }
                        jVar.i += size;
                        dVar.w((jVar.b + jVar.f) - size, min, i7);
                    }
                } else if (i == 2) {
                    jVar.getClass();
                    int size3 = list.size();
                    if (size3 != 0) {
                        int i8 = jVar.g;
                        ArrayList<List<T>> arrayList2 = jVar.c;
                        if (i8 > 0 && size3 != i8) {
                            if (arrayList2.size() == 1 && size3 > jVar.g) {
                                jVar.g = size3;
                            } else {
                                jVar.g = -1;
                            }
                        }
                        arrayList2.add(0, list);
                        jVar.f += size3;
                        int min2 = Math.min(jVar.b, size3);
                        int i9 = size3 - min2;
                        if (min2 != 0) {
                            jVar.b -= min2;
                        }
                        jVar.e -= i9;
                        jVar.h += size3;
                        dVar.x(jVar.b, min2, i9);
                    }
                } else {
                    throw new IllegalArgumentException(c0.a("unexpected resultType ", i));
                }
                if (dVar.d != null) {
                    if (jVar.size() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 && i == 2 && list.size() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 || i != 1 || list.size() != 0) {
                        z4 = false;
                    }
                    dVar.d(z2, z3, z4);
                }
            }
        }
    }

    /* compiled from: ContiguousPagedList.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ int b;
        public final /* synthetic */ Object c;

        public b(int i, Object obj) {
            this.b = i;
            this.c = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            if (dVar.l()) {
                return;
            }
            com.amazon.aps.iva.j8.c<K, V> cVar = dVar.p;
            if (cVar.e()) {
                dVar.e();
                return;
            }
            cVar.g(this.b, dVar.e.a, dVar.b, dVar.u);
        }
    }

    /* compiled from: ContiguousPagedList.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ int b;
        public final /* synthetic */ Object c;

        public c(int i, Object obj) {
            this.b = i;
            this.c = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            if (dVar.l()) {
                return;
            }
            com.amazon.aps.iva.j8.c<K, V> cVar = dVar.p;
            if (cVar.e()) {
                dVar.e();
                return;
            }
            cVar.f(this.b, dVar.e.a, dVar.b, dVar.u);
        }
    }

    public d(com.amazon.aps.iva.j8.c<K, V> cVar, Executor executor, Executor executor2, h.c<V> cVar2, h.f fVar, K k, int i) {
        super(new j(), executor, executor2, cVar2, fVar);
        this.q = false;
        this.r = false;
        this.s = 0;
        this.t = 0;
        a aVar = new a();
        this.u = aVar;
        this.p = cVar;
        this.g = i;
        if (cVar.e()) {
            e();
            return;
        }
        h.f fVar2 = this.e;
        cVar.h(k, fVar2.d, fVar2.a, fVar2.c, this.b, aVar);
    }

    @Override // com.amazon.aps.iva.j8.h
    public final void f(h hVar, a.C0405a c0405a) {
        j<T> jVar = hVar.f;
        j<T> jVar2 = this.f;
        int i = jVar2.i - jVar.i;
        int i2 = jVar2.h - jVar.h;
        int i3 = jVar.d;
        int i4 = jVar.b;
        if (!jVar.isEmpty() && i >= 0 && i2 >= 0 && jVar2.d == Math.max(i3 - i, 0) && jVar2.b == Math.max(i4 - i2, 0) && jVar2.f == jVar.f + i + i2) {
            if (i != 0) {
                int min = Math.min(i3, i);
                int i5 = i - min;
                int i6 = jVar.b + jVar.f;
                if (min != 0) {
                    c0405a.a(i6, min);
                }
                if (i5 != 0) {
                    c0405a.b(i6 + min, i5);
                }
            }
            if (i2 != 0) {
                int min2 = Math.min(i4, i2);
                int i7 = i2 - min2;
                if (min2 != 0) {
                    c0405a.a(i4, min2);
                }
                if (i7 != 0) {
                    c0405a.b(0, i7);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
    }

    @Override // com.amazon.aps.iva.j8.h
    public final e<?, V> g() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.j8.h
    public final Object j() {
        return this.p.i(this.g);
    }

    @Override // com.amazon.aps.iva.j8.h
    public final boolean k() {
        return true;
    }

    @Override // com.amazon.aps.iva.j8.h
    public final void o(int i) {
        int i2 = this.e.b;
        j<T> jVar = this.f;
        int i3 = jVar.b;
        int i4 = i2 - (i - i3);
        int i5 = (i + i2) - (i3 + jVar.f);
        int max = Math.max(i4, this.s);
        this.s = max;
        if (max > 0) {
            z();
        }
        int max2 = Math.max(i5, this.t);
        this.t = max2;
        if (max2 > 0) {
            y();
        }
    }

    public final void w(int i, int i2, int i3) {
        int i4 = (this.t - i2) - i3;
        this.t = i4;
        this.r = false;
        if (i4 > 0) {
            y();
        }
        p(i, i2);
        q(i + i2, i3);
    }

    public final void x(int i, int i2, int i3) {
        int i4 = (this.s - i2) - i3;
        this.s = i4;
        this.q = false;
        if (i4 > 0) {
            z();
        }
        p(i, i2);
        q(0, i3);
        this.g += i3;
        this.k += i3;
        this.l += i3;
    }

    public final void y() {
        if (this.r) {
            return;
        }
        this.r = true;
        j<T> jVar = this.f;
        int i = ((jVar.b + jVar.f) - 1) + jVar.e;
        ArrayList<List<T>> arrayList = jVar.c;
        List list = (List) arrayList.get(arrayList.size() - 1);
        this.c.execute(new c(i, list.get(list.size() - 1)));
    }

    public final void z() {
        if (this.q) {
            return;
        }
        this.q = true;
        j<T> jVar = this.f;
        this.c.execute(new b(jVar.b + jVar.e, ((List) jVar.c.get(0)).get(0)));
    }
}
