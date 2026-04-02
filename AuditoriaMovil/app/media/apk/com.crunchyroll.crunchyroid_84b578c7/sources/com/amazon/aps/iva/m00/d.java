package com.amazon.aps.iva.m00;

import android.content.Context;
import com.amazon.aps.iva.k.q;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.cms.model.Season;
/* compiled from: SeasonTitleFormatter.kt */
/* loaded from: classes2.dex */
public final class d implements c<Season> {
    public final Context b;

    public d(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.b = context;
    }

    @Override // com.amazon.aps.iva.m00.c
    /* renamed from: a */
    public final String b(Season season) {
        com.amazon.aps.iva.yb0.j.f(season, "season");
        String quantityString = this.b.getResources().getQuantityString(R.plurals.season_metadata_episodes, season.getNumberOfEpisodes(), Integer.valueOf(season.getNumberOfEpisodes()));
        com.amazon.aps.iva.yb0.j.e(quantityString, "context.resources.getQua…umberOfEpisodes\n        )");
        return quantityString;
    }

    @Override // com.amazon.aps.iva.m00.c
    /* renamed from: c */
    public final String f(Season season) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(season, "season");
        String seasonNumber = season.getSeasonNumber();
        String title = season.getTitle();
        if (seasonNumber.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String string = this.b.getString(R.string.season, q.b(seasonNumber, ": ", title));
            com.amazon.aps.iva.yb0.j.e(string, "{\n            context.ge…umber: $title\")\n        }");
            return string;
        }
        return title;
    }
}
