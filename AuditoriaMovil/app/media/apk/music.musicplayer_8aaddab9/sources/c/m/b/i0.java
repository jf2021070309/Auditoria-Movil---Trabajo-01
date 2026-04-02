package c.m.b;

import androidx.fragment.app.Fragment;
import c.p.j;
import c.p.n0;
/* loaded from: classes.dex */
public class i0 implements c.w.c, n0 {
    public final c.p.m0 a;

    /* renamed from: b  reason: collision with root package name */
    public c.p.r f2368b = null;

    /* renamed from: c  reason: collision with root package name */
    public c.w.b f2369c = null;

    public i0(Fragment fragment, c.p.m0 m0Var) {
        this.a = m0Var;
    }

    public void a(j.a aVar) {
        c.p.r rVar = this.f2368b;
        rVar.d("handleLifecycleEvent");
        rVar.g(aVar.getTargetState());
    }

    public void b() {
        if (this.f2368b == null) {
            this.f2368b = new c.p.r(this);
            this.f2369c = new c.w.b(this);
        }
    }

    @Override // c.p.p
    public c.p.j getLifecycle() {
        b();
        return this.f2368b;
    }

    @Override // c.w.c
    public c.w.a getSavedStateRegistry() {
        b();
        return this.f2369c.f2831b;
    }

    @Override // c.p.n0
    public c.p.m0 getViewModelStore() {
        b();
        return this.a;
    }
}
