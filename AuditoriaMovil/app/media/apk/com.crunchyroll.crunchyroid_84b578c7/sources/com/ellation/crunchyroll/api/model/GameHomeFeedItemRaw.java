package com.ellation.crunchyroll.api.model;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: HomeFeedItemRaw.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ellation/crunchyroll/api/model/GameHomeFeedItemRaw;", "Lcom/ellation/crunchyroll/api/model/HomeFeedItemRaw;", "id", "", "title", MediaTrack.ROLE_DESCRIPTION, "_items", "", "Lcom/ellation/crunchyroll/api/model/GameItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", FirebaseAnalytics.Param.ITEMS, "getItems", "()Ljava/util/List;", "equals", "", "other", "", "hashCode", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GameHomeFeedItemRaw extends HomeFeedItemRaw {
    public static final int $stable = 8;
    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<GameItem> _items;

    public GameHomeFeedItemRaw() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.ellation.crunchyroll.api.model.HomeFeedItemRaw
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameHomeFeedItemRaw) || !super.equals(obj)) {
            return false;
        }
        GameHomeFeedItemRaw gameHomeFeedItemRaw = (GameHomeFeedItemRaw) obj;
        if (j.a(get_id(), gameHomeFeedItemRaw.get_id()) && j.a(this._items, gameHomeFeedItemRaw._items)) {
            return true;
        }
        return false;
    }

    public final List<GameItem> getItems() {
        List<GameItem> list = this._items;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    @Override // com.ellation.crunchyroll.api.model.HomeFeedItemRaw
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = get_id();
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        List<GameItem> list = this._items;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i3 + i2;
    }

    public /* synthetic */ GameHomeFeedItemRaw(String str, String str2, String str3, List list, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
    }

    public GameHomeFeedItemRaw(String str, String str2, String str3, List<GameItem> list) {
        super(str, null, null, HomeFeedItemResourceType.GAMES_COLLECTION, null, null, null, str2, str3, null, null, null, null, 7798, null);
        this._items = list;
    }
}
