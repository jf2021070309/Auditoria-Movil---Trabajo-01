package c.u.b;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class g0 {
    public final c.f.h<RecyclerView.a0, a> a = new c.f.h<>();

    /* renamed from: b  reason: collision with root package name */
    public final c.f.e<RecyclerView.a0> f2628b = new c.f.e<>();

    /* loaded from: classes.dex */
    public static class a {
        public static c.i.j.c<a> a = new c.i.j.d(20);

        /* renamed from: b  reason: collision with root package name */
        public int f2629b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.j.c f2630c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView.j.c f2631d;

        public static a a() {
            a b2 = a.b();
            return b2 == null ? new a() : b2;
        }

        public static void b(a aVar) {
            aVar.f2629b = 0;
            aVar.f2630c = null;
            aVar.f2631d = null;
            a.a(aVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public void a(RecyclerView.a0 a0Var) {
        a orDefault = this.a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(a0Var, orDefault);
        }
        orDefault.f2629b |= 1;
    }

    public void b(RecyclerView.a0 a0Var, RecyclerView.j.c cVar) {
        a orDefault = this.a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(a0Var, orDefault);
        }
        orDefault.f2631d = cVar;
        orDefault.f2629b |= 8;
    }

    public void c(RecyclerView.a0 a0Var, RecyclerView.j.c cVar) {
        a orDefault = this.a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(a0Var, orDefault);
        }
        orDefault.f2630c = cVar;
        orDefault.f2629b |= 4;
    }

    public boolean d(RecyclerView.a0 a0Var) {
        a orDefault = this.a.getOrDefault(a0Var, null);
        return (orDefault == null || (orDefault.f2629b & 1) == 0) ? false : true;
    }

    public final RecyclerView.j.c e(RecyclerView.a0 a0Var, int i2) {
        a l2;
        RecyclerView.j.c cVar;
        int e2 = this.a.e(a0Var);
        if (e2 >= 0 && (l2 = this.a.l(e2)) != null) {
            int i3 = l2.f2629b;
            if ((i3 & i2) != 0) {
                int i4 = (i2 ^ (-1)) & i3;
                l2.f2629b = i4;
                if (i2 == 4) {
                    cVar = l2.f2630c;
                } else if (i2 != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    cVar = l2.f2631d;
                }
                if ((i4 & 12) == 0) {
                    this.a.j(e2);
                    a.b(l2);
                }
                return cVar;
            }
        }
        return null;
    }

    public void f(RecyclerView.a0 a0Var) {
        a orDefault = this.a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f2629b &= -2;
    }

    public void g(RecyclerView.a0 a0Var) {
        int j2 = this.f2628b.j() - 1;
        while (true) {
            if (j2 < 0) {
                break;
            } else if (a0Var == this.f2628b.k(j2)) {
                c.f.e<RecyclerView.a0> eVar = this.f2628b;
                Object[] objArr = eVar.f1649d;
                Object obj = objArr[j2];
                Object obj2 = c.f.e.a;
                if (obj != obj2) {
                    objArr[j2] = obj2;
                    eVar.f1647b = true;
                }
            } else {
                j2--;
            }
        }
        a remove = this.a.remove(a0Var);
        if (remove != null) {
            a.b(remove);
        }
    }
}
