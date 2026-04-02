package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import rx.functions.Func1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class vl implements Func1 {
    private final vc a;
    private final String b;

    private vl(vc vcVar, String str) {
        this.a = vcVar;
        this.b = str;
    }

    public static Func1 a(vc vcVar, String str) {
        return new vl(vcVar, str);
    }

    @Override // rx.functions.Func1
    @LambdaForm.Hidden
    public Object call(Object obj) {
        return this.a.a(this.b, (Boolean) obj);
    }
}
