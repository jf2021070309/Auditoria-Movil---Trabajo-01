package com.vungle.publisher;

import android.content.DialogInterface;
import com.vungle.publisher.mq;
import java.lang.invoke.LambdaForm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class mr implements DialogInterface.OnClickListener {
    private final mq.a a;

    private mr(mq.a aVar) {
        this.a = aVar;
    }

    public static DialogInterface.OnClickListener a(mq.a aVar) {
        return new mr(aVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    @LambdaForm.Hidden
    public void onClick(DialogInterface dialogInterface, int i) {
        mq.b(this.a, dialogInterface, i);
    }
}
