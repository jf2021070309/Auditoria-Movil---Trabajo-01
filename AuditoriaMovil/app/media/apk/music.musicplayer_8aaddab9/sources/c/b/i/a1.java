package c.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import c.i.d.c.j;
/* loaded from: classes.dex */
public class a1 {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f1083b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1084c;

    public a1(Context context, TypedArray typedArray) {
        this.a = context;
        this.f1083b = typedArray;
    }

    public static a1 p(Context context, AttributeSet attributeSet, int[] iArr) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static a1 q(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z) {
        return this.f1083b.getBoolean(i2, z);
    }

    public int b(int i2, int i3) {
        return this.f1083b.getColor(i2, i3);
    }

    public ColorStateList c(int i2) {
        int resourceId;
        ColorStateList a;
        return (!this.f1083b.hasValue(i2) || (resourceId = this.f1083b.getResourceId(i2, 0)) == 0 || (a = c.b.d.a.a.a(this.a, resourceId)) == null) ? this.f1083b.getColorStateList(i2) : a;
    }

    public float d(int i2, float f2) {
        return this.f1083b.getDimension(i2, f2);
    }

    public int e(int i2, int i3) {
        return this.f1083b.getDimensionPixelOffset(i2, i3);
    }

    public int f(int i2, int i3) {
        return this.f1083b.getDimensionPixelSize(i2, i3);
    }

    public Drawable g(int i2) {
        int resourceId;
        return (!this.f1083b.hasValue(i2) || (resourceId = this.f1083b.getResourceId(i2, 0)) == 0) ? this.f1083b.getDrawable(i2) : c.b.d.a.a.b(this.a, resourceId);
    }

    public Drawable h(int i2) {
        int resourceId;
        Drawable g2;
        if (!this.f1083b.hasValue(i2) || (resourceId = this.f1083b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        j a = j.a();
        Context context = this.a;
        synchronized (a) {
            g2 = a.f1184c.g(context, resourceId, true);
        }
        return g2;
    }

    public Typeface i(int i2, int i3, j.c cVar) {
        int resourceId = this.f1083b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1084c == null) {
            this.f1084c = new TypedValue();
        }
        Context context = this.a;
        TypedValue typedValue = this.f1084c;
        ThreadLocal<TypedValue> threadLocal = c.i.d.c.j.a;
        if (context.isRestricted()) {
            return null;
        }
        return c.i.d.c.j.c(context, resourceId, typedValue, i3, cVar, null, true, false);
    }

    public int j(int i2, int i3) {
        return this.f1083b.getInt(i2, i3);
    }

    public int k(int i2, int i3) {
        return this.f1083b.getLayoutDimension(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.f1083b.getResourceId(i2, i3);
    }

    public String m(int i2) {
        return this.f1083b.getString(i2);
    }

    public CharSequence n(int i2) {
        return this.f1083b.getText(i2);
    }

    public boolean o(int i2) {
        return this.f1083b.hasValue(i2);
    }
}
