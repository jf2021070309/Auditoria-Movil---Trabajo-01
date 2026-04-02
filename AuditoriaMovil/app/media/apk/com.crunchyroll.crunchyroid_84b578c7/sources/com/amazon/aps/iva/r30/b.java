package com.amazon.aps.iva.r30;

import android.content.Context;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.DurationProviderKt;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.Series;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
/* compiled from: ContainerMetadataFormatter.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.r30.a {
    public final Context a;
    public final DurationFormatter b;

    /* compiled from: ContainerMetadataFormatter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.SERIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.MOVIE_LISTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public b(Context context, DurationFormatter durationFormatter) {
        j.f(context, "context");
        this.a = context;
        this.b = durationFormatter;
    }

    @Override // com.amazon.aps.iva.r30.a
    public final String a(Panel panel) {
        j.f(panel, "panel");
        int i = a.a[panel.getResourceType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return this.b.formatDuration(DurationProviderKt.getDurationSecs(panel.getMovieListingMetadata()));
        }
        Context context = this.a;
        String quantityString = context.getResources().getQuantityString(R.plurals.season_metadata_seasons, panel.getSeriesMetadata().getSeasonCount(), Integer.valueOf(panel.getSeriesMetadata().getSeasonCount()));
        j.e(quantityString, "context.resources.getQua…ata.seasonCount\n        )");
        String quantityString2 = context.getResources().getQuantityString(R.plurals.season_metadata_episodes, panel.getSeriesMetadata().getEpisodeCount(), Integer.valueOf(panel.getSeriesMetadata().getEpisodeCount()));
        j.e(quantityString2, "context.resources.getQua…ta.episodeCount\n        )");
        String string = context.getString(R.string.container_metadata, quantityString, quantityString2);
        j.e(string, "context.getString(R.stri…adata, seasons, episodes)");
        return string;
    }

    @Override // com.amazon.aps.iva.r30.a
    public final String b(ContentContainer contentContainer) {
        j.f(contentContainer, "contentContainer");
        if (contentContainer instanceof Series) {
            Context context = this.a;
            Series series = (Series) contentContainer;
            String quantityString = context.getResources().getQuantityString(R.plurals.season_metadata_seasons, series.getSeasonCount(), Integer.valueOf(series.getSeasonCount()));
            j.e(quantityString, "context.resources.getQua…onCount\n                )");
            String quantityString2 = context.getResources().getQuantityString(R.plurals.season_metadata_episodes, series.getEpisodeCount(), Integer.valueOf(series.getEpisodeCount()));
            j.e(quantityString2, "context.resources.getQua…deCount\n                )");
            String string = context.getString(R.string.container_metadata, quantityString, quantityString2);
            j.e(string, "{\n                val se…, episodes)\n            }");
            return string;
        }
        return "";
    }
}
