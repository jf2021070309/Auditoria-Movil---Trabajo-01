package com.amazon.aps.iva.p3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class y0 {
    public final e a;

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class a extends e {
        public final Window a;
        public final a0 b;

        public a(Window window, a0 a0Var) {
            this.a = window;
            this.b = a0Var;
        }

        @Override // com.amazon.aps.iva.p3.y0.e
        public final int a() {
            return 0;
        }

        @Override // com.amazon.aps.iva.p3.y0.e
        public final void b(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 8) {
                                this.b.a.a();
                            }
                        } else {
                            h(2);
                        }
                    } else {
                        h(4);
                    }
                }
            }
        }

        @Override // com.amazon.aps.iva.p3.y0.e
        public final void f(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        i(2048);
                        h(4096);
                        return;
                    }
                    return;
                }
                i(4096);
                h(2048);
                return;
            }
            i(6144);
        }

        @Override // com.amazon.aps.iva.p3.y0.e
        public final void g() {
            for (int i = 1; i <= 256; i <<= 1) {
                if ((8 & i) != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 8) {
                                this.b.a.b();
                            }
                        } else {
                            i(2);
                        }
                    } else {
                        i(4);
                        this.a.clearFlags(1024);
                    }
                }
            }
        }

        public final void h(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public final void i(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // com.amazon.aps.iva.p3.y0.e
        public final boolean c() {
            if ((this.a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.p3.y0.e
        public final void e(boolean z) {
            if (z) {
                Window window = this.a;
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                h(8192);
                return;
            }
            i(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // com.amazon.aps.iva.p3.y0.e
        public final void d(boolean z) {
            if (z) {
                Window window = this.a;
                window.clearFlags(134217728);
                window.addFlags(Integer.MIN_VALUE);
                h(16);
                return;
            }
            i(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public int a() {
            throw null;
        }

        public void b(int i) {
            throw null;
        }

        public boolean c() {
            throw null;
        }

        public void d(boolean z) {
            throw null;
        }

        public void e(boolean z) {
            throw null;
        }

        public void f(int i) {
            throw null;
        }

        public void g() {
            throw null;
        }
    }

    @Deprecated
    public y0(WindowInsetsController windowInsetsController) {
        this.a = new d(windowInsetsController, new a0(windowInsetsController));
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {
        public final WindowInsetsController a;
        public final a0 b;
        public final Window c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.view.Window r2, com.amazon.aps.iva.p3.a0 r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = com.amazon.aps.iva.f8.n.c(r2)
                r1.<init>(r0, r3)
                r1.c = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p3.y0.d.<init>(android.view.Window, com.amazon.aps.iva.p3.a0):void");
        }

        @Override // com.amazon.aps.iva.p3.y0.e
        @SuppressLint({"WrongConstant"})
        public final int a() {
            int systemBarsBehavior;
            systemBarsBehavior = this.a.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // com.amazon.aps.iva.p3.y0.e
        public final void b(int i) {
            if ((i & 8) != 0) {
                this.b.a.a();
            }
            this.a.hide(i & (-9));
        }

        @Override // com.amazon.aps.iva.p3.y0.e
        public final boolean c() {
            int systemBarsAppearance;
            systemBarsAppearance = this.a.getSystemBarsAppearance();
            if ((systemBarsAppearance & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.p3.y0.e
        public final void d(boolean z) {
            WindowInsetsController windowInsetsController = this.a;
            Window window = this.c;
            if (z) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                windowInsetsController.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }

        @Override // com.amazon.aps.iva.p3.y0.e
        public final void e(boolean z) {
            WindowInsetsController windowInsetsController = this.a;
            Window window = this.c;
            if (z) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }

        @Override // com.amazon.aps.iva.p3.y0.e
        public final void f(int i) {
            this.a.setSystemBarsBehavior(i);
        }

        @Override // com.amazon.aps.iva.p3.y0.e
        public final void g() {
            this.b.a.b();
            this.a.show(0);
        }

        public d(WindowInsetsController windowInsetsController, a0 a0Var) {
            new com.amazon.aps.iva.x.h();
            this.a = windowInsetsController;
            this.b = a0Var;
        }
    }

    public y0(Window window, View view) {
        a0 a0Var = new a0(view);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(window, a0Var);
        } else {
            this.a = new c(window, a0Var);
        }
    }
}
