package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzd {
    public final long zzb = 0;
    private final zzc[] zze;
    public static final zzd zza = new zzd(null, new zzc[0], 0, -9223372036854775807L, 0);
    private static final zzc zzd = new zzc(0).zzb(0);
    public static final zzadw<zzd> zzc = zza.zza;

    private zzd(Object obj, zzc[] zzcVarArr, long j, long j2, int i) {
        this.zze = zzcVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzd zzdVar = (zzd) obj;
            if (zzamq.zzc(null, null) && Arrays.equals(this.zze, zzdVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.zze);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }

    public final zzc zza(int i) {
        return i < 0 ? zzd : this.zze[i];
    }
}
