package com.amazon.aps.iva.yd;

import android.content.DialogInterface;
import android.view.View;
import com.amazon.aps.iva.g70.f;
import com.amazon.aps.iva.ku.e;
import com.crunchyroll.auth.emailmandatory.EmailMandatoryActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.yb0.l] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                EmailMandatoryActivity emailMandatoryActivity = (EmailMandatoryActivity) obj;
                int i3 = EmailMandatoryActivity.o;
                com.amazon.aps.iva.yb0.j.f(emailMandatoryActivity, "this$0");
                emailMandatoryActivity.k.a().o0();
                return;
            case 1:
                com.amazon.aps.iva.xb0.a aVar = (com.amazon.aps.iva.xb0.a) obj;
                e.a aVar2 = com.amazon.aps.iva.ku.e.i;
                com.amazon.aps.iva.yb0.j.f(aVar, "$onDiscardAction");
                aVar.invoke();
                return;
            default:
                com.amazon.aps.iva.g70.f fVar = (com.amazon.aps.iva.g70.f) obj;
                f.a aVar3 = com.amazon.aps.iva.g70.f.e;
                com.amazon.aps.iva.yb0.j.f(fVar, "this$0");
                Object invoke = fVar.d.invoke();
                com.amazon.aps.iva.yb0.j.c(invoke);
                com.amazon.aps.iva.bo.e.g(fVar, "negative_button_result", (View) invoke, null);
                return;
        }
    }
}
