package com.vungle.publisher;

import com.google.gson.JsonObject;
import java.lang.invoke.LambdaForm;
import rx.functions.Action1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class vm implements Action1 {
    private final vc a;

    private vm(vc vcVar) {
        this.a = vcVar;
    }

    public static Action1 a(vc vcVar) {
        return new vm(vcVar);
    }

    @Override // rx.functions.Action1
    @LambdaForm.Hidden
    public void call(Object obj) {
        this.a.c((JsonObject) obj);
    }
}
