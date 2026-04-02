package com.google.android.tv.ads;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* renamed from: com.google.android.tv.ads.$AutoValue_IconClickFallbackImages  reason: invalid class name */
/* loaded from: classes3.dex */
abstract class C$AutoValue_IconClickFallbackImages extends IconClickFallbackImages {
    private final List zza;

    public C$AutoValue_IconClickFallbackImages(List list) {
        if (list != null) {
            this.zza = list;
            return;
        }
        throw new NullPointerException("Null iconClickFallbackImageList");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IconClickFallbackImages) {
            return this.zza.equals(((IconClickFallbackImages) obj).getIconClickFallbackImageList());
        }
        return false;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImages
    @KeepForSdk
    public List<IconClickFallbackImage> getIconClickFallbackImageList() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        return e.e("IconClickFallbackImages{iconClickFallbackImageList=", this.zza.toString(), "}");
    }
}
