package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import rx.functions.Action1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class nt implements Action1 {
    private final ns a;

    private nt(ns nsVar) {
        this.a = nsVar;
    }

    public static Action1 a(ns nsVar) {
        return new nt(nsVar);
    }

    @Override // rx.functions.Action1
    @LambdaForm.Hidden
    public void call(Object obj) {
        this.a.a((Long) obj);
    }
}
