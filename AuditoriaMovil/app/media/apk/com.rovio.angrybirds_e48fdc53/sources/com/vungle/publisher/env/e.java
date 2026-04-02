package com.vungle.publisher.env;

import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class e implements Runnable {
    private final d a;
    private final AndroidDevice b;

    private e(d dVar, AndroidDevice androidDevice) {
        this.a = dVar;
        this.b = androidDevice;
    }

    public static Runnable a(d dVar, AndroidDevice androidDevice) {
        return new e(dVar, androidDevice);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.f(this.b);
    }
}
