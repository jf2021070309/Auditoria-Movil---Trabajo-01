package com.amazon.aps.iva.kl;

import android.content.Context;
import com.crunchyroll.crunchyroid.R;
/* compiled from: UpNextFormatter.kt */
/* loaded from: classes2.dex */
public final class t implements s {
    public final Context a;
    public final com.amazon.aps.iva.mt.l b;

    public t(Context context, com.amazon.aps.iva.mt.m mVar) {
        this.a = context;
        this.b = mVar;
    }

    @Override // com.amazon.aps.iva.kl.s
    public final String a(long j) {
        String string = this.a.getString(R.string.up_next_in, Integer.valueOf((int) com.amazon.aps.iva.gr.n.x(j)));
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(R.stri…ext_in, remainingSeconds)");
        return string;
    }

    @Override // com.amazon.aps.iva.kl.s
    public final String b(com.amazon.aps.iva.kj.e eVar) {
        String str = "";
        String str2 = eVar.i;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = eVar.g;
        if (str3 == null) {
            str3 = "";
        }
        String a = this.b.a(str2, str3);
        if (com.amazon.aps.iva.oe0.m.b0(a)) {
            String str4 = eVar.c;
            if (str4 != null) {
                str = str4;
            }
            return str;
        }
        return a;
    }
}
