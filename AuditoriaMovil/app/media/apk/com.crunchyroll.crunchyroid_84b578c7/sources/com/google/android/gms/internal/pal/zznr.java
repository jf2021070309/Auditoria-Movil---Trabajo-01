package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zznr implements zzjy {
    final zzlb zza;

    public zznr(zzlb zzlbVar) {
        this.zza = zzlbVar;
    }

    @Override // com.google.android.gms.internal.pal.zzjy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzlb zzlbVar = this.zza;
        if (zzlbVar.zza() != null) {
            return zzxo.zzc(zzlbVar.zza().zzd(), ((zzjy) this.zza.zza().zzc()).zza(bArr, bArr2));
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
