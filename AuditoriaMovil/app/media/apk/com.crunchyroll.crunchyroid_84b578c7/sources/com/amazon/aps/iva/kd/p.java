package com.amazon.aps.iva.kd;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.ellation.crunchyroll.api.AccountPendingRestrictions;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
import java.io.IOException;
/* compiled from: ChangeEmailViewModelImpl.kt */
/* loaded from: classes.dex */
public final class p extends f0 implements o {
    public final d b;
    public final AccountStateProvider c;
    public final com.amazon.aps.iva.bo.f d;
    public final v0 e;
    public final v0 f;
    public final l0 g;
    public final l0 h;

    /* compiled from: ChangeEmailViewModelImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.account.changeemail.ChangeEmailViewModelImpl$onCustomerSupportClick$1", f = "ChangeEmailViewModelImpl.kt", l = {83}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
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
                p pVar = p.this;
                l0 l0Var = pVar.g;
                AccountApiModel m0 = pVar.d.m0();
                String str = (m0 == null || (str = m0.getEmail()) == null) ? "" : "";
                this.h = 1;
                if (l0Var.a(str, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* compiled from: ChangeEmailViewModelImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.account.changeemail.ChangeEmailViewModelImpl$sendRequest$1", f = "ChangeEmailViewModelImpl.kt", l = {71, 72, 77}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ m i;
        public final /* synthetic */ p j;
        public final /* synthetic */ com.amazon.aps.iva.ld.b k;
        public final /* synthetic */ com.amazon.aps.iva.ld.b l;

        /* compiled from: ChangeEmailViewModelImpl.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[m.values().length];
                try {
                    iArr[m.EMAIL_VERIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[m.EMAIL_UNVERIFIED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m mVar, p pVar, com.amazon.aps.iva.ld.b bVar, com.amazon.aps.iva.ld.b bVar2, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.i = mVar;
            this.j = pVar;
            this.k = bVar;
            this.l = bVar2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.i, this.j, this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            p pVar = this.j;
            try {
            } catch (IOException unused) {
                pVar.f.setValue(this.l);
                l0 l0Var = pVar.h;
                com.amazon.aps.iva.bt.c cVar = com.amazon.aps.iva.bt.c.b;
                this.h = 3;
                if (l0Var.a(cVar, this) == aVar) {
                    return aVar;
                }
            }
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        x.i0(obj);
                        return q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                int i2 = a.a[this.i.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        d dVar = pVar.b;
                        this.h = 2;
                        if (dVar.s1(this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    d dVar2 = pVar.b;
                    this.h = 1;
                    if (dVar2.requestChangeEmail(this) == aVar) {
                        return aVar;
                    }
                }
            }
            pVar.f.setValue(this.k);
            return q.a;
        }
    }

    public p(e eVar, AccountStateProvider accountStateProvider, com.amazon.aps.iva.bo.f fVar) {
        m mVar;
        com.amazon.aps.iva.yb0.j.f(accountStateProvider, "accountStateProvider");
        com.amazon.aps.iva.yb0.j.f(fVar, "userState");
        this.b = eVar;
        this.c = accountStateProvider;
        this.d = fVar;
        v0 e = x.e(new g.b(null));
        this.e = e;
        this.f = x.e(com.amazon.aps.iva.ld.b.DEFAULT);
        this.g = t.g(0, 0, null, 7);
        this.h = t.g(0, 0, null, 7);
        if (accountStateProvider.getPendingRestrictions().contains(AccountPendingRestrictions.VERIFY_EMAIL)) {
            mVar = m.EMAIL_UNVERIFIED;
        } else {
            mVar = m.EMAIL_VERIFIED;
        }
        AccountApiModel m0 = fVar.m0();
        e.setValue(new g.c(new n(mVar, (m0 == null || (r7 = m0.getEmail()) == null) ? "" : ""), null));
    }

    @Override // com.amazon.aps.iva.kd.o
    public final l0 C6() {
        return this.g;
    }

    public final void N8(com.amazon.aps.iva.ld.b bVar) {
        n nVar;
        m mVar;
        g.c a2 = ((com.amazon.aps.iva.ez.g) this.e.getValue()).a();
        if (a2 != null && (nVar = (n) a2.a) != null && (mVar = nVar.a) != null) {
            v0 v0Var = this.f;
            com.amazon.aps.iva.ld.b bVar2 = (com.amazon.aps.iva.ld.b) v0Var.getValue();
            v0Var.setValue(com.amazon.aps.iva.ld.b.LOADING);
            com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new b(mVar, this, bVar, bVar2, null), 3);
        }
    }

    @Override // com.amazon.aps.iva.kd.o
    public final void Q5() {
        N8(com.amazon.aps.iva.ld.b.REQUEST_RESENT);
    }

    @Override // com.amazon.aps.iva.kd.o
    public final void X5() {
        N8(com.amazon.aps.iva.ld.b.REQUEST_SENT);
    }

    @Override // com.amazon.aps.iva.kd.o
    public final l0 b4() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.kd.o
    public final u0 getState() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.kd.o
    public final void t() {
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.kd.o
    public final v0 y4() {
        return this.f;
    }
}
