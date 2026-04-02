package com.vungle.publisher;

import android.view.MotionEvent;
import android.view.View;
import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class or implements View.OnTouchListener {
    private final op a;

    private or(op opVar) {
        this.a = opVar;
    }

    public static View.OnTouchListener a(op opVar) {
        return new or(opVar);
    }

    @Override // android.view.View.OnTouchListener
    @LambdaForm.Hidden
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.a(view, motionEvent);
    }
}
