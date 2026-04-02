package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class zzgcy {
    private final ECPublicKey zza;

    public zzgcy(ECPublicKey eCPublicKey) {
        this.zza = eCPublicKey;
    }

    public final zzgcx zza(String str, byte[] bArr, byte[] bArr2, int i2, int i3) throws GeneralSecurityException {
        char c2;
        int i4;
        byte[] bArr3;
        int i5;
        byte[] bArr4;
        KeyPair zzc = zzgcz.zzc(this.zza.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) zzc.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) zzc.getPrivate();
        ECPublicKey eCPublicKey2 = this.zza;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey2.getW();
            zzgcz.zza(w, eCPrivateKey.getParams().getCurve());
            PublicKey generatePublic = zzgdb.zzg.zzb("EC").generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement zzb = zzgdb.zze.zzb("ECDH");
            zzb.init(eCPrivateKey);
            int i6 = 1;
            try {
                zzb.doPhase(generatePublic, true);
                byte[] generateSecret = zzb.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, generateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(zzgcz.zzb(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                BigInteger zzb2 = zzgcz.zzb(curve);
                BigInteger mod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(zzb2);
                if (zzb2.signum() != 1) {
                    throw new InvalidAlgorithmParameterException("p must be positive");
                }
                BigInteger mod2 = mod.mod(zzb2);
                BigInteger bigInteger2 = BigInteger.ZERO;
                if (!mod2.equals(bigInteger2)) {
                    if (zzb2.testBit(0) && zzb2.testBit(1)) {
                        bigInteger2 = mod2.modPow(zzb2.add(BigInteger.ONE).shiftRight(2), zzb2);
                    } else if (zzb2.testBit(0) && !zzb2.testBit(1)) {
                        bigInteger2 = BigInteger.ONE;
                        BigInteger shiftRight = zzb2.subtract(bigInteger2).shiftRight(1);
                        int i7 = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(zzb2);
                            if (mod3.equals(BigInteger.ZERO)) {
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, zzb2);
                            BigInteger bigInteger3 = BigInteger.ONE;
                            if (modPow.add(bigInteger3).equals(zzb2)) {
                                BigInteger shiftRight2 = zzb2.add(bigInteger3).shiftRight(i6);
                                BigInteger bigInteger4 = bigInteger2;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger4.multiply(bigInteger3);
                                    BigInteger mod4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(zzb2).multiply(mod3)).mod(zzb2);
                                    BigInteger mod5 = multiply.add(multiply).mod(zzb2);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod6 = mod4.multiply(bigInteger2).add(mod5.multiply(mod3)).mod(zzb2);
                                        bigInteger3 = bigInteger2.multiply(mod5).add(mod4).mod(zzb2);
                                        bigInteger4 = mod6;
                                    } else {
                                        bigInteger4 = mod4;
                                        bigInteger3 = mod5;
                                    }
                                }
                                bigInteger2 = bigInteger4;
                            } else if (!modPow.equals(bigInteger3)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            } else {
                                bigInteger2 = bigInteger2.add(bigInteger3);
                                i7++;
                                if (i7 == 128 && !zzb2.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                                i6 = 1;
                            }
                        }
                    } else {
                        bigInteger2 = null;
                    }
                    if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(zzb2).compareTo(mod2) != 0) {
                        throw new GeneralSecurityException("Could not find a modular square root");
                    }
                }
                if (!bigInteger2.testBit(0)) {
                    zzb2.subtract(bigInteger2).mod(zzb2);
                }
                EllipticCurve curve2 = eCPublicKey.getParams().getCurve();
                ECPoint w2 = eCPublicKey.getW();
                zzgcz.zza(w2, curve2);
                int bitLength2 = (zzgcz.zzb(curve2).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                int i8 = i3 - 1;
                if (i8 != 0) {
                    if (i8 != 2) {
                        int i9 = bitLength2 + 1;
                        bArr4 = new byte[i9];
                        byte[] byteArray = w2.getAffineX().toByteArray();
                        int length = byteArray.length;
                        c2 = 0;
                        System.arraycopy(byteArray, 0, bArr4, i9 - length, length);
                        bArr4[0] = true != w2.getAffineY().testBit(0) ? (byte) 2 : (byte) 3;
                    } else {
                        int i10 = bitLength2 + bitLength2;
                        bArr4 = new byte[i10];
                        byte[] byteArray2 = w2.getAffineX().toByteArray();
                        int length2 = byteArray2.length;
                        if (length2 > bitLength2) {
                            byteArray2 = Arrays.copyOfRange(byteArray2, length2 - bitLength2, length2);
                        }
                        byte[] byteArray3 = w2.getAffineY().toByteArray();
                        int length3 = byteArray3.length;
                        if (length3 > bitLength2) {
                            byteArray3 = Arrays.copyOfRange(byteArray3, length3 - bitLength2, length3);
                        }
                        int length4 = byteArray3.length;
                        c2 = 0;
                        System.arraycopy(byteArray3, 0, bArr4, i10 - length4, length4);
                        int length5 = byteArray2.length;
                        System.arraycopy(byteArray2, 0, bArr4, bitLength2 - length5, length5);
                    }
                    bArr3 = bArr4;
                    i5 = 2;
                    i4 = 1;
                } else {
                    c2 = 0;
                    i4 = 1;
                    int i11 = bitLength2 + bitLength2 + 1;
                    bArr3 = new byte[i11];
                    byte[] byteArray4 = w2.getAffineX().toByteArray();
                    byte[] byteArray5 = w2.getAffineY().toByteArray();
                    int length6 = byteArray5.length;
                    System.arraycopy(byteArray5, 0, bArr3, i11 - length6, length6);
                    int length7 = byteArray4.length;
                    System.arraycopy(byteArray4, 0, bArr3, (bitLength2 + 1) - length7, length7);
                    bArr3[0] = 4;
                    i5 = 2;
                }
                byte[][] bArr5 = new byte[i5];
                bArr5[c2] = bArr3;
                bArr5[i4] = generateSecret;
                byte[] zza = zzgco.zza(bArr5);
                Mac zzb3 = zzgdb.zzb.zzb(str);
                if (i2 > zzb3.getMacLength() * 255) {
                    throw new GeneralSecurityException("size too large");
                }
                if (bArr == null || bArr.length == 0) {
                    zzb3.init(new SecretKeySpec(new byte[zzb3.getMacLength()], str));
                } else {
                    zzb3.init(new SecretKeySpec(bArr, str));
                }
                byte[] doFinal = zzb3.doFinal(zza);
                byte[] bArr6 = new byte[i2];
                zzb3.init(new SecretKeySpec(doFinal, str));
                byte[] bArr7 = new byte[0];
                int i12 = 0;
                while (true) {
                    zzb3.update(bArr7);
                    zzb3.update(bArr2);
                    zzb3.update((byte) i4);
                    byte[] doFinal2 = zzb3.doFinal();
                    int length8 = doFinal2.length;
                    int i13 = i12 + length8;
                    if (i13 >= i2) {
                        System.arraycopy(doFinal2, 0, bArr6, i12, i2 - i12);
                        return new zzgcx(bArr3, bArr6);
                    }
                    System.arraycopy(doFinal2, 0, bArr6, i12, length8);
                    i4++;
                    bArr7 = doFinal2;
                    i12 = i13;
                }
            } catch (IllegalStateException e2) {
                throw new GeneralSecurityException(e2.toString());
            }
        } catch (IllegalArgumentException | NullPointerException e3) {
            throw new GeneralSecurityException(e3.toString());
        }
    }
}
