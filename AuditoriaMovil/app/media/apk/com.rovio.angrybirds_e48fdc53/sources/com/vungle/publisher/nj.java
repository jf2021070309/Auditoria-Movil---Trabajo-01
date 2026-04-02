package com.vungle.publisher;

import android.view.View;
import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class nj implements View.OnSystemUiVisibilityChangeListener {
    private final ni a;
    private final p b;

    private nj(ni niVar, p pVar) {
        this.a = niVar;
        this.b = pVar;
    }

    public static View.OnSystemUiVisibilityChangeListener a(ni niVar, p pVar) {
        return new nj(niVar, pVar);
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    @LambdaForm.Hidden
    public void onSystemUiVisibilityChange(int i) {
        this.a.a(this.b, i);
    }
}
