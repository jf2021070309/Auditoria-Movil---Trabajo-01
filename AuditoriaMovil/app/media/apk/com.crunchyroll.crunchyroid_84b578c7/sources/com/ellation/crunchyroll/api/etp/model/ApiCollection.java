package com.ellation.crunchyroll.api.etp.model;

import com.amazon.aps.iva.lb0.z;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ApiCollection.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/model/ApiCollection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "_items", "", "(Ljava/util/List;)V", FirebaseAnalytics.Param.ITEMS, "getItems", "()Ljava/util/List;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApiCollection<T> {
    public static final int $stable = 8;
    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<T> _items;

    /* JADX WARN: Multi-variable type inference failed */
    public ApiCollection(List<? extends T> list) {
        this._items = list;
    }

    public final List<T> getItems() {
        List<T> list = this._items;
        if (list == null) {
            return z.b;
        }
        return list;
    }
}
