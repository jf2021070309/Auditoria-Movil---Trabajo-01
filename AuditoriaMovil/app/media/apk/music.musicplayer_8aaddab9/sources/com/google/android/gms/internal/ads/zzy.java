package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzy {
    public static final zzy zza = new zzy(0, 0, 0, 1.0f);
    public static final zzadw<zzy> zzf = zzx.zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;

    public zzy(int i2, int i3, int i4, float f2) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzy) {
            zzy zzyVar = (zzy) obj;
            if (this.zzb == zzyVar.zzb && this.zzc == zzyVar.zzc && this.zzd == zzyVar.zzd && this.zze == zzyVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.zze) + ((((((this.zzb + 217) * 31) + this.zzc) * 31) + this.zzd) * 31);
    }
}
