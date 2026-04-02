package com.google.crypto.tink.mac;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes4.dex */
public class ChunkedMacWrapper implements PrimitiveWrapper<ChunkedMac, ChunkedMac> {
    private static final ChunkedMacWrapper WRAPPER = new ChunkedMacWrapper();

    @Immutable
    /* loaded from: classes4.dex */
    public static class WrappedChunkedMac implements ChunkedMac {
        private final PrimitiveSet<ChunkedMac> primitives;

        private ChunkedMac getChunkedMac(PrimitiveSet.Entry<ChunkedMac> entry) {
            return entry.getFullPrimitive();
        }

        @Override // com.google.crypto.tink.mac.ChunkedMac
        public ChunkedMacComputation createComputation() throws GeneralSecurityException {
            return getChunkedMac(this.primitives.getPrimary()).createComputation();
        }

        @Override // com.google.crypto.tink.mac.ChunkedMac
        public ChunkedMacVerification createVerification(byte[] bArr) throws GeneralSecurityException {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            ArrayList arrayList = new ArrayList();
            for (PrimitiveSet.Entry<ChunkedMac> entry : this.primitives.getPrimitive(copyOf)) {
                arrayList.add(getChunkedMac(entry).createVerification(bArr));
            }
            for (PrimitiveSet.Entry<ChunkedMac> entry2 : this.primitives.getRawPrimitives()) {
                arrayList.add(getChunkedMac(entry2).createVerification(bArr));
            }
            return new WrappedChunkedMacVerification(arrayList);
        }

        private WrappedChunkedMac(PrimitiveSet<ChunkedMac> primitiveSet) {
            this.primitives = primitiveSet;
        }
    }

    /* loaded from: classes4.dex */
    public static class WrappedChunkedMacVerification implements ChunkedMacVerification {
        private final List<ChunkedMacVerification> verifications;

        @Override // com.google.crypto.tink.mac.ChunkedMacVerification
        public void update(ByteBuffer byteBuffer) throws GeneralSecurityException {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.mark();
            for (ChunkedMacVerification chunkedMacVerification : this.verifications) {
                duplicate.reset();
                chunkedMacVerification.update(duplicate);
            }
            byteBuffer.position(byteBuffer.limit());
        }

        @Override // com.google.crypto.tink.mac.ChunkedMacVerification
        public void verifyMac() throws GeneralSecurityException {
            GeneralSecurityException generalSecurityException = new GeneralSecurityException("MAC verification failed for all suitable keys in keyset");
            for (ChunkedMacVerification chunkedMacVerification : this.verifications) {
                try {
                    chunkedMacVerification.verifyMac();
                    return;
                } catch (GeneralSecurityException e) {
                    generalSecurityException.addSuppressed(e);
                }
            }
            throw generalSecurityException;
        }

        private WrappedChunkedMacVerification(List<ChunkedMacVerification> list) {
            this.verifications = list;
        }
    }

    private ChunkedMacWrapper() {
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(WRAPPER);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<ChunkedMac> getInputPrimitiveClass() {
        return ChunkedMac.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<ChunkedMac> getPrimitiveClass() {
        return ChunkedMac.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public ChunkedMac wrap(PrimitiveSet<ChunkedMac> primitiveSet) throws GeneralSecurityException {
        if (primitiveSet != null) {
            if (primitiveSet.getPrimary() != null) {
                for (List<PrimitiveSet.Entry<ChunkedMac>> list : primitiveSet.getAll()) {
                    for (PrimitiveSet.Entry<ChunkedMac> entry : list) {
                        entry.getFullPrimitive();
                    }
                }
                return new WrappedChunkedMac(primitiveSet);
            }
            throw new GeneralSecurityException("no primary in primitive set");
        }
        throw new GeneralSecurityException("primitive set must be non-null");
    }
}
