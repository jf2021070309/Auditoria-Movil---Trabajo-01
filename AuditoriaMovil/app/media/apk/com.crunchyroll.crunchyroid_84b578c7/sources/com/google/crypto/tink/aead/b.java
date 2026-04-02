package com.google.crypto.tink.aead;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ParametersParser.ParametersParsingFunction, KeySerializer.KeySerializationFunction, KeyParser.KeyParsingFunction {
    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public final Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) {
        XChaCha20Poly1305Key parseKey;
        parseKey = XChaCha20Poly1305ProtoSerialization.parseKey((ProtoKeySerialization) serialization, secretKeyAccess);
        return parseKey;
    }

    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public final Parameters parseParameters(Serialization serialization) {
        AesEaxParameters parseParameters;
        parseParameters = AesEaxProtoSerialization.parseParameters((ProtoParametersSerialization) serialization);
        return parseParameters;
    }

    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public final Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
        ProtoKeySerialization serializeKey;
        serializeKey = AesGcmSivProtoSerialization.serializeKey((AesGcmSivKey) key, secretKeyAccess);
        return serializeKey;
    }
}
