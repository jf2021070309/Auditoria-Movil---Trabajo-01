package e.g.a.a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c.u.b.l;
import e.g.a.d.j;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class l extends m {

    /* renamed from: d  reason: collision with root package name */
    public final j<e.g.a.c.f> f7993d;

    /* renamed from: e  reason: collision with root package name */
    public final c.u.b.c<e.g.a.c.f> f7994e;

    /* loaded from: classes2.dex */
    public class a extends l.e<e.g.a.c.f> {
        public a(l lVar) {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements c.u.b.c<e.g.a.c.f> {
        public b() {
        }

        @Override // c.u.b.c
        public void a(List<e.g.a.c.f> list, List<e.g.a.c.f> list2) {
            Objects.requireNonNull(l.this);
        }
    }

    public l() {
        j<e.g.a.c.f> jVar = new j<>(new c.u.b.b(this), new a(this));
        this.f7993d = jVar;
        b bVar = new b();
        this.f7994e = bVar;
        jVar.f7990e.add(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int b() {
        return this.f7993d.f7991f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int d(int i2) {
        Object obj = j1.a;
        try {
            return this.f7993d.f7991f.get(i2).a();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void f(RecyclerView.a0 a0Var, int i2) {
        Object obj = j1.a;
        this.f7993d.f7991f.get(i2).b(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void g(RecyclerView.a0 a0Var, int i2, List list) {
        if (list.isEmpty()) {
            Object obj = j1.a;
            this.f7993d.f7991f.get(i2).b(a0Var);
            return;
        }
        Object obj2 = j1.a;
        this.f7993d.f7991f.get(i2).d(a0Var, i2, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.a0 h(ViewGroup viewGroup, int i2) {
        Object obj = j1.a;
        for (e.g.a.c.f fVar : this.f7993d.f7991f) {
            if (i2 == fVar.a()) {
                return fVar.c(viewGroup);
            }
        }
        throw new IllegalStateException(e.a.d.a.a.e("No ViewHolder found for viewType: ", i2));
    }

    @Override // e.g.a.a.m
    public int j(RecyclerView.a0 a0Var) {
        Object obj = j1.a;
        int i2 = a0Var.f532g;
        int g2 = a0Var.g();
        int i3 = 0;
        for (int i4 = 0; i4 < g2 && i4 < this.f7993d.f7991f.size(); i4++) {
            try {
                if (this.f7993d.f7991f.get(i4).a() != i2) {
                    i3++;
                }
            } catch (Exception unused) {
            }
        }
        return Math.max(0, g2 - i3);
    }

    @Override // e.g.a.a.m
    public synchronized void k(final List<e.g.a.c.f> list, final boolean z, final h hVar) {
        list.size();
        int i2 = t1.a;
        j0.h(new j0.c() { // from class: e.g.a.a.c
            @Override // e.h.g.j0.c
            public final void a() {
                final l lVar = l.this;
                boolean z2 = z;
                final List<e.g.a.c.f> list2 = list;
                final h hVar2 = hVar;
                if (z2) {
                    lVar.f7993d.b(null, new Runnable() { // from class: e.g.a.a.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            final l lVar2 = l.this;
                            final List list3 = list2;
                            final h hVar3 = hVar2;
                            Objects.requireNonNull(lVar2);
                            j0.i(new j0.c() { // from class: e.g.a.a.f
                                @Override // e.h.g.j0.c
                                public final void a() {
                                    l lVar3 = l.this;
                                    List<e.g.a.c.f> list4 = list3;
                                    final h hVar4 = hVar3;
                                    lVar3.f7993d.b(list4, new Runnable() { // from class: e.g.a.a.d
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            h hVar5 = h.this;
                                            if (hVar5 != null) {
                                                ((j.a) hVar5).e();
                                            }
                                        }
                                    });
                                }
                            });
                        }
                    });
                } else {
                    lVar.f7993d.b(list2, new Runnable() { // from class: e.g.a.a.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            h hVar3 = h.this;
                            if (hVar3 != null) {
                                ((j.a) hVar3).e();
                            }
                        }
                    });
                }
            }
        });
    }

    public void l(int i2, int i3) {
        Object obj = j1.a;
        j<e.g.a.c.f> jVar = this.f7993d;
        Objects.requireNonNull(jVar);
        if (i2 < 0 || i3 < 0 || i2 >= jVar.f7991f.size() || i3 >= jVar.f7991f.size()) {
            return;
        }
        int i4 = jVar.f7987b + 1;
        jVar.f7987b = i4;
        List<e.g.a.c.f> list = jVar.f7991f;
        if (list == null || i2 >= list.size() || i3 >= list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(i3, arrayList.remove(i2));
        if (jVar.f7987b == i4) {
            jVar.f7989d = arrayList;
            jVar.f7991f = Collections.unmodifiableList(arrayList);
            jVar.f7992g.a(i2, i3);
            jVar.a(list, null);
        }
    }
}
