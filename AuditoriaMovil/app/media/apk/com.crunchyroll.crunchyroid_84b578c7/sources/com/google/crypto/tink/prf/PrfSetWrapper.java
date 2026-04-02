package com.google.crypto.tink.prf;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.MonitoringUtil;
import com.google.crypto.tink.internal.MutableMonitoringRegistry;
import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Immutable
/* loaded from: classes4.dex */
public class PrfSetWrapper implements PrimitiveWrapper<Prf, PrfSet> {
    private static final PrfSetWrapper WRAPPER = new PrfSetWrapper();

    /* loaded from: classes4.dex */
    public static class WrappedPrfSet extends PrfSet {
        private final Map<Integer, Prf> keyIdToPrfMap;
        private final int primaryKeyId;

        @Immutable
        /* loaded from: classes4.dex */
        public static class PrfWithMonitoring implements Prf {
            private final int keyId;
            private final MonitoringClient.Logger logger;
            private final Prf prf;

            public PrfWithMonitoring(Prf prf, int i, MonitoringClient.Logger logger) {
                this.prf = prf;
                this.keyId = i;
                this.logger = logger;
            }

            @Override // com.google.crypto.tink.prf.Prf
            public byte[] compute(byte[] bArr, int i) throws GeneralSecurityException {
                try {
                    byte[] compute = this.prf.compute(bArr, i);
                    this.logger.log(this.keyId, bArr.length);
                    return compute;
                } catch (GeneralSecurityException e) {
                    this.logger.logFailure();
                    throw e;
                }
            }
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public Map<Integer, Prf> getPrfs() throws GeneralSecurityException {
            return this.keyIdToPrfMap;
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public int getPrimaryId() {
            return this.primaryKeyId;
        }

        private WrappedPrfSet(PrimitiveSet<Prf> primitiveSet) throws GeneralSecurityException {
            MonitoringClient.Logger logger;
            if (!primitiveSet.getRawPrimitives().isEmpty()) {
                if (primitiveSet.getPrimary() != null) {
                    if (primitiveSet.hasAnnotations()) {
                        logger = MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(MonitoringUtil.getMonitoringKeysetInfo(primitiveSet), "prf", "compute");
                    } else {
                        logger = MonitoringUtil.DO_NOTHING_LOGGER;
                    }
                    this.primaryKeyId = primitiveSet.getPrimary().getKeyId();
                    List<PrimitiveSet.Entry<Prf>> rawPrimitives = primitiveSet.getRawPrimitives();
                    HashMap hashMap = new HashMap();
                    for (PrimitiveSet.Entry<Prf> entry : rawPrimitives) {
                        if (entry.getOutputPrefixType().equals(OutputPrefixType.RAW)) {
                            hashMap.put(Integer.valueOf(entry.getKeyId()), new PrfWithMonitoring(entry.getPrimitive(), entry.getKeyId(), logger));
                        } else {
                            throw new GeneralSecurityException("Key " + entry.getKeyId() + " has non raw prefix type");
                        }
                    }
                    this.keyIdToPrfMap = Collections.unmodifiableMap(hashMap);
                    return;
                }
                throw new GeneralSecurityException("Primary key not set.");
            }
            throw new GeneralSecurityException("No primitives provided.");
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(WRAPPER);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Prf> getInputPrimitiveClass() {
        return Prf.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PrfSet> getPrimitiveClass() {
        return PrfSet.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public PrfSet wrap(PrimitiveSet<Prf> primitiveSet) throws GeneralSecurityException {
        return new WrappedPrfSet(primitiveSet);
    }
}
