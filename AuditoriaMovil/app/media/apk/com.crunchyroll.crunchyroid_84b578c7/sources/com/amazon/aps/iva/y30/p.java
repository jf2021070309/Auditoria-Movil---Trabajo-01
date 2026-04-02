package com.amazon.aps.iva.y30;

import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.common.Scopes;
/* compiled from: SettingsListFragment.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, String> {
    public final /* synthetic */ t h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar) {
        super(1);
        this.h = tVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final String invoke(String str) {
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(str2, Scopes.EMAIL);
        String string = this.h.getString(R.string.customer_support_url, str2);
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.customer_support_url, email)");
        return string;
    }
}
