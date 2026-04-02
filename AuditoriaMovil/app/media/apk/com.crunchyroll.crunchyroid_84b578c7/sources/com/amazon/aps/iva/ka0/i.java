package com.amazon.aps.iva.ka0;

import android.content.Context;
import android.view.View;
import com.amazon.aps.iva.ka0.p;
/* compiled from: MuxDataSdk.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class i extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.p<Context, View, String> {
    public i(p.b bVar) {
        super(2, bVar, p.b.class, "generatePlayerId", "generatePlayerId(Landroid/content/Context;Landroid/view/View;)Ljava/lang/String;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final String invoke(Context context, View view) {
        Object obj;
        Context context2 = context;
        View view2 = view;
        com.amazon.aps.iva.yb0.j.f(context2, "p0");
        ((p.b) this.receiver).getClass();
        StringBuilder sb = new StringBuilder();
        String canonicalName = context2.getClass().getCanonicalName();
        com.amazon.aps.iva.yb0.j.c(canonicalName);
        sb.append(canonicalName);
        if (view2 != null) {
            obj = Integer.valueOf(view2.getId());
        } else {
            obj = "audio";
        }
        sb.append(obj);
        return sb.toString();
    }
}
