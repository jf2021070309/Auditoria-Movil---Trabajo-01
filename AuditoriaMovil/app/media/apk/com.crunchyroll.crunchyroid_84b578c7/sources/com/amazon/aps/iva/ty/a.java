package com.amazon.aps.iva.ty;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.amazon.aps.iva.q.e1;
import com.amazon.aps.iva.yb0.j;
/* compiled from: KeyboardUtils.kt */
/* loaded from: classes2.dex */
public final class a {
    public final Activity a;
    public EditText b;

    public a(Activity activity) {
        j.f(activity, "activity");
        this.a = activity;
    }

    public final InputMethodManager a() {
        boolean z;
        Activity activity = this.a;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object systemService = activity.getSystemService("input_method");
            j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
        return null;
    }

    public final void b() {
        boolean z;
        Activity activity = this.a;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            z = true;
        } else {
            z = false;
        }
        if (z && activity.getCurrentFocus() != null && a() != null) {
            InputMethodManager a = a();
            j.c(a);
            View currentFocus = activity.getCurrentFocus();
            j.c(currentFocus);
            a.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        EditText editText = this.b;
        if (editText != null) {
            e1 e1Var = new e1(editText, 6);
            View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
            editText.setOnFocusChangeListener(null);
            e1Var.run();
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
    }

    public final void c(EditText editText) {
        InputMethodManager a;
        j.f(editText, "editText");
        this.b = editText;
        if (editText.requestFocus() && (a = a()) != null && !a.showSoftInput(this.b, 1)) {
            this.a.getWindow().setSoftInputMode(4);
        }
    }
}
