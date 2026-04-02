package com.amazon.aps.iva.zs;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor;
import com.ellation.crunchyroll.api.etp.auth.TokenState;
/* compiled from: SignOutFlowPresenter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<b> {
    public final RefreshTokenMonitor b;

    /* compiled from: SignOutFlowPresenter.kt */
    @e(c = "com.ellation.crunchyroll.application.signout.flow.SignOutFlowPresenterImpl$onCreate$1", f = "SignOutFlowPresenter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.zs.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0929a extends i implements p<TokenState, d<? super q>, Object> {
        public /* synthetic */ Object h;

        public C0929a(d<? super C0929a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            C0929a c0929a = new C0929a(dVar);
            c0929a.h = obj;
            return c0929a;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(TokenState tokenState, d<? super q> dVar) {
            return ((C0929a) create(tokenState, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            TokenState tokenState = (TokenState) this.h;
            boolean z = tokenState instanceof TokenState.TokenRestrictedState;
            a aVar2 = a.this;
            if (z) {
                aVar2.getView().bf(false);
                aVar2.getView().Wb((TokenState.TokenRestrictedState) tokenState);
            } else if (tokenState instanceof TokenState.TokenClearedState) {
                aVar2.getView().bf(false);
            } else if (tokenState instanceof TokenState.TokenInvalidState) {
                aVar2.getView().bf(true);
            }
            return q.a;
        }
    }

    public a(c cVar, RefreshTokenMonitor refreshTokenMonitor) {
        super(cVar, new j[0]);
        this.b = refreshTokenMonitor;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.dg.b.A(x.O(getView()), new a0(this.b.getRefreshTokenState(), new C0929a(null)));
    }
}
