package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class po implements Runnable {
    private final pj a;
    private final av b;

    private po(pj pjVar, av avVar) {
        this.a = pjVar;
        this.b = avVar;
    }

    public static Runnable a(pj pjVar, av avVar) {
        return new po(pjVar, avVar);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.a(this.b);
    }
}
