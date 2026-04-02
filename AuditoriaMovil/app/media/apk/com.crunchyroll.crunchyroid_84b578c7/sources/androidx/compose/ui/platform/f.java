package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.node.o;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.f1.b1;
import com.amazon.aps.iva.f1.m0;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.f1.u;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.u0;
import com.amazon.aps.iva.v1.a2;
import com.amazon.aps.iva.v1.l1;
import com.amazon.aps.iva.v1.x1;
import com.amazon.aps.iva.v1.x2;
import com.amazon.aps.iva.v1.y2;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ViewLayer.android.kt */
/* loaded from: classes.dex */
public final class f extends View implements u0 {
    public static final b p = b.h;
    public static final a q = new a();
    public static Method r;
    public static Field s;
    public static boolean t;
    public static boolean u;
    public final AndroidComposeView b;
    public final l1 c;
    public l<? super u, q> d;
    public com.amazon.aps.iva.xb0.a<q> e;
    public final a2 f;
    public boolean g;
    public Rect h;
    public boolean i;
    public boolean j;
    public final com.amazon.aps.iva.p0.e k;
    public final x1<View> l;
    public long m;
    public boolean n;
    public final long o;

    /* compiled from: ViewLayer.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            com.amazon.aps.iva.yb0.j.f(view, "view");
            com.amazon.aps.iva.yb0.j.f(outline, "outline");
            Outline b = ((f) view).f.b();
            com.amazon.aps.iva.yb0.j.c(b);
            outline.set(b);
        }
    }

    /* compiled from: ViewLayer.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements p<View, Matrix, q> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(View view, Matrix matrix) {
            View view2 = view;
            Matrix matrix2 = matrix;
            com.amazon.aps.iva.yb0.j.f(view2, "view");
            com.amazon.aps.iva.yb0.j.f(matrix2, "matrix");
            matrix2.set(view2.getMatrix());
            return q.a;
        }
    }

    /* compiled from: ViewLayer.android.kt */
    /* loaded from: classes.dex */
    public static final class c {
        @SuppressLint({"BanUncheckedReflection"})
        public static void a(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "view");
            try {
                if (!f.t) {
                    f.t = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        f.r = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        f.s = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        f.r = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        f.s = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = f.r;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = f.s;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = f.s;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = f.r;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                f.u = true;
            }
        }
    }

    /* compiled from: ViewLayer.android.kt */
    /* loaded from: classes.dex */
    public static final class d {
        public static final long a(View view) {
            long uniqueDrawingId;
            com.amazon.aps.iva.yb0.j.f(view, "view");
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AndroidComposeView androidComposeView, l1 l1Var, l lVar, o.h hVar) {
        super(androidComposeView.getContext());
        com.amazon.aps.iva.yb0.j.f(androidComposeView, "ownerView");
        com.amazon.aps.iva.yb0.j.f(lVar, "drawBlock");
        com.amazon.aps.iva.yb0.j.f(hVar, "invalidateParentLayer");
        this.b = androidComposeView;
        this.c = l1Var;
        this.d = lVar;
        this.e = hVar;
        this.f = new a2(androidComposeView.getDensity());
        this.k = new com.amazon.aps.iva.p0.e(1);
        this.l = new x1<>(p);
        this.m = b1.b;
        this.n = true;
        setWillNotDraw(false);
        l1Var.addView(this);
        this.o = View.generateViewId();
    }

