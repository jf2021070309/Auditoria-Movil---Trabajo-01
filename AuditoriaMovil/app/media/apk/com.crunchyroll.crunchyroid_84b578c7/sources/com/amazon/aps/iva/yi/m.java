package com.amazon.aps.iva.yi;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: OnboardingV2ViewModel.kt */
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.ez.b implements l {
    public final com.amazon.aps.iva.uh.a b;
    public final v<Boolean> c;

    /* compiled from: OnboardingV2ViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.onboarding.OnboardingV2ViewModelImpl$1", f = "OnboardingV2ViewModel.kt", l = {ConnectionResult.API_DISABLED}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object H;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            m mVar = m.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    g0 g0Var = (g0) this.i;
                    com.amazon.aps.iva.uh.a aVar2 = mVar.b;
                    this.h = 1;
                    obj = aVar2.a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                H = Boolean.valueOf(((Boolean) obj).booleanValue());
            } catch (Throwable th) {
                H = x.H(th);
            }
            if (!(H instanceof k.a)) {
                mVar.c.i(Boolean.valueOf(((Boolean) H).booleanValue()));
            }
            if (com.amazon.aps.iva.kb0.k.a(H) != null) {
                mVar.c.i(Boolean.FALSE);
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.amazon.aps.iva.uh.a aVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(aVar, "introductoryOfferProvider");
        this.b = aVar;
        this.c = new v<>();
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.yi.l
    public final v d6() {
        return this.c;
    }
}
