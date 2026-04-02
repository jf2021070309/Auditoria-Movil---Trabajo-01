package com.amazon.aps.iva.q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import com.amazon.aps.iva.h3.a;
/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: classes.dex */
public final class i {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public i(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.a;
        Drawable a = com.amazon.aps.iva.t3.c.a(compoundButton);
        if (a != null) {
            if (this.d || this.e) {
                Drawable mutate = a.mutate();
                if (this.d) {
                    a.b.h(mutate, this.b);
                }
                if (this.e) {
                    a.b.i(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0019, B:5:0x0020, B:7:0x0026, B:11:0x0035, B:13:0x003b, B:15:0x0041, B:16:0x004c, B:18:0x0053, B:19:0x005a, B:21:0x0061), top: B:28:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0019, B:5:0x0020, B:7:0x0026, B:11:0x0035, B:13:0x003b, B:15:0x0041, B:16:0x004c, B:18:0x0053, B:19:0x005a, B:21:0x0061), top: B:28:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.widget.CompoundButton r6 = r8.a
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.amazon.aps.iva.j.a.m
            com.amazon.aps.iva.q.d1 r7 = com.amazon.aps.iva.q.d1.m(r0, r9, r2, r10)
            android.content.Context r1 = r6.getContext()
            android.content.res.TypedArray r4 = r7.b
            r0 = r6
            r3 = r9
            r5 = r10
            com.amazon.aps.iva.p3.g0.m(r0, r1, r2, r3, r4, r5)
            r9 = 1
            boolean r10 = r7.l(r9)     // Catch: java.lang.Throwable -> L72
            r0 = 0
            if (r10 == 0) goto L32
            int r10 = r7.i(r9, r0)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L32
            android.content.Context r1 = r6.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L32 java.lang.Throwable -> L72
            android.graphics.drawable.Drawable r10 = com.amazon.aps.iva.l.a.a(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L32 java.lang.Throwable -> L72
            r6.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L32 java.lang.Throwable -> L72
            goto L33
        L32:
            r9 = r0
        L33:
            if (r9 != 0) goto L4c
            boolean r9 = r7.l(r0)     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L4c
            int r9 = r7.i(r0, r0)     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L4c
            android.content.Context r10 = r6.getContext()     // Catch: java.lang.Throwable -> L72
            android.graphics.drawable.Drawable r9 = com.amazon.aps.iva.l.a.a(r10, r9)     // Catch: java.lang.Throwable -> L72
            r6.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L72
        L4c:
            r9 = 2
            boolean r10 = r7.l(r9)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L5a
            android.content.res.ColorStateList r9 = r7.b(r9)     // Catch: java.lang.Throwable -> L72
            com.amazon.aps.iva.t3.b.c(r6, r9)     // Catch: java.lang.Throwable -> L72
        L5a:
            r9 = 3
            boolean r10 = r7.l(r9)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L6e
            r10 = -1
            int r9 = r7.h(r9, r10)     // Catch: java.lang.Throwable -> L72
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = com.amazon.aps.iva.q.j0.c(r9, r10)     // Catch: java.lang.Throwable -> L72
            com.amazon.aps.iva.t3.b.d(r6, r9)     // Catch: java.lang.Throwable -> L72
        L6e:
            r7.n()
            return
        L72:
            r9 = move-exception
            r7.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q.i.b(android.util.AttributeSet, int):void");
    }
}
