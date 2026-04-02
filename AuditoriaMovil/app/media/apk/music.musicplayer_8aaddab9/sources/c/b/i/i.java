package c.b.i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
/* loaded from: classes.dex */
public class i {
    public final CompoundButton a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1165b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1166c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1167d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1168e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1169f;

    public i(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public void a() {
        Drawable v = c.i.a.v(this.a);
        if (v != null) {
            if (this.f1167d || this.f1168e) {
                Drawable mutate = c.i.a.q0(v).mutate();
                if (this.f1167d) {
                    c.i.a.j0(mutate, this.f1165b);
                }
                if (this.f1168e) {
                    c.i.a.k0(mutate, this.f1166c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.a.getDrawableState());
                }
                this.a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: all -> 0x0089, TryCatch #1 {all -> 0x0089, blocks: (B:3:0x001c, B:5:0x0022, B:7:0x0028, B:11:0x0039, B:13:0x003f, B:15:0x0045, B:16:0x0052, B:18:0x0059, B:19:0x0062, B:21:0x0069, B:23:0x007b, B:24:0x007f, B:26:0x0083), top: B:37:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[Catch: all -> 0x0089, TryCatch #1 {all -> 0x0089, blocks: (B:3:0x001c, B:5:0x0022, B:7:0x0028, B:11:0x0039, B:13:0x003f, B:15:0x0045, B:16:0x0052, B:18:0x0059, B:19:0x0062, B:21:0x0069, B:23:0x007b, B:24:0x007f, B:26:0x0083), top: B:37:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.a
            android.content.Context r0 = r0.getContext()
            int[] r3 = c.b.b.f781l
            r8 = 0
            c.b.i.a1 r0 = c.b.i.a1.q(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1083b
            r7 = 0
            r4 = r10
            r6 = r11
            c.i.k.d0.z(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            boolean r11 = r0.o(r10)     // Catch: java.lang.Throwable -> L89
            if (r11 == 0) goto L36
            int r11 = r0.l(r10, r8)     // Catch: java.lang.Throwable -> L89
            if (r11 == 0) goto L36
            android.widget.CompoundButton r1 = r9.a     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L89
            android.content.Context r2 = r1.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L89
            android.graphics.drawable.Drawable r11 = c.b.d.a.a.b(r2, r11)     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L89
            r1.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L89
            goto L37
        L36:
            r10 = 0
        L37:
            if (r10 != 0) goto L52
            boolean r10 = r0.o(r8)     // Catch: java.lang.Throwable -> L89
            if (r10 == 0) goto L52
            int r10 = r0.l(r8, r8)     // Catch: java.lang.Throwable -> L89
            if (r10 == 0) goto L52
            android.widget.CompoundButton r11 = r9.a     // Catch: java.lang.Throwable -> L89
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L89
            android.graphics.drawable.Drawable r10 = c.b.d.a.a.b(r1, r10)     // Catch: java.lang.Throwable -> L89
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L89
        L52:
            r10 = 2
            boolean r11 = r0.o(r10)     // Catch: java.lang.Throwable -> L89
            if (r11 == 0) goto L62
            android.widget.CompoundButton r11 = r9.a     // Catch: java.lang.Throwable -> L89
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch: java.lang.Throwable -> L89
            c.i.a.W(r11, r10)     // Catch: java.lang.Throwable -> L89
        L62:
            r10 = 3
            boolean r11 = r0.o(r10)     // Catch: java.lang.Throwable -> L89
            if (r11 == 0) goto L8b
            android.widget.CompoundButton r11 = r9.a     // Catch: java.lang.Throwable -> L89
            r1 = -1
            int r10 = r0.j(r10, r1)     // Catch: java.lang.Throwable -> L89
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = c.b.i.e0.d(r10, r1)     // Catch: java.lang.Throwable -> L89
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L89
            r2 = 21
            if (r1 < r2) goto L7f
            r11.setButtonTintMode(r10)     // Catch: java.lang.Throwable -> L89
            goto L8b
        L7f:
            boolean r1 = r11 instanceof c.i.l.i     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L8b
            c.i.l.i r11 = (c.i.l.i) r11     // Catch: java.lang.Throwable -> L89
            r11.setSupportButtonTintMode(r10)     // Catch: java.lang.Throwable -> L89
            goto L8b
        L89:
            r10 = move-exception
            goto L91
        L8b:
            android.content.res.TypedArray r10 = r0.f1083b
            r10.recycle()
            return
        L91:
            android.content.res.TypedArray r11 = r0.f1083b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.i.i.b(android.util.AttributeSet, int):void");
    }
}
