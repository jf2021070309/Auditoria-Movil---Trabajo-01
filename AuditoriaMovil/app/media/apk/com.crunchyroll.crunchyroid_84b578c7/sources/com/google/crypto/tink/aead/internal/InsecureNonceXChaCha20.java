package com.google.crypto.tink.aead.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
/* loaded from: classes4.dex */
public class InsecureNonceXChaCha20 extends InsecureNonceChaCha20Base {
    public static final int NONCE_SIZE_IN_BYTES = 24;

    public InsecureNonceXChaCha20(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    public static int[] hChaCha20(int[] iArr, int[] iArr2) {
        ChaCha20Util.setSigmaAndKey(r0, iArr);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr2[0], iArr2[1], iArr2[2], iArr2[3]};
        ChaCha20Util.shuffleState(iArr3);
        return Arrays.copyOf(iArr3, 8);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public int[] createInitialState(int[] iArr, int i) {
        if (iArr.length == nonceSizeInBytes() / 4) {
            int[] iArr2 = new int[16];
            ChaCha20Util.setSigmaAndKey(iArr2, hChaCha20(this.key, iArr));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        return super.decrypt(bArr, byteBuffer);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ void encrypt(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.encrypt(byteBuffer, bArr, bArr2);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public int nonceSizeInBytes() {
        return 24;
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.decrypt(bArr, bArr2);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.encrypt(bArr, bArr2);
    }
}
