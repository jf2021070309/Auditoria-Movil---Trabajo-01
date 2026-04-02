package com.amazon.aps.iva.q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.f3.f;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.t3.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public final class d0 {
    public final TextView a;
    public b1 b;
    public b1 c;
    public b1 d;
    public b1 e;
    public b1 f;
    public b1 g;
    public b1 h;
    public final f0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class d {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class e {
        public static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public d0(TextView textView) {
        this.a = textView;
        this.i = new f0(textView);
    }

    public static b1 c(Context context, j jVar, int i) {
        ColorStateList h;
        synchronized (jVar) {
            h = jVar.a.h(i, context);
        }
        if (h != null) {
            b1 b1Var = new b1();
            b1Var.d = true;
            b1Var.a = h;
            return b1Var;
        }
        return null;
    }

    public final void a(Drawable drawable, b1 b1Var) {
        if (drawable != null && b1Var != null) {
            j.e(drawable, b1Var, this.a.getDrawableState());
        }
    }

    public final void b() {
        b1 b1Var = this.b;
        TextView textView = this.a;
        if (b1Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f != null || this.g != null) {
            Drawable[] a2 = b.a(textView);
            a(a2[0], this.f);
            a(a2[2], this.g);
        }
    }

    public final ColorStateList d() {
        b1 b1Var = this.h;
        if (b1Var != null) {
            return b1Var.a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        b1 b1Var = this.h;
        if (b1Var != null) {
            return b1Var.b;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        int i2;
        float f;
        float f2;
        float f3;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i3;
        int fontMetricsInt;
        int i4;
        int resourceId;
        int i5;
        TextView textView = this.a;
        Context context = textView.getContext();
        j a2 = j.a();
        int[] iArr = com.amazon.aps.iva.j.a.h;
        d1 m = d1.m(context, attributeSet, iArr, i);
        com.amazon.aps.iva.p3.g0.m(textView, textView.getContext(), iArr, attributeSet, m.b, i);
        int i6 = m.i(0, -1);
        if (m.l(3)) {
            this.b = c(context, a2, m.i(3, 0));
        }
        if (m.l(1)) {
            this.c = c(context, a2, m.i(1, 0));
        }
        if (m.l(4)) {
            this.d = c(context, a2, m.i(4, 0));
        }
        if (m.l(2)) {
            this.e = c(context, a2, m.i(2, 0));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (m.l(5)) {
            this.f = c(context, a2, m.i(5, 0));
        }
        if (m.l(6)) {
            this.g = c(context, a2, m.i(6, 0));
        }
        m.n();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = com.amazon.aps.iva.j.a.y;
        if (i6 != -1) {
            d1 d1Var = new d1(context, context.obtainStyledAttributes(i6, iArr2));
            if (!z3 && d1Var.l(14)) {
                z = d1Var.a(14, false);
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            m(context, d1Var);
            if (d1Var.l(15)) {
                str = d1Var.j(15);
                i5 = 13;
            } else {
                i5 = 13;
                str = null;
            }
            if (d1Var.l(i5)) {
                str2 = d1Var.j(i5);
            } else {
                str2 = null;
            }
            d1Var.n();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        d1 d1Var2 = new d1(context, context.obtainStyledAttributes(attributeSet, iArr2, i, 0));
        if (!z3 && d1Var2.l(14)) {
            z = d1Var2.a(14, false);
            i2 = 15;
            z2 = true;
        } else {
            i2 = 15;
        }
        if (d1Var2.l(i2)) {
            str = d1Var2.j(i2);
        }
        if (d1Var2.l(13)) {
            str2 = d1Var2.j(13);
        }
        String str3 = str2;
        if (i7 >= 28 && d1Var2.l(0) && d1Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, d1Var2);
        d1Var2.n();
        if (!z3 && z2) {
            textView.setAllCaps(z);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            d.d(textView, str3);
        }
        if (str != null) {
            c.b(textView, c.a(str));
        }
        int[] iArr3 = com.amazon.aps.iva.j.a.i;
        f0 f0Var = this.i;
        Context context2 = f0Var.j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = f0Var.i;
        com.amazon.aps.iva.p3.g0.m(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i);
        if (obtainStyledAttributes.hasValue(5)) {
            f0Var.a = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f2 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f3 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr4[i8] = obtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                f0Var.f = f0.b(iArr4);
                f0Var.g();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (f0Var.h()) {
            if (f0Var.a == 1) {
                if (!f0Var.g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f2 == -1.0f) {
                        i4 = 2;
                        f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i4 = 2;
                    }
                    if (f3 == -1.0f) {
                        f3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                    }
                    if (f == -1.0f) {
                        f = 1.0f;
                    }
                    f0Var.i(f2, f3, f);
                }
                f0Var.f();
            }
        } else {
            f0Var.a = 0;
        }
        if (m1.b && f0Var.a != 0) {
            int[] iArr5 = f0Var.f;
            if (iArr5.length > 0) {
                if (d.a(textView) != -1.0f) {
                    d.b(textView, Math.round(f0Var.d), Math.round(f0Var.e), Math.round(f0Var.c), 0);
                } else {
                    d.c(textView, iArr5, 0);
                }
            }
        }
        d1 d1Var3 = new d1(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int i9 = d1Var3.i(8, -1);
        if (i9 != -1) {
            drawable = a2.b(context, i9);
        } else {
            drawable = null;
        }
        int i10 = d1Var3.i(13, -1);
        if (i10 != -1) {
            drawable2 = a2.b(context, i10);
        } else {
            drawable2 = null;
        }
        int i11 = d1Var3.i(9, -1);
        if (i11 != -1) {
            drawable3 = a2.b(context, i11);
        } else {
            drawable3 = null;
        }
        int i12 = d1Var3.i(6, -1);
        if (i12 != -1) {
            drawable4 = a2.b(context, i12);
        } else {
            drawable4 = null;
        }
        int i13 = d1Var3.i(10, -1);
        if (i13 != -1) {
            drawable5 = a2.b(context, i13);
        } else {
            drawable5 = null;
        }
        int i14 = d1Var3.i(7, -1);
        if (i14 != -1) {
            drawable6 = a2.b(context, i14);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a3 = b.a(textView);
                Drawable drawable7 = a3[0];
                if (drawable7 == null && a3[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = a3[1];
                    }
                    Drawable drawable8 = a3[2];
                    if (drawable4 == null) {
                        drawable4 = a3[3];
                    }
                    b.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a4 = b.a(textView);
            if (drawable5 == null) {
                drawable5 = a4[0];
            }
            if (drawable2 == null) {
                drawable2 = a4[1];
            }
            if (drawable6 == null) {
                drawable6 = a4[2];
            }
            if (drawable4 == null) {
                drawable4 = a4[3];
            }
            b.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (d1Var3.l(11)) {
            k.c.f(textView, d1Var3.b(11));
        }
        if (d1Var3.l(12)) {
            i3 = -1;
            k.c.g(textView, j0.c(d1Var3.h(12, -1), null));
        } else {
            i3 = -1;
        }
        int d2 = d1Var3.d(15, i3);
        int d3 = d1Var3.d(18, i3);
        int d4 = d1Var3.d(19, i3);
        d1Var3.n();
        if (d2 != i3) {
            com.amazon.aps.iva.t3.k.b(textView, d2);
        }
        if (d3 != i3) {
            com.amazon.aps.iva.t3.k.c(textView, d3);
        }
        if (d4 != i3) {
            com.amazon.aps.iva.cq.b.w(d4);
            if (d4 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(d4 - fontMetricsInt, 1.0f);
            }
        }
    }

    public final void g(int i, Context context) {
        String j;
        d1 d1Var = new d1(context, context.obtainStyledAttributes(i, com.amazon.aps.iva.j.a.y));
        boolean l = d1Var.l(14);
        TextView textView = this.a;
        if (l) {
            textView.setAllCaps(d1Var.a(14, false));
        }
        if (d1Var.l(0) && d1Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, d1Var);
        if (d1Var.l(13) && (j = d1Var.j(13)) != null) {
            d.d(textView, j);
        }
        d1Var.n();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        f0 f0Var = this.i;
        if (f0Var.h()) {
            DisplayMetrics displayMetrics = f0Var.j.getResources().getDisplayMetrics();
            f0Var.i(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (f0Var.f()) {
                f0Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i) throws IllegalArgumentException {
        f0 f0Var = this.i;
        if (f0Var.h()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = f0Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                f0Var.f = f0.b(iArr2);
                if (!f0Var.g()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                f0Var.g = false;
            }
            if (f0Var.f()) {
                f0Var.a();
            }
        }
    }

    public final void j(int i) {
        f0 f0Var = this.i;
        if (f0Var.h()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = f0Var.j.getResources().getDisplayMetrics();
                    f0Var.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (f0Var.f()) {
                        f0Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(c0.a("Unknown auto-size text type: ", i));
            }
            f0Var.a = 0;
            f0Var.d = -1.0f;
            f0Var.e = -1.0f;
            f0Var.c = -1.0f;
            f0Var.f = new int[0];
            f0Var.b = false;
        }
    }

    public final void k(ColorStateList colorStateList) {
        boolean z;
        if (this.h == null) {
            this.h = new b1();
        }
        b1 b1Var = this.h;
        b1Var.a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        b1Var.d = z;
        this.b = b1Var;
        this.c = b1Var;
        this.d = b1Var;
        this.e = b1Var;
        this.f = b1Var;
        this.g = b1Var;
    }

    public final void l(PorterDuff.Mode mode) {
        boolean z;
        if (this.h == null) {
            this.h = new b1();
        }
        b1 b1Var = this.h;
        b1Var.b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        b1Var.c = z;
        this.b = b1Var;
        this.c = b1Var;
        this.d = b1Var;
        this.e = b1Var;
        this.f = b1Var;
        this.g = b1Var;
    }

    public final void m(Context context, d1 d1Var) {
        String j;
        boolean z;
        boolean z2;
        this.j = d1Var.h(2, this.j);
        int i = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i >= 28) {
            int h = d1Var.h(11, -1);
            this.k = h;
            if (h != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        int i2 = 10;
        if (!d1Var.l(10) && !d1Var.l(12)) {
            if (d1Var.l(1)) {
                this.m = false;
                int h2 = d1Var.h(1, 1);
                if (h2 != 1) {
                    if (h2 != 2) {
                        if (h2 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.l = Typeface.SERIF;
                    return;
                }
                this.l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.l = null;
        if (d1Var.l(12)) {
            i2 = 12;
        }
        int i3 = this.k;
        int i4 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface g = d1Var.g(i2, this.j, new a(i3, i4, new WeakReference(this.a)));
                if (g != null) {
                    if (i >= 28 && this.k != -1) {
                        Typeface create = Typeface.create(g, 0);
                        int i5 = this.k;
                        if ((this.j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.l = e.a(create, i5, z2);
                    } else {
                        this.l = g;
                    }
                }
                if (this.l == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.m = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l == null && (j = d1Var.j(i2)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                Typeface create2 = Typeface.create(j, 0);
                int i6 = this.k;
                if ((this.j & 2) != 0) {
                    z3 = true;
                }
                this.l = e.a(create2, i6, z3);
                return;
            }
            this.l = Typeface.create(j, this.j);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public class a extends f.e {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // com.amazon.aps.iva.f3.f.e
        public final void onFontRetrieved(Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
                if ((this.b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = e.a(typeface, i, z);
            }
            d0 d0Var = d0.this;
            if (d0Var.m) {
                d0Var.l = typeface;
                TextView textView = (TextView) this.c.get();
                if (textView != null) {
                    WeakHashMap<View, com.amazon.aps.iva.p3.r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                    if (g0.g.b(textView)) {
                        textView.post(new e0(textView, typeface, d0Var.j));
                    } else {
                        textView.setTypeface(typeface, d0Var.j);
                    }
                }
            }
        }

        @Override // com.amazon.aps.iva.f3.f.e
        public final void onFontRetrievalFailed(int i) {
        }
    }
}
