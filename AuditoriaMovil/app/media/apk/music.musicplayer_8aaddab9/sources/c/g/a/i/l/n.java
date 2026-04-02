package c.g.a.i.l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class n {
    public static int a;

    /* renamed from: c  reason: collision with root package name */
    public int f1794c;

    /* renamed from: d  reason: collision with root package name */
    public int f1795d;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<c.g.a.i.d> f1793b = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<a> f1796e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f1797f = -1;

    /* loaded from: classes.dex */
    public class a {
        public a(n nVar, c.g.a.i.d dVar, c.g.a.d dVar2, int i2) {
            new WeakReference(dVar);
            dVar2.o(dVar.J);
            dVar2.o(dVar.K);
            dVar2.o(dVar.L);
            dVar2.o(dVar.M);
            dVar2.o(dVar.N);
        }
    }

    public n(int i2) {
        this.f1794c = -1;
        this.f1795d = 0;
        int i3 = a;
        a = i3 + 1;
        this.f1794c = i3;
        this.f1795d = i2;
    }

    public boolean a(c.g.a.i.d dVar) {
        if (this.f1793b.contains(dVar)) {
            return false;
        }
        this.f1793b.add(dVar);
        return true;
    }

    public void b(ArrayList<n> arrayList) {
        int size = this.f1793b.size();
        if (this.f1797f != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                n nVar = arrayList.get(i2);
                if (this.f1797f == nVar.f1794c) {
                    d(this.f1795d, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c(c.g.a.d dVar, int i2) {
        int o;
        int o2;
        if (this.f1793b.size() == 0) {
            return 0;
        }
        ArrayList<c.g.a.i.d> arrayList = this.f1793b;
        c.g.a.i.e eVar = (c.g.a.i.e) arrayList.get(0).V;
        dVar.u();
        eVar.d(dVar, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).d(dVar, false);
        }
        if (i2 == 0 && eVar.A0 > 0) {
            c.e.a.a(eVar, dVar, arrayList, 0);
        }
        if (i2 == 1 && eVar.B0 > 0) {
            c.e.a.a(eVar, dVar, arrayList, 1);
        }
        try {
            dVar.q();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f1796e = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f1796e.add(new a(this, arrayList.get(i4), dVar, i2));
        }
        if (i2 == 0) {
            o = dVar.o(eVar.J);
            o2 = dVar.o(eVar.L);
            dVar.u();
        } else {
            o = dVar.o(eVar.K);
            o2 = dVar.o(eVar.M);
            dVar.u();
        }
        return o2 - o;
    }

    public void d(int i2, n nVar) {
        Iterator<c.g.a.i.d> it = this.f1793b.iterator();
        while (it.hasNext()) {
            c.g.a.i.d next = it.next();
            nVar.a(next);
            if (i2 == 0) {
                next.p0 = nVar.f1794c;
            } else {
                next.q0 = nVar.f1794c;
            }
        }
        this.f1797f = nVar.f1794c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f1795d;
        sb.append(i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String p = e.a.d.a.a.p(sb, this.f1794c, "] <");
        Iterator<c.g.a.i.d> it = this.f1793b.iterator();
        while (it.hasNext()) {
            StringBuilder A = e.a.d.a.a.A(p, " ");
            A.append(it.next().j0);
            p = A.toString();
        }
        return e.a.d.a.a.k(p, " >");
    }
}
