package com.amazon.aps.iva.oa0;

import android.content.res.Configuration;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: SLReflectionUtils.java */
/* loaded from: classes4.dex */
public final class g0 {
    public static Object a(Object obj, String str, Class[] clsArr, Object... objArr) throws Exception {
        return b(obj.getClass(), str, obj, clsArr, objArr);
    }

    public static Object b(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) throws Exception {
        Method method = cls.getMethod(str, clsArr);
        if (method == null) {
            return null;
        }
        return method.invoke(obj, objArr);
    }

    public static Object c(String str, String str2, Configuration configuration) throws Exception {
        Class<?> cls;
        Field field;
        try {
            cls = Class.forName(str);
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null || (field = cls.getField(str2)) == null) {
            return null;
        }
        return field.get(configuration);
    }
}
