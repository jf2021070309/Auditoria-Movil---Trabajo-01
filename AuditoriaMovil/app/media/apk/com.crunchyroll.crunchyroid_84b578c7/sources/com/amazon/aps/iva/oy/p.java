package com.amazon.aps.iva.oy;

import android.app.Activity;
import com.amazon.aps.iva.kb0.q;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.ktx.AppUpdateManagerKtxKt;
import com.google.android.play.core.ktx.AppUpdateResult;
/* compiled from: InAppUpdatesManagerProxy.kt */
/* loaded from: classes2.dex */
public final class p implements e {
    public final com.amazon.aps.iva.xb0.a<Activity> a;
    public final AppUpdateManager b;

    public p(com.amazon.aps.iva.ya0.f fVar, com.amazon.aps.iva.kx.e eVar) {
        this.a = eVar;
        AppUpdateManager create = AppUpdateManagerFactory.create(fVar);
        com.amazon.aps.iva.yb0.j.e(create, "create(context)");
        this.b = create;
    }

    @Override // com.amazon.aps.iva.oy.e
    public final com.amazon.aps.iva.ve0.f<AppUpdateResult> a() {
        return AppUpdateManagerKtxKt.requestUpdateFlow(this.b);
    }

    @Override // com.amazon.aps.iva.oy.e
    public final Object b(com.amazon.aps.iva.ob0.d<? super q> dVar) {
        Object requestCompleteUpdate = AppUpdateManagerKtxKt.requestCompleteUpdate(this.b, dVar);
        if (requestCompleteUpdate == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return requestCompleteUpdate;
        }
        return q.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.amazon.aps.iva.oy.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r6, com.amazon.aps.iva.ob0.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.oy.o
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.oy.o r0 = (com.amazon.aps.iva.oy.o) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            com.amazon.aps.iva.oy.o r0 = new com.amazon.aps.iva.oy.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.l
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.n
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r6 = r0.k
            int r1 = r0.j
            android.app.Activity r2 = r0.i
            com.amazon.aps.iva.oy.p r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L2f
            goto L61
        L2f:
            r7 = move-exception
            goto L68
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.xb0.a<android.app.Activity> r7 = r5.a
            java.lang.Object r7 = r7.invoke()
            r2 = r7
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 != 0) goto L4a
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L4a:
            r7 = 0
            com.google.android.play.core.appupdate.AppUpdateManager r4 = r5.b     // Catch: java.lang.Throwable -> L64
            r0.h = r5     // Catch: java.lang.Throwable -> L64
            r0.i = r2     // Catch: java.lang.Throwable -> L64
            r0.j = r7     // Catch: java.lang.Throwable -> L64
            r0.k = r6     // Catch: java.lang.Throwable -> L64
            r0.n = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = com.google.android.play.core.ktx.AppUpdateManagerKtxKt.requestAppUpdateInfo(r4, r0)     // Catch: java.lang.Throwable -> L64
            if (r0 != r1) goto L5e
            return r1
        L5e:
            r1 = r7
            r7 = r0
            r0 = r5
        L61:
            com.google.android.play.core.appupdate.AppUpdateInfo r7 = (com.google.android.play.core.appupdate.AppUpdateInfo) r7     // Catch: java.lang.Throwable -> L2f
            goto L6c
        L64:
            r0 = move-exception
            r1 = r7
            r7 = r0
            r0 = r5
        L68:
            com.amazon.aps.iva.kb0.k$a r7 = com.amazon.aps.iva.ab.x.H(r7)
        L6c:
            boolean r3 = r7 instanceof com.amazon.aps.iva.kb0.k.a
            if (r3 == 0) goto L71
            r7 = 0
        L71:
            com.google.android.play.core.appupdate.AppUpdateInfo r7 = (com.google.android.play.core.appupdate.AppUpdateInfo) r7
            if (r7 != 0) goto L78
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L78:
            com.google.android.play.core.appupdate.AppUpdateManager r0 = r0.b     // Catch: android.content.IntentSender.SendIntentException -> L88
            com.google.android.play.core.appupdate.AppUpdateOptions$Builder r1 = com.google.android.play.core.appupdate.AppUpdateOptions.newBuilder(r1)     // Catch: android.content.IntentSender.SendIntentException -> L88
            com.google.android.play.core.appupdate.AppUpdateOptions r1 = r1.build()     // Catch: android.content.IntentSender.SendIntentException -> L88
            r0.startUpdateFlowForResult(r7, r2, r1, r6)     // Catch: android.content.IntentSender.SendIntentException -> L88
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L88:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oy.p.c(int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final void d(final h hVar) {
        this.b.registerListener(new InstallStateUpdatedListener() { // from class: com.amazon.aps.iva.oy.n
            @Override // com.google.android.play.core.listener.StateUpdatedListener
            public final void onStateUpdate(InstallState installState) {
                InstallState installState2 = installState;
                com.amazon.aps.iva.xb0.l lVar = hVar;
                com.amazon.aps.iva.yb0.j.f(lVar, "$tmp0");
                com.amazon.aps.iva.yb0.j.f(installState2, "p0");
                lVar.invoke(installState2);
            }
        });
    }
}
