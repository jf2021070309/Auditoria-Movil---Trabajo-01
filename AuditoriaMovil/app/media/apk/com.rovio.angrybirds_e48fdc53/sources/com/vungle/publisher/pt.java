package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class pt implements Runnable {
    private final pj a;
    private final bp b;

    private pt(pj pjVar, bp bpVar) {
        this.a = pjVar;
        this.b = bpVar;
    }

    public static Runnable a(pj pjVar, bp bpVar) {
        return new pt(pjVar, bpVar);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.a(this.b);
    }
}
