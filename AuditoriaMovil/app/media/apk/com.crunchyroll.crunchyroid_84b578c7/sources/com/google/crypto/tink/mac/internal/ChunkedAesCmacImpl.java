package com.google.crypto.tink.mac.internal;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.mac.AesCmacKey;
import com.google.crypto.tink.mac.ChunkedMac;
import com.google.crypto.tink.mac.ChunkedMacComputation;
import com.google.crypto.tink.mac.ChunkedMacVerification;
import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
@Immutable
/* loaded from: classes4.dex */
public final class ChunkedAesCmacImpl implements ChunkedMac {
    private static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private final AesCmacKey key;

    public ChunkedAesCmacImpl(AesCmacKey aesCmacKey) throws GeneralSecurityException {
        if (FIPS.isCompatible()) {
            this.key = aesCmacKey;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public ChunkedMacComputation createComputation() throws GeneralSecurityException {
        return new ChunkedAesCmacComputation(this.key);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public ChunkedMacVerification createVerification(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length >= this.key.getOutputPrefix().size()) {
            if (this.key.getOutputPrefix().equals(Bytes.copyFrom(bArr, 0, this.key.getOutputPrefix().size()))) {
                return new ChunkedAesCmacVerification(this.key, bArr);
            }
            throw new GeneralSecurityException("Wrong tag prefix");
        }
        throw new GeneralSecurityException("Tag too short");
    }
}
