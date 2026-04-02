package com.crunchyroll.octopussubtitlescomponent.renderrer;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: OctopusSubtitlesView.kt */
@e(c = "com.crunchyroll.octopussubtitlescomponent.renderrer.OctopusSubtitlesView$bindWebView$3$1", f = "OctopusSubtitlesView.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends i implements p<g0, d<? super q>, Object> {
    public int h;
    public final /* synthetic */ OctopusSubtitlesView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OctopusSubtitlesView octopusSubtitlesView, d<? super a> dVar) {
        super(2, dVar);
        this.i = octopusSubtitlesView;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new a(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            this.h = 1;
            if (t.l(5000L, this) == aVar) {
                return aVar;
            }
        }
        int i2 = OctopusSubtitlesView.h;
        this.i.Z();
        return q.a;
    }
}
