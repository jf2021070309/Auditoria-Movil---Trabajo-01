package c.u.b;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import c.i.k.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class f extends d0 {

    /* renamed from: h  reason: collision with root package name */
    public static TimeInterpolator f2601h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f2602i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f2603j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<e> f2604k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<d> f2605l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.a0>> f2606m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<ArrayList<e>> f2607n = new ArrayList<>();
    public ArrayList<ArrayList<d>> o = new ArrayList<>();
    public ArrayList<RecyclerView.a0> p = new ArrayList<>();
    public ArrayList<RecyclerView.a0> q = new ArrayList<>();
    public ArrayList<RecyclerView.a0> r = new ArrayList<>();
    public ArrayList<RecyclerView.a0> s = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f fVar = f.this;
                RecyclerView.a0 a0Var = eVar.a;
                int i2 = eVar.f2616b;
                int i3 = eVar.f2617c;
                int i4 = eVar.f2618d;
                int i5 = eVar.f2619e;
                Objects.requireNonNull(fVar);
                View view = a0Var.f527b;
                int i6 = i4 - i2;
                int i7 = i5 - i3;
                if (i6 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i7 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                fVar.q.add(a0Var);
                animate.setDuration(fVar.f545e).setListener(new i(fVar, a0Var, i6, view, i7, animate)).start();
            }
            this.a.clear();
            f.this.f2607n.remove(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                f fVar = f.this;
                Objects.requireNonNull(fVar);
                RecyclerView.a0 a0Var = dVar.a;
                View view = a0Var == null ? null : a0Var.f527b;
                RecyclerView.a0 a0Var2 = dVar.f2611b;
                View view2 = a0Var2 != null ? a0Var2.f527b : null;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(fVar.f546f);
                    fVar.s.add(dVar.a);
                    duration.translationX(dVar.f2614e - dVar.f2612c);
                    duration.translationY(dVar.f2615f - dVar.f2613d);
                    duration.alpha(0.0f).setListener(new j(fVar, dVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    fVar.s.add(dVar.f2611b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(fVar.f546f).alpha(1.0f).setListener(new k(fVar, dVar, animate, view2)).start();
                }
            }
            this.a.clear();
            f.this.o.remove(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                RecyclerView.a0 a0Var = (RecyclerView.a0) it.next();
                f fVar = f.this;
                Objects.requireNonNull(fVar);
                View view = a0Var.f527b;
                ViewPropertyAnimator animate = view.animate();
                fVar.p.add(a0Var);
                animate.alpha(1.0f).setDuration(fVar.f543c).setListener(new h(fVar, a0Var, view, animate)).start();
            }
            this.a.clear();
            f.this.f2606m.remove(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public RecyclerView.a0 a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.a0 f2611b;

        /* renamed from: c  reason: collision with root package name */
        public int f2612c;

        /* renamed from: d  reason: collision with root package name */
        public int f2613d;

        /* renamed from: e  reason: collision with root package name */
        public int f2614e;

        /* renamed from: f  reason: collision with root package name */
        public int f2615f;

        public d(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i2, int i3, int i4, int i5) {
            this.a = a0Var;
            this.f2611b = a0Var2;
            this.f2612c = i2;
            this.f2613d = i3;
            this.f2614e = i4;
            this.f2615f = i5;
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("ChangeInfo{oldHolder=");
            y.append(this.a);
            y.append(", newHolder=");
            y.append(this.f2611b);
            y.append(", fromX=");
            y.append(this.f2612c);
            y.append(", fromY=");
            y.append(this.f2613d);
            y.append(", toX=");
            y.append(this.f2614e);
            y.append(", toY=");
            y.append(this.f2615f);
            y.append('}');
            return y.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public RecyclerView.a0 a;

        /* renamed from: b  reason: collision with root package name */
        public int f2616b;

        /* renamed from: c  reason: collision with root package name */
        public int f2617c;

        /* renamed from: d  reason: collision with root package name */
        public int f2618d;

        /* renamed from: e  reason: collision with root package name */
        public int f2619e;

        public e(RecyclerView.a0 a0Var, int i2, int i3, int i4, int i5) {
            this.a = a0Var;
            this.f2616b = i2;
            this.f2617c = i3;
            this.f2618d = i4;
            this.f2619e = i5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void e(RecyclerView.a0 a0Var) {
        View view = a0Var.f527b;
        view.animate().cancel();
        int size = this.f2604k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2604k.get(size).a == a0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(a0Var);
                this.f2604k.remove(size);
            }
        }
        m(this.f2605l, a0Var);
        if (this.f2602i.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        if (this.f2603j.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        int size2 = this.o.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<d> arrayList = this.o.get(size2);
            m(arrayList, a0Var);
            if (arrayList.isEmpty()) {
                this.o.remove(size2);
            }
        }
        int size3 = this.f2607n.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<e> arrayList2 = this.f2607n.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).a == a0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(a0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2607n.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f2606m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.r.remove(a0Var);
                this.p.remove(a0Var);
                this.s.remove(a0Var);
                this.q.remove(a0Var);
                l();
                return;
            }
            ArrayList<RecyclerView.a0> arrayList3 = this.f2606m.get(size5);
            if (arrayList3.remove(a0Var)) {
                view.setAlpha(1.0f);
                c(a0Var);
                if (arrayList3.isEmpty()) {
                    this.f2606m.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void f() {
        int size = this.f2604k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = this.f2604k.get(size);
            View view = eVar.a.f527b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(eVar.a);
            this.f2604k.remove(size);
        }
        int size2 = this.f2602i.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(this.f2602i.get(size2));
            this.f2602i.remove(size2);
        }
        int size3 = this.f2603j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.a0 a0Var = this.f2603j.get(size3);
            a0Var.f527b.setAlpha(1.0f);
            c(a0Var);
            this.f2603j.remove(size3);
        }
        int size4 = this.f2605l.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            d dVar = this.f2605l.get(size4);
            RecyclerView.a0 a0Var2 = dVar.a;
            if (a0Var2 != null) {
                n(dVar, a0Var2);
            }
            RecyclerView.a0 a0Var3 = dVar.f2611b;
            if (a0Var3 != null) {
                n(dVar, a0Var3);
            }
        }
        this.f2605l.clear();
        if (!g()) {
            return;
        }
        int size5 = this.f2607n.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<e> arrayList = this.f2607n.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    e eVar2 = arrayList.get(size6);
                    View view2 = eVar2.a.f527b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(eVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2607n.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f2606m.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.a0> arrayList2 = this.f2606m.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.a0 a0Var4 = arrayList2.get(size8);
                    a0Var4.f527b.setAlpha(1.0f);
                    c(a0Var4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2606m.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.o.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                k(this.r);
                k(this.q);
                k(this.p);
                k(this.s);
                d();
                return;
            }
            ArrayList<d> arrayList3 = this.o.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    d dVar2 = arrayList3.get(size10);
                    RecyclerView.a0 a0Var5 = dVar2.a;
                    if (a0Var5 != null) {
                        n(dVar2, a0Var5);
                    }
                    RecyclerView.a0 a0Var6 = dVar2.f2611b;
                    if (a0Var6 != null) {
                        n(dVar2, a0Var6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.o.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean g() {
        return (this.f2603j.isEmpty() && this.f2605l.isEmpty() && this.f2604k.isEmpty() && this.f2602i.isEmpty() && this.q.isEmpty() && this.r.isEmpty() && this.p.isEmpty() && this.s.isEmpty() && this.f2607n.isEmpty() && this.f2606m.isEmpty() && this.o.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void i() {
        boolean z = !this.f2602i.isEmpty();
        boolean z2 = !this.f2604k.isEmpty();
        boolean z3 = !this.f2605l.isEmpty();
        boolean z4 = !this.f2603j.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.a0> it = this.f2602i.iterator();
            while (it.hasNext()) {
                RecyclerView.a0 next = it.next();
                View view = next.f527b;
                ViewPropertyAnimator animate = view.animate();
                this.r.add(next);
                animate.setDuration(this.f544d).alpha(0.0f).setListener(new g(this, next, animate, view)).start();
            }
            this.f2602i.clear();
            if (z2) {
                ArrayList<e> arrayList = new ArrayList<>();
                arrayList.addAll(this.f2604k);
                this.f2607n.add(arrayList);
                this.f2604k.clear();
                a aVar = new a(arrayList);
                if (z) {
                    View view2 = arrayList.get(0).a.f527b;
                    long j2 = this.f544d;
                    AtomicInteger atomicInteger = c.i.k.d0.a;
                    d0.c.n(view2, aVar, j2);
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<d> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f2605l);
                this.o.add(arrayList2);
                this.f2605l.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    View view3 = arrayList2.get(0).a.f527b;
                    long j3 = this.f544d;
                    AtomicInteger atomicInteger2 = c.i.k.d0.a;
                    d0.c.n(view3, bVar, j3);
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.a0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f2603j);
                this.f2606m.add(arrayList3);
                this.f2603j.clear();
                c cVar = new c(arrayList3);
                if (!z && !z2 && !z3) {
                    cVar.run();
                    return;
                }
                long j4 = z ? this.f544d : 0L;
                long j5 = z2 ? this.f545e : 0L;
                long j6 = z3 ? this.f546f : 0L;
                View view4 = arrayList3.get(0).f527b;
                AtomicInteger atomicInteger3 = c.i.k.d0.a;
                d0.c.n(view4, cVar, Math.max(j5, j6) + j4);
            }
        }
    }

    @Override // c.u.b.d0
    public boolean j(RecyclerView.a0 a0Var, int i2, int i3, int i4, int i5) {
        View view = a0Var.f527b;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) a0Var.f527b.getTranslationY());
        o(a0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            c(a0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.f2604k.add(new e(a0Var, translationX, translationY, i4, i5));
        return true;
    }

    public void k(List<RecyclerView.a0> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            list.get(size).f527b.animate().cancel();
        }
    }

    public void l() {
        if (g()) {
            return;
        }
        d();
    }

    public final void m(List<d> list, RecyclerView.a0 a0Var) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = list.get(size);
            if (n(dVar, a0Var) && dVar.a == null && dVar.f2611b == null) {
                list.remove(dVar);
            }
        }
    }

    public final boolean n(d dVar, RecyclerView.a0 a0Var) {
        if (dVar.f2611b == a0Var) {
            dVar.f2611b = null;
        } else if (dVar.a != a0Var) {
            return false;
        } else {
            dVar.a = null;
        }
        a0Var.f527b.setAlpha(1.0f);
        a0Var.f527b.setTranslationX(0.0f);
        a0Var.f527b.setTranslationY(0.0f);
        c(a0Var);
        return true;
    }

    public final void o(RecyclerView.a0 a0Var) {
        if (f2601h == null) {
            f2601h = new ValueAnimator().getInterpolator();
        }
        a0Var.f527b.animate().setInterpolator(f2601h);
        e(a0Var);
    }
}
