package com.amazon.aps.iva.xw;

import android.content.SharedPreferences;
/* compiled from: SharedPreferencesExtensions.kt */
/* loaded from: classes2.dex */
public final class l0 {
    public static final <T> T a(SharedPreferences sharedPreferences, String str, T t) {
        com.amazon.aps.iva.yb0.j.f(sharedPreferences, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "key");
        if (t instanceof String) {
            com.amazon.aps.iva.yb0.j.d(t, "null cannot be cast to non-null type kotlin.String");
            return (T) sharedPreferences.getString(str, (String) t);
        } else if (t instanceof Boolean) {
            com.amazon.aps.iva.yb0.j.d(t, "null cannot be cast to non-null type kotlin.Boolean");
            return (T) Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()));
        } else if (t instanceof Integer) {
            com.amazon.aps.iva.yb0.j.d(t, "null cannot be cast to non-null type kotlin.Int");
            return (T) Integer.valueOf(sharedPreferences.getInt(str, ((Integer) t).intValue()));
        } else if (t instanceof Float) {
            com.amazon.aps.iva.yb0.j.d(t, "null cannot be cast to non-null type kotlin.Float");
            return (T) Float.valueOf(sharedPreferences.getFloat(str, ((Float) t).floatValue()));
        } else if (t instanceof Long) {
            com.amazon.aps.iva.yb0.j.d(t, "null cannot be cast to non-null type kotlin.Long");
            return (T) Long.valueOf(sharedPreferences.getLong(str, ((Long) t).longValue()));
        } else {
            throw new IllegalArgumentException(t + " is not yet supported");
        }
    }

    public static final <T> void b(SharedPreferences sharedPreferences, String str, T t) {
        com.amazon.aps.iva.yb0.j.f(sharedPreferences, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "key");
        if (t instanceof String) {
            sharedPreferences.edit().putString(str, (String) t).apply();
        } else if (t instanceof Boolean) {
            sharedPreferences.edit().putBoolean(str, ((Boolean) t).booleanValue()).apply();
        } else if (t instanceof Integer) {
            sharedPreferences.edit().putInt(str, ((Number) t).intValue()).apply();
        } else if (t instanceof Float) {
            sharedPreferences.edit().putFloat(str, ((Number) t).floatValue()).apply();
        } else if (t instanceof Long) {
            sharedPreferences.edit().putLong(str, ((Number) t).longValue()).apply();
        } else {
            throw new IllegalArgumentException(t + " is not yet supported");
        }
    }
}
