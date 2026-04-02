package com.ellation.crunchyroll.api.cms.model;

import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.FormattableSeason;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: Season.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0002\u0010!JV\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\nHÖ\u0001J\t\u0010)\u001a\u00020\u0004HÖ\u0001R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u0019\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000f¨\u0006*"}, d2 = {"Lcom/ellation/crunchyroll/api/cms/model/Season;", "Ljava/io/Serializable;", "Lcom/ellation/crunchyroll/model/FormattableSeason;", "_id", "", "_channelId", "_title", "_seriesId", "_seasonNumber", "_numberOfEpisodes", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "channelId", "getChannelId", "()Ljava/lang/String;", "id", "getId", "numberOfEpisodes", "getNumberOfEpisodes", "()I", "seasonNumber", "getSeasonNumber", "seriesId", "getSeriesId", "title", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ellation/crunchyroll/api/cms/model/Season;", "equals", "", "other", "", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Season implements Serializable, FormattableSeason {
    public static final int $stable = 0;
    @SerializedName("channel_id")
    private final String _channelId;
    @SerializedName("id")
    private final String _id;
    @SerializedName("number_of_episodes")
    private final Integer _numberOfEpisodes;
    @SerializedName("season_number")
    private final String _seasonNumber;
    @SerializedName("series_id")
    private final String _seriesId;
    @SerializedName("title")
    private final String _title;

    public Season() {
        this(null, null, null, null, null, null, 63, null);
    }

    private final String component1() {
        return this._id;
    }

    private final String component2() {
        return this._channelId;
    }

    private final String component3() {
        return this._title;
    }

    private final String component4() {
        return this._seriesId;
    }

    private final String component5() {
        return this._seasonNumber;
    }

    private final Integer component6() {
        return this._numberOfEpisodes;
    }

    public static /* synthetic */ Season copy$default(Season season, String str, String str2, String str3, String str4, String str5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = season._id;
        }
        if ((i & 2) != 0) {
            str2 = season._channelId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = season._title;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = season._seriesId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = season._seasonNumber;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            num = season._numberOfEpisodes;
        }
        return season.copy(str, str6, str7, str8, str9, num);
    }

    public final Season copy(String str, String str2, String str3, String str4, String str5, Integer num) {
        return new Season(str, str2, str3, str4, str5, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Season)) {
            return false;
        }
        Season season = (Season) obj;
        if (j.a(this._id, season._id) && j.a(this._channelId, season._channelId) && j.a(this._title, season._title) && j.a(this._seriesId, season._seriesId) && j.a(this._seasonNumber, season._seasonNumber) && j.a(this._numberOfEpisodes, season._numberOfEpisodes)) {
            return true;
        }
        return false;
    }

    public final String getChannelId() {
        String str = this._channelId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getId() {
        String str = this._id;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final int getNumberOfEpisodes() {
        Integer num = this._numberOfEpisodes;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final String getSeasonNumber() {
        String str = this._seasonNumber;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getSeriesId() {
        String str = this._seriesId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getTitle() {
        String str = this._title;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
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
        String str4 = this._seriesId;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this._seasonNumber;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Integer num = this._numberOfEpisodes;
        if (num != null) {
            i = num.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        String str = this._id;
        String str2 = this._channelId;
        String str3 = this._title;
        String str4 = this._seriesId;
        String str5 = this._seasonNumber;
        Integer num = this._numberOfEpisodes;
        StringBuilder b = a.b("Season(_id=", str, ", _channelId=", str2, ", _title=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", _seriesId=", str4, ", _seasonNumber=");
        b.append(str5);
        b.append(", _numberOfEpisodes=");
        b.append(num);
        b.append(")");
        return b.toString();
    }

    public Season(String str, String str2, String str3, String str4, String str5, Integer num) {
        this._id = str;
        this._channelId = str2;
        this._title = str3;
        this._seriesId = str4;
        this._seasonNumber = str5;
        this._numberOfEpisodes = num;
    }

    public /* synthetic */ Season(String str, String str2, String str3, String str4, String str5, Integer num, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num);
    }
}
