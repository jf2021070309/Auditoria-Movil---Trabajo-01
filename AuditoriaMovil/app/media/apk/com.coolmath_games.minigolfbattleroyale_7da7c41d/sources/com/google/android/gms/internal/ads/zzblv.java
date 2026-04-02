package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzblv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblv> CREATOR = new zzblw();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final zzbis zzf;
    public final boolean zzg;
    public final int zzh;

    public zzblv(int i, boolean z, int i2, boolean z2, int i3, zzbis zzbisVar, boolean z3, int i4) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = zzbisVar;
        this.zzg = z3;
        this.zzh = i4;
    }

    public static NativeAdOptions zza(zzblv zzblvVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzblvVar == null) {
            return builder.build();
        }
        int i = zzblvVar.zza;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
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
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzblv(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzbis(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio());
    }
}
