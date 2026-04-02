package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.x;
/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes.dex */
public final class w implements p0 {
    public static final w a = new w();

    @Override // com.amazon.aps.iva.e4.p0
    public final boolean isSupported(Class<?> cls) {
        return x.class.isAssignableFrom(cls);
    }

    @Override // com.amazon.aps.iva.e4.p0
    public final o0 messageInfoFor(Class<?> cls) {
        if (x.class.isAssignableFrom(cls)) {
            try {
                return (o0) x.g(cls.asSubclass(x.class)).f(x.f.BUILD_MESSAGE_INFO);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
