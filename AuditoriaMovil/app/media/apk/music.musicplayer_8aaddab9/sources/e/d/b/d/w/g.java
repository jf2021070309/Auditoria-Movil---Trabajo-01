package e.d.b.d.w;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.CommonStatusCodes;
import e.d.b.d.w.k;
import e.d.b.d.w.m;
import java.util.BitSet;
import java.util.Objects;
/* loaded from: classes2.dex */
public class g extends Drawable implements c.i.e.m.a, n {
    public static final String a = g.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static final Paint f6590b;

    /* renamed from: c  reason: collision with root package name */
    public b f6591c;

    /* renamed from: d  reason: collision with root package name */
    public final m.f[] f6592d;

    /* renamed from: e  reason: collision with root package name */
    public final m.f[] f6593e;

    /* renamed from: f  reason: collision with root package name */
    public final BitSet f6594f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6595g;

    /* renamed from: h  reason: collision with root package name */
    public final Matrix f6596h;

    /* renamed from: i  reason: collision with root package name */
    public final Path f6597i;

    /* renamed from: j  reason: collision with root package name */
    public final Path f6598j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f6599k;

    /* renamed from: l  reason: collision with root package name */
    public final RectF f6600l;

    /* renamed from: m  reason: collision with root package name */
    public final Region f6601m;

    /* renamed from: n  reason: collision with root package name */
    public final Region f6602n;
    public j o;
    public final Paint p;
    public final Paint q;
    public final e.d.b.d.v.a r;
    public final k.b s;
    public final k t;
    public PorterDuffColorFilter u;
    public PorterDuffColorFilter v;
    public int w;
    public final RectF x;
    public boolean y;

    /* loaded from: classes2.dex */
    public class a implements k.b {
        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends Drawable.ConstantState {
        public j a;

        /* renamed from: b  reason: collision with root package name */
        public e.d.b.d.o.a f6603b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f6604c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f6605d;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f6606e;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f6607f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f6608g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f6609h;

        /* renamed from: i  reason: collision with root package name */
        public Rect f6610i;

        /* renamed from: j  reason: collision with root package name */
        public float f6611j;

        /* renamed from: k  reason: collision with root package name */
        public float f6612k;

        /* renamed from: l  reason: collision with root package name */
        public float f6613l;

        /* renamed from: m  reason: collision with root package name */
        public int f6614m;

        /* renamed from: n  reason: collision with root package name */
        public float f6615n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public b(b bVar) {
            this.f6605d = null;
            this.f6606e = null;
            this.f6607f = null;
            this.f6608g = null;
            this.f6609h = PorterDuff.Mode.SRC_IN;
            this.f6610i = null;
            this.f6611j = 1.0f;
            this.f6612k = 1.0f;
            this.f6614m = 255;
            this.f6615n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = bVar.a;
            this.f6603b = bVar.f6603b;
            this.f6613l = bVar.f6613l;
            this.f6604c = bVar.f6604c;
            this.f6605d = bVar.f6605d;
            this.f6606e = bVar.f6606e;
            this.f6609h = bVar.f6609h;
            this.f6608g = bVar.f6608g;
            this.f6614m = bVar.f6614m;
            this.f6611j = bVar.f6611j;
            this.s = bVar.s;
            this.q = bVar.q;
            this.u = bVar.u;
            this.f6612k = bVar.f6612k;
            this.f6615n = bVar.f6615n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.r = bVar.r;
            this.t = bVar.t;
            this.f6607f = bVar.f6607f;
            this.v = bVar.v;
            if (bVar.f6610i != null) {
                this.f6610i = new Rect(bVar.f6610i);
            }
        }

        public b(j jVar, e.d.b.d.o.a aVar) {
            this.f6605d = null;
            this.f6606e = null;
            this.f6607f = null;
            this.f6608g = null;
            this.f6609h = PorterDuff.Mode.SRC_IN;
            this.f6610i = null;
            this.f6611j = 1.0f;
            this.f6612k = 1.0f;
            this.f6614m = 255;
            this.f6615n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = jVar;
            this.f6603b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f6595g = true;
            return gVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        f6590b = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new j());
    }

