package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzjc {
    public final long zza;
    public final long zzb;

    public zzjc(long j2, long j3) {
        this.zza = j2;
        this.zzb = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjc) {
            zzjc zzjcVar = (zzjc) obj;
            return this.zza == zzjcVar.zza && this.zzb == zzjcVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
