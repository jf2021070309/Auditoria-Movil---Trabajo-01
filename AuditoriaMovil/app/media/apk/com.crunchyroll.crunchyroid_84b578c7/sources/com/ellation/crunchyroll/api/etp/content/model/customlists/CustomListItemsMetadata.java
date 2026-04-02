package com.ellation.crunchyroll.api.etp.content.model.customlists;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: CustomListItems.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemsMetadata;", "", "isPublic", "", "max", "", "modifiedAt", "", "nextPage", "title", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getMax", "()I", "getModifiedAt", "()Ljava/lang/String;", "getNextPage", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomListItemsMetadata {
    public static final int $stable = 0;
    @SerializedName("is_public")
    private final boolean isPublic;
    @SerializedName("max")
    private final int max;
    @SerializedName("modified_at")
    private final String modifiedAt;
    @SerializedName("next_page")
    private final String nextPage;
    @SerializedName("title")
    private final String title;

    public CustomListItemsMetadata(boolean z, int i, String str, String str2, String str3) {
        j.f(str, "modifiedAt");
        j.f(str3, "title");
        this.isPublic = z;
        this.max = i;
        this.modifiedAt = str;
        this.nextPage = str2;
        this.title = str3;
    }

    public static /* synthetic */ CustomListItemsMetadata copy$default(CustomListItemsMetadata customListItemsMetadata, boolean z, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = customListItemsMetadata.isPublic;
        }
        if ((i2 & 2) != 0) {
            i = customListItemsMetadata.max;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = customListItemsMetadata.modifiedAt;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = customListItemsMetadata.nextPage;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = customListItemsMetadata.title;
        }
        return customListItemsMetadata.copy(z, i3, str4, str5, str3);
    }

    public final boolean component1() {
        return this.isPublic;
    }

    public final int component2() {
        return this.max;
    }

    public final String component3() {
        return this.modifiedAt;
    }

    public final String component4() {
        return this.nextPage;
    }

    public final String component5() {
        return this.title;
    }

    public final CustomListItemsMetadata copy(boolean z, int i, String str, String str2, String str3) {
        j.f(str, "modifiedAt");
        j.f(str3, "title");
        return new CustomListItemsMetadata(z, i, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomListItemsMetadata)) {
            return false;
        }
        CustomListItemsMetadata customListItemsMetadata = (CustomListItemsMetadata) obj;
        if (this.isPublic == customListItemsMetadata.isPublic && this.max == customListItemsMetadata.max && j.a(this.modifiedAt, customListItemsMetadata.modifiedAt) && j.a(this.nextPage, customListItemsMetadata.nextPage) && j.a(this.title, customListItemsMetadata.title)) {
            return true;
        }
        return false;
    }

    public final int getMax() {
        return this.max;
    }

    public final String getModifiedAt() {
        return this.modifiedAt;
    }

    public final String getNextPage() {
        return this.nextPage;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        int hashCode;
        boolean z = this.isPublic;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int b = a.b(this.modifiedAt, r.a(this.max, r0 * 31, 31), 31);
        String str = this.nextPage;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.title.hashCode() + ((b + hashCode) * 31);
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public String toString() {
        boolean z = this.isPublic;
        int i = this.max;
        String str = this.modifiedAt;
        String str2 = this.nextPage;
        String str3 = this.title;
        StringBuilder sb = new StringBuilder("CustomListItemsMetadata(isPublic=");
        sb.append(z);
        sb.append(", max=");
        sb.append(i);
        sb.append(", modifiedAt=");
        com.amazon.aps.iva.m80.a.c(sb, str, ", nextPage=", str2, ", title=");
        return b.c(sb, str3, ")");
    }
}
