package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import rx.functions.Action1;
/* loaded from: classes4.dex */
final /* synthetic */ class xt implements Action1 {
    private final xq a;
    private final dr b;

    private xt(xq xqVar, dr drVar) {
        this.a = xqVar;
        this.b = drVar;
    }

    public static Action1 a(xq xqVar, dr drVar) {
        return new xt(xqVar, drVar);
    }

    @Override // rx.functions.Action1
    @LambdaForm.Hidden
    public void call(Object obj) {
        this.a.a(this.b, (Throwable) obj);
    }
}
