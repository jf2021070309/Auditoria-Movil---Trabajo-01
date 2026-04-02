package com.amazon.aps.iva.tl;

import android.content.DialogInterface;
import com.amazon.aps.iva.tl.k;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                k kVar = (k) obj;
                k.a aVar = k.k;
                com.amazon.aps.iva.yb0.j.f(kVar, "this$0");
                kVar.di().A1();
                return;
            default:
                com.amazon.aps.iva.xb0.a aVar2 = (com.amazon.aps.iva.xb0.a) obj;
                com.amazon.aps.iva.yb0.j.f(aVar2, "$onTermsAcceptedClick");
                aVar2.invoke();
                return;
        }
    }
}
