package com.braze.ui.inappmessage.utils;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.se0.t1;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xe0.k;
import com.amazon.aps.iva.ye0.c;
import kotlin.Metadata;
/* compiled from: InAppMessageWebViewClient.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1", f = "InAppMessageWebViewClient.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppMessageWebViewClient$setWebViewClientStateListener$1 extends i implements l<d<? super q>, Object> {
    int label;
    final /* synthetic */ InAppMessageWebViewClient this$0;

    /* compiled from: InAppMessageWebViewClient.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1$1", f = "InAppMessageWebViewClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends i implements p<g0, d<? super q>, Object> {
        int label;
        final /* synthetic */ InAppMessageWebViewClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InAppMessageWebViewClient inAppMessageWebViewClient, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = inAppMessageWebViewClient;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super q> dVar) {
            return ((AnonymousClass1) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                x.i0(obj);
                this.this$0.markPageFinished();
                return q.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageWebViewClient$setWebViewClientStateListener$1(InAppMessageWebViewClient inAppMessageWebViewClient, d<? super InAppMessageWebViewClient$setWebViewClientStateListener$1> dVar) {
        super(1, dVar);
        this.this$0 = inAppMessageWebViewClient;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(d<?> dVar) {
        return new InAppMessageWebViewClient$setWebViewClientStateListener$1(this.this$0, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(d<? super q> dVar) {
        return ((InAppMessageWebViewClient$setWebViewClientStateListener$1) create(dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            c cVar = r0.a;
            t1 t1Var = k.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (com.amazon.aps.iva.se0.i.g(this, t1Var, anonymousClass1) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
