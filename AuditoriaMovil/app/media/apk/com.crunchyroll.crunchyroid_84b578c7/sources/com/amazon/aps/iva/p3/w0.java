package com.amazon.aps.iva.p3;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.amazon.aps.iva.p3.d;
import com.amazon.aps.iva.p3.g0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public final class w0 {
    public static final w0 b;
    public final k a;

    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {
        public static final Field a;
        public static final Field b;
        public static final Field c;
        public static final boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        public d() {
        }

        @Override // com.amazon.aps.iva.p3.w0.e
        public void c(int i, com.amazon.aps.iva.g3.f fVar) {
            this.c.setInsets(m.a(i), fVar.d());
        }

        public d(w0 w0Var) {
            super(w0Var);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public final w0 a;
        public com.amazon.aps.iva.g3.f[] b;

        public e() {
            this(new w0((w0) null));
        }

        public final void a() {
            com.amazon.aps.iva.g3.f[] fVarArr = this.b;
            if (fVarArr != null) {
                com.amazon.aps.iva.g3.f fVar = fVarArr[l.a(1)];
                com.amazon.aps.iva.g3.f fVar2 = this.b[l.a(2)];
                w0 w0Var = this.a;
                if (fVar2 == null) {
                    fVar2 = w0Var.a(2);
                }
                if (fVar == null) {
                    fVar = w0Var.a(1);
                }
                g(com.amazon.aps.iva.g3.f.a(fVar, fVar2));
                com.amazon.aps.iva.g3.f fVar3 = this.b[l.a(16)];
                if (fVar3 != null) {
                    f(fVar3);
                }
                com.amazon.aps.iva.g3.f fVar4 = this.b[l.a(32)];
                if (fVar4 != null) {
                    d(fVar4);
                }
                com.amazon.aps.iva.g3.f fVar5 = this.b[l.a(64)];
                if (fVar5 != null) {
                    h(fVar5);
                }
            }
        }

        public w0 b() {
            throw null;
        }

        public void c(int i, com.amazon.aps.iva.g3.f fVar) {
            if (this.b == null) {
                this.b = new com.amazon.aps.iva.g3.f[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[l.a(i2)] = fVar;
                }
            }
        }

        public void e(com.amazon.aps.iva.g3.f fVar) {
            throw null;
        }

        public void g(com.amazon.aps.iva.g3.f fVar) {
            throw null;
        }

        public e(w0 w0Var) {
            this.a = w0Var;
        }

        public void d(com.amazon.aps.iva.g3.f fVar) {
        }

        public void f(com.amazon.aps.iva.g3.f fVar) {
        }

        public void h(com.amazon.aps.iva.g3.f fVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class h extends g {
        public h(w0 w0Var, WindowInsets windowInsets) {
            super(w0Var, windowInsets);
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public w0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.c.consumeDisplayCutout();
            return w0.h(null, consumeDisplayCutout);
        }

        @Override // com.amazon.aps.iva.p3.w0.f, com.amazon.aps.iva.p3.w0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (Objects.equals(this.c, hVar.c) && Objects.equals(this.g, hVar.g)) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public com.amazon.aps.iva.p3.d f() {
            DisplayCutout displayCutout;
            displayCutout = this.c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new com.amazon.aps.iva.p3.d(displayCutout);
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public int hashCode() {
            return this.c.hashCode();
        }

        public h(w0 w0Var, h hVar) {
            super(w0Var, hVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class j extends i {
        public static final w0 q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            q = w0.h(null, windowInsets);
        }

        public j(w0 w0Var, WindowInsets windowInsets) {
            super(w0Var, windowInsets);
        }

        @Override // com.amazon.aps.iva.p3.w0.f, com.amazon.aps.iva.p3.w0.k
        public com.amazon.aps.iva.g3.f g(int i) {
            Insets insets;
            insets = this.c.getInsets(m.a(i));
            return com.amazon.aps.iva.g3.f.c(insets);
        }

        public j(w0 w0Var, j jVar) {
            super(w0Var, jVar);
        }

        @Override // com.amazon.aps.iva.p3.w0.f, com.amazon.aps.iva.p3.w0.k
        public final void d(View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static final class l {
        public static int a(int i) {
            if (i != 1) {
                if (i == 2) {
                    return 1;
                }
                if (i == 4) {
                    return 2;
                }
                if (i != 8) {
                    if (i == 16) {
                        return 4;
                    }
                    if (i != 32) {
                        if (i != 64) {
                            if (i != 128) {
                                if (i == 256) {
                                    return 8;
                                }
                                throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("type needs to be >= FIRST and <= LAST, type=", i));
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static final class m {
        public static int a(int i) {
            int a;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            a = WindowInsets.Type.navigationBars();
                        } else if (i3 == 4) {
                            a = WindowInsets.Type.captionBar();
                        } else if (i3 != 8) {
                            if (i3 == 16) {
                                a = WindowInsets.Type.systemGestures();
                            } else if (i3 != 32) {
                                if (i3 != 64) {
                                    if (i3 == 128) {
                                        a = com.amazon.aps.iva.f8.m.a();
                                    }
                                } else {
                                    a = com.amazon.aps.iva.f8.l.a();
                                }
                            } else {
                                a = com.amazon.aps.iva.d2.f0.a();
                            }
                        } else {
                            a = com.amazon.aps.iva.f8.j.e();
                        }
                    } else {
                        a = com.amazon.aps.iva.f8.j.a();
                    }
                    i2 |= a;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = j.q;
        } else {
            b = k.b;
        }
    }

    public w0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new j(this, windowInsets);
        } else if (i2 >= 29) {
            this.a = new i(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new h(this, windowInsets);
        } else {
            this.a = new g(this, windowInsets);
        }
    }

    public static com.amazon.aps.iva.g3.f f(com.amazon.aps.iva.g3.f fVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, fVar.a - i2);
        int max2 = Math.max(0, fVar.b - i3);
        int max3 = Math.max(0, fVar.c - i4);
        int max4 = Math.max(0, fVar.d - i5);
        if (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) {
            return fVar;
        }
        return com.amazon.aps.iva.g3.f.b(max, max2, max3, max4);
    }

    public static w0 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        w0 w0Var = new w0(windowInsets);
        if (view != null) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.g.b(view)) {
                w0 a2 = g0.j.a(view);
                k kVar = w0Var.a;
                kVar.r(a2);
                kVar.d(view.getRootView());
            }
        }
        return w0Var;
    }

    public final com.amazon.aps.iva.g3.f a(int i2) {
        return this.a.g(i2);
    }

    @Deprecated
    public final int b() {
        return this.a.k().d;
    }

    @Deprecated
    public final int c() {
        return this.a.k().a;
    }

    @Deprecated
    public final int d() {
        return this.a.k().c;
    }

    @Deprecated
    public final int e() {
        return this.a.k().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        return com.amazon.aps.iva.o3.b.a(this.a, ((w0) obj).a);
    }

    public final WindowInsets g() {
        k kVar = this.a;
        if (kVar instanceof f) {
            return ((f) kVar).c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class b extends e {
        public static Field e;
        public static boolean f;
        public static Constructor<WindowInsets> g;
        public static boolean h;
        public WindowInsets c;
        public com.amazon.aps.iva.g3.f d;

        public b() {
            this.c = i();
        }

        private static WindowInsets i() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                h = true;
            }
            Constructor<WindowInsets> constructor = g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // com.amazon.aps.iva.p3.w0.e
        public w0 b() {
            a();
            w0 h2 = w0.h(null, this.c);
            com.amazon.aps.iva.g3.f[] fVarArr = this.b;
            k kVar = h2.a;
            kVar.p(fVarArr);
            kVar.s(this.d);
            return h2;
        }

        @Override // com.amazon.aps.iva.p3.w0.e
        public void e(com.amazon.aps.iva.g3.f fVar) {
            this.d = fVar;
        }

        @Override // com.amazon.aps.iva.p3.w0.e
        public void g(com.amazon.aps.iva.g3.f fVar) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(fVar.a, fVar.b, fVar.c, fVar.d);
            }
        }

        public b(w0 w0Var) {
            super(w0Var);
            this.c = w0Var.g();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class c extends e {
        public final WindowInsets.Builder c;

        public c() {
            this.c = com.amazon.aps.iva.a9.b0.e();
        }

        @Override // com.amazon.aps.iva.p3.w0.e
        public w0 b() {
            WindowInsets build;
            a();
            build = this.c.build();
            w0 h = w0.h(null, build);
            h.a.p(this.b);
            return h;
        }

        @Override // com.amazon.aps.iva.p3.w0.e
        public void d(com.amazon.aps.iva.g3.f fVar) {
            this.c.setMandatorySystemGestureInsets(fVar.d());
        }

        @Override // com.amazon.aps.iva.p3.w0.e
        public void e(com.amazon.aps.iva.g3.f fVar) {
            this.c.setStableInsets(fVar.d());
        }

        @Override // com.amazon.aps.iva.p3.w0.e
        public void f(com.amazon.aps.iva.g3.f fVar) {
            this.c.setSystemGestureInsets(fVar.d());
        }

        @Override // com.amazon.aps.iva.p3.w0.e
        public void g(com.amazon.aps.iva.g3.f fVar) {
            this.c.setSystemWindowInsets(fVar.d());
        }

        @Override // com.amazon.aps.iva.p3.w0.e
        public void h(com.amazon.aps.iva.g3.f fVar) {
            this.c.setTappableElementInsets(fVar.d());
        }

        public c(w0 w0Var) {
            super(w0Var);
            WindowInsets.Builder e;
            WindowInsets g = w0Var.g();
            if (g != null) {
                e = com.amazon.aps.iva.c6.t.d(g);
            } else {
                e = com.amazon.aps.iva.a9.b0.e();
            }
            this.c = e;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class g extends f {
        public com.amazon.aps.iva.g3.f m;

        public g(w0 w0Var, WindowInsets windowInsets) {
            super(w0Var, windowInsets);
            this.m = null;
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public w0 b() {
            return w0.h(null, this.c.consumeStableInsets());
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public w0 c() {
            return w0.h(null, this.c.consumeSystemWindowInsets());
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public final com.amazon.aps.iva.g3.f i() {
            if (this.m == null) {
                WindowInsets windowInsets = this.c;
                this.m = com.amazon.aps.iva.g3.f.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public boolean n() {
            return this.c.isConsumed();
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public void s(com.amazon.aps.iva.g3.f fVar) {
            this.m = fVar;
        }

        public g(w0 w0Var, g gVar) {
            super(w0Var, gVar);
            this.m = null;
            this.m = gVar.m;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class f extends k {
        public static boolean h;
        public static Method i;
        public static Class<?> j;
        public static Field k;
        public static Field l;
        public final WindowInsets c;
        public com.amazon.aps.iva.g3.f[] d;
        public com.amazon.aps.iva.g3.f e;
        public w0 f;
        public com.amazon.aps.iva.g3.f g;

        public f(w0 w0Var, WindowInsets windowInsets) {
            super(w0Var);
            this.e = null;
            this.c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private com.amazon.aps.iva.g3.f t(int i2, boolean z) {
            com.amazon.aps.iva.g3.f fVar = com.amazon.aps.iva.g3.f.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    fVar = com.amazon.aps.iva.g3.f.a(fVar, u(i3, z));
                }
            }
            return fVar;
        }

        private com.amazon.aps.iva.g3.f v() {
            w0 w0Var = this.f;
            if (w0Var != null) {
                return w0Var.a.i();
            }
            return com.amazon.aps.iva.g3.f.e;
        }

        private com.amazon.aps.iva.g3.f w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!h) {
                    x();
                }
                Method method = i;
                if (method != null && j != null && k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) k.get(l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return com.amazon.aps.iva.g3.f.b(rect.left, rect.top, rect.right, rect.bottom);
                    } catch (ReflectiveOperationException e) {
                        e.getMessage();
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
            h = true;
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public void d(View view) {
            com.amazon.aps.iva.g3.f w = w(view);
            if (w == null) {
                w = com.amazon.aps.iva.g3.f.e;
            }
            q(w);
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public void e(w0 w0Var) {
            w0Var.a.r(this.f);
            w0Var.a.q(this.g);
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.g, ((f) obj).g);
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public com.amazon.aps.iva.g3.f g(int i2) {
            return t(i2, false);
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public final com.amazon.aps.iva.g3.f k() {
            if (this.e == null) {
                WindowInsets windowInsets = this.c;
                this.e = com.amazon.aps.iva.g3.f.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public w0 m(int i2, int i3, int i4, int i5) {
            e bVar;
            w0 h2 = w0.h(null, this.c);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                bVar = new d(h2);
            } else if (i6 >= 29) {
                bVar = new c(h2);
            } else {
                bVar = new b(h2);
            }
            bVar.g(w0.f(k(), i2, i3, i4, i5));
            bVar.e(w0.f(i(), i2, i3, i4, i5));
            return bVar.b();
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public boolean o() {
            return this.c.isRound();
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public void p(com.amazon.aps.iva.g3.f[] fVarArr) {
            this.d = fVarArr;
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public void q(com.amazon.aps.iva.g3.f fVar) {
            this.g = fVar;
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public void r(w0 w0Var) {
            this.f = w0Var;
        }

        public com.amazon.aps.iva.g3.f u(int i2, boolean z) {
            int i3;
            com.amazon.aps.iva.p3.d f;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (i2 != 1) {
                com.amazon.aps.iva.g3.f fVar = null;
                if (i2 != 2) {
                    com.amazon.aps.iva.g3.f fVar2 = com.amazon.aps.iva.g3.f.e;
                    if (i2 != 8) {
                        if (i2 != 16) {
                            if (i2 != 32) {
                                if (i2 != 64) {
                                    if (i2 != 128) {
                                        return fVar2;
                                    }
                                    w0 w0Var = this.f;
                                    if (w0Var != null) {
                                        f = w0Var.a.f();
                                    } else {
                                        f = f();
                                    }
                                    if (f != null) {
                                        int i8 = Build.VERSION.SDK_INT;
                                        DisplayCutout displayCutout = f.a;
                                        if (i8 >= 28) {
                                            i4 = d.a.d(displayCutout);
                                        } else {
                                            i4 = 0;
                                        }
                                        if (i8 >= 28) {
                                            i5 = d.a.f(displayCutout);
                                        } else {
                                            i5 = 0;
                                        }
                                        if (i8 >= 28) {
                                            i6 = d.a.e(displayCutout);
                                        } else {
                                            i6 = 0;
                                        }
                                        if (i8 >= 28) {
                                            i7 = d.a.c(displayCutout);
                                        }
                                        return com.amazon.aps.iva.g3.f.b(i4, i5, i6, i7);
                                    }
                                    return fVar2;
                                }
                                return l();
                            }
                            return h();
                        }
                        return j();
                    }
                    com.amazon.aps.iva.g3.f[] fVarArr = this.d;
                    if (fVarArr != null) {
                        fVar = fVarArr[l.a(8)];
                    }
                    if (fVar != null) {
                        return fVar;
                    }
                    com.amazon.aps.iva.g3.f k2 = k();
                    com.amazon.aps.iva.g3.f v = v();
                    int i9 = k2.d;
                    if (i9 > v.d) {
                        return com.amazon.aps.iva.g3.f.b(0, 0, 0, i9);
                    }
                    com.amazon.aps.iva.g3.f fVar3 = this.g;
                    if (fVar3 != null && !fVar3.equals(fVar2) && (i3 = this.g.d) > v.d) {
                        return com.amazon.aps.iva.g3.f.b(0, 0, 0, i3);
                    }
                    return fVar2;
                } else if (z) {
                    com.amazon.aps.iva.g3.f v2 = v();
                    com.amazon.aps.iva.g3.f i10 = i();
                    return com.amazon.aps.iva.g3.f.b(Math.max(v2.a, i10.a), 0, Math.max(v2.c, i10.c), Math.max(v2.d, i10.d));
                } else {
                    com.amazon.aps.iva.g3.f k3 = k();
                    w0 w0Var2 = this.f;
                    if (w0Var2 != null) {
                        fVar = w0Var2.a.i();
                    }
                    int i11 = k3.d;
                    if (fVar != null) {
                        i11 = Math.min(i11, fVar.d);
                    }
                    return com.amazon.aps.iva.g3.f.b(k3.a, 0, k3.c, i11);
                }
            } else if (z) {
                return com.amazon.aps.iva.g3.f.b(0, Math.max(v().b, k().b), 0, 0);
            } else {
                return com.amazon.aps.iva.g3.f.b(0, k().b, 0, 0);
            }
        }

        public f(w0 w0Var, f fVar) {
            this(w0Var, new WindowInsets(fVar.c));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class i extends h {
        public com.amazon.aps.iva.g3.f n;
        public com.amazon.aps.iva.g3.f o;
        public com.amazon.aps.iva.g3.f p;

        public i(w0 w0Var, WindowInsets windowInsets) {
            super(w0Var, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public com.amazon.aps.iva.g3.f h() {
            Insets mandatorySystemGestureInsets;
            if (this.o == null) {
                mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
                this.o = com.amazon.aps.iva.g3.f.c(mandatorySystemGestureInsets);
            }
            return this.o;
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public com.amazon.aps.iva.g3.f j() {
            Insets systemGestureInsets;
            if (this.n == null) {
                systemGestureInsets = this.c.getSystemGestureInsets();
                this.n = com.amazon.aps.iva.g3.f.c(systemGestureInsets);
            }
            return this.n;
        }

        @Override // com.amazon.aps.iva.p3.w0.k
        public com.amazon.aps.iva.g3.f l() {
            Insets tappableElementInsets;
            if (this.p == null) {
                tappableElementInsets = this.c.getTappableElementInsets();
                this.p = com.amazon.aps.iva.g3.f.c(tappableElementInsets);
            }
            return this.p;
        }

        @Override // com.amazon.aps.iva.p3.w0.f, com.amazon.aps.iva.p3.w0.k
        public w0 m(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            inset = this.c.inset(i, i2, i3, i4);
            return w0.h(null, inset);
        }

        public i(w0 w0Var, i iVar) {
            super(w0Var, iVar);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // com.amazon.aps.iva.p3.w0.g, com.amazon.aps.iva.p3.w0.k
        public void s(com.amazon.aps.iva.g3.f fVar) {
        }
    }

    public w0(w0 w0Var) {
        if (w0Var != null) {
            k kVar = w0Var.a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (kVar instanceof j)) {
                this.a = new j(this, (j) kVar);
            } else if (i2 >= 29 && (kVar instanceof i)) {
                this.a = new i(this, (i) kVar);
            } else if (i2 >= 28 && (kVar instanceof h)) {
                this.a = new h(this, (h) kVar);
            } else if (kVar instanceof g) {
                this.a = new g(this, (g) kVar);
            } else if (kVar instanceof f) {
                this.a = new f(this, (f) kVar);
            } else {
                this.a = new k(this);
            }
            kVar.e(this);
            return;
        }
        this.a = new k(this);
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class k {
        public static final w0 b;
        public final w0 a;

        static {
            e bVar;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                bVar = new d();
            } else if (i >= 29) {
                bVar = new c();
            } else {
                bVar = new b();
            }
            b = bVar.b().a.a().a.b().a.c();
        }

        public k(w0 w0Var) {
            this.a = w0Var;
        }

        public w0 a() {
            return this.a;
        }

        public w0 b() {
            return this.a;
        }

        public w0 c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (o() == kVar.o() && n() == kVar.n() && com.amazon.aps.iva.o3.b.a(k(), kVar.k()) && com.amazon.aps.iva.o3.b.a(i(), kVar.i()) && com.amazon.aps.iva.o3.b.a(f(), kVar.f())) {
                return true;
            }
            return false;
        }

        public com.amazon.aps.iva.p3.d f() {
            return null;
        }

        public com.amazon.aps.iva.g3.f g(int i) {
            return com.amazon.aps.iva.g3.f.e;
        }

        public com.amazon.aps.iva.g3.f h() {
            return k();
        }

        public int hashCode() {
            return com.amazon.aps.iva.o3.b.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        public com.amazon.aps.iva.g3.f i() {
            return com.amazon.aps.iva.g3.f.e;
        }

        public com.amazon.aps.iva.g3.f j() {
            return k();
        }

        public com.amazon.aps.iva.g3.f k() {
            return com.amazon.aps.iva.g3.f.e;
        }

        public com.amazon.aps.iva.g3.f l() {
            return k();
        }

        public w0 m(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void d(View view) {
        }

        public void e(w0 w0Var) {
        }

        public void p(com.amazon.aps.iva.g3.f[] fVarArr) {
        }

        public void q(com.amazon.aps.iva.g3.f fVar) {
        }

        public void r(w0 w0Var) {
        }

        public void s(com.amazon.aps.iva.g3.f fVar) {
        }
    }
}
