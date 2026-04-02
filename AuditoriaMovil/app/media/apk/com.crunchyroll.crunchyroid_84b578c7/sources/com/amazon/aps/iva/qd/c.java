package com.amazon.aps.iva.qd;

import android.content.Context;
import com.amazon.aps.iva.cx.t;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: WhatsAppHelp.kt */
/* loaded from: classes.dex */
public final class c implements a {
    public final Context a;
    public final b b;

    public c(Context context, t tVar) {
        this.a = context;
        this.b = tVar;
    }

    @Override // com.amazon.aps.iva.qd.a
    public final void a() {
        String str;
        int i = com.amazon.aps.iva.k50.b.a;
        if (true & true) {
            str = "";
        } else {
            str = null;
        }
        Context context = this.a;
        j.f(context, "context");
        j.f(str, "fallbackTitle");
        com.amazon.aps.iva.k50.c cVar = new com.amazon.aps.iva.k50.c(context, str);
        String a = this.b.a();
        String string = context.getString(R.string.something_wrong);
        j.e(string, "context.getString(Common…s.string.something_wrong)");
        cVar.s1(a, "", string);
    }

    @Override // com.amazon.aps.iva.qd.a
    public final boolean isEnabled() {
        return this.b.isEnabled();
    }
}