    public g(b bVar) {
        this.f6592d = new m.f[4];
        this.f6593e = new m.f[4];
        this.f6594f = new BitSet(8);
        this.f6596h = new Matrix();
        this.f6597i = new Path();
        this.f6598j = new Path();
        this.f6599k = new RectF();
        this.f6600l = new RectF();
        this.f6601m = new Region();
        this.f6602n = new Region();
        Paint paint = new Paint(1);
        this.p = paint;
        Paint paint2 = new Paint(1);
        this.q = paint2;
        this.r = new e.d.b.d.v.a();
        this.t = Looper.getMainLooper().getThread() == Thread.currentThread() ? k.a.a : new k();
        this.x = new RectF();
        this.y = true;
        this.f6591c = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        w();
        v(getState());
        this.s = new a();
    }

    public g(j jVar) {
        this(new b(jVar, null));
    }

    public final void b(RectF rectF, Path path) {
        c(rectF, path);
        if (this.f6591c.f6611j != 1.0f) {
            this.f6596h.reset();
            Matrix matrix = this.f6596h;
            float f2 = this.f6591c.f6611j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f6596h);
        }
        path.computeBounds(this.x, true);
    }

    public final void c(RectF rectF, Path path) {
        k kVar = this.t;
        b bVar = this.f6591c;
        kVar.a(bVar.a, bVar.f6612k, rectF, this.s, path);
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = e(colorForState);
            }
            this.w = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z) {
            int color = paint.getColor();
            int e2 = e(color);
            this.w = e2;
            if (e2 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(e2, PorterDuff.Mode.SRC_IN);
                return porterDuffColorFilter;
            }
        }
        porterDuffColorFilter = null;
        return porterDuffColorFilter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f6, code lost:
        if ((r4 < 21 || !(r2.a.d(i()) || r12.f6597i.isConvex() || r4 >= 29)) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.b.d.w.g.draw(android.graphics.Canvas):void");
    }

    public int e(int i2) {
        int i3;
        b bVar = this.f6591c;
        float f2 = bVar.o + bVar.p + bVar.f6615n;
        e.d.b.d.o.a aVar = bVar.f6603b;
        if (aVar == null || !aVar.f6471b) {
            return i2;
        }
        if (c.i.e.b.e(i2, 255) == aVar.f6474e) {
            float f3 = aVar.f6475f;
            float min = (f3 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            int alpha = Color.alpha(i2);
            int P = e.d.b.d.a.P(c.i.e.b.e(i2, 255), aVar.f6472c, min);
            if (min > 0.0f && (i3 = aVar.f6473d) != 0) {
                P = c.i.e.b.b(c.i.e.b.e(i3, e.d.b.d.o.a.a), P);
            }
            return c.i.e.b.e(P, alpha);
        }
        return i2;
    }

    public final void f(Canvas canvas) {
        if (this.f6594f.cardinality() > 0) {
            Log.w(a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f6591c.s != 0) {
            canvas.drawPath(this.f6597i, this.r.f6581e);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m.f fVar = this.f6592d[i2];
            e.d.b.d.v.a aVar = this.r;
            int i3 = this.f6591c.r;
            Matrix matrix = m.f.a;
            fVar.a(matrix, aVar, i3, canvas);
            this.f6593e[i2].a(matrix, this.r, this.f6591c.r, canvas);
        }
        if (this.y) {
            int j2 = j();
            int k2 = k();
            canvas.translate(-j2, -k2);
            canvas.drawPath(this.f6597i, f6590b);
            canvas.translate(j2, k2);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (!jVar.d(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float a2 = jVar.f6620f.a(rectF) * this.f6591c.f6612k;
        canvas.drawRoundRect(rectF, a2, a2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f6591c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public void getOutline(Outline outline) {
        b bVar = this.f6591c;
        if (bVar.q == 2) {
            return;
        }
        if (bVar.a.d(i())) {
            outline.setRoundRect(getBounds(), m() * this.f6591c.f6612k);
            return;
        }
        b(i(), this.f6597i);
        if (this.f6597i.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f6597i);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f6591c.f6610i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f6601m.set(getBounds());
        b(i(), this.f6597i);
        this.f6602n.setPath(this.f6597i, this.f6601m);
        this.f6601m.op(this.f6602n, Region.Op.DIFFERENCE);
        return this.f6601m;
    }

    public void h(Canvas canvas) {
        Paint paint = this.q;
        Path path = this.f6598j;
        j jVar = this.o;
        this.f6600l.set(i());
        float l2 = l();
        this.f6600l.inset(l2, l2);
        g(canvas, paint, path, jVar, this.f6600l);
    }

    public RectF i() {
        this.f6599k.set(getBounds());
        return this.f6599k;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f6595g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f6591c.f6608g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f6591c.f6607f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f6591c.f6606e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f6591c.f6605d) != null && colorStateList4.isStateful())));
    }

    public int j() {
        b bVar;
        double d2 = this.f6591c.s;
        double sin = Math.sin(Math.toRadians(bVar.t));
        Double.isNaN(d2);
        return (int) (sin * d2);
    }

    public int k() {
        b bVar;
        double d2 = this.f6591c.s;
        double cos = Math.cos(Math.toRadians(bVar.t));
        Double.isNaN(d2);
        return (int) (cos * d2);
    }

    public final float l() {
        if (n()) {
            return this.q.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float m() {
        return this.f6591c.a.f6619e.a(i());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f6591c = new b(this.f6591c);
        return this;
    }

    public final boolean n() {
        Paint.Style style = this.f6591c.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.q.getStrokeWidth() > 0.0f;
    }

    public void o(Context context) {
        this.f6591c.f6603b = new e.d.b.d.o.a(context);
        x();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f6595g = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, e.d.b.d.r.i.b
    public boolean onStateChange(int[] iArr) {
        boolean z = v(iArr) || w();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p(float f2) {
        b bVar = this.f6591c;
        if (bVar.o != f2) {
            bVar.o = f2;
            x();
        }
    }

    public void q(ColorStateList colorStateList) {
        b bVar = this.f6591c;
        if (bVar.f6605d != colorStateList) {
            bVar.f6605d = colorStateList;
            onStateChange(getState());
        }
    }

    public void r(float f2) {
        b bVar = this.f6591c;
        if (bVar.f6612k != f2) {
            bVar.f6612k = f2;
            this.f6595g = true;
            invalidateSelf();
        }
    }

    public void s(float f2, int i2) {
        this.f6591c.f6613l = f2;
        invalidateSelf();
        u(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        b bVar = this.f6591c;
        if (bVar.f6614m != i2) {
            bVar.f6614m = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6591c.f6604c = colorFilter;
        super.invalidateSelf();
    }

    @Override // e.d.b.d.w.n
    public void setShapeAppearanceModel(j jVar) {
        this.f6591c.a = jVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTintList(ColorStateList colorStateList) {
        this.f6591c.f6608g = colorStateList;
        w();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f6591c;
        if (bVar.f6609h != mode) {
            bVar.f6609h = mode;
            w();
            super.invalidateSelf();
        }
    }

    public void t(float f2, ColorStateList colorStateList) {
        this.f6591c.f6613l = f2;
        invalidateSelf();
        u(colorStateList);
    }

    public void u(ColorStateList colorStateList) {
        b bVar = this.f6591c;
        if (bVar.f6606e != colorStateList) {
            bVar.f6606e = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean v(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f6591c.f6605d == null || color2 == (colorForState2 = this.f6591c.f6605d.getColorForState(iArr, (color2 = this.p.getColor())))) {
            z = false;
        } else {
            this.p.setColor(colorForState2);
            z = true;
        }
        if (this.f6591c.f6606e == null || color == (colorForState = this.f6591c.f6606e.getColorForState(iArr, (color = this.q.getColor())))) {
            return z;
        }
        this.q.setColor(colorForState);
        return true;
    }

    public final boolean w() {
        PorterDuffColorFilter porterDuffColorFilter = this.u;
        PorterDuffColorFilter porterDuffColorFilter2 = this.v;
        b bVar = this.f6591c;
        this.u = d(bVar.f6608g, bVar.f6609h, this.p, true);
        b bVar2 = this.f6591c;
        this.v = d(bVar2.f6607f, bVar2.f6609h, this.q, false);
        b bVar3 = this.f6591c;
        if (bVar3.u) {
            this.r.a(bVar3.f6608g.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.u) && Objects.equals(porterDuffColorFilter2, this.v)) ? false : true;
    }

    public final void x() {
        b bVar = this.f6591c;
        float f2 = bVar.o + bVar.p;
        bVar.r = (int) Math.ceil(0.75f * f2);
        this.f6591c.s = (int) Math.ceil(f2 * 0.25f);
        w();
        super.invalidateSelf();
    }
}
