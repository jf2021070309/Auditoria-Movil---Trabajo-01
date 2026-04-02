package com.vungle.publisher;

import android.view.MotionEvent;
import android.view.View;
import java.lang.invoke.LambdaForm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class zp implements View.OnTouchListener {
    private static final zp a = new zp();

    private zp() {
    }

    public static View.OnTouchListener a() {
        return a;
    }

    @Override // android.view.View.OnTouchListener
    @LambdaForm.Hidden
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return zo.a(view, motionEvent);
    }
}
