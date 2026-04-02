package com.amazon.aps.iva.id;

import android.util.Log;
import com.amazon.aps.iva.id.d;
import com.amazon.aps.iva.o3.f;
/* compiled from: FactoryPools.java */
/* loaded from: classes.dex */
public final class a {
    public static final C0365a a = new C0365a();

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        T a();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public static final class c<T> implements com.amazon.aps.iva.o3.d<T> {
        public final b<T> a;
        public final e<T> b;
        public final com.amazon.aps.iva.o3.d<T> c;

        public c(f fVar, b bVar, e eVar) {
            this.c = fVar;
            this.a = bVar;
            this.b = eVar;
        }

        @Override // com.amazon.aps.iva.o3.d
        public final boolean a(T t) {
            if (t instanceof d) {
                ((d) t).c().a = true;
            }
            this.b.a(t);
            return this.c.a(t);
        }

        @Override // com.amazon.aps.iva.o3.d
        public final T b() {
            T b = this.c.b();
            if (b == null) {
                b = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    b.getClass().toString();
                }
            }
            if (b instanceof d) {
                ((d) b).c().a = false;
            }
            return b;
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface d {
        d.a c();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t);
    }

    public static c a(int i, b bVar) {
        return new c(new f(i), bVar, a);
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: com.amazon.aps.iva.id.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0365a implements e<Object> {
        @Override // com.amazon.aps.iva.id.a.e
        public final void a(Object obj) {
        }
    }
}
