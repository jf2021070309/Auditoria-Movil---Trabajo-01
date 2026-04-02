package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.api.cms.model.Season;
/* compiled from: ShowPageActivity.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class m extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Season, com.amazon.aps.iva.kb0.q> {
    public m(u uVar) {
        super(1, uVar, u.class, "onSeasonSelected", "onSeasonSelected(Lcom/ellation/crunchyroll/api/cms/model/Season;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Season season) {
        Season season2 = season;
        com.amazon.aps.iva.yb0.j.f(season2, "p0");
        ((u) this.receiver).R4(season2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
