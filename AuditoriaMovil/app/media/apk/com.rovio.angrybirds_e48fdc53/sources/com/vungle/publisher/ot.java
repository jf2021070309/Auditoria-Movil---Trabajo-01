package com.vungle.publisher;

import android.view.View;
import android.widget.ImageView;
import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class ot implements View.OnClickListener {
    private final op a;
    private final ImageView b;

    private ot(op opVar, ImageView imageView) {
        this.a = opVar;
        this.b = imageView;
    }

    public static View.OnClickListener a(op opVar, ImageView imageView) {
        return new ot(opVar, imageView);
    }

    @Override // android.view.View.OnClickListener
    @LambdaForm.Hidden
    public void onClick(View view) {
        this.a.a(this.b, view);
    }
}
