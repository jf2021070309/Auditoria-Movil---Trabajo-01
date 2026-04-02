package com.vungle.publisher;

import android.widget.ImageView;
import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class os implements Runnable {
    private final op a;
    private final Float b;
    private final ImageView c;

    private os(op opVar, Float f, ImageView imageView) {
        this.a = opVar;
        this.b = f;
        this.c = imageView;
    }

    public static Runnable a(op opVar, Float f, ImageView imageView) {
        return new os(opVar, f, imageView);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.a(this.b, this.c);
    }
}
