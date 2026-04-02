package com.amazon.aps.iva.us;

import com.ellation.crunchyroll.model.Channel;
/* compiled from: EtpAnalytics.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, Channel> {
    public static final h h = new h();

    public h() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Channel invoke(String str) {
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(str2, "it");
        return ((com.amazon.aps.iva.x50.c) com.ellation.crunchyroll.application.e.b().c()).c(str2);
    }
}
