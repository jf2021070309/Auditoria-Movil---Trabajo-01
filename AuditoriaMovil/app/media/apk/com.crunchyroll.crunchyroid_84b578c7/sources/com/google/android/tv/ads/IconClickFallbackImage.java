package com.google.android.tv.ads;

import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public abstract class IconClickFallbackImage implements Parcelable {

    /* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @KeepForSdk
        public abstract IconClickFallbackImage build();

        @KeepForSdk
        public abstract Builder setAltText(String str);

        @KeepForSdk
        public abstract Builder setCreativeType(String str);

        @KeepForSdk
        public abstract Builder setHeight(int i);

        @KeepForSdk
        public abstract Builder setStaticResourceUri(String str);

        @KeepForSdk
        public abstract Builder setWidth(int i);
    }

    @KeepForSdk
    public static Builder builder() {
        zza zzaVar = new zza();
        zzaVar.setWidth(0);
        zzaVar.setHeight(0);
        zzaVar.setAltText("");
        zzaVar.setCreativeType("");
        zzaVar.setStaticResourceUri("");
        return zzaVar;
    }

    @KeepForSdk
    public abstract String getAltText();

    @KeepForSdk
    public abstract String getCreativeType();

    @KeepForSdk
    public abstract int getHeight();

    @KeepForSdk
    public abstract String getStaticResourceUri();

    @KeepForSdk
    public abstract int getWidth();
}
