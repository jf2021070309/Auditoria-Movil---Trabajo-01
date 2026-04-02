package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.content.model.SavePlayheadBatchBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: EtpContentServiceDecorator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/jf0/a0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator$savePlayheadBatch$2", f = "EtpContentServiceDecorator.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EtpContentServiceDecorator$savePlayheadBatch$2 extends i implements p<g0, d<? super a0<q>>, Object> {
    final /* synthetic */ SavePlayheadBatchBody $playheadBody;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EtpContentServiceDecorator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpContentServiceDecorator$savePlayheadBatch$2(SavePlayheadBatchBody savePlayheadBatchBody, EtpContentServiceDecorator etpContentServiceDecorator, d<? super EtpContentServiceDecorator$savePlayheadBatch$2> dVar) {
        super(2, dVar);
        this.$playheadBody = savePlayheadBatchBody;
        this.this$0 = etpContentServiceDecorator;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        EtpContentServiceDecorator$savePlayheadBatch$2 etpContentServiceDecorator$savePlayheadBatch$2 = new EtpContentServiceDecorator$savePlayheadBatch$2(this.$playheadBody, this.this$0, dVar);
        etpContentServiceDecorator$savePlayheadBatch$2.L$0 = obj;
        return etpContentServiceDecorator$savePlayheadBatch$2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super a0<q>> dVar) {
        return ((EtpContentServiceDecorator$savePlayheadBatch$2) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        EtpContentServiceConfig etpContentServiceConfig;
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
            g0 g0Var = (g0) this.L$0;
            etpContentServiceConfig = this.this$0.config;
            ArrayList<List> l0 = com.amazon.aps.iva.lb0.x.l0(this.$playheadBody.getBatch().entrySet(), etpContentServiceConfig.getPlayheadsUploadBatchSize());
            EtpContentServiceDecorator etpContentServiceDecorator = this.this$0;
            ArrayList arrayList = new ArrayList(r.Y(l0));
            for (List<Map.Entry> list : l0) {
                ArrayList arrayList2 = new ArrayList(r.Y(list));
                for (Map.Entry entry : list) {
                    arrayList2.add(new j(entry.getKey(), entry.getValue()));
                }
                arrayList.add(com.amazon.aps.iva.se0.i.b(g0Var, null, null, new EtpContentServiceDecorator$savePlayheadBatch$2$jobs$1$1(etpContentServiceDecorator, new SavePlayheadBatchBody(i0.Z(arrayList2)), null), 3));
            }
            this.label = 1;
            obj = com.amazon.aps.iva.se0.d.a(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.lb0.x.t0((List) obj);
    }
}
