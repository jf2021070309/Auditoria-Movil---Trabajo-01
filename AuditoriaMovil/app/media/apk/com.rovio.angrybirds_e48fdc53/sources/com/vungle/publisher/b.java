package com.vungle.publisher;

import com.vungle.publisher.InitializationEventListener;
import java.lang.invoke.LambdaForm;
/* loaded from: classes4.dex */
final /* synthetic */ class b implements Runnable {
    private final InitializationEventListener.a a;

    private b(InitializationEventListener.a aVar) {
        this.a = aVar;
    }

    public static Runnable a(InitializationEventListener.a aVar) {
        return new b(aVar);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.a();
    }
}
