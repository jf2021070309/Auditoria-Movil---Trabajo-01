package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.Images;
import com.ellation.crunchyroll.model.Movie;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CastData.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"KEY_CAST_MEDIA_CLASS", "", "KEY_CAST_MEDIA_JSON", "KEY_CAST_MEDIA_PLAYHEAD_SEC", "toPlayableAsset", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "Lcom/ellation/crunchyroll/model/Panel;", "cast_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CastDataKt {
    public static final String KEY_CAST_MEDIA_CLASS = "media_class";
    public static final String KEY_CAST_MEDIA_JSON = "media_json";
    public static final String KEY_CAST_MEDIA_PLAYHEAD_SEC = "media_playhead";

    public static final PlayableAsset toPlayableAsset(Panel panel) {
        if (panel.isEpisode()) {
            String id = panel.getId();
            String channelId = panel.getChannelId();
            String title = panel.getTitle();
            String name = t.EPISODE.name();
            String description = panel.getDescription();
            Images images = panel.getImages();
            boolean isMature = panel.isMature();
            boolean isMatureBlocked = panel.isMatureBlocked();
            ExtendedMaturityRating extendedMaturityRating = panel.getExtendedMaturityRating();
            boolean isPremiumOnly = panel.getEpisodeMetadata().isPremiumOnly();
            boolean isAvailableOffline = panel.getEpisodeMetadata().isAvailableOffline();
            Date availableDate = panel.getEpisodeMetadata().getAvailableDate();
            Date freeAvailableDate = panel.getEpisodeMetadata().getFreeAvailableDate();
            Date premiumAvailableDate = panel.getEpisodeMetadata().getPremiumAvailableDate();
            String seasonId = panel.getEpisodeMetadata().getSeasonId();
            String parentId = panel.getEpisodeMetadata().getParentId();
            String seasonNumber = panel.getEpisodeMetadata().getSeasonNumber();
            String seasonTitle = panel.getEpisodeMetadata().getSeasonTitle();
            String parentTitle = panel.getEpisodeMetadata().getParentTitle();
            String episodeNumber = panel.getEpisodeMetadata().getEpisodeNumber();
            String episodeNumber2 = panel.getEpisodeMetadata().getEpisodeNumber();
            t tVar = t.SERIES;
            long durationMs = panel.getEpisodeMetadata().getDurationMs();
            boolean isDubbed = panel.isDubbed();
            boolean isSubbed = panel.isSubbed();
            String streamHref = panel.getStreamHref();
            List<String> contentDescriptors = panel.getContentDescriptors();
            return new Episode(id, channelId, title, name, description, images, isMature, isMatureBlocked, extendedMaturityRating, isPremiumOnly, isAvailableOffline, availableDate, freeAvailableDate, premiumAvailableDate, seasonId, parentId, seasonNumber, seasonTitle, parentTitle, episodeNumber, episodeNumber2, null, null, tVar, durationMs, isDubbed, isSubbed, null, panel.getEpisodeMetadata().getAudioLocale(), null, null, false, panel.getEpisodeMetadata().getVersions(), streamHref, contentDescriptors, -396361728, 0, null);
        }
        return new Movie(panel.getId(), panel.getChannelId(), panel.getTitle(), t.EPISODE.name(), panel.getDescription(), panel.getImages(), panel.isMature(), panel.isMatureBlocked(), panel.getExtendedMaturityRating(), panel.getMovieMetadata().isPremiumOnly(), panel.getMovieMetadata().isAvailableOffline(), panel.getMovieMetadata().getAvailableDate(), panel.getMovieMetadata().getFreeAvailableDate(), panel.getMovieMetadata().getPremiumAvailableDate(), null, panel.getMovieMetadata().getParentId(), null, panel.getMovieMetadata().getVersions(), t.SERIES, panel.getMovieMetadata().getDurationMs(), panel.isDubbed(), panel.isSubbed(), panel.getMovieMetadata().getAudioLocale(), null, null, false, panel.getStreamHref(), panel.getContentDescriptors(), null, 327237632, null);
    }
}
