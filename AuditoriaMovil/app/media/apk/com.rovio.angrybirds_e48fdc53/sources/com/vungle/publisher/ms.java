package com.vungle.publisher;

import android.content.DialogInterface;
import com.vungle.publisher.mq;
import java.lang.invoke.LambdaForm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class ms implements DialogInterface.OnClickListener {
    private final mq.a a;

    private ms(mq.a aVar) {
        this.a = aVar;
    }

    public static DialogInterface.OnClickListener a(mq.a aVar) {
        return new ms(aVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    @LambdaForm.Hidden
    public void onClick(DialogInterface dialogInterface, int i) {
        mq.a(this.a, dialogInterface, i);
    }
}
