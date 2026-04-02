package c.b.i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import c.i.k.d0;
/* loaded from: classes.dex */
public class e {
    public final View a;

    /* renamed from: d  reason: collision with root package name */
    public y0 f1127d;

    /* renamed from: e  reason: collision with root package name */
    public y0 f1128e;

    /* renamed from: f  reason: collision with root package name */
    public y0 f1129f;

    /* renamed from: c  reason: collision with root package name */
    public int f1126c = -1;

    /* renamed from: b  reason: collision with root package name */
    public final j f1125b = j.a();

    public e(View view) {
        this.a = view;
    }

    public void a() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i2 <= 21 ? i2 == 21 : this.f1127d != null) {
                if (this.f1129f == null) {
                    this.f1129f = new y0();
                }
                y0 y0Var = this.f1129f;
                PorterDuff.Mode mode = null;
                y0Var.a = null;
                y0Var.f1283d = false;
                y0Var.f1281b = null;
                y0Var.f1282c = false;
                ColorStateList k2 = c.i.k.d0.k(this.a);
                if (k2 != null) {
                    y0Var.f1283d = true;
                    y0Var.a = k2;
                }
                View view = this.a;
                if (i2 >= 21) {
                    mode = d0.h.h(view);
                } else if (view instanceof c.i.k.y) {
                    mode = ((c.i.k.y) view).getSupportBackgroundTintMode();
                }
                if (mode != null) {
                    y0Var.f1282c = true;
                    y0Var.f1281b = mode;
                }
                if (y0Var.f1283d || y0Var.f1282c) {
                    j.f(background, y0Var, this.a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            y0 y0Var2 = this.f1128e;
            if (y0Var2 != null) {
                j.f(background, y0Var2, this.a.getDrawableState());
                return;
            }
            y0 y0Var3 = this.f1127d;
            if (y0Var3 != null) {
                j.f(background, y0Var3, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        y0 y0Var = this.f1128e;
        if (y0Var != null) {
            return y0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        y0 y0Var = this.f1128e;
        if (y0Var != null) {
            return y0Var.f1281b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:3:0x001b, B:5:0x0022, B:7:0x0038, B:8:0x003b, B:10:0x0044, B:12:0x004e, B:14:0x0053, B:16:0x005d, B:23:0x006b, B:25:0x0071, B:28:0x007b, B:29:0x007f, B:31:0x0083, B:32:0x0088, B:34:0x008f, B:36:0x009e, B:38:0x00a3, B:40:0x00ad, B:45:0x00b8, B:47:0x00be, B:48:0x00c5, B:49:0x00c9, B:51:0x00cd), top: B:56:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.view.View r0 = r9.a
            android.content.Context r0 = r0.getContext()
            int[] r3 = c.b.b.z
            r8 = 0
            c.b.i.a1 r0 = c.b.i.a1.q(r0, r10, r3, r11, r8)
            android.view.View r1 = r9.a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1083b
            r7 = 0
            r4 = r10
            r6 = r11
            c.i.k.d0.z(r1, r2, r3, r4, r5, r6, r7)
            boolean r10 = r0.o(r8)     // Catch: java.lang.Throwable -> L79
            r11 = -1
            if (r10 == 0) goto L3b
            int r10 = r0.l(r8, r11)     // Catch: java.lang.Throwable -> L79
            r9.f1126c = r10     // Catch: java.lang.Throwable -> L79
            c.b.i.j r10 = r9.f1125b     // Catch: java.lang.Throwable -> L79
            android.view.View r1 = r9.a     // Catch: java.lang.Throwable -> L79
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L79
            int r2 = r9.f1126c     // Catch: java.lang.Throwable -> L79
            android.content.res.ColorStateList r10 = r10.d(r1, r2)     // Catch: java.lang.Throwable -> L79
            if (r10 == 0) goto L3b
            r9.g(r10)     // Catch: java.lang.Throwable -> L79
        L3b:
            r10 = 1
            boolean r1 = r0.o(r10)     // Catch: java.lang.Throwable -> L79
            r2 = 21
            if (r1 == 0) goto L88
            android.view.View r1 = r9.a     // Catch: java.lang.Throwable -> L79
            android.content.res.ColorStateList r3 = r0.c(r10)     // Catch: java.lang.Throwable -> L79
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L79
            if (r4 < r2) goto L7f
            c.i.k.d0.h.q(r1, r3)     // Catch: java.lang.Throwable -> L79
            if (r4 != r2) goto L88
            android.graphics.drawable.Drawable r3 = r1.getBackground()     // Catch: java.lang.Throwable -> L79
            android.content.res.ColorStateList r4 = c.i.k.d0.h.g(r1)     // Catch: java.lang.Throwable -> L79
            if (r4 != 0) goto L66
            android.graphics.PorterDuff$Mode r4 = c.i.k.d0.h.h(r1)     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L64
            goto L66
        L64:
            r4 = 0
            goto L67
        L66:
            r4 = 1
        L67:
            if (r3 == 0) goto L88
            if (r4 == 0) goto L88
            boolean r4 = r3.isStateful()     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L7b
            int[] r4 = r1.getDrawableState()     // Catch: java.lang.Throwable -> L79
            r3.setState(r4)     // Catch: java.lang.Throwable -> L79
            goto L7b
        L79:
            r10 = move-exception
            goto Ld8
        L7b:
            c.i.k.d0.c.q(r1, r3)     // Catch: java.lang.Throwable -> L79
            goto L88
        L7f:
            boolean r4 = r1 instanceof c.i.k.y     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L88
            c.i.k.y r1 = (c.i.k.y) r1     // Catch: java.lang.Throwable -> L79
            r1.setSupportBackgroundTintList(r3)     // Catch: java.lang.Throwable -> L79
        L88:
            r1 = 2
            boolean r3 = r0.o(r1)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto Ld2
            android.view.View r3 = r9.a     // Catch: java.lang.Throwable -> L79
            int r11 = r0.j(r1, r11)     // Catch: java.lang.Throwable -> L79
            r1 = 0
            android.graphics.PorterDuff$Mode r11 = c.b.i.e0.d(r11, r1)     // Catch: java.lang.Throwable -> L79
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L79
            if (r1 < r2) goto Lc9
            c.i.k.d0.h.r(r3, r11)     // Catch: java.lang.Throwable -> L79
            if (r1 != r2) goto Ld2
            android.graphics.drawable.Drawable r11 = r3.getBackground()     // Catch: java.lang.Throwable -> L79
            android.content.res.ColorStateList r1 = c.i.k.d0.h.g(r3)     // Catch: java.lang.Throwable -> L79
            if (r1 != 0) goto Lb3
            android.graphics.PorterDuff$Mode r1 = c.i.k.d0.h.h(r3)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto Lb4
        Lb3:
            r8 = 1
        Lb4:
            if (r11 == 0) goto Ld2
            if (r8 == 0) goto Ld2
            boolean r10 = r11.isStateful()     // Catch: java.lang.Throwable -> L79
            if (r10 == 0) goto Lc5
            int[] r10 = r3.getDrawableState()     // Catch: java.lang.Throwable -> L79
            r11.setState(r10)     // Catch: java.lang.Throwable -> L79
        Lc5:
            c.i.k.d0.c.q(r3, r11)     // Catch: java.lang.Throwable -> L79
            goto Ld2
        Lc9:
            boolean r10 = r3 instanceof c.i.k.y     // Catch: java.lang.Throwable -> L79
            if (r10 == 0) goto Ld2
            c.i.k.y r3 = (c.i.k.y) r3     // Catch: java.lang.Throwable -> L79
            r3.setSupportBackgroundTintMode(r11)     // Catch: java.lang.Throwable -> L79
        Ld2:
            android.content.res.TypedArray r10 = r0.f1083b
            r10.recycle()
            return
        Ld8:
            android.content.res.TypedArray r11 = r0.f1083b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.i.e.d(android.util.AttributeSet, int):void");
    }

    public void e() {
        this.f1126c = -1;
        g(null);
        a();
    }

    public void f(int i2) {
        this.f1126c = i2;
        j jVar = this.f1125b;
        g(jVar != null ? jVar.d(this.a.getContext(), i2) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1127d == null) {
                this.f1127d = new y0();
            }
            y0 y0Var = this.f1127d;
            y0Var.a = colorStateList;
            y0Var.f1283d = true;
        } else {
            this.f1127d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f1128e == null) {
            this.f1128e = new y0();
        }
        y0 y0Var = this.f1128e;
        y0Var.a = colorStateList;
        y0Var.f1283d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f1128e == null) {
            this.f1128e = new y0();
        }
        y0 y0Var = this.f1128e;
        y0Var.f1281b = mode;
        y0Var.f1282c = true;
        a();
    }
}
