package com.google.crypto.tink;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.e4.e;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.LegacyProtoParameters;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.monitoring.MonitoringAnnotations;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.tinkkey.KeyAccess;
import com.google.crypto.tink.tinkkey.KeyHandle;
import com.google.crypto.tink.tinkkey.internal.InternalKeyHandle;
import com.google.crypto.tink.tinkkey.internal.ProtoKey;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes4.dex */
public final class KeysetHandle {
    private final MonitoringAnnotations annotations;
    private final List<Entry> entries;
    private final Keyset keyset;

    /* renamed from: com.google.crypto.tink.KeysetHandle$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType;

        static {
            int[] iArr = new int[KeyStatusType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = iArr;
            try {
                iArr[KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final List<Entry> entries = new ArrayList();

        /* loaded from: classes4.dex */
        public static final class Entry {
            private Builder builder;
            private boolean isPrimary;
            private final Key key;
            private KeyStatus keyStatus;
            private final Parameters parameters;
            private KeyIdStrategy strategy;

            public /* synthetic */ Entry(Key key, AnonymousClass1 anonymousClass1) {
                this(key);
            }

            public KeyStatus getStatus() {
                return this.keyStatus;
            }

            public boolean isPrimary() {
                return this.isPrimary;
            }

            @CanIgnoreReturnValue
            public Entry makePrimary() {
                Builder builder = this.builder;
                if (builder != null) {
                    builder.clearPrimary();
                }
                this.isPrimary = true;
                return this;
            }

            @CanIgnoreReturnValue
            public Entry setStatus(KeyStatus keyStatus) {
                this.keyStatus = keyStatus;
                return this;
            }

            @CanIgnoreReturnValue
            public Entry withFixedId(int i) {
                this.strategy = KeyIdStrategy.fixedId(i);
                return this;
            }

            @CanIgnoreReturnValue
            public Entry withRandomId() {
                this.strategy = KeyIdStrategy.access$200();
                return this;
            }

            public /* synthetic */ Entry(Parameters parameters, AnonymousClass1 anonymousClass1) {
                this(parameters);
            }

            private Entry(Key key) {
                this.keyStatus = KeyStatus.ENABLED;
                this.strategy = null;
                this.builder = null;
                this.key = key;
                this.parameters = null;
            }

            private Entry(Parameters parameters) {
                this.keyStatus = KeyStatus.ENABLED;
                this.strategy = null;
                this.builder = null;
                this.key = null;
                this.parameters = parameters;
            }
        }

