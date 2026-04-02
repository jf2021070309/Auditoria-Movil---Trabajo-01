package com.vungle.warren.persistence;

import android.content.ContentValues;
/* loaded from: classes2.dex */
public class ContentValuesUtil {
    public static boolean getBoolean(ContentValues contentValues, String str) {
        Object obj = contentValues.get(str);
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException unused) {
            return obj instanceof CharSequence ? Boolean.valueOf(obj.toString()).booleanValue() || "1".equals(obj) : (obj instanceof Number) && ((Number) obj).intValue() != 0;
        }
    }
}
