package e.d.b.d.r;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import c.i.i.d;
import c.i.k.d0;
import ch.qos.logback.core.net.SyslogConstants;
import e.d.b.d.r.h;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class c {
    public Bitmap A;
    public float B;
    public float C;
    public int[] D;
    public boolean E;
    public final TextPaint F;
    public final TextPaint G;
    public TimeInterpolator H;
    public TimeInterpolator I;
    public float J;
    public float K;
    public float L;
    public ColorStateList M;
    public float N;
    public StaticLayout O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public CharSequence T;
    public final View a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6510b;

    /* renamed from: c  reason: collision with root package name */
    public float f6511c;

    /* renamed from: d  reason: collision with root package name */
    public float f6512d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f6513e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f6514f;

    /* renamed from: g  reason: collision with root package name */
    public final RectF f6515g;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f6520l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f6521m;

    /* renamed from: n  reason: collision with root package name */
    public float f6522n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public Typeface t;
    public Typeface u;
    public Typeface v;
    public e.d.b.d.t.a w;
    public CharSequence x;
    public CharSequence y;
    public boolean z;

    /* renamed from: h  reason: collision with root package name */
    public int f6516h = 16;

    /* renamed from: i  reason: collision with root package name */
    public int f6517i = 16;

    /* renamed from: j  reason: collision with root package name */
    public float f6518j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f6519k = 15.0f;
    public int U = h.a;

    public c(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.F = textPaint;
        this.G = new TextPaint(textPaint);
        this.f6514f = new Rect();
        this.f6513e = new Rect();
        this.f6515g = new RectF();
        this.f6512d = 0.5f;
    }

    public static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i3) * f2) + (Color.alpha(i2) * f3)), (int) ((Color.red(i3) * f2) + (Color.red(i2) * f3)), (int) ((Color.green(i3) * f2) + (Color.green(i2) * f3)), (int) ((Color.blue(i3) * f2) + (Color.blue(i2) * f3)));
    }

    public static float h(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return e.d.b.d.c.a.a(f2, f3, f4);
    }

    public static boolean k(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    public final boolean b(CharSequence charSequence) {
        View view = this.a;
        AtomicInteger atomicInteger = d0.a;
        return ((d.c) (d0.d.d(view) == 1 ? c.i.i.d.f2124d : c.i.i.d.f2123c)).b(charSequence, 0, charSequence.length());
    }

    public final void c(float f2) {
        this.f6515g.left = h(this.f6513e.left, this.f6514f.left, f2, this.H);
        this.f6515g.top = h(this.f6522n, this.o, f2, this.H);
        this.f6515g.right = h(this.f6513e.right, this.f6514f.right, f2, this.H);
        this.f6515g.bottom = h(this.f6513e.bottom, this.f6514f.bottom, f2, this.H);
        this.r = h(this.p, this.q, f2, this.H);
        this.s = h(this.f6522n, this.o, f2, this.H);
        o(h(this.f6518j, this.f6519k, f2, this.I));
        TimeInterpolator timeInterpolator = e.d.b.d.c.a.f6327b;
        this.Q = 1.0f - h(0.0f, 1.0f, 1.0f - f2, timeInterpolator);
        View view = this.a;
        AtomicInteger atomicInteger = d0.a;
        d0.c.k(view);
        this.R = h(1.0f, 0.0f, f2, timeInterpolator);
        d0.c.k(this.a);
        ColorStateList colorStateList = this.f6521m;
        ColorStateList colorStateList2 = this.f6520l;
        if (colorStateList != colorStateList2) {
            this.F.setColor(a(g(colorStateList2), f(), f2));
        } else {
            this.F.setColor(f());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f3 = this.N;
            if (f3 != 0.0f) {
                this.F.setLetterSpacing(h(0.0f, f3, f2, timeInterpolator));
            } else {
                this.F.setLetterSpacing(f3);
            }
        }
        this.F.setShadowLayer(h(0.0f, this.J, f2, null), h(0.0f, this.K, f2, null), h(0.0f, this.L, f2, null), a(g(null), g(this.M), f2));
        d0.c.k(this.a);
    }

    public final void d(float f2, boolean z) {
        boolean z2;
        float f3;
        StaticLayout staticLayout;
        if (this.x == null) {
            return;
        }
        float width = this.f6514f.width();
        float width2 = this.f6513e.width();
        if (Math.abs(f2 - this.f6519k) < 0.001f) {
            f3 = this.f6519k;
            this.B = 1.0f;
            Typeface typeface = this.v;
            Typeface typeface2 = this.t;
            if (typeface != typeface2) {
                this.v = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f4 = this.f6518j;
            Typeface typeface3 = this.v;
            Typeface typeface4 = this.u;
            if (typeface3 != typeface4) {
                this.v = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Math.abs(f2 - f4) < 0.001f) {
                this.B = 1.0f;
            } else {
                this.B = f2 / this.f6518j;
            }
            float f5 = this.f6519k / this.f6518j;
            width = (!z && width2 * f5 > width) ? Math.min(width / f5, width2) : width2;
            f3 = f4;
        }
        if (width > 0.0f) {
            z2 = this.C != f3 || this.E || z2;
            this.C = f3;
            this.E = false;
        }
        if (this.y == null || z2) {
            this.F.setTextSize(this.C);
            this.F.setTypeface(this.v);
            this.F.setLinearText(this.B != 1.0f);
            boolean b2 = b(this.x);
            this.z = b2;
            try {
                h hVar = new h(this.x, this.F, (int) width);
                hVar.p = TextUtils.TruncateAt.END;
                hVar.o = b2;
                hVar.f6538i = Layout.Alignment.ALIGN_NORMAL;
                hVar.f6543n = false;
                hVar.f6539j = 1;
                hVar.f6540k = 0.0f;
                hVar.f6541l = 1.0f;
                hVar.f6542m = this.U;
                staticLayout = hVar.a();
            } catch (h.a e2) {
                Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                staticLayout = null;
            }
            Objects.requireNonNull(staticLayout);
            this.O = staticLayout;
            this.y = staticLayout.getText();
        }
    }

    public float e() {
        TextPaint textPaint = this.G;
        textPaint.setTextSize(this.f6519k);
        textPaint.setTypeface(this.t);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.N);
        }
        return -this.G.ascent();
    }

    public int f() {
        return g(this.f6521m);
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.D;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public void i() {
        this.f6510b = this.f6514f.width() > 0 && this.f6514f.height() > 0 && this.f6513e.width() > 0 && this.f6513e.height() > 0;
    }

    public void j() {
        StaticLayout staticLayout;
        if (this.a.getHeight() <= 0 || this.a.getWidth() <= 0) {
            return;
        }
        float f2 = this.C;
        d(this.f6519k, false);
        CharSequence charSequence = this.y;
        if (charSequence != null && (staticLayout = this.O) != null) {
            this.T = TextUtils.ellipsize(charSequence, this.F, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        if (this.T != null) {
            TextPaint textPaint = new TextPaint(this.F);
            if (Build.VERSION.SDK_INT >= 21) {
                textPaint.setLetterSpacing(this.N);
            }
            CharSequence charSequence2 = this.T;
            this.P = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.P = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f6517i, this.z ? 1 : 0);
        int i2 = absoluteGravity & SyslogConstants.LOG_ALERT;
        if (i2 == 48) {
            this.o = this.f6514f.top;
        } else if (i2 != 80) {
            this.o = this.f6514f.centerY() - ((this.F.descent() - this.F.ascent()) / 2.0f);
        } else {
            this.o = this.F.ascent() + this.f6514f.bottom;
        }
        int i3 = absoluteGravity & 8388615;
        if (i3 == 1) {
            this.q = this.f6514f.centerX() - (this.P / 2.0f);
        } else if (i3 != 5) {
            this.q = this.f6514f.left;
        } else {
            this.q = this.f6514f.right - this.P;
        }
        d(this.f6518j, false);
        StaticLayout staticLayout2 = this.O;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.O;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        CharSequence charSequence3 = this.y;
        float measureText = charSequence3 != null ? this.F.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout4 = this.O;
        this.S = staticLayout4 != null ? staticLayout4.getLineLeft(0) : 0.0f;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f6516h, this.z ? 1 : 0);
        int i4 = absoluteGravity2 & SyslogConstants.LOG_ALERT;
        if (i4 == 48) {
            this.f6522n = this.f6513e.top;
        } else if (i4 != 80) {
            this.f6522n = this.f6513e.centerY() - (height / 2.0f);
        } else {
            this.f6522n = this.F.descent() + (this.f6513e.bottom - height);
        }
        int i5 = absoluteGravity2 & 8388615;
        if (i5 == 1) {
            this.p = this.f6513e.centerX() - (measureText / 2.0f);
        } else if (i5 != 5) {
            this.p = this.f6513e.left;
        } else {
            this.p = this.f6513e.right - measureText;
        }
        Bitmap bitmap = this.A;
        if (bitmap != null) {
            bitmap.recycle();
            this.A = null;
        }
        o(f2);
        c(this.f6511c);
    }

    public void l(ColorStateList colorStateList) {
        if (this.f6521m != colorStateList) {
            this.f6521m = colorStateList;
            j();
        }
    }

    public void m(int i2) {
        if (this.f6517i != i2) {
            this.f6517i = i2;
            j();
        }
    }

    public void n(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f6511c) {
            this.f6511c = f2;
            c(f2);
        }
    }

    public final void o(float f2) {
        d(f2, false);
        View view = this.a;
        AtomicInteger atomicInteger = d0.a;
        d0.c.k(view);
    }

    public void p(Typeface typeface) {
        boolean z;
        e.d.b.d.t.a aVar = this.w;
        boolean z2 = true;
        if (aVar != null) {
            aVar.f6558c = true;
        }
        if (this.t != typeface) {
            this.t = typeface;
            z = true;
        } else {
            z = false;
        }
        if (this.u != typeface) {
            this.u = typeface;
        } else {
            z2 = false;
        }
        if (z || z2) {
            j();
        }
    }
}