        private static void checkIdAssignments(List<Entry> list) throws GeneralSecurityException {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).strategy == KeyIdStrategy.RANDOM_ID && list.get(i + 1).strategy != KeyIdStrategy.RANDOM_ID) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrimary() {
            for (Entry entry : this.entries) {
                entry.isPrimary = false;
            }
        }

        private static Keyset.Key createKeyFromParameters(Parameters parameters, int i, KeyStatusType keyStatusType) throws GeneralSecurityException {
            ProtoParametersSerialization protoParametersSerialization;
            if (parameters instanceof LegacyProtoParameters) {
                protoParametersSerialization = ((LegacyProtoParameters) parameters).getSerialization();
            } else {
                protoParametersSerialization = (ProtoParametersSerialization) MutableSerializationRegistry.globalInstance().serializeParameters(parameters, ProtoParametersSerialization.class);
            }
            return Keyset.Key.newBuilder().setKeyId(i).setStatus(keyStatusType).setKeyData(Registry.newKeyData(protoParametersSerialization.getKeyTemplate())).setOutputPrefixType(protoParametersSerialization.getKeyTemplate().getOutputPrefixType()).build();
        }

        private static Keyset.Key createKeysetKeyFromBuilderEntry(Entry entry, int i) throws GeneralSecurityException {
            ProtoKeySerialization protoKeySerialization;
            if (entry.key == null) {
                return createKeyFromParameters(entry.parameters, i, KeysetHandle.serializeStatus(entry.getStatus()));
            }
            if (entry.key instanceof LegacyProtoKey) {
                protoKeySerialization = ((LegacyProtoKey) entry.key).getSerialization(InsecureSecretKeyAccess.get());
            } else {
                protoKeySerialization = (ProtoKeySerialization) MutableSerializationRegistry.globalInstance().serializeKey(entry.key, ProtoKeySerialization.class, InsecureSecretKeyAccess.get());
            }
            Integer idRequirementOrNull = protoKeySerialization.getIdRequirementOrNull();
            if (idRequirementOrNull == null || idRequirementOrNull.intValue() == i) {
                return KeysetHandle.toKeysetKey(i, KeysetHandle.serializeStatus(entry.getStatus()), protoKeySerialization);
            }
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }

        private static int getNextIdFromBuilderEntry(Entry entry, Set<Integer> set) throws GeneralSecurityException {
            if (entry.strategy != null) {
                if (entry.strategy != KeyIdStrategy.RANDOM_ID) {
                    return entry.strategy.getFixedId();
                }
                return randomIdNotInSet(set);
            }
            throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
        }

        private static int randomIdNotInSet(Set<Integer> set) {
            int i = 0;
            while (true) {
                if (i != 0 && !set.contains(Integer.valueOf(i))) {
                    return i;
                }
                i = com.google.crypto.tink.internal.Util.randKeyId();
            }
        }

        @CanIgnoreReturnValue
        public Builder addEntry(Entry entry) {
            if (entry.builder == null) {
                if (entry.isPrimary) {
                    clearPrimary();
                }
                entry.builder = this;
                this.entries.add(entry);
                return this;
            }
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }

        public KeysetHandle build() throws GeneralSecurityException {
            Keyset.Builder newBuilder = Keyset.newBuilder();
            checkIdAssignments(this.entries);
            HashSet hashSet = new HashSet();
            Integer num = null;
            for (Entry entry : this.entries) {
                if (entry.keyStatus != null) {
                    int nextIdFromBuilderEntry = getNextIdFromBuilderEntry(entry, hashSet);
                    if (!hashSet.contains(Integer.valueOf(nextIdFromBuilderEntry))) {
                        hashSet.add(Integer.valueOf(nextIdFromBuilderEntry));
                        newBuilder.addKey(createKeysetKeyFromBuilderEntry(entry, nextIdFromBuilderEntry));
                        if (entry.isPrimary) {
                            if (num == null) {
                                num = Integer.valueOf(nextIdFromBuilderEntry);
                            } else {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                        }
                    } else {
                        throw new GeneralSecurityException(a.d("Id ", nextIdFromBuilderEntry, " is used twice in the keyset"));
                    }
                } else {
                    throw new GeneralSecurityException("Key Status not set.");
                }
            }
            if (num != null) {
                newBuilder.setPrimaryKeyId(num.intValue());
                return KeysetHandle.fromKeyset(newBuilder.build());
            }
            throw new GeneralSecurityException("No primary was set");
        }

        @CanIgnoreReturnValue
        public Builder deleteAt(int i) {
            this.entries.remove(i);
            return this;
        }

        public Entry getAt(int i) {
            return this.entries.get(i);
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Entry removeAt(int i) {
            return this.entries.remove(i);
        }

        public int size() {
            return this.entries.size();
        }

        /* loaded from: classes4.dex */
        public static class KeyIdStrategy {
            private static final KeyIdStrategy RANDOM_ID = new KeyIdStrategy();
            private final int fixedId;

            private KeyIdStrategy() {
                this.fixedId = 0;
            }

            public static /* synthetic */ KeyIdStrategy access$200() {
                return randomId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static KeyIdStrategy fixedId(int i) {
                return new KeyIdStrategy(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int getFixedId() {
                return this.fixedId;
            }

            private static KeyIdStrategy randomId() {
                return RANDOM_ID;
            }

            private KeyIdStrategy(int i) {
                this.fixedId = i;
            }
        }
    }

    @Immutable
    @Alpha
    /* loaded from: classes4.dex */
    public static final class Entry {
        private final int id;
        private final boolean isPrimary;
        private final Key key;
        private final KeyStatus keyStatus;

        public /* synthetic */ Entry(Key key, KeyStatus keyStatus, int i, boolean z, AnonymousClass1 anonymousClass1) {
            this(key, keyStatus, i, z);
        }

        public int getId() {
            return this.id;
        }

        public Key getKey() {
            return this.key;
        }

        public KeyStatus getStatus() {
            return this.keyStatus;
        }

        public boolean isPrimary() {
            return this.isPrimary;
        }

        private Entry(Key key, KeyStatus keyStatus, int i, boolean z) {
            this.key = key;
            this.keyStatus = keyStatus;
            this.id = i;
            this.isPrimary = z;
        }
    }

    private KeysetHandle(Keyset keyset, List<Entry> list) {
        this.keyset = keyset;
        this.entries = list;
        this.annotations = MonitoringAnnotations.EMPTY;
    }

    private static void assertEnoughEncryptedKeyMaterial(EncryptedKeyset encryptedKeyset) throws GeneralSecurityException {
        if (encryptedKeyset != null && encryptedKeyset.getEncryptedKeyset().size() != 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    private static void assertEnoughKeyMaterial(Keyset keyset) throws GeneralSecurityException {
        if (keyset != null && keyset.getKeyCount() > 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void assertNoSecretKeyMaterial(com.google.crypto.tink.proto.Keyset r3) throws java.security.GeneralSecurityException {
        /*
            java.util.List r3 = r3.getKeyList()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r3.next()
            com.google.crypto.tink.proto.Keyset$Key r0 = (com.google.crypto.tink.proto.Keyset.Key) r0
            com.google.crypto.tink.proto.KeyData r1 = r0.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r1.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL
            if (r1 == r2) goto L39
            com.google.crypto.tink.proto.KeyData r1 = r0.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r1.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            if (r1 == r2) goto L39
            com.google.crypto.tink.proto.KeyData r1 = r0.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r1.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            if (r1 == r2) goto L39
            goto L8
        L39:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            com.google.crypto.tink.proto.KeyData r1 = r0.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r1.getKeyMaterialType()
            java.lang.String r1 = r1.name()
            com.google.crypto.tink.proto.KeyData r0 = r0.getKeyData()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            throw r3
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.KeysetHandle.assertNoSecretKeyMaterial(com.google.crypto.tink.proto.Keyset):void");
    }

    @Deprecated
    public static final KeysetHandle createFromKey(KeyHandle keyHandle, KeyAccess keyAccess) throws GeneralSecurityException {
        KeysetManager add = KeysetManager.withEmptyKeyset().add(keyHandle);
        add.setPrimary(add.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId());
        return add.getKeysetHandle();
    }

    private static KeyData createPublicKeyData(KeyData keyData) throws GeneralSecurityException {
        if (keyData.getKeyMaterialType() == KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
            KeyData publicKeyData = Registry.getPublicKeyData(keyData.getTypeUrl(), keyData.getValue());
            validate(publicKeyData);
            return publicKeyData;
        }
        throw new GeneralSecurityException("The keyset contains a non-private key");
    }

    private static Keyset decrypt(EncryptedKeyset encryptedKeyset, Aead aead, byte[] bArr) throws GeneralSecurityException {
        try {
            Keyset parseFrom = Keyset.parseFrom(aead.decrypt(encryptedKeyset.getEncryptedKeyset().toByteArray(), bArr), ExtensionRegistryLite.getEmptyRegistry());
            assertEnoughKeyMaterial(parseFrom);
            return parseFrom;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static EncryptedKeyset encrypt(Keyset keyset, Aead aead, byte[] bArr) throws GeneralSecurityException {
        byte[] encrypt = aead.encrypt(keyset.toByteArray(), bArr);
        try {
            if (Keyset.parseFrom(aead.decrypt(encrypt, bArr), ExtensionRegistryLite.getEmptyRegistry()).equals(keyset)) {
                return EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(encrypt)).setKeysetInfo(Util.getKeysetInfo(keyset)).build();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private Entry entryByIndex(int i) {
        if (this.entries.get(i) != null) {
            return this.entries.get(i);
        }
        throw new IllegalStateException("Keyset-Entry at position i has wrong status or key parsing failed");
    }

    public static final KeysetHandle fromKeyset(Keyset keyset) throws GeneralSecurityException {
        assertEnoughKeyMaterial(keyset);
        return new KeysetHandle(keyset, getEntriesFromKeyset(keyset));
    }

    public static final KeysetHandle fromKeysetAndAnnotations(Keyset keyset, MonitoringAnnotations monitoringAnnotations) throws GeneralSecurityException {
        assertEnoughKeyMaterial(keyset);
        return new KeysetHandle(keyset, getEntriesFromKeyset(keyset), monitoringAnnotations);
    }

    public static Builder.Entry generateEntryFromParameters(Parameters parameters) {
        return new Builder.Entry(parameters, (AnonymousClass1) null);
    }

    public static Builder.Entry generateEntryFromParametersName(String str) throws GeneralSecurityException {
        if (Registry.keyTemplateMap().containsKey(str)) {
            return new Builder.Entry(MutableSerializationRegistry.globalInstance().parseParametersWithLegacyFallback(ProtoParametersSerialization.create(Registry.keyTemplateMap().get(str).getProto())), (AnonymousClass1) null);
        }
        throw new GeneralSecurityException(com.amazon.aps.iva.oa.a.a("cannot find key template: ", str));
    }

    @Deprecated
    public static final KeysetHandle generateNew(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        return newBuilder().addEntry(generateEntryFromParameters(new LegacyProtoParameters(ProtoParametersSerialization.create(keyTemplate))).makePrimary().withRandomId()).build();
    }

    private static List<Entry> getEntriesFromKeyset(Keyset keyset) {
        boolean z;
        ArrayList arrayList = new ArrayList(keyset.getKeyCount());
        for (Keyset.Key key : keyset.getKeyList()) {
            int keyId = key.getKeyId();
            try {
                Key parseKeyWithLegacyFallback = MutableSerializationRegistry.globalInstance().parseKeyWithLegacyFallback(toProtoKeySerialization(key), InsecureSecretKeyAccess.get());
                KeyStatus parseStatus = parseStatus(key.getStatus());
                if (keyId == keyset.getPrimaryKeyId()) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new Entry(parseKeyWithLegacyFallback, parseStatus, keyId, z, null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private <B> B getFullPrimitiveOrNull(Key key, Class<B> cls) throws GeneralSecurityException {
        try {
            return (B) Registry.getFullPrimitive(key, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static <B> B getLegacyPrimitiveOrNull(Keyset.Key key, Class<B> cls) throws GeneralSecurityException {
        try {
            return (B) Registry.getPrimitive(key.getKeyData(), cls);
        } catch (GeneralSecurityException e) {
            if (!e.getMessage().contains("No key manager found for key type ") && !e.getMessage().contains(" not supported by key manager of type ")) {
                throw e;
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <B, P> P getPrimitiveWithKnownInputPrimitive(Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        Object obj;
        Util.validateKeyset(this.keyset);
        PrimitiveSet.Builder newBuilder = PrimitiveSet.newBuilder(cls2);
        newBuilder.setAnnotations(this.annotations);
        for (int i = 0; i < size(); i++) {
            Keyset.Key key = this.keyset.getKey(i);
            if (key.getStatus().equals(KeyStatusType.ENABLED)) {
                Object legacyPrimitiveOrNull = getLegacyPrimitiveOrNull(key, cls2);
                if (this.entries.get(i) != null) {
                    obj = getFullPrimitiveOrNull(this.entries.get(i).getKey(), cls2);
                } else {
                    obj = null;
                }
                if (key.getKeyId() == this.keyset.getPrimaryKeyId()) {
                    newBuilder.addPrimaryFullPrimitiveAndOptionalPrimitive(obj, legacyPrimitiveOrNull, key);
                } else {
                    newBuilder.addFullPrimitiveAndOptionalPrimitive(obj, legacyPrimitiveOrNull, key);
                }
            }
        }
        return (P) Registry.wrap(newBuilder.build(), cls);
    }

    public static Builder.Entry importKey(Key key) {
        Builder.Entry entry = new Builder.Entry(key, (AnonymousClass1) null);
        Integer idRequirementOrNull = key.getIdRequirementOrNull();
        if (idRequirementOrNull != null) {
            entry.withFixedId(idRequirementOrNull.intValue());
        }
        return entry;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private static KeyStatus parseStatus(KeyStatusType keyStatusType) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType[keyStatusType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return KeyStatus.DESTROYED;
                }
                throw new GeneralSecurityException("Unknown key status");
            }
            return KeyStatus.DISABLED;
        }
        return KeyStatus.ENABLED;
    }

    public static final KeysetHandle read(KeysetReader keysetReader, Aead aead) throws GeneralSecurityException, IOException {
        return readWithAssociatedData(keysetReader, aead, new byte[0]);
    }

    public static final KeysetHandle readNoSecret(KeysetReader keysetReader) throws GeneralSecurityException, IOException {
        try {
            Keyset read = keysetReader.read();
            assertNoSecretKeyMaterial(read);
            return fromKeyset(read);
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static final KeysetHandle readWithAssociatedData(KeysetReader keysetReader, Aead aead, byte[] bArr) throws GeneralSecurityException, IOException {
        EncryptedKeyset readEncrypted = keysetReader.readEncrypted();
        assertEnoughEncryptedKeyMaterial(readEncrypted);
        return fromKeyset(decrypt(readEncrypted, aead, bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyStatusType serializeStatus(KeyStatus keyStatus) {
        if (KeyStatus.ENABLED.equals(keyStatus)) {
            return KeyStatusType.ENABLED;
        }
        if (KeyStatus.DISABLED.equals(keyStatus)) {
            return KeyStatusType.DISABLED;
        }
        if (KeyStatus.DESTROYED.equals(keyStatus)) {
            return KeyStatusType.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Keyset.Key toKeysetKey(int i, KeyStatusType keyStatusType, ProtoKeySerialization protoKeySerialization) {
        return Keyset.Key.newBuilder().setKeyData(KeyData.newBuilder().setTypeUrl(protoKeySerialization.getTypeUrl()).setValue(protoKeySerialization.getValue()).setKeyMaterialType(protoKeySerialization.getKeyMaterialType())).setStatus(keyStatusType).setKeyId(i).setOutputPrefixType(protoKeySerialization.getOutputPrefixType()).build();
    }

    private static ProtoKeySerialization toProtoKeySerialization(Keyset.Key key) {
        Integer valueOf;
        int keyId = key.getKeyId();
        if (key.getOutputPrefixType() == OutputPrefixType.RAW) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(keyId);
        }
        try {
            return ProtoKeySerialization.create(key.getKeyData().getTypeUrl(), key.getKeyData().getValue(), key.getKeyData().getKeyMaterialType(), key.getOutputPrefixType(), valueOf);
        } catch (GeneralSecurityException e) {
            throw new TinkBugException("Creating a protokey serialization failed", e);
        }
    }

    private static void validate(KeyData keyData) throws GeneralSecurityException {
        Registry.getPrimitive(keyData);
    }

    public Entry getAt(int i) {
        if (i >= 0 && i < size()) {
            return entryByIndex(i);
        }
        StringBuilder d = e.d("Invalid index ", i, " for keyset of size ");
        d.append(size());
        throw new IndexOutOfBoundsException(d.toString());
    }

    @Deprecated
    public List<KeyHandle> getKeys() {
        ArrayList arrayList = new ArrayList();
        for (Keyset.Key key : this.keyset.getKeyList()) {
            arrayList.add(new InternalKeyHandle(new ProtoKey(key.getKeyData(), KeyTemplate.fromProto(key.getOutputPrefixType())), key.getStatus(), key.getKeyId()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Keyset getKeyset() {
        return this.keyset;
    }

    public KeysetInfo getKeysetInfo() {
        return Util.getKeysetInfo(this.keyset);
    }

    public Entry getPrimary() {
        for (int i = 0; i < this.keyset.getKeyCount(); i++) {
            if (this.keyset.getKey(i).getKeyId() == this.keyset.getPrimaryKeyId()) {
                Entry entryByIndex = entryByIndex(i);
                if (entryByIndex.getStatus() == KeyStatus.ENABLED) {
                    return entryByIndex;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no primary");
    }

    public <P> P getPrimitive(Class<P> cls) throws GeneralSecurityException {
        Class<?> inputPrimitive = Registry.getInputPrimitive(cls);
        if (inputPrimitive != null) {
            return (P) getPrimitiveWithKnownInputPrimitive(cls, inputPrimitive);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public KeysetHandle getPublicKeysetHandle() throws GeneralSecurityException {
        if (this.keyset != null) {
            Keyset.Builder newBuilder = Keyset.newBuilder();
            for (Keyset.Key key : this.keyset.getKeyList()) {
                newBuilder.addKey(key.toBuilder().setKeyData(createPublicKeyData(key.getKeyData())).build());
            }
            newBuilder.setPrimaryKeyId(this.keyset.getPrimaryKeyId());
            return fromKeyset(newBuilder.build());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    @Deprecated
    public KeyHandle primaryKey() throws GeneralSecurityException {
        int primaryKeyId = this.keyset.getPrimaryKeyId();
        for (Keyset.Key key : this.keyset.getKeyList()) {
            if (key.getKeyId() == primaryKeyId) {
                return new InternalKeyHandle(new ProtoKey(key.getKeyData(), KeyTemplate.fromProto(key.getOutputPrefixType())), key.getStatus(), key.getKeyId());
            }
        }
        throw new GeneralSecurityException("No primary key found in keyset.");
    }

    public int size() {
        return this.keyset.getKeyCount();
    }

    public String toString() {
        return getKeysetInfo().toString();
    }

    public void write(KeysetWriter keysetWriter, Aead aead) throws GeneralSecurityException, IOException {
        writeWithAssociatedData(keysetWriter, aead, new byte[0]);
    }

    public void writeNoSecret(KeysetWriter keysetWriter) throws GeneralSecurityException, IOException {
        assertNoSecretKeyMaterial(this.keyset);
        keysetWriter.write(this.keyset);
    }

    public void writeWithAssociatedData(KeysetWriter keysetWriter, Aead aead, byte[] bArr) throws GeneralSecurityException, IOException {
        keysetWriter.write(encrypt(this.keyset, aead, bArr));
    }

    public static Builder newBuilder(KeysetHandle keysetHandle) {
        Builder builder = new Builder();
        for (int i = 0; i < keysetHandle.size(); i++) {
            Entry entryByIndex = keysetHandle.entryByIndex(i);
            Builder.Entry withFixedId = importKey(entryByIndex.getKey()).withFixedId(entryByIndex.getId());
            withFixedId.setStatus(entryByIndex.getStatus());
            if (entryByIndex.isPrimary()) {
                withFixedId.makePrimary();
            }
            builder.addEntry(withFixedId);
        }
        return builder;
    }

    private KeysetHandle(Keyset keyset, List<Entry> list, MonitoringAnnotations monitoringAnnotations) {
        this.keyset = keyset;
        this.entries = list;
        this.annotations = monitoringAnnotations;
    }

    @Deprecated
    public static final KeysetHandle readNoSecret(byte[] bArr) throws GeneralSecurityException {
        try {
            Keyset parseFrom = Keyset.parseFrom(bArr, ExtensionRegistryLite.getEmptyRegistry());
            assertNoSecretKeyMaterial(parseFrom);
            return fromKeyset(parseFrom);
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static final KeysetHandle generateNew(KeyTemplate keyTemplate) throws GeneralSecurityException {
        return newBuilder().addEntry(generateEntryFromParameters(new LegacyProtoParameters(ProtoParametersSerialization.create(keyTemplate.getProto()))).makePrimary().withRandomId()).build();
    }
}
