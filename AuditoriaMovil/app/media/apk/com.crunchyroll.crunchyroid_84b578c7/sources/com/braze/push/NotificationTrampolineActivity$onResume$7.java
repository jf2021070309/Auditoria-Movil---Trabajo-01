package com.braze.push;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xb0.l;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
/* compiled from: NotificationTrampolineActivity.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.braze.push.NotificationTrampolineActivity$onResume$7", f = "NotificationTrampolineActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationTrampolineActivity$onResume$7 extends i implements l<d<? super q>, Object> {
    int label;
    final /* synthetic */ NotificationTrampolineActivity this$0;

    /* compiled from: NotificationTrampolineActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.braze.push.NotificationTrampolineActivity$onResume$7$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends com.amazon.aps.iva.yb0.l implements a<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            return "Delay complete. Finishing Notification trampoline activity now";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationTrampolineActivity$onResume$7(NotificationTrampolineActivity notificationTrampolineActivity, d<? super NotificationTrampolineActivity$onResume$7> dVar) {
        super(1, dVar);
        this.this$0 = notificationTrampolineActivity;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(d<?> dVar) {
        return new NotificationTrampolineActivity$onResume$7(this.this$0, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(d<? super q> dVar) {
        return ((NotificationTrampolineActivity$onResume$7) create(dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            x.i0(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.this$0, BrazeLogger.Priority.V, (Throwable) null, AnonymousClass1.INSTANCE, 2, (Object) null);
            this.this$0.finish();
            return q.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
