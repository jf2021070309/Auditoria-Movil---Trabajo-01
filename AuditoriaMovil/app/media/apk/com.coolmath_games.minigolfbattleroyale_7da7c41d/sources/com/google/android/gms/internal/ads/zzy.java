package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzy {
    public static final zzy zza = new zzy(0, 0, 0, 1.0f);
    public static final zzadw<zzy> zzf = zzx.zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;

    public zzy(int i, int i2, int i3, float f) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = f;
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
        return ((((((this.zzb + 217) * 31) + this.zzc) * 31) + this.zzd) * 31) + Float.floatToRawIntBits(this.zze);
    }
}
