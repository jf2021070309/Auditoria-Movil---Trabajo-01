package e.d.b.d.t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.TypedValue;
import c.i.d.c.j;
/* loaded from: classes2.dex */
public class b {
    public final ColorStateList a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6559b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6560c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6561d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6562e;

    /* renamed from: f  reason: collision with root package name */
    public final float f6563f;

    /* renamed from: g  reason: collision with root package name */
    public final float f6564g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6565h;

    /* renamed from: i  reason: collision with root package name */
    public final float f6566i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f6567j;

    /* renamed from: k  reason: collision with root package name */
    public float f6568k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6569l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6570m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f6571n;

    /* loaded from: classes2.dex */
    public class a extends j.c {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        @Override // c.i.d.c.j.c
        public void d(int i2) {
            b.this.f6570m = true;
            this.a.a(i2);
        }

        @Override // c.i.d.c.j.c
        public void e(Typeface typeface) {
            b bVar = b.this;
            bVar.f6571n = Typeface.create(typeface, bVar.f6560c);
            b bVar2 = b.this;
            bVar2.f6570m = true;
            this.a.b(bVar2.f6571n, false);
        }
    }

    public b(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, e.d.b.d.b.z);
        this.f6568k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f6567j = e.d.b.d.a.C(context, obtainStyledAttributes, 3);
        e.d.b.d.a.C(context, obtainStyledAttributes, 4);
        e.d.b.d.a.C(context, obtainStyledAttributes, 5);
        this.f6560c = obtainStyledAttributes.getInt(2, 0);
        this.f6561d = obtainStyledAttributes.getInt(1, 1);
        int i3 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f6569l = obtainStyledAttributes.getResourceId(i3, 0);
        this.f6559b = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = e.d.b.d.a.C(context, obtainStyledAttributes, 6);
        this.f6562e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f6563f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f6564g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT < 21) {
            this.f6565h = false;
            this.f6566i = 0.0f;
            return;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, e.d.b.d.b.s);
        this.f6565h = obtainStyledAttributes2.hasValue(0);
        this.f6566i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.f6571n == null && (str = this.f6559b) != null) {
            this.f6571n = Typeface.create(str, this.f6560c);
        }
        if (this.f6571n == null) {
            int i2 = this.f6561d;
            if (i2 == 1) {
                this.f6571n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f6571n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f6571n = Typeface.DEFAULT;
            } else {
                this.f6571n = Typeface.MONOSPACE;
            }
            this.f6571n = Typeface.create(this.f6571n, this.f6560c);
        }
    }

    public Typeface b(Context context) {
        if (this.f6570m) {
            return this.f6571n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b2 = j.b(context, this.f6569l);
                this.f6571n = b2;
                if (b2 != null) {
                    this.f6571n = Typeface.create(b2, this.f6560c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.f6570m = true;
        return this.f6571n;
    }

    public void c(Context context, d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i2 = this.f6569l;
        if (i2 == 0) {
            this.f6570m = true;
        }
        if (this.f6570m) {
            dVar.b(this.f6571n, true);
            return;
        }
        try {
            a aVar = new a(dVar);
            ThreadLocal<TypedValue> threadLocal = j.a;
            if (context.isRestricted()) {
                aVar.a(-4, null);
            } else {
                j.c(context, i2, new TypedValue(), 0, aVar, null, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f6570m = true;
            dVar.a(1);
        } catch (Exception unused2) {
            this.f6570m = true;
            dVar.a(-3);
        }
    }

    public final boolean d(Context context) {
        int i2 = this.f6569l;
        Typeface typeface = null;
        if (i2 != 0) {
            ThreadLocal<TypedValue> threadLocal = j.a;
            if (!context.isRestricted()) {
                typeface = j.c(context, i2, new TypedValue(), 0, null, null, false, true);
            }
        }
        return typeface != null;
    }

    public void e(Context context, TextPaint textPaint, d dVar) {
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.f6567j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.f6564g;
        float f3 = this.f6562e;
        float f4 = this.f6563f;
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void f(Context context, TextPaint textPaint, d dVar) {
        if (d(context)) {
            g(textPaint, b(context));
            return;
        }
        a();
        g(textPaint, this.f6571n);
        c(context, new c(this, textPaint, dVar));
    }

    public void g(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f6560c;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f6568k);
        if (Build.VERSION.SDK_INT < 21 || !this.f6565h) {
            return;
        }
        textPaint.setLetterSpacing(this.f6566i);
    }
}
