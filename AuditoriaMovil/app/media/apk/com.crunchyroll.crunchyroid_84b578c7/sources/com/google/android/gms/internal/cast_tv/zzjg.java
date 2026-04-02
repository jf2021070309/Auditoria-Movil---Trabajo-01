package com.google.android.gms.internal.cast_tv;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzjg implements zzjn {
    private final zzjc zza;
    private final zzke zzb;
    private final boolean zzc;
    private final zzhi zzd;

    private zzjg(zzke zzkeVar, zzhi zzhiVar, zzjc zzjcVar) {
        this.zzb = zzkeVar;
        this.zzc = zzhiVar.zzc(zzjcVar);
        this.zzd = zzhiVar;
        this.zza = zzjcVar;
    }

    public static zzjg zzc(zzke zzkeVar, zzhi zzhiVar, zzjc zzjcVar) {
        return new zzjg(zzkeVar, zzhiVar, zzjcVar);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final int zza(Object obj) {
        zzke zzkeVar = this.zzb;
        int zzb = zzkeVar.zzb(zzkeVar.zzd(obj));
        if (!this.zzc) {
            return zzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final Object zze() {
        zzjc zzjcVar = this.zza;
        if (zzjcVar instanceof zzht) {
            return ((zzht) zzjcVar).zzs();
        }
        return zzjcVar.zzE().zzk();
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final void zzf(Object obj) {
        this.zzb.zzh(obj);
        this.zzd.zzb(obj);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final void zzg(Object obj, Object obj2) {
        zzjp.zzC(this.zzb, obj, obj2);
        if (!this.zzc) {
            return;
        }
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzgg zzggVar) throws IOException {
        zzht zzhtVar = (zzht) obj;
        if (zzhtVar.zzc == zzkf.zzc()) {
            zzhtVar.zzc = zzkf.zzf();
        }
        zzhr zzhrVar = (zzhr) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final void zzi(Object obj, zzkw zzkwVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }
}
