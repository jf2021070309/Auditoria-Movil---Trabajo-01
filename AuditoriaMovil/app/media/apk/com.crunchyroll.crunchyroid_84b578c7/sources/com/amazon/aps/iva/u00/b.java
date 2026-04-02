package com.amazon.aps.iva.u00;

import android.content.Context;
import com.amazon.aps.iva.lb0.x;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.Movie;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: BulkDownloadActionsMenuFormatter.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final Context a;
    public final com.amazon.aps.iva.tg.a b;

    public b(Context context, com.amazon.aps.iva.tg.a aVar) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(aVar, "seasonFormatter");
        this.a = context;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.u00.a
    public final String a(com.amazon.aps.iva.hg.e eVar) {
        String str;
        String seasonTitle;
        com.amazon.aps.iva.yb0.j.f(eVar, "data");
        com.amazon.aps.iva.hg.g gVar = eVar.c;
        PlayableAsset playableAsset = (PlayableAsset) x.v0(gVar.d);
        if (playableAsset != null) {
            if (playableAsset instanceof Episode) {
                Season season = eVar.b;
                if (season == null || (seasonTitle = this.b.a(season)) == null) {
                    seasonTitle = ((Episode) playableAsset).getSeasonTitle();
                }
                Context context = this.a;
                String quantityString = context.getResources().getQuantityString(R.plurals.season_metadata_episodes, gVar.d.size(), Integer.valueOf(gVar.d.size()));
                com.amazon.aps.iva.yb0.j.e(quantityString, "context.resources.getQua…ize\n                    )");
                str = context.getString(R.string.bulk_sync_menu_series_title_format, seasonTitle, quantityString);
            } else if (!(playableAsset instanceof Movie)) {
                str = "";
            } else {
                str = eVar.a.getTitle();
            }
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
