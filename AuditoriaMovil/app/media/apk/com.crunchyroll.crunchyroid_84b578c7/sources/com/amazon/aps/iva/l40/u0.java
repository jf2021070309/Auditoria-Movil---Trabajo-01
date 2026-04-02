package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.api.cms.model.Season;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class u0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Season, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Season season) {
        Season season2 = season;
        if (season2 != null) {
            v vVar = this.h;
            if (vVar.b) {
                v.q6(vVar).Q7(season2);
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
