package com.google.crypto.tink;

import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.monitoring.MonitoringAnnotations;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Hex;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes4.dex */
public final class PrimitiveSet<P> {
    private final MonitoringAnnotations annotations;
    private final boolean isMutable;
    private Entry<P> primary;
    private final Class<P> primitiveClass;
    private final ConcurrentMap<Prefix, List<Entry<P>>> primitives;

    /* loaded from: classes4.dex */
    public static class Builder<P> {
        private MonitoringAnnotations annotations;
        private Entry<P> primary;
        private final Class<P> primitiveClass;
        private ConcurrentMap<Prefix, List<Entry<P>>> primitives;

        @CanIgnoreReturnValue
        private Builder<P> addPrimitive(P p, P p2, Keyset.Key key, boolean z) throws GeneralSecurityException {
            if (this.primitives != null) {
                if (p == null && p2 == null) {
                    throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
                }
                if (key.getStatus() == KeyStatusType.ENABLED) {
                    Entry<P> addEntryToMap = PrimitiveSet.addEntryToMap(p, p2, key, this.primitives);
                    if (z) {
                        if (this.primary == null) {
                            this.primary = addEntryToMap;
                        } else {
                            throw new IllegalStateException("you cannot set two primary primitives");
                        }
                    }
                    return this;
                }
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }

        @CanIgnoreReturnValue
        public Builder<P> addFullPrimitiveAndOptionalPrimitive(P p, P p2, Keyset.Key key) throws GeneralSecurityException {
            return addPrimitive(p, p2, key, false);
        }

        @CanIgnoreReturnValue
        public Builder<P> addPrimaryFullPrimitiveAndOptionalPrimitive(P p, P p2, Keyset.Key key) throws GeneralSecurityException {
            return addPrimitive(p, p2, key, true);
        }

        @CanIgnoreReturnValue
        public Builder<P> addPrimaryPrimitive(P p, Keyset.Key key) throws GeneralSecurityException {
            return addPrimitive(null, p, key, true);
        }

        public PrimitiveSet<P> build() throws GeneralSecurityException {
            ConcurrentMap<Prefix, List<Entry<P>>> concurrentMap = this.primitives;
            if (concurrentMap != null) {
                PrimitiveSet<P> primitiveSet = new PrimitiveSet<>(concurrentMap, this.primary, this.annotations, this.primitiveClass);
                this.primitives = null;
                return primitiveSet;
            }
            throw new IllegalStateException("build cannot be called twice");
        }

        @CanIgnoreReturnValue
        public Builder<P> setAnnotations(MonitoringAnnotations monitoringAnnotations) {
            if (this.primitives != null) {
                this.annotations = monitoringAnnotations;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }

        private Builder(Class<P> cls) {
            this.primitives = new ConcurrentHashMap();
            this.primitiveClass = cls;
            this.annotations = MonitoringAnnotations.EMPTY;
        }

        @CanIgnoreReturnValue
        public Builder<P> addPrimitive(P p, Keyset.Key key) throws GeneralSecurityException {
            return addPrimitive(null, p, key, false);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Entry<P> {
        private final P fullPrimitive;
        private final byte[] identifier;
        private final Key key;
        private final int keyId;
        private final String keyType;
        private final OutputPrefixType outputPrefixType;
        private final P primitive;
        private final KeyStatusType status;

        public Entry(P p, P p2, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType, int i, String str, Key key) {
            this.fullPrimitive = p;
            this.primitive = p2;
            this.identifier = Arrays.copyOf(bArr, bArr.length);
            this.status = keyStatusType;
            this.outputPrefixType = outputPrefixType;
            this.keyId = i;
            this.keyType = str;
            this.key = key;
        }

        public P getFullPrimitive() {
            return this.fullPrimitive;
        }

        public final byte[] getIdentifier() {
            byte[] bArr = this.identifier;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public Key getKey() {
            return this.key;
        }

        public int getKeyId() {
            return this.keyId;
        }

        public String getKeyType() {
            return this.keyType;
        }

        public OutputPrefixType getOutputPrefixType() {
            return this.outputPrefixType;
        }

        public Parameters getParameters() {
            Key key = this.key;
            if (key == null) {
                return null;
            }
            return key.getParameters();
        }

        public P getPrimitive() {
            return this.primitive;
        }

        public KeyStatusType getStatus() {
            return this.status;
        }
    }

    /* loaded from: classes4.dex */
    public static class Prefix implements Comparable<Prefix> {
        private final byte[] prefix;

        public boolean equals(Object obj) {
            if (!(obj instanceof Prefix)) {
                return false;
            }
            return Arrays.equals(this.prefix, ((Prefix) obj).prefix);
        }

        public int hashCode() {
            return Arrays.hashCode(this.prefix);
        }

        public String toString() {
            return Hex.encode(this.prefix);
        }

        private Prefix(byte[] bArr) {
            this.prefix = Arrays.copyOf(bArr, bArr.length);
        }

        @Override // java.lang.Comparable
        public int compareTo(Prefix prefix) {
            byte[] bArr = this.prefix;
            int length = bArr.length;
            byte[] bArr2 = prefix.prefix;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i = 0;
            while (true) {
                byte[] bArr3 = this.prefix;
                if (i >= bArr3.length) {
                    return 0;
                }
                byte b = bArr3[i];
                byte b2 = prefix.prefix[i];
                if (b != b2) {
                    return b - b2;
                }
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <P> Entry<P> addEntryToMap(P p, P p2, Keyset.Key key, ConcurrentMap<Prefix, List<Entry<P>>> concurrentMap) throws GeneralSecurityException {
        Integer valueOf = Integer.valueOf(key.getKeyId());
        if (key.getOutputPrefixType() == OutputPrefixType.RAW) {
            valueOf = null;
        }
        Entry<P> entry = new Entry<>(p, p2, CryptoFormat.getOutputPrefix(key), key.getStatus(), key.getOutputPrefixType(), key.getKeyId(), key.getKeyData().getTypeUrl(), MutableSerializationRegistry.globalInstance().parseKeyWithLegacyFallback(ProtoKeySerialization.create(key.getKeyData().getTypeUrl(), key.getKeyData().getValue(), key.getKeyData().getKeyMaterialType(), key.getOutputPrefixType(), valueOf), InsecureSecretKeyAccess.get()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(entry);
        Prefix prefix = new Prefix(entry.getIdentifier());
        List<Entry<P>> put = concurrentMap.put(prefix, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(entry);
            concurrentMap.put(prefix, Collections.unmodifiableList(arrayList2));
        }
        return entry;
    }

    public static <P> Builder<P> newBuilder(Class<P> cls) {
        return new Builder<>(cls);
    }

    @Deprecated
    public static <P> PrimitiveSet<P> newPrimitiveSet(Class<P> cls) {
        return new PrimitiveSet<>(cls);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public Entry<P> addPrimitive(P p, Keyset.Key key) throws GeneralSecurityException {
        if (this.isMutable) {
            if (key.getStatus() == KeyStatusType.ENABLED) {
                return addEntryToMap(null, p, key, this.primitives);
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addPrimitive cannot be called on an immutable primitive set");
    }

    public Collection<List<Entry<P>>> getAll() {
        return this.primitives.values();
    }

    public MonitoringAnnotations getAnnotations() {
        return this.annotations;
    }

    public Entry<P> getPrimary() {
        return this.primary;
    }

    public List<Entry<P>> getPrimitive(byte[] bArr) {
        List<Entry<P>> list = this.primitives.get(new Prefix(bArr));
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public Class<P> getPrimitiveClass() {
        return this.primitiveClass;
    }

    public List<Entry<P>> getRawPrimitives() {
        return getPrimitive(CryptoFormat.RAW_PREFIX);
    }

    public boolean hasAnnotations() {
        return !this.annotations.toMap().isEmpty();
    }

    @Deprecated
    public void setPrimary(Entry<P> entry) {
        if (this.isMutable) {
            if (entry != null) {
                if (entry.getStatus() == KeyStatusType.ENABLED) {
                    if (!getPrimitive(entry.getIdentifier()).isEmpty()) {
                        this.primary = entry;
                        return;
                    }
                    throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                }
                throw new IllegalArgumentException("the primary entry has to be ENABLED");
            }
            throw new IllegalArgumentException("the primary entry must be non-null");
        }
        throw new IllegalStateException("setPrimary cannot be called on an immutable primitive set");
    }

    private PrimitiveSet(Class<P> cls) {
        this.primitives = new ConcurrentHashMap();
        this.primitiveClass = cls;
        this.annotations = MonitoringAnnotations.EMPTY;
        this.isMutable = true;
    }

    private PrimitiveSet(ConcurrentMap<Prefix, List<Entry<P>>> concurrentMap, Entry<P> entry, MonitoringAnnotations monitoringAnnotations, Class<P> cls) {
        this.primitives = concurrentMap;
        this.primary = entry;
        this.primitiveClass = cls;
        this.annotations = monitoringAnnotations;
        this.isMutable = false;
    }
}
