package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class pk implements Runnable {
    private final pj a;
    private final String b;
    private final boolean c;

    private pk(pj pjVar, String str, boolean z) {
        this.a = pjVar;
        this.b = str;
        this.c = z;
    }

    public static Runnable a(pj pjVar, String str, boolean z) {
        return new pk(pjVar, str, z);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.c(this.b, this.c);
    }
}
