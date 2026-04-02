package com.amazon.aps.iva.i5;

import android.app.Application;
import com.amazon.aps.iva.ee0.f1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class a0 {
    public static final List<Class<?>> a = f1.K(Application.class, androidx.lifecycle.p.class);
    public static final List<Class<?>> b = f1.J(androidx.lifecycle.p.class);

    public static final Constructor a(List list, Class cls) {
        com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
        com.amazon.aps.iva.yb0.j.f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        com.amazon.aps.iva.yb0.j.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            com.amazon.aps.iva.yb0.j.e(parameterTypes, "constructor.parameterTypes");
            List b0 = com.amazon.aps.iva.lb0.o.b0(parameterTypes);
            if (com.amazon.aps.iva.yb0.j.a(list, b0)) {
                return constructor;
            }
            if (list.size() == b0.size() && b0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends f0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(defpackage.e.d("Failed to access ", cls), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(defpackage.e.d("An exception happened in constructor of ", cls), e3.getCause());
        }
    }
}
