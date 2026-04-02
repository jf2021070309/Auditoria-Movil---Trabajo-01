package com.amazon.aps.iva.sx;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.cms.model.Season;
/* compiled from: WatchScreenDependenciesImpl.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.tg.a, com.amazon.aps.iva.m00.c<Season> {
    public final /* synthetic */ com.amazon.aps.iva.m00.d b;

    public a(Context context) {
        this.b = new com.amazon.aps.iva.m00.d(context);
    }

    @Override // com.amazon.aps.iva.m00.c
    /* renamed from: a */
    public final String f(Season season) {
        j.f(season, "season");
        return this.b.f(season);
    }

    @Override // com.amazon.aps.iva.m00.c
    public final String b(Season season) {
        Season season2 = season;
        j.f(season2, "season");
        return this.b.b(season2);
    }
}
