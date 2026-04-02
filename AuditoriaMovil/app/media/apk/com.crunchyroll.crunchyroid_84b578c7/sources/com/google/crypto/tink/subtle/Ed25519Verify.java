package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public final class Ed25519Verify implements PublicKeyVerify {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private final com.google.crypto.tink.util.Bytes publicKey;

    public Ed25519Verify(byte[] bArr) {
        if (FIPS.isCompatible()) {
            if (bArr.length == 32) {
                this.publicKey = com.google.crypto.tink.util.Bytes.copyFrom(bArr);
                return;
            }
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length == 64) {
            if (Ed25519.verify(bArr2, bArr, this.publicKey.toByteArray())) {
                return;
            }
            throw new GeneralSecurityException("Signature check failed.");
        }
        throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
    }
}
