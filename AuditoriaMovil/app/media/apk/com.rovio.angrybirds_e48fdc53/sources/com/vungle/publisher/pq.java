package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class pq implements Runnable {
    private final pj a;
    private final bm b;

    private pq(pj pjVar, bm bmVar) {
        this.a = pjVar;
        this.b = bmVar;
    }

    public static Runnable a(pj pjVar, bm bmVar) {
        return new pq(pjVar, bmVar);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.a(this.b);
    }
}
