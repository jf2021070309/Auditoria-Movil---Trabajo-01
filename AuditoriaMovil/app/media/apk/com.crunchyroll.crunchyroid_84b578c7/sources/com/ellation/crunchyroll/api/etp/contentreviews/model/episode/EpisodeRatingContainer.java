package com.ellation.crunchyroll.api.etp.contentreviews.model.episode;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: EpisodeRatingContainer.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÂ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRatingContainer;", "Ljava/io/Serializable;", "up", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRatingStats;", "down", "total", "", "_userContentRating", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeContentRating;", "(Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRatingStats;Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRatingStats;JLcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeContentRating;)V", "getDown", "()Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRatingStats;", "getTotal", "()J", "getUp", "userContentRating", "getUserContentRating", "()Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeContentRating;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EpisodeRatingContainer implements Serializable {
    public static final int $stable = 0;
    @SerializedName("rating")
    private final EpisodeContentRating _userContentRating;
    @SerializedName("down")
    private final EpisodeRatingStats down;
    @SerializedName("total")
    private final long total;
    @SerializedName("up")
    private final EpisodeRatingStats up;

    public EpisodeRatingContainer(EpisodeRatingStats episodeRatingStats, EpisodeRatingStats episodeRatingStats2, long j, EpisodeContentRating episodeContentRating) {
        j.f(episodeRatingStats, "up");
        j.f(episodeRatingStats2, "down");
        this.up = episodeRatingStats;
        this.down = episodeRatingStats2;
        this.total = j;
        this._userContentRating = episodeContentRating;
    }

    private final EpisodeContentRating component4() {
        return this._userContentRating;
    }

    public static /* synthetic */ EpisodeRatingContainer copy$default(EpisodeRatingContainer episodeRatingContainer, EpisodeRatingStats episodeRatingStats, EpisodeRatingStats episodeRatingStats2, long j, EpisodeContentRating episodeContentRating, int i, Object obj) {
        if ((i & 1) != 0) {
            episodeRatingStats = episodeRatingContainer.up;
        }
        if ((i & 2) != 0) {
            episodeRatingStats2 = episodeRatingContainer.down;
        }
        EpisodeRatingStats episodeRatingStats3 = episodeRatingStats2;
        if ((i & 4) != 0) {
            j = episodeRatingContainer.total;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            episodeContentRating = episodeRatingContainer._userContentRating;
        }
        return episodeRatingContainer.copy(episodeRatingStats, episodeRatingStats3, j2, episodeContentRating);
    }

    public final EpisodeRatingStats component1() {
        return this.up;
    }

    public final EpisodeRatingStats component2() {
        return this.down;
    }

    public final long component3() {
        return this.total;
    }

    public final EpisodeRatingContainer copy(EpisodeRatingStats episodeRatingStats, EpisodeRatingStats episodeRatingStats2, long j, EpisodeContentRating episodeContentRating) {
        j.f(episodeRatingStats, "up");
        j.f(episodeRatingStats2, "down");
        return new EpisodeRatingContainer(episodeRatingStats, episodeRatingStats2, j, episodeContentRating);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeRatingContainer)) {
            return false;
        }
        EpisodeRatingContainer episodeRatingContainer = (EpisodeRatingContainer) obj;
        if (j.a(this.up, episodeRatingContainer.up) && j.a(this.down, episodeRatingContainer.down) && this.total == episodeRatingContainer.total && this._userContentRating == episodeRatingContainer._userContentRating) {
            return true;
        }
        return false;
    }

    public final EpisodeRatingStats getDown() {
        return this.down;
    }

    public final long getTotal() {
        return this.total;
    }

    public final EpisodeRatingStats getUp() {
        return this.up;
    }

    public final EpisodeContentRating getUserContentRating() {
        EpisodeContentRating episodeContentRating = this._userContentRating;
        if (episodeContentRating == null) {
            return EpisodeContentRating.NONE;
        }
        return episodeContentRating;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.down.hashCode();
        int a = i.a(this.total, (hashCode2 + (this.up.hashCode() * 31)) * 31, 31);
        EpisodeContentRating episodeContentRating = this._userContentRating;
        if (episodeContentRating == null) {
            hashCode = 0;
        } else {
            hashCode = episodeContentRating.hashCode();
        }
        return a + hashCode;
    }

    public String toString() {
        EpisodeRatingStats episodeRatingStats = this.up;
        EpisodeRatingStats episodeRatingStats2 = this.down;
        long j = this.total;
        EpisodeContentRating episodeContentRating = this._userContentRating;
        return "EpisodeRatingContainer(up=" + episodeRatingStats + ", down=" + episodeRatingStats2 + ", total=" + j + ", _userContentRating=" + episodeContentRating + ")";
    }

    public /* synthetic */ EpisodeRatingContainer(EpisodeRatingStats episodeRatingStats, EpisodeRatingStats episodeRatingStats2, long j, EpisodeContentRating episodeContentRating, int i, e eVar) {
        this(episodeRatingStats, episodeRatingStats2, j, (i & 8) != 0 ? null : episodeContentRating);
    }
}
