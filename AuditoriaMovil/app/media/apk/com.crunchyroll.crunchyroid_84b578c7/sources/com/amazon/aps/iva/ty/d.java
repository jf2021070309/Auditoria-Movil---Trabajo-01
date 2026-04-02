package com.amazon.aps.iva.ty;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.yb0.j;
/* compiled from: KeyboardVisibilityHandler.kt */
/* loaded from: classes2.dex */
public final class d implements b {
    public final Activity b;
    public final a c;

    public d(Activity activity) {
        this.b = activity;
        this.c = new a(activity);
    }

    @Override // com.amazon.aps.iva.ty.b
    public final void a(EditText editText) {
        j.f(editText, "view");
        editText.requestFocus();
        if (editText.hasWindowFocus()) {
            Object systemService = editText.getContext().getSystemService("input_method");
            j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
            return;
        }
        editText.getViewTreeObserver().addOnWindowFocusChangeListener(new c(editText, editText));
    }

    @Override // com.amazon.aps.iva.ty.b
    public final void b(EditText editText) {
        a aVar = this.c;
        aVar.getClass();
        InputMethodManager a = aVar.a();
        j.c(a);
        a.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    @Override // com.amazon.aps.iva.ty.b
    public final void d() {
        this.c.b();
    }

    @Override // com.amazon.aps.iva.ty.b
    public final boolean p0() {
        return k.s(this.b);
    }
}
