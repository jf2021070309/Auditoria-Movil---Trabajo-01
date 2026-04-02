package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import rx.functions.Func1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class xh implements Func1 {
    private final xg a;

    private xh(xg xgVar) {
        this.a = xgVar;
    }

    public static Func1 a(xg xgVar) {
        return new xh(xgVar);
    }

    @Override // rx.functions.Func1
    @LambdaForm.Hidden
    public Object call(Object obj) {
        return this.a.b((String) obj);
    }
}
