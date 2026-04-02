package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.q.c0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zznv implements zzny {
    private final int zza;

    public zznv(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(c0.a("Unsupported key length: ", i));
        }
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.pal.zzny
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.pal.zzny
    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.zza;
        if (i != 16) {
            if (i == 32) {
                return zzol.zzj;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return zzol.zzi;
    }

    @Override // com.google.android.gms.internal.pal.zzny
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.zza) {
            return new zzmq(bArr, false).zza(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException(c0.a("Unexpected key length: ", length));
    }
}
