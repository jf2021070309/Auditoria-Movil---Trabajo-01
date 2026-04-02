package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzlk implements zzjt {
    private final zzlb zza;
    private final zzrc zzb;
    private final zzrc zzc;

    public /* synthetic */ zzlk(zzlb zzlbVar, zzlj zzljVar) {
        zzrc zzrcVar;
        this.zza = zzlbVar;
        if (zzlbVar.zze()) {
            zzrd zzb = zzpi.zza().zzb();
            zzri zza = zzpf.zza(zzlbVar);
            this.zzb = zzb.zza(zza, "aead", "encrypt");
            zzrcVar = zzb.zza(zza, "aead", "decrypt");
        } else {
            zzrcVar = zzpf.zza;
            this.zzb = zzrcVar;
        }
        this.zzc = zzrcVar;
    }

    @Override // com.google.android.gms.internal.pal.zzjt
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzc = zzxo.zzc(this.zza.zza().zzd(), ((zzjt) this.zza.zza().zzc()).zza(bArr, bArr2));
        this.zza.zza().zza();
        int length = bArr.length;
        return zzc;
    }
}
