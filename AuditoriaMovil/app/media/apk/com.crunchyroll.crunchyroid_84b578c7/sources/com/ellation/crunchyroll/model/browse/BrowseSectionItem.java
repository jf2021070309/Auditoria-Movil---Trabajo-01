package com.ellation.crunchyroll.model.browse;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: BrowseSectionItem.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/model/browse/BrowseSectionItem;", "", "_prefix", "", "offset", "", "total", "title", "(Ljava/lang/String;IILjava/lang/String;)V", "getOffset", "()I", "prefix", "getPrefix", "()Ljava/lang/String;", "getTitle", "getTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BrowseSectionItem {
    public static final int $stable = 0;
    @SerializedName("prefix")
    private final String _prefix;
    @SerializedName("offset")
    private final int offset;
    @SerializedName("title")
    private final String title;
    @SerializedName("total")
    private final int total;

    public BrowseSectionItem(String str, int i, int i2, String str2) {
        j.f(str2, "title");
        this._prefix = str;
        this.offset = i;
        this.total = i2;
        this.title = str2;
    }

    private final String component1() {
        return this._prefix;
    }

    public static /* synthetic */ BrowseSectionItem copy$default(BrowseSectionItem browseSectionItem, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = browseSectionItem._prefix;
        }
        if ((i3 & 2) != 0) {
            i = browseSectionItem.offset;
        }
        if ((i3 & 4) != 0) {
            i2 = browseSectionItem.total;
        }
        if ((i3 & 8) != 0) {
            str2 = browseSectionItem.title;
        }
        return browseSectionItem.copy(str, i, i2, str2);
    }

    public final int component2() {
        return this.offset;
    }

    public final int component3() {
        return this.total;
    }

    public final String component4() {
        return this.title;
    }

    public final BrowseSectionItem copy(String str, int i, int i2, String str2) {
        j.f(str2, "title");
        return new BrowseSectionItem(str, i, i2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowseSectionItem)) {
            return false;
        }
        BrowseSectionItem browseSectionItem = (BrowseSectionItem) obj;
        if (j.a(this._prefix, browseSectionItem._prefix) && this.offset == browseSectionItem.offset && this.total == browseSectionItem.total && j.a(this.title, browseSectionItem.title)) {
            return true;
        }
        return false;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getPrefix() {
        String str = this._prefix;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int hashCode;
        String str = this._prefix;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.title.hashCode() + r.a(this.total, r.a(this.offset, hashCode * 31, 31), 31);
    }

    public String toString() {
        String str = this._prefix;
        int i = this.offset;
        int i2 = this.total;
        String str2 = this.title;
        return "BrowseSectionItem(_prefix=" + str + ", offset=" + i + ", total=" + i2 + ", title=" + str2 + ")";
    }
}
