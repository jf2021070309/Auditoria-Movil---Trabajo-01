package e.d.b.d.k;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.common.api.CommonStatusCodes;
import e.d.b.d.r.i;
import e.d.b.d.w.g;
import e.d.b.d.w.j;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class b extends g implements c.i.e.m.a, Drawable.Callback, i.b {
    public int A0;
    public ColorStateList B;
    public int B0;
    public ColorStateList C;
    public ColorFilter C0;
    public float D;
    public PorterDuffColorFilter D0;
    public float E;
    public ColorStateList E0;
    public ColorStateList F;
    public PorterDuff.Mode F0;
    public float G;
    public int[] G0;
    public ColorStateList H;
    public boolean H0;
    public CharSequence I;
    public ColorStateList I0;
    public boolean J;
    public WeakReference<a> J0;
    public Drawable K;
    public TextUtils.TruncateAt K0;
    public ColorStateList L;
    public boolean L0;
    public float M;
    public int M0;
    public boolean N;
    public boolean N0;
    public boolean O;
    public Drawable P;
    public Drawable U;
    public ColorStateList V;
    public float W;
    public CharSequence X;
    public boolean Y;
    public boolean Z;
    public Drawable a0;
    public ColorStateList b0;
    public e.d.b.d.c.g c0;
    public e.d.b.d.c.g d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public final Context m0;
    public final Paint n0;
    public final Paint.FontMetrics o0;
    public final RectF p0;
    public final PointF q0;
    public final Path r0;
    public final i s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public boolean z0;
    public static final int[] z = {16842910};
    public static final ShapeDrawable A = new ShapeDrawable(new OvalShape());

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public b(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(j.b(context, attributeSet, i2, i3).a());
        this.E = -1.0f;
        this.n0 = new Paint(1);
        this.o0 = new Paint.FontMetrics();
        this.p0 = new RectF();
        this.q0 = new PointF();
        this.r0 = new Path();
        this.B0 = 255;
        this.F0 = PorterDuff.Mode.SRC_IN;
        this.J0 = new WeakReference<>(null);
        this.f6591c.f6603b = new e.d.b.d.o.a(context);
        x();
        this.m0 = context;
        i iVar = new i(this);
        this.s0 = iVar;
        this.I = "";
        iVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = z;
        setState(iArr);
        e0(iArr);
        this.L0 = true;
        if (e.d.b.d.u.b.a) {
            A.setTint(-1);
        }
    }

    public static boolean H(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean I(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public float A() {
        if (q0() || p0()) {
            return G() + this.f0 + this.g0;
        }
        return 0.0f;
    }

    public final void B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (r0()) {
            float f2 = this.l0 + this.k0;
            if (c.i.a.y(this) == 0) {
                float f3 = rect.right - f2;
                rectF.right = f3;
                rectF.left = f3 - this.W;
            } else {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + this.W;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.W;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    public final void C(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (r0()) {
            float f2 = this.l0 + this.k0 + this.W + this.j0 + this.i0;
            if (c.i.a.y(this) == 0) {
                float f3 = rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i2 = rect.left;
                rectF.left = i2;
                rectF.right = i2 + f2;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public float D() {
        if (r0()) {
            return this.j0 + this.W + this.k0;
        }
        return 0.0f;
    }

    public float E() {
        return this.N0 ? m() : this.E;
    }

    public Drawable F() {
        Drawable drawable = this.P;
        if (drawable != null) {
            return c.i.a.p0(drawable);
        }
        return null;
    }

    public final float G() {
        Drawable drawable = this.z0 ? this.a0 : this.K;
        float f2 = this.M;
        return (f2 > 0.0f || drawable == null) ? f2 : drawable.getIntrinsicWidth();
    }

    public void J() {
        a aVar = this.J0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.b.d.k.b.K(int[], int[]):boolean");
    }

    public void L(boolean z2) {
        if (this.Y != z2) {
            this.Y = z2;
            float A2 = A();
            if (!z2 && this.z0) {
                this.z0 = false;
            }
            float A3 = A();
            invalidateSelf();
            if (A2 != A3) {
                J();
            }
        }
    }

    public void M(Drawable drawable) {
        if (this.a0 != drawable) {
            float A2 = A();
            this.a0 = drawable;
            float A3 = A();
            s0(this.a0);
            y(this.a0);
            invalidateSelf();
            if (A2 != A3) {
                J();
            }
        }
    }

    public void N(ColorStateList colorStateList) {
        if (this.b0 != colorStateList) {
            this.b0 = colorStateList;
            if (this.Z && this.a0 != null && this.Y) {
                c.i.a.j0(this.a0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void O(boolean z2) {
        if (this.Z != z2) {
            boolean p0 = p0();
            this.Z = z2;
            boolean p02 = p0();
            if (p0 != p02) {
                if (p02) {
                    y(this.a0);
                } else {
                    s0(this.a0);
                }
                invalidateSelf();
                J();
            }
        }
    }

    public void P(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    public void Q(float f2) {
        if (this.E != f2) {
            this.E = f2;
            this.f6591c.a = this.f6591c.a.e(f2);
            invalidateSelf();
        }
    }

    public void R(float f2) {
        if (this.l0 != f2) {
            this.l0 = f2;
            invalidateSelf();
            J();
        }
    }

    public void S(Drawable drawable) {
        Drawable drawable2 = this.K;
        Drawable p0 = drawable2 != null ? c.i.a.p0(drawable2) : null;
        if (p0 != drawable) {
            float A2 = A();
            this.K = drawable != null ? c.i.a.q0(drawable).mutate() : null;
            float A3 = A();
            s0(p0);
            if (q0()) {
                y(this.K);
            }
            invalidateSelf();
            if (A2 != A3) {
                J();
            }
        }
    }

    public void T(float f2) {
        if (this.M != f2) {
            float A2 = A();
            this.M = f2;
            float A3 = A();
            invalidateSelf();
            if (A2 != A3) {
                J();
            }
        }
    }

    public void U(ColorStateList colorStateList) {
        this.N = true;
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (q0()) {
                c.i.a.j0(this.K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void V(boolean z2) {
        if (this.J != z2) {
            boolean q0 = q0();
            this.J = z2;
            boolean q02 = q0();
            if (q0 != q02) {
                if (q02) {
                    y(this.K);
                } else {
                    s0(this.K);
                }
                invalidateSelf();
                J();
            }
        }
    }

    public void W(float f2) {
        if (this.D != f2) {
            this.D = f2;
            invalidateSelf();
            J();
        }
    }

    public void X(float f2) {
        if (this.e0 != f2) {
            this.e0 = f2;
            invalidateSelf();
            J();
        }
    }

    public void Y(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            if (this.N0) {
                u(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Z(float f2) {
        if (this.G != f2) {
            this.G = f2;
            this.n0.setStrokeWidth(f2);
            if (this.N0) {
                this.f6591c.f6613l = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    @Override // e.d.b.d.r.i.b
    public void a() {
        J();
        invalidateSelf();
    }

    public void a0(Drawable drawable) {
        Drawable F = F();
        if (F != drawable) {
            float D = D();
            this.P = drawable != null ? c.i.a.q0(drawable).mutate() : null;
            if (e.d.b.d.u.b.a) {
                this.U = new RippleDrawable(e.d.b.d.u.b.a(this.H), this.P, A);
            }
            float D2 = D();
            s0(F);
            if (r0()) {
                y(this.P);
            }
            invalidateSelf();
            if (D != D2) {
                J();
            }
        }
    }

    public void b0(float f2) {
        if (this.k0 != f2) {
            this.k0 = f2;
            invalidateSelf();
            if (r0()) {
                J();
            }
        }
    }

    public void c0(float f2) {
        if (this.W != f2) {
            this.W = f2;
            invalidateSelf();
            if (r0()) {
                J();
            }
        }
    }

    public void d0(float f2) {
        if (this.j0 != f2) {
            this.j0 = f2;
            invalidateSelf();
            if (r0()) {
                J();
            }
        }
    }

    @Override // e.d.b.d.w.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i2 = this.B0) == 0) {
            return;
        }
        if (i2 < 255) {
            float f2 = bounds.left;
            float f3 = bounds.top;
            float f4 = bounds.right;
            float f5 = bounds.bottom;
            i3 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i2) : canvas.saveLayerAlpha(f2, f3, f4, f5, i2, 31);
        } else {
            i3 = 0;
        }
        if (!this.N0) {
            this.n0.setColor(this.t0);
            this.n0.setStyle(Paint.Style.FILL);
            this.p0.set(bounds);
            canvas.drawRoundRect(this.p0, E(), E(), this.n0);
        }
        if (!this.N0) {
            this.n0.setColor(this.u0);
            this.n0.setStyle(Paint.Style.FILL);
            Paint paint = this.n0;
            ColorFilter colorFilter = this.C0;
            if (colorFilter == null) {
                colorFilter = this.D0;
            }
            paint.setColorFilter(colorFilter);
            this.p0.set(bounds);
            canvas.drawRoundRect(this.p0, E(), E(), this.n0);
        }
        if (this.N0) {
            super.draw(canvas);
        }
        if (this.G > 0.0f && !this.N0) {
            this.n0.setColor(this.w0);
            this.n0.setStyle(Paint.Style.STROKE);
            if (!this.N0) {
                Paint paint2 = this.n0;
                ColorFilter colorFilter2 = this.C0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.D0;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.p0;
            float f6 = this.G / 2.0f;
            rectF.set(bounds.left + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
            float f7 = this.E - (this.G / 2.0f);
            canvas.drawRoundRect(this.p0, f7, f7, this.n0);
        }
        this.n0.setColor(this.x0);
        this.n0.setStyle(Paint.Style.FILL);
        this.p0.set(bounds);
        if (this.N0) {
            c(new RectF(bounds), this.r0);
            i4 = 0;
            g(canvas, this.n0, this.r0, this.f6591c.a, i());
        } else {
            canvas.drawRoundRect(this.p0, E(), E(), this.n0);
            i4 = 0;
        }
        if (q0()) {
            z(bounds, this.p0);
            RectF rectF2 = this.p0;
            float f8 = rectF2.left;
            float f9 = rectF2.top;
            canvas.translate(f8, f9);
            this.K.setBounds(i4, i4, (int) this.p0.width(), (int) this.p0.height());
            this.K.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (p0()) {
            z(bounds, this.p0);
            RectF rectF3 = this.p0;
            float f10 = rectF3.left;
            float f11 = rectF3.top;
            canvas.translate(f10, f11);
            this.a0.setBounds(i4, i4, (int) this.p0.width(), (int) this.p0.height());
            this.a0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
        if (!this.L0 || this.I == null) {
            i5 = i3;
            i6 = 255;
            i7 = 0;
        } else {
            PointF pointF = this.q0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.I != null) {
                float A2 = A() + this.e0 + this.h0;
                if (c.i.a.y(this) == 0) {
                    pointF.x = bounds.left + A2;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - A2;
                    align = Paint.Align.RIGHT;
                }
                this.s0.a.getFontMetrics(this.o0);
                Paint.FontMetrics fontMetrics = this.o0;
                pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF4 = this.p0;
            rectF4.setEmpty();
            if (this.I != null) {
                float A3 = A() + this.e0 + this.h0;
                float D = D() + this.l0 + this.i0;
                if (c.i.a.y(this) == 0) {
                    rectF4.left = bounds.left + A3;
                    rectF4.right = bounds.right - D;
                } else {
                    rectF4.left = bounds.left + D;
                    rectF4.right = bounds.right - A3;
                }
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            i iVar = this.s0;
            if (iVar.f6548f != null) {
                iVar.a.drawableState = getState();
                i iVar2 = this.s0;
                iVar2.f6548f.e(this.m0, iVar2.a, iVar2.f6544b);
            }
            this.s0.a.setTextAlign(align);
            boolean z2 = Math.round(this.s0.a(this.I.toString())) > Math.round(this.p0.width());
            if (z2) {
                i8 = canvas.save();
                canvas.clipRect(this.p0);
            } else {
                i8 = 0;
            }
            CharSequence charSequence = this.I;
            if (z2 && this.K0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.s0.a, this.p0.width(), this.K0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF2 = this.q0;
            i7 = 0;
            i6 = 255;
            i5 = i3;
            canvas.drawText(charSequence2, 0, length, pointF2.x, pointF2.y, this.s0.a);
            if (z2) {
                canvas.restoreToCount(i8);
            }
        }
        if (r0()) {
            B(bounds, this.p0);
            RectF rectF5 = this.p0;
            float f12 = rectF5.left;
            float f13 = rectF5.top;
            canvas.translate(f12, f13);
            this.P.setBounds(i7, i7, (int) this.p0.width(), (int) this.p0.height());
            if (e.d.b.d.u.b.a) {
                this.U.setBounds(this.P.getBounds());
                this.U.jumpToCurrentState();
                this.U.draw(canvas);
            } else {
                this.P.draw(canvas);
            }
            canvas.translate(-f12, -f13);
        }
        if (this.B0 < i6) {
            canvas.restoreToCount(i5);
        }
    }

    public boolean e0(int[] iArr) {
        if (Arrays.equals(this.G0, iArr)) {
            return false;
        }
        this.G0 = iArr;
        if (r0()) {
            return K(getState(), iArr);
        }
        return false;
    }

    public void f0(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (r0()) {
                c.i.a.j0(this.P, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void g0(boolean z2) {
        if (this.O != z2) {
            boolean r0 = r0();
            this.O = z2;
            boolean r02 = r0();
            if (r0 != r02) {
                if (r02) {
                    y(this.P);
                } else {
                    s0(this.P);
                }
                invalidateSelf();
                J();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.B0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.C0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.D;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(D() + this.s0.a(this.I.toString()) + A() + this.e0 + this.h0 + this.i0 + this.l0), this.M0);
    }

    @Override // e.d.b.d.w.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // e.d.b.d.w.g, android.graphics.drawable.Drawable
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public void getOutline(Outline outline) {
        if (this.N0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.D, this.E);
        } else {
            outline.setRoundRect(bounds, this.E);
        }
        outline.setAlpha(this.B0 / 255.0f);
    }

    public void h0(float f2) {
        if (this.g0 != f2) {
            float A2 = A();
            this.g0 = f2;
            float A3 = A();
            invalidateSelf();
            if (A2 != A3) {
                J();
            }
        }
    }

    public void i0(float f2) {
        if (this.f0 != f2) {
            float A2 = A();
            this.f0 = f2;
            float A3 = A();
            invalidateSelf();
            if (A2 != A3) {
                J();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // e.d.b.d.w.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (H(this.B) || H(this.C) || H(this.F)) {
            return true;
        }
        if (this.H0 && H(this.I0)) {
            return true;
        }
        e.d.b.d.t.b bVar = this.s0.f6548f;
        if ((bVar == null || (colorStateList = bVar.f6567j) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.Z && this.a0 != null && this.Y) || I(this.K) || I(this.a0) || H(this.E0);
    }

    public void j0(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            this.I0 = this.H0 ? e.d.b.d.u.b.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void k0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.I, charSequence)) {
            return;
        }
        this.I = charSequence;
        this.s0.f6546d = true;
        invalidateSelf();
        J();
    }

    public void l0(e.d.b.d.t.b bVar) {
        i iVar = this.s0;
        Context context = this.m0;
        if (iVar.f6548f != bVar) {
            iVar.f6548f = bVar;
            if (bVar != null) {
                bVar.f(context, iVar.a, iVar.f6544b);
                i.b bVar2 = iVar.f6547e.get();
                if (bVar2 != null) {
                    iVar.a.drawableState = bVar2.getState();
                }
                bVar.e(context, iVar.a, iVar.f6544b);
                iVar.f6546d = true;
            }
            i.b bVar3 = iVar.f6547e.get();
            if (bVar3 != null) {
                bVar3.a();
                bVar3.onStateChange(bVar3.getState());
            }
        }
    }

    public void m0(float f2) {
        if (this.i0 != f2) {
            this.i0 = f2;
            invalidateSelf();
            J();
        }
    }

    public void n0(float f2) {
        if (this.h0 != f2) {
            this.h0 = f2;
            invalidateSelf();
            J();
        }
    }

    public void o0(boolean z2) {
        if (this.H0 != z2) {
            this.H0 = z2;
            this.I0 = z2 ? e.d.b.d.u.b.a(this.H) : null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (q0()) {
            onLayoutDirectionChanged |= c.i.a.d0(this.K, i2);
        }
        if (p0()) {
            onLayoutDirectionChanged |= c.i.a.d0(this.a0, i2);
        }
        if (r0()) {
            onLayoutDirectionChanged |= c.i.a.d0(this.P, i2);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (q0()) {
            onLevelChange |= this.K.setLevel(i2);
        }
        if (p0()) {
            onLevelChange |= this.a0.setLevel(i2);
        }
        if (r0()) {
            onLevelChange |= this.P.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // e.d.b.d.w.g, android.graphics.drawable.Drawable, e.d.b.d.r.i.b
    public boolean onStateChange(int[] iArr) {
        if (this.N0) {
            super.onStateChange(iArr);
        }
        return K(iArr, this.G0);
    }

    public final boolean p0() {
        return this.Z && this.a0 != null && this.z0;
    }

    public final boolean q0() {
        return this.J && this.K != null;
    }

    public final boolean r0() {
        return this.O && this.P != null;
    }

    public final void s0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // e.d.b.d.w.g, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.B0 != i2) {
            this.B0 = i2;
            invalidateSelf();
        }
    }

    @Override // e.d.b.d.w.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.C0 != colorFilter) {
            this.C0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // e.d.b.d.w.g, android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTintList(ColorStateList colorStateList) {
        if (this.E0 != colorStateList) {
            this.E0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // e.d.b.d.w.g, android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.F0 != mode) {
            this.F0 = mode;
            this.D0 = e.d.b.d.a.i0(this, this.E0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (q0()) {
            visible |= this.K.setVisible(z2, z3);
        }
        if (p0()) {
            visible |= this.a0.setVisible(z2, z3);
        }
        if (r0()) {
            visible |= this.P.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void y(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        c.i.a.d0(drawable, c.i.a.y(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.P) {
            if (drawable.isStateful()) {
                drawable.setState(this.G0);
            }
            c.i.a.j0(drawable, this.V);
            return;
        }
        Drawable drawable2 = this.K;
        if (drawable == drawable2 && this.N) {
            c.i.a.j0(drawable2, this.L);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void z(Rect rect, RectF rectF) {
        float f2;
        rectF.setEmpty();
        if (q0() || p0()) {
            float f3 = this.e0 + this.f0;
            float G = G();
            if (c.i.a.y(this) == 0) {
                float f4 = rect.left + f3;
                rectF.left = f4;
                rectF.right = f4 + G;
            } else {
                float f5 = rect.right - f3;
                rectF.right = f5;
                rectF.left = f5 - G;
            }
            Drawable drawable = this.z0 ? this.a0 : this.K;
            float f6 = this.M;
            if (f6 <= 0.0f && drawable != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.m0.getResources().getDisplayMetrics()));
                if (drawable.getIntrinsicHeight() <= f6) {
                    f2 = drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f2 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f2;
                }
            }
            f2 = f6;
            float exactCenterY2 = rect.exactCenterY() - (f2 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f2;
        }
    }
}
