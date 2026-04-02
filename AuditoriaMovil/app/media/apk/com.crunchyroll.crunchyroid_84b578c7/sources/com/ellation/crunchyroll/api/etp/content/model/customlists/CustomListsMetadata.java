package com.ellation.crunchyroll.api.etp.content.model.customlists;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.b6.x;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: CustomLists.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListsMetadata;", "", "maxPrivate", "", "totalPrivate", "totalPublic", "(III)V", "getMaxPrivate", "()I", "getTotalPrivate", "getTotalPublic", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomListsMetadata {
    public static final int $stable = 0;
    @SerializedName("max_private")
    private final int maxPrivate;
    @SerializedName("total_private")
    private final int totalPrivate;
    @SerializedName("total_public")
    private final int totalPublic;

    public CustomListsMetadata(int i, int i2, int i3) {
        this.maxPrivate = i;
        this.totalPrivate = i2;
        this.totalPublic = i3;
    }

    public static /* synthetic */ CustomListsMetadata copy$default(CustomListsMetadata customListsMetadata, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = customListsMetadata.maxPrivate;
        }
        if ((i4 & 2) != 0) {
            i2 = customListsMetadata.totalPrivate;
        }
        if ((i4 & 4) != 0) {
            i3 = customListsMetadata.totalPublic;
        }
        return customListsMetadata.copy(i, i2, i3);
    }

    public final int component1() {
        return this.maxPrivate;
    }

    public final int component2() {
        return this.totalPrivate;
    }

    public final int component3() {
        return this.totalPublic;
    }

    public final CustomListsMetadata copy(int i, int i2, int i3) {
        return new CustomListsMetadata(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomListsMetadata)) {
            return false;
        }
        CustomListsMetadata customListsMetadata = (CustomListsMetadata) obj;
        if (this.maxPrivate == customListsMetadata.maxPrivate && this.totalPrivate == customListsMetadata.totalPrivate && this.totalPublic == customListsMetadata.totalPublic) {
            return true;
        }
        return false;
    }

    public final int getMaxPrivate() {
        return this.maxPrivate;
    }

    public final int getTotalPrivate() {
        return this.totalPrivate;
    }

    public final int getTotalPublic() {
        return this.totalPublic;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalPublic) + r.a(this.totalPrivate, Integer.hashCode(this.maxPrivate) * 31, 31);
    }

    public String toString() {
        int i = this.maxPrivate;
        int i2 = this.totalPrivate;
        return e.f(x.a("CustomListsMetadata(maxPrivate=", i, ", totalPrivate=", i2, ", totalPublic="), this.totalPublic, ")");
    }
}
