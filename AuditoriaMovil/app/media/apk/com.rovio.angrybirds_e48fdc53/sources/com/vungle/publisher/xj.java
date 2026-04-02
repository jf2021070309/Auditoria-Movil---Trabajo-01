package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import rx.functions.Func1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class xj implements Func1 {
    private static final xj a = new xj();

    private xj() {
    }

    public static Func1 a() {
        return a;
    }

    @Override // rx.functions.Func1
    @LambdaForm.Hidden
    public Object call(Object obj) {
        Boolean valueOf;
        wc wcVar = (wc) obj;
        valueOf = Boolean.valueOf(r1 != null);
        return valueOf;
    }
}
