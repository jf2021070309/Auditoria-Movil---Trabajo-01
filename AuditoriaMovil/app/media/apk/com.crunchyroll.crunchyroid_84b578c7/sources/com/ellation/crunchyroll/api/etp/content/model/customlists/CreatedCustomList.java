package com.ellation.crunchyroll.api.etp.content.model.customlists;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: CreatedCustomList.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CreatedCustomList;", "", "listId", "", "modifiedAt", "Ljava/util/Date;", "title", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "getListId", "()Ljava/lang/String;", "getModifiedAt", "()Ljava/util/Date;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreatedCustomList {
    public static final int $stable = 8;
    @SerializedName("list_id")
    private final String listId;
    @SerializedName("modified_at")
    private final Date modifiedAt;
    @SerializedName("title")
    private final String title;

    public CreatedCustomList(String str, Date date, String str2) {
        j.f(str, "listId");
        j.f(date, "modifiedAt");
        j.f(str2, "title");
        this.listId = str;
        this.modifiedAt = date;
        this.title = str2;
    }

    public static /* synthetic */ CreatedCustomList copy$default(CreatedCustomList createdCustomList, String str, Date date, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createdCustomList.listId;
        }
        if ((i & 2) != 0) {
            date = createdCustomList.modifiedAt;
        }
        if ((i & 4) != 0) {
            str2 = createdCustomList.title;
        }
        return createdCustomList.copy(str, date, str2);
    }

    public final String component1() {
        return this.listId;
    }

    public final Date component2() {
        return this.modifiedAt;
    }

    public final String component3() {
        return this.title;
    }

    public final CreatedCustomList copy(String str, Date date, String str2) {
        j.f(str, "listId");
        j.f(date, "modifiedAt");
        j.f(str2, "title");
        return new CreatedCustomList(str, date, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatedCustomList)) {
            return false;
        }
        CreatedCustomList createdCustomList = (CreatedCustomList) obj;
        if (j.a(this.listId, createdCustomList.listId) && j.a(this.modifiedAt, createdCustomList.modifiedAt) && j.a(this.title, createdCustomList.title)) {
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

    public int hashCode() {
        int hashCode = this.modifiedAt.hashCode();
        return this.title.hashCode() + ((hashCode + (this.listId.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.listId;
        Date date = this.modifiedAt;
        String str2 = this.title;
        StringBuilder sb = new StringBuilder("CreatedCustomList(listId=");
        sb.append(str);
        sb.append(", modifiedAt=");
        sb.append(date);
        sb.append(", title=");
        return b.c(sb, str2, ")");
    }
}
