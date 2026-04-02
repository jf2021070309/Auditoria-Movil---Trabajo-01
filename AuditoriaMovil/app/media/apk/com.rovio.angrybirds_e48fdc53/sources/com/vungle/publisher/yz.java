package com.vungle.publisher;

import java.lang.reflect.Array;
/* loaded from: classes4.dex */
public class yz {
    public static <T> T[] a(T[]... tArr) {
        Class<?> cls = null;
        int i = 0;
        for (T[] tArr2 : tArr) {
            if (tArr2 != null) {
                i += tArr2.length;
                cls = tArr2.getClass();
            }
        }
        if (cls != null) {
            T[] tArr3 = (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), i));
            int i2 = 0;
            for (T[] tArr4 : tArr) {
                if (tArr4 != null) {
                    System.arraycopy(tArr4, 0, tArr3, i2, tArr4.length);
                    i2 += tArr4.length;
                }
            }
            return tArr3;
        }
        return null;
    }

    public static String[] a(Object[] objArr) {
        if (objArr == null) {
            return new String[0];
        }
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            strArr[i] = String.valueOf(objArr[i]);
        }
        return strArr;
    }
}
