package com.amazon.aps.iva.r4;

import android.content.BroadcastReceiver;
import java.util.concurrent.CancellationException;
/* compiled from: CoroutineBroadcastReceiver.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.CoroutineBroadcastReceiverKt$goAsync$1", f = "CoroutineBroadcastReceiver.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> j;
    public final /* synthetic */ com.amazon.aps.iva.se0.g0 k;
    public final /* synthetic */ BroadcastReceiver.PendingResult l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.se0.g0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar, com.amazon.aps.iva.se0.g0 g0Var, BroadcastReceiver.PendingResult pendingResult, com.amazon.aps.iva.ob0.d<? super m> dVar) {
        super(2, dVar);
        this.j = pVar;
        this.k = g0Var;
        this.l = pendingResult;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        m mVar = new m(this.j, this.k, this.l, dVar);
        mVar.i = obj;
        return mVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((m) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        BroadcastReceiver.PendingResult pendingResult = this.l;
        com.amazon.aps.iva.se0.g0 g0Var = this.k;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.amazon.aps.iva.se0.g0 g0Var2 = (com.amazon.aps.iva.se0.g0) this.i;
                    com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> pVar = this.j;
                    this.h = 1;
                    if (pVar.invoke(g0Var2, this) == aVar) {
                        return aVar;
                    }
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
            com.amazon.aps.iva.e.z.l(g0Var, null);
            pendingResult.finish();
            return com.amazon.aps.iva.kb0.q.a;
        } catch (Throwable th) {
            pendingResult.finish();
            throw th;
        }
    }
}
