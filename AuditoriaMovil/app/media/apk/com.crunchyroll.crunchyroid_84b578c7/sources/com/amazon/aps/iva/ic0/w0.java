package com.amazon.aps.iva.ic0;

import java.lang.ref.WeakReference;
/* compiled from: moduleByClassLoader.kt */
/* loaded from: classes4.dex */
public final class w0 {
    public final WeakReference<ClassLoader> a;
    public final int b;

    public w0(ClassLoader classLoader) {
        this.a = new WeakReference<>(classLoader);
        this.b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof w0) && this.a.get() == ((w0) obj).a.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        String obj;
        ClassLoader classLoader = this.a.get();
        if (classLoader == null || (obj = classLoader.toString()) == null) {
            return "<null>";
        }
        return obj;
    }
}
