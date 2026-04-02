package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import rx.functions.Action1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class vk implements Action1 {
    private final vc a;
    private final String b;

    private vk(vc vcVar, String str) {
        this.a = vcVar;
        this.b = str;
    }

    public static Action1 a(vc vcVar, String str) {
        return new vk(vcVar, str);
    }

    @Override // rx.functions.Action1
    @LambdaForm.Hidden
    public void call(Object obj) {
        this.a.a(this.b, (Throwable) obj);
    }
}
