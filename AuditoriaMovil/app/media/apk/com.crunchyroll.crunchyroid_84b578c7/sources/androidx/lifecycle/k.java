package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.g;
import com.amazon.aps.iva.s.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: LifecycleRegistry.kt */
/* loaded from: classes.dex */
public final class k extends g {
    public final boolean a;
    public com.amazon.aps.iva.s.a<com.amazon.aps.iva.i5.n, a> b;
    public g.b c;
    public final WeakReference<com.amazon.aps.iva.i5.o> d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList<g.b> h;

    /* compiled from: LifecycleRegistry.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public g.b a;
        public final j b;

        public a(com.amazon.aps.iva.i5.n nVar, g.b bVar) {
            j reflectiveGenericLifecycleObserver;
            com.amazon.aps.iva.yb0.j.f(bVar, "initialState");
            com.amazon.aps.iva.yb0.j.c(nVar);
            HashMap hashMap = com.amazon.aps.iva.i5.r.a;
            boolean z = nVar instanceof j;
            boolean z2 = nVar instanceof com.amazon.aps.iva.i5.g;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((com.amazon.aps.iva.i5.g) nVar, (j) nVar);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((com.amazon.aps.iva.i5.g) nVar, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (j) nVar;
            } else {
                Class<?> cls = nVar.getClass();
                if (com.amazon.aps.iva.i5.r.b(cls) == 2) {
                    Object obj = com.amazon.aps.iva.i5.r.b.get(cls);
                    com.amazon.aps.iva.yb0.j.c(obj);
                    List list = (List) obj;
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(com.amazon.aps.iva.i5.r.a((Constructor) list.get(0), nVar));
                    } else {
                        int size = list.size();
                        d[] dVarArr = new d[size];
                        for (int i = 0; i < size; i++) {
                            dVarArr[i] = com.amazon.aps.iva.i5.r.a((Constructor) list.get(i), nVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(dVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(nVar);
                }
            }
            this.b = reflectiveGenericLifecycleObserver;
            this.a = bVar;
        }

        public final void a(com.amazon.aps.iva.i5.o oVar, g.a aVar) {
            g.b targetState = aVar.getTargetState();
            g.b bVar = this.a;
            com.amazon.aps.iva.yb0.j.f(bVar, "state1");
            if (targetState != null && targetState.compareTo(bVar) < 0) {
                bVar = targetState;
            }
            this.a = bVar;
            this.b.U2(oVar, aVar);
            this.a = targetState;
        }
    }

    public k(com.amazon.aps.iva.i5.o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "provider");
        this.a = true;
        this.b = new com.amazon.aps.iva.s.a<>();
        this.c = g.b.INITIALIZED;
        this.h = new ArrayList<>();
        this.d = new WeakReference<>(oVar);
    }

    public final g.b a(com.amazon.aps.iva.i5.n nVar) {
        b.c<com.amazon.aps.iva.i5.n, a> cVar;
        g.b bVar;
        a aVar;
        com.amazon.aps.iva.s.a<com.amazon.aps.iva.i5.n, a> aVar2 = this.b;
        g.b bVar2 = null;
        if (aVar2.f.containsKey(nVar)) {
            cVar = aVar2.f.get(nVar).e;
        } else {
            cVar = null;
        }
        if (cVar != null && (aVar = cVar.c) != null) {
            bVar = aVar.a;
        } else {
            bVar = null;
        }
        ArrayList<g.b> arrayList = this.h;
        if (!arrayList.isEmpty()) {
            bVar2 = arrayList.get(arrayList.size() - 1);
        }
        g.b bVar3 = this.c;
        com.amazon.aps.iva.yb0.j.f(bVar3, "state1");
        if (bVar == null || bVar.compareTo(bVar3) >= 0) {
            bVar = bVar3;
        }
        if (bVar2 == null || bVar2.compareTo(bVar) >= 0) {
            return bVar;
        }
        return bVar2;
    }

    @Override // androidx.lifecycle.g
    public final void addObserver(com.amazon.aps.iva.i5.n nVar) {
        com.amazon.aps.iva.i5.o oVar;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(nVar, "observer");
        b("addObserver");
        g.b bVar = this.c;
        g.b bVar2 = g.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = g.b.INITIALIZED;
        }
        a aVar = new a(nVar, bVar2);
        if (this.b.d(nVar, aVar) != null || (oVar = this.d.get()) == null) {
            return;
        }
        if (this.e == 0 && !this.f) {
            z = false;
        } else {
            z = true;
        }
        g.b a2 = a(nVar);
        this.e++;
        while (aVar.a.compareTo(a2) < 0 && this.b.f.containsKey(nVar)) {
            g.b bVar3 = aVar.a;
            ArrayList<g.b> arrayList = this.h;
            arrayList.add(bVar3);
            g.a.C0034a c0034a = g.a.Companion;
            g.b bVar4 = aVar.a;
            c0034a.getClass();
            g.a b = g.a.C0034a.b(bVar4);
            if (b != null) {
                aVar.a(oVar, b);
                arrayList.remove(arrayList.size() - 1);
                a2 = a(nVar);
            } else {
                throw new IllegalStateException("no event up from " + aVar.a);
            }
        }
        if (!z) {
            f();
        }
        this.e--;
    }

    @SuppressLint({"RestrictedApi"})
    public final void b(String str) {
        if (this.a && !com.amazon.aps.iva.r.c.s().t()) {
            throw new IllegalStateException(defpackage.e.e("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void c(g.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "event");
        b("handleLifecycleEvent");
        d(aVar.getTargetState());
    }

    public final void d(g.b bVar) {
        boolean z;
        g.b bVar2 = this.c;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == g.b.INITIALIZED && bVar == g.b.DESTROYED) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.c = bVar;
            if (!this.f && this.e == 0) {
                this.f = true;
                f();
                this.f = false;
                if (this.c == g.b.DESTROYED) {
                    this.b = new com.amazon.aps.iva.s.a<>();
                    return;
                }
                return;
            }
            this.g = true;
            return;
        }
        throw new IllegalStateException(("no event down from " + this.c + " in component " + this.d.get()).toString());
    }

    public final void e(g.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "state");
        b("setCurrentState");
        d(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.k.f():void");
    }

    @Override // androidx.lifecycle.g
    public final g.b getCurrentState() {
        return this.c;
    }

    @Override // androidx.lifecycle.g
    public final void removeObserver(com.amazon.aps.iva.i5.n nVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "observer");
        b("removeObserver");
        this.b.e(nVar);
    }
}
