package com.crunchyroll.auth;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.be.g;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.auth.AuthActivity;
/* compiled from: AuthActivity.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.auth.AuthActivity$onCreate$1$1$1", f = "AuthActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ m0 i;
    public final /* synthetic */ AuthActivity j;

    /* compiled from: AuthActivity.kt */
    /* renamed from: com.crunchyroll.auth.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0950a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ AuthActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0950a(AuthActivity authActivity) {
            super(0);
            this.h = authActivity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.finish();
            return q.a;
        }
    }

    /* compiled from: AuthActivity.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<String, q> {
        public final /* synthetic */ AuthActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AuthActivity authActivity) {
            super(1);
            this.h = authActivity;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(String str) {
            String str2 = str;
            j.f(str2, "it");
            com.amazon.aps.iva.vd.e eVar = l1.f;
            if (eVar != null) {
                eVar.h().invoke(this.h, str2);
                return q.a;
            }
            j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: AuthActivity.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
        public final /* synthetic */ AuthActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AuthActivity authActivity) {
            super(1);
            this.h = authActivity;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.fs.b bVar) {
            com.amazon.aps.iva.fs.b bVar2 = bVar;
            j.f(bVar2, "it");
            this.h.e.C1(bVar2);
            return q.a;
        }
    }

    /* compiled from: AuthActivity.kt */
    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
        public final /* synthetic */ AuthActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AuthActivity authActivity) {
            super(1);
            this.h = authActivity;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.fs.b bVar) {
            com.amazon.aps.iva.fs.b bVar2 = bVar;
            j.f(bVar2, "it");
            this.h.e.w5(bVar2);
            return q.a;
        }
    }

    /* compiled from: AuthActivity.kt */
    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ AuthActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AuthActivity authActivity) {
            super(0);
            this.h = authActivity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            com.amazon.aps.iva.vd.e eVar = l1.f;
            if (eVar != null) {
                eVar.c().invoke(this.h);
                return q.a;
            }
            j.m("dependencies");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m0 m0Var, AuthActivity authActivity, com.amazon.aps.iva.ob0.d<? super a> dVar) {
        super(2, dVar);
        this.i = m0Var;
        this.j = authActivity;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        a aVar = new a(this.i, this.j, dVar);
        aVar.h = obj;
        return aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        m0 m0Var = this.i;
        AuthActivity.a aVar2 = AuthActivity.f;
        AuthActivity authActivity = this.j;
        authActivity.getClass();
        new g(m0Var, (com.amazon.aps.iva.ui.c) authActivity.b.getValue(authActivity, AuthActivity.g[0]), new C0950a(authActivity), authActivity.c, authActivity.d, new b(authActivity), new c(authActivity), new d(authActivity), new e(authActivity)).a((g0) this.h);
        return q.a;
    }
}
