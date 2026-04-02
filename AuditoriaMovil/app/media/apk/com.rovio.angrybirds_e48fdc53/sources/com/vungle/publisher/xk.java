package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import rx.functions.Func1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class xk implements Func1 {
    private final xg a;

    private xk(xg xgVar) {
        this.a = xgVar;
    }

    public static Func1 a(xg xgVar) {
        return new xk(xgVar);
    }

    @Override // rx.functions.Func1
    @LambdaForm.Hidden
    public Object call(Object obj) {
        return this.a.a((wc) obj);
    }
}
