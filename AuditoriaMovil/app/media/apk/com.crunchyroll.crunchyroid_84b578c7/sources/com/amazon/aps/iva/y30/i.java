package com.amazon.aps.iva.y30;

import android.content.Intent;
/* compiled from: SettingsAnalytics.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.us.f implements h {
    public final com.amazon.aps.iva.ds.a g;
    public final com.amazon.aps.iva.xb0.a<String> h;

    /* compiled from: SettingsAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Intent, Boolean> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(Intent intent) {
            Intent intent2 = intent;
            com.amazon.aps.iva.yb0.j.f(intent2, "it");
            return Boolean.valueOf(com.amazon.aps.iva.gr.n.w(intent2));
        }
    }

    public i(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.xb0.a<String> aVar2, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar3) {
        super(aVar3, null, a.h, 2);
        this.g = aVar;
        this.h = aVar2;
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void G(com.amazon.aps.iva.wg.b bVar, com.amazon.aps.iva.wg.b bVar2) {
        com.amazon.aps.iva.yb0.j.f(bVar, "oldValue");
        com.amazon.aps.iva.yb0.j.f(bVar2, "newValue");
        this.g.e(new com.amazon.aps.iva.es.r("syncQuality", bVar.a().b(), bVar2.a().b()));
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void I(boolean z) {
        this.g.e(new com.amazon.aps.iva.es.r("Show Mature Content", String.valueOf(!z), String.valueOf(z)));
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void J(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "preferenceName");
        this.g.e(new com.amazon.aps.iva.es.w(new com.amazon.aps.iva.ks.a(str, com.amazon.aps.iva.ls.a.SETTINGS.name(), null, ""), 4));
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.g.c(defpackage.i.s(com.amazon.aps.iva.ls.a.SETTINGS, f, null, null, null, new com.amazon.aps.iva.is.a[0], 28));
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void i(boolean z) {
        com.amazon.aps.iva.es.r rVar = new com.amazon.aps.iva.es.r("Sync Using Cellular", String.valueOf(!z), String.valueOf(z));
        com.amazon.aps.iva.ds.a aVar = this.g;
        aVar.e(rVar);
        aVar.a(this.h.invoke(), com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j("wifiDownloadOnly", Boolean.valueOf(z))));
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void j() {
        this.g.e(new com.amazon.aps.iva.es.j());
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void k(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "preferenceName");
        this.g.e(new com.amazon.aps.iva.es.j(new com.amazon.aps.iva.ks.a(str, com.amazon.aps.iva.ls.a.SETTINGS.name(), null, ""), 7));
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void z(com.amazon.aps.iva.d40.a aVar, com.amazon.aps.iva.d40.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(aVar2, "newValue");
        this.g.e(new com.amazon.aps.iva.es.r("maturityLevel", aVar.getValue(), aVar2.getValue()));
    }
}
