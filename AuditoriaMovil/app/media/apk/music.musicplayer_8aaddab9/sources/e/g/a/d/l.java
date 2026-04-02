package e.g.a.d;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jrt.recyclerview.views.FastScrollRecyclerView;
import e.h.g.l0;
import e.h.g.r0;
import e.h.g.s1;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public abstract class l extends k implements o {

    /* renamed from: c  reason: collision with root package name */
    public boolean f8019c;

    /* renamed from: d  reason: collision with root package name */
    public e.g.a.a.k f8020d;

    /* renamed from: e  reason: collision with root package name */
    public r0 f8021e;

    /* renamed from: f  reason: collision with root package name */
    public int f8022f;

    /* renamed from: g  reason: collision with root package name */
    public FastScrollRecyclerView f8023g;

    /* renamed from: h  reason: collision with root package name */
    public b f8024h;

    /* renamed from: i  reason: collision with root package name */
    public final f.a.e.a f8025i;

    /* loaded from: classes2.dex */
    public class b extends n {
        public b(a aVar) {
        }

        @Override // e.g.a.d.n
        public void a(Object obj) {
            try {
                l.this.A(obj);
            } catch (Throwable th) {
                s1.l(th, true);
            }
        }
    }

    public l() {
        r0 r0Var = new r0();
        r0Var.h();
        this.f8021e = r0Var;
        this.f8022f = -1;
        this.f8025i = new f.a.e.a();
    }

    public abstract void A(Object obj);

    public final void B() {
        b bVar;
        if (isFinishing() || this.f8020d == null || (bVar = this.f8024h) == null) {
            return;
        }
        bVar.b(null);
    }

    public void C(ArrayList<e.g.a.c.f> arrayList, boolean z, int i2, int i3, ArrayList<Integer> arrayList2) {
        if (i3 == -1 && i2 == -1 && !this.f8019c) {
            l0 g2 = l0.g();
            i3 = g2.e(getClass().getName() + "p", -1);
        }
        this.f8019c = true;
        j.I(this, this.f8025i, this, arrayList, z, z(), i2, i3, arrayList2, null);
    }

    @Override // e.g.a.d.o
    public int a(int i2) {
        return this.f8022f;
    }

    @Override // e.g.a.d.o
    public RecyclerView b() {
        return this.f8023g;
    }

    @Override // e.g.a.d.o
    public void f(int i2) {
        this.f8022f = i2;
    }

    @Override // e.g.a.d.o
    public e.g.a.a.m i() {
        return this.f8020d;
    }

    @Override // e.g.a.d.k, c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f8020d = new e.g.a.a.k();
        super.onCreate(bundle);
        this.f8024h = new b(null);
    }

    @Override // c.b.c.l, c.m.b.o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f8025i.dispose();
        FastScrollRecyclerView fastScrollRecyclerView = this.f8023g;
        if (fastScrollRecyclerView != null) {
            fastScrollRecyclerView.setAdapter(null);
            this.f8023g = null;
        }
        b bVar = this.f8024h;
        if (bVar != null) {
            bVar.f8028c = true;
            bVar.a.interrupt();
            this.f8024h = null;
        }
        e.g.a.a.k kVar = this.f8020d;
    }

    @Override // c.m.b.o, android.app.Activity
    public void onPause() {
        super.onPause();
        FastScrollRecyclerView fastScrollRecyclerView = this.f8023g;
        if (fastScrollRecyclerView != null) {
            RecyclerView.m layoutManager = fastScrollRecyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                int X = e.d.b.d.a.X(this, ((LinearLayoutManager) layoutManager).j1(), z());
                l0 g2 = l0.g();
                g2.n(getClass().getName() + "p", X);
            }
        }
    }

    @Override // c.m.b.o, android.app.Activity
    public void onResume() {
        super.onResume();
        B();
    }

    @Override // e.g.a.d.o
    public r0 q() {
        return this.f8021e;
    }

    public abstract int z();
}
