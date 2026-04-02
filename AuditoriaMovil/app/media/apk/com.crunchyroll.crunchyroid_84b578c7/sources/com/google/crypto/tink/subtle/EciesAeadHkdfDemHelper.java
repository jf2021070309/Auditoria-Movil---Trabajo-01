package com.google.crypto.tink.subtle;

import com.google.crypto.tink.hybrid.subtle.AeadOrDaead;
import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public interface EciesAeadHkdfDemHelper {
    AeadOrDaead getAeadOrDaead(byte[] bArr) throws GeneralSecurityException;

    int getSymmetricKeySizeInBytes();
}
