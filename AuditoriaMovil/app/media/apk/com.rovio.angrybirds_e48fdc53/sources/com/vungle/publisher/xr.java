package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import java.util.List;
import rx.functions.Func1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class xr implements Func1 {
    private final dr a;

    private xr(dr drVar) {
        this.a = drVar;
    }

    public static Func1 a(dr drVar) {
        return new xr(drVar);
    }

    @Override // rx.functions.Func1
    @LambdaForm.Hidden
    public Object call(Object obj) {
        return xq.b(this.a, (List) obj);
    }
}
