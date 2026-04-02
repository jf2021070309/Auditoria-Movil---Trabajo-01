package com.bytedance.pangle.util;
/* loaded from: classes.dex */
public final class d {
    public static <T> boolean a(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    private static <T> boolean a(T[] tArr, T t) {
        int i;
        if (tArr != null) {
            i = 0;
            while (i < tArr.length) {
                if (tArr[i] == t || (tArr[i] != null && tArr[i].equals(t))) {
                    break;
                }
                i++;
            }
        }
        i = -1;
        return i != -1;
    }

    public static <T> boolean a(T[] tArr, T[] tArr2) {
        if (tArr2 == null) {
            return true;
        }
        for (T t : tArr2) {
            if (!a(tArr, t)) {
                return false;
            }
        }
        return true;
    }
}
