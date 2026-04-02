package com.google.crypto.tink.signature;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.MonitoringUtil;
import com.google.crypto.tink.internal.MutableMonitoringRegistry;
import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class PublicKeyVerifyWrapper implements PrimitiveWrapper<PublicKeyVerify, PublicKeyVerify> {
    private static final Logger logger = Logger.getLogger(PublicKeyVerifyWrapper.class.getName());
    private static final byte[] FORMAT_VERSION = {0};
    private static final PublicKeyVerifyWrapper WRAPPER = new PublicKeyVerifyWrapper();

    /* loaded from: classes4.dex */
    public static class WrappedPublicKeyVerify implements PublicKeyVerify {
        private final MonitoringClient.Logger monitoringLogger;
        private final PrimitiveSet<PublicKeyVerify> primitives;

        public WrappedPublicKeyVerify(PrimitiveSet<PublicKeyVerify> primitiveSet) {
            this.primitives = primitiveSet;
            if (primitiveSet.hasAnnotations()) {
                this.monitoringLogger = MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(MonitoringUtil.getMonitoringKeysetInfo(primitiveSet), "public_key_verify", "verify");
            } else {
                this.monitoringLogger = MonitoringUtil.DO_NOTHING_LOGGER;
            }
        }

        @Override // com.google.crypto.tink.PublicKeyVerify
        public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            byte[] bArr3;
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (PrimitiveSet.Entry<PublicKeyVerify> entry : this.primitives.getPrimitive(copyOf)) {
                    if (entry.getOutputPrefixType().equals(OutputPrefixType.LEGACY)) {
                        bArr3 = Bytes.concat(bArr2, PublicKeyVerifyWrapper.FORMAT_VERSION);
                    } else {
                        bArr3 = bArr2;
                    }
                    try {
                        entry.getPrimitive().verify(copyOfRange, bArr3);
                        this.monitoringLogger.log(entry.getKeyId(), bArr3.length);
                        return;
                    } catch (GeneralSecurityException e) {
                        Logger logger = PublicKeyVerifyWrapper.logger;
                        logger.info("signature prefix matches a key, but cannot verify: " + e);
                    }
                }
                for (PrimitiveSet.Entry<PublicKeyVerify> entry2 : this.primitives.getRawPrimitives()) {
                    try {
                        entry2.getPrimitive().verify(bArr, bArr2);
                        this.monitoringLogger.log(entry2.getKeyId(), bArr2.length);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                this.monitoringLogger.logFailure();
                throw new GeneralSecurityException("invalid signature");
            }
            this.monitoringLogger.logFailure();
            throw new GeneralSecurityException("signature too short");
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(WRAPPER);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PublicKeyVerify> getInputPrimitiveClass() {
        return PublicKeyVerify.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PublicKeyVerify> getPrimitiveClass() {
        return PublicKeyVerify.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public PublicKeyVerify wrap(PrimitiveSet<PublicKeyVerify> primitiveSet) {
        return new WrappedPublicKeyVerify(primitiveSet);
    }
}
