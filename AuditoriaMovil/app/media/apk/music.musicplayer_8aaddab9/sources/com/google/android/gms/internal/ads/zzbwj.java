package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzbwj implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set<String> zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzblv zzg;
    private final boolean zzi;
    private final String zzk;
    private final List<String> zzh = new ArrayList();
    private final Map<String, Boolean> zzj = new HashMap();

    public zzbwj(Date date, int i2, Set<String> set, Location location, boolean z, int i3, zzblv zzblvVar, List<String> list, boolean z2, int i4, String str) {
        this.zza = date;
        this.zzb = i2;
        this.zzc = set;
        this.zze = location;
        this.zzd = z;
        this.zzf = i3;
        this.zzg = zzblvVar;
        this.zzi = z2;
        this.zzk = str;
        if (list != null) {
            for (String str2 : list) {
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.zzj.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.zzj.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzbhs.zze().zzh();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        zzblv zzblvVar = this.zzg;
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
                builder.setImageOrientation(zzblvVar.zzc);
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
        builder.setImageOrientation(zzblvVar.zzc);
        builder.setRequestMultipleImages(zzblvVar.zzd);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzblv.zza(this.zzg);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzbhs.zze().zzj();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zza() {
        return this.zzh.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map<String, Boolean> zzb() {
        return this.zzj;
    }
}
