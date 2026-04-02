package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzaee {
    public static final zzaee zza = new zzaee(0, 0, 0);
    public static final zzadw<zzaee> zze = zzaed.zza;
    public final int zzb = 0;
    public final int zzc;
    public final int zzd;

    public zzaee(int i2, int i3, int i4) {
        this.zzc = i3;
        this.zzd = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaee) {
            zzaee zzaeeVar = (zzaee) obj;
            int i2 = zzaeeVar.zzb;
            return this.zzc == zzaeeVar.zzc && this.zzd == zzaeeVar.zzd;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzc + 16337) * 31) + this.zzd;
    }
}
