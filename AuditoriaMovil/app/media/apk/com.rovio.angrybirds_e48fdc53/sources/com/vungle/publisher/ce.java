package com.vungle.publisher;

import android.database.Cursor;
import android.database.SQLException;
/* loaded from: classes4.dex */
public final class ce {
    public static Boolean a(Cursor cursor, String str) {
        Integer c = c(cursor, str);
        if (c == null) {
            return null;
        }
        switch (c.intValue()) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return Boolean.TRUE;
            default:
                throw new SQLException("invalid boolean value " + c + " for column " + str);
        }
    }

    public static <E extends Enum<E>> E a(Cursor cursor, String str, Class<E> cls) {
        try {
            return (E) a(cursor, cursor.getColumnIndexOrThrow(str), cls);
        } catch (IllegalArgumentException e) {
            throw new SQLException("invalid column name: " + str);
        }
    }

    public static <E extends Enum<E>> E a(Cursor cursor, int i, Class<E> cls) {
        String string = cursor.getString(i);
        try {
            if (cursor.isNull(i)) {
                return null;
            }
            return (E) Enum.valueOf(cls, string);
        } catch (IllegalArgumentException e) {
            throw new SQLException("invalid enum: " + string);
        }
    }

    public static Float b(Cursor cursor, String str) {
        try {
            return a(cursor, cursor.getColumnIndexOrThrow(str));
        } catch (IllegalArgumentException e) {
            throw new SQLException("invalid column name: " + str);
        }
    }

    public static Float a(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i));
    }

    public static int a(Cursor cursor, String str, int i) {
        try {
            return a(cursor, cursor.getColumnIndexOrThrow(str), i);
        } catch (IllegalArgumentException e) {
            throw new SQLException("invalid column name: " + str);
        }
    }

    public static int a(Cursor cursor, int i, int i2) {
        Integer b = b(cursor, i);
        return b == null ? i2 : b.intValue();
    }

    public static Integer c(Cursor cursor, String str) {
        try {
            return b(cursor, cursor.getColumnIndexOrThrow(str));
        } catch (IllegalArgumentException e) {
            throw new SQLException("invalid column name: " + str);
        }
    }

    public static Integer b(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i));
    }

    public static Long d(Cursor cursor, String str) {
        try {
            return c(cursor, cursor.getColumnIndexOrThrow(str));
        } catch (IllegalArgumentException e) {
            throw new SQLException("invalid column name: " + str);
        }
    }

    public static Long c(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    public static String e(Cursor cursor, String str) {
        try {
            return d(cursor, cursor.getColumnIndexOrThrow(str));
        } catch (IllegalArgumentException e) {
            throw new SQLException("invalid column name: " + str);
        }
    }

    public static String d(Cursor cursor, int i) {
        return cursor.getString(i);
    }

    public static String a(int i) {
        if (i < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder((i * 2) - 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }
}
