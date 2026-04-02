package com.ellation.crunchyroll.api.etp.contentreviews.model;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ContentRatingContainer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÂ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/contentreviews/model/ContentRatingContainer;", "Ljava/io/Serializable;", "oneStar", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/RatingStats;", "twoStars", "threeStars", "fourStars", "fiveStars", "average", "", "total", "", "_userContentRating", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/ContentRating;", "(Lcom/ellation/crunchyroll/api/etp/contentreviews/model/RatingStats;Lcom/ellation/crunchyroll/api/etp/contentreviews/model/RatingStats;Lcom/ellation/crunchyroll/api/etp/contentreviews/model/RatingStats;Lcom/ellation/crunchyroll/api/etp/contentreviews/model/RatingStats;Lcom/ellation/crunchyroll/api/etp/contentreviews/model/RatingStats;FJLcom/ellation/crunchyroll/api/etp/contentreviews/model/ContentRating;)V", "getAverage", "()F", "getFiveStars", "()Lcom/ellation/crunchyroll/api/etp/contentreviews/model/RatingStats;", "getFourStars", "getOneStar", "getThreeStars", "getTotal", "()J", "getTwoStars", "userContentRating", "getUserContentRating", "()Lcom/ellation/crunchyroll/api/etp/contentreviews/model/ContentRating;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContentRatingContainer implements Serializable {
    public static final int $stable = 0;
    @SerializedName("rating")
    private final ContentRating _userContentRating;
    @SerializedName("average")
    private final float average;
    @SerializedName("5s")
    private final RatingStats fiveStars;
    @SerializedName("4s")
    private final RatingStats fourStars;
    @SerializedName("1s")
    private final RatingStats oneStar;
    @SerializedName("3s")
    private final RatingStats threeStars;
    @SerializedName("total")
    private final long total;
    @SerializedName("2s")
    private final RatingStats twoStars;

    public ContentRatingContainer(RatingStats ratingStats, RatingStats ratingStats2, RatingStats ratingStats3, RatingStats ratingStats4, RatingStats ratingStats5, float f, long j, ContentRating contentRating) {
        j.f(ratingStats, "oneStar");
        j.f(ratingStats2, "twoStars");
        j.f(ratingStats3, "threeStars");
        j.f(ratingStats4, "fourStars");
        j.f(ratingStats5, "fiveStars");
        this.oneStar = ratingStats;
        this.twoStars = ratingStats2;
        this.threeStars = ratingStats3;
        this.fourStars = ratingStats4;
        this.fiveStars = ratingStats5;
        this.average = f;
        this.total = j;
        this._userContentRating = contentRating;
    }

    private final ContentRating component8() {
        return this._userContentRating;
    }

    public static /* synthetic */ ContentRatingContainer copy$default(ContentRatingContainer contentRatingContainer, RatingStats ratingStats, RatingStats ratingStats2, RatingStats ratingStats3, RatingStats ratingStats4, RatingStats ratingStats5, float f, long j, ContentRating contentRating, int i, Object obj) {
        RatingStats ratingStats6;
        RatingStats ratingStats7;
        RatingStats ratingStats8;
        RatingStats ratingStats9;
        RatingStats ratingStats10;
        float f2;
        long j2;
        ContentRating contentRating2;
        if ((i & 1) != 0) {
            ratingStats6 = contentRatingContainer.oneStar;
        } else {
            ratingStats6 = ratingStats;
        }
        if ((i & 2) != 0) {
            ratingStats7 = contentRatingContainer.twoStars;
        } else {
            ratingStats7 = ratingStats2;
        }
        if ((i & 4) != 0) {
            ratingStats8 = contentRatingContainer.threeStars;
        } else {
            ratingStats8 = ratingStats3;
        }
        if ((i & 8) != 0) {
            ratingStats9 = contentRatingContainer.fourStars;
        } else {
            ratingStats9 = ratingStats4;
        }
        if ((i & 16) != 0) {
            ratingStats10 = contentRatingContainer.fiveStars;
        } else {
            ratingStats10 = ratingStats5;
        }
        if ((i & 32) != 0) {
            f2 = contentRatingContainer.average;
        } else {
            f2 = f;
        }
        if ((i & 64) != 0) {
            j2 = contentRatingContainer.total;
        } else {
            j2 = j;
        }
        if ((i & 128) != 0) {
            contentRating2 = contentRatingContainer._userContentRating;
        } else {
            contentRating2 = contentRating;
        }
        return contentRatingContainer.copy(ratingStats6, ratingStats7, ratingStats8, ratingStats9, ratingStats10, f2, j2, contentRating2);
    }

    public final RatingStats component1() {
        return this.oneStar;
    }

    public final RatingStats component2() {
        return this.twoStars;
    }

    public final RatingStats component3() {
        return this.threeStars;
    }

    public final RatingStats component4() {
        return this.fourStars;
    }

    public final RatingStats component5() {
        return this.fiveStars;
    }

    public final float component6() {
        return this.average;
    }

    public final long component7() {
        return this.total;
    }

    public final ContentRatingContainer copy(RatingStats ratingStats, RatingStats ratingStats2, RatingStats ratingStats3, RatingStats ratingStats4, RatingStats ratingStats5, float f, long j, ContentRating contentRating) {
        j.f(ratingStats, "oneStar");
        j.f(ratingStats2, "twoStars");
        j.f(ratingStats3, "threeStars");
        j.f(ratingStats4, "fourStars");
        j.f(ratingStats5, "fiveStars");
        return new ContentRatingContainer(ratingStats, ratingStats2, ratingStats3, ratingStats4, ratingStats5, f, j, contentRating);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentRatingContainer)) {
            return false;
        }
        ContentRatingContainer contentRatingContainer = (ContentRatingContainer) obj;
        if (j.a(this.oneStar, contentRatingContainer.oneStar) && j.a(this.twoStars, contentRatingContainer.twoStars) && j.a(this.threeStars, contentRatingContainer.threeStars) && j.a(this.fourStars, contentRatingContainer.fourStars) && j.a(this.fiveStars, contentRatingContainer.fiveStars) && Float.compare(this.average, contentRatingContainer.average) == 0 && this.total == contentRatingContainer.total && this._userContentRating == contentRatingContainer._userContentRating) {
            return true;
        }
        return false;
    }

    public final float getAverage() {
        return this.average;
    }

    public final RatingStats getFiveStars() {
        return this.fiveStars;
    }

    public final RatingStats getFourStars() {
        return this.fourStars;
    }

    public final RatingStats getOneStar() {
        return this.oneStar;
    }

    public final RatingStats getThreeStars() {
        return this.threeStars;
    }

    public final long getTotal() {
        return this.total;
    }

    public final RatingStats getTwoStars() {
        return this.twoStars;
    }

    public final ContentRating getUserContentRating() {
        ContentRating contentRating = this._userContentRating;
        if (contentRating == null) {
            return ContentRating.NONE;
        }
        return contentRating;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.twoStars.hashCode();
        int hashCode3 = this.threeStars.hashCode();
        int hashCode4 = this.fourStars.hashCode();
        int hashCode5 = this.fiveStars.hashCode();
        int a = i.a(this.total, t0.b(this.average, (hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + (this.oneStar.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
        ContentRating contentRating = this._userContentRating;
        if (contentRating == null) {
            hashCode = 0;
        } else {
            hashCode = contentRating.hashCode();
        }
        return a + hashCode;
    }

    public String toString() {
        RatingStats ratingStats = this.oneStar;
        RatingStats ratingStats2 = this.twoStars;
        RatingStats ratingStats3 = this.threeStars;
        RatingStats ratingStats4 = this.fourStars;
        RatingStats ratingStats5 = this.fiveStars;
        float f = this.average;
        long j = this.total;
        ContentRating contentRating = this._userContentRating;
        return "ContentRatingContainer(oneStar=" + ratingStats + ", twoStars=" + ratingStats2 + ", threeStars=" + ratingStats3 + ", fourStars=" + ratingStats4 + ", fiveStars=" + ratingStats5 + ", average=" + f + ", total=" + j + ", _userContentRating=" + contentRating + ")";
    }

    public /* synthetic */ ContentRatingContainer(RatingStats ratingStats, RatingStats ratingStats2, RatingStats ratingStats3, RatingStats ratingStats4, RatingStats ratingStats5, float f, long j, ContentRating contentRating, int i, e eVar) {
        this(ratingStats, ratingStats2, ratingStats3, ratingStats4, ratingStats5, f, j, (i & 128) != 0 ? null : contentRating);
    }
}
