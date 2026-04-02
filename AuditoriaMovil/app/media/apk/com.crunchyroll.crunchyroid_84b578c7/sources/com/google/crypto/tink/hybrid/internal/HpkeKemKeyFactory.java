package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.proto.HpkePrivateKey;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class HpkeKemKeyFactory {

    /* renamed from: com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HpkeKem;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.HpkeKem.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HpkeKem = iArr;
            try {
                iArr[com.google.crypto.tink.proto.HpkeKem.DHKEM_X25519_HKDF_SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HpkeKem[com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HpkeKem[com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HpkeKem[com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private HpkeKemKeyFactory() {
    }

    public static HpkeKemPrivateKey createPrivate(HpkePrivateKey hpkePrivateKey) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem[hpkePrivateKey.getPublicKey().getParams().getKem().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            return NistCurvesHpkeKemPrivateKey.fromBytes(hpkePrivateKey.getPrivateKey().toByteArray(), hpkePrivateKey.getPublicKey().getPublicKey().toByteArray(), HpkeUtil.nistHpkeKemToCurve(hpkePrivateKey.getPublicKey().getParams().getKem()));
        }
        return X25519HpkeKemPrivateKey.fromBytes(hpkePrivateKey.getPrivateKey().toByteArray());
    }
}
