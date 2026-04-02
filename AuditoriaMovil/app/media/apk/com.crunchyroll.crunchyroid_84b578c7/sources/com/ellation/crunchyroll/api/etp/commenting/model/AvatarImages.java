package com.ellation.crunchyroll.api.etp.commenting.model;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AvatarImages.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/commenting/model/AvatarImages;", "", "_lockedImages", "", "Lcom/ellation/crunchyroll/api/etp/model/Image;", "_unlockedImages", "(Ljava/util/List;Ljava/util/List;)V", "lockedImages", "getLockedImages", "()Ljava/util/List;", "unlockedImages", "getUnlockedImages", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AvatarImages {
    public static final int $stable = 8;
    @SerializedName("locked")
    private final List<Image> _lockedImages;
    @SerializedName("unlocked")
    private final List<Image> _unlockedImages;

    public AvatarImages() {
        this(null, null, 3, null);
    }

    private final List<Image> component1() {
        return this._lockedImages;
    }

    private final List<Image> component2() {
        return this._unlockedImages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvatarImages copy$default(AvatarImages avatarImages, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = avatarImages._lockedImages;
        }
        if ((i & 2) != 0) {
            list2 = avatarImages._unlockedImages;
        }
        return avatarImages.copy(list, list2);
    }

    public final AvatarImages copy(List<Image> list, List<Image> list2) {
        return new AvatarImages(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarImages)) {
            return false;
        }
        AvatarImages avatarImages = (AvatarImages) obj;
        if (j.a(this._lockedImages, avatarImages._lockedImages) && j.a(this._unlockedImages, avatarImages._unlockedImages)) {
            return true;
        }
        return false;
    }

    public final List<Image> getLockedImages() {
        List<Image> list = this._lockedImages;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final List<Image> getUnlockedImages() {
        List<Image> list = this._unlockedImages;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public int hashCode() {
        int hashCode;
        List<Image> list = this._lockedImages;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<Image> list2 = this._unlockedImages;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        List<Image> list = this._lockedImages;
        List<Image> list2 = this._unlockedImages;
        return "AvatarImages(_lockedImages=" + list + ", _unlockedImages=" + list2 + ")";
    }

    public AvatarImages(List<Image> list, List<Image> list2) {
        this._lockedImages = list;
        this._unlockedImages = list2;
    }

    public /* synthetic */ AvatarImages(List list, List list2, int i, e eVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
