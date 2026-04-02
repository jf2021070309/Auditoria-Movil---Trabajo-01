package c.b.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class a0 {
    public static final RectF a = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: b  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f1070b = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: c  reason: collision with root package name */
    public static ConcurrentHashMap<String, Field> f1071c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public int f1072d = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1073e = false;

    /* renamed from: f  reason: collision with root package name */
    public float f1074f = -1.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f1075g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f1076h = -1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int[] f1077i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public boolean f1078j = false;

    /* renamed from: k  reason: collision with root package name */
    public TextPaint f1079k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f1080l;

    /* renamed from: m  reason: collision with root package name */
    public final Context f1081m;

    /* renamed from: n  reason: collision with root package name */
    public final c f1082n;

    /* loaded from: classes.dex */
    public static class a extends c {
        @Override // c.b.i.a0.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) a0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // c.b.i.a0.a, c.b.i.a0.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // c.b.i.a0.c
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) a0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public a0(TextView textView) {
        this.f1080l = textView;
        this.f1081m = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f1082n = new b();
        } else if (i2 >= 23) {
            this.f1082n = new a();
        } else {
            this.f1082n = new c();
        }
    }

    public static Method d(String str) {
        try {
            Method method = f1070b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1070b.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t) {
        try {
            return (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    public void a() {
        if (i() && this.f1072d != 0) {
            if (this.f1073e) {
                if (this.f1080l.getMeasuredHeight() <= 0 || this.f1080l.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1082n.b(this.f1080l) ? 1048576 : (this.f1080l.getMeasuredWidth() - this.f1080l.getTotalPaddingLeft()) - this.f1080l.getTotalPaddingRight();
                int height = (this.f1080l.getHeight() - this.f1080l.getCompoundPaddingBottom()) - this.f1080l.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = a;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float c2 = c(rectF);
                    if (c2 != this.f1080l.getTextSize()) {
                        f(0, c2);
                    }
                }
            }
            this.f1073e = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0104, code lost:
        if (r7.getLineEnd(r7.getLineCount() - 1) != r8.length()) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(android.graphics.RectF r21) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.i.a0.c(android.graphics.RectF):int");
    }

    public void f(int i2, float f2) {
        Context context = this.f1081m;
        float applyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f1080l.getPaint().getTextSize()) {
            this.f1080l.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f1080l.isInLayout();
            if (this.f1080l.getLayout() != null) {
                this.f1073e = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(this.f1080l, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (isInLayout) {
                    this.f1080l.forceLayout();
                } else {
                    this.f1080l.requestLayout();
                }
                this.f1080l.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f1072d == 1) {
            if (!this.f1078j || this.f1077i.length == 0) {
                int floor = ((int) Math.floor((this.f1076h - this.f1075g) / this.f1074f)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f1074f) + this.f1075g);
                }
                this.f1077i = b(iArr);
            }
            this.f1073e = true;
        } else {
            this.f1073e = false;
        }
        return this.f1073e;
    }

    public final boolean h() {
        int[] iArr = this.f1077i;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1078j = z;
        if (z) {
            this.f1072d = 1;
            this.f1075g = iArr[0];
            this.f1076h = iArr[length - 1];
            this.f1074f = -1.0f;
        }
        return z;
    }

    public final boolean i() {
        return !(this.f1080l instanceof k);
    }

    public final void j(float f2, float f3, float f4) throws IllegalArgumentException {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        } else {
            this.f1072d = 1;
            this.f1075g = f2;
            this.f1076h = f3;
            this.f1074f = f4;
            this.f1078j = false;
        }
    }
}
