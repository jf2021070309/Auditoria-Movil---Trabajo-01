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
import kotlin.Metadata;
/* compiled from: BackgroundInAppMessagePreparer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1", f = "BackgroundInAppMessagePreparer.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 extends i implements p<g0, d<? super q>, Object> {
    final /* synthetic */ IInAppMessage $inAppMessageToPrepare;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: BackgroundInAppMessagePreparer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements a<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            return "Cannot display the in-app message because the in-app message was null.";
        }
    }

    /* compiled from: BackgroundInAppMessagePreparer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends l implements a<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            return "Caught error while preparing in app message in background";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(IInAppMessage iInAppMessage, d<? super BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1> dVar) {
        super(2, dVar);
        this.$inAppMessageToPrepare = iInAppMessage;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 = new BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(this.$inAppMessageToPrepare, dVar);
        backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.L$0 = obj;
        return backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Exception e;
        IInAppMessage prepareInAppMessage;
        Object obj3 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                obj2 = (g0) this.L$0;
                try {
                    x.i0(obj);
                } catch (Exception e2) {
                    e = e2;
                    BrazeLogger.INSTANCE.brazelog(obj2, BrazeLogger.Priority.E, e, AnonymousClass2.INSTANCE);
                    return q.a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            Object obj4 = (g0) this.L$0;
            try {
                BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = BackgroundInAppMessagePreparer.INSTANCE;
                prepareInAppMessage = backgroundInAppMessagePreparer.prepareInAppMessage(this.$inAppMessageToPrepare);
                if (prepareInAppMessage == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, obj4, BrazeLogger.Priority.W, (Throwable) null, AnonymousClass1.INSTANCE, 2, (Object) null);
                } else {
                    this.L$0 = obj4;
                    this.label = 1;
                    obj4 = backgroundInAppMessagePreparer.displayPreparedInAppMessage(prepareInAppMessage, this);
                    if (obj4 == obj3) {
                        return obj3;
                    }
                }
            } catch (Exception e3) {
                obj2 = obj4;
                e = e3;
                BrazeLogger.INSTANCE.brazelog(obj2, BrazeLogger.Priority.E, e, AnonymousClass2.INSTANCE);
                return q.a;
            }
        }
        return q.a;
    }
}
