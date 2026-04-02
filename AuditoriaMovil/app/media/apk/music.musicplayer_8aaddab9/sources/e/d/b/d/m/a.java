package e.d.b.d.m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import c.i.k.d0;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class a {
    public final Rect a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f6403b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f6404c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f6405d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6406e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.b.d.w.j f6407f;

    public a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, e.d.b.d.w.j jVar, Rect rect) {
        c.i.a.h(rect.left);
        c.i.a.h(rect.top);
        c.i.a.h(rect.right);
        c.i.a.h(rect.bottom);
        this.a = rect;
        this.f6403b = colorStateList2;
        this.f6404c = colorStateList;
        this.f6405d = colorStateList3;
        this.f6406e = i2;
        this.f6407f = jVar;
    }

    public static a a(Context context, int i2) {
        if (i2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, e.d.b.d.b.o);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList C = e.d.b.d.a.C(context, obtainStyledAttributes, 4);
            ColorStateList C2 = e.d.b.d.a.C(context, obtainStyledAttributes, 9);
            ColorStateList C3 = e.d.b.d.a.C(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            e.d.b.d.w.j a = e.d.b.d.w.j.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new e.d.b.d.w.a(0)).a();
            obtainStyledAttributes.recycle();
            return new a(C, C2, C3, dimensionPixelSize, a, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    public void b(TextView textView) {
        e.d.b.d.w.g gVar = new e.d.b.d.w.g();
        e.d.b.d.w.g gVar2 = new e.d.b.d.w.g();
        gVar.setShapeAppearanceModel(this.f6407f);
        gVar2.setShapeAppearanceModel(this.f6407f);
        gVar.q(this.f6404c);
        gVar.t(this.f6406e, this.f6405d);
        textView.setTextColor(this.f6403b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f6403b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        AtomicInteger atomicInteger = d0.a;
        d0.c.q(textView, insetDrawable);
    }
}
