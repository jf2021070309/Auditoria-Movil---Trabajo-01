package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.b1;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.m0;
import com.amazon.aps.iva.se0.n0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
/* compiled from: UserTokenInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwt$1", f = "UserTokenInteractorImpl.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserTokenInteractorImpl$getJwt$1 extends i implements p<g0, d<? super String>, Object> {
    int label;
    final /* synthetic */ UserTokenInteractorImpl this$0;

    /* compiled from: UserTokenInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwt$1$1", f = "UserTokenInteractorImpl.kt", l = {94, MediaError.DetailedErrorCode.MEDIA_NETWORK}, m = "invokeSuspend")
    /* renamed from: com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwt$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends i implements p<g0, d<? super String>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UserTokenInteractorImpl this$0;

        /* compiled from: UserTokenInteractorImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwt$1$1$1", f = "UserTokenInteractorImpl.kt", l = {97}, m = "invokeSuspend")
        /* renamed from: com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwt$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C09581 extends i implements p<g0, d<? super String>, Object> {
            int label;
            final /* synthetic */ UserTokenInteractorImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09581(UserTokenInteractorImpl userTokenInteractorImpl, d<? super C09581> dVar) {
                super(2, dVar);
                this.this$0 = userTokenInteractorImpl;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final d<q> create(Object obj, d<?> dVar) {
                return new C09581(this.this$0, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, d<? super String> dVar) {
                return ((C09581) create(g0Var, dVar)).invokeSuspend(q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    UserTokenInteractorImpl userTokenInteractorImpl = this.this$0;
                    this.label = 1;
                    obj = userTokenInteractorImpl.getJwtSuspend(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserTokenInteractorImpl userTokenInteractorImpl, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = userTokenInteractorImpl;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super String> dVar) {
            return ((AnonymousClass1) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            m0 m0Var;
            m0 m0Var2;
            m0 m0Var3;
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        x.i0(obj);
                        return (String) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
                return (String) obj;
            }
            x.i0(obj);
            g0 g0Var = (g0) this.L$0;
            m0Var = this.this$0.job;
            if (m0Var != null) {
                m0Var3 = this.this$0.job;
                j.c(m0Var3);
                this.label = 1;
                obj = m0Var3.K(this);
                if (obj == aVar) {
                    return aVar;
                }
                return (String) obj;
            }
            UserTokenInteractorImpl userTokenInteractorImpl = this.this$0;
            n0 b = com.amazon.aps.iva.se0.i.b(g0Var, null, null, new C09581(userTokenInteractorImpl, null), 3);
            b.s0(new UserTokenInteractorImpl$getJwt$1$1$2$1(this.this$0));
            userTokenInteractorImpl.job = b;
            m0Var2 = this.this$0.job;
            j.c(m0Var2);
            this.label = 2;
            obj = m0Var2.K(this);
            if (obj == aVar) {
                return aVar;
            }
            return (String) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserTokenInteractorImpl$getJwt$1(UserTokenInteractorImpl userTokenInteractorImpl, d<? super UserTokenInteractorImpl$getJwt$1> dVar) {
        super(2, dVar);
        this.this$0 = userTokenInteractorImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new UserTokenInteractorImpl$getJwt$1(this.this$0, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super String> dVar) {
        return ((UserTokenInteractorImpl$getJwt$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        b1 b1Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            b1Var = this.this$0.worker;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            obj = com.amazon.aps.iva.se0.i.g(this, b1Var, anonymousClass1);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
