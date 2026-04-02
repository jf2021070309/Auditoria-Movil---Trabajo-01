package com.amazon.aps.iva.j8;

import com.amazon.aps.iva.j8.a;
import com.amazon.aps.iva.j8.e;
import com.amazon.aps.iva.j8.g;
import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.j8.m;
import com.amazon.aps.iva.q.c0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: TiledPagedList.java */
/* loaded from: classes.dex */
public final class o<T> extends h<T> {
    public final m<T> p;
    public final a q;

    /* compiled from: TiledPagedList.java */
    /* loaded from: classes.dex */
    public class a extends g.a<T> {
        public a() {
        }

        @Override // com.amazon.aps.iva.j8.g.a
        public final void a(int i, g<T> gVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            gVar.getClass();
            if (gVar == g.f) {
                z = true;
            } else {
                z = false;
            }
            o oVar = o.this;
            if (z) {
                oVar.e();
            } else if (oVar.l()) {
            } else {
                if (i != 0 && i != 3) {
                    throw new IllegalArgumentException(c0.a("unexpected resultType", i));
                }
                j<T> jVar = oVar.f;
                int size = jVar.c.size();
                h.f fVar = oVar.e;
                int i2 = gVar.c;
                int i3 = gVar.b;
                List<T> list = gVar.a;
                int i4 = gVar.d;
                if (size == 0) {
                    int i5 = fVar.a;
                    jVar.getClass();
                    int size2 = ((i5 - 1) + list.size()) / i5;
                    int i6 = 0;
                    while (i6 < size2) {
                        int i7 = i6 * i5;
                        int i8 = i6 + 1;
                        List<T> subList = list.subList(i7, Math.min(list.size(), i8 * i5));
                        if (i6 == 0) {
                            jVar.g(i3, (list.size() + i2) - subList.size(), i4, subList);
                        } else {
                            jVar.j(i7 + i3, subList, null);
                        }
                        i6 = i8;
                    }
                    z2 = false;
                    oVar.q(0, jVar.size());
                } else {
                    z2 = false;
                    jVar.j(i4, list, oVar);
                }
                if (oVar.d != null) {
                    if (jVar.size() == 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (!z3 && i3 == 0 && i4 == 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    int size3 = oVar.size();
                    if (!z3 && ((i == 0 && i2 == 0) || (i == 3 && i4 + fVar.a >= size3))) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    oVar.d(z3, z4, z5);
                }
            }
        }
    }

    /* compiled from: TiledPagedList.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o oVar = o.this;
            if (oVar.l()) {
                return;
            }
            int i = oVar.e.a;
            if (oVar.p.e()) {
                oVar.e();
                return;
            }
            int i2 = this.b * i;
            oVar.p.f(3, i2, Math.min(i, oVar.f.size() - i2), oVar.b, oVar.q);
        }
    }

    public o(m<T> mVar, Executor executor, Executor executor2, h.c<T> cVar, h.f fVar, int i) {
        super(new j(), executor, executor2, cVar, fVar);
        a aVar = new a();
        this.q = aVar;
        this.p = mVar;
        int i2 = this.e.a;
        this.g = i;
        if (mVar.e()) {
            e();
            return;
        }
        int max = Math.max(0, Math.round((i - ((Math.max(Math.round(this.e.d / i2), 2) * i2) / 2)) / i2) * i2);
        Executor executor3 = this.b;
        m.c cVar2 = new m.c(mVar, true, i2, aVar);
        mVar.g(new m.d(max, i2), cVar2);
        e.a<T> aVar2 = cVar2.a;
        synchronized (aVar2.d) {
            aVar2.e = executor3;
        }
    }

    @Override // com.amazon.aps.iva.j8.h
    public final void f(h hVar, a.C0405a c0405a) {
        j<T> jVar = hVar.f;
        if (!jVar.isEmpty()) {
            j<T> jVar2 = this.f;
            if (jVar2.size() == jVar.size()) {
                int i = this.e.a;
                int i2 = jVar2.b / i;
                ArrayList<List<T>> arrayList = jVar2.c;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + i2;
                    int i5 = 0;
                    while (i5 < arrayList.size()) {
                        int i6 = i4 + i5;
                        if (!jVar2.f(i, i6) || jVar.f(i, i6)) {
                            break;
                        }
                        i5++;
                    }
                    if (i5 > 0) {
                        c0405a.a(i4 * i, i * i5);
                        i3 += i5 - 1;
                    }
                    i3++;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
    }

    @Override // com.amazon.aps.iva.j8.h
    public final e<?, T> g() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.j8.h
    public final Object j() {
        return Integer.valueOf(this.g);
    }

    @Override // com.amazon.aps.iva.j8.h
    public final boolean k() {
        return false;
    }

    @Override // com.amazon.aps.iva.j8.h
    public final void o(int i) {
        h.f fVar = this.e;
        int i2 = fVar.b;
        j<T> jVar = this.f;
        int i3 = jVar.g;
        ArrayList<List<T>> arrayList = jVar.c;
        int i4 = fVar.a;
        if (i4 != i3) {
            if (i4 >= i3) {
                if (arrayList.size() == 1 && jVar.d == 0) {
                    jVar.g = i4;
                } else {
                    throw new IllegalArgumentException("Page size can change only if last page is only one present");
                }
            } else {
                throw new IllegalArgumentException("Page size cannot be reduced");
            }
        }
        int size = jVar.size();
        int i5 = jVar.g;
        int i6 = ((size + i5) - 1) / i5;
        int max = Math.max((i - i2) / i5, 0);
        int min = Math.min((i + i2) / jVar.g, i6 - 1);
        jVar.b(max, min);
        int i7 = jVar.b / jVar.g;
        while (max <= min) {
            int i8 = max - i7;
            if (arrayList.get(i8) == null) {
                arrayList.set(i8, j.j);
                w(max);
            }
            max++;
        }
    }

    public final void w(int i) {
        this.c.execute(new b(i));
    }
}
