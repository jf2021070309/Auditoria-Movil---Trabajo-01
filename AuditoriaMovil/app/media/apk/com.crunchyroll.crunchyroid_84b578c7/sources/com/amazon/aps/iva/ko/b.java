package com.amazon.aps.iva.ko;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.co.c;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.i5.u;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import java.io.IOException;
import java.util.List;
/* compiled from: UserMigrationViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.ez.b implements com.amazon.aps.iva.ko.a, com.amazon.aps.iva.ct.i {
    public final com.amazon.aps.iva.ct.l b;
    public final com.amazon.aps.iva.co.k c;
    public final i d;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<WatchDataStatus>>> e;
    public final u f;

    /* compiled from: UserMigrationViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.usermigration.welcome.UserMigrationViewModelImpl$loadBenefits$1", f = "UserMigrationViewModel.kt", l = {62}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                com.amazon.aps.iva.ct.l lVar = b.this.b;
                this.h = 1;
                if (lVar.b(this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UserMigrationViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.usermigration.welcome.UserMigrationViewModelImpl$migrateWatchData$1", f = "UserMigrationViewModel.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.ko.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0450b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public WatchDataStatus h;
        public int i;
        public final /* synthetic */ com.amazon.aps.iva.co.c j;
        public final /* synthetic */ b k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0450b(com.amazon.aps.iva.co.c cVar, b bVar, com.amazon.aps.iva.ob0.d<? super C0450b> dVar) {
            super(2, dVar);
            this.j = cVar;
            this.k = bVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new C0450b(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((C0450b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            WatchDataStatus watchDataStatus;
            WatchDataStatus watchDataStatus2;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            b bVar = this.k;
            try {
                if (i != 0) {
                    if (i == 1) {
                        watchDataStatus2 = this.h;
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    com.amazon.aps.iva.co.c cVar = this.j;
                    cVar.getClass();
                    if (cVar instanceof c.a) {
                        watchDataStatus = WatchDataStatus.MERGE;
                    } else if (cVar instanceof c.b) {
                        watchDataStatus = WatchDataStatus.OVERWRITE;
                    } else if (cVar instanceof c.C0182c) {
                        watchDataStatus = WatchDataStatus.SKIP;
                    } else {
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                    i iVar = bVar.d;
                    this.h = watchDataStatus;
                    this.i = 1;
                    if (iVar.migrateWatchData(watchDataStatus, this) == aVar) {
                        return aVar;
                    }
                    watchDataStatus2 = watchDataStatus;
                }
                bVar.e.k(new com.amazon.aps.iva.ez.d<>(new g.c(watchDataStatus2, null)));
            } catch (IOException e) {
                bVar.e.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.ct.l lVar, com.amazon.aps.iva.co.l lVar2, j jVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(lVar, "userBenefitsSynchronizer");
        this.b = lVar;
        this.c = lVar2;
        this.d = jVar;
        this.e = new v<>();
        this.f = d0.c(V3(), new d(this));
    }

    @Override // com.amazon.aps.iva.ko.a
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<WatchDataStatus>>> N7() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ct.i
    public final LiveData<com.amazon.aps.iva.ez.g<List<Benefit>>> V3() {
        return this.b.V3();
    }

    @Override // com.amazon.aps.iva.ko.a
    public final void X3() {
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.ko.a
    public final u o1() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ko.a
    public final void u8(com.amazon.aps.iva.co.c cVar) {
        com.amazon.aps.iva.ez.h.d(this.e);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new C0450b(cVar, this, null), 3);
    }
}
