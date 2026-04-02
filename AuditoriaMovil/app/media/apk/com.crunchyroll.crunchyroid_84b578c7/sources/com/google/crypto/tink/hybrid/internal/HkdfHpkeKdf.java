package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.subtle.EngineFactory;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
@Immutable
/* loaded from: classes4.dex */
final class HkdfHpkeKdf implements HpkeKdf {
    private final String macAlgorithm;

    public HkdfHpkeKdf(String str) {
        this.macAlgorithm = str;
    }

    private byte[] expand(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        Mac engineFactory = EngineFactory.MAC.getInstance(this.macAlgorithm);
        if (i <= engineFactory.getMacLength() * 255) {
            byte[] bArr3 = new byte[i];
            engineFactory.init(new SecretKeySpec(bArr, this.macAlgorithm));
            byte[] bArr4 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                engineFactory.update(bArr4);
                engineFactory.update(bArr2);
                engineFactory.update((byte) i2);
                bArr4 = engineFactory.doFinal();
                if (bArr4.length + i3 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
                    i3 += bArr4.length;
                    i2++;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    private byte[] extract(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac engineFactory = EngineFactory.MAC.getInstance(this.macAlgorithm);
        if (bArr2 != null && bArr2.length != 0) {
            engineFactory.init(new SecretKeySpec(bArr2, this.macAlgorithm));
        } else {
            engineFactory.init(new SecretKeySpec(new byte[engineFactory.getMacLength()], this.macAlgorithm));
        }
        return engineFactory.doFinal(bArr);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] extractAndExpand(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i) throws GeneralSecurityException {
        return expand(extract(HpkeUtil.labelIkm(str, bArr2, bArr4), bArr), HpkeUtil.labelInfo(str2, bArr3, bArr4, i), i);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] getKdfId() throws GeneralSecurityException {
        String str = this.macAlgorithm;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    c = 0;
                    break;
                }
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    c = 1;
                    break;
                }
                break;
            case 984525777:
                if (str.equals("HmacSha512")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return HpkeUtil.HKDF_SHA256_KDF_ID;
            case 1:
                return HpkeUtil.HKDF_SHA384_KDF_ID;
            case 2:
                return HpkeUtil.HKDF_SHA512_KDF_ID;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }

    public int getMacLength() throws GeneralSecurityException {
        return Mac.getInstance(this.macAlgorithm).getMacLength();
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] labeledExpand(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i) throws GeneralSecurityException {
        return expand(bArr, HpkeUtil.labelInfo(str, bArr2, bArr3, i), i);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] labeledExtract(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return extract(HpkeUtil.labelIkm(str, bArr2, bArr3), bArr);
    }
}
