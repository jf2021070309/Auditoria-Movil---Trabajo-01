package com.braze.push;

import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.braze.push.BrazePushReceiver;
import kotlin.Metadata;
/* compiled from: BrazePushReceiver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.braze.push.BrazePushReceiver$Companion$handleReceivedIntent$1", f = "BrazePushReceiver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BrazePushReceiver$Companion$handleReceivedIntent$1 extends i implements p<g0, d<? super q>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handleReceivedIntent$1(Context context, Intent intent, d<? super BrazePushReceiver$Companion$handleReceivedIntent$1> dVar) {
        super(2, dVar);
        this.$context = context;
        this.$intent = intent;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new BrazePushReceiver$Companion$handleReceivedIntent$1(this.$context, this.$intent, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((BrazePushReceiver$Companion$handleReceivedIntent$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            x.i0(obj);
            BrazePushReceiver.Companion companion = BrazePushReceiver.Companion;
            Context applicationContext = this.$context.getApplicationContext();
            j.e(applicationContext, "context.applicationContext");
            companion.handlePush(applicationContext, this.$intent);
            return q.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
