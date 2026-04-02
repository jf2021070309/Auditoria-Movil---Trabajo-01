package com.vungle.publisher;

import android.view.View;
import android.view.WindowInsets;
import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class nl implements View.OnApplyWindowInsetsListener {
    private final nk a;
    private final View b;

    private nl(nk nkVar, View view) {
        this.a = nkVar;
        this.b = view;
    }

    public static View.OnApplyWindowInsetsListener a(nk nkVar, View view) {
        return new nl(nkVar, view);
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    @LambdaForm.Hidden
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.a.a(this.b, view, windowInsets);
    }
}
