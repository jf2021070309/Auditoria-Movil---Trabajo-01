package com.amazon.aps.iva.oy;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.google.android.play.core.ktx.AppUpdateResult;
/* compiled from: InAppUpdatesMonitor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.inappupdates.manager.InAppUpdatesMonitorImpl$1", f = "InAppUpdatesMonitor.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ e i;
    public final /* synthetic */ i j;

    /* compiled from: InAppUpdatesMonitor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.inappupdates.manager.InAppUpdatesMonitorImpl$1$1", f = "InAppUpdatesMonitor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.ve0.g<? super AppUpdateResult>, Throwable, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Throwable h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(com.amazon.aps.iva.ve0.g<? super AppUpdateResult> gVar, Throwable th, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            a aVar = new a(dVar);
            aVar.h = th;
            return aVar.invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            com.amazon.aps.iva.mf0.a.a.m(this.h);
            return q.a;
        }
    }

    /* compiled from: InAppUpdatesMonitor.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ i b;

        public b(i iVar) {
            this.b = iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
            if (r7.getUpdateInfo().isUpdateTypeAllowed(0) != false) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
        @Override // com.amazon.aps.iva.ve0.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r7, com.amazon.aps.iva.ob0.d r8) {
            /*
                r6 = this;
                com.google.android.play.core.ktx.AppUpdateResult r7 = (com.google.android.play.core.ktx.AppUpdateResult) r7
                boolean r8 = r7 instanceof com.google.android.play.core.ktx.AppUpdateResult.Available
                com.amazon.aps.iva.oy.i r0 = r6.b
                if (r8 == 0) goto L66
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.oy.a> r8 = r0.d
                com.google.android.play.core.ktx.AppUpdateResult$Available r7 = (com.google.android.play.core.ktx.AppUpdateResult.Available) r7
                com.google.android.play.core.appupdate.AppUpdateInfo r1 = r7.getUpdateInfo()
                int r1 = r1.availableVersionCode()
                com.google.android.play.core.appupdate.AppUpdateInfo r2 = r7.getUpdateInfo()
                java.lang.Integer r2 = r2.clientVersionStalenessDays()
                r3 = 1
                if (r2 == 0) goto L42
                com.google.android.play.core.appupdate.AppUpdateInfo r2 = r7.getUpdateInfo()
                java.lang.Integer r2 = r2.clientVersionStalenessDays()
                r4 = 0
                if (r2 == 0) goto L2f
                int r2 = r2.intValue()
                goto L30
            L2f:
                r2 = r4
            L30:
                com.amazon.aps.iva.my.a r5 = r0.b
                int r5 = r5.b()
                if (r2 < r5) goto L43
                com.google.android.play.core.appupdate.AppUpdateInfo r2 = r7.getUpdateInfo()
                boolean r2 = r2.isUpdateTypeAllowed(r4)
                if (r2 == 0) goto L43
            L42:
                r4 = r3
            L43:
                com.google.android.play.core.appupdate.AppUpdateInfo r7 = r7.getUpdateInfo()
                int r7 = r7.installStatus()
                if (r7 != r3) goto L50
                com.amazon.aps.iva.oy.a$h r7 = com.amazon.aps.iva.oy.a.h.i
                goto L62
            L50:
                com.amazon.aps.iva.oy.k r7 = r0.c
                boolean r7 = r7.b(r1)
                if (r7 != 0) goto L60
                if (r4 == 0) goto L60
                com.amazon.aps.iva.oy.a$i r7 = new com.amazon.aps.iva.oy.a$i
                r7.<init>(r1)
                goto L62
            L60:
                com.amazon.aps.iva.oy.a$g r7 = com.amazon.aps.iva.oy.a.g.i
            L62:
                r8.k(r7)
                goto L7d
            L66:
                boolean r8 = r7 instanceof com.google.android.play.core.ktx.AppUpdateResult.Downloaded
                if (r8 == 0) goto L72
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.oy.a> r7 = r0.d
                com.amazon.aps.iva.oy.a$b r8 = com.amazon.aps.iva.oy.a.b.i
                r7.k(r8)
                goto L7d
            L72:
                boolean r7 = r7 instanceof com.google.android.play.core.ktx.AppUpdateResult.NotAvailable
                if (r7 == 0) goto L7d
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.oy.a> r7 = r0.d
                com.amazon.aps.iva.oy.a$g r8 = com.amazon.aps.iva.oy.a.g.i
                r7.k(r8)
            L7d:
                com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oy.g.b.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, i iVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(2, dVar);
        this.i = eVar;
        this.j = iVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new g(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((g) create(g0Var, dVar)).invokeSuspend(q.a);
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
            com.amazon.aps.iva.ve0.l lVar = new com.amazon.aps.iva.ve0.l(this.i.a(), new a(null));
            b bVar = new b(this.j);
            this.h = 1;
            if (lVar.c(bVar, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
