package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
/* loaded from: classes.dex */
public final class zzblv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblv> CREATOR = new zzblw();
    @SafeParcelable.Field(id = 1)
    public final int zza;
    @SafeParcelable.Field(id = 2)
    public final boolean zzb;
    @SafeParcelable.Field(id = 3)
    public final int zzc;
    @SafeParcelable.Field(id = 4)
    public final boolean zzd;
    @SafeParcelable.Field(id = 5)
    public final int zze;
    @SafeParcelable.Field(id = 6)
    public final zzbis zzf;
    @SafeParcelable.Field(id = 7)
    public final boolean zzg;
    @SafeParcelable.Field(id = 8)
    public final int zzh;

    @SafeParcelable.Constructor
    public zzblv(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) int i4, @SafeParcelable.Param(id = 6) zzbis zzbisVar, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) int i5) {
        this.zza = i2;
        this.zzb = z;
        this.zzc = i3;
        this.zzd = z2;
        this.zze = i4;
        this.zzf = zzbisVar;
        this.zzg = z3;
        this.zzh = i5;
    }

    public zzblv(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzbis(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio());
    }

    public static com.google.android.gms.ads.nativead.NativeAdOptions zza(zzblv zzblvVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzblvVar == null) {
            return builder.build();
        }
        int i2 = zzblvVar.zza;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    builder.setRequestCustomMuteThisAd(zzblvVar.zzg);
                    builder.setMediaAspectRatio(zzblvVar.zzh);
                }
                builder.setReturnUrlsForImageAssets(zzblvVar.zzb);
                builder.setRequestMultipleImages(zzblvVar.zzd);
                return builder.build();
            }
            zzbis zzbisVar = zzblvVar.zzf;
            if (zzbisVar != null) {
                builder.setVideoOptions(new VideoOptions(zzbisVar));
            }
        }
        builder.setAdChoicesPlacement(zzblvVar.zze);
        builder.setReturnUrlsForImageAssets(zzblvVar.zzb);
        builder.setRequestMultipleImages(zzblvVar.zzd);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i2, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
