package com.amazon.aps.iva.vz;

import android.content.Intent;
import com.amazon.aps.iva.es.k;
import com.amazon.aps.iva.es.r;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.js.b0;
import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.us.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: BrowseAllAnalytics.kt */
/* loaded from: classes2.dex */
public final class c extends f implements b {
    public final com.amazon.aps.iva.ds.a g;

    /* compiled from: BrowseAllAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<Intent, Boolean> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(Intent intent) {
            Intent intent2 = intent;
            j.f(intent2, "it");
            return Boolean.valueOf(n.w(intent2));
        }
    }

    public c(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar2) {
        super(aVar2, null, a.h, 2);
        this.g = aVar;
    }

    @Override // com.amazon.aps.iva.vz.b
    public final void D(String str) {
        j.f(str, FirebaseAnalytics.Param.CHARACTER);
        this.g.e(new r(new com.amazon.aps.iva.ks.a(str, com.amazon.aps.iva.ls.a.BROWSE.toString(), b0.TOP_RIGHT, "")));
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.g.c(i.s(com.amazon.aps.iva.ls.a.BROWSE, f, null, null, null, new com.amazon.aps.iva.is.a[0], 28));
    }

    @Override // com.amazon.aps.iva.vz.b
    public final void e(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ls.a aVar) {
        j.f(aVar, "screen");
        this.g.e(new k(a.C0456a.c(aVar, bVar)));
    }
}
