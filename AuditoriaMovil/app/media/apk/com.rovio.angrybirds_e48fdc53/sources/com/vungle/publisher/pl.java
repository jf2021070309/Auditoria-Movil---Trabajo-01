package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class pl implements Runnable {
    private final pj a;
    private final bq b;

    private pl(pj pjVar, bq bqVar) {
        this.a = pjVar;
        this.b = bqVar;
    }

    public static Runnable a(pj pjVar, bq bqVar) {
        return new pl(pjVar, bqVar);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.a(this.b);
    }
}
