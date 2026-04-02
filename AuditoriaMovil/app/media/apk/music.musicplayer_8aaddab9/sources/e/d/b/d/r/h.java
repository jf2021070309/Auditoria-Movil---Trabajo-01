package e.d.b.d.r;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class h {
    public static final int a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f6531b;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor<StaticLayout> f6532c;

    /* renamed from: d  reason: collision with root package name */
    public static Object f6533d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f6534e;

    /* renamed from: f  reason: collision with root package name */
    public final TextPaint f6535f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6536g;

    /* renamed from: h  reason: collision with root package name */
    public int f6537h;
    public boolean o;

    /* renamed from: i  reason: collision with root package name */
    public Layout.Alignment f6538i = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: j  reason: collision with root package name */
    public int f6539j = Integer.MAX_VALUE;

    /* renamed from: k  reason: collision with root package name */
    public float f6540k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f6541l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public int f6542m = a;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6543n = true;
    public TextUtils.TruncateAt p = null;

    /* loaded from: classes2.dex */
    public static class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = e.a.d.a.a.y(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.d.b.d.r.h.a.<init>(java.lang.Throwable):void");
        }
    }

    static {
        a = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public h(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f6534e = charSequence;
        this.f6535f = textPaint;
        this.f6536g = i2;
        this.f6537h = charSequence.length();
    }

    public StaticLayout a() throws a {
        if (this.f6534e == null) {
            this.f6534e = "";
        }
        int max = Math.max(0, this.f6536g);
        CharSequence charSequence = this.f6534e;
        if (this.f6539j == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f6535f, max, this.p);
        }
        int min = Math.min(charSequence.length(), this.f6537h);
        this.f6537h = min;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (!f6531b) {
                try {
                    f6533d = this.o && i2 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                    Class cls = Integer.TYPE;
                    Class cls2 = Float.TYPE;
                    Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                    f6532c = declaredConstructor;
                    declaredConstructor.setAccessible(true);
                    f6531b = true;
                } catch (Exception e2) {
                    throw new a(e2);
                }
            }
            try {
                Constructor<StaticLayout> constructor = f6532c;
                Objects.requireNonNull(constructor);
                Object obj = f6533d;
                Objects.requireNonNull(obj);
                return constructor.newInstance(charSequence, 0, Integer.valueOf(this.f6537h), this.f6535f, Integer.valueOf(max), this.f6538i, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f6543n), null, Integer.valueOf(max), Integer.valueOf(this.f6539j));
            } catch (Exception e3) {
                throw new a(e3);
            }
        }
        if (this.o && this.f6539j == 1) {
            this.f6538i = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f6535f, max);
        obtain.setAlignment(this.f6538i);
        obtain.setIncludePad(this.f6543n);
        obtain.setTextDirection(this.o ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.p;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f6539j);
        float f2 = this.f6540k;
        if (f2 != 0.0f || this.f6541l != 1.0f) {
            obtain.setLineSpacing(f2, this.f6541l);
        }
        if (this.f6539j > 1) {
            obtain.setHyphenationFrequency(this.f6542m);
        }
        return obtain.build();
    }
}
