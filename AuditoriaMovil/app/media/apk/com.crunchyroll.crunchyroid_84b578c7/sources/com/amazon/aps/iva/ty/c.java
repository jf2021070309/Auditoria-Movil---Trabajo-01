package com.amazon.aps.iva.ty;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ViewExtensions.kt */
/* loaded from: classes2.dex */
public final class c implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;

    public c(EditText editText, EditText editText2) {
        this.a = editText;
        this.b = editText2;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            this.a.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            View view = this.b;
            Object systemService = view.getContext().getSystemService("input_method");
            j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(view, 1);
        }
    }
}
