package c.i.k;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import c.i.k.d0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class j0 {
    public static final j0 a;

    /* renamed from: b  reason: collision with root package name */
    public final k f2164b;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {
        public static Field a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f2165b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f2166c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f2167d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2165b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2166c = declaredField3;
                declaredField3.setAccessible(true);
                f2167d = true;
            } catch (ReflectiveOperationException e2) {
                StringBuilder y = e.a.d.a.a.y("Failed to get visible insets from AttachInfo ");
                y.append(e2.getMessage());
                Log.w("WindowInsetsCompat", y.toString(), e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: b  reason: collision with root package name */
        public static Field f2168b;

        /* renamed from: c  reason: collision with root package name */
        public static boolean f2169c;

        /* renamed from: d  reason: collision with root package name */
        public static Constructor<WindowInsets> f2170d;

        /* renamed from: e  reason: collision with root package name */
        public static boolean f2171e;

        /* renamed from: f  reason: collision with root package name */
        public WindowInsets f2172f;

        /* renamed from: g  reason: collision with root package name */
        public c.i.e.c f2173g;

        public b() {
            this.f2172f = e();
        }

        public b(j0 j0Var) {
            super(j0Var);
            this.f2172f = j0Var.i();
        }

        public static WindowInsets e() {
            if (!f2169c) {
                try {
                    f2168b = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f2169c = true;
            }
            Field field = f2168b;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f2171e) {
                try {
                    f2170d = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f2171e = true;
            }
            Constructor<WindowInsets> constructor = f2170d;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // c.i.k.j0.e
        public j0 b() {
            a();
            j0 j2 = j0.j(this.f2172f);
            j2.f2164b.p(null);
            j2.f2164b.r(this.f2173g);
            return j2;
        }

        @Override // c.i.k.j0.e
        public void c(c.i.e.c cVar) {
            this.f2173g = cVar;
        }

        @Override // c.i.k.j0.e
        public void d(c.i.e.c cVar) {
            WindowInsets windowInsets = this.f2172f;
            if (windowInsets != null) {
                this.f2172f = windowInsets.replaceSystemWindowInsets(cVar.f2035b, cVar.f2036c, cVar.f2037d, cVar.f2038e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsets.Builder f2174b;

        public c() {
            this.f2174b = new WindowInsets.Builder();
        }

        public c(j0 j0Var) {
            super(j0Var);
            WindowInsets i2 = j0Var.i();
            this.f2174b = i2 != null ? new WindowInsets.Builder(i2) : new WindowInsets.Builder();
        }

        @Override // c.i.k.j0.e
        public j0 b() {
            a();
            j0 j2 = j0.j(this.f2174b.build());
            j2.f2164b.p(null);
            return j2;
        }

        @Override // c.i.k.j0.e
        public void c(c.i.e.c cVar) {
            this.f2174b.setStableInsets(cVar.d());
        }

        @Override // c.i.k.j0.e
        public void d(c.i.e.c cVar) {
            this.f2174b.setSystemWindowInsets(cVar.d());
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        public d() {
        }

        public d(j0 j0Var) {
            super(j0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public final j0 a;

        public e() {
            this(new j0((j0) null));
        }

        public e(j0 j0Var) {
            this.a = j0Var;
        }

        public final void a() {
        }

        public j0 b() {
            a();
            return this.a;
        }

        public void c(c.i.e.c cVar) {
        }

        public void d(c.i.e.c cVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class f extends k {

        /* renamed from: c  reason: collision with root package name */
        public static boolean f2175c;

        /* renamed from: d  reason: collision with root package name */
        public static Method f2176d;

        /* renamed from: e  reason: collision with root package name */
        public static Class<?> f2177e;

        /* renamed from: f  reason: collision with root package name */
        public static Field f2178f;

        /* renamed from: g  reason: collision with root package name */
        public static Field f2179g;

        /* renamed from: h  reason: collision with root package name */
        public final WindowInsets f2180h;

        /* renamed from: i  reason: collision with root package name */
        public c.i.e.c[] f2181i;

        /* renamed from: j  reason: collision with root package name */
        public c.i.e.c f2182j;

        /* renamed from: k  reason: collision with root package name */
        public j0 f2183k;

        /* renamed from: l  reason: collision with root package name */
        public c.i.e.c f2184l;

        public f(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var);
            this.f2182j = null;
            this.f2180h = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        public static void w() {
            try {
                f2176d = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2177e = cls;
                f2178f = cls.getDeclaredField("mVisibleInsets");
                f2179g = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2178f.setAccessible(true);
                f2179g.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                StringBuilder y = e.a.d.a.a.y("Failed to get visible insets. (Reflection error). ");
                y.append(e2.getMessage());
                Log.e("WindowInsetsCompat", y.toString(), e2);
            }
            f2175c = true;
        }

        @Override // c.i.k.j0.k
        public void d(View view) {
            c.i.e.c v = v(view);
            if (v == null) {
                v = c.i.e.c.a;
            }
            x(v);
        }

        @Override // c.i.k.j0.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2184l, ((f) obj).f2184l);
            }
            return false;
        }

        @Override // c.i.k.j0.k
        public c.i.e.c f(int i2) {
            return s(i2, false);
        }

        @Override // c.i.k.j0.k
        public c.i.e.c g(int i2) {
            return s(i2, true);
        }

        @Override // c.i.k.j0.k
        public final c.i.e.c k() {
            if (this.f2182j == null) {
                this.f2182j = c.i.e.c.b(this.f2180h.getSystemWindowInsetLeft(), this.f2180h.getSystemWindowInsetTop(), this.f2180h.getSystemWindowInsetRight(), this.f2180h.getSystemWindowInsetBottom());
            }
            return this.f2182j;
        }

        @Override // c.i.k.j0.k
        public j0 m(int i2, int i3, int i4, int i5) {
            j0 j2 = j0.j(this.f2180h);
            int i6 = Build.VERSION.SDK_INT;
            e dVar = i6 >= 30 ? new d(j2) : i6 >= 29 ? new c(j2) : i6 >= 20 ? new b(j2) : new e(j2);
            dVar.d(j0.g(k(), i2, i3, i4, i5));
            dVar.c(j0.g(i(), i2, i3, i4, i5));
            return dVar.b();
        }

        @Override // c.i.k.j0.k
        public boolean o() {
            return this.f2180h.isRound();
        }

        @Override // c.i.k.j0.k
        public void p(c.i.e.c[] cVarArr) {
            this.f2181i = cVarArr;
        }

        @Override // c.i.k.j0.k
        public void q(j0 j0Var) {
            this.f2183k = j0Var;
        }

        @SuppressLint({"WrongConstant"})
        public final c.i.e.c s(int i2, boolean z) {
            c.i.e.c cVar = c.i.e.c.a;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    cVar = c.i.e.c.a(cVar, t(i3, z));
                }
            }
            return cVar;
        }

        public c.i.e.c t(int i2, boolean z) {
            c.i.e.c i3;
            int i4;
            if (i2 == 1) {
                return z ? c.i.e.c.b(0, Math.max(u().f2036c, k().f2036c), 0, 0) : c.i.e.c.b(0, k().f2036c, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    c.i.e.c u = u();
                    c.i.e.c i5 = i();
                    return c.i.e.c.b(Math.max(u.f2035b, i5.f2035b), 0, Math.max(u.f2037d, i5.f2037d), Math.max(u.f2038e, i5.f2038e));
                }
                c.i.e.c k2 = k();
                j0 j0Var = this.f2183k;
                i3 = j0Var != null ? j0Var.f2164b.i() : null;
                int i6 = k2.f2038e;
                if (i3 != null) {
                    i6 = Math.min(i6, i3.f2038e);
                }
                return c.i.e.c.b(k2.f2035b, 0, k2.f2037d, i6);
            } else if (i2 == 8) {
                c.i.e.c[] cVarArr = this.f2181i;
                i3 = cVarArr != null ? cVarArr[c.i.a.K(8)] : null;
                if (i3 != null) {
                    return i3;
                }
                c.i.e.c k3 = k();
                c.i.e.c u2 = u();
                int i7 = k3.f2038e;
                if (i7 > u2.f2038e) {
                    return c.i.e.c.b(0, 0, 0, i7);
                }
                c.i.e.c cVar = this.f2184l;
                return (cVar == null || cVar.equals(c.i.e.c.a) || (i4 = this.f2184l.f2038e) <= u2.f2038e) ? c.i.e.c.a : c.i.e.c.b(0, 0, 0, i4);
            } else if (i2 != 16) {
                if (i2 != 32) {
                    if (i2 != 64) {
                        if (i2 != 128) {
                            return c.i.e.c.a;
                        }
                        j0 j0Var2 = this.f2183k;
                        c.i.k.h e2 = j0Var2 != null ? j0Var2.f2164b.e() : e();
                        if (e2 != null) {
                            int i8 = Build.VERSION.SDK_INT;
                            return c.i.e.c.b(i8 >= 28 ? ((DisplayCutout) e2.a).getSafeInsetLeft() : 0, i8 >= 28 ? ((DisplayCutout) e2.a).getSafeInsetTop() : 0, i8 >= 28 ? ((DisplayCutout) e2.a).getSafeInsetRight() : 0, i8 >= 28 ? ((DisplayCutout) e2.a).getSafeInsetBottom() : 0);
                        }
                        return c.i.e.c.a;
                    }
                    return l();
                }
                return h();
            } else {
                return j();
            }
        }

        public final c.i.e.c u() {
            j0 j0Var = this.f2183k;
            return j0Var != null ? j0Var.f2164b.i() : c.i.e.c.a;
        }

        public final c.i.e.c v(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2175c) {
                    w();
                }
                Method method = f2176d;
                if (method != null && f2177e != null && f2178f != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f2178f.get(f2179g.get(invoke));
                        if (rect != null) {
                            return c.i.e.c.b(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e2) {
                        StringBuilder y = e.a.d.a.a.y("Failed to get visible insets. (Reflection error). ");
                        y.append(e2.getMessage());
                        Log.e("WindowInsetsCompat", y.toString(), e2);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public void x(c.i.e.c cVar) {
            this.f2184l = cVar;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public c.i.e.c f2185m;

        public g(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var, windowInsets);
            this.f2185m = null;
        }

        @Override // c.i.k.j0.k
        public j0 b() {
            return j0.j(this.f2180h.consumeStableInsets());
        }

        @Override // c.i.k.j0.k
        public j0 c() {
            return j0.j(this.f2180h.consumeSystemWindowInsets());
        }

        @Override // c.i.k.j0.k
        public final c.i.e.c i() {
            if (this.f2185m == null) {
                this.f2185m = c.i.e.c.b(this.f2180h.getStableInsetLeft(), this.f2180h.getStableInsetTop(), this.f2180h.getStableInsetRight(), this.f2180h.getStableInsetBottom());
            }
            return this.f2185m;
        }

        @Override // c.i.k.j0.k
        public boolean n() {
            return this.f2180h.isConsumed();
        }

        @Override // c.i.k.j0.k
        public void r(c.i.e.c cVar) {
            this.f2185m = cVar;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public h(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var, windowInsets);
        }

        @Override // c.i.k.j0.k
        public j0 a() {
            return j0.j(this.f2180h.consumeDisplayCutout());
        }

        @Override // c.i.k.j0.k
        public c.i.k.h e() {
            DisplayCutout displayCutout = this.f2180h.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new c.i.k.h(displayCutout);
        }

        @Override // c.i.k.j0.f, c.i.k.j0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return Objects.equals(this.f2180h, hVar.f2180h) && Objects.equals(this.f2184l, hVar.f2184l);
            }
            return false;
        }

        @Override // c.i.k.j0.k
        public int hashCode() {
            return this.f2180h.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {

        /* renamed from: n  reason: collision with root package name */
        public c.i.e.c f2186n;
        public c.i.e.c o;
        public c.i.e.c p;

        public i(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var, windowInsets);
            this.f2186n = null;
            this.o = null;
            this.p = null;
        }

        @Override // c.i.k.j0.k
        public c.i.e.c h() {
            if (this.o == null) {
                this.o = c.i.e.c.c(this.f2180h.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override // c.i.k.j0.k
        public c.i.e.c j() {
            if (this.f2186n == null) {
                this.f2186n = c.i.e.c.c(this.f2180h.getSystemGestureInsets());
            }
            return this.f2186n;
        }

        @Override // c.i.k.j0.k
        public c.i.e.c l() {
            if (this.p == null) {
                this.p = c.i.e.c.c(this.f2180h.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // c.i.k.j0.f, c.i.k.j0.k
        public j0 m(int i2, int i3, int i4, int i5) {
            return j0.j(this.f2180h.inset(i2, i3, i4, i5));
        }

        @Override // c.i.k.j0.g, c.i.k.j0.k
        public void r(c.i.e.c cVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class j extends i {
        public static final j0 q = j0.j(WindowInsets.CONSUMED);

        public j(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var, windowInsets);
        }

        @Override // c.i.k.j0.f, c.i.k.j0.k
        public final void d(View view) {
        }

        @Override // c.i.k.j0.f, c.i.k.j0.k
        public c.i.e.c f(int i2) {
            return c.i.e.c.c(this.f2180h.getInsets(l.a(i2)));
        }

        @Override // c.i.k.j0.f, c.i.k.j0.k
        public c.i.e.c g(int i2) {
            return c.i.e.c.c(this.f2180h.getInsetsIgnoringVisibility(l.a(i2)));
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static final j0 a;

        /* renamed from: b  reason: collision with root package name */
        public final j0 f2187b;

        static {
            int i2 = Build.VERSION.SDK_INT;
            a = (i2 >= 30 ? new d() : i2 >= 29 ? new c() : i2 >= 20 ? new b() : new e()).b().f2164b.a().f2164b.b().f2164b.c();
        }

        public k(j0 j0Var) {
            this.f2187b = j0Var;
        }

        public j0 a() {
            return this.f2187b;
        }

        public j0 b() {
            return this.f2187b;
        }

        public j0 c() {
            return this.f2187b;
        }

        public void d(View view) {
        }

        public c.i.k.h e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return o() == kVar.o() && n() == kVar.n() && Objects.equals(k(), kVar.k()) && Objects.equals(i(), kVar.i()) && Objects.equals(e(), kVar.e());
            }
            return false;
        }

        public c.i.e.c f(int i2) {
            return c.i.e.c.a;
        }

        public c.i.e.c g(int i2) {
            if ((i2 & 8) == 0) {
                return c.i.e.c.a;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public c.i.e.c h() {
            return k();
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
        }

        public c.i.e.c i() {
            return c.i.e.c.a;
        }

        public c.i.e.c j() {
            return k();
        }

        public c.i.e.c k() {
            return c.i.e.c.a;
        }

        public c.i.e.c l() {
            return k();
        }

        public j0 m(int i2, int i3, int i4, int i5) {
            return a;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void p(c.i.e.c[] cVarArr) {
        }

        public void q(j0 j0Var) {
        }

        public void r(c.i.e.c cVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class l {
        public static int a(int i2) {
            int statusBars;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i3 |= statusBars;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            a = j.q;
        } else {
            a = k.a;
        }
    }

    public j0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f2164b = new j(this, windowInsets);
        } else if (i2 >= 29) {
            this.f2164b = new i(this, windowInsets);
        } else if (i2 >= 28) {
            this.f2164b = new h(this, windowInsets);
        } else if (i2 >= 21) {
            this.f2164b = new g(this, windowInsets);
        } else if (i2 >= 20) {
            this.f2164b = new f(this, windowInsets);
        } else {
            this.f2164b = new k(this);
        }
    }

    public j0(j0 j0Var) {
        this.f2164b = new k(this);
    }

    public static c.i.e.c g(c.i.e.c cVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, cVar.f2035b - i2);
        int max2 = Math.max(0, cVar.f2036c - i3);
        int max3 = Math.max(0, cVar.f2037d - i4);
        int max4 = Math.max(0, cVar.f2038e - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? cVar : c.i.e.c.b(max, max2, max3, max4);
    }

    public static j0 j(WindowInsets windowInsets) {
        return k(windowInsets, null);
    }

    public static j0 k(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        j0 j0Var = new j0(windowInsets);
        if (view != null) {
            AtomicInteger atomicInteger = d0.a;
            if (d0.f.b(view)) {
                j0Var.f2164b.q(d0.o(view));
                j0Var.f2164b.d(view.getRootView());
            }
        }
        return j0Var;
    }

    public c.i.e.c a(int i2) {
        return this.f2164b.f(i2);
    }

    @Deprecated
    public int b() {
        return this.f2164b.k().f2038e;
    }

    @Deprecated
    public int c() {
        return this.f2164b.k().f2035b;
    }

    @Deprecated
    public int d() {
        return this.f2164b.k().f2037d;
    }

    @Deprecated
    public int e() {
        return this.f2164b.k().f2036c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return Objects.equals(this.f2164b, ((j0) obj).f2164b);
        }
        return false;
    }

    public boolean f() {
        c.i.e.c a2 = a(-1);
        c.i.e.c cVar = c.i.e.c.a;
        return (a2.equals(cVar) && this.f2164b.g(-9).equals(cVar) && this.f2164b.e() == null) ? false : true;
    }

    public boolean h() {
        return this.f2164b.n();
    }

    public int hashCode() {
        k kVar = this.f2164b;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public WindowInsets i() {
        k kVar = this.f2164b;
        if (kVar instanceof f) {
            return ((f) kVar).f2180h;
        }
        return null;
    }
}
