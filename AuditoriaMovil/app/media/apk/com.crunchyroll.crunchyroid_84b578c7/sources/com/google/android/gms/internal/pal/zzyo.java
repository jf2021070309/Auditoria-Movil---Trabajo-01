package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzyo implements zzkq {
    private final zzrj zza;
    private final int zzb;

    public zzyo(zzrj zzrjVar, int i) throws GeneralSecurityException {
        this.zza = zzrjVar;
        this.zzb = i;
        if (i >= 10) {
            zzrjVar.zza(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // com.google.android.gms.internal.pal.zzkq
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        return this.zza.zza(bArr, this.zzb);
    }
}
