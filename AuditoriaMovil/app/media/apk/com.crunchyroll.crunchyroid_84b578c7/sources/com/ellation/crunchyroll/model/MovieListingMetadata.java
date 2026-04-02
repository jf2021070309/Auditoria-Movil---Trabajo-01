package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PanelMetadata.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÂ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÂ\u0003J}\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u000eHÖ\u0001R\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001cR\u0016\u0010\t\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/ellation/crunchyroll/model/MovieListingMetadata;", "Lcom/ellation/crunchyroll/model/PanelMetadata;", "Lcom/ellation/crunchyroll/model/DurationProvider;", "durationMs", "", "isMature", "", "isMatureBlocked", "isDubbed", "isSubbed", "extendedMaturityRating", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "contentDescriptors", "", "", "_subtitleLocales", "_audioLocales", "(JZZZZLcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "availableAudioLocales", "getAvailableAudioLocales", "()Ljava/util/List;", "availableSubtitleLocales", "getAvailableSubtitleLocales", "getContentDescriptors", "getDurationMs", "()J", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "()Z", "originalAudio", "getOriginalAudio", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MovieListingMetadata extends PanelMetadata implements DurationProvider {
    public static final int $stable = 8;
    @SerializedName("audio_locales")
    private final List<String> _audioLocales;
    @SerializedName("subtitle_locales")
    private final List<String> _subtitleLocales;
    @SerializedName("content_descriptors")
    private final List<String> contentDescriptors;
    @SerializedName("duration_ms")
    private final long durationMs;
    @SerializedName("extended_maturity_rating")
    private final ExtendedMaturityRating extendedMaturityRating;
    @SerializedName("is_dubbed")
    private final boolean isDubbed;
    @SerializedName("is_mature")
    private final boolean isMature;
    @SerializedName("mature_blocked")
    private final boolean isMatureBlocked;
    @SerializedName("is_subbed")
    private final boolean isSubbed;

    public MovieListingMetadata() {
        this(0L, false, false, false, false, null, null, null, null, 511, null);
    }

    private final List<String> component8() {
        return this._subtitleLocales;
    }

    private final List<String> component9() {
        return this._audioLocales;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MovieListingMetadata copy$default(MovieListingMetadata movieListingMetadata, long j, boolean z, boolean z2, boolean z3, boolean z4, ExtendedMaturityRating extendedMaturityRating, List list, List list2, List list3, int i, Object obj) {
        long j2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ExtendedMaturityRating extendedMaturityRating2;
        List<String> list4;
        List<String> list5;
        List<String> list6;
        if ((i & 1) != 0) {
            j2 = movieListingMetadata.durationMs;
        } else {
            j2 = j;
        }
        if ((i & 2) != 0) {
            z5 = movieListingMetadata.isMature;
        } else {
            z5 = z;
        }
        if ((i & 4) != 0) {
            z6 = movieListingMetadata.isMatureBlocked;
        } else {
            z6 = z2;
        }
        if ((i & 8) != 0) {
            z7 = movieListingMetadata.isDubbed;
        } else {
            z7 = z3;
        }
        if ((i & 16) != 0) {
            z8 = movieListingMetadata.isSubbed;
        } else {
            z8 = z4;
        }
        if ((i & 32) != 0) {
            extendedMaturityRating2 = movieListingMetadata.extendedMaturityRating;
        } else {
            extendedMaturityRating2 = extendedMaturityRating;
        }
        if ((i & 64) != 0) {
            list4 = movieListingMetadata.contentDescriptors;
        } else {
            list4 = list;
        }
        if ((i & 128) != 0) {
            list5 = movieListingMetadata._subtitleLocales;
        } else {
            list5 = list2;
        }
        if ((i & 256) != 0) {
            list6 = movieListingMetadata._audioLocales;
        } else {
            list6 = list3;
        }
        return movieListingMetadata.copy(j2, z5, z6, z7, z8, extendedMaturityRating2, list4, list5, list6);
    }

    public final long component1() {
        return this.durationMs;
    }

    public final boolean component2() {
        return this.isMature;
    }

    public final boolean component3() {
        return this.isMatureBlocked;
    }

    public final boolean component4() {
        return this.isDubbed;
    }

    public final boolean component5() {
        return this.isSubbed;
    }

    public final ExtendedMaturityRating component6() {
        return this.extendedMaturityRating;
    }

    public final List<String> component7() {
        return this.contentDescriptors;
    }

    public final MovieListingMetadata copy(long j, boolean z, boolean z2, boolean z3, boolean z4, ExtendedMaturityRating extendedMaturityRating, List<String> list, List<String> list2, List<String> list3) {
        return new MovieListingMetadata(j, z, z2, z3, z4, extendedMaturityRating, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieListingMetadata)) {
            return false;
        }
        MovieListingMetadata movieListingMetadata = (MovieListingMetadata) obj;
        if (this.durationMs == movieListingMetadata.durationMs && this.isMature == movieListingMetadata.isMature && this.isMatureBlocked == movieListingMetadata.isMatureBlocked && this.isDubbed == movieListingMetadata.isDubbed && this.isSubbed == movieListingMetadata.isSubbed && j.a(this.extendedMaturityRating, movieListingMetadata.extendedMaturityRating) && j.a(this.contentDescriptors, movieListingMetadata.contentDescriptors) && j.a(this._subtitleLocales, movieListingMetadata._subtitleLocales) && j.a(this._audioLocales, movieListingMetadata._audioLocales)) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getAvailableAudioLocales() {
        return this._audioLocales;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getAvailableSubtitleLocales() {
        return this._subtitleLocales;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getContentDescriptors() {
        return this.contentDescriptors;
    }

    @Override // com.ellation.crunchyroll.model.DurationProvider
    public long getDurationMs() {
        return this.durationMs;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public ExtendedMaturityRating getExtendedMaturityRating() {
        return this.extendedMaturityRating;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public String getOriginalAudio() {
        List<String> list = this._audioLocales;
        if (list != null) {
            return (String) x.v0(list);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = Long.hashCode(this.durationMs) * 31;
        boolean z = this.isMature;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode4 + i2) * 31;
        boolean z2 = this.isMatureBlocked;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.isDubbed;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z4 = this.isSubbed;
        if (!z4) {
            i = z4 ? 1 : 0;
        }
        int i8 = (i7 + i) * 31;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        int i9 = 0;
        if (extendedMaturityRating == null) {
            hashCode = 0;
        } else {
            hashCode = extendedMaturityRating.hashCode();
        }
        int i10 = (i8 + hashCode) * 31;
        List<String> list = this.contentDescriptors;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        List<String> list2 = this._subtitleLocales;
        if (list2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list2.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        List<String> list3 = this._audioLocales;
        if (list3 != null) {
            i9 = list3.hashCode();
        }
        return i12 + i9;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isDubbed() {
        return this.isDubbed;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isMature() {
        return this.isMature;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isMatureBlocked() {
        return this.isMatureBlocked;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isSubbed() {
        return this.isSubbed;
    }

    public String toString() {
        long j = this.durationMs;
        boolean z = this.isMature;
        boolean z2 = this.isMatureBlocked;
        boolean z3 = this.isDubbed;
        boolean z4 = this.isSubbed;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        List<String> list = this.contentDescriptors;
        List<String> list2 = this._subtitleLocales;
        List<String> list3 = this._audioLocales;
        return "MovieListingMetadata(durationMs=" + j + ", isMature=" + z + ", isMatureBlocked=" + z2 + ", isDubbed=" + z3 + ", isSubbed=" + z4 + ", extendedMaturityRating=" + extendedMaturityRating + ", contentDescriptors=" + list + ", _subtitleLocales=" + list2 + ", _audioLocales=" + list3 + ")";
    }

    public /* synthetic */ MovieListingMetadata(long j, boolean z, boolean z2, boolean z3, boolean z4, ExtendedMaturityRating extendedMaturityRating, List list, List list2, List list3, int i, e eVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? null : extendedMaturityRating, (i & 64) != 0 ? z.b : list, (i & 128) != 0 ? null : list2, (i & 256) == 0 ? list3 : null);
    }

    public MovieListingMetadata(long j, boolean z, boolean z2, boolean z3, boolean z4, ExtendedMaturityRating extendedMaturityRating, List<String> list, List<String> list2, List<String> list3) {
        super(null);
        this.durationMs = j;
        this.isMature = z;
        this.isMatureBlocked = z2;
        this.isDubbed = z3;
        this.isSubbed = z4;
        this.extendedMaturityRating = extendedMaturityRating;
        this.contentDescriptors = list;
        this._subtitleLocales = list2;
        this._audioLocales = list3;
    }
}
