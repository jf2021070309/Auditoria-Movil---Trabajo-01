package com.zipoapps.premiumhelper.toto;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import c.c0.d;
import c.c0.d0.l;
import c.c0.h;
import c.c0.s;
import c.c0.t;
import ch.qos.logback.core.CoreConstants;
import h.o.c.f;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class PostConfigWorker extends CoroutineWorker {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "PostConfigWorker";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final void scheduleNow(Context context) {
            j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            d.a aVar = new d.a();
            aVar.a = s.CONNECTED;
            d dVar = new d(aVar);
            j.d(dVar, "Builder()\n              …\n                .build()");
            t.a aVar2 = new t.a(PostConfigWorker.class);
            aVar2.f1314b.f1515j = dVar;
            t a = aVar2.a();
            j.d(a, "OneTimeWorkRequestBuilde…\n                .build()");
            l.c(context).b(PostConfigWorker.TAG, h.REPLACE, a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostConfigWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j.e(workerParameters, "params");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(h.m.d<? super androidx.work.ListenableWorker.a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zipoapps.premiumhelper.toto.PostConfigWorker$doWork$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zipoapps.premiumhelper.toto.PostConfigWorker$doWork$1 r0 = (com.zipoapps.premiumhelper.toto.PostConfigWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.zipoapps.premiumhelper.toto.PostConfigWorker$doWork$1 r0 = new com.zipoapps.premiumhelper.toto.PostConfigWorker$doWork$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.j.d.w.E0(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            e.j.d.w.E0(r5)
            e.j.d.k$a r5 = e.j.d.k.a
            e.j.d.k r5 = r5.a()
            com.zipoapps.premiumhelper.toto.TotoFeature r5 = r5.q
            r0.label = r3
            java.lang.Object r5 = r5.postConfig(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            e.j.d.c0.a0 r5 = (e.j.d.c0.a0) r5
            boolean r5 = r5 instanceof e.j.d.c0.a0.b
            if (r5 == 0) goto L54
            androidx.work.ListenableWorker$a$b r5 = new androidx.work.ListenableWorker$a$b
            r5.<init>()
            java.lang.String r0 = "{\n            Result.retry()\n        }"
            h.o.c.j.d(r5, r0)
            goto L5e
        L54:
            androidx.work.ListenableWorker$a$c r5 = new androidx.work.ListenableWorker$a$c
            r5.<init>()
            java.lang.String r0 = "{\n            Result.success()\n        }"
            h.o.c.j.d(r5, r0)
        L5e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.PostConfigWorker.doWork(h.m.d):java.lang.Object");
    }
}
