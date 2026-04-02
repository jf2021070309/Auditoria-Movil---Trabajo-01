package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class pm implements Runnable {
    private final pj a;
    private final String b;

    private pm(pj pjVar, String str) {
        this.a = pjVar;
        this.b = str;
    }

    public static Runnable a(pj pjVar, String str) {
        return new pm(pjVar, str);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.b(this.b);
    }
}
