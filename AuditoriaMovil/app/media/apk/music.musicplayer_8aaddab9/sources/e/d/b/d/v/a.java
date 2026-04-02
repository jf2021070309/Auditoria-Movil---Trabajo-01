package e.d.b.d.v;

import android.graphics.Paint;
import android.graphics.Path;
/* loaded from: classes2.dex */
public class a {
    public static final int[] a = new int[3];

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f6578b = {0.0f, 0.5f, 1.0f};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f6579c = new int[4];

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f6580d = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: f  reason: collision with root package name */
    public final Paint f6582f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f6583g;

    /* renamed from: h  reason: collision with root package name */
    public int f6584h;

    /* renamed from: i  reason: collision with root package name */
    public int f6585i;

    /* renamed from: j  reason: collision with root package name */
    public int f6586j;

    /* renamed from: k  reason: collision with root package name */
    public final Path f6587k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public Paint f6588l = new Paint();

    /* renamed from: e  reason: collision with root package name */
    public final Paint f6581e = new Paint();

    public a() {
        a(-16777216);
        this.f6588l.setColor(0);
        Paint paint = new Paint(4);
        this.f6582f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f6583g = new Paint(paint);
    }

    public void a(int i2) {
        this.f6584h = c.i.e.b.e(i2, 68);
        this.f6585i = c.i.e.b.e(i2, 20);
        this.f6586j = c.i.e.b.e(i2, 0);
        this.f6581e.setColor(this.f6584h);
    }
}
