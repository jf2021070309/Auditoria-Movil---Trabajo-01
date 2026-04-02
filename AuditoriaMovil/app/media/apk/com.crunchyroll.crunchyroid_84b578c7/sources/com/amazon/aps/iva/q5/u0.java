package com.amazon.aps.iva.q5;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
/* compiled from: TrackSelectionParameters.java */
/* loaded from: classes.dex */
public class u0 implements k {
    public static final u0 B = new u0(new a());
    public static final String C = com.amazon.aps.iva.t5.g0.L(1);
    public static final String D = com.amazon.aps.iva.t5.g0.L(2);
    public static final String E = com.amazon.aps.iva.t5.g0.L(3);
    public static final String F = com.amazon.aps.iva.t5.g0.L(4);
    public static final String G = com.amazon.aps.iva.t5.g0.L(5);
    public static final String H = com.amazon.aps.iva.t5.g0.L(6);
    public static final String I = com.amazon.aps.iva.t5.g0.L(7);
    public static final String J = com.amazon.aps.iva.t5.g0.L(8);
    public static final String K = com.amazon.aps.iva.t5.g0.L(9);
    public static final String L = com.amazon.aps.iva.t5.g0.L(10);
    public static final String M = com.amazon.aps.iva.t5.g0.L(11);
    public static final String N = com.amazon.aps.iva.t5.g0.L(12);
    public static final String O = com.amazon.aps.iva.t5.g0.L(13);
    public static final String P = com.amazon.aps.iva.t5.g0.L(14);
    public static final String Q = com.amazon.aps.iva.t5.g0.L(15);
    public static final String R = com.amazon.aps.iva.t5.g0.L(16);
    public static final String S = com.amazon.aps.iva.t5.g0.L(17);
    public static final String T = com.amazon.aps.iva.t5.g0.L(18);
    public static final String U = com.amazon.aps.iva.t5.g0.L(19);
    public static final String V = com.amazon.aps.iva.t5.g0.L(20);
    public static final String W = com.amazon.aps.iva.t5.g0.L(21);
    public static final String X = com.amazon.aps.iva.t5.g0.L(22);
    public static final String Y = com.amazon.aps.iva.t5.g0.L(23);
    public static final String Z = com.amazon.aps.iva.t5.g0.L(24);
    public static final String k0 = com.amazon.aps.iva.t5.g0.L(25);
    public static final String v0 = com.amazon.aps.iva.t5.g0.L(26);
    public final ImmutableSet<Integer> A;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final ImmutableList<String> m;
    public final int n;
    public final ImmutableList<String> o;
    public final int p;
    public final int q;
    public final int r;
    public final ImmutableList<String> s;
    public final ImmutableList<String> t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final ImmutableMap<s0, t0> z;

    public u0(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
        this.o = aVar.n;
        this.p = aVar.o;
        this.q = aVar.p;
        this.r = aVar.q;
        this.s = aVar.r;
        this.t = aVar.s;
        this.u = aVar.t;
        this.v = aVar.u;
        this.w = aVar.v;
        this.x = aVar.w;
        this.y = aVar.x;
        this.z = ImmutableMap.copyOf((Map) aVar.y);
        this.A = ImmutableSet.copyOf((Collection) aVar.z);
    }

