package com.ellation.crunchyroll.api.etp.assets.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: AvatarAsset.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/assets/model/AvatarAsset;", "", "id", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AvatarAsset {
    public static final int $stable = 0;
    @SerializedName("id")
    private final String id;
    @SerializedName("title")
    private final String title;

    public AvatarAsset(String str, String str2) {
        j.f(str, "id");
        j.f(str2, "title");
        this.id = str;
        this.title = str2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }
}
