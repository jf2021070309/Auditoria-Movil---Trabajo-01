package com.amazon.aps.iva.c9;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: VersionedParcel.java */
/* loaded from: classes.dex */
public abstract class b {
    public final com.amazon.aps.iva.x.a<String, Method> a;
    public final com.amazon.aps.iva.x.a<String, Method> b;
    public final com.amazon.aps.iva.x.a<String, Class> c;

    public b(com.amazon.aps.iva.x.a<String, Method> aVar, com.amazon.aps.iva.x.a<String, Method> aVar2, com.amazon.aps.iva.x.a<String, Class> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public abstract c a();

    public final Class b(Class<? extends d> cls) throws ClassNotFoundException {
        String name = cls.getName();
        com.amazon.aps.iva.x.a<String, Class> aVar = this.c;
        Class orDefault = aVar.getOrDefault(name, null);
        if (orDefault == null) {
            Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            aVar.put(cls.getName(), cls2);
            return cls2;
        }
        return orDefault;
    }

    public final Method c(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        com.amazon.aps.iva.x.a<String, Method> aVar = this.a;
        Method orDefault = aVar.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
            aVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public final Method d(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        com.amazon.aps.iva.x.a<String, Method> aVar = this.b;
        Method orDefault = aVar.getOrDefault(name, null);
        if (orDefault == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, b.class);
            aVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i);

    public abstract int i();

    public final int j(int i, int i2) {
        if (!h(i2)) {
            return i;
        }
        return i();
    }

    public abstract <T extends Parcelable> T k();

    public final <T extends Parcelable> T l(T t, int i) {
        if (!h(i)) {
            return t;
        }
        return (T) k();
    }

    public abstract String m();

    public final <T extends d> T n() {
        String m = m();
        if (m == null) {
            return null;
        }
        try {
            return (T) c(m).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void o(int i);

    public abstract void p(boolean z);

    public abstract void q(byte[] bArr);

    public abstract void r(CharSequence charSequence);

    public abstract void s(int i);

    public final void t(int i, int i2) {
        o(i2);
        s(i);
    }

    public abstract void u(Parcelable parcelable);

    public abstract void v(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(d dVar) {
        if (dVar == null) {
            v(null);
            return;
        }
        try {
            v(b(dVar.getClass()).getName());
            c a = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a);
                a.x();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
