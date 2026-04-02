package com.google.crypto.tink.signature;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.Serialization;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements KeyParser.KeyParsingFunction {
    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public final Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) {
        EcdsaPrivateKey parsePrivateKey;
        parsePrivateKey = EcdsaProtoSerialization.parsePrivateKey((ProtoKeySerialization) serialization, secretKeyAccess);
        return parsePrivateKey;
    }
}
