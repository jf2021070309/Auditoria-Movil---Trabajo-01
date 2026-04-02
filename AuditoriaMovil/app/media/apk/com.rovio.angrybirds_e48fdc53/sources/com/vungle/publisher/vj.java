package com.vungle.publisher;

import com.google.gson.JsonObject;
import java.lang.invoke.LambdaForm;
import rx.functions.Action1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class vj implements Action1 {
    private final vc a;
    private final String b;

    private vj(vc vcVar, String str) {
        this.a = vcVar;
        this.b = str;
    }

    public static Action1 a(vc vcVar, String str) {
        return new vj(vcVar, str);
    }

    @Override // rx.functions.Action1
    @LambdaForm.Hidden
    public void call(Object obj) {
        this.a.b(this.b, (JsonObject) obj);
    }
}
