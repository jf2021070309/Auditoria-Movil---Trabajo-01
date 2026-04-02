package com.amazon.aps.iva.zh;

import android.content.Context;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.music.artist.ArtistActivity;
import com.ellation.crunchyroll.model.music.Artist;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
/* compiled from: ArtistDurationFormatter.kt */
/* loaded from: classes.dex */
public final class g implements f {
    public final Context a;
    public final DurationFormatter b;

    public g(ArtistActivity artistActivity, DurationFormatter durationFormatter) {
        this.a = artistActivity;
        this.b = durationFormatter;
    }

    @Override // com.amazon.aps.iva.zh.f
    public final String a(Artist artist) {
        String string;
        int size = artist.getVideos().size();
        String str = "";
        DurationFormatter durationFormatter = this.b;
        Context context = this.a;
        if (size == 0) {
            string = "";
        } else {
            String quantityString = context.getResources().getQuantityString(R.plurals.artist_details_music_videos_count, size, Integer.valueOf(size));
            com.amazon.aps.iva.yb0.j.e(quantityString, "context.resources.getQua…osCount\n                )");
            string = context.getString(R.string.artist_details_duration_format, quantityString, durationFormatter.formatDuration(com.amazon.aps.iva.gr.n.x(artist.getTotalVideoDurationMs())));
            com.amazon.aps.iva.yb0.j.e(string, "context.getString(R.stri…_format, count, duration)");
        }
        int size2 = artist.getConcerts().size();
        if (size2 != 0) {
            String quantityString2 = context.getResources().getQuantityString(R.plurals.artist_details_concerts_count, size2, Integer.valueOf(size2));
            com.amazon.aps.iva.yb0.j.e(quantityString2, "context.resources.getQua…rtCount\n                )");
            str = context.getString(R.string.artist_details_duration_format, quantityString2, durationFormatter.formatDuration(com.amazon.aps.iva.gr.n.x(artist.getTotalConcertDurationMs())));
            com.amazon.aps.iva.yb0.j.e(str, "context.getString(R.stri…_format, count, duration)");
        }
        return com.amazon.aps.iva.oe0.q.O0(string + "\n" + str).toString();
    }
}
