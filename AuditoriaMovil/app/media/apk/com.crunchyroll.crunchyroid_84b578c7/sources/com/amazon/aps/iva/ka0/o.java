package com.amazon.aps.iva.ka0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.amazon.aps.iva.ka0.p;
/* compiled from: MuxDataSdk.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class o extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.p<Context, View, d0<View>> {
    public o(p.b bVar) {
        super(2, bVar, p.b.class, "defaultUiDelegate", "defaultUiDelegate(Landroid/content/Context;Landroid/view/View;)Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final d0<View> invoke(Context context, View view) {
        Context context2 = context;
        View view2 = view;
        com.amazon.aps.iva.yb0.j.f(context2, "p0");
        ((p.b) this.receiver).getClass();
        Activity activity = null;
        if (view2 != null) {
            if (context2 instanceof Activity) {
                activity = (Activity) context2;
            }
            return new b(activity, view2);
        }
        return new b(context2, null);
    }
}
