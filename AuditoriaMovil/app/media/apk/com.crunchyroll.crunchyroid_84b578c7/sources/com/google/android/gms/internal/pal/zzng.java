package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzng implements zzjw {
    private final zzlb zza;
    private final zzrc zzb;
    private final zzrc zzc;

    public zzng(zzlb zzlbVar) {
        zzrc zzrcVar;
        this.zza = zzlbVar;
        if (zzlbVar.zze()) {
            zzrd zzb = zzpi.zza().zzb();
            zzri zza = zzpf.zza(zzlbVar);
            this.zzb = zzb.zza(zza, "daead", "encrypt");
            zzrcVar = zzb.zza(zza, "daead", "decrypt");
        } else {
            zzrcVar = zzpf.zza;
            this.zzb = zzrcVar;
        }
        this.zzc = zzrcVar;
    }

    @Override // com.google.android.gms.internal.pal.zzjw
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzc = zzxo.zzc(this.zza.zza().zzd(), ((zzjw) this.zza.zza().zzc()).zza(bArr, bArr2));
        this.zza.zza().zza();
        int length = bArr.length;
        return zzc;
    }
}
