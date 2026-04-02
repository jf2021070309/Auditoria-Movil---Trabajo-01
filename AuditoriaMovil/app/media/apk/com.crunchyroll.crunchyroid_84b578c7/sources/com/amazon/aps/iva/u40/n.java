package com.amazon.aps.iva.u40;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.google.android.gms.common.Scopes;
import java.io.IOException;
/* compiled from: SignInViewModel.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.ez.b implements m {
    public final com.ellation.crunchyroll.presentation.signing.signin.f b;
    public final com.amazon.aps.iva.fe.f c;
    public final com.amazon.aps.iva.ho.c d;
    public final com.amazon.aps.iva.xb0.a<Boolean> e;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<k>>> f;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<String>>> g;

    /* compiled from: SignInViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.signing.signin.SignInViewModelImpl$signIn$1", f = "SignInViewModel.kt", l = {40, 45}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ String j;
        public final /* synthetic */ String k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = str;
            this.k = str2;
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
            String str = this.j;
            n nVar = n.this;
            try {
            } catch (IOException e) {
                nVar.f.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        x.i0(obj);
                        nVar.f.k(new com.amazon.aps.iva.ez.d<>(new g.c(k.SIGNED_IN, null)));
                        return q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                com.ellation.crunchyroll.presentation.signing.signin.f fVar = nVar.b;
                String str2 = this.k;
                this.h = 1;
                if (fVar.signIn(str, str2, this) == aVar) {
                    return aVar;
                }
            }
            nVar.d.b(str);
            if (nVar.e.invoke().booleanValue()) {
                nVar.f.k(new com.amazon.aps.iva.ez.d<>(new g.c(k.OWNERSHIP_VERIFICATION, null)));
                return q.a;
            }
            com.ellation.crunchyroll.presentation.signing.signin.f fVar2 = nVar.b;
            this.h = 2;
            if (fVar2.I(str, this) == aVar) {
                return aVar;
            }
            nVar.f.k(new com.amazon.aps.iva.ez.d<>(new g.c(k.SIGNED_IN, null)));
            return q.a;
        }
    }

    /* compiled from: SignInViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.signing.signin.SignInViewModelImpl$signInWithPhoneNumber$1", f = "SignInViewModel.kt", l = {58}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            String str = this.j;
            n nVar = n.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    com.amazon.aps.iva.fe.f fVar = nVar.c;
                    this.h = 1;
                    if (fVar.L1(str, this) == aVar) {
                        return aVar;
                    }
                }
                nVar.g.k(new com.amazon.aps.iva.ez.d<>(new g.c(str, null)));
            } catch (IOException e) {
                nVar.g.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.amazon.aps.iva.u40.b bVar, com.amazon.aps.iva.fe.g gVar, com.amazon.aps.iva.ho.c cVar, com.ellation.crunchyroll.presentation.signing.signin.c cVar2) {
        super(bVar, gVar);
        com.amazon.aps.iva.yb0.j.f(cVar, "userAccountMigrationRouter");
        this.b = bVar;
        this.c = gVar;
        this.d = cVar;
        this.e = cVar2;
        this.f = new v<>();
        this.g = new v<>();
    }

    @Override // com.amazon.aps.iva.u40.m
    public final v B8() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.u40.m
    public final v E() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.u40.m
    public final void S(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        com.amazon.aps.iva.yb0.j.f(str2, "password");
        com.amazon.aps.iva.ez.h.d(this.f);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(str, str2, null), 3);
    }

    @Override // com.amazon.aps.iva.u40.m
    public final void n3(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "phoneNumber");
        com.amazon.aps.iva.ez.h.d(this.g);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new b(str, null), 3);
    }
}
