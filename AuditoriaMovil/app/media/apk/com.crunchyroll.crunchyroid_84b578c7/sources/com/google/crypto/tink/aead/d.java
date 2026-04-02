package com.google.crypto.tink.aead;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements KeyParser.KeyParsingFunction, ParametersSerializer.ParametersSerializationFunction {
    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public final Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) {
        AesEaxKey parseKey;
        parseKey = AesEaxProtoSerialization.parseKey((ProtoKeySerialization) serialization, secretKeyAccess);
        return parseKey;
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public final Serialization serializeParameters(Parameters parameters) {
        ProtoParametersSerialization serializeParameters;
        serializeParameters = ChaCha20Poly1305ProtoSerialization.serializeParameters((ChaCha20Poly1305Parameters) parameters);
        return serializeParameters;
    }
}
