package com.amazon.aps.iva.y30;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ez.g;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import java.io.IOException;
import java.util.Date;
/* compiled from: SettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class n0 extends com.amazon.aps.iva.ez.b implements l0, com.amazon.aps.iva.rs.q, com.amazon.aps.iva.wg.a {
    public final com.amazon.aps.iva.pm.b b;
    public final com.amazon.aps.iva.jd.a c;
    public final com.amazon.aps.iva.d20.j d;
    public final com.amazon.aps.iva.ql.d e;
    public final com.amazon.aps.iva.ct.j f;
    public final com.amazon.aps.iva.rs.q g;
    public final com.amazon.aps.iva.wg.a h;
    public final androidx.lifecycle.c i;
    public final androidx.lifecycle.c j;
    public final androidx.lifecycle.c k;
    public final androidx.lifecycle.c l;
    public final com.amazon.aps.iva.i5.v<Boolean> m;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<ProfileApiModel>> n;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<AccountApiModel>> o;
    public final com.amazon.aps.iva.i5.v<String> p;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.wg.b> q;
    public final com.amazon.aps.iva.i5.u r;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<Boolean>> s;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> t;

    /* compiled from: SettingsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.settings.SettingsViewModelImpl$reloadUserData$1", f = "SettingsViewModel.kt", l = {107}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public com.amazon.aps.iva.i5.v h;
        public int i;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<AccountApiModel>> vVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            try {
                if (i != 0) {
                    if (i == 1) {
                        vVar = this.h;
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    n0 n0Var = n0.this;
                    AccountApiModel J0 = n0Var.c.J0();
                    com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<AccountApiModel>> vVar2 = n0Var.o;
                    if (J0 != null) {
                        vVar2.k(new g.c(J0, null));
                    }
                    com.amazon.aps.iva.jd.a aVar2 = n0Var.c;
                    this.h = vVar2;
                    this.i = 1;
                    obj = aVar2.v1(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    vVar = vVar2;
                }
                vVar.k(new g.c(obj, null));
            } catch (IOException unused) {
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.settings.SettingsViewModelImpl$reloadUserData$2", f = "SettingsViewModel.kt", l = {114}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            n0 n0Var = n0.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.amazon.aps.iva.pm.b bVar = n0Var.b;
                    this.h = 1;
                    obj = bVar.r1(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                ProfileApiModel profileApiModel = (ProfileApiModel) obj;
                n0Var.n.k(new g.c(profileApiModel, null));
                n0Var.m.k(Boolean.valueOf(n0Var.f.R1()));
                n0Var.p.k(n0Var.b.m(profileApiModel.getAvatar()));
                n0Var.s.k(new g.c(Boolean.valueOf(n0Var.d.F0()), null));
            } catch (IOException unused) {
                n0Var.B1();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.settings.SettingsViewModelImpl$updateClosedCaptionsPreference$1", f = "SettingsViewModel.kt", l = {173}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.j = z;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.ql.d dVar = n0.this.e;
                this.h = 1;
                if (dVar.f(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.settings.SettingsViewModelImpl$updateMatureContentPreference$1", f = "SettingsViewModel.kt", l = {163}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ boolean k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, boolean z2, com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
            this.j = z;
            this.k = z2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            boolean z = this.j;
            n0 n0Var = n0.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.amazon.aps.iva.d20.j jVar = n0Var.d;
                    this.h = 1;
                    if (jVar.s0(z, this) == aVar) {
                        return aVar;
                    }
                }
                n0Var.s.k(new g.c(Boolean.valueOf(z), null));
            } catch (IOException unused) {
                n0Var.s.k(new g.c(Boolean.valueOf(this.k), null));
                n0Var.t.k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.kb0.q.a));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.settings.SettingsViewModelImpl$updatePreferredAudioLanguage$1", f = "SettingsViewModel.kt", l = {150}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new e(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((e) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.ql.d dVar = n0.this.e;
                this.h = 1;
                if (dVar.b(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.settings.SettingsViewModelImpl$updatePreferredSubtitlesLanguage$1", f = "SettingsViewModel.kt", l = {146}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new f(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.ql.d dVar = n0.this.e;
                this.h = 1;
                if (dVar.e(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.settings.SettingsViewModelImpl$updateStreamOverCellular$1", f = "SettingsViewModel.kt", l = {154}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(2, dVar);
            this.j = z;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new g(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((g) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.ql.d dVar = n0.this.e;
                this.h = 1;
                if (dVar.d(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.amazon.aps.iva.pm.b bVar, com.amazon.aps.iva.jd.c cVar, com.amazon.aps.iva.d20.k kVar, com.amazon.aps.iva.ql.g gVar, com.amazon.aps.iva.ql.e eVar, com.amazon.aps.iva.ct.k kVar2, com.amazon.aps.iva.rs.q qVar, com.amazon.aps.iva.wg.a aVar, com.amazon.aps.iva.fz.m mVar) {
        super(bVar, kVar, cVar);
        com.amazon.aps.iva.yb0.j.f(bVar, "userProfileInteractor");
        com.amazon.aps.iva.yb0.j.f(qVar, "billingStatusProvider");
        com.amazon.aps.iva.yb0.j.f(aVar, "syncQualityInteractor");
        com.amazon.aps.iva.yb0.j.f(mVar, "notificationsCountMonitor");
        this.b = bVar;
        this.c = cVar;
        this.d = kVar;
        this.e = eVar;
        this.f = kVar2;
        this.g = qVar;
        this.h = aVar;
        this.i = com.amazon.aps.iva.i5.j.b(gVar.b, com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
        this.j = com.amazon.aps.iva.i5.j.b(gVar.a, com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
        this.k = com.amazon.aps.iva.i5.j.b(gVar.e, com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
        this.l = com.amazon.aps.iva.i5.j.b(gVar.f, com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
        this.m = new com.amazon.aps.iva.i5.v<>(Boolean.FALSE);
        this.n = new com.amazon.aps.iva.i5.v<>();
        this.o = new com.amazon.aps.iva.i5.v<>();
        this.p = new com.amazon.aps.iva.i5.v<>();
        this.q = aVar.T();
        this.r = com.amazon.aps.iva.i5.d0.b(mVar.a(), m0.h);
        this.s = new com.amazon.aps.iva.i5.v<>(new g.c(Boolean.valueOf(kVar.F0()), null));
        this.t = new com.amazon.aps.iva.i5.v<>();
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final void B1() {
        com.amazon.aps.iva.pm.b bVar = this.b;
        ProfileApiModel E = bVar.E();
        if (E != null) {
            this.n.k(new g.c(E, null));
            this.p.k(bVar.m(E.getAvatar()));
        }
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final androidx.lifecycle.c C5() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final com.amazon.aps.iva.i5.v E2() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.wg.a
    public final void H2() {
        this.h.H2();
    }

    @Override // com.amazon.aps.iva.y30.l0, com.amazon.aps.iva.wg.a
    public final com.amazon.aps.iva.wg.b J() {
        return this.h.J();
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final androidx.lifecycle.c N4() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final void O(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new f(str, null), 3);
    }

    @Override // com.amazon.aps.iva.rs.q
    public final boolean O0() {
        return this.g.O0();
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final void R6(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new e(str, null), 3);
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final com.amazon.aps.iva.i5.v S6() {
        return this.s;
    }

    @Override // com.amazon.aps.iva.y30.l0, com.amazon.aps.iva.wg.a
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.wg.b> T() {
        return this.q;
    }

    @Override // com.amazon.aps.iva.rs.q
    public final boolean Z6() {
        return this.g.Z6();
    }

    @Override // com.amazon.aps.iva.rs.q
    public final boolean a3() {
        return this.g.a3();
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final void b8(boolean z) {
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new g(z, null), 3);
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final androidx.lifecycle.c d4() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final com.amazon.aps.iva.i5.v getAccount() {
        return this.o;
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final com.amazon.aps.iva.i5.v j0() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final com.amazon.aps.iva.i5.v j3() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final androidx.lifecycle.c l5() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.y30.l0, com.amazon.aps.iva.wg.a
    public final void n0(com.amazon.aps.iva.wg.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "<set-?>");
        this.h.n0(bVar);
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final com.amazon.aps.iva.i5.u p8() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.rs.q
    public final LiveData<Boolean> r2() {
        return this.g.r2();
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final com.amazon.aps.iva.i5.v r3() {
        return this.t;
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final void t5() {
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(null), 3);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new b(null), 3);
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final void v2(boolean z) {
        g.c<Boolean> a2;
        boolean booleanValue;
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<Boolean>> vVar = this.s;
        com.amazon.aps.iva.ez.g<Boolean> d2 = vVar.d();
        if (d2 == null || (a2 = d2.a()) == null || z == (booleanValue = a2.a.booleanValue())) {
            return;
        }
        com.amazon.aps.iva.ez.h.c(vVar, null);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new d(z, booleanValue, null), 3);
    }

    @Override // com.amazon.aps.iva.rs.q
    public final Date v6() {
        return this.g.v6();
    }

    @Override // com.amazon.aps.iva.y30.l0
    public final void y5(boolean z) {
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new c(z, null), 3);
    }
}
