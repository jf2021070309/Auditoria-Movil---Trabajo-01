package com.vungle.publisher;

import android.view.View;
import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class mz implements View.OnClickListener {
    private final my a;

    private mz(my myVar) {
        this.a = myVar;
    }

    public static View.OnClickListener a(my myVar) {
        return new mz(myVar);
    }

    @Override // android.view.View.OnClickListener
    @LambdaForm.Hidden
    public void onClick(View view) {
        this.a.a(view);
    }
}
