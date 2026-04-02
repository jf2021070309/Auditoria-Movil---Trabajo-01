package com.amazon.aps.iva.y30;

import com.ellation.crunchyroll.application.a;
/* compiled from: SettingsListFragment.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
    public static final o h = new o();

    public o() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        int i = com.ellation.crunchyroll.application.a.a;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(String.class, "help_url");
            if (c != null) {
                return (String) c;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }
}
