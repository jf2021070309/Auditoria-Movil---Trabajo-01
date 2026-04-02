package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgfl {
    private final Object zza;
    private final int zzb;

    public zzgfl(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgfl) {
            zzgfl zzgflVar = (zzgfl) obj;
            return this.zza == zzgflVar.zza && this.zzb == zzgflVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
