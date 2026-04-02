package e.j.d.b0.d;

import com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity;
import e.j.d.c0.d0;
import e.j.d.w;
import i.a.e0;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity$startPurchase$1", f = "RelaunchPremiumActivity.kt", l = {288}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super h.k>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RelaunchPremiumActivity f8605b;

    /* loaded from: classes2.dex */
    public static final class a implements i.a.h2.c<d0> {
        public final /* synthetic */ RelaunchPremiumActivity a;

        public a(RelaunchPremiumActivity relaunchPremiumActivity) {
            this.a = relaunchPremiumActivity;
        }

        @Override // i.a.h2.c
        public Object b(d0 d0Var, h.m.d<? super h.k> dVar) {
            d0 d0Var2 = d0Var;
            if (w.U(d0Var2.a)) {
                RelaunchPremiumActivity relaunchPremiumActivity = this.a;
                e.j.d.k kVar = relaunchPremiumActivity.f4924k;
                if (kVar == null) {
                    h.o.c.j.k("premiumHelper");
                    throw null;
                }
                e.j.d.b bVar = kVar.f8813j;
                e.j.d.h hVar = relaunchPremiumActivity.f4925l;
                if (hVar == null) {
                    h.o.c.j.k("offer");
                    throw null;
                }
                bVar.l(hVar.a);
                this.a.finish();
            } else {
                n.a.a.b("PremiumHelper").b(h.o.c.j.i("Purchase error ", new Integer(d0Var2.a.a)), new Object[0]);
            }
            return h.k.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(RelaunchPremiumActivity relaunchPremiumActivity, h.m.d<? super v> dVar) {
        super(2, dVar);
        this.f8605b = relaunchPremiumActivity;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new v(this.f8605b, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        return new v(this.f8605b, dVar).invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            w.E0(obj);
            e.j.d.k a2 = e.j.d.k.a.a();
            RelaunchPremiumActivity relaunchPremiumActivity = this.f8605b;
            e.j.d.h hVar = relaunchPremiumActivity.f4925l;
            if (hVar == null) {
                h.o.c.j.k("offer");
                throw null;
            }
            i.a.h2.b<d0> i3 = a2.i(relaunchPremiumActivity, hVar);
            a aVar2 = new a(this.f8605b);
            this.a = 1;
            if (i3.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.E0(obj);
        }
        return h.k.a;
    }
}
