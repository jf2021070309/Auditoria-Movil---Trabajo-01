package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public final class i0 {
    public final com.amazon.aps.iva.x.h<RecyclerView.f0, a> a = new com.amazon.aps.iva.x.h<>();
    public final com.amazon.aps.iva.x.f<RecyclerView.f0> b = new com.amazon.aps.iva.x.f<>();

    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final com.amazon.aps.iva.o3.e d = new com.amazon.aps.iva.o3.e(20);
        public int a;
        public RecyclerView.m.c b;
        public RecyclerView.m.c c;

        public static a a() {
            a aVar = (a) d.b();
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }
    }

    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public final void a(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        com.amazon.aps.iva.x.h<RecyclerView.f0, a> hVar = this.a;
        a orDefault = hVar.getOrDefault(f0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            hVar.put(f0Var, orDefault);
        }
        orDefault.c = cVar;
        orDefault.a |= 8;
    }

    public final RecyclerView.m.c b(RecyclerView.f0 f0Var, int i) {
        a n;
        RecyclerView.m.c cVar;
        com.amazon.aps.iva.x.h<RecyclerView.f0, a> hVar = this.a;
        int g = hVar.g(f0Var);
        if (g >= 0 && (n = hVar.n(g)) != null) {
            int i2 = n.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                n.a = i3;
                if (i == 4) {
                    cVar = n.b;
                } else if (i == 8) {
                    cVar = n.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    hVar.l(g);
                    n.a = 0;
                    n.b = null;
                    n.c = null;
                    a.d.a(n);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.f0 f0Var) {
        a orDefault = this.a.getOrDefault(f0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.a &= -2;
    }

    public final void d(RecyclerView.f0 f0Var) {
        com.amazon.aps.iva.x.f<RecyclerView.f0> fVar = this.b;
        int h = fVar.h() - 1;
        while (true) {
            if (h < 0) {
                break;
            } else if (f0Var == fVar.i(h)) {
                Object[] objArr = fVar.d;
                Object obj = objArr[h];
                Object obj2 = com.amazon.aps.iva.x.f.f;
                if (obj != obj2) {
                    objArr[h] = obj2;
                    fVar.b = true;
                }
            } else {
                h--;
            }
        }
        a remove = this.a.remove(f0Var);
        if (remove != null) {
            remove.a = 0;
            remove.b = null;
            remove.c = null;
            a.d.a(remove);
        }
    }
}
