package com.google.crypto.tink;

import com.amazon.aps.iva.c80.a;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.MutablePrimitiveRegistry;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
/* loaded from: classes4.dex */
public final class Registry {
    private static final Logger logger = Logger.getLogger(Registry.class.getName());
    private static final AtomicReference<KeyManagerRegistry> keyManagerRegistry = new AtomicReference<>(new KeyManagerRegistry());
    private static final ConcurrentMap<String, KeyDeriverContainer> keyDeriverMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> newKeyAllowedMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Catalogue<?>> catalogueMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, KeyTemplate> keyTemplateMap = new ConcurrentHashMap();

    /* loaded from: classes4.dex */
    public interface KeyDeriverContainer {
        KeyData deriveKey(ByteString byteString, InputStream inputStream) throws GeneralSecurityException;
    }

    private Registry() {
    }

    @Deprecated
    public static synchronized void addCatalogue(String str, Catalogue<?> catalogue) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (str != null) {
                if (catalogue != null) {
                    ConcurrentMap<String, Catalogue<?>> concurrentMap = catalogueMap;
                    Locale locale = Locale.US;
                    if (concurrentMap.containsKey(str.toLowerCase(locale)) && !catalogue.getClass().getName().equals(concurrentMap.get(str.toLowerCase(locale)).getClass().getName())) {
                        logger.warning("Attempted overwrite of a catalogueName catalogue for name ".concat(str));
                        throw new GeneralSecurityException("catalogue for name " + str + " has been already registered");
                    }
                    concurrentMap.put(str.toLowerCase(locale), catalogue);
                } else {
                    throw new IllegalArgumentException("catalogue must be non-null.");
                }
            } else {
                throw new IllegalArgumentException("catalogueName must be non-null.");
            }
        }
    }

    private static <KeyProtoT extends MessageLite> KeyDeriverContainer createDeriverFor(final KeyTypeManager<KeyProtoT> keyTypeManager) {
        return new KeyDeriverContainer() { // from class: com.google.crypto.tink.Registry.1
            /* JADX WARN: Unknown type variable: KeyProtoT in type: com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT> */
            private <KeyFormatProtoT extends MessageLite> MessageLite deriveKeyWithFactory(ByteString byteString, InputStream inputStream, KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> keyFactory) throws GeneralSecurityException {
                try {
                    KeyFormatProtoT parseKeyFormat = keyFactory.parseKeyFormat(byteString);
                    keyFactory.validateKeyFormat(parseKeyFormat);
                    return keyFactory.deriveKey(parseKeyFormat, inputStream);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("parsing key format failed in deriveKey", e);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyDeriverContainer
            public KeyData deriveKey(ByteString byteString, InputStream inputStream) throws GeneralSecurityException {
                return KeyData.newBuilder().setTypeUrl(KeyTypeManager.this.getKeyType()).setValue(deriveKeyWithFactory(byteString, inputStream, KeyTypeManager.this.keyFactory()).toByteString()).setKeyMaterialType(KeyTypeManager.this.keyMaterialType()).build();
            }
        };
    }

    public static synchronized KeyData deriveKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, InputStream inputStream) throws GeneralSecurityException {
        KeyData deriveKey;
        synchronized (Registry.class) {
            String typeUrl = keyTemplate.getTypeUrl();
            ConcurrentMap<String, KeyDeriverContainer> concurrentMap = keyDeriverMap;
            if (concurrentMap.containsKey(typeUrl)) {
                deriveKey = concurrentMap.get(typeUrl).deriveKey(keyTemplate.getValue(), inputStream);
            } else {
                throw new GeneralSecurityException("No keymanager registered or key manager cannot derive keys for " + typeUrl);
            }
        }
        return deriveKey;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (com.google.crypto.tink.Registry.keyManagerRegistry.get().typeUrlExists(r4) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        r5 = r5.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r5.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r6 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (com.google.crypto.tink.Registry.keyTemplateMap.containsKey(r6.getKey()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + r6.getKey() + " from an existing key manager of type " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        r4 = r5.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
        if (r4.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
        r5 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
        if (com.google.crypto.tink.Registry.keyTemplateMap.containsKey(r5.getKey()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + r5.getKey());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void ensureKeyManagerInsertable(java.lang.String r4, java.util.Map<java.lang.String, com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> r5, boolean r6) throws java.security.GeneralSecurityException {
        /*
            java.lang.String r0 = "New keys are already disallowed for key type "
            java.lang.Class<com.google.crypto.tink.Registry> r1 = com.google.crypto.tink.Registry.class
            monitor-enter(r1)
            if (r6 == 0) goto L31
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r2 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L31
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L1c
            goto L31
        L1c:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            r6.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            throw r5     // Catch: java.lang.Throwable -> L2e
        L2e:
            r4 = move-exception
            goto Lc5
        L31:
            if (r6 == 0) goto Lc7
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r6 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L2e
            com.google.crypto.tink.KeyManagerRegistry r6 = (com.google.crypto.tink.KeyManagerRegistry) r6     // Catch: java.lang.Throwable -> L2e
            boolean r6 = r6.typeUrlExists(r4)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L87
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2e
        L49:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto Lc7
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L2e
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r0 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r6.getKey()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L62
            goto L49
        L62:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Attempted to register a new key template "
            r0.append(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2e
            r0.append(r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = " from an existing key manager of type "
            r0.append(r6)     // Catch: java.lang.Throwable -> L2e
            r0.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            throw r5     // Catch: java.lang.Throwable -> L2e
        L87:
            java.util.Set r4 = r5.entrySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2e
        L8f:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto Lc7
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L2e
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r6 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r5.getKey()     // Catch: java.lang.Throwable -> L2e
            boolean r6 = r6.containsKey(r0)     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto La8
            goto L8f
        La8:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "Attempted overwrite of a registered key template "
            r6.append(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2e
            r6.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        Lc5:
            monitor-exit(r1)
            throw r4
        Lc7:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.Registry.ensureKeyManagerInsertable(java.lang.String, java.util.Map, boolean):void");
    }

    @Deprecated
    public static Catalogue<?> getCatalogue(String str) throws GeneralSecurityException {
        if (str != null) {
            ConcurrentMap<String, Catalogue<?>> concurrentMap = catalogueMap;
            Locale locale = Locale.US;
            Catalogue<?> catalogue = concurrentMap.get(str.toLowerCase(locale));
            if (catalogue == null) {
                String format = String.format("no catalogue found for %s. ", str);
                if (str.toLowerCase(locale).startsWith("tinkaead")) {
                    format = a.f(format, "Maybe call AeadConfig.register().");
                }
                if (!str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                    if (!str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                        if (!str.toLowerCase(locale).startsWith("tinkhybriddecrypt") && !str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                            if (!str.toLowerCase(locale).startsWith("tinkmac")) {
                                if (!str.toLowerCase(locale).startsWith("tinkpublickeysign") && !str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                                    if (str.toLowerCase(locale).startsWith("tink")) {
                                        format = a.f(format, "Maybe call TinkConfig.register().");
                                    }
                                } else {
                                    format = a.f(format, "Maybe call SignatureConfig.register().");
                                }
                            } else {
                                format = a.f(format, "Maybe call MacConfig.register().");
                            }
                        } else {
                            format = a.f(format, "Maybe call HybridConfig.register().");
                        }
                    } else {
                        format = a.f(format, "Maybe call StreamingAeadConfig.register().");
                    }
                } else {
                    format = a.f(format, "Maybe call DeterministicAeadConfig.register().");
                }
                throw new GeneralSecurityException(format);
            }
            return catalogue;
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static <KeyT extends Key, P> P getFullPrimitive(KeyT keyt, Class<P> cls) throws GeneralSecurityException {
        return (P) MutablePrimitiveRegistry.globalInstance().getPrimitive(keyt, cls);
    }

    public static Class<?> getInputPrimitive(Class<?> cls) {
        try {
            return MutablePrimitiveRegistry.globalInstance().getInputPrimitiveClass(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Deprecated
    public static <P> KeyManager<P> getKeyManager(String str) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(str);
    }

    @Deprecated
    public static <P> P getPrimitive(String str, MessageLite messageLite) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(str).getPrimitive(messageLite);
    }

    public static KeyData getPublicKeyData(String str, ByteString byteString) throws GeneralSecurityException {
        KeyManager keyManager = getKeyManager(str);
        if (keyManager instanceof PrivateKeyManager) {
            return ((PrivateKeyManager) keyManager).getPublicKeyData(byteString);
        }
        throw new GeneralSecurityException(e.e("manager for key type ", str, " is not a PrivateKeyManager"));
    }

    public static KeyManager<?> getUntypedKeyManager(String str) throws GeneralSecurityException {
        return keyManagerRegistry.get().getUntypedKeyManager(str);
    }

    public static synchronized Map<String, KeyTemplate> keyTemplateMap() {
        Map<String, KeyTemplate> unmodifiableMap;
        synchronized (Registry.class) {
            unmodifiableMap = Collections.unmodifiableMap(keyTemplateMap);
        }
        return unmodifiableMap;
    }

    public static synchronized List<String> keyTemplates() {
        List<String> unmodifiableList;
        synchronized (Registry.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(keyTemplateMap.keySet());
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public static synchronized MessageLite newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        MessageLite newKey;
        synchronized (Registry.class) {
            KeyManager<?> untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
            if (newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
                newKey = untypedKeyManager.newKey(keyTemplate.getValue());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
            }
        }
        return newKey;
    }

    public static synchronized KeyData newKeyData(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyData newKeyData;
        synchronized (Registry.class) {
            KeyManager<?> untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
            if (newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
                newKeyData = untypedKeyManager.newKeyData(keyTemplate.getValue());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
            }
        }
        return newKeyData;
    }

    public static MessageLite parseKeyData(KeyData keyData) throws GeneralSecurityException, InvalidProtocolBufferException {
        return keyManagerRegistry.get().parseKeyData(keyData);
    }

    public static synchronized <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> void registerAsymmetricKeyManagers(PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, KeyTypeManager<PublicKeyProtoT> keyTypeManager, boolean z) throws GeneralSecurityException {
        Map<String, KeyTypeManager.KeyFactory.KeyFormat<?>> emptyMap;
        synchronized (Registry.class) {
            if (privateKeyTypeManager != null && keyTypeManager != null) {
                AtomicReference<KeyManagerRegistry> atomicReference = keyManagerRegistry;
                KeyManagerRegistry keyManagerRegistry2 = new KeyManagerRegistry(atomicReference.get());
                keyManagerRegistry2.registerAsymmetricKeyManagers(privateKeyTypeManager, keyTypeManager);
                String keyType = privateKeyTypeManager.getKeyType();
                String keyType2 = keyTypeManager.getKeyType();
                if (z) {
                    emptyMap = privateKeyTypeManager.keyFactory().keyFormats();
                } else {
                    emptyMap = Collections.emptyMap();
                }
                ensureKeyManagerInsertable(keyType, emptyMap, z);
                ensureKeyManagerInsertable(keyType2, Collections.emptyMap(), false);
                if (!atomicReference.get().typeUrlExists(keyType)) {
                    keyDeriverMap.put(keyType, createDeriverFor(privateKeyTypeManager));
                    if (z) {
                        registerKeyTemplates(privateKeyTypeManager.getKeyType(), privateKeyTypeManager.keyFactory().keyFormats());
                    }
                }
                ConcurrentMap<String, Boolean> concurrentMap = newKeyAllowedMap;
                concurrentMap.put(keyType, Boolean.valueOf(z));
                concurrentMap.put(keyType2, Boolean.FALSE);
                atomicReference.set(keyManagerRegistry2);
            } else {
                throw new IllegalArgumentException("given key managers must be non-null.");
            }
        }
    }

    public static synchronized <P> void registerKeyManager(KeyManager<P> keyManager) throws GeneralSecurityException {
        synchronized (Registry.class) {
            registerKeyManager((KeyManager) keyManager, true);
        }
    }

    private static <KeyFormatProtoT extends MessageLite> void registerKeyTemplates(String str, Map<String, KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> map) {
        for (Map.Entry<String, KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> entry : map.entrySet()) {
            keyTemplateMap.put(entry.getKey(), KeyTemplate.create(str, entry.getValue().keyFormat.toByteArray(), entry.getValue().outputPrefixType));
        }
    }

    public static synchronized <B, P> void registerPrimitiveWrapper(PrimitiveWrapper<B, P> primitiveWrapper) throws GeneralSecurityException {
        synchronized (Registry.class) {
            MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(primitiveWrapper);
        }
    }

    public static synchronized void reset() {
        synchronized (Registry.class) {
            keyManagerRegistry.set(new KeyManagerRegistry());
            MutablePrimitiveRegistry.resetGlobalInstanceTestOnly();
            keyDeriverMap.clear();
            newKeyAllowedMap.clear();
            catalogueMap.clear();
            keyTemplateMap.clear();
        }
    }

    public static synchronized void restrictToFipsIfEmpty() throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (TinkFipsUtil.useOnlyFips()) {
                return;
            }
            if (keyManagerRegistry.get().isEmpty()) {
                TinkFipsUtil.setFipsRestricted();
                return;
            }
            throw new GeneralSecurityException("Could not enable FIPS mode as Registry is not empty.");
        }
    }

    public static <B, P> P wrap(PrimitiveSet<B> primitiveSet, Class<P> cls) throws GeneralSecurityException {
        return (P) MutablePrimitiveRegistry.globalInstance().wrap(primitiveSet, cls);
    }

    public static <P> KeyManager<P> getKeyManager(String str, Class<P> cls) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(str, cls);
    }

    public static <P> P wrap(PrimitiveSet<P> primitiveSet) throws GeneralSecurityException {
        return (P) wrap(primitiveSet, primitiveSet.getPrimitiveClass());
    }

    public static <P> P getPrimitive(String str, MessageLite messageLite, Class<P> cls) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(str, cls).getPrimitive(messageLite);
    }

    public static synchronized <P> void registerKeyManager(KeyManager<P> keyManager, boolean z) throws GeneralSecurityException {
        synchronized (Registry.class) {
            try {
                if (keyManager != null) {
                    AtomicReference<KeyManagerRegistry> atomicReference = keyManagerRegistry;
                    KeyManagerRegistry keyManagerRegistry2 = new KeyManagerRegistry(atomicReference.get());
                    keyManagerRegistry2.registerKeyManager(keyManager);
                    if (TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
                        String keyType = keyManager.getKeyType();
                        ensureKeyManagerInsertable(keyType, Collections.emptyMap(), z);
                        newKeyAllowedMap.put(keyType, Boolean.valueOf(z));
                        atomicReference.set(keyManagerRegistry2);
                    } else {
                        throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                    }
                } else {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public static <P> P getPrimitive(String str, ByteString byteString) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(str).getPrimitive(byteString);
    }

    public static synchronized MessageLite newKey(String str, MessageLite messageLite) throws GeneralSecurityException {
        MessageLite newKey;
        synchronized (Registry.class) {
            KeyManager keyManager = getKeyManager(str);
            if (newKeyAllowedMap.get(str).booleanValue()) {
                newKey = keyManager.newKey(messageLite);
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + str);
            }
        }
        return newKey;
    }

    public static synchronized KeyData newKeyData(KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyData newKeyData;
        synchronized (Registry.class) {
            newKeyData = newKeyData(keyTemplate.getProto());
        }
        return newKeyData;
    }

    public static <P> P getPrimitive(String str, ByteString byteString, Class<P> cls) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(str, cls).getPrimitive(byteString);
    }

    @Deprecated
    public static <P> P getPrimitive(String str, byte[] bArr) throws GeneralSecurityException {
        return (P) getPrimitive(str, ByteString.copyFrom(bArr));
    }

    public static <P> P getPrimitive(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) getPrimitive(str, ByteString.copyFrom(bArr), cls);
    }

    @Deprecated
    public static <P> P getPrimitive(KeyData keyData) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue());
    }

    public static <P> P getPrimitive(KeyData keyData, Class<P> cls) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue(), cls);
    }

    public static synchronized <KeyProtoT extends MessageLite> void registerKeyManager(KeyTypeManager<KeyProtoT> keyTypeManager, boolean z) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (keyTypeManager != null) {
                AtomicReference<KeyManagerRegistry> atomicReference = keyManagerRegistry;
                KeyManagerRegistry keyManagerRegistry2 = new KeyManagerRegistry(atomicReference.get());
                keyManagerRegistry2.registerKeyManager(keyTypeManager);
                String keyType = keyTypeManager.getKeyType();
                ensureKeyManagerInsertable(keyType, z ? keyTypeManager.keyFactory().keyFormats() : Collections.emptyMap(), z);
                if (!atomicReference.get().typeUrlExists(keyType)) {
                    keyDeriverMap.put(keyType, createDeriverFor(keyTypeManager));
                    if (z) {
                        registerKeyTemplates(keyType, keyTypeManager.keyFactory().keyFormats());
                    }
                }
                newKeyAllowedMap.put(keyType, Boolean.valueOf(z));
                atomicReference.set(keyManagerRegistry2);
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String str, KeyManager<P> keyManager) throws GeneralSecurityException {
        synchronized (Registry.class) {
            registerKeyManager(str, keyManager, true);
        }
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String str, KeyManager<P> keyManager, boolean z) throws GeneralSecurityException {
        synchronized (Registry.class) {
            try {
                if (keyManager != null) {
                    if (str.equals(keyManager.getKeyType())) {
                        registerKeyManager(keyManager, z);
                    } else {
                        throw new GeneralSecurityException("Manager does not support key type " + str + ".");
                    }
                } else {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
