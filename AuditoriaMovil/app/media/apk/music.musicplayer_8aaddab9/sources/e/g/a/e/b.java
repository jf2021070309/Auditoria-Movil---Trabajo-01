package e.g.a.e;

import android.view.View;
import e.g.a.a.m;
import e.g.a.c.f;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public abstract class b<VM extends f> extends e.g.a.e.a<VM> {
    public WeakReference<a> v;
    public WeakReference<m> w;

    /* loaded from: classes2.dex */
    public interface a<VM extends f> {
        void d(b<VM> bVar);

        void g(View view, int i2, int i3, VM vm, b<VM> bVar);

        boolean k(View view, int i2, int i3, VM vm, b<VM> bVar);
    }

    public b(View view, m mVar, a<VM> aVar) {
        super(view);
        this.v = new WeakReference<>(aVar);
        this.w = new WeakReference<>(mVar);
    }

    public int A() {
        m mVar;
        int g2 = g();
        return (g2 == -1 || (mVar = this.w.get()) == null) ? g2 : mVar.j(this);
    }

    public void B(View view) {
        a aVar = this.v.get();
        if (aVar != null) {
            aVar.g(view, A(), g(), this.u, this);
        }
    }

    public boolean C(View view) {
        a aVar = this.v.get();
        if (aVar != null) {
            return aVar.k(view, A(), g(), this.u, this);
        }
        return false;
    }

    @Override // e.g.a.e.a, e.g.a.e.e
    public void a() {
    }

    @Override // e.g.a.e.a
    public void y(VM vm) {
        this.u = vm;
        z();
    }

    public abstract void z();
}
