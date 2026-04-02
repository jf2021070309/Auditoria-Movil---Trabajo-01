package androidx.lifecycle;

import c.p.j;
import c.p.n;
import c.p.p;
import c.p.r;
import c.p.x;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Object f447b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public c.c.a.b.b<x<? super T>, LiveData<T>.c> f448c = new c.c.a.b.b<>();

    /* renamed from: d  reason: collision with root package name */
    public int f449d = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f450e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f451f;

    /* renamed from: g  reason: collision with root package name */
    public volatile Object f452g;

    /* renamed from: h  reason: collision with root package name */
    public int f453h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f454i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f455j;

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f456k;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements n {

        /* renamed from: e  reason: collision with root package name */
        public final p f457e;

        public LifecycleBoundObserver(p pVar, x<? super T> xVar) {
            super(xVar);
            this.f457e = pVar;
        }

        @Override // c.p.n
        public void c(p pVar, j.a aVar) {
            j.b bVar = ((r) this.f457e.getLifecycle()).f2467c;
            if (bVar == j.b.DESTROYED) {
                LiveData.this.g(this.a);
                return;
            }
            j.b bVar2 = null;
            while (bVar2 != bVar) {
                g(((r) this.f457e.getLifecycle()).f2467c.isAtLeast(j.b.STARTED));
                bVar2 = bVar;
                bVar = ((r) this.f457e.getLifecycle()).f2467c;
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public void i() {
            r rVar = (r) this.f457e.getLifecycle();
            rVar.d("removeObserver");
            rVar.f2466b.e(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean j(p pVar) {
            return this.f457e == pVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return ((r) this.f457e.getLifecycle()).f2467c.isAtLeast(j.b.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f447b) {
                obj = LiveData.this.f452g;
                LiveData.this.f452g = LiveData.a;
            }
            LiveData.this.h(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(LiveData liveData, x<? super T> xVar) {
            super(xVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {
        public final x<? super T> a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f459b;

        /* renamed from: c  reason: collision with root package name */
        public int f460c = -1;

        public c(x<? super T> xVar) {
            this.a = xVar;
        }

        public void g(boolean z) {
            if (z == this.f459b) {
                return;
            }
            this.f459b = z;
            LiveData liveData = LiveData.this;
            int i2 = z ? 1 : -1;
            int i3 = liveData.f449d;
            liveData.f449d = i2 + i3;
            if (!liveData.f450e) {
                liveData.f450e = true;
                while (true) {
                    try {
                        int i4 = liveData.f449d;
                        if (i3 == i4) {
                            break;
                        }
                        boolean z2 = i3 == 0 && i4 > 0;
                        boolean z3 = i3 > 0 && i4 == 0;
                        if (z2) {
                            liveData.e();
                        } else if (z3) {
                            liveData.f();
                        }
                        i3 = i4;
                    } finally {
                        liveData.f450e = false;
                    }
                }
            }
            if (this.f459b) {
                LiveData.this.c(this);
            }
        }

        public void i() {
        }

        public boolean j(p pVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData() {
        Object obj = a;
        this.f452g = obj;
        this.f456k = new a();
        this.f451f = obj;
        this.f453h = -1;
    }

    public static void a(String str) {
        if (!c.c.a.a.a.d().b()) {
            throw new IllegalStateException(e.a.d.a.a.l("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.f459b) {
            if (!cVar.k()) {
                cVar.g(false);
                return;
            }
            int i2 = cVar.f460c;
            int i3 = this.f453h;
            if (i2 >= i3) {
                return;
            }
            cVar.f460c = i3;
            cVar.a.a((Object) this.f451f);
        }
    }

    public void c(LiveData<T>.c cVar) {
        if (this.f454i) {
            this.f455j = true;
            return;
        }
        this.f454i = true;
        do {
            this.f455j = false;
            if (cVar == null) {
                c.c.a.b.b<x<? super T>, LiveData<T>.c>.d b2 = this.f448c.b();
                while (b2.hasNext()) {
                    b((c) ((Map.Entry) b2.next()).getValue());
                    if (this.f455j) {
                        break;
                    }
                }
            } else {
                b(cVar);
                cVar = null;
            }
        } while (this.f455j);
        this.f454i = false;
    }

    public void d(p pVar, x<? super T> xVar) {
        a("observe");
        if (((r) pVar.getLifecycle()).f2467c == j.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(pVar, xVar);
        LiveData<T>.c d2 = this.f448c.d(xVar, lifecycleBoundObserver);
        if (d2 != null && !d2.j(pVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (d2 != null) {
            return;
        }
        pVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void e() {
    }

    public void f() {
    }

    public void g(x<? super T> xVar) {
        a("removeObserver");
        LiveData<T>.c e2 = this.f448c.e(xVar);
        if (e2 == null) {
            return;
        }
        e2.i();
        e2.g(false);
    }

    public abstract void h(T t);
}
