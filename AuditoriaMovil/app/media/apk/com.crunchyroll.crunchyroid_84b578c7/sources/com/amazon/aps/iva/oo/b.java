package com.amazon.aps.iva.oo;

import android.content.Context;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.Episode;
/* compiled from: EpisodeSubtitleFormatter.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final Context a;

    public b(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = context;
    }

    @Override // com.amazon.aps.iva.oo.a
    public final String a(Episode episode) {
        boolean b0 = com.amazon.aps.iva.oe0.m.b0(episode.getTitle());
        Context context = this.a;
        if (b0) {
            String string = context.getString(R.string.watch_page_player_toolbar_subtitle_format, episode.getSeasonNumber(), episode.getEpisodeNumber());
            com.amazon.aps.iva.yb0.j.e(string, "{\n            context.ge…r\n            )\n        }");
            return string;
        }
        String string2 = context.getString(R.string.watch_page_player_toolbar_subtitle_format_expanded, episode.getSeasonNumber(), episode.getEpisodeNumber(), episode.getTitle());
        com.amazon.aps.iva.yb0.j.e(string2, "{\n            context.ge…e\n            )\n        }");
        return string2;
    }
}
