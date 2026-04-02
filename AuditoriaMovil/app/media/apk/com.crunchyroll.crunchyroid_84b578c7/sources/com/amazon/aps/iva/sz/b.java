package com.amazon.aps.iva.sz;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ct.l;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.f20.h;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.m0;
import com.amazon.aps.iva.se0.n0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
import com.ellation.crunchyroll.api.etp.externalparteners.ExternalPartnersService;
import com.ellation.crunchyroll.api.etp.externalparteners.model.VerifyPurchaseResponse;
import com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor;
import java.io.IOException;
/* compiled from: SubscriptionVerifyInteractor.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.a implements h {
    public final String b;
    public final ExternalPartnersService c;
    public final JwtInvalidator d;
    public final l e;
    public final ChromecastUserStatusInteractor f;
    public m0<VerifyPurchaseResponse> g;

    /* compiled from: SubscriptionVerifyInteractor.kt */
    @e(c = "com.ellation.crunchyroll.presentation.billing.SubscriptionVerifyInteractorImpl$verifyPurchase$2", f = "SubscriptionVerifyInteractor.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, d<? super VerifyPurchaseResponse>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ com.amazon.aps.iva.rs.p k;

        /* compiled from: SubscriptionVerifyInteractor.kt */
        @e(c = "com.ellation.crunchyroll.presentation.billing.SubscriptionVerifyInteractorImpl$verifyPurchase$2$1", f = "SubscriptionVerifyInteractor.kt", l = {57}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.sz.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0721a extends i implements p<g0, d<? super VerifyPurchaseResponse>, Object> {
            public int h;
            public final /* synthetic */ b i;
            public final /* synthetic */ com.amazon.aps.iva.rs.p j;

            /* compiled from: SubscriptionVerifyInteractor.kt */
            /* renamed from: com.amazon.aps.iva.sz.b$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0722a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
                public final /* synthetic */ b h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0722a(b bVar) {
                    super(0);
                    this.h = bVar;
                }

                @Override // com.amazon.aps.iva.xb0.a
                public final q invoke() {
                    com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new com.amazon.aps.iva.sz.a(this.h, null));
                    return q.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0721a(b bVar, com.amazon.aps.iva.rs.p pVar, d<? super C0721a> dVar) {
                super(2, dVar);
                this.i = bVar;
                this.j = pVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final d<q> create(Object obj, d<?> dVar) {
                return new C0721a(this.i, this.j, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, d<? super VerifyPurchaseResponse> dVar) {
                return ((C0721a) create(g0Var, dVar)).invokeSuspend(q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                com.amazon.aps.iva.rs.p pVar = this.j;
                b bVar = this.i;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        x.i0(obj);
                        ExternalPartnersService externalPartnersService = bVar.c;
                        this.h = 1;
                        obj = externalPartnersService.verifyPurchase(bVar.b, pVar.b, pVar.d, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    VerifyPurchaseResponse verifyPurchaseResponse = (VerifyPurchaseResponse) obj;
                    bVar.d.onMembershipStatusUpdated(new C0722a(bVar));
                    bVar.f.onSubscriptionStatusUpdate();
                    return verifyPurchaseResponse;
                } catch (IOException e) {
                    throw new com.amazon.aps.iva.f20.a(pVar.b, pVar.c, e);
                }
            }
        }

        /* compiled from: SubscriptionVerifyInteractor.kt */
        /* renamed from: com.amazon.aps.iva.sz.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0723b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
            public final /* synthetic */ b h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0723b(b bVar) {
                super(1);
                this.h = bVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(Throwable th) {
                this.h.g = null;
                return q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.rs.p pVar, d<? super a> dVar) {
            super(2, dVar);
            this.k = pVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            a aVar = new a(this.k, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super VerifyPurchaseResponse> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                b bVar = b.this;
                n0 b = com.amazon.aps.iva.se0.i.b((g0) this.i, null, null, new C0721a(bVar, this.k, null), 3);
                b.s0(new C0723b(bVar));
                bVar.g = b;
                this.h = 1;
                obj = b.K(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            VerifyPurchaseResponse verifyPurchaseResponse = (VerifyPurchaseResponse) obj;
            j.c(verifyPurchaseResponse);
            return verifyPurchaseResponse;
        }
    }

    public b(String str, ExternalPartnersService externalPartnersService, JwtInvalidator jwtInvalidator, l lVar, ChromecastUserStatusInteractor chromecastUserStatusInteractor) {
        this.b = str;
        this.c = externalPartnersService;
        this.d = jwtInvalidator;
        this.e = lVar;
        this.f = chromecastUserStatusInteractor;
    }

    @Override // com.amazon.aps.iva.f20.h
    public final Object A1(com.amazon.aps.iva.rs.p pVar, d<? super VerifyPurchaseResponse> dVar) {
        if (this.g == null) {
            return z.p(new a(pVar, null), dVar);
        }
        throw com.amazon.aps.iva.b30.q.b;
    }
}
