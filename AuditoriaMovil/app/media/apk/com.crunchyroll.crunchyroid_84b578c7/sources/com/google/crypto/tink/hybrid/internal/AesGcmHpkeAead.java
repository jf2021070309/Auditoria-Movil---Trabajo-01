package com.google.crypto.tink.hybrid.internal;

import com.amazon.aps.iva.q.c0;
import com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
@Immutable
/* loaded from: classes4.dex */
final class AesGcmHpkeAead implements HpkeAead {
    private final int keyLength;

    public AesGcmHpkeAead(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(c0.a("Unsupported key length: ", i));
        }
        this.keyLength = i;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] getAeadId() throws GeneralSecurityException {
        int i = this.keyLength;
        if (i != 16) {
            if (i == 32) {
                return HpkeUtil.AES_256_GCM_AEAD_ID;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return HpkeUtil.AES_128_GCM_AEAD_ID;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getKeyLength() {
        return this.keyLength;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getNonceLength() {
        return 12;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] open(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == this.keyLength) {
            return new InsecureNonceAesGcmJce(bArr, false).decrypt(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] seal(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == this.keyLength) {
            return new InsecureNonceAesGcmJce(bArr, false).encrypt(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
    }
}
