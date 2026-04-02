package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class pr implements Runnable {
    private final pj a;
    private final bj b;

    private pr(pj pjVar, bj bjVar) {
        this.a = pjVar;
        this.b = bjVar;
    }

    public static Runnable a(pj pjVar, bj bjVar) {
        return new pr(pjVar, bjVar);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.a(this.b);
    }
}
