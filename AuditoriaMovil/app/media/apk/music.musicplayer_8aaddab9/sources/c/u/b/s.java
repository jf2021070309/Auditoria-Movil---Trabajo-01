package c.u.b;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class s extends RecyclerView.w {

    /* renamed from: k  reason: collision with root package name */
    public PointF f2730k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f2731l;

    /* renamed from: n  reason: collision with root package name */
    public float f2733n;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f2728i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f2729j = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    public boolean f2732m = false;
    public int o = 0;
    public int p = 0;

    public s(Context context) {
        this.f2731l = context.getResources().getDisplayMetrics();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.view.View r11, androidx.recyclerview.widget.RecyclerView.x r12, androidx.recyclerview.widget.RecyclerView.w.a r13) {
        /*
            r10 = this;
            android.graphics.PointF r12 = r10.f2730k
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r12 == 0) goto L17
            float r12 = r12.x
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 != 0) goto Lf
            goto L17
        Lf:
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 <= 0) goto L15
            r9 = 1
            goto L18
        L15:
            r9 = -1
            goto L18
        L17:
            r9 = 0
        L18:
            androidx.recyclerview.widget.RecyclerView$m r12 = r10.f579c
            if (r12 == 0) goto L49
            boolean r4 = r12.g()
            if (r4 != 0) goto L23
            goto L49
        L23:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r4 = (androidx.recyclerview.widget.RecyclerView.n) r4
            int r5 = r12.F(r11)
            int r6 = r4.leftMargin
            int r5 = r5 - r6
            int r6 = r12.I(r11)
            int r4 = r4.rightMargin
            int r6 = r6 + r4
            int r7 = r12.Q()
            int r4 = r12.p
            int r12 = r12.R()
            int r8 = r4 - r12
            r4 = r10
            int r12 = r4.e(r5, r6, r7, r8, r9)
            goto L4a
        L49:
            r12 = 0
        L4a:
            android.graphics.PointF r4 = r10.f2730k
            if (r4 == 0) goto L5d
            float r4 = r4.y
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 != 0) goto L55
            goto L5d
        L55:
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L5b
            r9 = 1
            goto L5e
        L5b:
            r9 = -1
            goto L5e
        L5d:
            r9 = 0
        L5e:
            androidx.recyclerview.widget.RecyclerView$m r0 = r10.f579c
            if (r0 == 0) goto L90
            boolean r1 = r0.h()
            if (r1 != 0) goto L69
            goto L90
        L69:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r1 = (androidx.recyclerview.widget.RecyclerView.n) r1
            int r2 = r0.J(r11)
            int r3 = r1.topMargin
            int r5 = r2 - r3
            int r11 = r0.D(r11)
            int r1 = r1.bottomMargin
            int r6 = r11 + r1
            int r7 = r0.S()
            int r11 = r0.q
            int r0 = r0.P()
            int r8 = r11 - r0
            r4 = r10
            int r2 = r4.e(r5, r6, r7, r8, r9)
        L90:
            int r11 = r12 * r12
            int r0 = r2 * r2
            int r0 = r0 + r11
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            int r11 = (int) r0
            int r11 = r10.g(r11)
            double r0 = (double) r11
            r3 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r0)
            double r0 = r0 / r3
            double r0 = java.lang.Math.ceil(r0)
            int r11 = (int) r0
            if (r11 <= 0) goto Lbd
            int r12 = -r12
            int r0 = -r2
            android.view.animation.DecelerateInterpolator r1 = r10.f2729j
            r13.b(r12, r0, r11, r1)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.u.b.s.c(android.view.View, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$w$a):void");
    }

    public int e(int i2, int i3, int i4, int i5, int i6) {
        if (i6 != -1) {
            if (i6 != 0) {
                if (i6 == 1) {
                    return i5 - i3;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        }
        return i4 - i2;
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int g(int i2) {
        float abs = Math.abs(i2);
        if (!this.f2732m) {
            this.f2733n = f(this.f2731l);
            this.f2732m = true;
        }
        return (int) Math.ceil(abs * this.f2733n);
    }
}
