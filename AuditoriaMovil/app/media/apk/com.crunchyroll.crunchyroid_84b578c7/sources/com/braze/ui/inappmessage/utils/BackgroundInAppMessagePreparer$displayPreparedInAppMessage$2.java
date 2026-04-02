package com.braze.ui.inappmessage.utils;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
/* compiled from: BackgroundInAppMessagePreparer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2", f = "BackgroundInAppMessagePreparer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2 extends i implements p<g0, d<? super q>, Object> {
    final /* synthetic */ IInAppMessage $inAppMessage;
    int label;
    final /* synthetic */ BackgroundInAppMessagePreparer this$0;

    /* compiled from: BackgroundInAppMessagePreparer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements a<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            return "Displaying in-app message.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2(BackgroundInAppMessagePreparer backgroundInAppMessagePreparer, IInAppMessage iInAppMessage, d<? super BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2> dVar) {
        super(2, dVar);
        this.this$0 = backgroundInAppMessagePreparer;
        this.$inAppMessage = iInAppMessage;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2(this.this$0, this.$inAppMessage, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            x.i0(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.this$0, (BrazeLogger.Priority) null, (Throwable) null, AnonymousClass1.INSTANCE, 3, (Object) null);
            BrazeInAppMessageManager.Companion.getInstance().displayInAppMessage(this.$inAppMessage, false);
            return q.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
