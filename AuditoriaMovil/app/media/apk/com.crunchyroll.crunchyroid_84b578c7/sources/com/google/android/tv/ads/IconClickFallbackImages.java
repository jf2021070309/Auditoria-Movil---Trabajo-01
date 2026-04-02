package com.google.android.tv.ads;

import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.atv_ads_framework.zzab;
import java.util.List;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public abstract class IconClickFallbackImages implements Parcelable {

    /* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @KeepForSdk
        public abstract IconClickFallbackImages build();
    }

    @KeepForSdk
    public static Builder builder(List<IconClickFallbackImage> list) {
        list.getClass();
        zzb zzbVar = new zzb();
        zzbVar.zza(zzab.zzk(list));
        return zzbVar;
    }

    @KeepForSdk
    public abstract List<IconClickFallbackImage> getIconClickFallbackImageList();
}
