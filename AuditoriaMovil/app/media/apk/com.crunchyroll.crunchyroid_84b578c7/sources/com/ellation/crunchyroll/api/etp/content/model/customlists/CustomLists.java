package com.ellation.crunchyroll.api.etp.content.model.customlists;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CustomLists.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomLists;", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomList;", "metadata", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListsMetadata;", "total", "", "(Ljava/util/List;Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListsMetadata;I)V", "getItems", "()Ljava/util/List;", "getMetadata", "()Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListsMetadata;", "getTotal", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomLists {
    public static final int $stable = 8;
    @SerializedName("data")
    private final List<CustomList> items;
    @SerializedName("meta")
    private final CustomListsMetadata metadata;
    @SerializedName("total")
    private final int total;

    public CustomLists(List<CustomList> list, CustomListsMetadata customListsMetadata, int i) {
        j.f(list, FirebaseAnalytics.Param.ITEMS);
        j.f(customListsMetadata, "metadata");
        this.items = list;
        this.metadata = customListsMetadata;
        this.total = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomLists copy$default(CustomLists customLists, List list, CustomListsMetadata customListsMetadata, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = customLists.items;
        }
        if ((i2 & 2) != 0) {
            customListsMetadata = customLists.metadata;
        }
        if ((i2 & 4) != 0) {
            i = customLists.total;
        }
        return customLists.copy(list, customListsMetadata, i);
    }

    public final List<CustomList> component1() {
        return this.items;
    }

    public final CustomListsMetadata component2() {
        return this.metadata;
    }

    public final int component3() {
        return this.total;
    }

    public final CustomLists copy(List<CustomList> list, CustomListsMetadata customListsMetadata, int i) {
        j.f(list, FirebaseAnalytics.Param.ITEMS);
        j.f(customListsMetadata, "metadata");
        return new CustomLists(list, customListsMetadata, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomLists)) {
            return false;
        }
        CustomLists customLists = (CustomLists) obj;
        if (j.a(this.items, customLists.items) && j.a(this.metadata, customLists.metadata) && this.total == customLists.total) {
            return true;
        }
        return false;
    }

    public final List<CustomList> getItems() {
        return this.items;
    }

    public final CustomListsMetadata getMetadata() {
        return this.metadata;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int hashCode = this.metadata.hashCode();
        return Integer.hashCode(this.total) + ((hashCode + (this.items.hashCode() * 31)) * 31);
    }

    public String toString() {
        List<CustomList> list = this.items;
        CustomListsMetadata customListsMetadata = this.metadata;
        int i = this.total;
        StringBuilder sb = new StringBuilder("CustomLists(items=");
        sb.append(list);
        sb.append(", metadata=");
        sb.append(customListsMetadata);
        sb.append(", total=");
        return e.f(sb, i, ")");
    }
}
