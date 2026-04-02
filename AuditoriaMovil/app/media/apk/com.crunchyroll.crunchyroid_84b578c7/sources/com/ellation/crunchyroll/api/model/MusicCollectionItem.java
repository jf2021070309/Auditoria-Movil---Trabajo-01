package com.ellation.crunchyroll.api.model;

import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: HomeFeedItemRaw.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ellation/crunchyroll/api/model/MusicCollectionItem;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/amazon/aps/iva/x50/t;", "type", "Lcom/amazon/aps/iva/x50/t;", "getType", "()Lcom/amazon/aps/iva/x50/t;", "<init>", "(Ljava/lang/String;Lcom/amazon/aps/iva/x50/t;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MusicCollectionItem {
    public static final int $stable = 0;
    @SerializedName("id")
    private final String id;
    @SerializedName("type")
    private final t type;

    public MusicCollectionItem(String str, t tVar) {
        j.f(str, "id");
        j.f(tVar, "type");
        this.id = str;
        this.type = tVar;
    }

    public final String getId() {
        return this.id;
    }

    public final t getType() {
        return this.type;
    }
}
