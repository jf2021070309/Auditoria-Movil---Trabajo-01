package com.ellation.crunchyroll.model.music;

import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: MusicGenre.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/model/music/MusicGenre;", "", "_id", "", "_displayValue", "(Ljava/lang/String;Ljava/lang/String;)V", "displayValue", "getDisplayValue", "()Ljava/lang/String;", "id", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MusicGenre {
    public static final int $stable = 0;
    @SerializedName("displayValue")
    private final String _displayValue;
    @SerializedName("id")
    private final String _id;

    public MusicGenre() {
        this(null, null, 3, null);
    }

    private final String component1() {
        return this._id;
    }

    private final String component2() {
        return this._displayValue;
    }

    public static /* synthetic */ MusicGenre copy$default(MusicGenre musicGenre, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicGenre._id;
        }
        if ((i & 2) != 0) {
            str2 = musicGenre._displayValue;
        }
        return musicGenre.copy(str, str2);
    }

    public final MusicGenre copy(String str, String str2) {
        return new MusicGenre(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicGenre)) {
            return false;
        }
        MusicGenre musicGenre = (MusicGenre) obj;
        if (j.a(this._id, musicGenre._id) && j.a(this._displayValue, musicGenre._displayValue)) {
            return true;
        }
        return false;
    }

    public final String getDisplayValue() {
        String str = this._displayValue;
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

    public int hashCode() {
        int hashCode;
        String str = this._id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._displayValue;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return e.b("MusicGenre(_id=", this._id, ", _displayValue=", this._displayValue, ")");
    }

    public MusicGenre(String str, String str2) {
        this._id = str;
        this._displayValue = str2;
    }

    public /* synthetic */ MusicGenre(String str, String str2, int i, com.amazon.aps.iva.yb0.e eVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
