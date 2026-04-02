package com.ellation.crunchyroll.model.music;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.LabeledContent;
import com.google.android.gms.cast.MediaTrack;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MusicAsset.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\bX\u0010YR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00038$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001c\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\fR\u0016\u00102\u001a\u0004\u0018\u00010/8$X¤\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u0004\u0018\u00010\u00038$X¤\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0007R\u0016\u00106\u001a\u0004\u0018\u00010\u00198$X¤\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001bR\u0016\u0010:\u001a\u0004\u0018\u0001078$X¤\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010@\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b?\u0010\u0007R\u0011\u0010B\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bA\u0010\u0007R\u0011\u0010D\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bC\u0010\u0007R\u0011\u0010F\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bE\u0010\u0007R\u0011\u0010H\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bG\u0010\u0007R\u0011\u0010I\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010M\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\b8F¢\u0006\u0006\u001a\u0004\bN\u0010\fR\u0011\u0010Q\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bP\u00101R\u0011\u0010S\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bR\u0010\u0007R\u0011\u0010U\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bT\u0010JR\u0011\u0010W\u001a\u0002078F¢\u0006\u0006\u001a\u0004\bV\u00109\u0082\u0001\u0002Z[¨\u0006\\"}, d2 = {"Lcom/ellation/crunchyroll/model/music/MusicAsset;", "Lcom/ellation/crunchyroll/model/LabeledContent;", "Ljava/io/Serializable;", "", "originalAudio", "Ljava/lang/String;", "getOriginalAudio", "()Ljava/lang/String;", "", "availableAudioLocales", "Ljava/util/List;", "getAvailableAudioLocales", "()Ljava/util/List;", "availableSubtitleLocales", "getAvailableSubtitleLocales", "get_id", "_id", "get_title", "_title", "get_description", "_description", "get_copyright", "_copyright", "get_licensor", "_licensor", "", "get_isPremiumOnly", "()Ljava/lang/Boolean;", "_isPremiumOnly", "Lcom/ellation/crunchyroll/model/music/Artist;", "get_artist", "()Lcom/ellation/crunchyroll/model/music/Artist;", "_artist", "", "get_durationMs", "()Ljava/lang/Long;", "_durationMs", "Ljava/util/Date;", "getReleaseDate", "()Ljava/util/Date;", "releaseDate", "Lcom/ellation/crunchyroll/model/music/MusicAvailability;", "getAvailability", "()Lcom/ellation/crunchyroll/model/music/MusicAvailability;", "availability", "get_animeIds", "_animeIds", "Lcom/ellation/crunchyroll/model/music/MusicImages;", "get_images", "()Lcom/ellation/crunchyroll/model/music/MusicImages;", "_images", "get_displayArtistName", "_displayArtistName", "get_displayArtistNameRequired", "_displayArtistNameRequired", "Lcom/ellation/crunchyroll/model/music/Artists;", "get_artists", "()Lcom/ellation/crunchyroll/model/music/Artists;", "_artists", "Lcom/amazon/aps/iva/x50/t;", "getType", "()Lcom/amazon/aps/iva/x50/t;", "type", "getId", "id", "getTitle", "title", "getDescription", MediaTrack.ROLE_DESCRIPTION, "getCopyright", "copyright", "getLicensor", "licensor", "isPremiumOnly", "()Z", "getDurationMs", "()J", "durationMs", "getAnimeIds", "animeIds", "getImages", "images", "getDisplayArtistName", "displayArtistName", "getDisplayArtistNameRequired", "displayArtistNameRequired", "getArtists", "artists", "<init>", "()V", "Lcom/ellation/crunchyroll/model/music/MusicConcert;", "Lcom/ellation/crunchyroll/model/music/MusicVideo;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class MusicAsset implements LabeledContent, Serializable {
    public static final int $stable = 8;
    private final List<String> availableAudioLocales;
    private final List<String> availableSubtitleLocales;
    private final String originalAudio;

    public /* synthetic */ MusicAsset(e eVar) {
        this();
    }

    public final List<String> getAnimeIds() {
        List<String> list = get_animeIds();
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final Artists getArtists() {
        if (get_artists() != null) {
            Artists artists = get_artists();
            j.c(artists);
            if (!artists.getMainArtists().isEmpty()) {
                Artists artists2 = get_artists();
                j.c(artists2);
                return artists2;
            }
        }
        Artist artist = get_artist();
        if (artist == null) {
            artist = new Artist(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }
        return new Artists(f1.J(artist), null, null, 6, null);
    }

    public abstract MusicAvailability getAvailability();

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getAvailableAudioLocales() {
        return this.availableAudioLocales;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getAvailableSubtitleLocales() {
        return this.availableSubtitleLocales;
    }

    public final String getCopyright() {
        String str = get_copyright();
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

    public final String getDisplayArtistName() {
        String str = get_displayArtistName();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final boolean getDisplayArtistNameRequired() {
        Boolean bool = get_displayArtistNameRequired();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final long getDurationMs() {
        Long l = get_durationMs();
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final String getId() {
        String str = get_id();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final MusicImages getImages() {
        MusicImages musicImages = get_images();
        if (musicImages == null) {
            return new MusicImages(null, null, null, 7, null);
        }
        return musicImages;
    }

    public final String getLicensor() {
        String str = get_licensor();
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public String getOriginalAudio() {
        return this.originalAudio;
    }

    public abstract Date getReleaseDate();

    public final String getTitle() {
        String str = get_title();
        if (str == null) {
            return "";
        }
        return str;
    }

    public abstract t getType();

    public abstract List<String> get_animeIds();

    public abstract Artist get_artist();

    public abstract Artists get_artists();

    public abstract String get_copyright();

    public abstract String get_description();

    public abstract String get_displayArtistName();

    public abstract Boolean get_displayArtistNameRequired();

    public abstract Long get_durationMs();

    public abstract String get_id();

    public abstract MusicImages get_images();

    public abstract Boolean get_isPremiumOnly();

    public abstract String get_licensor();

    public abstract String get_title();

    public final boolean isPremiumOnly() {
        Boolean bool = get_isPremiumOnly();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private MusicAsset() {
        z zVar = z.b;
        this.availableAudioLocales = zVar;
        this.availableSubtitleLocales = zVar;
    }
}
