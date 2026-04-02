package com.amazon.aps.iva.y1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ b(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
        }
    }
}
