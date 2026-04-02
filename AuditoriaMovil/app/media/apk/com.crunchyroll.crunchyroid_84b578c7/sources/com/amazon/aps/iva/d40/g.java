package com.amazon.aps.iva.d40;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.d40.a;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor;
import java.io.IOException;
import java.util.List;
/* compiled from: MaturityRestrictionsViewModel.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.ez.b implements f {
    public final com.amazon.aps.iva.aj.c b;
    public final ChromecastUserStatusInteractor c;
    public final v<com.amazon.aps.iva.d40.a> d;
    public final v<com.amazon.aps.iva.ez.d<q>> e;
    public final v<List<com.amazon.aps.iva.d40.a>> f;

    /* compiled from: MaturityRestrictionsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.settings.maturityrestrictions.MaturityRestrictionsViewModelImpl$updateExtendedMaturityRating$1", f = "MaturityRestrictionsViewModel.kt", l = {38}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.d40.a j;
        public final /* synthetic */ com.amazon.aps.iva.d40.a k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.d40.a aVar, com.amazon.aps.iva.d40.a aVar2, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = aVar;
            this.k = aVar2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            com.amazon.aps.iva.d40.a aVar2 = this.j;
            g gVar = g.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    com.amazon.aps.iva.aj.c cVar = gVar.b;
                    String value = aVar2.getValue();
                    this.h = 1;
                    if (cVar.g0(value, this) == aVar) {
                        return aVar;
                    }
                }
                gVar.d.k(aVar2);
                gVar.c.onMaturityStatusUpdate();
            } catch (IOException unused) {
                gVar.d.k(this.k);
                gVar.e.k(new com.amazon.aps.iva.ez.d<>(q.a));
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.aj.d dVar) {
        super(dVar);
        com.amazon.aps.iva.d40.a aVar;
        ChromecastUserStatusInteractor create = ChromecastUserStatusInteractor.Companion.create();
        j.f(create, "chromecastUserStatusInteractor");
        int i = 0;
        this.b = dVar;
        this.c = create;
        a.C0191a c0191a = com.amazon.aps.iva.d40.a.Companion;
        String C = dVar.C();
        c0191a.getClass();
        com.amazon.aps.iva.d40.a[] values = com.amazon.aps.iva.d40.a.values();
        int length = values.length;
        while (true) {
            if (i < length) {
                aVar = values[i];
                if (j.a(aVar.getValue(), C)) {
                    break;
                }
                i++;
            } else {
                aVar = null;
                break;
            }
        }
        this.d = new v<>(aVar == null ? com.amazon.aps.iva.d40.a.MATURITY_RESTRICTION_16 : aVar);
        this.e = new v<>();
        this.f = new v<>(o.b0(com.amazon.aps.iva.d40.a.values()));
    }

    @Override // com.amazon.aps.iva.d40.f
    public final void F7(com.amazon.aps.iva.d40.a aVar) {
        j.f(aVar, "option");
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(aVar, this.d.d(), null), 3);
    }

    @Override // com.amazon.aps.iva.d40.f
    public final v getExtendedMaturityRating() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.d40.f
    public final v getOptions() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.d40.f
    public final v y8() {
        return this.e;
    }
}
