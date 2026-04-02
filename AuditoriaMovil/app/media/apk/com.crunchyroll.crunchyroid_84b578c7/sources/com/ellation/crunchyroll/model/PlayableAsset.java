package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.e;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.google.android.gms.cast.MediaTrack;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PlayableAsset.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\bI\u0010JR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048$X¤\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00048$X¤\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00048$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u001c\u0010&\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010%R\u0014\u0010+\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0006R\u0014\u00103\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0006R\u0014\u00105\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0006R\u0014\u00106\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0016R\u0011\u00108\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b7\u0010\u0006R\u0011\u0010:\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b9\u0010\u0006R\u0011\u0010<\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b;\u0010\u0006R\u0011\u0010>\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b=\u0010\u0006R\u0011\u0010@\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b?\u0010\u0006R\u0011\u0010B\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bA\u0010\u0012R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020C0\"8F¢\u0006\u0006\u001a\u0004\bD\u0010%R\u0019\u0010H\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\bG\u0010%\u0082\u0001\u0002KL¨\u0006M"}, d2 = {"Lcom/ellation/crunchyroll/model/PlayableAsset;", "Ljava/io/Serializable;", "Lcom/ellation/crunchyroll/model/DurationProvider;", "Lcom/ellation/crunchyroll/model/LabeledContent;", "", "get_id", "()Ljava/lang/String;", "_id", "get_channelId", "_channelId", "get_title", "_title", "get_type", "_type", "get_description", "_description", "Lcom/ellation/crunchyroll/model/Images;", "get_images", "()Lcom/ellation/crunchyroll/model/Images;", "_images", "", "isMature", "()Z", "isMatureBlocked", "isPremiumOnly", "isAvailableOffline", "Ljava/util/Date;", "getAvailableDate", "()Ljava/util/Date;", "availableDate", "getFreeAvailableDate", "freeAvailableDate", "getPremiumAvailableDate", "premiumAvailableDate", "", "Lcom/ellation/crunchyroll/model/EpisodeAdBreak;", "getEpisodeAdBreaks", "()Ljava/util/List;", "episodeAdBreaks", "Lcom/ellation/crunchyroll/model/PlayableAssetVersion;", "getVersions", "versions", "getParentId", "parentId", "Lcom/amazon/aps/iva/x50/t;", "getParentType", "()Lcom/amazon/aps/iva/x50/t;", "parentType", "getStreamHref", "streamHref", "getAudioLocale", "audioLocale", "getVariant", "variant", "isOriginal", "getId", "id", "getChannelId", "channelId", "getTitle", "title", "getType", "type", "getDescription", MediaTrack.ROLE_DESCRIPTION, "getImages", "images", "Lcom/ellation/crunchyroll/api/etp/model/Image;", "getThumbnails", "thumbnails", "", "getEpisodeAdBreakOffsetsMs", "episodeAdBreakOffsetsMs", "<init>", "()V", "Lcom/ellation/crunchyroll/model/Episode;", "Lcom/ellation/crunchyroll/model/Movie;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class PlayableAsset implements Serializable, DurationProvider, LabeledContent {
    public static final int $stable = 0;

    public /* synthetic */ PlayableAsset(e eVar) {
        this();
    }

    public abstract String getAudioLocale();

    public abstract Date getAvailableDate();

    public final String getChannelId() {
        String str = get_channelId();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getDescription() {
        String str = get_description();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List<Double> getEpisodeAdBreakOffsetsMs() {
        List<EpisodeAdBreak> episodeAdBreaks = getEpisodeAdBreaks();
        if (episodeAdBreaks != null) {
            List<EpisodeAdBreak> list = episodeAdBreaks;
            ArrayList arrayList = new ArrayList(r.Y(list));
            for (EpisodeAdBreak episodeAdBreak : list) {
                arrayList.add(Double.valueOf(episodeAdBreak.getOffsetMs()));
            }
            return arrayList;
        }
        return null;
    }

    public abstract List<EpisodeAdBreak> getEpisodeAdBreaks();

    public abstract Date getFreeAvailableDate();

    public final String getId() {
        String str = get_id();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final Images getImages() {
        Images images = get_images();
        if (images == null) {
            return new Images(null, null, null, null, 15, null);
        }
        return images;
    }

    public abstract String getParentId();

    public abstract t getParentType();

    public abstract Date getPremiumAvailableDate();

    public abstract String getStreamHref();

    public final List<Image> getThumbnails() {
        return getImages().getThumbnails();
    }

    public final String getTitle() {
        String str = get_title();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getType() {
        String str = get_type();
        if (str == null) {
            return "";
        }
        return str;
    }

    public abstract String getVariant();

    public abstract List<PlayableAssetVersion> getVersions();

    public abstract String get_channelId();

    public abstract String get_description();

    public abstract String get_id();

    public abstract Images get_images();

    public abstract String get_title();

    public abstract String get_type();

    public abstract boolean isAvailableOffline();

    public abstract boolean isMature();

    public abstract boolean isMatureBlocked();

    public abstract boolean isOriginal();

    public abstract boolean isPremiumOnly();

    private PlayableAsset() {
    }
}
