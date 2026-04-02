package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.MonitoringUtil;
import com.google.crypto.tink.internal.MutableMonitoringRegistry;
import com.google.crypto.tink.monitoring.MonitoringClient;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* loaded from: classes4.dex */
public class HybridDecryptWrapper implements PrimitiveWrapper<HybridDecrypt, HybridDecrypt> {
    private static final Logger logger = Logger.getLogger(HybridDecryptWrapper.class.getName());
    private static final HybridDecryptWrapper WRAPPER = new HybridDecryptWrapper();

    /* loaded from: classes4.dex */
    public static class WrappedHybridDecrypt implements HybridDecrypt {
        private final MonitoringClient.Logger decLogger;
        private final PrimitiveSet<HybridDecrypt> primitives;

        public WrappedHybridDecrypt(PrimitiveSet<HybridDecrypt> primitiveSet) {
            this.primitives = primitiveSet;
            if (primitiveSet.hasAnnotations()) {
                this.decLogger = MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(MonitoringUtil.getMonitoringKeysetInfo(primitiveSet), "hybrid_decrypt", "decrypt");
            } else {
                this.decLogger = MonitoringUtil.DO_NOTHING_LOGGER;
            }
        }

        @Override // com.google.crypto.tink.HybridDecrypt
        public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (PrimitiveSet.Entry<HybridDecrypt> entry : this.primitives.getPrimitive(copyOfRange)) {
                    try {
                        byte[] decrypt = entry.getPrimitive().decrypt(copyOfRange2, bArr2);
                        this.decLogger.log(entry.getKeyId(), copyOfRange2.length);
                        return decrypt;
                    } catch (GeneralSecurityException e) {
                        Logger logger = HybridDecryptWrapper.logger;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            for (PrimitiveSet.Entry<HybridDecrypt> entry2 : this.primitives.getRawPrimitives()) {
                try {
                    byte[] decrypt2 = entry2.getPrimitive().decrypt(bArr, bArr2);
                    this.decLogger.log(entry2.getKeyId(), bArr.length);
                    return decrypt2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.decLogger.logFailure();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(WRAPPER);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<HybridDecrypt> getInputPrimitiveClass() {
        return HybridDecrypt.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<HybridDecrypt> getPrimitiveClass() {
        return HybridDecrypt.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public HybridDecrypt wrap(PrimitiveSet<HybridDecrypt> primitiveSet) {
        return new WrappedHybridDecrypt(primitiveSet);
    }
}
