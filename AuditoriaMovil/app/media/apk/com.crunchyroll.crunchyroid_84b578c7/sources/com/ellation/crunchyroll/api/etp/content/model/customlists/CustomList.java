package com.ellation.crunchyroll.api.etp.content.model.customlists;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: CustomLists.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomList;", "", "isPublic", "", "listId", "", "modifiedAt", "Ljava/util/Date;", "title", "total", "", "(ZLjava/lang/String;Ljava/util/Date;Ljava/lang/String;I)V", "()Z", "getListId", "()Ljava/lang/String;", "getModifiedAt", "()Ljava/util/Date;", "getTitle", "getTotal", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomList {
    public static final int $stable = 8;
    @SerializedName("is_public")
    private final boolean isPublic;
    @SerializedName("list_id")
    private final String listId;
    @SerializedName("modified_at")
    private final Date modifiedAt;
    @SerializedName("title")
    private final String title;
    @SerializedName("total")
    private final int total;

    public CustomList(boolean z, String str, Date date, String str2, int i) {
        j.f(str, "listId");
        j.f(date, "modifiedAt");
        j.f(str2, "title");
        this.isPublic = z;
        this.listId = str;
        this.modifiedAt = date;
        this.title = str2;
        this.total = i;
    }

    public static /* synthetic */ CustomList copy$default(CustomList customList, boolean z, String str, Date date, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = customList.isPublic;
        }
        if ((i2 & 2) != 0) {
            str = customList.listId;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            date = customList.modifiedAt;
        }
        Date date2 = date;
        if ((i2 & 8) != 0) {
            str2 = customList.title;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            i = customList.total;
        }
        return customList.copy(z, str3, date2, str4, i);
    }

    public final boolean component1() {
        return this.isPublic;
    }

    public final String component2() {
        return this.listId;
    }

    public final Date component3() {
        return this.modifiedAt;
    }

    public final String component4() {
        return this.title;
    }

    public final int component5() {
        return this.total;
    }

    public final CustomList copy(boolean z, String str, Date date, String str2, int i) {
        j.f(str, "listId");
        j.f(date, "modifiedAt");
        j.f(str2, "title");
        return new CustomList(z, str, date, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomList)) {
            return false;
        }
        CustomList customList = (CustomList) obj;
        if (this.isPublic == customList.isPublic && j.a(this.listId, customList.listId) && j.a(this.modifiedAt, customList.modifiedAt) && j.a(this.title, customList.title) && this.total == customList.total) {
            return true;
        }
        return false;
    }

    public final String getListId() {
        return this.listId;
    }

    public final Date getModifiedAt() {
        return this.modifiedAt;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotal() {
        return this.total;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isPublic;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int b = a.b(this.listId, r0 * 31, 31);
        return Integer.hashCode(this.total) + a.b(this.title, (this.modifiedAt.hashCode() + b) * 31, 31);
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public String toString() {
        boolean z = this.isPublic;
        String str = this.listId;
        Date date = this.modifiedAt;
        String str2 = this.title;
        int i = this.total;
        StringBuilder sb = new StringBuilder("CustomList(isPublic=");
        sb.append(z);
        sb.append(", listId=");
        sb.append(str);
        sb.append(", modifiedAt=");
        sb.append(date);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", total=");
        return e.f(sb, i, ")");
    }
}
