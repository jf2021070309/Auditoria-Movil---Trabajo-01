package com.amazon.aps.iva.md;

import android.content.Context;
import com.amazon.aps.iva.c2.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
/* compiled from: DeleteAccountScreen.kt */
/* loaded from: classes.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.c2.b h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ Context m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.c2.b bVar, String str, String str2, String str3, String str4, Context context) {
        super(1);
        this.h = bVar;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = context;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Integer num) {
        String str;
        int intValue = num.intValue();
        b.C0158b c0158b = (b.C0158b) x.v0(this.h.a(intValue, intValue));
        if (c0158b != null) {
            String str2 = (String) c0158b.a;
            if (com.amazon.aps.iva.yb0.j.a(str2, this.i)) {
                str = this.j;
            } else if (!com.amazon.aps.iva.yb0.j.a(str2, this.k)) {
                str = "";
            } else {
                str = this.l;
            }
            int i = com.amazon.aps.iva.k50.b.a;
            Context context = this.m;
            com.amazon.aps.iva.yb0.j.f(context, "context");
            com.amazon.aps.iva.k50.c cVar = new com.amazon.aps.iva.k50.c(context, "");
            String string = context.getString(R.string.something_wrong);
            com.amazon.aps.iva.yb0.j.e(string, "context.getString(Common…s.string.something_wrong)");
            cVar.s1(str, "", string);
        }
        return q.a;
    }
}
