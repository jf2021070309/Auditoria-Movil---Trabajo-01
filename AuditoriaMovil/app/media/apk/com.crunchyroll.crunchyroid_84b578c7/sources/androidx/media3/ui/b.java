package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.c;
import androidx.media3.ui.f;
import com.amazon.aps.iva.c8.u;
import com.amazon.aps.iva.t5.g0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: DefaultTimeBar.java */
/* loaded from: classes.dex */
public final class b extends View implements f {
    public static final /* synthetic */ int Q = 0;
    public final float A;
    public int B;
    public long C;
    public int D;
    public Rect E;
    public final ValueAnimator F;
    public float G;
    public boolean H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public long M;
    public int N;
    public long[] O;
    public boolean[] P;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public final Drawable l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final StringBuilder v;
    public final Formatter w;
    public final com.amazon.aps.iva.e.d x;
    public final CopyOnWriteArraySet<f.a> y;
    public final Point z;

    public b(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Rect();
        Paint paint = new Paint();
        this.f = paint;
        Paint paint2 = new Paint();
        this.g = paint2;
        Paint paint3 = new Paint();
        this.h = paint3;
        Paint paint4 = new Paint();
        this.i = paint4;
        Paint paint5 = new Paint();
        this.j = paint5;
        Paint paint6 = new Paint();
        this.k = paint6;
        paint6.setAntiAlias(true);
        this.y = new CopyOnWriteArraySet<>();
        this.z = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.A = f;
        this.u = c(f, -50);
        int c = c(f, 4);
        int c2 = c(f, 26);
        int c3 = c(f, 4);
        int c4 = c(f, 12);
        int c5 = c(f, 0);
        int c6 = c(f, 16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, u.b, 0, 2132083261);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.l = drawable;
                if (drawable != null) {
                    int i = g0.a;
                    if (i >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    c2 = Math.max(drawable.getMinimumHeight(), c2);
                }
                this.m = obtainStyledAttributes.getDimensionPixelSize(3, c);
                this.n = obtainStyledAttributes.getDimensionPixelSize(12, c2);
                this.o = obtainStyledAttributes.getInt(2, 0);
                this.p = obtainStyledAttributes.getDimensionPixelSize(1, c3);
                this.q = obtainStyledAttributes.getDimensionPixelSize(11, c4);
                this.r = obtainStyledAttributes.getDimensionPixelSize(8, c5);
                this.s = obtainStyledAttributes.getDimensionPixelSize(9, c6);
                int i2 = obtainStyledAttributes.getInt(6, -1);
                int i3 = obtainStyledAttributes.getInt(7, -1);
                int i4 = obtainStyledAttributes.getInt(4, -855638017);
                int i5 = obtainStyledAttributes.getInt(13, 872415231);
                int i6 = obtainStyledAttributes.getInt(0, -1291845888);
                int i7 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i2);
                paint6.setColor(i3);
                paint2.setColor(i4);
                paint3.setColor(i5);
                paint4.setColor(i6);
                paint5.setColor(i7);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.m = c;
            this.n = c2;
            this.o = 0;
            this.p = c3;
            this.q = c4;
            this.r = c5;
            this.s = c6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.l = null;
        }
        StringBuilder sb = new StringBuilder();
        this.v = sb;
        this.w = new Formatter(sb, Locale.getDefault());
        this.x = new com.amazon.aps.iva.e.d(this, 7);
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            this.t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.t = (Math.max(this.r, Math.max(this.q, this.s)) + 1) / 2;
        }
        this.G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.F = valueAnimator;
        valueAnimator.addUpdateListener(new com.amazon.aps.iva.c8.c(this, 0));
        this.K = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int c(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.C;
        if (j == -9223372036854775807L) {
            long j2 = this.K;
            if (j2 == -9223372036854775807L) {
                return 0L;
            }
            return j2 / this.B;
        }
        return j;
    }

    private String getProgressText() {
        return g0.D(this.v, this.w, this.L);
    }

    private long getScrubberPosition() {
        Rect rect = this.c;
        if (rect.width() > 0 && this.K != -9223372036854775807L) {
            return (this.e.width() * this.K) / rect.width();
        }
        return 0L;
    }

    @Override // androidx.media3.ui.f
    public final void a(c.b bVar) {
        this.y.add(bVar);
    }

    @Override // androidx.media3.ui.f
    public final void b(long[] jArr, boolean[] zArr, int i) {
        boolean z;
        if (i != 0 && (jArr == null || zArr == null)) {
            z = false;
        } else {
            z = true;
        }
        com.amazon.aps.iva.cq.b.t(z);
        this.N = i;
        this.O = jArr;
        this.P = zArr;
        g();
    }

    public final boolean d(long j) {
        long j2;
        long j3 = this.K;
        if (j3 <= 0) {
            return false;
        }
        if (this.I) {
            j2 = this.J;
        } else {
            j2 = this.L;
        }
        long j4 = j2;
        long j5 = g0.j(j4 + j, 0L, j3);
        if (j5 == j4) {
            return false;
        }
        if (!this.I) {
            e(j5);
        } else {
            h(j5);
        }
        g();
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.l;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e(long j) {
        this.J = j;
        this.I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<f.a> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().G(j);
        }
    }

    public final void f(boolean z) {
        removeCallbacks(this.x);
        this.I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<f.a> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().K(this.J, z);
        }
    }

    public final void g() {
        long j;
        Rect rect = this.d;
        Rect rect2 = this.c;
        rect.set(rect2);
        Rect rect3 = this.e;
        rect3.set(rect2);
        if (this.I) {
            j = this.J;
        } else {
            j = this.L;
        }
        if (this.K > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.M) / this.K)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.K)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.b);
    }

    @Override // androidx.media3.ui.f
    public long getPreferredUpdateDelay() {
        int width = (int) (this.c.width() / this.A);
        if (width != 0) {
            long j = this.K;
            if (j != 0 && j != -9223372036854775807L) {
                return j / width;
            }
        }
        return Long.MAX_VALUE;
    }

    public final void h(long j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        Iterator<f.a> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().I(j);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i;
        canvas.save();
        Rect rect = this.c;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i2 = height + centerY;
        int i3 = (this.K > 0L ? 1 : (this.K == 0L ? 0 : -1));
        Paint paint2 = this.h;
        Rect rect2 = this.e;
        if (i3 <= 0) {
            canvas.drawRect(rect.left, centerY, rect.right, i2, paint2);
        } else {
            Rect rect3 = this.d;
            int i4 = rect3.left;
            int i5 = rect3.right;
            int max = Math.max(Math.max(rect.left, i5), rect2.right);
            int i6 = rect.right;
            if (max < i6) {
                canvas.drawRect(max, centerY, i6, i2, paint2);
            }
            int max2 = Math.max(i4, rect2.right);
            if (i5 > max2) {
                canvas.drawRect(max2, centerY, i5, i2, this.g);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i2, this.f);
            }
            if (this.N != 0) {
                long[] jArr = this.O;
                jArr.getClass();
                boolean[] zArr = this.P;
                zArr.getClass();
                int i7 = this.p;
                int i8 = i7 / 2;
                int i9 = 0;
                int i10 = 0;
                while (i10 < this.N) {
                    int min = Math.min(rect.width() - i7, Math.max(i9, ((int) ((rect.width() * g0.j(jArr[i10], 0L, this.K)) / this.K)) - i8)) + rect.left;
                    if (zArr[i10]) {
                        paint = this.j;
                    } else {
                        paint = this.i;
                    }
                    canvas.drawRect(min, centerY, min + i7, i2, paint);
                    i10++;
                    i9 = i9;
                    i7 = i7;
                }
            }
        }
        if (this.K > 0) {
            int i11 = g0.i(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.l;
            if (drawable == null) {
                if (!this.I && !isFocused()) {
                    if (isEnabled()) {
                        i = this.q;
                    } else {
                        i = this.r;
                    }
                } else {
                    i = this.s;
                }
                canvas.drawCircle(i11, centerY2, (int) ((i * this.G) / 2.0f), this.k);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.G)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.G)) / 2;
                drawable.setBounds(i11 - intrinsicWidth, centerY2 - intrinsicHeight, i11 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.I && !z) {
            f(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.K <= 0) {
            return;
        }
        if (g0.a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.d(r0)
            if (r0 == 0) goto L2e
            com.amazon.aps.iva.e.d r5 = r4.x
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.I
            if (r0 == 0) goto L2e
            r5 = 0
            r4.f(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.b.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        Rect rect;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        if (this.H) {
            i5 = 0;
        } else {
            i5 = this.t;
        }
        int i10 = this.o;
        int i11 = this.m;
        int i12 = this.n;
        if (i10 == 1) {
            i6 = (i9 - getPaddingBottom()) - i12;
            i7 = ((i9 - getPaddingBottom()) - i11) - Math.max(i5 - (i11 / 2), 0);
        } else {
            i6 = (i9 - i12) / 2;
            i7 = (i9 - i11) / 2;
        }
        Rect rect2 = this.b;
        rect2.set(paddingLeft, i6, paddingRight, i12 + i6);
        this.c.set(rect2.left + i5, i7, rect2.right - i5, i11 + i7);
        if (g0.a >= 29 && ((rect = this.E) == null || rect.width() != i8 || this.E.height() != i9)) {
            Rect rect3 = new Rect(0, 0, i8, i9);
            this.E = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        g();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.n;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.l;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        boolean z;
        Drawable drawable = this.l;
        if (drawable != null) {
            if (g0.a >= 23 && drawable.setLayoutDirection(i)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r3 != 3) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.K
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            android.graphics.Point r0 = r9.z
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.e
            android.graphics.Rect r5 = r9.c
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.I
            if (r10 == 0) goto La1
            int r10 = r9.u
            if (r0 >= r10) goto L52
            int r10 = r9.D
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = com.amazon.aps.iva.t5.g0.i(r10, r0, r1)
            r4.right = r10
            goto L60
        L52:
            r9.D = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = com.amazon.aps.iva.t5.g0.i(r10, r0, r1)
            r4.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.h(r0)
            r9.g()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.I
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.f(r1)
            return r6
        L7d:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.b
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r5.left
            int r1 = r5.right
            int r10 = com.amazon.aps.iva.t5.g0.i(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.e(r0)
            r9.g()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.K <= 0) {
            return false;
        }
        if (i == 8192) {
            if (d(-getPositionIncrement())) {
                f(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (d(getPositionIncrement())) {
                f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.i.setColor(i);
        invalidate(this.b);
    }

    public void setBufferedColor(int i) {
        this.g.setColor(i);
        invalidate(this.b);
    }

    @Override // androidx.media3.ui.f
    public void setBufferedPosition(long j) {
        if (this.M == j) {
            return;
        }
        this.M = j;
        g();
    }

    @Override // androidx.media3.ui.f
    public void setDuration(long j) {
        if (this.K == j) {
            return;
        }
        this.K = j;
        if (this.I && j == -9223372036854775807L) {
            f(true);
        }
        g();
    }

    @Override // android.view.View, androidx.media3.ui.f
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.I && !z) {
            f(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        this.B = i;
        this.C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        this.B = -1;
        this.C = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.j.setColor(i);
        invalidate(this.b);
    }

    public void setPlayedColor(int i) {
        this.f.setColor(i);
        invalidate(this.b);
    }

    @Override // androidx.media3.ui.f
    public void setPosition(long j) {
        if (this.L == j) {
            return;
        }
        this.L = j;
        setContentDescription(getProgressText());
        g();
    }

    public void setScrubberColor(int i) {
        this.k.setColor(i);
        invalidate(this.b);
    }

    public void setUnplayedColor(int i) {
        this.h.setColor(i);
        invalidate(this.b);
    }
}
