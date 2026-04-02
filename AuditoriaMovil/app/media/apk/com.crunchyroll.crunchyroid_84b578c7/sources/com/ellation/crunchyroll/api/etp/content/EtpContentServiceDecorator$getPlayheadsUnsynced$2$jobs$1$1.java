package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import java.util.List;
import kotlin.Metadata;
/* compiled from: EtpContentServiceDecorator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "Lcom/ellation/crunchyroll/api/etp/content/model/Playhead;", "Lcom/ellation/crunchyroll/api/etp/content/EmptyMeta;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator$getPlayheadsUnsynced$2$jobs$1$1", f = "EtpContentServiceDecorator.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EtpContentServiceDecorator$getPlayheadsUnsynced$2$jobs$1$1 extends i implements p<g0, d<? super ContentApiResponse<Playhead, EmptyMeta>>, Object> {
    final /* synthetic */ List<String> $ids;
    int label;
    final /* synthetic */ EtpContentServiceDecorator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpContentServiceDecorator$getPlayheadsUnsynced$2$jobs$1$1(EtpContentServiceDecorator etpContentServiceDecorator, List<String> list, d<? super EtpContentServiceDecorator$getPlayheadsUnsynced$2$jobs$1$1> dVar) {
        super(2, dVar);
        this.this$0 = etpContentServiceDecorator;
        this.$ids = list;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new EtpContentServiceDecorator$getPlayheadsUnsynced$2$jobs$1$1(this.this$0, this.$ids, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super ContentApiResponse<Playhead, EmptyMeta>> dVar) {
        return ((EtpContentServiceDecorator$getPlayheadsUnsynced$2$jobs$1$1) create(g0Var, dVar)).invokeSuspend(q.a);
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
            String B0 = com.amazon.aps.iva.lb0.x.B0(this.$ids, ",", null, null, null, 62);
            this.label = 1;
            obj = etpContentService.getPlayheadsUnsynced(B0, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
