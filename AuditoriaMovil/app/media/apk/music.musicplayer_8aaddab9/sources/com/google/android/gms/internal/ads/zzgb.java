package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class zzgb implements zzfz {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zzgb(boolean z, boolean z2) {
        int i2 = 1;
        if (!z && !z2) {
            i2 = 0;
        }
        this.zza = i2;
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final MediaCodecInfo zzb(int i2) {
        zzf();
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final boolean zze(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
