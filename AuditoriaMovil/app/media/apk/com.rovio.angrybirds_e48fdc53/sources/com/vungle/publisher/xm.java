package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import rx.functions.Action1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class xm implements Action1 {
    private final xg a;

    private xm(xg xgVar) {
        this.a = xgVar;
    }

    public static Action1 a(xg xgVar) {
        return new xm(xgVar);
    }

    @Override // rx.functions.Action1
    @LambdaForm.Hidden
    public void call(Object obj) {
        this.a.a((Throwable) obj);
    }
}
