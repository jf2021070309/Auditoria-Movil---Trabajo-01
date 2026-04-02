package com.google.crypto.tink.signature;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.Serialization;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements KeySerializer.KeySerializationFunction {
    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public final Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
        ProtoKeySerialization serializePublicKey;
        serializePublicKey = EcdsaProtoSerialization.serializePublicKey((EcdsaPublicKey) key, secretKeyAccess);
        return serializePublicKey;
    }
}
