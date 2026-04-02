package com.amazon.aps.iva.r10;

import com.ellation.crunchyroll.model.DurationProviderKt;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.duration.SmallDurationFormatter;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
/* compiled from: HistoryItemMetadata.kt */
/* loaded from: classes2.dex */
public final class z {
    public final com.amazon.aps.iva.mt.l a;
    public final SmallDurationFormatter b;

    public z(com.amazon.aps.iva.mt.m mVar, SmallDurationFormatter smallDurationFormatter) {
        com.amazon.aps.iva.yb0.j.f(smallDurationFormatter, "durationFormatter");
        this.a = mVar;
        this.b = smallDurationFormatter;
    }

    public final y a(l lVar) {
        String formatTimeLeft;
        Panel panel = lVar.a;
        LabelUiModel labelUiModel = LabelUiModelKt.toLabelUiModel(panel, panel.isEpisode());
        long j = lVar.e;
        float durationSecs = ((((float) j) * 100.0f) / ((float) DurationProviderKt.getDurationSecs(panel.getMetadata()))) / 100.0f;
        com.amazon.aps.iva.pe0.a m0 = com.amazon.aps.iva.ab.x.m0(panel.getThumbnails());
        if (lVar.b) {
            formatTimeLeft = null;
        } else {
            formatTimeLeft = this.b.formatTimeLeft(j, DurationProviderKt.getDurationSecs(panel.getMetadata()));
        }
        String str = formatTimeLeft;
        String seasonNumber = panel.getEpisodeMetadata().getSeasonNumber();
        String str2 = "";
        if (seasonNumber == null) {
            seasonNumber = "";
        }
        String episodeNumber = panel.getEpisodeMetadata().getEpisodeNumber();
        if (episodeNumber != null) {
            str2 = episodeNumber;
        }
        String a = this.a.a(seasonNumber, str2);
        if (panel.isEpisode()) {
            return new y(panel.getEpisodeMetadata().getParentTitle(), labelUiModel, m0, durationSecs, str, panel.getTitle(), a, lVar.b, false, 256);
        }
        return new y(panel.getMovieMetadata().getParentTitle(), labelUiModel, m0, durationSecs, str, null, null, lVar.b, true, 96);
    }
}
