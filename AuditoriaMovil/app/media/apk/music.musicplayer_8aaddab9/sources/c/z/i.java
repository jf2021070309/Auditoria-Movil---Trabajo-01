package c.z;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import c.i.k.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class i implements Cloneable {
    public static final int[] a = {2, 1, 3, 4};

    /* renamed from: b  reason: collision with root package name */
    public static final e f2883b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static ThreadLocal<c.f.a<Animator, b>> f2884c = new ThreadLocal<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<q> f2895n;
    public ArrayList<q> o;
    public c v;

    /* renamed from: d  reason: collision with root package name */
    public String f2885d = getClass().getName();

    /* renamed from: e  reason: collision with root package name */
    public long f2886e = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f2887f = -1;

    /* renamed from: g  reason: collision with root package name */
    public TimeInterpolator f2888g = null;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<Integer> f2889h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<View> f2890i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public r f2891j = new r();

    /* renamed from: k  reason: collision with root package name */
    public r f2892k = new r();

    /* renamed from: l  reason: collision with root package name */
    public o f2893l = null;

    /* renamed from: m  reason: collision with root package name */
    public int[] f2894m = a;
    public ArrayList<Animator> p = new ArrayList<>();
    public int q = 0;
    public boolean r = false;
    public boolean s = false;
    public ArrayList<d> t = null;
    public ArrayList<Animator> u = new ArrayList<>();
    public e w = f2883b;

    /* loaded from: classes.dex */
    public class a extends e {
        @Override // c.z.e
        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public View a;

        /* renamed from: b  reason: collision with root package name */
        public String f2896b;

        /* renamed from: c  reason: collision with root package name */
        public q f2897c;

        /* renamed from: d  reason: collision with root package name */
        public d0 f2898d;

        /* renamed from: e  reason: collision with root package name */
        public i f2899e;

        public b(View view, String str, i iVar, d0 d0Var, q qVar) {
            this.a = view;
            this.f2896b = str;
            this.f2897c = qVar;
            this.f2898d = d0Var;
            this.f2899e = iVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(i iVar);

        void b(i iVar);

        void c(i iVar);

        void d(i iVar);

        void e(i iVar);
    }

    public static void c(r rVar, View view, q qVar) {
        rVar.a.put(view, qVar);
        int id = view.getId();
        if (id >= 0) {
            if (rVar.f2909b.indexOfKey(id) >= 0) {
                rVar.f2909b.put(id, null);
            } else {
                rVar.f2909b.put(id, view);
            }
        }
        String p = c.i.k.d0.p(view);
        if (p != null) {
            if (rVar.f2911d.e(p) >= 0) {
                rVar.f2911d.put(p, null);
            } else {
                rVar.f2911d.put(p, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                c.f.e<View> eVar = rVar.f2910c;
                if (eVar.f1647b) {
                    eVar.d();
                }
                if (c.f.d.b(eVar.f1648c, eVar.f1650e, itemIdAtPosition) < 0) {
                    d0.c.r(view, true);
                    rVar.f2910c.g(itemIdAtPosition, view);
                    return;
                }
                View e2 = rVar.f2910c.e(itemIdAtPosition);
                if (e2 != null) {
                    d0.c.r(e2, false);
                    rVar.f2910c.g(itemIdAtPosition, null);
                }
            }
        }
    }

    public static c.f.a<Animator, b> q() {
        c.f.a<Animator, b> aVar = f2884c.get();
        if (aVar == null) {
            c.f.a<Animator, b> aVar2 = new c.f.a<>();
            f2884c.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static boolean w(q qVar, q qVar2, String str) {
        Object obj = qVar.a.get(str);
        Object obj2 = qVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public void A(View view) {
        if (this.r) {
            if (!this.s) {
                for (int size = this.p.size() - 1; size >= 0; size--) {
                    this.p.get(size).resume();
                }
                ArrayList<d> arrayList = this.t;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.t.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((d) arrayList2.get(i2)).e(this);
                    }
                }
            }
            this.r = false;
        }
    }

    public void B() {
        I();
        c.f.a<Animator, b> q = q();
        Iterator<Animator> it = this.u.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (q.containsKey(next)) {
                I();
                if (next != null) {
                    next.addListener(new j(this, q));
                    long j2 = this.f2887f;
                    if (j2 >= 0) {
                        next.setDuration(j2);
                    }
                    long j3 = this.f2886e;
                    if (j3 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f2888g;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new k(this));
                    next.start();
                }
            }
        }
        this.u.clear();
        o();
    }

    public i C(long j2) {
        this.f2887f = j2;
        return this;
    }

    public void D(c cVar) {
        this.v = cVar;
    }

    public i E(TimeInterpolator timeInterpolator) {
        this.f2888g = timeInterpolator;
        return this;
    }

    public void F(e eVar) {
        if (eVar == null) {
            this.w = f2883b;
        } else {
            this.w = eVar;
        }
    }

    public void G(n nVar) {
    }

    public i H(long j2) {
        this.f2886e = j2;
        return this;
    }

    public void I() {
        if (this.q == 0) {
            ArrayList<d> arrayList = this.t;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.t.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).a(this);
                }
            }
            this.s = false;
        }
        this.q++;
    }

    public String J(String str) {
        StringBuilder y = e.a.d.a.a.y(str);
        y.append(getClass().getSimpleName());
        y.append("@");
        y.append(Integer.toHexString(hashCode()));
        y.append(": ");
        String sb = y.toString();
        if (this.f2887f != -1) {
            sb = e.a.d.a.a.q(e.a.d.a.a.A(sb, "dur("), this.f2887f, ") ");
        }
        if (this.f2886e != -1) {
            sb = e.a.d.a.a.q(e.a.d.a.a.A(sb, "dly("), this.f2886e, ") ");
        }
        if (this.f2888g != null) {
            StringBuilder A = e.a.d.a.a.A(sb, "interp(");
            A.append(this.f2888g);
            A.append(") ");
            sb = A.toString();
        }
        if (this.f2889h.size() > 0 || this.f2890i.size() > 0) {
            String k2 = e.a.d.a.a.k(sb, "tgts(");
            if (this.f2889h.size() > 0) {
                for (int i2 = 0; i2 < this.f2889h.size(); i2++) {
                    if (i2 > 0) {
                        k2 = e.a.d.a.a.k(k2, ", ");
                    }
                    StringBuilder y2 = e.a.d.a.a.y(k2);
                    y2.append(this.f2889h.get(i2));
                    k2 = y2.toString();
                }
            }
            if (this.f2890i.size() > 0) {
                for (int i3 = 0; i3 < this.f2890i.size(); i3++) {
                    if (i3 > 0) {
                        k2 = e.a.d.a.a.k(k2, ", ");
                    }
                    StringBuilder y3 = e.a.d.a.a.y(k2);
                    y3.append(this.f2890i.get(i3));
                    k2 = y3.toString();
                }
            }
            return e.a.d.a.a.k(k2, ")");
        }
        return sb;
    }

    public i a(d dVar) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(dVar);
        return this;
    }

    public i b(View view) {
        this.f2890i.add(view);
        return this;
    }

    public void cancel() {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            this.p.get(size).cancel();
        }
        ArrayList<d> arrayList = this.t;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.t.clone();
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((d) arrayList2.get(i2)).d(this);
        }
    }

    public abstract void d(q qVar);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            q qVar = new q(view);
            if (z) {
                g(qVar);
            } else {
                d(qVar);
            }
            qVar.f2908c.add(this);
            f(qVar);
            if (z) {
                c(this.f2891j, view, qVar);
            } else {
                c(this.f2892k, view, qVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2), z);
            }
        }
    }

    public void f(q qVar) {
    }

    public abstract void g(q qVar);

    public void j(ViewGroup viewGroup, boolean z) {
        k(z);
        if (this.f2889h.size() <= 0 && this.f2890i.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i2 = 0; i2 < this.f2889h.size(); i2++) {
            View findViewById = viewGroup.findViewById(this.f2889h.get(i2).intValue());
            if (findViewById != null) {
                q qVar = new q(findViewById);
                if (z) {
                    g(qVar);
                } else {
                    d(qVar);
                }
                qVar.f2908c.add(this);
                f(qVar);
                if (z) {
                    c(this.f2891j, findViewById, qVar);
                } else {
                    c(this.f2892k, findViewById, qVar);
                }
            }
        }
        for (int i3 = 0; i3 < this.f2890i.size(); i3++) {
            View view = this.f2890i.get(i3);
            q qVar2 = new q(view);
            if (z) {
                g(qVar2);
            } else {
                d(qVar2);
            }
            qVar2.f2908c.add(this);
            f(qVar2);
            if (z) {
                c(this.f2891j, view, qVar2);
            } else {
                c(this.f2892k, view, qVar2);
            }
        }
    }

    public void k(boolean z) {
        if (z) {
            this.f2891j.a.clear();
            this.f2891j.f2909b.clear();
            this.f2891j.f2910c.b();
            return;
        }
        this.f2892k.a.clear();
        this.f2892k.f2909b.clear();
        this.f2892k.f2910c.b();
    }

    @Override // 
    /* renamed from: l */
    public i clone() {
        try {
            i iVar = (i) super.clone();
            iVar.u = new ArrayList<>();
            iVar.f2891j = new r();
            iVar.f2892k = new r();
            iVar.f2895n = null;
            iVar.o = null;
            return iVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator m(ViewGroup viewGroup, q qVar, q qVar2) {
        return null;
    }

    public void n(ViewGroup viewGroup, r rVar, r rVar2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        Animator m2;
        int i2;
        View view;
        Animator animator;
        q qVar;
        Animator animator2;
        q qVar2;
        c.f.a<Animator, b> q = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            q qVar3 = arrayList.get(i3);
            q qVar4 = arrayList2.get(i3);
            if (qVar3 != null && !qVar3.f2908c.contains(this)) {
                qVar3 = null;
            }
            if (qVar4 != null && !qVar4.f2908c.contains(this)) {
                qVar4 = null;
            }
            if (qVar3 != null || qVar4 != null) {
                if ((qVar3 == null || qVar4 == null || t(qVar3, qVar4)) && (m2 = m(viewGroup, qVar3, qVar4)) != null) {
                    if (qVar4 != null) {
                        View view2 = qVar4.f2907b;
                        String[] r = r();
                        if (r != null && r.length > 0) {
                            qVar2 = new q(view2);
                            q qVar5 = rVar2.a.get(view2);
                            if (qVar5 != null) {
                                int i4 = 0;
                                while (i4 < r.length) {
                                    qVar2.a.put(r[i4], qVar5.a.get(r[i4]));
                                    i4++;
                                    m2 = m2;
                                    size = size;
                                    qVar5 = qVar5;
                                }
                            }
                            Animator animator3 = m2;
                            i2 = size;
                            int i5 = q.f1665g;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator2 = animator3;
                                    break;
                                }
                                b bVar = q.get(q.h(i6));
                                if (bVar.f2897c != null && bVar.a == view2 && bVar.f2896b.equals(this.f2885d) && bVar.f2897c.equals(qVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i2 = size;
                            animator2 = m2;
                            qVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        qVar = qVar2;
                    } else {
                        i2 = size;
                        view = qVar3.f2907b;
                        animator = m2;
                        qVar = null;
                    }
                    if (animator != null) {
                        String str = this.f2885d;
                        z zVar = t.a;
                        q.put(animator, new b(view, str, this, new c0(viewGroup), qVar));
                        this.u.add(animator);
                    }
                    i3++;
                    size = i2;
                }
            }
            i2 = size;
            i3++;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator4 = this.u.get(sparseIntArray.keyAt(i7));
                animator4.setStartDelay(animator4.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public void o() {
        int i2 = this.q - 1;
        this.q = i2;
        if (i2 == 0) {
            ArrayList<d> arrayList = this.t;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.t.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((d) arrayList2.get(i3)).c(this);
                }
            }
            for (int i4 = 0; i4 < this.f2891j.f2910c.j(); i4++) {
                View k2 = this.f2891j.f2910c.k(i4);
                if (k2 != null) {
                    AtomicInteger atomicInteger = c.i.k.d0.a;
                    d0.c.r(k2, false);
                }
            }
            for (int i5 = 0; i5 < this.f2892k.f2910c.j(); i5++) {
                View k3 = this.f2892k.f2910c.k(i5);
                if (k3 != null) {
                    AtomicInteger atomicInteger2 = c.i.k.d0.a;
                    d0.c.r(k3, false);
                }
            }
            this.s = true;
        }
    }

    public q p(View view, boolean z) {
        o oVar = this.f2893l;
        if (oVar != null) {
            return oVar.p(view, z);
        }
        ArrayList<q> arrayList = z ? this.f2895n : this.o;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            q qVar = arrayList.get(i3);
            if (qVar == null) {
                return null;
            }
            if (qVar.f2907b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 >= 0) {
            return (z ? this.o : this.f2895n).get(i2);
        }
        return null;
    }

    public String[] r() {
        return null;
    }

    public q s(View view, boolean z) {
        o oVar = this.f2893l;
        if (oVar != null) {
            return oVar.s(view, z);
        }
        return (z ? this.f2891j : this.f2892k).a.getOrDefault(view, null);
    }

    public boolean t(q qVar, q qVar2) {
        if (qVar == null || qVar2 == null) {
            return false;
        }
        String[] r = r();
        if (r == null) {
            for (String str : qVar.a.keySet()) {
                if (w(qVar, qVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : r) {
            if (!w(qVar, qVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public String toString() {
        return J("");
    }

    public boolean u(View view) {
        return (this.f2889h.size() == 0 && this.f2890i.size() == 0) || this.f2889h.contains(Integer.valueOf(view.getId())) || this.f2890i.contains(view);
    }

    public void x(View view) {
        if (this.s) {
            return;
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            this.p.get(size).pause();
        }
        ArrayList<d> arrayList = this.t;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.t.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((d) arrayList2.get(i2)).b(this);
            }
        }
        this.r = true;
    }

    public i y(d dVar) {
        ArrayList<d> arrayList = this.t;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.t.size() == 0) {
            this.t = null;
        }
        return this;
    }

    public i z(View view) {
        this.f2890i.remove(view);
        return this;
    }
}
