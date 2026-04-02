package com.google.crypto.tink.prf;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ParametersSerializer.ParametersSerializationFunction {
    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public final Serialization serializeParameters(Parameters parameters) {
        ProtoParametersSerialization serializeParameters;
        serializeParameters = HkdfPrfProtoSerialization.serializeParameters((HkdfPrfParameters) parameters);
        return serializeParameters;
    }
}
