package com.google.android.gms.internal.cast_tv;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzkg extends zzke {
    @Override // com.google.android.gms.internal.cast_tv.zzke
    public final /* synthetic */ int zza(Object obj) {
        return ((zzkf) obj).zza();
    }

    @Override // com.google.android.gms.internal.cast_tv.zzke
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzkf) obj).zzb();
    }

    @Override // com.google.android.gms.internal.cast_tv.zzke
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzht zzhtVar = (zzht) obj;
        zzkf zzkfVar = zzhtVar.zzc;
        if (zzkfVar == zzkf.zzc()) {
            zzkf zzf = zzkf.zzf();
            zzhtVar.zzc = zzf;
            return zzf;
        }
        return zzkfVar;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzke
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzht) obj).zzc;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzke
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (!zzkf.zzc().equals(obj2)) {
            if (zzkf.zzc().equals(obj)) {
                return zzkf.zze((zzkf) obj, (zzkf) obj2);
            }
            ((zzkf) obj).zzd((zzkf) obj2);
            return obj;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzke
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i, zzgu zzguVar) {
        ((zzkf) obj).zzj((i << 3) | 2, zzguVar);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzke
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i, long j) {
        ((zzkf) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.cast_tv.zzke
    public final void zzh(Object obj) {
        ((zzht) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.cast_tv.zzke
    public final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzht) obj).zzc = (zzkf) obj2;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzke
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzht) obj).zzc = (zzkf) obj2;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzke
    public final /* synthetic */ void zzk(Object obj, zzkw zzkwVar) throws IOException {
        ((zzkf) obj).zzk(zzkwVar);
    }
}
