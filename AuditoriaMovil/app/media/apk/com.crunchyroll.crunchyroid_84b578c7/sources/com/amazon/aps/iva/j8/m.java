package com.amazon.aps.iva.j8;

import com.amazon.aps.iva.j8.d;
import com.amazon.aps.iva.j8.e;
import com.amazon.aps.iva.j8.g;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PositionalDataSource.java */
/* loaded from: classes.dex */
public abstract class m<T> extends com.amazon.aps.iva.j8.e<Integer, T> {

    /* compiled from: PositionalDataSource.java */
    /* loaded from: classes.dex */
    public static class a<Value> extends com.amazon.aps.iva.j8.c<Integer, Value> {
        public final m<Value> c;

        public a(m<Value> mVar) {
            this.c = mVar;
        }

        @Override // com.amazon.aps.iva.j8.e
        public final boolean e() {
            return this.c.e();
        }

        @Override // com.amazon.aps.iva.j8.c
        public final void f(int i, int i2, Executor executor, d.a aVar) {
            this.c.f(1, i + 1, i2, executor, aVar);
        }

        @Override // com.amazon.aps.iva.j8.c
        public final void g(int i, int i2, Executor executor, d.a aVar) {
            int i3 = i - 1;
            if (i3 < 0) {
                this.c.f(2, i3, 0, executor, aVar);
                return;
            }
            int min = Math.min(i2, i3 + 1);
            this.c.f(2, (i3 - min) + 1, min, executor, aVar);
        }

        @Override // com.amazon.aps.iva.j8.c
        public final void h(Object obj, int i, int i2, boolean z, Executor executor, d.a aVar) {
            int intValue;
            Integer num = (Integer) obj;
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            m<Value> mVar = this.c;
            mVar.getClass();
            c cVar = new c(mVar, false, i2, aVar);
            mVar.g(new d(intValue, i2), cVar);
            e.a<T> aVar2 = cVar.a;
            synchronized (aVar2.d) {
                aVar2.e = executor;
            }
        }

        @Override // com.amazon.aps.iva.j8.c
        public final Object i(int i) {
            return Integer.valueOf(i);
        }
    }

    /* compiled from: PositionalDataSource.java */
    /* loaded from: classes.dex */
    public static abstract class b<T> {
        public abstract void a(int i, int i2, List list);
    }

    /* compiled from: PositionalDataSource.java */
    /* loaded from: classes.dex */
    public static class c<T> extends b<T> {
        public final e.a<T> a;
        public final boolean b;
        public final int c;

        public c(m mVar, boolean z, int i, g.a<T> aVar) {
            this.a = new e.a<>(mVar, 0, null, aVar);
            this.b = z;
            this.c = i;
            if (i >= 1) {
                return;
            }
            throw new IllegalArgumentException("Page size must be non-negative");
        }

        @Override // com.amazon.aps.iva.j8.m.b
        public final void a(int i, int i2, List list) {
            e.a<T> aVar = this.a;
            if (!aVar.a()) {
                e.a.c(i, i2, list);
                if (list.size() + i != i2) {
                    int size = list.size();
                    int i3 = this.c;
                    if (size % i3 != 0) {
                        throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + list.size() + ", position " + i + ", totalCount " + i2 + ", pageSize " + i3);
                    }
                }
                if (this.b) {
                    aVar.b(new com.amazon.aps.iva.j8.g<>(i, (i2 - i) - list.size(), 0, list));
                } else {
                    aVar.b(new com.amazon.aps.iva.j8.g<>(list, i));
                }
            }
        }
    }

    /* compiled from: PositionalDataSource.java */
    /* loaded from: classes.dex */
    public static class d {
        public final int a;
        public final int b;

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: PositionalDataSource.java */
    /* loaded from: classes.dex */
    public static abstract class e<T> {
        public abstract void a(List<T> list);
    }

    /* compiled from: PositionalDataSource.java */
    /* loaded from: classes.dex */
    public static class f<T> extends e<T> {
        public final e.a<T> a;
        public final int b;

        public f(m mVar, int i, int i2, Executor executor, g.a<T> aVar) {
            this.a = new e.a<>(mVar, i, executor, aVar);
            this.b = i2;
        }

        @Override // com.amazon.aps.iva.j8.m.e
        public final void a(List<T> list) {
            e.a<T> aVar = this.a;
            if (!aVar.a()) {
                aVar.b(new com.amazon.aps.iva.j8.g<>(0, 0, this.b, list));
            }
        }
    }

    /* compiled from: PositionalDataSource.java */
    /* loaded from: classes.dex */
    public static class g {
        public final int a;
        public final int b;

        public g(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    @Override // com.amazon.aps.iva.j8.e
    public final boolean d() {
        return false;
    }

    public final void f(int i, int i2, int i3, Executor executor, g.a<T> aVar) {
        f fVar = new f(this, i, i2, executor, aVar);
        if (i3 == 0) {
            fVar.a(Collections.emptyList());
        } else {
            h(new g(i2, i3), fVar);
        }
    }

    public abstract void g(d dVar, c cVar);

    public abstract void h(g gVar, f fVar);
}
