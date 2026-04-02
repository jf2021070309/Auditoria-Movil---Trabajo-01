package com.amazon.aps.iva.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.amazon.aps.iva.q.d0;
/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public final class d1 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public d1(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static d1 m(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new d1(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public final ColorStateList b(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (colorStateList = com.amazon.aps.iva.d3.a.getColorStateList(this.a, resourceId)) != null) {
            return colorStateList;
        }
        return typedArray.getColorStateList(i);
    }

    public final int c(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public final int d(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public final Drawable e(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return com.amazon.aps.iva.l.a.a(this.a, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    public final Drawable f(int i) {
        int resourceId;
        Drawable f;
        if (this.b.hasValue(i) && (resourceId = this.b.getResourceId(i, 0)) != 0) {
            j a = j.a();
            Context context = this.a;
            synchronized (a) {
                f = a.a.f(context, resourceId, true);
            }
            return f;
        }
        return null;
    }

    public final Typeface g(int i, int i2, d0.a aVar) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        ThreadLocal<TypedValue> threadLocal = com.amazon.aps.iva.f3.f.a;
        Context context = this.a;
        if (context.isRestricted()) {
            return null;
        }
        return com.amazon.aps.iva.f3.f.b(context, resourceId, typedValue, i2, aVar, true, false);
    }

    public final int h(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public final int i(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public final String j(int i) {
        return this.b.getString(i);
    }

    public final CharSequence k(int i) {
        return this.b.getText(i);
    }

    public final boolean l(int i) {
        return this.b.hasValue(i);
    }

    public final void n() {
        this.b.recycle();
    }
}
