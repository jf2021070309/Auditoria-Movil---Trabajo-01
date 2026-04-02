package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.w;
/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes.dex */
public final class v implements o0 {
    public static final v a = new v();

    @Override // com.amazon.aps.iva.v4.o0
    public final boolean isSupported(Class<?> cls) {
        return w.class.isAssignableFrom(cls);
    }

    @Override // com.amazon.aps.iva.v4.o0
    public final n0 messageInfoFor(Class<?> cls) {
        if (w.class.isAssignableFrom(cls)) {
            try {
                return (n0) w.g(cls.asSubclass(w.class)).f(w.f.BUILD_MESSAGE_INFO);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
