package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: ShowPageActivity.kt */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.tg.a, com.amazon.aps.iva.m00.c<Season> {
    public final /* synthetic */ com.amazon.aps.iva.m00.d b;

    public i(ShowPageActivity showPageActivity) {
        this.b = new com.amazon.aps.iva.m00.d(showPageActivity);
    }

    @Override // com.amazon.aps.iva.m00.c
    /* renamed from: a */
    public final String f(Season season) {
        com.amazon.aps.iva.yb0.j.f(season, "season");
        return this.b.f(season);
    }

    @Override // com.amazon.aps.iva.m00.c
    public final String b(Season season) {
        Season season2 = season;
        com.amazon.aps.iva.yb0.j.f(season2, "season");
        return this.b.b(season2);
    }
}
