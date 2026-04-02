package com.google.crypto.tink.aead;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ParametersSerializer.ParametersSerializationFunction, ParametersParser.ParametersParsingFunction, KeySerializer.KeySerializationFunction {
    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public final Parameters parseParameters(Serialization serialization) {
        AesGcmSivParameters parseParameters;
        parseParameters = AesGcmSivProtoSerialization.parseParameters((ProtoParametersSerialization) serialization);
        return parseParameters;
    }

    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public final Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
        ProtoKeySerialization serializeKey;
        serializeKey = XChaCha20Poly1305ProtoSerialization.serializeKey((XChaCha20Poly1305Key) key, secretKeyAccess);
        return serializeKey;
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public final Serialization serializeParameters(Parameters parameters) {
        ProtoParametersSerialization serializeParameters;
        serializeParameters = AesEaxProtoSerialization.serializeParameters((AesEaxParameters) parameters);
        return serializeParameters;
    }
}
