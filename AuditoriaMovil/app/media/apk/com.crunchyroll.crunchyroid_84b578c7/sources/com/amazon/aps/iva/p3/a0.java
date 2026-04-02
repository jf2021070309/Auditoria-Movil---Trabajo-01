package com.amazon.aps.iva.p3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: SoftwareKeyboardControllerCompat.java */
/* loaded from: classes.dex */
public final class a0 {
    public final a a;

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* loaded from: classes.dex */
    public static class a extends c {
        public final View a;

        public a(View view) {
            this.a = view;
        }

        public void a() {
            View view = this.a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public void b() {
            View view;
            View view2 = this.a;
            if (view2 == null) {
                return;
            }
            if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
                view = view2.getRootView().findFocus();
            } else {
                view2.requestFocus();
                view = view2;
            }
            if (view == null) {
                view = view2.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new com.amazon.aps.iva.y1.b(view, 1));
            }
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    public a0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new b(view);
        } else {
            this.a = new a(view);
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        public final View b;
        public final WindowInsetsController c;

        public b(View view) {
            super(view);
            this.b = view;
        }

        @Override // com.amazon.aps.iva.p3.a0.a
        public final void a() {
            int ime;
            View view = this.b;
            WindowInsetsController windowInsetsController = this.c;
            if (windowInsetsController == null) {
                if (view != null) {
                    windowInsetsController = view.getWindowInsetsController();
                } else {
                    windowInsetsController = null;
                }
            }
            if (windowInsetsController != null) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                com.amazon.aps.iva.y1.d dVar = new com.amazon.aps.iva.y1.d(atomicBoolean, 1);
                windowInsetsController.addOnControllableInsetsChangedListener(dVar);
                if (!atomicBoolean.get() && view != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(dVar);
                ime = WindowInsets.Type.ime();
                windowInsetsController.hide(ime);
                return;
            }
            super.a();
        }

        @Override // com.amazon.aps.iva.p3.a0.a
        public final void b() {
            int ime;
            View view = this.b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.c;
            if (windowInsetsController == null) {
                if (view != null) {
                    windowInsetsController = view.getWindowInsetsController();
                } else {
                    windowInsetsController = null;
                }
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
                return;
            }
            super.b();
        }

        public b(WindowInsetsController windowInsetsController) {
            super(null);
            this.c = windowInsetsController;
        }
    }

    @Deprecated
    public a0(WindowInsetsController windowInsetsController) {
        this.a = new b(windowInsetsController);
    }
}
