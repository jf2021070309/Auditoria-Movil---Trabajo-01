package com.vungle.publisher;

import android.view.View;
import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class oq implements View.OnClickListener {
    private final op a;

    private oq(op opVar) {
        this.a = opVar;
    }

    public static View.OnClickListener a(op opVar) {
        return new oq(opVar);
    }

    @Override // android.view.View.OnClickListener
    @LambdaForm.Hidden
    public void onClick(View view) {
        this.a.a(view);
    }
}
