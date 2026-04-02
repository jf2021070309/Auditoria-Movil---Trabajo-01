package c.b.e.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import c.b.e.a.d;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.Objects;
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public c f879b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f880c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f881d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f882e;

    /* renamed from: g  reason: collision with root package name */
    public boolean f884g;

    /* renamed from: i  reason: collision with root package name */
    public boolean f886i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f887j;

    /* renamed from: k  reason: collision with root package name */
    public long f888k;

    /* renamed from: l  reason: collision with root package name */
    public long f889l;

    /* renamed from: m  reason: collision with root package name */
    public C0017b f890m;

    /* renamed from: f  reason: collision with root package name */
    public int f883f = 255;

    /* renamed from: h  reason: collision with root package name */
    public int f885h = -1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: c.b.e.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0017b implements Drawable.Callback {
        public Drawable.Callback a;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;
        public final b a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f891b;

        /* renamed from: c  reason: collision with root package name */
        public int f892c;

        /* renamed from: d  reason: collision with root package name */
        public int f893d;

        /* renamed from: e  reason: collision with root package name */
        public int f894e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f895f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f896g;

        /* renamed from: h  reason: collision with root package name */
        public int f897h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f898i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f899j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f900k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f901l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f902m;

        /* renamed from: n  reason: collision with root package name */
        public int f903n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;

        public c(c cVar, b bVar, Resources resources) {
            this.f898i = false;
            this.f901l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = bVar;
            this.f891b = resources != null ? resources : cVar != null ? cVar.f891b : null;
            int i2 = cVar != null ? cVar.f892c : 0;
            int i3 = b.a;
            i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
            i2 = i2 == 0 ? SyslogConstants.LOG_LOCAL4 : i2;
            this.f892c = i2;
            if (cVar == null) {
                this.f896g = new Drawable[10];
                this.f897h = 0;
                return;
            }
            this.f893d = cVar.f893d;
            this.f894e = cVar.f894e;
            this.v = true;
            this.w = true;
            this.f898i = cVar.f898i;
            this.f901l = cVar.f901l;
            this.x = cVar.x;
            this.y = cVar.y;
            this.z = cVar.z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            this.D = cVar.D;
            this.E = cVar.E;
            this.F = cVar.F;
            this.G = cVar.G;
            this.H = cVar.H;
            this.I = cVar.I;
            if (cVar.f892c == i2) {
                if (cVar.f899j) {
                    this.f900k = cVar.f900k != null ? new Rect(cVar.f900k) : null;
                    this.f899j = true;
                }
                if (cVar.f902m) {
                    this.f903n = cVar.f903n;
                    this.o = cVar.o;
                    this.p = cVar.p;
                    this.q = cVar.q;
                    this.f902m = true;
                }
            }
            if (cVar.r) {
                this.s = cVar.s;
                this.r = true;
            }
            if (cVar.t) {
                this.u = cVar.u;
                this.t = true;
            }
            Drawable[] drawableArr = cVar.f896g;
            this.f896g = new Drawable[drawableArr.length];
            this.f897h = cVar.f897h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f895f;
            if (sparseArray != null) {
                this.f895f = sparseArray.clone();
            } else {
                this.f895f = new SparseArray<>(this.f897h);
            }
            int i4 = this.f897h;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    Drawable.ConstantState constantState = drawableArr[i5].getConstantState();
                    if (constantState != null) {
                        this.f895f.put(i5, constantState);
                    } else {
                        this.f896g[i5] = drawableArr[i5];
                    }
                }
            }
        }

        public final int a(Drawable drawable) {
            int i2 = this.f897h;
            if (i2 >= this.f896g.length) {
                int i3 = i2 + 10;
                d.a aVar = (d.a) this;
                Drawable[] drawableArr = new Drawable[i3];
                Drawable[] drawableArr2 = aVar.f896g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
                }
                aVar.f896g = drawableArr;
                int[][] iArr = new int[i3];
                System.arraycopy(aVar.J, 0, iArr, 0, i2);
                aVar.J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.f896g[i2] = drawable;
            this.f897h++;
            this.f894e = drawable.getChangingConfigurations() | this.f894e;
            this.r = false;
            this.t = false;
            this.f900k = null;
            this.f899j = false;
            this.f902m = false;
            this.v = false;
            return i2;
        }

        public void b() {
            this.f902m = true;
            c();
            int i2 = this.f897h;
            Drawable[] drawableArr = this.f896g;
            this.o = -1;
            this.f903n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f903n) {
                    this.f903n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f895f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = this.f895f.keyAt(i2);
                    Drawable[] drawableArr = this.f896g;
                    Drawable newDrawable = this.f895f.valueAt(i2).newDrawable(this.f891b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        c.i.a.d0(newDrawable, this.z);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.a);
                    drawableArr[keyAt] = mutate;
                }
                this.f895f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i2 = this.f897h;
            Drawable[] drawableArr = this.f896g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f895f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (c.i.a.f(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable d(int i2) {
            int indexOfKey;
            Drawable drawable = this.f896g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f895f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f895f.valueAt(indexOfKey).newDrawable(this.f891b);
            if (Build.VERSION.SDK_INT >= 23) {
                c.i.a.d0(newDrawable, this.z);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.a);
            this.f896g[i2] = mutate;
            this.f895f.removeAt(indexOfKey);
            if (this.f895f.size() == 0) {
                this.f895f = null;
            }
            return mutate;
        }

        public abstract void e();

        public final void f(Resources resources) {
            if (resources != null) {
                this.f891b = resources;
                int i2 = b.a;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = SyslogConstants.LOG_LOCAL4;
                }
                int i4 = this.f892c;
                this.f892c = i3;
                if (i4 != i3) {
                    this.f902m = false;
                    this.f899j = false;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f893d | this.f894e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f884g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f881d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f888k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f883f
            r3.setAlpha(r9)
            r13.f888k = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            c.b.e.a.b$c r9 = r13.f879b
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f883f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f888k = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f882e
            if (r9 == 0) goto L65
            long r10 = r13.f889l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f882e = r0
            r13.f889l = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            c.b.e.a.b$c r4 = r13.f879b
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f883f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f889l = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f887j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.e.a.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f879b;
        Objects.requireNonNull(cVar);
        if (theme != null) {
            cVar.c();
            int i2 = cVar.f897h;
            Drawable[] drawableArr = cVar.f896g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null && c.i.a.f(drawableArr[i3])) {
                    c.i.a.a(drawableArr[i3], theme);
                    cVar.f894e |= drawableArr[i3].getChangingConfigurations();
                }
            }
            cVar.f(theme.getResources());
        }
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.f890m == null) {
            this.f890m = new C0017b();
        }
        C0017b c0017b = this.f890m;
        c0017b.a = drawable.getCallback();
        drawable.setCallback(c0017b);
        try {
            if (this.f879b.A <= 0 && this.f884g) {
                drawable.setAlpha(this.f883f);
            }
            c cVar = this.f879b;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    c.i.a.j0(drawable, cVar.F);
                }
                c cVar2 = this.f879b;
                if (cVar2.I) {
                    c.i.a.k0(drawable, cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f879b.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                c.i.a.d0(drawable, c.i.a.y(this));
            }
            drawable.setAutoMirrored(this.f879b.C);
            Rect rect = this.f880c;
            if (i2 >= 21 && rect != null) {
                c.i.a.b0(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0017b c0017b2 = this.f890m;
            Drawable.Callback callback = c0017b2.a;
            c0017b2.a = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f879b.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f885h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            c.b.e.a.b$c r0 = r9.f879b
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f882e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f881d
            if (r0 == 0) goto L29
            r9.f882e = r0
            c.b.e.a.b$c r0 = r9.f879b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f889l = r0
            goto L35
        L29:
            r9.f882e = r4
            r9.f889l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f881d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            c.b.e.a.b$c r0 = r9.f879b
            int r1 = r0.f897h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f881d = r0
            r9.f885h = r10
            if (r0 == 0) goto L5a
            c.b.e.a.b$c r10 = r9.f879b
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f888k = r2
        L51:
            r9.c(r0)
            goto L5a
        L55:
            r9.f881d = r4
            r10 = -1
            r9.f885h = r10
        L5a:
            long r0 = r9.f888k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f889l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f887j
            if (r0 != 0) goto L73
            c.b.e.a.b$a r0 = new c.b.e.a.b$a
            r0.<init>()
            r9.f887j = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.e.a.b.d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f881d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f882e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f883f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f879b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        c cVar = this.f879b;
        boolean z = false;
        if (!cVar.v) {
            cVar.c();
            cVar.v = true;
            int i2 = cVar.f897h;
            Drawable[] drawableArr = cVar.f896g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    cVar.w = true;
                    z = true;
                    break;
                } else if (drawableArr[i3].getConstantState() == null) {
                    cVar.w = false;
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            z = cVar.w;
        }
        if (z) {
            this.f879b.f893d = getChangingConfigurations();
            return this.f879b;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f881d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f880c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        c cVar = this.f879b;
        if (cVar.f901l) {
            if (!cVar.f902m) {
                cVar.b();
            }
            return cVar.o;
        }
        Drawable drawable = this.f881d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        c cVar = this.f879b;
        if (cVar.f901l) {
            if (!cVar.f902m) {
                cVar.b();
            }
            return cVar.f903n;
        }
        Drawable drawable = this.f881d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        c cVar = this.f879b;
        if (cVar.f901l) {
            if (!cVar.f902m) {
                cVar.b();
            }
            return cVar.q;
        }
        Drawable drawable = this.f881d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        c cVar = this.f879b;
        if (cVar.f901l) {
            if (!cVar.f902m) {
                cVar.b();
            }
            return cVar.p;
        }
        Drawable drawable = this.f881d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f881d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f879b;
        if (cVar.r) {
            return cVar.s;
        }
        cVar.c();
        int i2 = cVar.f897h;
        Drawable[] drawableArr = cVar.f896g;
        int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i3 = 1; i3 < i2; i3++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
        }
        cVar.s = opacity;
        cVar.r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f881d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f879b;
        Rect rect2 = null;
        boolean z = true;
        if (!cVar.f898i) {
            Rect rect3 = cVar.f900k;
            if (rect3 != null || cVar.f899j) {
                rect2 = rect3;
            } else {
                cVar.c();
                Rect rect4 = new Rect();
                int i2 = cVar.f897h;
                Drawable[] drawableArr = cVar.f896g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                cVar.f899j = true;
                cVar.f900k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f881d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if ((this.f879b.C && c.i.a.y(this) == 1) ? false : false) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f879b;
        if (cVar != null) {
            cVar.r = false;
            cVar.t = false;
        }
        if (drawable != this.f881d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f879b.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f882e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f882e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f881d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f884g) {
                this.f881d.setAlpha(this.f883f);
            }
        }
        if (this.f889l != 0) {
            this.f889l = 0L;
            z = true;
        }
        if (this.f888k != 0) {
            this.f888k = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f886i && super.mutate() == this) {
            c b2 = b();
            b2.e();
            e(b2);
            this.f886i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f882e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f881d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        c cVar = this.f879b;
        int i3 = this.f885h;
        int i4 = cVar.f897h;
        Drawable[] drawableArr = cVar.f896g;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                boolean d0 = Build.VERSION.SDK_INT >= 23 ? c.i.a.d0(drawableArr[i5], i2) : false;
                if (i5 == i3) {
                    z = d0;
                }
            }
        }
        cVar.z = i2;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f882e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f881d;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f882e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f881d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f881d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f884g && this.f883f == i2) {
            return;
        }
        this.f884g = true;
        this.f883f = i2;
        Drawable drawable = this.f881d;
        if (drawable != null) {
            if (this.f888k == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        c cVar = this.f879b;
        if (cVar.C != z) {
            cVar.C = z;
            Drawable drawable = this.f881d;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f879b;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f881d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        c cVar = this.f879b;
        if (cVar.x != z) {
            cVar.x = z;
            Drawable drawable = this.f881d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f881d;
        if (drawable != null) {
            c.i.a.a0(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f880c;
        if (rect == null) {
            this.f880c = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f881d;
        if (drawable != null) {
            c.i.a.b0(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f879b;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            c.i.a.j0(this.f881d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f879b;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            c.i.a.k0(this.f881d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f882e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f881d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f881d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