    public a a() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.b == u0Var.b && this.c == u0Var.c && this.d == u0Var.d && this.e == u0Var.e && this.f == u0Var.f && this.g == u0Var.g && this.h == u0Var.h && this.i == u0Var.i && this.l == u0Var.l && this.j == u0Var.j && this.k == u0Var.k && this.m.equals(u0Var.m) && this.n == u0Var.n && this.o.equals(u0Var.o) && this.p == u0Var.p && this.q == u0Var.q && this.r == u0Var.r && this.s.equals(u0Var.s) && this.t.equals(u0Var.t) && this.u == u0Var.u && this.v == u0Var.v && this.w == u0Var.w && this.x == u0Var.x && this.y == u0Var.y && this.z.equals(u0Var.z) && this.A.equals(u0Var.A)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.m.hashCode();
        int hashCode2 = this.o.hashCode();
        int hashCode3 = this.s.hashCode();
        int hashCode4 = this.t.hashCode();
        int hashCode5 = this.z.hashCode();
        return this.A.hashCode() + ((hashCode5 + ((((((((((((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.b + 31) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + (this.l ? 1 : 0)) * 31) + this.j) * 31) + this.k) * 31)) * 31) + this.n) * 31)) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31)) * 31)) * 31) + this.u) * 31) + this.v) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.amazon.aps.iva.q5.k
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(H, this.b);
        bundle.putInt(I, this.c);
        bundle.putInt(J, this.d);
        bundle.putInt(K, this.e);
        bundle.putInt(L, this.f);
        bundle.putInt(M, this.g);
        bundle.putInt(N, this.h);
        bundle.putInt(O, this.i);
        bundle.putInt(P, this.j);
        bundle.putInt(Q, this.k);
        bundle.putBoolean(R, this.l);
        ImmutableList<String> immutableList = this.m;
        bundle.putStringArray(S, (String[]) immutableList.toArray(new String[0]));
        bundle.putInt(k0, this.n);
        bundle.putStringArray(C, (String[]) this.o.toArray(new String[0]));
        bundle.putInt(D, this.p);
        bundle.putInt(T, this.q);
        bundle.putInt(U, this.r);
        bundle.putStringArray(V, (String[]) this.s.toArray(new String[0]));
        bundle.putStringArray(E, (String[]) this.t.toArray(new String[0]));
        bundle.putInt(F, this.u);
        bundle.putInt(v0, this.v);
        bundle.putBoolean(G, this.w);
        bundle.putBoolean(W, this.x);
        bundle.putBoolean(X, this.y);
        bundle.putParcelableArrayList(Y, com.amazon.aps.iva.t5.c.b(this.z.values()));
        bundle.putIntArray(Z, Ints.toArray(this.A));
        return bundle;
    }

    /* compiled from: TrackSelectionParameters.java */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public ImmutableList<String> l;
        public int m;
        public ImmutableList<String> n;
        public int o;
        public int p;
        public int q;
        public ImmutableList<String> r;
        public ImmutableList<String> s;
        public int t;
        public int u;
        public boolean v;
        public boolean w;
        public boolean x;
        public HashMap<s0, t0> y;
        public HashSet<Integer> z;

        @Deprecated
        public a() {
            this.a = Integer.MAX_VALUE;
            this.b = Integer.MAX_VALUE;
            this.c = Integer.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = Integer.MAX_VALUE;
            this.k = true;
            this.l = ImmutableList.of();
            this.m = 0;
            this.n = ImmutableList.of();
            this.o = 0;
            this.p = Integer.MAX_VALUE;
            this.q = Integer.MAX_VALUE;
            this.r = ImmutableList.of();
            this.s = ImmutableList.of();
            this.t = 0;
            this.u = 0;
            this.v = false;
            this.w = false;
            this.x = false;
            this.y = new HashMap<>();
            this.z = new HashSet<>();
        }

        public static ImmutableList<String> f(String[] strArr) {
            ImmutableList.Builder builder = ImmutableList.builder();
            strArr.getClass();
            for (String str : strArr) {
                str.getClass();
                builder.add((ImmutableList.Builder) com.amazon.aps.iva.t5.g0.R(str));
            }
            return builder.build();
        }

        @CanIgnoreReturnValue
        public void a(t0 t0Var) {
            this.y.put(t0Var.b, t0Var);
        }

        public u0 b() {
            return new u0(this);
        }

        @CanIgnoreReturnValue
        public a c() {
            this.y.clear();
            return this;
        }

        @CanIgnoreReturnValue
        public a d(int i) {
            Iterator<t0> it = this.y.values().iterator();
            while (it.hasNext()) {
                if (it.next().b.d == i) {
                    it.remove();
                }
            }
            return this;
        }

        public final void e(u0 u0Var) {
            this.a = u0Var.b;
            this.b = u0Var.c;
            this.c = u0Var.d;
            this.d = u0Var.e;
            this.e = u0Var.f;
            this.f = u0Var.g;
            this.g = u0Var.h;
            this.h = u0Var.i;
            this.i = u0Var.j;
            this.j = u0Var.k;
            this.k = u0Var.l;
            this.l = u0Var.m;
            this.m = u0Var.n;
            this.n = u0Var.o;
            this.o = u0Var.p;
            this.p = u0Var.q;
            this.q = u0Var.r;
            this.r = u0Var.s;
            this.s = u0Var.t;
            this.t = u0Var.u;
            this.u = u0Var.v;
            this.v = u0Var.w;
            this.w = u0Var.x;
            this.x = u0Var.y;
            this.z = new HashSet<>(u0Var.A);
            this.y = new HashMap<>(u0Var.z);
        }

        @CanIgnoreReturnValue
        public a g() {
            this.u = -3;
            return this;
        }

        @CanIgnoreReturnValue
        public a h(int i) {
            this.d = i;
            return this;
        }

        @CanIgnoreReturnValue
        public a i(int i, int i2) {
            this.a = i;
            this.b = i2;
            return this;
        }

        @CanIgnoreReturnValue
        public a j(int i, int i2) {
            this.e = i;
            this.f = i2;
            return this;
        }

        @CanIgnoreReturnValue
        public a k(t0 t0Var) {
            d(t0Var.b.d);
            this.y.put(t0Var.b, t0Var);
            return this;
        }

        public a l(String str) {
            if (str == null) {
                return n(new String[0]);
            }
            return n(str);
        }

        @CanIgnoreReturnValue
        public a m(Context context) {
            CaptioningManager captioningManager;
            String locale;
            int i = com.amazon.aps.iva.t5.g0.a;
            if (i >= 19 && ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
                this.t = 1088;
                Locale locale2 = captioningManager.getLocale();
                if (locale2 != null) {
                    if (i >= 21) {
                        locale = locale2.toLanguageTag();
                    } else {
                        locale = locale2.toString();
                    }
                    this.s = ImmutableList.of(locale);
                }
            }
            return this;
        }

        @CanIgnoreReturnValue
        public a n(String... strArr) {
            this.s = f(strArr);
            return this;
        }

        @CanIgnoreReturnValue
        public a o(int i, boolean z) {
            if (z) {
                this.z.add(Integer.valueOf(i));
            } else {
                this.z.remove(Integer.valueOf(i));
            }
            return this;
        }

        @CanIgnoreReturnValue
        public a p(int i, int i2) {
            this.i = i;
            this.j = i2;
            this.k = true;
            return this;
        }

        @CanIgnoreReturnValue
        public void q(Context context) {
            Display display;
            Point point;
            String F;
            String[] split;
            DisplayManager displayManager;
            int i = com.amazon.aps.iva.t5.g0.a;
            if (i >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                display = displayManager.getDisplay(0);
            } else {
                display = null;
            }
            if (display == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.getClass();
                display = windowManager.getDefaultDisplay();
            }
            if (display.getDisplayId() == 0 && com.amazon.aps.iva.t5.g0.O(context)) {
                if (i < 28) {
                    F = com.amazon.aps.iva.t5.g0.F("sys.display-size");
                } else {
                    F = com.amazon.aps.iva.t5.g0.F("vendor.display-size");
                }
                if (!TextUtils.isEmpty(F)) {
                    try {
                        split = F.trim().split("x", -1);
                    } catch (NumberFormatException unused) {
                    }
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            point = new Point(parseInt, parseInt2);
                            p(point.x, point.y);
                        }
                    }
                    com.amazon.aps.iva.t5.p.c();
                }
                if ("Sony".equals(com.amazon.aps.iva.t5.g0.c) && com.amazon.aps.iva.t5.g0.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                    p(point.x, point.y);
                }
            }
            point = new Point();
            if (i >= 23) {
                Display.Mode mode = display.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            } else if (i >= 17) {
                display.getRealSize(point);
            } else {
                display.getSize(point);
            }
            p(point.x, point.y);
        }

        public a(Context context) {
            this();
            m(context);
            q(context);
        }

        public a(u0 u0Var) {
            e(u0Var);
        }

        public a(Bundle bundle) {
            ImmutableList a;
            String str = u0.H;
            u0 u0Var = u0.B;
            this.a = bundle.getInt(str, u0Var.b);
            this.b = bundle.getInt(u0.I, u0Var.c);
            this.c = bundle.getInt(u0.J, u0Var.d);
            this.d = bundle.getInt(u0.K, u0Var.e);
            this.e = bundle.getInt(u0.L, u0Var.f);
            this.f = bundle.getInt(u0.M, u0Var.g);
            this.g = bundle.getInt(u0.N, u0Var.h);
            this.h = bundle.getInt(u0.O, u0Var.i);
            this.i = bundle.getInt(u0.P, u0Var.j);
            this.j = bundle.getInt(u0.Q, u0Var.k);
            this.k = bundle.getBoolean(u0.R, u0Var.l);
            this.l = ImmutableList.copyOf((String[]) MoreObjects.firstNonNull(bundle.getStringArray(u0.S), new String[0]));
            this.m = bundle.getInt(u0.k0, u0Var.n);
            this.n = f((String[]) MoreObjects.firstNonNull(bundle.getStringArray(u0.C), new String[0]));
            this.o = bundle.getInt(u0.D, u0Var.p);
            this.p = bundle.getInt(u0.T, u0Var.q);
            this.q = bundle.getInt(u0.U, u0Var.r);
            this.r = ImmutableList.copyOf((String[]) MoreObjects.firstNonNull(bundle.getStringArray(u0.V), new String[0]));
            this.s = f((String[]) MoreObjects.firstNonNull(bundle.getStringArray(u0.E), new String[0]));
            this.t = bundle.getInt(u0.F, u0Var.u);
            this.u = bundle.getInt(u0.v0, u0Var.v);
            this.v = bundle.getBoolean(u0.G, u0Var.w);
            this.w = bundle.getBoolean(u0.W, u0Var.x);
            this.x = bundle.getBoolean(u0.X, u0Var.y);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(u0.Y);
            if (parcelableArrayList == null) {
                a = ImmutableList.of();
            } else {
                a = com.amazon.aps.iva.t5.c.a(t0.f, parcelableArrayList);
            }
            this.y = new HashMap<>();
            for (int i = 0; i < a.size(); i++) {
                t0 t0Var = (t0) a.get(i);
                this.y.put(t0Var.b, t0Var);
            }
            int[] iArr = (int[]) MoreObjects.firstNonNull(bundle.getIntArray(u0.Z), new int[0]);
            this.z = new HashSet<>();
            for (int i2 : iArr) {
                this.z.add(Integer.valueOf(i2));
            }
        }
    }
}
