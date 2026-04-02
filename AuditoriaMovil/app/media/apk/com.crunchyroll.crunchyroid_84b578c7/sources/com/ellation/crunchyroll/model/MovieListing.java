package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.google.android.gms.cast.MediaTrack;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ContentContainer.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010¢\u0006\u0004\bH\u0010IJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010HÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0013\u0010\fJ\u0011\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010HÆ\u0003JÊ\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00102\u0010\b\u0002\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\t\u0010&\u001a\u00020\u0002HÖ\u0001J\t\u0010(\u001a\u00020'HÖ\u0001J\u0013\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b/\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b0\u0010.R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b1\u0010.R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b5\u0010.R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\b7\u0010\fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u00106\u001a\u0004\b8\u0010\fR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u00109\u001a\u0004\b:\u0010;R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010 \u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b \u00106\u001a\u0004\b?\u0010\fR\u001c\u0010!\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\b@\u0010\fR\"\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010<\u001a\u0004\bA\u0010>R\"\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\bB\u0010>R\u001a\u0010D\u001a\u00020C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/ellation/crunchyroll/model/MovieListing;", "Lcom/ellation/crunchyroll/model/ContentContainer;", "", "component1", "component2", "component3", "component4", "Lcom/ellation/crunchyroll/model/Images;", "component5", "component6", "", "component7", "()Ljava/lang/Boolean;", "component8", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "component9", "", "component10", "component11", "component12", "component13", "component14", "_id", "_channelId", "_title", "_description", "_images", "_contentProvider", "_isMature", "_isMatureBlocked", "extendedMaturityRating", "_contentDescriptors", "_isDubbed", "_isSubbed", "_audioLocales", "_subtitleLocales", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/model/Images;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)Lcom/ellation/crunchyroll/model/MovieListing;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "get_id", "()Ljava/lang/String;", "get_channelId", "get_title", "get_description", "Lcom/ellation/crunchyroll/model/Images;", "get_images", "()Lcom/ellation/crunchyroll/model/Images;", "get_contentProvider", "Ljava/lang/Boolean;", "get_isMature", "get_isMatureBlocked", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "Ljava/util/List;", "get_contentDescriptors", "()Ljava/util/List;", "get_isDubbed", "get_isSubbed", "get_audioLocales", "get_subtitleLocales", "Lcom/amazon/aps/iva/x50/t;", "resourceType", "Lcom/amazon/aps/iva/x50/t;", "getResourceType", "()Lcom/amazon/aps/iva/x50/t;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/model/Images;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MovieListing extends ContentContainer {
    public static final int $stable = 8;
    @SerializedName("audio_locales")
    private final List<String> _audioLocales;
    @SerializedName("channel_id")
    private final String _channelId;
    @SerializedName("content_descriptors")
    private final List<String> _contentDescriptors;
    @SerializedName("content_provider")
    private final String _contentProvider;
    @SerializedName(MediaTrack.ROLE_DESCRIPTION)
    private final String _description;
    @SerializedName("id")
    private final String _id;
    @SerializedName("images")
    private final Images _images;
    @SerializedName("is_dubbed")
    private final Boolean _isDubbed;
    @SerializedName("is_mature")
    private final Boolean _isMature;
    @SerializedName("mature_blocked")
    private final Boolean _isMatureBlocked;
    @SerializedName("is_subbed")
    private final Boolean _isSubbed;
    @SerializedName("subtitle_locales")
    private final List<String> _subtitleLocales;
    @SerializedName("title")
    private final String _title;
    @SerializedName("extended_maturity_rating")
    private final ExtendedMaturityRating extendedMaturityRating;
    private final t resourceType;

    public MovieListing() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final String component1() {
        return this._id;
    }

    public final List<String> component10() {
        return this._contentDescriptors;
    }

    public final Boolean component11() {
        return this._isDubbed;
    }

    public final Boolean component12() {
        return this._isSubbed;
    }

    public final List<String> component13() {
        return this._audioLocales;
    }

    public final List<String> component14() {
        return this._subtitleLocales;
    }

    public final String component2() {
        return this._channelId;
    }

    public final String component3() {
        return this._title;
    }

    public final String component4() {
        return this._description;
    }

    public final Images component5() {
        return this._images;
    }

    public final String component6() {
        return this._contentProvider;
    }

    public final Boolean component7() {
        return this._isMature;
    }

    public final Boolean component8() {
        return this._isMatureBlocked;
    }

    public final ExtendedMaturityRating component9() {
        return this.extendedMaturityRating;
    }

    public final MovieListing copy(String str, String str2, String str3, String str4, Images images, String str5, Boolean bool, Boolean bool2, ExtendedMaturityRating extendedMaturityRating, List<String> list, Boolean bool3, Boolean bool4, List<String> list2, List<String> list3) {
        j.f(list2, "_audioLocales");
        j.f(list3, "_subtitleLocales");
        return new MovieListing(str, str2, str3, str4, images, str5, bool, bool2, extendedMaturityRating, list, bool3, bool4, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieListing)) {
            return false;
        }
        MovieListing movieListing = (MovieListing) obj;
        if (j.a(this._id, movieListing._id) && j.a(this._channelId, movieListing._channelId) && j.a(this._title, movieListing._title) && j.a(this._description, movieListing._description) && j.a(this._images, movieListing._images) && j.a(this._contentProvider, movieListing._contentProvider) && j.a(this._isMature, movieListing._isMature) && j.a(this._isMatureBlocked, movieListing._isMatureBlocked) && j.a(this.extendedMaturityRating, movieListing.extendedMaturityRating) && j.a(this._contentDescriptors, movieListing._contentDescriptors) && j.a(this._isDubbed, movieListing._isDubbed) && j.a(this._isSubbed, movieListing._isSubbed) && j.a(this._audioLocales, movieListing._audioLocales) && j.a(this._subtitleLocales, movieListing._subtitleLocales)) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public ExtendedMaturityRating getExtendedMaturityRating() {
        return this.extendedMaturityRating;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public t getResourceType() {
        return this.resourceType;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public List<String> get_audioLocales() {
        return this._audioLocales;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public String get_channelId() {
        return this._channelId;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public List<String> get_contentDescriptors() {
        return this._contentDescriptors;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public String get_contentProvider() {
        return this._contentProvider;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public String get_description() {
        return this._description;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public String get_id() {
        return this._id;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public Images get_images() {
        return this._images;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public Boolean get_isDubbed() {
        return this._isDubbed;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public Boolean get_isMature() {
        return this._isMature;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public Boolean get_isMatureBlocked() {
        return this._isMatureBlocked;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public Boolean get_isSubbed() {
        return this._isSubbed;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public List<String> get_subtitleLocales() {
        return this._subtitleLocales;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public String get_title() {
        return this._title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        String str = this._id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._channelId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this._title;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this._description;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Images images = this._images;
        if (images == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = images.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this._contentProvider;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Boolean bool = this._isMature;
        if (bool == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Boolean bool2 = this._isMatureBlocked;
        if (bool2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool2.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        if (extendedMaturityRating == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = extendedMaturityRating.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        List<String> list = this._contentDescriptors;
        if (list == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Boolean bool3 = this._isDubbed;
        if (bool3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool3.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Boolean bool4 = this._isSubbed;
        if (bool4 != null) {
            i = bool4.hashCode();
        }
        return this._subtitleLocales.hashCode() + a.a(this._audioLocales, (i12 + i) * 31, 31);
    }

    public String toString() {
        String str = this._id;
        String str2 = this._channelId;
        String str3 = this._title;
        String str4 = this._description;
        Images images = this._images;
        String str5 = this._contentProvider;
        Boolean bool = this._isMature;
        Boolean bool2 = this._isMatureBlocked;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        List<String> list = this._contentDescriptors;
        Boolean bool3 = this._isDubbed;
        Boolean bool4 = this._isSubbed;
        List<String> list2 = this._audioLocales;
        List<String> list3 = this._subtitleLocales;
        StringBuilder b = a.b("MovieListing(_id=", str, ", _channelId=", str2, ", _title=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", _description=", str4, ", _images=");
        b.append(images);
        b.append(", _contentProvider=");
        b.append(str5);
        b.append(", _isMature=");
        b.append(bool);
        b.append(", _isMatureBlocked=");
        b.append(bool2);
        b.append(", extendedMaturityRating=");
        b.append(extendedMaturityRating);
        b.append(", _contentDescriptors=");
        b.append(list);
        b.append(", _isDubbed=");
        b.append(bool3);
        b.append(", _isSubbed=");
        b.append(bool4);
        b.append(", _audioLocales=");
        b.append(list2);
        b.append(", _subtitleLocales=");
        b.append(list3);
        b.append(")");
        return b.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MovieListing(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.ellation.crunchyroll.model.Images r20, java.lang.String r21, java.lang.Boolean r22, java.lang.Boolean r23, com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating r24, java.util.List r25, java.lang.Boolean r26, java.lang.Boolean r27, java.util.List r28, java.util.List r29, int r30, com.amazon.aps.iva.yb0.e r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lc
        La:
            r1 = r16
        Lc:
            r3 = r0 & 2
            if (r3 == 0) goto L12
            r3 = r2
            goto L14
        L12:
            r3 = r17
        L14:
            r4 = r0 & 4
            if (r4 == 0) goto L1a
            r4 = r2
            goto L1c
        L1a:
            r4 = r18
        L1c:
            r5 = r0 & 8
            if (r5 == 0) goto L22
            r5 = r2
            goto L24
        L22:
            r5 = r19
        L24:
            r6 = r0 & 16
            r7 = 0
            if (r6 == 0) goto L2b
            r6 = r7
            goto L2d
        L2b:
            r6 = r20
        L2d:
            r8 = r0 & 32
            if (r8 == 0) goto L32
            goto L34
        L32:
            r2 = r21
        L34:
            r8 = r0 & 64
            if (r8 == 0) goto L3b
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto L3d
        L3b:
            r8 = r22
        L3d:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L44
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L46
        L44:
            r9 = r23
        L46:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L4c
            r10 = r7
            goto L4e
        L4c:
            r10 = r24
        L4e:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L53
            goto L55
        L53:
            r7 = r25
        L55:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L5c
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            goto L5e
        L5c:
            r11 = r26
        L5e:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L65
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            goto L67
        L65:
            r12 = r27
        L67:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            com.amazon.aps.iva.lb0.z r14 = com.amazon.aps.iva.lb0.z.b
            if (r13 == 0) goto L6f
            r13 = r14
            goto L71
        L6f:
            r13 = r28
        L71:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L76
            goto L78
        L76:
            r14 = r29
        L78:
            r16 = r15
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r2
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r7
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.model.MovieListing.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ellation.crunchyroll.model.Images, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating, java.util.List, java.lang.Boolean, java.lang.Boolean, java.util.List, java.util.List, int, com.amazon.aps.iva.yb0.e):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieListing(String str, String str2, String str3, String str4, Images images, String str5, Boolean bool, Boolean bool2, ExtendedMaturityRating extendedMaturityRating, List<String> list, Boolean bool3, Boolean bool4, List<String> list2, List<String> list3) {
        super(null);
        j.f(list2, "_audioLocales");
        j.f(list3, "_subtitleLocales");
        this._id = str;
        this._channelId = str2;
        this._title = str3;
        this._description = str4;
        this._images = images;
        this._contentProvider = str5;
        this._isMature = bool;
        this._isMatureBlocked = bool2;
        this.extendedMaturityRating = extendedMaturityRating;
        this._contentDescriptors = list;
        this._isDubbed = bool3;
        this._isSubbed = bool4;
        this._audioLocales = list2;
        this._subtitleLocales = list3;
        this.resourceType = t.MOVIE_LISTING;
    }
}
