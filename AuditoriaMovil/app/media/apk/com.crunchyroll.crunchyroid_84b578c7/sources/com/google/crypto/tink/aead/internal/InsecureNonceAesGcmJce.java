package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.SubtleUtil;
import com.google.crypto.tink.subtle.Validators;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes4.dex */
public final class InsecureNonceAesGcmJce {
    public static final int IV_SIZE_IN_BYTES = 12;
    public static final int TAG_SIZE_IN_BYTES = 16;
    private final SecretKey keySpec;
    private final boolean prependIv;
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final ThreadLocal<Cipher> localCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.1
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };

    public InsecureNonceAesGcmJce(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (FIPS.isCompatible()) {
            Validators.validateAesKeySize(bArr.length);
            this.keySpec = new SecretKeySpec(bArr, "AES");
            this.prependIv = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    private static AlgorithmParameterSpec getParams(byte[] bArr) throws GeneralSecurityException {
        return getParams(bArr, 0, bArr.length);
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i;
        int length;
        if (bArr.length == 12) {
            boolean z = this.prependIv;
            if (z) {
                i = 28;
            } else {
                i = 16;
            }
            if (bArr2.length >= i) {
                int i2 = 0;
                if (z && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec params = getParams(bArr);
                ThreadLocal<Cipher> threadLocal = localCipher;
                threadLocal.get().init(2, this.keySpec, params);
                if (bArr3 != null && bArr3.length != 0) {
                    threadLocal.get().updateAAD(bArr3);
                }
                boolean z2 = this.prependIv;
                if (z2) {
                    i2 = 12;
                }
                if (z2) {
                    length = bArr2.length - 12;
                } else {
                    length = bArr2.length;
                }
                return threadLocal.get().doFinal(bArr2, i2, length);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length;
        int i;
        if (bArr.length == 12) {
            if (bArr2.length <= 2147483619) {
                boolean z = this.prependIv;
                if (z) {
                    length = bArr2.length + 12;
                } else {
                    length = bArr2.length;
                }
                byte[] bArr4 = new byte[length + 16];
                if (z) {
                    System.arraycopy(bArr, 0, bArr4, 0, 12);
                }
                AlgorithmParameterSpec params = getParams(bArr);
                ThreadLocal<Cipher> threadLocal = localCipher;
                threadLocal.get().init(1, this.keySpec, params);
                if (bArr3 != null && bArr3.length != 0) {
                    threadLocal.get().updateAAD(bArr3);
                }
                if (this.prependIv) {
                    i = 12;
                } else {
                    i = 0;
                }
                int doFinal = threadLocal.get().doFinal(bArr2, 0, bArr2.length, bArr4, i);
                if (doFinal == bArr2.length + 16) {
                    return bArr4;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr2.length)));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    private static AlgorithmParameterSpec getParams(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        if (SubtleUtil.isAndroid() && SubtleUtil.androidApiLevel() <= 19) {
            return new IvParameterSpec(bArr, i, i2);
        }
        return new GCMParameterSpec(128, bArr, i, i2);
    }
}
