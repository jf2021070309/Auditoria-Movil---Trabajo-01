package com.me.game.pm_tools;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Handler;
/* loaded from: classes5.dex */
public class m extends Drawable {
    private static final int l = 12;
    private static final int m = 5;
    private static final int n = 9;
    private static final int o = 153;
    private static final int p = 6;
    private static final int q = 60;
    private static final long r = 30;
    private int d;
    private int h;
    private int k;
    private Paint a = new Paint(1);
    private RectF b = new RectF();
    private c c = c.IDLE;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private Handler i = new Handler();
    private boolean j = true;

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = b.a[m.this.c.ordinal()];
            if (i == 1) {
                m.this.c = c.ADD;
                m.this.d += 6;
                m.this.e += 6;
            } else if (i == 2) {
                m.this.d += 6;
                if (m.this.d > m.o) {
                    m.this.d = m.o;
                    m.this.c = c.KEEP;
                    m.this.e += 60;
                } else {
                    m.this.e += 6;
                }
            } else if (i == 3) {
                m.i(m.this);
                m.this.e += 60;
                if (m.this.f >= 12) {
                    m.this.f = 0;
                    m.this.c = c.SUB;
                }
            } else if (i == 4) {
                m mVar = m.this;
                mVar.d -= 6;
                m.this.e += 12;
                if (m.this.d < 9) {
                    m.this.d = 9;
                    m.this.c = c.WAIT;
                }
            } else if (i == 5) {
                m.l(m.this);
                m.this.e += 6;
                if (m.this.g >= 5) {
                    m.this.g = 0;
                    m.this.c = c.IDLE;
                }
            }
            m.this.invalidateSelf();
            m.this.r();
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.KEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.SUB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.WAIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum c {
        IDLE,
        ADD,
        KEEP,
        SUB,
        WAIT
    }

    public m() {
        this.d = 0;
        this.h = 0;
        this.h = u.f().a(2.0f);
        this.a.setStrokeCap(Paint.Cap.ROUND);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeWidth(this.h);
        Paint paint = this.a;
        int i = this.k;
        paint.setShader(new SweepGradient(i / 2, i / 2, new int[]{-11320586, -11320586}, (float[]) null));
        this.d = 9;
    }

    public static /* synthetic */ int i(m mVar) {
        int i = mVar.f;
        mVar.f = i + 1;
        return i;
    }

    public static /* synthetic */ int l(m mVar) {
        int i = mVar.g;
        mVar.g = i + 1;
        return i;
    }

    private void n(Canvas canvas, int i) {
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        canvas.rotate(i, getBounds().width() / 2, getBounds().height() / 2);
        canvas.drawArc(this.b, 0.0f, this.d, false, this.a);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        x.c(this.i, new a(), r);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = this.e % 360;
        this.e = i;
        n(canvas, i + 180);
        n(canvas, this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    public boolean o() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        RectF rectF = this.b;
        int i = this.h;
        rectF.left = i;
        rectF.top = i;
        rectF.right = rect.width() - this.h;
        this.b.bottom = rect.height() - this.h;
    }

    public void p(int i) {
        this.k = i;
    }

    public void q(boolean z) {
        this.j = z;
        this.d = 0;
        this.e = 0;
        if (z) {
            x.d(this.i);
            r();
            return;
        }
        x.d(this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
