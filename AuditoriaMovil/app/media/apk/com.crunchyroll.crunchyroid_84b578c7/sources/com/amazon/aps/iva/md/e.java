package com.amazon.aps.iva.md;

import android.content.Context;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
/* compiled from: DeleteAccountScreen.kt */
/* loaded from: classes.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ Context h;
    public final /* synthetic */ String i;
    public final /* synthetic */ q1<Boolean> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, q1<Boolean> q1Var) {
        super(0);
        this.h = context;
        this.i = str;
        this.j = q1Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        Context context = this.h;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.k50.c cVar = new com.amazon.aps.iva.k50.c(context, "");
        String string = context.getString(R.string.something_wrong);
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(Common…s.string.something_wrong)");
        cVar.s1(this.i, "", string);
        this.j.setValue(Boolean.FALSE);
        return q.a;
    }
}
