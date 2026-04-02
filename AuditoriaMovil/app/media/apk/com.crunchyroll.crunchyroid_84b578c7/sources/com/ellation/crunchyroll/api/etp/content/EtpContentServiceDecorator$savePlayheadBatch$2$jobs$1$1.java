package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.content.model.SavePlayheadBatchBody;
import kotlin.Metadata;
/* compiled from: EtpContentServiceDecorator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/jf0/a0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator$savePlayheadBatch$2$jobs$1$1", f = "EtpContentServiceDecorator.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EtpContentServiceDecorator$savePlayheadBatch$2$jobs$1$1 extends i implements p<g0, d<? super a0<q>>, Object> {
    final /* synthetic */ SavePlayheadBatchBody $body;
    int label;
    final /* synthetic */ EtpContentServiceDecorator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpContentServiceDecorator$savePlayheadBatch$2$jobs$1$1(EtpContentServiceDecorator etpContentServiceDecorator, SavePlayheadBatchBody savePlayheadBatchBody, d<? super EtpContentServiceDecorator$savePlayheadBatch$2$jobs$1$1> dVar) {
        super(2, dVar);
        this.this$0 = etpContentServiceDecorator;
        this.$body = savePlayheadBatchBody;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new EtpContentServiceDecorator$savePlayheadBatch$2$jobs$1$1(this.this$0, this.$body, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super a0<q>> dVar) {
        return ((EtpContentServiceDecorator$savePlayheadBatch$2$jobs$1$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        EtpContentService etpContentService;
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
            etpContentService = this.this$0.etpContentService;
            SavePlayheadBatchBody savePlayheadBatchBody = this.$body;
            this.label = 1;
            obj = etpContentService.savePlayheadBatch(savePlayheadBatchBody, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
