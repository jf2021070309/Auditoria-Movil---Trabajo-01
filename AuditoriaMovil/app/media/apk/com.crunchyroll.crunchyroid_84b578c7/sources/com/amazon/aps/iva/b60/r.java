package com.amazon.aps.iva.b60;

import android.content.Context;
import com.crunchyroll.crunchyroid.R;
/* compiled from: WatchlistItemStateProvider.kt */
/* loaded from: classes2.dex */
public final class r implements q {
    public final Context a;
    public final com.amazon.aps.iva.mt.n b;

    public r(Context context, com.amazon.aps.iva.mt.n nVar) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = context;
        this.b = nVar;
    }

    @Override // com.amazon.aps.iva.b60.q
    public final String a(k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "watchlistItem");
        String c = this.b.c(kVar.g);
        int i = (kVar.getPlayheadSec() > 0L ? 1 : (kVar.getPlayheadSec() == 0L ? 0 : -1));
        boolean z = kVar.f;
        boolean z2 = kVar.c;
        if (i <= 0 && !z2 && !z) {
            return b(R.string.up_next, c);
        }
        if (kVar.getPlayheadSec() > 0 && !z2) {
            return b(R.string.continue_text, c);
        }
        if (z2 && !z) {
            return b(R.string.watch_again, c);
        }
        if (kVar.getPlayheadSec() <= 0 && z) {
            return b(R.string.start_watching, c);
        }
        return "";
    }

    public final String b(int i, String str) {
        Context context = this.a;
        String string = context.getString(i);
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(watchlistStateResId)");
        if (!com.amazon.aps.iva.oe0.m.b0(str)) {
            String string2 = context.getString(R.string.watchlist_item_state_format, string, str);
            com.amazon.aps.iva.yb0.j.e(string2, "{\n            context.ge…t\n            )\n        }");
            return string2;
        }
        return string;
    }
}
