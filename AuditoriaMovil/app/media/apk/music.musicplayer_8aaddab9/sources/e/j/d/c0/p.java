package e.j.d.c0;

import i.a.j0;
import i.a.k0;
import java.util.Collection;
import java.util.List;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$queryActivePurchases$2", f = "Billing.kt", l = {435, 435}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super List<? extends c>>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f8749b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f8750c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e.a.a.a.c f8751d;

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$queryActivePurchases$2$inapp$1", f = "Billing.kt", l = {433}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super List<? extends c>>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ i f8752b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.c f8753c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, e.a.a.a.c cVar, h.m.d<? super a> dVar) {
            super(2, dVar);
            this.f8752b = iVar;
            this.f8753c = cVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new a(this.f8752b, this.f8753c, dVar);
        }

        @Override // h.o.b.p
        public Object i(i.a.e0 e0Var, h.m.d<? super List<? extends c>> dVar) {
            return new a(this.f8752b, this.f8753c, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                e.j.d.w.E0(obj);
                i iVar = this.f8752b;
                e.a.a.a.c cVar = this.f8753c;
                this.a = 1;
                obj = i.f(iVar, cVar, "inapp", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e.j.d.w.E0(obj);
            }
            return obj;
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$queryActivePurchases$2$subs$1", f = "Billing.kt", l = {434}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super List<? extends c>>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ i f8754b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.c f8755c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, e.a.a.a.c cVar, h.m.d<? super b> dVar) {
            super(2, dVar);
            this.f8754b = iVar;
            this.f8755c = cVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new b(this.f8754b, this.f8755c, dVar);
        }

        @Override // h.o.b.p
        public Object i(i.a.e0 e0Var, h.m.d<? super List<? extends c>> dVar) {
            return new b(this.f8754b, this.f8755c, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                e.j.d.w.E0(obj);
                i iVar = this.f8754b;
                e.a.a.a.c cVar = this.f8755c;
                this.a = 1;
                obj = i.f(iVar, cVar, "subs", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e.j.d.w.E0(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(i iVar, e.a.a.a.c cVar, h.m.d<? super p> dVar) {
        super(2, dVar);
        this.f8750c = iVar;
        this.f8751d = cVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        p pVar = new p(this.f8750c, this.f8751d, dVar);
        pVar.f8749b = obj;
        return pVar;
    }

    @Override // h.o.b.p
    public Object i(i.a.e0 e0Var, h.m.d<? super List<? extends c>> dVar) {
        p pVar = new p(this.f8750c, this.f8751d, dVar);
        pVar.f8749b = e0Var;
        return pVar.invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        j0 i2;
        Collection collection;
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i3 = this.a;
        if (i3 == 0) {
            e.j.d.w.E0(obj);
            i.a.e0 e0Var = (i.a.e0) this.f8749b;
            j0 i4 = e.j.d.w.i(e0Var, null, null, new a(this.f8750c, this.f8751d, null), 3, null);
            i2 = e.j.d.w.i(e0Var, null, null, new b(this.f8750c, this.f8751d, null), 3, null);
            this.f8749b = i2;
            this.a = 1;
            obj = ((k0) i4).d(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i3 != 1) {
            if (i3 == 2) {
                collection = (Collection) this.f8749b;
                e.j.d.w.E0(obj);
                return h.l.c.g(collection, (Iterable) obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i2 = (j0) this.f8749b;
            e.j.d.w.E0(obj);
        }
        Collection collection2 = (Collection) obj;
        this.f8749b = collection2;
        this.a = 2;
        Object y = i2.y(this);
        if (y == aVar) {
            return aVar;
        }
        collection = collection2;
        obj = y;
        return h.l.c.g(collection, (Iterable) obj);
    }
}
