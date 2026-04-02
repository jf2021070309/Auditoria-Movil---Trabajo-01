package e.c.a.s.k;

import android.util.Log;
import e.c.a.s.k.d;
/* loaded from: classes.dex */
public final class a {
    public static final e<Object> a = new C0133a();

    /* renamed from: e.c.a.s.k.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0133a implements e<Object> {
        @Override // e.c.a.s.k.a.e
        public void a(Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        T a();
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements c.i.j.c<T> {
        public final b<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f6032b;

        /* renamed from: c  reason: collision with root package name */
        public final c.i.j.c<T> f6033c;

        public c(c.i.j.c<T> cVar, b<T> bVar, e<T> eVar) {
            this.f6033c = cVar;
            this.a = bVar;
            this.f6032b = eVar;
        }

        @Override // c.i.j.c
        public boolean a(T t) {
            if (t instanceof d) {
                ((d.b) ((d) t).b()).a = true;
            }
            this.f6032b.a(t);
            return this.f6033c.a(t);
        }

        @Override // c.i.j.c
        public T b() {
            T b2 = this.f6033c.b();
            if (b2 == null) {
                b2 = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder y = e.a.d.a.a.y("Created new ");
                    y.append(b2.getClass());
                    y.toString();
                }
            }
            if (b2 instanceof d) {
                ((d.b) ((d) b2).b()).a = false;
            }
            return b2;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        e.c.a.s.k.d b();
    }

    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t);
    }

    public static <T extends d> c.i.j.c<T> a(int i2, b<T> bVar) {
        return new c(new c.i.j.e(i2), bVar, a);
    }
}
