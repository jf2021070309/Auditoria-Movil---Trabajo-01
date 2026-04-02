package com.amazon.aps.iva.v40;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor;
import com.google.ads.AdSize;
import com.google.android.gms.common.Scopes;
import java.io.IOException;
/* compiled from: SignUpViewModel.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.ez.b implements l {
    public final com.amazon.aps.iva.v40.a b;
    public final NotificationSettingsInteractor c;
    public final com.amazon.aps.iva.fe.f d;
    public final com.amazon.aps.iva.wu.a e;
    public final v<Boolean> f;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<q>>> g;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<String>>> h;

    /* compiled from: SignUpViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.signing.signup.SignUpViewModelImpl$fetchDefaultMarketingOptInState$1", f = "SignUpViewModel.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
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
            m mVar = m.this;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                NotificationSettingsInteractor notificationSettingsInteractor = mVar.c;
                this.h = 1;
                obj = notificationSettingsInteractor.getDefaultMarketingOptInState(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            mVar.f.i(Boolean.valueOf(((Boolean) obj).booleanValue()));
            return q.a;
        }
    }

    /* compiled from: SignUpViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.signing.signup.SignUpViewModelImpl$signUp$1", f = "SignUpViewModel.kt", l = {AdSize.PORTRAIT_AD_HEIGHT}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ String j;
        public final /* synthetic */ String k;
        public final /* synthetic */ boolean l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, boolean z, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = str;
            this.k = str2;
            this.l = z;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
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
                    com.amazon.aps.iva.v40.a aVar2 = mVar.b;
                    String str = this.j;
                    String str2 = this.k;
                    boolean z = this.l;
                    this.h = 1;
                    if (aVar2.D0(str, str2, z, this) == aVar) {
                        return aVar;
                    }
                }
                mVar.g.k(new com.amazon.aps.iva.ez.d<>(new g.c(q.a, null)));
            } catch (IOException e) {
                mVar.g.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.amazon.aps.iva.v40.b bVar, NotificationSettingsInteractor notificationSettingsInteractor, com.amazon.aps.iva.fe.g gVar) {
        super(bVar, gVar);
        com.amazon.aps.iva.wu.b bVar2 = com.amazon.aps.iva.wu.b.a;
        this.b = bVar;
        this.c = notificationSettingsInteractor;
        this.d = gVar;
        this.e = bVar2;
        this.f = new v<>();
        this.g = new v<>();
        this.h = new v<>();
    }

    @Override // com.amazon.aps.iva.v40.l
    public final v K8() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.v40.l
    public final void L1(String str, String str2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        com.amazon.aps.iva.yb0.j.f(str2, "password");
        com.amazon.aps.iva.ez.h.d(this.g);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new b(str, str2, z, null), 3);
    }

    @Override // com.amazon.aps.iva.v40.l
    public final v M1() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.v40.l
    public final void T7() {
        com.amazon.aps.iva.se0.i.d(w.D(this), this.e.a(), null, new a(null), 2);
    }

    @Override // com.amazon.aps.iva.v40.l
    public final v<Boolean> X7() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.v40.l
    public final void t6(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "phoneNumber");
        com.amazon.aps.iva.ez.h.d(this.h);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new n(this, str, null), 3);
    }
}
