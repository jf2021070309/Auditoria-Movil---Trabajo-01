package androidx.lifecycle;

import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.s.b;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object k = new Object();
    public final Object a;
    public final com.amazon.aps.iva.s.b<w<? super T>, LiveData<T>.c> b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final a j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements j {
        public final com.amazon.aps.iva.i5.o f;

        public LifecycleBoundObserver(com.amazon.aps.iva.i5.o oVar, w<? super T> wVar) {
            super(wVar);
            this.f = oVar;
        }

        @Override // androidx.lifecycle.j
        public final void U2(com.amazon.aps.iva.i5.o oVar, g.a aVar) {
            com.amazon.aps.iva.i5.o oVar2 = this.f;
            g.b currentState = oVar2.getLifecycle().getCurrentState();
            if (currentState == g.b.DESTROYED) {
                LiveData.this.j(this.b);
                return;
            }
            g.b bVar = null;
            while (bVar != currentState) {
                a(d());
                bVar = currentState;
                currentState = oVar2.getLifecycle().getCurrentState();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public final void b() {
            this.f.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean c(com.amazon.aps.iva.i5.o oVar) {
            if (this.f == oVar) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean d() {
            return this.f.getLifecycle().getCurrentState().isAtLeast(g.b.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.f;
                LiveData.this.f = LiveData.k;
            }
            LiveData.this.k(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        @Override // androidx.lifecycle.LiveData.c
        public final boolean d() {
            return true;
        }
    }

    public LiveData(T t) {
        this.a = new Object();
        this.b = new com.amazon.aps.iva.s.b<>();
        this.c = 0;
        this.f = k;
        this.j = new a();
        this.e = t;
        this.g = 0;
    }

    public static void a(String str) {
        if (com.amazon.aps.iva.r.c.s().t()) {
            return;
        }
        throw new IllegalStateException(defpackage.e.e("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(LiveData<T>.c cVar) {
        if (!cVar.c) {
            return;
        }
        if (!cVar.d()) {
            cVar.a(false);
            return;
        }
        int i = cVar.d;
        int i2 = this.g;
        if (i >= i2) {
            return;
        }
        cVar.d = i2;
        cVar.b.onChanged((Object) this.e);
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (cVar != null) {
                b(cVar);
                cVar = null;
            } else {
                com.amazon.aps.iva.s.b<w<? super T>, LiveData<T>.c> bVar = this.b;
                bVar.getClass();
                b.d dVar = new b.d();
                bVar.d.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public T d() {
        T t = (T) this.e;
        if (t != k) {
            return t;
        }
        return null;
    }

    public final void e(com.amazon.aps.iva.i5.o oVar, w<? super T> wVar) {
        a("observe");
        if (oVar.getLifecycle().getCurrentState() == g.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(oVar, wVar);
        LiveData<T>.c d = this.b.d(wVar, lifecycleBoundObserver);
        if (d != null && !d.c(oVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (d != null) {
            return;
        }
        oVar.getLifecycle().addObserver(lifecycleBoundObserver);
    }

    public final void f(w<? super T> wVar) {
        a("observeForever");
        b bVar = new b(wVar);
        LiveData<T>.c d = this.b.d(wVar, bVar);
        if (!(d instanceof LifecycleBoundObserver)) {
            if (d != null) {
                return;
            }
            bVar.a(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void i(T t) {
        boolean z;
        synchronized (this.a) {
            if (this.f == k) {
                z = true;
            } else {
                z = false;
            }
            this.f = t;
        }
        if (!z) {
            return;
        }
        com.amazon.aps.iva.r.c.s().u(this.j);
    }

    public void j(w<? super T> wVar) {
        a("removeObserver");
        LiveData<T>.c e = this.b.e(wVar);
        if (e == null) {
            return;
        }
        e.b();
        e.a(false);
    }

    public void k(T t) {
        a("setValue");
        this.g++;
        this.e = t;
        c(null);
    }

    public LiveData() {
        this.a = new Object();
        this.b = new com.amazon.aps.iva.s.b<>();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }

    /* loaded from: classes.dex */
    public abstract class c {
        public final w<? super T> b;
        public boolean c;
        public int d = -1;

        public c(w<? super T> wVar) {
            this.b = wVar;
        }

        public final void a(boolean z) {
            int i;
            boolean z2;
            boolean z3;
            if (z == this.c) {
                return;
            }
            this.c = z;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            LiveData liveData = LiveData.this;
            int i2 = liveData.c;
            liveData.c = i + i2;
            if (!liveData.d) {
                liveData.d = true;
                while (true) {
                    try {
                        int i3 = liveData.c;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0 && i3 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i2 > 0 && i3 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            liveData.g();
                        } else if (z3) {
                            liveData.h();
                        }
                        i2 = i3;
                    } finally {
                        liveData.d = false;
                    }
                }
            }
            if (this.c) {
                liveData.c(this);
            }
        }

        public boolean c(com.amazon.aps.iva.i5.o oVar) {
            return false;
        }

        public abstract boolean d();

        public void b() {
        }
    }

    public void g() {
    }

    public void h() {
    }
}
