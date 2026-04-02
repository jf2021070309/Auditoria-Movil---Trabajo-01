package e.d.b.d.o;

import android.content.Context;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class a {
    public static final int a = (int) Math.round(5.1000000000000005d);

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6471b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6472c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6473d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6474e;

    /* renamed from: f  reason: collision with root package name */
    public final float f6475f;

    public a(Context context) {
        boolean a0 = e.d.b.d.a.a0(context, R.attr.elevationOverlayEnabled, false);
        int A = e.d.b.d.a.A(context, R.attr.elevationOverlayColor, 0);
        int A2 = e.d.b.d.a.A(context, R.attr.elevationOverlayAccentColor, 0);
        int A3 = e.d.b.d.a.A(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f6471b = a0;
        this.f6472c = A;
        this.f6473d = A2;
        this.f6474e = A3;
        this.f6475f = f2;
    }
}
