package com.ellation.crunchyroll.api.etp.assets.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AvatarCollection.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/assets/model/AvatarCollection;", "", "title", "", "assets", "", "Lcom/ellation/crunchyroll/api/etp/assets/model/AvatarAsset;", "(Ljava/lang/String;Ljava/util/List;)V", "getAssets", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AvatarCollection {
    public static final int $stable = 8;
    @SerializedName("assets")
    private final List<AvatarAsset> assets;
    @SerializedName("title")
    private final String title;

    public AvatarCollection(String str, List<AvatarAsset> list) {
        j.f(str, "title");
        j.f(list, "assets");
        this.title = str;
        this.assets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvatarCollection copy$default(AvatarCollection avatarCollection, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarCollection.title;
        }
        if ((i & 2) != 0) {
            list = avatarCollection.assets;
        }
        return avatarCollection.copy(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<AvatarAsset> component2() {
        return this.assets;
    }

    public final AvatarCollection copy(String str, List<AvatarAsset> list) {
        j.f(str, "title");
        j.f(list, "assets");
        return new AvatarCollection(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarCollection)) {
            return false;
        }
        AvatarCollection avatarCollection = (AvatarCollection) obj;
        if (j.a(this.title, avatarCollection.title) && j.a(this.assets, avatarCollection.assets)) {
            return true;
        }
        return false;
    }

    public final List<AvatarAsset> getAssets() {
        return this.assets;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.assets.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        String str = this.title;
        List<AvatarAsset> list = this.assets;
        return "AvatarCollection(title=" + str + ", assets=" + list + ")";
    }
}
