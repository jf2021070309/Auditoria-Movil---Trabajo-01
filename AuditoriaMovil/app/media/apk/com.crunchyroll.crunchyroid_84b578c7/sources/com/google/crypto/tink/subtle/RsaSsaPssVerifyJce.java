package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.Enums;
import com.google.errorprone.annotations.Immutable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
@Immutable
/* loaded from: classes4.dex */
public final class RsaSsaPssVerifyJce implements PublicKeyVerify {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final Enums.HashType mgf1Hash;
    private final RSAPublicKey publicKey;
    private final int saltLength;
    private final Enums.HashType sigHash;

    public RsaSsaPssVerifyJce(RSAPublicKey rSAPublicKey, Enums.HashType hashType, Enums.HashType hashType2, int i) throws GeneralSecurityException {
        if (FIPS.isCompatible()) {
            Validators.validateSignatureHash(hashType);
            Validators.validateRsaModulusSize(rSAPublicKey.getModulus().bitLength());
            Validators.validateRsaPublicExponent(rSAPublicKey.getPublicExponent());
            this.publicKey = rSAPublicKey;
            this.sigHash = hashType;
            this.mgf1Hash = hashType2;
            this.saltLength = i;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }

    private void emsaPssVerify(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        int i2;
        Validators.validateSignatureHash(this.sigHash);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(this.sigHash));
        byte[] digest = engineFactory.digest(bArr);
        int digestLength = engineFactory.getDigestLength();
        int length = bArr2.length;
        if (length >= this.saltLength + digestLength + 2) {
            if (bArr2[bArr2.length - 1] == -68) {
                int i3 = (length - digestLength) - 1;
                byte[] copyOf = Arrays.copyOf(bArr2, i3);
                byte[] copyOfRange = Arrays.copyOfRange(bArr2, copyOf.length, copyOf.length + digestLength);
                int i4 = 0;
                while (true) {
                    int i5 = i3;
                    MessageDigest messageDigest = engineFactory;
                    byte[] bArr3 = digest;
                    long j = (length * 8) - i;
                    if (i4 < j) {
                        if (((copyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) == 0) {
                            i4++;
                            i3 = i5;
                            engineFactory = messageDigest;
                            digest = bArr3;
                        } else {
                            throw new GeneralSecurityException("inconsistent");
                        }
                    } else {
                        byte[] mgf1 = SubtleUtil.mgf1(copyOfRange, i5, this.mgf1Hash);
                        int length2 = mgf1.length;
                        byte[] bArr4 = new byte[length2];
                        for (int i6 = 0; i6 < length2; i6++) {
                            bArr4[i6] = (byte) (mgf1[i6] ^ copyOf[i6]);
                        }
                        for (int i7 = 0; i7 <= j; i7++) {
                            int i8 = i7 / 8;
                            bArr4[i8] = (byte) ((~(1 << (7 - (i7 % 8)))) & bArr4[i8]);
                        }
                        int i9 = 0;
                        while (true) {
                            int i10 = this.saltLength;
                            if (i9 < (i2 - i10) - 2) {
                                if (bArr4[i9] == 0) {
                                    i9++;
                                } else {
                                    throw new GeneralSecurityException("inconsistent");
                                }
                            } else if (bArr4[(i2 - i10) - 2] == 1) {
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr4, length2 - i10, length2);
                                int i11 = digestLength + 8;
                                byte[] bArr5 = new byte[this.saltLength + i11];
                                System.arraycopy(bArr3, 0, bArr5, 8, bArr3.length);
                                System.arraycopy(copyOfRange2, 0, bArr5, i11, copyOfRange2.length);
                                if (Bytes.equal(messageDigest.digest(bArr5), copyOfRange)) {
                                    return;
                                }
                                throw new GeneralSecurityException("inconsistent");
                            } else {
                                throw new GeneralSecurityException("inconsistent");
                            }
                        }
                    }
                }
            } else {
                throw new GeneralSecurityException("inconsistent");
            }
        } else {
            throw new GeneralSecurityException("inconsistent");
        }
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        BigInteger publicExponent = this.publicKey.getPublicExponent();
        BigInteger modulus = this.publicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        int bitLength2 = ((modulus.bitLength() - 1) + 7) / 8;
        if (bitLength == bArr.length) {
            BigInteger bytes2Integer = SubtleUtil.bytes2Integer(bArr);
            if (bytes2Integer.compareTo(modulus) < 0) {
                emsaPssVerify(bArr2, SubtleUtil.integer2Bytes(bytes2Integer.modPow(publicExponent, modulus), bitLength2), modulus.bitLength() - 1);
                return;
            }
            throw new GeneralSecurityException("signature out of range");
        }
        throw new GeneralSecurityException("invalid signature's length");
    }
}
