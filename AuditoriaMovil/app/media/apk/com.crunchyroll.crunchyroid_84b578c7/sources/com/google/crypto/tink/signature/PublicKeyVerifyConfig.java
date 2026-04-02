package com.google.crypto.tink.signature;

import java.security.GeneralSecurityException;
@Deprecated
/* loaded from: classes4.dex */
public final class PublicKeyVerifyConfig {
    private PublicKeyVerifyConfig() {
    }

    @Deprecated
    public static void registerStandardKeyTypes() throws GeneralSecurityException {
        SignatureConfig.register();
    }
}
