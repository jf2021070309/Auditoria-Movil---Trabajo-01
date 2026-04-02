package com.amazon.aps.iva.y1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: SoftwareKeyboardControllerCompat.java */
/* loaded from: classes.dex */
public final class c {
    public final a a;

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* loaded from: classes.dex */
    public static class a extends C0881c {
        public final View a;

        public a(AndroidComposeView androidComposeView) {
            this.a = androidComposeView;
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
                view.post(new com.amazon.aps.iva.y1.b(view, 0));
            }
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        public final View b;

        public b(AndroidComposeView androidComposeView) {
            super(androidComposeView);
            this.b = androidComposeView;
        }

        @Override // com.amazon.aps.iva.y1.c.a
        public final void a() {
            WindowInsetsController windowInsetsController;
            int ime;
            View view = this.b;
            if (view != null) {
                windowInsetsController = view.getWindowInsetsController();
            } else {
                windowInsetsController = null;
            }
            if (windowInsetsController != null) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                d dVar = new d(atomicBoolean, 0);
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

        @Override // com.amazon.aps.iva.y1.c.a
        public final void b() {
            WindowInsetsController windowInsetsController;
            int ime;
            View view = this.b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            if (view != null) {
                windowInsetsController = view.getWindowInsetsController();
            } else {
                windowInsetsController = null;
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
                return;
            }
            super.b();
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* renamed from: com.amazon.aps.iva.y1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0881c {
    }

    public c(AndroidComposeView androidComposeView) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new b(androidComposeView);
        } else {
            this.a = new a(androidComposeView);
        }
    }
}
