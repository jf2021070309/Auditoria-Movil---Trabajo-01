package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.MovieListing;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.Series;
import com.google.android.gms.cast.MediaMetadata;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CastData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastData;", "Ljava/io/Serializable;", "Lcom/amazon/aps/iva/if0/c;", "toJsonObject", "Lcom/ellation/crunchyroll/model/Series;", "series", "Lcom/ellation/crunchyroll/model/Series;", "Lcom/ellation/crunchyroll/model/MovieListing;", "movieListing", "Lcom/ellation/crunchyroll/model/MovieListing;", "Lcom/ellation/crunchyroll/model/ContentContainer;", "getContentContainer", "()Lcom/ellation/crunchyroll/model/ContentContainer;", "contentContainer", "<init>", "(Lcom/ellation/crunchyroll/model/ContentContainer;)V", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastData implements Serializable {
    public static final Companion Companion = new Companion(null);
    @SerializedName("movie_listing")
    private MovieListing movieListing;
    @SerializedName("series")
    private Series series;

    /* compiled from: CastData.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastData$Companion;", "", "()V", "getAssetFromMetadata", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "metadata", "Lcom/google/android/gms/cast/MediaMetadata;", "getPlayheadSecFromMetadata", "", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final PlayableAsset getAssetFromMetadata(MediaMetadata mediaMetadata) {
            Panel panel;
            j.f(mediaMetadata, "metadata");
            String string = mediaMetadata.getString(CastDataKt.KEY_CAST_MEDIA_CLASS);
            String string2 = mediaMetadata.getString(CastDataKt.KEY_CAST_MEDIA_JSON);
            if (t.EPISODE.equalsName(string)) {
                Panel panel2 = (Panel) GsonHolder.getInstance().fromJson(string2, (Class<Object>) Panel.class);
                if (panel2 == null) {
                    return null;
                }
                return CastDataKt.access$toPlayableAsset(panel2);
            } else if (!t.MOVIE.equalsName(string) || (panel = (Panel) GsonHolder.getInstance().fromJson(string2, (Class<Object>) Panel.class)) == null) {
                return null;
            } else {
                return CastDataKt.access$toPlayableAsset(panel);
            }
        }

        public final long getPlayheadSecFromMetadata(MediaMetadata mediaMetadata) {
            j.f(mediaMetadata, "metadata");
            return mediaMetadata.getInt(CastDataKt.KEY_CAST_MEDIA_PLAYHEAD_SEC);
        }
    }

    public CastData(ContentContainer contentContainer) {
        j.f(contentContainer, "contentContainer");
        if (t.SERIES == contentContainer.getResourceType()) {
            this.series = (Series) contentContainer;
        } else {
            this.movieListing = (MovieListing) contentContainer;
        }
    }

    public final ContentContainer getContentContainer() {
        Series series = this.series;
        if (series == null) {
            return this.movieListing;
        }
        return series;
    }

    public final c toJsonObject() {
        return new c(GsonHolder.getInstance().toJson(this));
    }
}
