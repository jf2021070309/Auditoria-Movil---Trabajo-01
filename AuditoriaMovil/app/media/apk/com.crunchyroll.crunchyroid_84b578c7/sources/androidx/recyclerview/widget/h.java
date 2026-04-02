package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class h extends e0 {
    public static TimeInterpolator s;
    public final ArrayList<RecyclerView.f0> h = new ArrayList<>();
    public final ArrayList<RecyclerView.f0> i = new ArrayList<>();
    public final ArrayList<e> j = new ArrayList<>();
    public final ArrayList<d> k = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.f0>> l = new ArrayList<>();
    public final ArrayList<ArrayList<e>> m = new ArrayList<>();
    public final ArrayList<ArrayList<d>> n = new ArrayList<>();
    public final ArrayList<RecyclerView.f0> o = new ArrayList<>();
    public final ArrayList<RecyclerView.f0> p = new ArrayList<>();
    public final ArrayList<RecyclerView.f0> q = new ArrayList<>();
    public final ArrayList<RecyclerView.f0> r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ ArrayList b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                h hVar = h.this;
                if (hasNext) {
                    e eVar = (e) it.next();
                    RecyclerView.f0 f0Var = eVar.a;
                    hVar.getClass();
                    View view = f0Var.itemView;
                    int i = eVar.d - eVar.b;
                    int i2 = eVar.e - eVar.c;
                    if (i != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i2 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    hVar.p.add(f0Var);
                    animate.setDuration(hVar.e).setListener(new k(hVar, f0Var, i, view, i2, animate)).start();
                } else {
                    arrayList.clear();
                    hVar.m.remove(arrayList);
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ ArrayList b;

        public b(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view;
            ArrayList arrayList = this.b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                h hVar = h.this;
                if (hasNext) {
                    d dVar = (d) it.next();
                    hVar.getClass();
                    RecyclerView.f0 f0Var = dVar.a;
                    View view2 = null;
                    if (f0Var == null) {
                        view = null;
                    } else {
                        view = f0Var.itemView;
                    }
                    RecyclerView.f0 f0Var2 = dVar.b;
                    if (f0Var2 != null) {
                        view2 = f0Var2.itemView;
                    }
                    ArrayList<RecyclerView.f0> arrayList2 = hVar.r;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(hVar.f);
                        arrayList2.add(dVar.a);
                        duration.translationX(dVar.e - dVar.c);
                        duration.translationY(dVar.f - dVar.d);
                        duration.alpha(0.0f).setListener(new l(hVar, dVar, duration, view)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList2.add(dVar.b);
                        animate.translationX(0.0f).translationY(0.0f).setDuration(hVar.f).alpha(1.0f).setListener(new m(hVar, dVar, animate, view2)).start();
                    }
                } else {
                    arrayList.clear();
                    hVar.n.remove(arrayList);
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ ArrayList b;

        public c(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                h hVar = h.this;
                if (hasNext) {
                    RecyclerView.f0 f0Var = (RecyclerView.f0) it.next();
                    hVar.getClass();
                    View view = f0Var.itemView;
                    ViewPropertyAnimator animate = view.animate();
                    hVar.o.add(f0Var);
                    animate.alpha(1.0f).setDuration(hVar.c).setListener(new j(view, animate, hVar, f0Var)).start();
                } else {
                    arrayList.clear();
                    hVar.l.remove(arrayList);
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class d {
        public RecyclerView.f0 a;
        public RecyclerView.f0 b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public d(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i, int i2, int i3, int i4) {
            this.a = f0Var;
            this.b = f0Var2;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.a);
            sb.append(", newHolder=");
            sb.append(this.b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.e);
            sb.append(", toY=");
            return b2.b(sb, this.f, '}');
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class e {
        public final RecyclerView.f0 a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public e(RecyclerView.f0 f0Var, int i, int i2, int i3, int i4) {
            this.a = f0Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public static void m(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.f0) arrayList.get(size)).itemView.animate().cancel();
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean c(RecyclerView.f0 f0Var, List<Object> list) {
        if (list.isEmpty() && !super.c(f0Var, list)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void e(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        view.animate().cancel();
        ArrayList<e> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size).a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                d(f0Var);
                arrayList.remove(size);
            }
        }
        o(f0Var, this.k);
        if (this.h.remove(f0Var)) {
            view.setAlpha(1.0f);
            d(f0Var);
        }
        if (this.i.remove(f0Var)) {
            view.setAlpha(1.0f);
            d(f0Var);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<d> arrayList3 = arrayList2.get(size2);
            o(f0Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<e>> arrayList4 = this.m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<e> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList5.get(size4).a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    d(f0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.f0>> arrayList6 = this.l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.f0> arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(f0Var)) {
                    view.setAlpha(1.0f);
                    d(f0Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.q.remove(f0Var);
                this.o.remove(f0Var);
                this.r.remove(f0Var);
                this.p.remove(f0Var);
                n();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void f() {
        ArrayList<e> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            View view = eVar.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            d(eVar.a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.f0> arrayList2 = this.h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            d(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.f0> arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = arrayList3.get(size3);
            f0Var.itemView.setAlpha(1.0f);
            d(f0Var);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            d dVar = arrayList4.get(size4);
            RecyclerView.f0 f0Var2 = dVar.a;
            if (f0Var2 != null) {
                p(dVar, f0Var2);
            }
            RecyclerView.f0 f0Var3 = dVar.b;
            if (f0Var3 != null) {
                p(dVar, f0Var3);
            }
        }
        arrayList4.clear();
        if (!g()) {
            return;
        }
        ArrayList<ArrayList<e>> arrayList5 = this.m;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<e> arrayList6 = arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    e eVar2 = arrayList6.get(size6);
                    View view2 = eVar2.a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    d(eVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.f0>> arrayList7 = this.l;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.f0> arrayList8 = arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.f0 f0Var4 = arrayList8.get(size8);
                    f0Var4.itemView.setAlpha(1.0f);
                    d(f0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList<ArrayList<d>> arrayList9 = this.n;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                break;
            }
            ArrayList<d> arrayList10 = arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    d dVar2 = arrayList10.get(size10);
                    RecyclerView.f0 f0Var5 = dVar2.a;
                    if (f0Var5 != null) {
                        p(dVar2, f0Var5);
                    }
                    RecyclerView.f0 f0Var6 = dVar2.b;
                    if (f0Var6 != null) {
                        p(dVar2, f0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
        m(this.q);
        m(this.p);
        m(this.o);
        m(this.r);
        ArrayList<RecyclerView.m.a> arrayList11 = this.b;
        int size11 = arrayList11.size();
        for (int i = 0; i < size11; i++) {
            arrayList11.get(i).a();
        }
        arrayList11.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean g() {
        if (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void h() {
        long j;
        long j2;
        ArrayList<RecyclerView.f0> arrayList = this.h;
        boolean z = !arrayList.isEmpty();
        ArrayList<e> arrayList2 = this.j;
        boolean z2 = !arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.k;
        boolean z3 = !arrayList3.isEmpty();
        ArrayList<RecyclerView.f0> arrayList4 = this.i;
        boolean z4 = !arrayList4.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator<RecyclerView.f0> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j = this.d;
            if (!hasNext) {
                break;
            }
            RecyclerView.f0 next = it.next();
            View view = next.itemView;
            ViewPropertyAnimator animate = view.animate();
            this.q.add(next);
            animate.setDuration(j).alpha(0.0f).setListener(new i(view, animate, this, next)).start();
        }
        arrayList.clear();
        if (z2) {
            ArrayList<e> arrayList5 = new ArrayList<>();
            arrayList5.addAll(arrayList2);
            this.m.add(arrayList5);
            arrayList2.clear();
            a aVar = new a(arrayList5);
            if (z) {
                View view2 = arrayList5.get(0).a.itemView;
                WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                g0.d.n(view2, aVar, j);
            } else {
                aVar.run();
            }
        }
        if (z3) {
            ArrayList<d> arrayList6 = new ArrayList<>();
            arrayList6.addAll(arrayList3);
            this.n.add(arrayList6);
            arrayList3.clear();
            b bVar = new b(arrayList6);
            if (z) {
                View view3 = arrayList6.get(0).a.itemView;
                WeakHashMap<View, r0> weakHashMap2 = com.amazon.aps.iva.p3.g0.a;
                g0.d.n(view3, bVar, j);
            } else {
                bVar.run();
            }
        }
        if (z4) {
            ArrayList<RecyclerView.f0> arrayList7 = new ArrayList<>();
            arrayList7.addAll(arrayList4);
            this.l.add(arrayList7);
            arrayList4.clear();
            c cVar = new c(arrayList7);
            if (!z && !z2 && !z3) {
                cVar.run();
                return;
            }
            long j3 = 0;
            if (!z) {
                j = 0;
            }
            if (z2) {
                j2 = this.e;
            } else {
                j2 = 0;
            }
            if (z3) {
                j3 = this.f;
            }
            View view4 = arrayList7.get(0).itemView;
            WeakHashMap<View, r0> weakHashMap3 = com.amazon.aps.iva.p3.g0.a;
            g0.d.n(view4, cVar, Math.max(j2, j3) + j);
        }
    }

    @Override // androidx.recyclerview.widget.e0
    @SuppressLint({"UnknownNullness"})
    public final void i(RecyclerView.f0 f0Var) {
        q(f0Var);
        f0Var.itemView.setAlpha(0.0f);
        this.i.add(f0Var);
    }

    @Override // androidx.recyclerview.widget.e0
    @SuppressLint({"UnknownNullness"})
    public final boolean j(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i, int i2, int i3, int i4) {
        if (f0Var == f0Var2) {
            return k(f0Var, i, i2, i3, i4);
        }
        float translationX = f0Var.itemView.getTranslationX();
        float translationY = f0Var.itemView.getTranslationY();
        float alpha = f0Var.itemView.getAlpha();
        q(f0Var);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        f0Var.itemView.setTranslationX(translationX);
        f0Var.itemView.setTranslationY(translationY);
        f0Var.itemView.setAlpha(alpha);
        if (f0Var2 != null) {
            q(f0Var2);
            f0Var2.itemView.setTranslationX(-i5);
            f0Var2.itemView.setTranslationY(-i6);
            f0Var2.itemView.setAlpha(0.0f);
        }
        this.k.add(new d(f0Var, f0Var2, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.e0
    @SuppressLint({"UnknownNullness"})
    public final boolean k(RecyclerView.f0 f0Var, int i, int i2, int i3, int i4) {
        View view = f0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) f0Var.itemView.getTranslationY());
        q(f0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            d(f0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.j.add(new e(f0Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.e0
    @SuppressLint({"UnknownNullness"})
    public final void l(RecyclerView.f0 f0Var) {
        q(f0Var);
        this.h.add(f0Var);
    }

    public final void n() {
        if (!g()) {
            ArrayList<RecyclerView.m.a> arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).a();
            }
            arrayList.clear();
        }
    }

    public final void o(RecyclerView.f0 f0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                d dVar = (d) arrayList.get(size);
                if (p(dVar, f0Var) && dVar.a == null && dVar.b == null) {
                    arrayList.remove(dVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean p(d dVar, RecyclerView.f0 f0Var) {
        if (dVar.b == f0Var) {
            dVar.b = null;
        } else if (dVar.a == f0Var) {
            dVar.a = null;
        } else {
            return false;
        }
        f0Var.itemView.setAlpha(1.0f);
        f0Var.itemView.setTranslationX(0.0f);
        f0Var.itemView.setTranslationY(0.0f);
        d(f0Var);
        return true;
    }

    public final void q(RecyclerView.f0 f0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        f0Var.itemView.animate().setInterpolator(s);
        e(f0Var);
    }
}
