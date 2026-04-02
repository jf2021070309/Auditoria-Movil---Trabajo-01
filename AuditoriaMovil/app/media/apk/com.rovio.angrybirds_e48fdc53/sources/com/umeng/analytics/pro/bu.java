package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;
/* compiled from: TEnumHelper.java */
/* loaded from: classes3.dex */
public class bu {
    public static bt a(Class<? extends bt> cls, int i) {
        try {
            return (bt) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            return null;
        } catch (NoSuchMethodException e2) {
            return null;
        } catch (InvocationTargetException e3) {
            return null;
        }
    }
}
