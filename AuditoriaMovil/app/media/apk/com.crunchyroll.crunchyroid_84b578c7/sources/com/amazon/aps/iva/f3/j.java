package com.amazon.aps.iva.f3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: TypedArrayUtils.java */
/* loaded from: classes.dex */
public final class j {
    public static int a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static ColorStateList b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!h(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i != 2) {
            if (i >= 28 && i <= 31) {
                return ColorStateList.valueOf(typedValue.data);
            }
            Resources resources = typedArray.getResources();
            int resourceId = typedArray.getResourceId(1, 0);
            ThreadLocal<TypedValue> threadLocal = b.a;
            try {
                return b.a(resources, resources.getXml(resourceId), theme);
            } catch (Exception unused) {
                return null;
            }
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
    }

    public static c c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        c cVar;
        if (h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new c(null, null, typedValue.data);
            }
            try {
                cVar = c.a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new c(null, null, 0);
    }

    public static float d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!h(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    public static int e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!h(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    public static String f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!h(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static String g(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        if (string == null) {
            return typedArray.getString(i2);
        }
        return string;
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static TypedArray i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
