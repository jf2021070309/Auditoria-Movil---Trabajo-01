package com.amazon.aps.iva.mt;

import android.content.Context;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.EpisodeMetadata;
/* compiled from: SeasonAndEpisodeFormatter.kt */
/* loaded from: classes2.dex */
public final class m implements l {
    public final Context b;

    public m(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.b = context;
    }

    @Override // com.amazon.aps.iva.mt.l
    public final String a(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "seasonNumber");
        com.amazon.aps.iva.yb0.j.f(str2, "episodeNumber");
        boolean z = !com.amazon.aps.iva.oe0.m.b0(str);
        Context context = this.b;
        if (z && (!com.amazon.aps.iva.oe0.m.b0(str2))) {
            String string = context.getString(R.string.season_episode_number_format, str, c(str2));
            com.amazon.aps.iva.yb0.j.e(string, "context.getString(\n     …Number)\n                )");
            return string;
        } else if (com.amazon.aps.iva.oe0.m.b0(str) && (!com.amazon.aps.iva.oe0.m.b0(str2))) {
            String string2 = context.getString(R.string.episode_number, c(str2));
            com.amazon.aps.iva.yb0.j.e(string2, "context.getString(R.stri…edEpisode(episodeNumber))");
            return string2;
        } else {
            return "";
        }
    }

    @Override // com.amazon.aps.iva.mt.l
    public final String b(EpisodeMetadata episodeMetadata) {
        com.amazon.aps.iva.yb0.j.f(episodeMetadata, "metadata");
        if (episodeMetadata.getSeasonNumber() != null && episodeMetadata.getEpisodeNumber() != null) {
            String string = this.b.getString(R.string.season_episode_long_format, episodeMetadata.getSeasonNumber(), episodeMetadata.getEpisodeNumber());
            com.amazon.aps.iva.yb0.j.e(string, "{\n            context.ge…r\n            )\n        }");
            return string;
        }
        return "";
    }

    public final String c(String str) {
        if (!Character.isDigit(str.charAt(0))) {
            String string = this.b.getString(R.string.special_episode_format, str);
            com.amazon.aps.iva.yb0.j.e(string, "context.getString(R.stri…de_format, episodeNumber)");
            return string;
        }
        return str;
    }

    @Override // com.amazon.aps.iva.mt.l
    public final String format(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "episodeNumber");
        if (com.amazon.aps.iva.oe0.m.b0(str)) {
            return "";
        }
        return str;
    }
}
