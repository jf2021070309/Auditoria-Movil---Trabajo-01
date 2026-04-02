package com.amazon.aps.iva.k3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
/* compiled from: Bundle.kt */
/* loaded from: classes.dex */
public final class e {
    public static final Bundle a(com.amazon.aps.iva.kb0.j<String, ? extends Object>... jVarArr) {
        Bundle bundle = new Bundle(jVarArr.length);
        for (com.amazon.aps.iva.kb0.j<String, ? extends Object> jVar : jVarArr) {
            String str = jVar.b;
            B b = jVar.c;
            if (b == 0) {
                bundle.putString(str, null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(str, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(str, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(str, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(str, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(str, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(str, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(str, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(str, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(str, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(str, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(str, (short[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                com.amazon.aps.iva.yb0.j.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) b);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (b instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b);
            } else if (b instanceof IBinder) {
                b.a(bundle, str, (IBinder) b);
            } else if (b instanceof Size) {
                c.a(bundle, str, (Size) b);
            } else if (b instanceof SizeF) {
                c.b(bundle, str, (SizeF) b);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }
}
