package com.vungle.publisher.env;

import java.lang.invoke.LambdaForm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {
    private final r a;
    private final String b;

    private s(r rVar, String str) {
        this.a = rVar;
        this.b = str;
    }

    public static Runnable a(r rVar, String str) {
        return new s(rVar, str);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.e(this.b);
    }
}
