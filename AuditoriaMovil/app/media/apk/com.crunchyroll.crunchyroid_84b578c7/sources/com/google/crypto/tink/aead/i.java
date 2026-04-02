package com.google.crypto.tink.aead;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ParametersSerializer.ParametersSerializationFunction, ParametersParser.ParametersParsingFunction {
    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public final Parameters parseParameters(Serialization serialization) {
        XChaCha20Poly1305Parameters parseParameters;
        parseParameters = XChaCha20Poly1305ProtoSerialization.parseParameters((ProtoParametersSerialization) serialization);
        return parseParameters;
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public final Serialization serializeParameters(Parameters parameters) {
        ProtoParametersSerialization serializeParameters;
        serializeParameters = AesGcmSivProtoSerialization.serializeParameters((AesGcmSivParameters) parameters);
        return serializeParameters;
    }
}
