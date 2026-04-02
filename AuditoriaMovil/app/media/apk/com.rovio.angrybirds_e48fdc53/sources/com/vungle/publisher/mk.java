package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.mj;
import java.lang.invoke.LambdaForm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class mk implements Runnable {
    private final mj.a a;
    private final Context b;

    private mk(mj.a aVar, Context context) {
        this.a = aVar;
        this.b = context;
    }

    public static Runnable a(mj.a aVar, Context context) {
        return new mk(aVar, context);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.b(this.b);
    }
}
