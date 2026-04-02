package com.google.crypto.tink.shaded.protobuf;
@CheckReturnValue
/* loaded from: classes4.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> cls);

    MessageInfo messageInfoFor(Class<?> cls);
}