    private final m0 getManualClipPath() {
        if (getClipToOutline()) {
            a2 a2Var = this.f;
            if (!(!a2Var.i)) {
                a2Var.e();
                return a2Var.g;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.i) {
            this.i = z;
            this.b.D(this, z);
        }
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void a(com.amazon.aps.iva.e1.b bVar, boolean z) {
        x1<View> x1Var = this.l;
        if (z) {
            float[] a2 = x1Var.a(this);
            if (a2 != null) {
                k.v(a2, bVar);
                return;
            }
            bVar.a = 0.0f;
            bVar.b = 0.0f;
            bVar.c = 0.0f;
            bVar.d = 0.0f;
            return;
        }
        k.v(x1Var.b(this), bVar);
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final long b(long j, boolean z) {
        x1<View> x1Var = this.l;
        if (z) {
            float[] a2 = x1Var.a(this);
            if (a2 != null) {
                return k.u(a2, j);
            }
            int i = com.amazon.aps.iva.e1.c.e;
            return com.amazon.aps.iva.e1.c.c;
        }
        return k.u(x1Var.b(this), j);
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void c(long j) {
        a aVar;
        int i = (int) (j >> 32);
        int b2 = com.amazon.aps.iva.o2.j.b(j);
        if (i != getWidth() || b2 != getHeight()) {
            long j2 = this.m;
            int i2 = b1.c;
            float f = i;
            setPivotX(Float.intBitsToFloat((int) (j2 >> 32)) * f);
            float f2 = b2;
            setPivotY(b1.a(this.m) * f2);
            long d2 = r.d(f, f2);
            a2 a2Var = this.f;
            if (!com.amazon.aps.iva.e1.g.a(a2Var.d, d2)) {
                a2Var.d = d2;
                a2Var.h = true;
            }
            if (a2Var.b() != null) {
                aVar = q;
            } else {
                aVar = null;
            }
            setOutlineProvider(aVar);
            layout(getLeft(), getTop(), getLeft() + i, getTop() + b2);
            j();
            this.l.c();
        }
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void d(o.h hVar, l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "drawBlock");
        com.amazon.aps.iva.yb0.j.f(hVar, "invalidateParentLayer");
        this.c.addView(this);
        this.g = false;
        this.j = false;
        this.m = b1.b;
        this.d = lVar;
        this.e = hVar;
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.b;
        androidComposeView.w = true;
        this.d = null;
        this.e = null;
        androidComposeView.F(this);
        this.c.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        com.amazon.aps.iva.yb0.j.f(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        com.amazon.aps.iva.p0.e eVar = this.k;
        Object obj = eVar.b;
        Canvas canvas2 = ((com.amazon.aps.iva.f1.g) obj).a;
        com.amazon.aps.iva.f1.g gVar = (com.amazon.aps.iva.f1.g) obj;
        gVar.getClass();
        gVar.a = canvas;
        Object obj2 = eVar.b;
        com.amazon.aps.iva.f1.g gVar2 = (com.amazon.aps.iva.f1.g) obj2;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            gVar2.n();
            this.f.a(gVar2);
            z = true;
        }
        l<? super u, q> lVar = this.d;
        if (lVar != null) {
            lVar.invoke(gVar2);
        }
        if (z) {
            gVar2.g();
        }
        ((com.amazon.aps.iva.f1.g) obj2).x(canvas2);
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void e(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, com.amazon.aps.iva.f1.u0 u0Var, boolean z, long j2, long j3, int i, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.o2.c cVar) {
        com.amazon.aps.iva.xb0.a<q> aVar;
        com.amazon.aps.iva.yb0.j.f(u0Var, "shape");
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        this.m = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        long j4 = this.m;
        int i2 = b1.c;
        setPivotX(Float.intBitsToFloat((int) (j4 >> 32)) * getWidth());
        setPivotY(b1.a(this.m) * getHeight());
        setCameraDistancePx(f10);
        p0.a aVar2 = p0.a;
        boolean z2 = true;
        this.g = z && u0Var == aVar2;
        j();
        boolean z3 = getManualClipPath() != null;
        setClipToOutline(z && u0Var != aVar2);
        boolean d2 = this.f.d(u0Var, getAlpha(), getClipToOutline(), getElevation(), lVar, cVar);
        setOutlineProvider(this.f.b() != null ? q : null);
        boolean z4 = getManualClipPath() != null;
        if (z3 != z4 || (z4 && d2)) {
            invalidate();
        }
        if (!this.j && getElevation() > 0.0f && (aVar = this.e) != null) {
            aVar.invoke();
        }
        this.l.c();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            x2 x2Var = x2.a;
            x2Var.a(this, defpackage.i.G(j2));
            x2Var.b(this, defpackage.i.G(j3));
        }
        if (i3 >= 31) {
            y2.a.a(this, null);
        }
        if (i == 1) {
            setLayerType(2, null);
        } else {
            if (i == 2) {
                setLayerType(0, null);
                z2 = false;
            } else {
                setLayerType(0, null);
            }
        }
        this.n = z2;
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void f(u uVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        if (getElevation() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.j = z;
        if (z) {
            uVar.j();
        }
        this.c.a(uVar, this, getDrawingTime());
        if (this.j) {
            uVar.o();
        }
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final boolean g(long j) {
        float c2 = com.amazon.aps.iva.e1.c.c(j);
        float d2 = com.amazon.aps.iva.e1.c.d(j);
        if (this.g) {
            if (0.0f <= c2 && c2 < getWidth() && 0.0f <= d2 && d2 < getHeight()) {
                return true;
            }
            return false;
        } else if (!getClipToOutline()) {
            return true;
        } else {
            return this.f.c(j);
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final l1 getContainer() {
        return this.c;
    }

    public long getLayerId() {
        return this.o;
    }

    public final AndroidComposeView getOwnerView() {
        return this.b;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.b);
        }
        return -1L;
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void h(long j) {
        int i = com.amazon.aps.iva.o2.h.c;
        int i2 = (int) (j >> 32);
        int left = getLeft();
        x1<View> x1Var = this.l;
        if (i2 != left) {
            offsetLeftAndRight(i2 - getLeft());
            x1Var.c();
        }
        int b2 = com.amazon.aps.iva.o2.h.b(j);
        if (b2 != getTop()) {
            offsetTopAndBottom(b2 - getTop());
            x1Var.c();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void i() {
        if (this.i && !u) {
            setInvalidated(false);
            c.a(this);
        }
    }

    @Override // android.view.View, com.amazon.aps.iva.u1.u0
    public final void invalidate() {
        if (!this.i) {
            setInvalidated(true);
            super.invalidate();
            this.b.invalidate();
        }
    }

    public final void j() {
        Rect rect;
        if (this.g) {
            Rect rect2 = this.h;
            if (rect2 == null) {
                this.h = new Rect(0, 0, getWidth(), getHeight());
            } else {
                com.amazon.aps.iva.yb0.j.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.h;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
