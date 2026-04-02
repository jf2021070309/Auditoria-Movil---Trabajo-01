package com.ellation.crunchyroll.api.model;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.MediaTrack;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: HomeFeedItemRaw.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B«\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0017J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010:\u001a\u00020;H\u0016J\u0006\u0010<\u001a\u000208R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u001eR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058F¢\u0006\u0006\u001a\u0004\b'\u0010\u001eR\u0011\u0010(\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0019¨\u0006="}, d2 = {"Lcom/ellation/crunchyroll/api/model/HomeFeedItemRaw;", "", "_id", "", "_ids", "", "_collectionItems", "Lcom/ellation/crunchyroll/api/model/MusicCollectionItem;", "_resourceType", "Lcom/ellation/crunchyroll/api/model/HomeFeedItemResourceType;", "_responseType", "Lcom/ellation/crunchyroll/api/model/HomeFeedItemResponseType;", "_channelId", "_link", "title", MediaTrack.ROLE_DESCRIPTION, "displayType", "Lcom/ellation/crunchyroll/api/model/DisplayType;", "links", "Lcom/ellation/crunchyroll/api/model/HomeFeedItemLinks;", "panel", "Lcom/ellation/crunchyroll/model/Panel;", "objectData", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/ellation/crunchyroll/api/model/HomeFeedItemResourceType;Lcom/ellation/crunchyroll/api/model/HomeFeedItemResponseType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/model/DisplayType;Lcom/ellation/crunchyroll/api/model/HomeFeedItemLinks;Lcom/ellation/crunchyroll/model/Panel;Ljava/lang/Object;)V", "get_id", "()Ljava/lang/String;", "channelId", "getChannelId", "collectionItems", "getCollectionItems", "()Ljava/util/List;", "getDescription", "getDisplayType", "()Lcom/ellation/crunchyroll/api/model/DisplayType;", "id", "getId", "ids", "getIds", "itemsIds", "getItemsIds", "link", "getLink", "getLinks", "()Lcom/ellation/crunchyroll/api/model/HomeFeedItemLinks;", "getObjectData", "()Ljava/lang/Object;", "getPanel", "()Lcom/ellation/crunchyroll/model/Panel;", "resourceType", "getResourceType", "()Lcom/ellation/crunchyroll/api/model/HomeFeedItemResourceType;", "responseType", "getResponseType", "()Lcom/ellation/crunchyroll/api/model/HomeFeedItemResponseType;", "getTitle", "equals", "", "other", "hashCode", "", "isValid", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class HomeFeedItemRaw {
    public static final int $stable = 8;
    @SerializedName("channel_id")
    private final String _channelId;
    @SerializedName("collection_items")
    private final List<MusicCollectionItem> _collectionItems;
    @SerializedName("id")
    private final String _id;
    @SerializedName("ids")
    private final List<String> _ids;
    @SerializedName("link")
    private final String _link;
    @SerializedName("resource_type")
    private final HomeFeedItemResourceType _resourceType;
    @SerializedName("response_type")
    private final HomeFeedItemResponseType _responseType;
    @SerializedName(MediaTrack.ROLE_DESCRIPTION)
    private final String description;
    @SerializedName("display_type")
    private final DisplayType displayType;
    @SerializedName("__links__")
    private final HomeFeedItemLinks links;
    @SerializedName("object")
    private final Object objectData;
    @SerializedName("panel")
    private final Panel panel;
    @SerializedName("title")
    private final String title;

    public HomeFeedItemRaw(String str, List<String> list, List<MusicCollectionItem> list2, HomeFeedItemResourceType homeFeedItemResourceType, HomeFeedItemResponseType homeFeedItemResponseType, String str2, String str3, String str4, String str5, DisplayType displayType, HomeFeedItemLinks homeFeedItemLinks, Panel panel, Object obj) {
        this._id = str;
        this._ids = list;
        this._collectionItems = list2;
        this._resourceType = homeFeedItemResourceType;
        this._responseType = homeFeedItemResponseType;
        this._channelId = str2;
        this._link = str3;
        this.title = str4;
        this.description = str5;
        this.displayType = displayType;
        this.links = homeFeedItemLinks;
        this.panel = panel;
        this.objectData = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeFeedItemRaw)) {
            return false;
        }
        HomeFeedItemRaw homeFeedItemRaw = (HomeFeedItemRaw) obj;
        if (j.a(get_id(), homeFeedItemRaw.get_id()) && j.a(this._ids, homeFeedItemRaw._ids) && j.a(this._collectionItems, homeFeedItemRaw._collectionItems) && this._resourceType == homeFeedItemRaw._resourceType && this._responseType == homeFeedItemRaw._responseType && j.a(this._channelId, homeFeedItemRaw._channelId) && j.a(this._link, homeFeedItemRaw._link) && j.a(this.title, homeFeedItemRaw.title) && j.a(this.description, homeFeedItemRaw.description) && this.displayType == homeFeedItemRaw.displayType && j.a(this.links, homeFeedItemRaw.links) && j.a(this.panel, homeFeedItemRaw.panel) && j.a(this.objectData, homeFeedItemRaw.objectData)) {
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

    public final List<MusicCollectionItem> getCollectionItems() {
        List<MusicCollectionItem> list = this._collectionItems;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    public final String getId() {
        String str = get_id();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List<String> getIds() {
        List<String> list = this._ids;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final List<String> getItemsIds() {
        List<String> ids = getIds();
        if (!(!ids.isEmpty())) {
            ids = null;
        }
        if (ids == null) {
            List<MusicCollectionItem> collectionItems = getCollectionItems();
            ArrayList arrayList = new ArrayList(r.Y(collectionItems));
            for (MusicCollectionItem musicCollectionItem : collectionItems) {
                arrayList.add(musicCollectionItem.getId());
            }
            return arrayList;
        }
        return ids;
    }

    public final String getLink() {
        Href resource;
        String href;
        HomeFeedItemLinks homeFeedItemLinks = this.links;
        if (homeFeedItemLinks == null || (resource = homeFeedItemLinks.getResource()) == null || (href = resource.getHref()) == null) {
            String str = this._link;
            if (str == null) {
                return "";
            }
            return str;
        }
        return href;
    }

    public final HomeFeedItemLinks getLinks() {
        return this.links;
    }

    public final Object getObjectData() {
        return this.objectData;
    }

    public final Panel getPanel() {
        return this.panel;
    }

    public final HomeFeedItemResourceType getResourceType() {
        HomeFeedItemResourceType homeFeedItemResourceType = this._resourceType;
        if (homeFeedItemResourceType != null) {
            return homeFeedItemResourceType;
        }
        throw new IllegalArgumentException("resource_type cannot be null. Use HomeFeedItemRaw#isValid() first.");
    }

    public final HomeFeedItemResponseType getResponseType() {
        HomeFeedItemResponseType homeFeedItemResponseType = this._responseType;
        if (homeFeedItemResponseType == null) {
            return HomeFeedItemResponseType.UNDEFINED;
        }
        return homeFeedItemResponseType;
    }

    public final String getTitle() {
        return this.title;
    }

    public String get_id() {
        return this._id;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str = get_id();
        int i13 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i14 = i * 31;
        List<String> list = this._ids;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        List<MusicCollectionItem> list2 = this._collectionItems;
        if (list2 != null) {
            i3 = list2.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        HomeFeedItemResourceType homeFeedItemResourceType = this._resourceType;
        if (homeFeedItemResourceType != null) {
            i4 = homeFeedItemResourceType.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        HomeFeedItemResponseType homeFeedItemResponseType = this._responseType;
        if (homeFeedItemResponseType != null) {
            i5 = homeFeedItemResponseType.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 31;
        String str2 = this._channelId;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 31;
        String str3 = this._link;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (i19 + i7) * 31;
        String str4 = this.title;
        if (str4 != null) {
            i8 = str4.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 31;
        String str5 = this.description;
        if (str5 != null) {
            i9 = str5.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 31;
        DisplayType displayType = this.displayType;
        if (displayType != null) {
            i10 = displayType.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 31;
        HomeFeedItemLinks homeFeedItemLinks = this.links;
        if (homeFeedItemLinks != null) {
            i11 = homeFeedItemLinks.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 31;
        Panel panel = this.panel;
        if (panel != null) {
            i12 = panel.hashCode();
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 31;
        Object obj = this.objectData;
        if (obj != null) {
            i13 = obj.hashCode();
        }
        return i25 + i13;
    }

    public final boolean isValid() {
        boolean z;
        String str = get_id();
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || this._resourceType == null) {
            return false;
        }
        return true;
    }

    public /* synthetic */ HomeFeedItemRaw(String str, List list, List list2, HomeFeedItemResourceType homeFeedItemResourceType, HomeFeedItemResponseType homeFeedItemResponseType, String str2, String str3, String str4, String str5, DisplayType displayType, HomeFeedItemLinks homeFeedItemLinks, Panel panel, Object obj, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, homeFeedItemResourceType, (i & 16) != 0 ? null : homeFeedItemResponseType, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : displayType, (i & 1024) != 0 ? null : homeFeedItemLinks, (i & 2048) != 0 ? null : panel, (i & 4096) != 0 ? null : obj);
    }
}
