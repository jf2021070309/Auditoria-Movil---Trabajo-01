package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;
/* loaded from: classes.dex */
public final class zzcbw extends zzcby {
    private final String zza;
    private final int zzb;

    public zzcbw(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcbw)) {
            zzcbw zzcbwVar = (zzcbw) obj;
            if (Objects.equal(this.zza, zzcbwVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzcbwVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final int zzc() {
        return this.zzb;
    }
}
