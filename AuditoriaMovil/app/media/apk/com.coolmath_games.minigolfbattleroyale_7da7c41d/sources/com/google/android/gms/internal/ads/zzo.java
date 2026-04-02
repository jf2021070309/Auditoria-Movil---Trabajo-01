package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzo {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzo(zzo zzoVar) {
        this.zza = zzoVar.zza;
        this.zzb = zzoVar.zzb;
        this.zzc = zzoVar.zzc;
        this.zzd = zzoVar.zzd;
        this.zze = zzoVar.zze;
    }

    public zzo(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private zzo(Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzo) {
            zzo zzoVar = (zzo) obj;
            return this.zza.equals(zzoVar.zza) && this.zzb == zzoVar.zzb && this.zzc == zzoVar.zzc && this.zzd == zzoVar.zzd && this.zze == zzoVar.zze;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzo zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzo(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzo(Object obj, long j) {
        this(obj, -1, -1, -1L, -1);
    }

    public zzo(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
