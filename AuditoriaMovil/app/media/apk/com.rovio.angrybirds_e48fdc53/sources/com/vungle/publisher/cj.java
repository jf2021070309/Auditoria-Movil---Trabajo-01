package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class cj implements Runnable {
    private final ci a;

    private cj(ci ciVar) {
        this.a = ciVar;
    }

    public static Runnable a(ci ciVar) {
        return new cj(ciVar);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.b();
    }
}
