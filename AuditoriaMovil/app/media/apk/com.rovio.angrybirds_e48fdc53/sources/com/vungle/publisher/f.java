package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    private final c a;

    private f(c cVar) {
        this.a = cVar;
    }

    public static Runnable a(c cVar) {
        return new f(cVar);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.c();
    }
}
