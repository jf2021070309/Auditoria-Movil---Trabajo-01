package c.p;

import android.annotation.SuppressLint;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import c.c.a.b.b;
import c.p.j;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class r extends j {

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference<p> f2468d;

    /* renamed from: b  reason: collision with root package name */
    public c.c.a.b.a<o, a> f2466b = new c.c.a.b.a<>();

    /* renamed from: e  reason: collision with root package name */
    public int f2469e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2470f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2471g = false;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<j.b> f2472h = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public j.b f2467c = j.b.INITIALIZED;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2473i = true;

    /* loaded from: classes.dex */
    public static class a {
        public j.b a;

        /* renamed from: b  reason: collision with root package name */
        public n f2474b;

        public a(o oVar, j.b bVar) {
            n reflectiveGenericLifecycleObserver;
            Map<Class<?>, Integer> map = u.a;
            boolean z = oVar instanceof n;
            boolean z2 = oVar instanceof h;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((h) oVar, (n) oVar);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((h) oVar, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (n) oVar;
            } else {
                Class<?> cls = oVar.getClass();
                if (u.c(cls) == 2) {
                    List<Constructor<? extends i>> list = u.f2475b.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(u.a(list.get(0), oVar));
                    } else {
                        i[] iVarArr = new i[list.size()];
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            iVarArr[i2] = u.a(list.get(i2), oVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(iVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(oVar);
                }
            }
            this.f2474b = reflectiveGenericLifecycleObserver;
            this.a = bVar;
        }

        public void a(p pVar, j.a aVar) {
            j.b targetState = aVar.getTargetState();
            this.a = r.f(this.a, targetState);
            this.f2474b.c(pVar, aVar);
            this.a = targetState;
        }
    }

    public r(p pVar) {
        this.f2468d = new WeakReference<>(pVar);
    }

    public static j.b f(j.b bVar, j.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    @Override // c.p.j
    public void a(o oVar) {
        p pVar;
        d("addObserver");
        j.b bVar = this.f2467c;
        j.b bVar2 = j.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = j.b.INITIALIZED;
        }
        a aVar = new a(oVar, bVar2);
        if (this.f2466b.d(oVar, aVar) == null && (pVar = this.f2468d.get()) != null) {
            boolean z = this.f2469e != 0 || this.f2470f;
            j.b c2 = c(oVar);
            this.f2469e++;
            while (aVar.a.compareTo(c2) < 0 && this.f2466b.f1302e.containsKey(oVar)) {
                this.f2472h.add(aVar.a);
                j.a upFrom = j.a.upFrom(aVar.a);
                if (upFrom == null) {
                    StringBuilder y = e.a.d.a.a.y("no event up from ");
                    y.append(aVar.a);
                    throw new IllegalStateException(y.toString());
                }
                aVar.a(pVar, upFrom);
                h();
                c2 = c(oVar);
            }
            if (!z) {
                j();
            }
            this.f2469e--;
        }
    }

    @Override // c.p.j
    public void b(o oVar) {
        d("removeObserver");
        this.f2466b.e(oVar);
    }

    public final j.b c(o oVar) {
        c.c.a.b.a<o, a> aVar = this.f2466b;
        j.b bVar = null;
        b.c<o, a> cVar = aVar.f1302e.containsKey(oVar) ? aVar.f1302e.get(oVar).f1308d : null;
        j.b bVar2 = cVar != null ? cVar.f1306b.a : null;
        if (!this.f2472h.isEmpty()) {
            ArrayList<j.b> arrayList = this.f2472h;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return f(f(this.f2467c, bVar2), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void d(String str) {
        if (this.f2473i && !c.c.a.a.a.d().b()) {
            throw new IllegalStateException(e.a.d.a.a.l("Method ", str, " must be called on the main thread"));
        }
    }

    public void e(j.a aVar) {
        d("handleLifecycleEvent");
        g(aVar.getTargetState());
    }

    public final void g(j.b bVar) {
        if (this.f2467c == bVar) {
            return;
        }
        this.f2467c = bVar;
        if (this.f2470f || this.f2469e != 0) {
            this.f2471g = true;
            return;
        }
        this.f2470f = true;
        j();
        this.f2470f = false;
    }

    public final void h() {
        ArrayList<j.b> arrayList = this.f2472h;
        arrayList.remove(arrayList.size() - 1);
    }

    public void i(j.b bVar) {
        d("setCurrentState");
        g(bVar);
    }

    public final void j() {
        p pVar = this.f2468d.get();
        if (pVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            c.c.a.b.a<o, a> aVar = this.f2466b;
            boolean z = true;
            if (aVar.f1305d != 0) {
                j.b bVar = aVar.a.f1306b.a;
                j.b bVar2 = aVar.f1303b.f1306b.a;
                if (bVar != bVar2 || this.f2467c != bVar2) {
                    z = false;
                }
            }
            if (z) {
                this.f2471g = false;
                return;
            }
            this.f2471g = false;
            if (this.f2467c.compareTo(aVar.a.f1306b.a) < 0) {
                c.c.a.b.a<o, a> aVar2 = this.f2466b;
                b.C0023b c0023b = new b.C0023b(aVar2.f1303b, aVar2.a);
                aVar2.f1304c.put(c0023b, Boolean.FALSE);
                while (c0023b.hasNext() && !this.f2471g) {
                    Map.Entry entry = (Map.Entry) c0023b.next();
                    a aVar3 = (a) entry.getValue();
                    while (aVar3.a.compareTo(this.f2467c) > 0 && !this.f2471g && this.f2466b.contains((o) entry.getKey())) {
                        j.a downFrom = j.a.downFrom(aVar3.a);
                        if (downFrom == null) {
                            StringBuilder y = e.a.d.a.a.y("no event down from ");
                            y.append(aVar3.a);
                            throw new IllegalStateException(y.toString());
                        }
                        this.f2472h.add(downFrom.getTargetState());
                        aVar3.a(pVar, downFrom);
                        h();
                    }
                }
            }
            b.c<o, a> cVar = this.f2466b.f1303b;
            if (!this.f2471g && cVar != null && this.f2467c.compareTo(cVar.f1306b.a) > 0) {
                c.c.a.b.b<o, a>.d b2 = this.f2466b.b();
                while (b2.hasNext() && !this.f2471g) {
                    Map.Entry entry2 = (Map.Entry) b2.next();
                    a aVar4 = (a) entry2.getValue();
                    while (aVar4.a.compareTo(this.f2467c) < 0 && !this.f2471g && this.f2466b.contains((o) entry2.getKey())) {
                        this.f2472h.add(aVar4.a);
                        j.a upFrom = j.a.upFrom(aVar4.a);
                        if (upFrom == null) {
                            StringBuilder y2 = e.a.d.a.a.y("no event up from ");
                            y2.append(aVar4.a);
                            throw new IllegalStateException(y2.toString());
                        }
                        aVar4.a(pVar, upFrom);
                        h();
                    }
                }
            }
        }
    }
}
