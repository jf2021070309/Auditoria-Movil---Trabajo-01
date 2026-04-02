package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class ps implements Runnable {
    private final pj a;
    private final bo b;

    private ps(pj pjVar, bo boVar) {
        this.a = pjVar;
        this.b = boVar;
    }

    public static Runnable a(pj pjVar, bo boVar) {
        return new ps(pjVar, boVar);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.a(this.b);
    }
}
