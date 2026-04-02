package com.amazon.aps.iva.g8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
/* compiled from: NavDeepLink.kt */
/* loaded from: classes.dex */
public final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.j<? extends List<String>, ? extends String>> {
    public final /* synthetic */ u h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u uVar) {
        super(0);
        this.h = uVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.j<? extends List<String>, ? extends String> invoke() {
        String str = this.h.a;
        if (str != null && Uri.parse(str).getFragment() != null) {
            ArrayList arrayList = new ArrayList();
            String fragment = Uri.parse(str).getFragment();
            StringBuilder sb = new StringBuilder();
            com.amazon.aps.iva.yb0.j.c(fragment);
            u.a(fragment, arrayList, sb);
            String sb2 = sb.toString();
            com.amazon.aps.iva.yb0.j.e(sb2, "fragRegex.toString()");
            return new com.amazon.aps.iva.kb0.j<>(arrayList, sb2);
        }
        return null;
    }
}
