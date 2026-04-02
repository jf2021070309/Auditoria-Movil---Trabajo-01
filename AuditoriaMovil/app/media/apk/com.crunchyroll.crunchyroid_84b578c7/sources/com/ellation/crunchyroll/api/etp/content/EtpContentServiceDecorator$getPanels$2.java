package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.model.Panel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: EtpContentServiceDecorator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "Lcom/ellation/crunchyroll/model/Panel;", "Lcom/ellation/crunchyroll/api/etp/content/EmptyMeta;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator$getPanels$2", f = "EtpContentServiceDecorator.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EtpContentServiceDecorator$getPanels$2 extends i implements p<g0, d<? super ContentApiResponse<Panel, EmptyMeta>>, Object> {
    final /* synthetic */ String $fields;
    final /* synthetic */ String $panelIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EtpContentServiceDecorator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpContentServiceDecorator$getPanels$2(String str, EtpContentServiceDecorator etpContentServiceDecorator, String str2, d<? super EtpContentServiceDecorator$getPanels$2> dVar) {
        super(2, dVar);
        this.$panelIds = str;
        this.this$0 = etpContentServiceDecorator;
        this.$fields = str2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        EtpContentServiceDecorator$getPanels$2 etpContentServiceDecorator$getPanels$2 = new EtpContentServiceDecorator$getPanels$2(this.$panelIds, this.this$0, this.$fields, dVar);
        etpContentServiceDecorator$getPanels$2.L$0 = obj;
        return etpContentServiceDecorator$getPanels$2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar) {
        return ((EtpContentServiceDecorator$getPanels$2) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        int i;
        ContentApiResponse.Companion companion;
        a aVar = a.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                companion = (ContentApiResponse.Companion) this.L$0;
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            g0 g0Var = (g0) this.L$0;
            i = this.this$0.chunkSize;
            ArrayList<List> l0 = com.amazon.aps.iva.lb0.x.l0(com.amazon.aps.iva.oe0.q.E0(this.$panelIds, new String[]{","}), i);
            EtpContentServiceDecorator etpContentServiceDecorator = this.this$0;
            String str = this.$fields;
            ArrayList arrayList = new ArrayList(r.Y(l0));
            for (List list : l0) {
                arrayList.add(com.amazon.aps.iva.se0.i.b(g0Var, null, null, new EtpContentServiceDecorator$getPanels$2$jobs$1$1(etpContentServiceDecorator, list, str, null), 3));
            }
            ContentApiResponse.Companion companion2 = ContentApiResponse.Companion;
            this.L$0 = companion2;
            this.label = 1;
            Object a = com.amazon.aps.iva.se0.d.a(arrayList, this);
            if (a == aVar) {
                return aVar;
            }
            companion = companion2;
            obj = a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ContentApiResponse contentApiResponse : (Iterable) obj) {
            t.d0(arrayList2, contentApiResponse.getData());
        }
        return companion.create((List) arrayList2);
    }
}
