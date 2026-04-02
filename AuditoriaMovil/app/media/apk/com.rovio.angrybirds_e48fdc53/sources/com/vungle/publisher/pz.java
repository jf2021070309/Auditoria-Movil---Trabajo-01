package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class pz implements Runnable {
    private final py a;

    private pz(py pyVar) {
        this.a = pyVar;
    }

    public static Runnable a(py pyVar) {
        return new pz(pyVar);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.a();
    }
}
