package e.d.b.d.m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class b {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6408b;

    /* renamed from: c  reason: collision with root package name */
    public final a f6409c;

    /* renamed from: d  reason: collision with root package name */
    public final a f6410d;

    /* renamed from: e  reason: collision with root package name */
    public final a f6411e;

    /* renamed from: f  reason: collision with root package name */
    public final a f6412f;

    /* renamed from: g  reason: collision with root package name */
    public final a f6413g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f6414h;

    public b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e.d.b.d.a.b0(context, R.attr.materialCalendarStyle, d.class.getCanonicalName()), e.d.b.d.b.f6325n);
        this.a = a.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f6413g = a.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f6408b = a.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f6409c = a.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList C = e.d.b.d.a.C(context, obtainStyledAttributes, 6);
        this.f6410d = a.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f6411e = a.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f6412f = a.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f6414h = paint;
        paint.setColor(C.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
