package e.g.a.d;

import android.app.Activity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jrt.recyclerview.os.NPELinearLayoutManager;
import com.jrt.recyclerview.views.FastScrollRecyclerView;
import e.g.a.e.c;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.l0;
import e.h.g.r0;
import e.h.g.s1;
import e.h.g.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class j extends i implements o {

    /* renamed from: c  reason: collision with root package name */
    public c.u.b.o f8004c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8005d;

    /* renamed from: e  reason: collision with root package name */
    public e.g.a.a.k f8006e;

    /* renamed from: f  reason: collision with root package name */
    public r0 f8007f;

    /* renamed from: g  reason: collision with root package name */
    public int f8008g;

    /* renamed from: h  reason: collision with root package name */
    public RecyclerView f8009h;

    /* renamed from: i  reason: collision with root package name */
    public b f8010i;

    /* renamed from: j  reason: collision with root package name */
    public final f.a.e.a f8011j;

    /* loaded from: classes2.dex */
    public class a implements e.g.a.a.h {
        public final /* synthetic */ o a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ List f8012b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f8013c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ r0 f8014d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ List f8015e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e.g.a.a.m f8016f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ e.g.a.a.h f8017g;

        public a(o oVar, List list, RecyclerView recyclerView, r0 r0Var, List list2, e.g.a.a.m mVar, e.g.a.a.h hVar) {
            this.a = oVar;
            this.f8012b = list;
            this.f8013c = recyclerView;
            this.f8014d = r0Var;
            this.f8015e = list2;
            this.f8016f = mVar;
            this.f8017g = hVar;
        }

        @Override // c.u.b.t
        public void a(int i2, int i3) {
        }

        @Override // c.u.b.t
        public void b(int i2, int i3) {
        }

        @Override // c.u.b.t
        public void c(int i2, int i3) {
        }

        @Override // c.u.b.t
        public void d(int i2, int i3, Object obj) {
        }

        public void e() {
            int a = this.a.a(0);
            if (a >= 0 && a < this.f8012b.size() && this.f8013c != null && this.f8014d.c() < 2) {
                int i2 = t1.a;
                this.f8013c.n0(a);
                this.a.f(-1);
            }
            try {
                List<Integer> list = this.f8015e;
                if (list != null) {
                    int i3 = t1.a;
                    for (Integer num : list) {
                        if (num.intValue() >= 0 && num.intValue() < this.f8012b.size()) {
                            Object obj = j1.a;
                            e.g.a.a.m mVar = this.f8016f;
                            mVar.a.d(num.intValue(), 1, null);
                        }
                    }
                }
            } catch (Throwable th) {
                s1.l(th, true);
            }
            e.g.a.a.h hVar = this.f8017g;
            if (hVar != null) {
                int i4 = t1.a;
                ((a) hVar).e();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends n {
        public b(a aVar) {
        }

        @Override // e.g.a.d.n
        public void a(Object obj) {
            try {
                j.this.C(obj);
            } catch (Throwable th) {
                s1.l(th, true);
            }
        }
    }

    public j() {
        r0 r0Var = new r0();
        r0Var.h();
        this.f8007f = r0Var;
        this.f8008g = -1;
        this.f8011j = new f.a.e.a();
    }

    public static void I(Activity activity, f.a.e.a aVar, o oVar, List<e.g.a.c.f> list, boolean z, int i2, int i3, int i4, List<Integer> list2, e.g.a.a.h hVar) {
        if (list != null) {
            list.size();
            int i5 = t1.a;
            int i6 = i4 != -1 ? i4 : i3;
            RecyclerView b2 = oVar.b();
            e.g.a.a.m i7 = oVar.i();
            RecyclerView.m layoutManager = b2.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                int i8 = ((GridLayoutManager) layoutManager).H;
            }
            if (i4 != -1) {
                i6 = e.d.b.d.a.W(activity, i4, i2);
            }
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(list2.size());
                for (Integer num : list2) {
                    arrayList.add(Integer.valueOf(e.d.b.d.a.W(activity, num.intValue(), i2)));
                }
                list2.clear();
                list2.addAll(arrayList);
            }
            if (i7 != null) {
                r0 q = oVar.q();
                if (i6 >= 0) {
                    oVar.f(i6);
                    q.g();
                }
                i7.k(list, z, new a(oVar, list, b2, q, list2, i7, null));
            }
        }
    }

    public abstract int A();

    public void B(e.g.a.c.f fVar, int i2, e.g.a.c.f fVar2, int i3) {
    }

    public abstract void C(Object obj);

    public boolean D() {
        return true;
    }

    public boolean E() {
        return false;
    }

    public final void F(Object obj) {
        b bVar;
        if (isFinishing() || this.f8006e == null || (bVar = this.f8010i) == null) {
            return;
        }
        bVar.b(null);
    }

    public void G(ArrayList<e.g.a.c.f> arrayList, boolean z) {
        H(arrayList, z, -1, -1, null);
    }

    public void H(ArrayList<e.g.a.c.f> arrayList, boolean z, int i2, int i3, ArrayList<Integer> arrayList2) {
        int i4;
        if (i3 == -1 && i2 == -1 && D() && !this.f8005d) {
            l0 g2 = l0.g();
            int e2 = g2.e(getClass().getName() + "p", -1);
            getClass().getCanonicalName();
            int i5 = t1.a;
            i4 = e2;
        } else {
            i4 = i3;
        }
        this.f8005d = true;
        I(this, this.f8011j, this, arrayList, z, z(), i2, i4, arrayList2, null);
    }

    public void J(RecyclerView recyclerView) {
        int A;
        this.f8009h = recyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new NPELinearLayoutManager(this));
        recyclerView.setRecyclerListener(new e.g.a.e.d());
        RecyclerView.e adapter = recyclerView.getAdapter();
        e.g.a.a.k kVar = this.f8006e;
        if (adapter != kVar) {
            recyclerView.setAdapter(kVar);
        }
        if (E()) {
            recyclerView.setItemAnimator(null);
            c.u.b.o oVar = new c.u.b.o(new e.g.a.e.c(this.f8006e, new c.InterfaceC0173c() { // from class: e.g.a.d.b
                @Override // e.g.a.e.c.InterfaceC0173c
                public final void a(final int i2, final int i3) {
                    final j jVar = j.this;
                    Objects.requireNonNull(jVar);
                    j0.h(new j0.c() { // from class: e.g.a.d.a
                        @Override // e.h.g.j0.c
                        public final void a() {
                            j jVar2 = j.this;
                            int i4 = i2;
                            int i5 = i3;
                            e.g.a.a.k kVar2 = jVar2.f8006e;
                            if (kVar2 instanceof e.g.a.a.l) {
                                kVar2.l(i4, i5);
                            }
                        }
                    });
                }
            }, new c.b() { // from class: e.g.a.d.e
                @Override // e.g.a.e.c.b
                public final void a(e.g.a.c.f fVar, int i2, e.g.a.c.f fVar2, int i3) {
                    j jVar = j.this;
                    Objects.requireNonNull(jVar);
                    if ((fVar instanceof e.g.a.c.f) && (fVar2 instanceof e.g.a.c.f)) {
                        jVar.B(fVar, i2, fVar2, i3);
                    }
                }
            }, null));
            this.f8004c = oVar;
            oVar.i(recyclerView);
        } else {
            recyclerView.setItemAnimator(new m());
        }
        if (!(recyclerView instanceof FastScrollRecyclerView) || (A = A()) == -1) {
            return;
        }
        FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) recyclerView;
        fastScrollRecyclerView.setPopupBgColor(A);
        fastScrollRecyclerView.setThumbColor(A);
        fastScrollRecyclerView.setThumbInactiveColor(A);
    }

    @Override // e.g.a.d.o
    public int a(int i2) {
        return this.f8008g;
    }

    @Override // e.g.a.d.o
    public RecyclerView b() {
        return this.f8009h;
    }

    @Override // e.g.a.d.o
    public void f(int i2) {
        this.f8008g = i2;
    }

    @Override // e.g.a.d.o
    public e.g.a.a.m i() {
        return this.f8006e;
    }

    @Override // e.g.a.d.i, c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f8006e = new e.g.a.a.k();
        super.onCreate(bundle);
        this.f8010i = new b(null);
    }

    @Override // c.b.c.l, c.m.b.o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RecyclerView recyclerView = this.f8009h;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
            this.f8009h = null;
        }
        b bVar = this.f8010i;
        if (bVar != null) {
            bVar.f8028c = true;
            bVar.a.interrupt();
            this.f8010i = null;
        }
        e.g.a.a.k kVar = this.f8006e;
    }

    @Override // c.m.b.o, android.app.Activity
    public void onPause() {
        RecyclerView recyclerView;
        super.onPause();
        if (!D() || (recyclerView = this.f8009h) == null) {
            return;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            int X = e.d.b.d.a.X(this, ((LinearLayoutManager) layoutManager).j1(), z());
            l0 g2 = l0.g();
            g2.n(getClass().getName() + "p", X);
            getClass().getCanonicalName();
            int i2 = t1.a;
        }
    }

    @Override // c.m.b.o, android.app.Activity
    public void onResume() {
        super.onResume();
        F(null);
    }

    @Override // c.b.c.l, c.m.b.o, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // e.g.a.d.o
    public r0 q() {
        return this.f8007f;
    }

    public abstract int z();
}
