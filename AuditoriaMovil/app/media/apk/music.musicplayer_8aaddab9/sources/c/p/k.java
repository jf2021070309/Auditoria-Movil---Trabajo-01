package c.p;

import c.p.j;
import i.a.g1;
import i.a.o0;
/* loaded from: classes.dex */
public abstract class k implements i.a.e0 {

    @h.m.i.a.e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
        public int a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> f2464c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h.o.b.p<? super i.a.e0, ? super h.m.d<? super h.k>, ? extends Object> pVar, h.m.d<? super a> dVar) {
            super(2, dVar);
            this.f2464c = pVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new a(this.f2464c, dVar);
        }

        @Override // h.o.b.p
        public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
            return new a(this.f2464c, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                e.j.d.w.E0(obj);
                j i3 = k.this.i();
                h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> pVar = this.f2464c;
                this.a = 1;
                j.b bVar = j.b.CREATED;
                i.a.c0 c0Var = o0.a;
                if (e.j.d.w.J0(i.a.i2.l.f9078c.h0(), new a0(i3, bVar, pVar, null), this) == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e.j.d.w.E0(obj);
            }
            return h.k.a;
        }
    }

    public abstract j i();

    public final g1 j(h.o.b.p<? super i.a.e0, ? super h.m.d<? super h.k>, ? extends Object> pVar) {
        h.o.c.j.e(pVar, "block");
        return e.j.d.w.Y(this, null, null, new a(pVar, null), 3, null);
    }
}
