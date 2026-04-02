package com.ellation.crunchyroll.api.etp.content.model.customlists;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: CustomListItems.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItem;", "", "id", "", "listId", "modifiedAt", "panel", "Lcom/ellation/crunchyroll/model/Panel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/model/Panel;)V", "getId", "()Ljava/lang/String;", "getListId", "getModifiedAt", "getPanel", "()Lcom/ellation/crunchyroll/model/Panel;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomListItem {
    public static final int $stable = 8;
    @SerializedName("id")
    private final String id;
    @SerializedName("list_id")
    private final String listId;
    @SerializedName("modified_at")
    private final String modifiedAt;
    @SerializedName("panel")
    private final Panel panel;

    public CustomListItem(String str, String str2, String str3, Panel panel) {
        j.f(str, "id");
        j.f(str2, "listId");
        j.f(str3, "modifiedAt");
        this.id = str;
        this.listId = str2;
        this.modifiedAt = str3;
        this.panel = panel;
    }

    public static /* synthetic */ CustomListItem copy$default(CustomListItem customListItem, String str, String str2, String str3, Panel panel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customListItem.id;
        }
        if ((i & 2) != 0) {
            str2 = customListItem.listId;
        }
        if ((i & 4) != 0) {
            str3 = customListItem.modifiedAt;
        }
        if ((i & 8) != 0) {
            panel = customListItem.panel;
        }
        return customListItem.copy(str, str2, str3, panel);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.listId;
    }

    public final String component3() {
        return this.modifiedAt;
    }

    public final Panel component4() {
        return this.panel;
    }

    public final CustomListItem copy(String str, String str2, String str3, Panel panel) {
        j.f(str, "id");
        j.f(str2, "listId");
        j.f(str3, "modifiedAt");
        return new CustomListItem(str, str2, str3, panel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomListItem)) {
            return false;
        }
        CustomListItem customListItem = (CustomListItem) obj;
        if (j.a(this.id, customListItem.id) && j.a(this.listId, customListItem.listId) && j.a(this.modifiedAt, customListItem.modifiedAt) && j.a(this.panel, customListItem.panel)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getListId() {
        return this.listId;
    }

    public final String getModifiedAt() {
        return this.modifiedAt;
    }

    public final Panel getPanel() {
        return this.panel;
    }

    public int hashCode() {
        int hashCode;
        int b = a.b(this.modifiedAt, a.b(this.listId, this.id.hashCode() * 31, 31), 31);
        Panel panel = this.panel;
        if (panel == null) {
            hashCode = 0;
        } else {
            hashCode = panel.hashCode();
        }
        return b + hashCode;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.listId;
        String str3 = this.modifiedAt;
        Panel panel = this.panel;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("CustomListItem(id=", str, ", listId=", str2, ", modifiedAt=");
        b.append(str3);
        b.append(", panel=");
        b.append(panel);
        b.append(")");
        return b.toString();
    }
}
