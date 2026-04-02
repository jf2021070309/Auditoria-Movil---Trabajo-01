package com.amazon.aps.iva.bo;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ct.l;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.xb0.p;
/* compiled from: UserDataInteractorImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.userdata.UserDataInteractorImpl$loadProfileAndSyncBenefits$2", f = "UserDataInteractorImpl.kt", l = {55, 56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ d j;

    /* compiled from: UserDataInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.userdata.UserDataInteractorImpl$loadProfileAndSyncBenefits$2$1", f = "UserDataInteractorImpl.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ d i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, com.amazon.aps.iva.ob0.d<? super a> dVar2) {
            super(2, dVar2);
            this.i = dVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, dVar);
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
                com.amazon.aps.iva.pm.b bVar = this.i.d;
                this.h = 1;
                if (bVar.r1(this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* compiled from: UserDataInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.userdata.UserDataInteractorImpl$loadProfileAndSyncBenefits$2$2", f = "UserDataInteractorImpl.kt", l = {58}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ d i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, com.amazon.aps.iva.ob0.d<? super b> dVar2) {
            super(2, dVar2);
            this.i = dVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
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
                l lVar = this.i.c;
                this.h = 1;
                if (lVar.b(this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* compiled from: UserDataInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.userdata.UserDataInteractorImpl$loadProfileAndSyncBenefits$2$3", f = "UserDataInteractorImpl.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.bo.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0151c extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ d i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0151c(d dVar, com.amazon.aps.iva.ob0.d<? super C0151c> dVar2) {
            super(2, dVar2);
            this.i = dVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new C0151c(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((C0151c) create(g0Var, dVar)).invokeSuspend(q.a);
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
                com.amazon.aps.iva.ve.l lVar = this.i.e;
                this.h = 1;
                if (lVar.b(this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, com.amazon.aps.iva.ob0.d<? super c> dVar2) {
        super(2, dVar2);
        this.j = dVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        c cVar = new c(this.j, dVar);
        cVar.i = obj;
        return cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        g0 g0Var;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        d dVar = this.j;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    x.i0(obj);
                    return q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = (g0) this.i;
            x.i0(obj);
        } else {
            x.i0(obj);
            g0Var = (g0) this.i;
            this.i = g0Var;
            this.h = 1;
            if (d.C(dVar, this) == aVar) {
                return aVar;
            }
        }
        j1[] j1VarArr = {com.amazon.aps.iva.se0.i.d(g0Var, null, null, new a(dVar, null), 3), com.amazon.aps.iva.se0.i.d(g0Var, null, null, new b(dVar, null), 3), com.amazon.aps.iva.se0.i.d(g0Var, null, null, new C0151c(dVar, null), 3)};
        this.i = null;
        this.h = 2;
        if (com.amazon.aps.iva.se0.d.c(j1VarArr, this) == aVar) {
            return aVar;
        }
        return q.a;
    }
}
