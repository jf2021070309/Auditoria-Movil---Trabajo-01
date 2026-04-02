package e.j.d;

import android.content.SharedPreferences;
import e.j.d.c0.a0;
import i.a.e0;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.Analytics$checkHistoryPurchases$1", f = "Analytics.kt", l = {237}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super h.k>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.j.d.b f8614b;

    /* loaded from: classes2.dex */
    public static final class a extends h.o.c.k implements h.o.b.l<Boolean, h.k> {
        public final /* synthetic */ e.j.d.b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e.j.d.b bVar) {
            super(1);
            this.a = bVar;
        }

        @Override // h.o.b.l
        public h.k invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            SharedPreferences.Editor edit = this.a.f8526d.a.edit();
            edit.putBoolean("has_history_purchases", booleanValue);
            edit.apply();
            return h.k.a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends h.o.c.k implements h.o.b.l<a0.b, h.k> {
        public final /* synthetic */ e.j.d.b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e.j.d.b bVar) {
            super(1);
            this.a = bVar;
        }

        @Override // h.o.b.l
        public h.k invoke(a0.b bVar) {
            a0.b bVar2 = bVar;
            h.o.c.j.e(bVar2, "it");
            e.j.d.b bVar3 = this.a;
            h.r.f<Object>[] fVarArr = e.j.d.b.a;
            bVar3.c().k(6, bVar2.f8618b, "Failed to update history purchases", new Object[0]);
            return h.k.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e.j.d.b bVar, h.m.d<? super c> dVar) {
        super(2, dVar);
        this.f8614b = bVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new c(this.f8614b, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        return new c(this.f8614b, dVar).invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            w.E0(obj);
            k a2 = k.a.a();
            this.a = 1;
            obj = a2.r.n(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.E0(obj);
        }
        a0 a0Var = (a0) obj;
        w.f0(a0Var, new a(this.f8614b));
        w.d0(a0Var, new b(this.f8614b));
        return h.k.a;
    }
}
