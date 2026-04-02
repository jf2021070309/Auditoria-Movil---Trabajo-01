package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;
/* loaded from: classes.dex */
public final class zzbf {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbf(String str, double d2, double d3, double d4, int i2) {
        this.zza = str;
        this.zzc = d2;
        this.zzb = d3;
        this.zzd = d4;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbf) {
            zzbf zzbfVar = (zzbf) obj;
            return Objects.equal(this.zza, zzbfVar.zza) && this.zzb == zzbfVar.zzb && this.zzc == zzbfVar.zzc && this.zze == zzbfVar.zze && Double.compare(this.zzd, zzbfVar.zzd) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.zza).add("minBound", Double.valueOf(this.zzc)).add("maxBound", Double.valueOf(this.zzb)).add("percent", Double.valueOf(this.zzd)).add("count", Integer.valueOf(this.zze)).toString();
    }
}
