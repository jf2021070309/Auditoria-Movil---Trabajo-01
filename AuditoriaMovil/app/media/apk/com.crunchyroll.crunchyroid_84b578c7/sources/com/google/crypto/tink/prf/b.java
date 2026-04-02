package com.google.crypto.tink.prf;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ParametersParser.ParametersParsingFunction {
    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public final Parameters parseParameters(Serialization serialization) {
        HkdfPrfParameters parseParameters;
        parseParameters = HkdfPrfProtoSerialization.parseParameters((ProtoParametersSerialization) serialization);
        return parseParameters;
    }
}
