package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    private final c a;

    private d(c cVar) {
        this.a = cVar;
    }

    public static Runnable a(c cVar) {
        return new d(cVar);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.e();
    }
}
