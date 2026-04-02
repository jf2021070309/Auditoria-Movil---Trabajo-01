package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzqw implements zzkq {
    private final zzlb zza;
    private final zzrc zzb;
    private final zzrc zzc;

    public /* synthetic */ zzqw(zzlb zzlbVar, zzqv zzqvVar) {
        zzrc zzrcVar;
        this.zza = zzlbVar;
        if (zzlbVar.zze()) {
            zzrd zzb = zzpi.zza().zzb();
            zzri zza = zzpf.zza(zzlbVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            zzrcVar = zzb.zza(zza, "mac", "verify");
        } else {
            zzrcVar = zzpf.zza;
            this.zzb = zzrcVar;
        }
        this.zzc = zzrcVar;
    }

    @Override // com.google.android.gms.internal.pal.zzkq
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        if (this.zza.zza().zzf() == 4) {
            bArr2 = zzqx.zzb;
            bArr = zzxo.zzc(bArr, bArr2);
        }
        byte[] zzc = zzxo.zzc(this.zza.zza().zzd(), ((zzkq) this.zza.zza().zzc()).zza(bArr));
        this.zza.zza().zza();
        return zzc;
    }
}
