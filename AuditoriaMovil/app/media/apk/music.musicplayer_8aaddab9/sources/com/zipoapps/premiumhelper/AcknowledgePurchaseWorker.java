package com.zipoapps.premiumhelper;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import h.m.d;
import h.m.i.a.c;
import h.m.i.a.e;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class AcknowledgePurchaseWorker extends CoroutineWorker {

    @e(c = "com.zipoapps.premiumhelper.AcknowledgePurchaseWorker", f = "AcknowledgePurchaseWorker.kt", l = {29}, m = "doWork")
    /* loaded from: classes2.dex */
    public static final class a extends c {
        public /* synthetic */ Object a;

        /* renamed from: c  reason: collision with root package name */
        public int f4895c;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.f4895c |= Level.ALL_INT;
            return AcknowledgePurchaseWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcknowledgePurchaseWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j.e(workerParameters, "params");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(h.m.d<? super androidx.work.ListenableWorker.a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zipoapps.premiumhelper.AcknowledgePurchaseWorker.a
            if (r0 == 0) goto L13
            r0 = r5
            com.zipoapps.premiumhelper.AcknowledgePurchaseWorker$a r0 = (com.zipoapps.premiumhelper.AcknowledgePurchaseWorker.a) r0
            int r1 = r0.f4895c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4895c = r1
            goto L18
        L13:
            com.zipoapps.premiumhelper.AcknowledgePurchaseWorker$a r0 = new com.zipoapps.premiumhelper.AcknowledgePurchaseWorker$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f4895c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.j.d.w.E0(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            e.j.d.w.E0(r5)
            e.j.d.k$a r5 = e.j.d.k.a
            e.j.d.k r5 = r5.a()
            e.j.d.c0.i r5 = r5.r
            r0.f4895c = r3
            h.r.f<java.lang.Object>[] r2 = e.j.d.c0.i.a
            r2 = 0
            java.lang.Object r5 = r5.h(r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            androidx.work.ListenableWorker$a$c r5 = new androidx.work.ListenableWorker$a$c
            r5.<init>()
            java.lang.String r0 = "success()"
            h.o.c.j.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.AcknowledgePurchaseWorker.doWork(h.m.d):java.lang.Object");
    }
}
