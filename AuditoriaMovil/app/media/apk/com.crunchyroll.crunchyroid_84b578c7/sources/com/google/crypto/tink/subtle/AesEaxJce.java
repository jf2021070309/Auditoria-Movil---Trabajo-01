package com.google.crypto.tink.subtle;

import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes4.dex */
public final class AesEaxJce implements Aead {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int BLOCK_SIZE_IN_BYTES = 16;
    static final int TAG_SIZE_IN_BYTES = 16;
    private final byte[] b;
    private final int ivSizeInBytes;
    private final SecretKeySpec keySpec;
    private final byte[] p;
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final ThreadLocal<Cipher> localEcbCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.1
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };
    private static final ThreadLocal<Cipher> localCtrCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.2
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };

    public AesEaxJce(byte[] bArr, int i) throws GeneralSecurityException {
        if (FIPS.isCompatible()) {
            if (i != 12 && i != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.ivSizeInBytes = i;
            Validators.validateAesKeySize(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.keySpec = secretKeySpec;
            Cipher cipher = localEcbCipher.get();
            cipher.init(1, secretKeySpec);
            byte[] multiplyByX = multiplyByX(cipher.doFinal(new byte[16]));
            this.b = multiplyByX;
            this.p = multiplyByX(multiplyByX);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private static byte[] multiplyByX(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & UnsignedBytes.MAX_VALUE) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private byte[] omac(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(xor(bArr2, this.b));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        return cipher.doFinal(xor(doFinal, pad(Arrays.copyOfRange(bArr, i4 + i2, i2 + i3))));
    }

    private byte[] pad(byte[] bArr) {
        if (bArr.length == 16) {
            return xor(bArr, this.b);
        }
        byte[] copyOf = Arrays.copyOf(this.p, 16);
        for (int i = 0; i < bArr.length; i++) {
            copyOf[i] = (byte) (copyOf[i] ^ bArr[i]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ UnsignedBytes.MAX_POWER_OF_TWO);
        return copyOf;
    }

    private static byte[] xor(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = (bArr.length - this.ivSizeInBytes) - 16;
        if (length >= 0) {
            Cipher cipher = localEcbCipher.get();
            cipher.init(1, this.keySpec);
            byte[] omac = omac(cipher, 0, bArr, 0, this.ivSizeInBytes);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] omac2 = omac(cipher, 1, bArr3, 0, bArr3.length);
            byte[] omac3 = omac(cipher, 2, bArr, this.ivSizeInBytes, length);
            int length2 = bArr.length - 16;
            byte b = 0;
            for (int i = 0; i < 16; i++) {
                b = (byte) (b | (((bArr[length2 + i] ^ omac2[i]) ^ omac[i]) ^ omac3[i]));
            }
            if (b == 0) {
                Cipher cipher2 = localCtrCipher.get();
                cipher2.init(1, this.keySpec, new IvParameterSpec(omac));
                return cipher2.doFinal(bArr, this.ivSizeInBytes, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = bArr.length;
        int i = this.ivSizeInBytes;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr4 = new byte[bArr.length + i + 16];
            byte[] randBytes = Random.randBytes(i);
            System.arraycopy(randBytes, 0, bArr4, 0, this.ivSizeInBytes);
            Cipher cipher = localEcbCipher.get();
            cipher.init(1, this.keySpec);
            byte[] omac = omac(cipher, 0, randBytes, 0, randBytes.length);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] omac2 = omac(cipher, 1, bArr3, 0, bArr3.length);
            Cipher cipher2 = localCtrCipher.get();
            cipher2.init(1, this.keySpec, new IvParameterSpec(omac));
            cipher2.doFinal(bArr, 0, bArr.length, bArr4, this.ivSizeInBytes);
            byte[] omac3 = omac(cipher, 2, bArr4, this.ivSizeInBytes, bArr.length);
            int length2 = bArr.length + this.ivSizeInBytes;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr4[length2 + i2] = (byte) ((omac2[i2] ^ omac[i2]) ^ omac3[i2]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
