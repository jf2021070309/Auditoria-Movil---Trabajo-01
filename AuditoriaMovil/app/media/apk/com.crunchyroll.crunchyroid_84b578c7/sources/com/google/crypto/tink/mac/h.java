package com.google.crypto.tink.mac;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.PrimitiveConstructor;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.mac.internal.ChunkedAesCmacImpl;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements KeyParser.KeyParsingFunction, PrimitiveConstructor.PrimitiveConstructionFunction {
    @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
    public final Object constructPrimitive(Key key) {
        return new ChunkedAesCmacImpl((AesCmacKey) key);
    }

    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public final Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) {
        HmacKey parseKey;
        parseKey = HmacProtoSerialization.parseKey((ProtoKeySerialization) serialization, secretKeyAccess);
        return parseKey;
    }
}
