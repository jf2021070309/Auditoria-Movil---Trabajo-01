package com.google.crypto.tink;

import com.google.crypto.tink.internal.KeyStatusTypeProtoConverter;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.tinkkey.KeyAccess;
import com.google.crypto.tink.tinkkey.KeyHandle;
import com.google.crypto.tink.tinkkey.internal.ProtoKey;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public final class KeysetManager {
    private final Keyset.Builder keysetBuilder;

    private KeysetManager(Keyset.Builder builder) {
        this.keysetBuilder = builder;
    }

    private synchronized Keyset.Key createKeysetKey(KeyData keyData, OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int newKeyId;
        newKeyId = newKeyId();
        if (outputPrefixType != OutputPrefixType.UNKNOWN_PREFIX) {
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return Keyset.Key.newBuilder().setKeyData(keyData).setKeyId(newKeyId).setStatus(KeyStatusType.ENABLED).setOutputPrefixType(outputPrefixType).build();
    }

    private synchronized boolean keyIdExists(int i) {
        for (Keyset.Key key : this.keysetBuilder.getKeyList()) {
            if (key.getKeyId() == i) {
                return true;
            }
        }
        return false;
    }

    private synchronized Keyset.Key newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        return createKeysetKey(Registry.newKeyData(keyTemplate), keyTemplate.getOutputPrefixType());
    }

    private synchronized int newKeyId() {
        int randKeyId;
        randKeyId = com.google.crypto.tink.internal.Util.randKeyId();
        while (keyIdExists(randKeyId)) {
            randKeyId = com.google.crypto.tink.internal.Util.randKeyId();
        }
        return randKeyId;
    }

    public static KeysetManager withEmptyKeyset() {
        return new KeysetManager(Keyset.newBuilder());
    }

    public static KeysetManager withKeysetHandle(KeysetHandle keysetHandle) {
        return new KeysetManager(keysetHandle.getKeyset().toBuilder());
    }

    @CanIgnoreReturnValue
    @Deprecated
    public synchronized KeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        addNewKey(keyTemplate, false);
        return this;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public synchronized int addNewKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, boolean z) throws GeneralSecurityException {
        Keyset.Key newKey;
        newKey = newKey(keyTemplate);
        this.keysetBuilder.addKey(newKey);
        if (z) {
            this.keysetBuilder.setPrimaryKeyId(newKey.getKeyId());
        }
        return newKey.getKeyId();
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager delete(int i) throws GeneralSecurityException {
        if (i != this.keysetBuilder.getPrimaryKeyId()) {
            for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
                if (this.keysetBuilder.getKey(i2).getKeyId() == i) {
                    this.keysetBuilder.removeKey(i2);
                }
            }
            throw new GeneralSecurityException("key not found: " + i);
        }
        throw new GeneralSecurityException("cannot delete the primary key");
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager destroy(int i) throws GeneralSecurityException {
        if (i != this.keysetBuilder.getPrimaryKeyId()) {
            for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
                Keyset.Key key = this.keysetBuilder.getKey(i2);
                if (key.getKeyId() == i) {
                    if (key.getStatus() != KeyStatusType.ENABLED && key.getStatus() != KeyStatusType.DISABLED && key.getStatus() != KeyStatusType.DESTROYED) {
                        throw new GeneralSecurityException("cannot destroy key with id " + i);
                    }
                    this.keysetBuilder.setKey(i2, key.toBuilder().setStatus(KeyStatusType.DESTROYED).clearKeyData().build());
                }
            }
            throw new GeneralSecurityException("key not found: " + i);
        }
        throw new GeneralSecurityException("cannot destroy the primary key");
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager disable(int i) throws GeneralSecurityException {
        if (i != this.keysetBuilder.getPrimaryKeyId()) {
            for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
                Keyset.Key key = this.keysetBuilder.getKey(i2);
                if (key.getKeyId() == i) {
                    if (key.getStatus() != KeyStatusType.ENABLED && key.getStatus() != KeyStatusType.DISABLED) {
                        throw new GeneralSecurityException("cannot disable key with id " + i);
                    }
                    this.keysetBuilder.setKey(i2, key.toBuilder().setStatus(KeyStatusType.DISABLED).build());
                }
            }
            throw new GeneralSecurityException("key not found: " + i);
        }
        throw new GeneralSecurityException("cannot disable the primary key");
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager enable(int i) throws GeneralSecurityException {
        for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
            Keyset.Key key = this.keysetBuilder.getKey(i2);
            if (key.getKeyId() == i) {
                KeyStatusType status = key.getStatus();
                KeyStatusType keyStatusType = KeyStatusType.ENABLED;
                if (status != keyStatusType && key.getStatus() != KeyStatusType.DISABLED) {
                    throw new GeneralSecurityException("cannot enable key with id " + i);
                }
                this.keysetBuilder.setKey(i2, key.toBuilder().setStatus(keyStatusType).build());
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }

    public synchronized KeysetHandle getKeysetHandle() throws GeneralSecurityException {
        return KeysetHandle.fromKeyset(this.keysetBuilder.build());
    }

    @CanIgnoreReturnValue
    @InlineMe(replacement = "this.setPrimary(keyId)")
    @Deprecated
    public synchronized KeysetManager promote(int i) throws GeneralSecurityException {
        return setPrimary(i);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public synchronized KeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        addNewKey(keyTemplate, true);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager setPrimary(int i) throws GeneralSecurityException {
        for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
            Keyset.Key key = this.keysetBuilder.getKey(i2);
            if (key.getKeyId() == i) {
                if (key.getStatus().equals(KeyStatusType.ENABLED)) {
                    this.keysetBuilder.setPrimaryKeyId(i);
                } else {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager add(KeyTemplate keyTemplate) throws GeneralSecurityException {
        addNewKey(keyTemplate.getProto(), false);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager add(KeyHandle keyHandle) throws GeneralSecurityException {
        try {
            try {
                ProtoKey protoKey = (ProtoKey) keyHandle.getKey(com.google.crypto.tink.tinkkey.SecretKeyAccess.insecureSecretAccess());
                if (!keyIdExists(keyHandle.getId())) {
                    this.keysetBuilder.addKey(Keyset.Key.newBuilder().setKeyData(protoKey.getProtoKey()).setKeyId(keyHandle.getId()).setStatus(KeyStatusTypeProtoConverter.toProto(keyHandle.getStatus())).setOutputPrefixType(KeyTemplate.toProto(protoKey.getOutputPrefixType())).build());
                } else {
                    throw new GeneralSecurityException("Trying to add a key with an ID already contained in the keyset.");
                }
            } catch (ClassCastException e) {
                throw new UnsupportedOperationException("KeyHandles which contain TinkKeys that are not ProtoKeys are not yet supported.", e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager add(KeyHandle keyHandle, KeyAccess keyAccess) throws GeneralSecurityException {
        return add(keyHandle);
    }
}
