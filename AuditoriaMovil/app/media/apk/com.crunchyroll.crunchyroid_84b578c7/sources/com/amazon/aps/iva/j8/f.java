package com.amazon.aps.iva.j8;

import com.amazon.aps.iva.j8.d;
import com.amazon.aps.iva.j8.e;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PageKeyedDataSource.java */
/* loaded from: classes.dex */
public abstract class f<Key, Value> extends com.amazon.aps.iva.j8.c<Key, Value> {
    public final Object c = new Object();
    public Key d = null;
    public Key e = null;

    /* compiled from: PageKeyedDataSource.java */
    /* loaded from: classes.dex */
    public static abstract class a<Key, Value> {
        public abstract void a(Object obj, List list);
    }

    /* compiled from: PageKeyedDataSource.java */
    /* loaded from: classes.dex */
    public static class b<Key, Value> extends a<Key, Value> {
        public final e.a<Value> a;
        public final f<Key, Value> b;

        public b(f fVar, int i, Executor executor, d.a aVar) {
            this.a = new e.a<>(fVar, i, executor, aVar);
            this.b = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.j8.f.a
        public final void a(Object obj, List list) {
            if (!this.a.a()) {
                if (this.a.a == 1) {
                    f<Key, Value> fVar = this.b;
                    synchronized (fVar.c) {
                        fVar.d = obj;
                    }
                } else {
                    f<Key, Value> fVar2 = this.b;
                    synchronized (fVar2.c) {
                        fVar2.e = obj;
                    }
                }
                this.a.b(new g<>(0, 0, 0, list));
            }
        }
    }

    /* compiled from: PageKeyedDataSource.java */
    /* loaded from: classes.dex */
    public static abstract class c<Key, Value> {
        public abstract void a(List list, int i, Integer num);

        public abstract void b(List list, Integer num, Object obj);
    }

    /* compiled from: PageKeyedDataSource.java */
    /* loaded from: classes.dex */
    public static class d<Key, Value> extends c<Key, Value> {
        public final e.a<Value> a;
        public final f<Key, Value> b;
        public final boolean c;

        public d(f fVar, boolean z, d.a aVar) {
            this.a = new e.a<>(fVar, 0, null, aVar);
            this.b = fVar;
            this.c = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.j8.f.c
        public final void a(List list, int i, Integer num) {
            e.a<Value> aVar = this.a;
            if (!aVar.a()) {
                e.a.c(0, i, list);
                f<Key, Value> fVar = this.b;
                synchronized (fVar.c) {
                    fVar.e = null;
                    fVar.d = num;
                }
                int size = (i - 0) - list.size();
                if (this.c) {
                    aVar.b(new g<>(0, size, 0, list));
                } else {
                    aVar.b(new g<>(list, 0));
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.j8.f.c
        public final void b(List list, Integer num, Object obj) {
            e.a<Value> aVar = this.a;
            if (!aVar.a()) {
                f<Key, Value> fVar = this.b;
                synchronized (fVar.c) {
                    fVar.e = num;
                    fVar.d = obj;
                }
                aVar.b(new g<>(0, 0, 0, list));
            }
        }
    }

    /* compiled from: PageKeyedDataSource.java */
    /* loaded from: classes.dex */
    public static class e<Key> {
        public final int a;

        public e(int i) {
            this.a = i;
        }
    }

    /* compiled from: PageKeyedDataSource.java */
    /* renamed from: com.amazon.aps.iva.j8.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0407f<Key> {
        public final Key a;
        public final int b;

        public C0407f(Key key, int i) {
            this.a = key;
            this.b = i;
        }
    }

    @Override // com.amazon.aps.iva.j8.c
    public final void f(int i, int i2, Executor executor, d.a aVar) {
        Key key;
        synchronized (this.c) {
            key = this.d;
        }
        if (key != null) {
            j(new C0407f<>(key, i2), new b(this, 1, executor, aVar));
        } else {
            aVar.a(1, g.e);
        }
    }

    @Override // com.amazon.aps.iva.j8.c
    public final void g(int i, int i2, Executor executor, d.a aVar) {
        Key key;
        synchronized (this.c) {
            key = this.e;
        }
        if (key != null) {
            k(new C0407f(key, i2), new b(this, 2, executor, aVar));
        } else {
            aVar.a(2, g.e);
        }
    }

    @Override // com.amazon.aps.iva.j8.c
    public final void h(Object obj, int i, int i2, boolean z, Executor executor, d.a aVar) {
        d dVar = new d(this, z, aVar);
        m(new e(i), dVar);
        e.a<Value> aVar2 = dVar.a;
        synchronized (aVar2.d) {
            aVar2.e = executor;
        }
    }

    @Override // com.amazon.aps.iva.j8.c
    public final Object i(int i) {
        return null;
    }

    public abstract void j(C0407f<Key> c0407f, a<Key, Value> aVar);

    public abstract void k(C0407f c0407f, b bVar);

    public abstract void m(e eVar, d dVar);
}
