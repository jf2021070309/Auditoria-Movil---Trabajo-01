package com.amazon.aps.iva.bd;

import java.lang.reflect.InvocationTargetException;
/* compiled from: ManifestParser.java */
@Deprecated
/* loaded from: classes.dex */
public final class e {
    public static c a(String str) {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        try {
            try {
                Object newInstance = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof c) {
                    return (c) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (IllegalAccessException e) {
                b(cls4, e);
                throw null;
            } catch (InstantiationException e2) {
                b(cls3, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                b(cls2, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                b(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(defpackage.e.d("Unable to instantiate GlideModule implementation for ", cls), reflectiveOperationException);
    }
}
