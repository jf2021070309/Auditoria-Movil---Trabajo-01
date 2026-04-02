package c.p;

import androidx.lifecycle.LifecycleController;
import c.p.j;
import i.a.g1;
/* JADX INFO: Add missing generic type declarations: [T] */
@h.m.i.a.e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a0<T> extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super T>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2425b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f2426c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j.b f2427d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h.o.b.p<i.a.e0, h.m.d<? super T>, Object> f2428e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(j jVar, j.b bVar, h.o.b.p<? super i.a.e0, ? super h.m.d<? super T>, ? extends Object> pVar, h.m.d<? super a0> dVar) {
        super(2, dVar);
        this.f2426c = jVar;
        this.f2427d = bVar;
        this.f2428e = pVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        a0 a0Var = new a0(this.f2426c, this.f2427d, this.f2428e, dVar);
        a0Var.f2425b = obj;
        return a0Var;
    }

    @Override // h.o.b.p
    public Object i(i.a.e0 e0Var, Object obj) {
        a0 a0Var = new a0(this.f2426c, this.f2427d, this.f2428e, (h.m.d) obj);
        a0Var.f2425b = e0Var;
        return a0Var.invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        LifecycleController lifecycleController;
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            e.j.d.w.E0(obj);
            h.m.f g2 = ((i.a.e0) this.f2425b).g();
            int i3 = g1.T;
            g1 g1Var = (g1) g2.get(g1.a.a);
            if (g1Var == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            z zVar = new z();
            LifecycleController lifecycleController2 = new LifecycleController(this.f2426c, this.f2427d, zVar.f2476b, g1Var);
            try {
                h.o.b.p<i.a.e0, h.m.d<? super T>, Object> pVar = this.f2428e;
                this.f2425b = lifecycleController2;
                this.a = 1;
                obj = e.j.d.w.J0(zVar, pVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                lifecycleController = lifecycleController2;
            } catch (Throwable th) {
                th = th;
                lifecycleController = lifecycleController2;
                lifecycleController.a();
                throw th;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            lifecycleController = (LifecycleController) this.f2425b;
            try {
                e.j.d.w.E0(obj);
            } catch (Throwable th2) {
                th = th2;
                lifecycleController.a();
                throw th;
            }
        }
        lifecycleController.a();
        return obj;
    }
}
