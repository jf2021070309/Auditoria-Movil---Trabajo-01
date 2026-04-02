package com.amazon.aps.iva.b40;

import android.content.DialogInterface;
import android.view.View;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.g70.f;
import com.ellation.crunchyroll.presentation.settings.donotsell.SettingsDoNotSellActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Object obj, int i) {
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
                SettingsDoNotSellActivity settingsDoNotSellActivity = (SettingsDoNotSellActivity) obj;
                l<Object>[] lVarArr = SettingsDoNotSellActivity.p;
                com.amazon.aps.iva.yb0.j.f(settingsDoNotSellActivity, "this$0");
                ((g) settingsDoNotSellActivity.n.getValue()).I1();
                return;
            default:
                com.amazon.aps.iva.g70.f fVar = (com.amazon.aps.iva.g70.f) obj;
                f.a aVar = com.amazon.aps.iva.g70.f.e;
                com.amazon.aps.iva.yb0.j.f(fVar, "this$0");
                Object invoke = fVar.c.invoke();
                com.amazon.aps.iva.yb0.j.c(invoke);
                com.amazon.aps.iva.bo.e.g(fVar, "positive_button_result", (View) invoke, ((com.amazon.aps.iva.g70.g) fVar.b.getValue(fVar, com.amazon.aps.iva.g70.f.f[0])).f);
                return;
        }
    }
}
