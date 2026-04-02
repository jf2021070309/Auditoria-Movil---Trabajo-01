package com.ellation.crunchyroll.cast.session;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.f0;
import com.amazon.aps.iva.xb0.p;
import kotlin.Metadata;
/* compiled from: SessionManagerProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.cast.session.CastStateListener$notify$1", f = "SessionManagerProviderImpl.kt", l = {118}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CastStateListener$notify$1 extends i implements p<g0, d<? super q>, Object> {
    final /* synthetic */ com.amazon.aps.iva.ye.e $type;
    int label;
    final /* synthetic */ CastStateListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastStateListener$notify$1(CastStateListener castStateListener, com.amazon.aps.iva.ye.e eVar, d<? super CastStateListener$notify$1> dVar) {
        super(2, dVar);
        this.this$0 = castStateListener;
        this.$type = eVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new CastStateListener$notify$1(this.this$0, this.$type, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((CastStateListener$notify$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        f0 f0Var;
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
            f0Var = this.this$0.eventsFlow;
            com.amazon.aps.iva.ye.d dVar = new com.amazon.aps.iva.ye.d(this.$type);
            this.label = 1;
            if (f0Var.a(dVar, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
