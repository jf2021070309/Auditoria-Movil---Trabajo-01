package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class pp implements Runnable {
    private final pj a;
    private final String b;
    private final boolean c;

    private pp(pj pjVar, String str, boolean z) {
        this.a = pjVar;
        this.b = str;
        this.c = z;
    }

    public static Runnable a(pj pjVar, String str, boolean z) {
        return new pp(pjVar, str, z);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.b(this.b, this.c);
    }
}
