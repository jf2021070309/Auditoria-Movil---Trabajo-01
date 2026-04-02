package c.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import c.i.d.c.j;
import c.i.k.d0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class y {
    public final TextView a;

    /* renamed from: b  reason: collision with root package name */
    public y0 f1266b;

    /* renamed from: c  reason: collision with root package name */
    public y0 f1267c;

    /* renamed from: d  reason: collision with root package name */
    public y0 f1268d;

    /* renamed from: e  reason: collision with root package name */
    public y0 f1269e;

    /* renamed from: f  reason: collision with root package name */
    public y0 f1270f;

    /* renamed from: g  reason: collision with root package name */
    public y0 f1271g;

    /* renamed from: h  reason: collision with root package name */
    public y0 f1272h;

    /* renamed from: i  reason: collision with root package name */
    public final a0 f1273i;

    /* renamed from: j  reason: collision with root package name */
    public int f1274j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1275k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f1276l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1277m;

    /* loaded from: classes.dex */
    public class a extends j.c {
        public final /* synthetic */ int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1278b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f1279c;

        public a(int i2, int i3, WeakReference weakReference) {
            this.a = i2;
            this.f1278b = i3;
            this.f1279c = weakReference;
        }

        @Override // c.i.d.c.j.c
        public void d(int i2) {
        }

        @Override // c.i.d.c.j.c
        public void e(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.f1278b & 2) != 0);
            }
            y yVar = y.this;
            WeakReference weakReference = this.f1279c;
            if (yVar.f1277m) {
                yVar.f1276l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    AtomicInteger atomicInteger = c.i.k.d0.a;
                    if (d0.f.b(textView)) {
                        textView.post(new z(yVar, textView, typeface, yVar.f1274j));
                    } else {
                        textView.setTypeface(typeface, yVar.f1274j);
                    }
                }
            }
        }
    }

    public y(TextView textView) {
        this.a = textView;
        this.f1273i = new a0(textView);
    }

    public static y0 c(Context context, j jVar, int i2) {
        ColorStateList d2 = jVar.d(context, i2);
        if (d2 != null) {
            y0 y0Var = new y0();
            y0Var.f1283d = true;
            y0Var.a = d2;
            return y0Var;
        }
        return null;
    }

    public final void a(Drawable drawable, y0 y0Var) {
        if (drawable == null || y0Var == null) {
            return;
        }
        j.f(drawable, y0Var, this.a.getDrawableState());
    }

    public void b() {
        if (this.f1266b != null || this.f1267c != null || this.f1268d != null || this.f1269e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1266b);
            a(compoundDrawables[1], this.f1267c);
            a(compoundDrawables[2], this.f1268d);
            a(compoundDrawables[3], this.f1269e);
        }
        if (this.f1270f == null && this.f1271g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1270f);
        a(compoundDrawablesRelative[2], this.f1271g);
    }

    public boolean d() {
        a0 a0Var = this.f1273i;
        return a0Var.i() && a0Var.f1072d != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.i.y.e(android.util.AttributeSet, int):void");
    }

    public void f(Context context, int i2) {
        String m2;
        ColorStateList c2;
        ColorStateList c3;
        ColorStateList c4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, c.b.b.w);
        a1 a1Var = new a1(context, obtainStyledAttributes);
        if (a1Var.o(14)) {
            this.a.setAllCaps(a1Var.a(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            if (a1Var.o(3) && (c4 = a1Var.c(3)) != null) {
                this.a.setTextColor(c4);
            }
            if (a1Var.o(5) && (c3 = a1Var.c(5)) != null) {
                this.a.setLinkTextColor(c3);
            }
            if (a1Var.o(4) && (c2 = a1Var.c(4)) != null) {
                this.a.setHintTextColor(c2);
            }
        }
        if (a1Var.o(0) && a1Var.f(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        m(context, a1Var);
        if (i3 >= 26 && a1Var.o(13) && (m2 = a1Var.m(13)) != null) {
            this.a.setFontVariationSettings(m2);
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.f1276l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.f1274j);
        }
    }

    public void g(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        Objects.requireNonNull(text);
        if (i2 >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 + 0 : i3 + 0;
        int i6 = i3 > i4 ? i3 - 0 : i4 + 0;
        int length = text.length();
        if (i5 < 0 || i6 > length) {
            c.i.k.m0.a.b(editorInfo, null, 0, 0);
            return;
        }
        int i7 = editorInfo.inputType & 4095;
        if (i7 == 129 || i7 == 225 || i7 == 18) {
            c.i.k.m0.a.b(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            c.i.k.m0.a.b(editorInfo, text, i5, i6);
        } else {
            int i8 = i6 - i5;
            int i9 = i8 > 1024 ? 0 : i8;
            int i10 = 2048 - i9;
            double d2 = i10;
            Double.isNaN(d2);
            Double.isNaN(d2);
            Double.isNaN(d2);
            Double.isNaN(d2);
            Double.isNaN(d2);
            int min = Math.min(text.length() - i6, i10 - Math.min(i5, (int) (d2 * 0.8d)));
            int min2 = Math.min(i5, i10 - min);
            int i11 = i5 - min2;
            if (c.i.k.m0.a.a(text, i11, 0)) {
                i11++;
                min2--;
            }
            if (c.i.k.m0.a.a(text, (i6 + min) - 1, 1)) {
                min--;
            }
            CharSequence concat = i9 != i8 ? TextUtils.concat(text.subSequence(i11, i11 + min2), text.subSequence(i6, min + i6)) : text.subSequence(i11, min2 + i9 + min + i11);
            int i12 = min2 + 0;
            c.i.k.m0.a.b(editorInfo, concat, i12, i9 + i12);
        }
    }

    public void h(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        a0 a0Var = this.f1273i;
        if (a0Var.i()) {
            DisplayMetrics displayMetrics = a0Var.f1081m.getResources().getDisplayMetrics();
            a0Var.j(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (a0Var.g()) {
                a0Var.a();
            }
        }
    }

    public void i(int[] iArr, int i2) throws IllegalArgumentException {
        a0 a0Var = this.f1273i;
        if (a0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = a0Var.f1081m.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                a0Var.f1077i = a0Var.b(iArr2);
                if (!a0Var.h()) {
                    StringBuilder y = e.a.d.a.a.y("None of the preset sizes is valid: ");
                    y.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(y.toString());
                }
            } else {
                a0Var.f1078j = false;
            }
            if (a0Var.g()) {
                a0Var.a();
            }
        }
    }

    public void j(int i2) {
        a0 a0Var = this.f1273i;
        if (a0Var.i()) {
            if (i2 == 0) {
                a0Var.f1072d = 0;
                a0Var.f1075g = -1.0f;
                a0Var.f1076h = -1.0f;
                a0Var.f1074f = -1.0f;
                a0Var.f1077i = new int[0];
                a0Var.f1073e = false;
            } else if (i2 != 1) {
                throw new IllegalArgumentException(e.a.d.a.a.e("Unknown auto-size text type: ", i2));
            } else {
                DisplayMetrics displayMetrics = a0Var.f1081m.getResources().getDisplayMetrics();
                a0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (a0Var.g()) {
                    a0Var.a();
                }
            }
        }
    }

    public void k(ColorStateList colorStateList) {
        if (this.f1272h == null) {
            this.f1272h = new y0();
        }
        y0 y0Var = this.f1272h;
        y0Var.a = colorStateList;
        y0Var.f1283d = colorStateList != null;
        this.f1266b = y0Var;
        this.f1267c = y0Var;
        this.f1268d = y0Var;
        this.f1269e = y0Var;
        this.f1270f = y0Var;
        this.f1271g = y0Var;
    }

    public void l(PorterDuff.Mode mode) {
        if (this.f1272h == null) {
            this.f1272h = new y0();
        }
        y0 y0Var = this.f1272h;
        y0Var.f1281b = mode;
        y0Var.f1282c = mode != null;
        this.f1266b = y0Var;
        this.f1267c = y0Var;
        this.f1268d = y0Var;
        this.f1269e = y0Var;
        this.f1270f = y0Var;
        this.f1271g = y0Var;
    }

    public final void m(Context context, a1 a1Var) {
        String m2;
        this.f1274j = a1Var.j(2, this.f1274j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int j2 = a1Var.j(11, -1);
            this.f1275k = j2;
            if (j2 != -1) {
                this.f1274j = (this.f1274j & 2) | 0;
            }
        }
        if (!a1Var.o(10) && !a1Var.o(12)) {
            if (a1Var.o(1)) {
                this.f1277m = false;
                int j3 = a1Var.j(1, 1);
                if (j3 == 1) {
                    this.f1276l = Typeface.SANS_SERIF;
                    return;
                } else if (j3 == 2) {
                    this.f1276l = Typeface.SERIF;
                    return;
                } else if (j3 != 3) {
                    return;
                } else {
                    this.f1276l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1276l = null;
        int i3 = a1Var.o(12) ? 12 : 10;
        int i4 = this.f1275k;
        int i5 = this.f1274j;
        if (!context.isRestricted()) {
            try {
                Typeface i6 = a1Var.i(i3, this.f1274j, new a(i4, i5, new WeakReference(this.a)));
                if (i6 != null) {
                    if (i2 < 28 || this.f1275k == -1) {
                        this.f1276l = i6;
                    } else {
                        this.f1276l = Typeface.create(Typeface.create(i6, 0), this.f1275k, (this.f1274j & 2) != 0);
                    }
                }
                this.f1277m = this.f1276l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1276l != null || (m2 = a1Var.m(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1275k == -1) {
            this.f1276l = Typeface.create(m2, this.f1274j);
        } else {
            this.f1276l = Typeface.create(Typeface.create(m2, 0), this.f1275k, (this.f1274j & 2) != 0);
        }
    }
}
