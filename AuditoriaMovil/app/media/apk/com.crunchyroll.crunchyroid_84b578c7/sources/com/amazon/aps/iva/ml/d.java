package com.amazon.aps.iva.ml;

import com.amazon.aps.iva.dj.g;
import com.amazon.aps.iva.es.q;
import com.amazon.aps.iva.js.a0;
import com.amazon.aps.iva.ks.w;
import com.amazon.aps.iva.yb0.j;
/* compiled from: InternalPlayerSettingsAnalytics.kt */
/* loaded from: classes2.dex */
public final class d implements c, f {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.xb0.a<w> b;
    public final f c;

    public d(g gVar, com.amazon.aps.iva.ds.a aVar, g.C0198g c0198g) {
        this.a = aVar;
        this.b = c0198g;
        this.c = gVar;
    }

    @Override // com.amazon.aps.iva.ml.c
    public final void a(boolean z) {
        this.a.e(new q(a0.AUTOPLAY, String.valueOf(!z), String.valueOf(z), this.b.invoke()));
    }

    @Override // com.amazon.aps.iva.ml.f
    public final void b(boolean z) {
        this.c.b(z);
    }

    @Override // com.amazon.aps.iva.ml.f
    public final void c(boolean z) {
        this.c.c(z);
    }

    @Override // com.amazon.aps.iva.ml.c
    public final void d(com.amazon.aps.iva.rl.a aVar, com.amazon.aps.iva.rl.a aVar2) {
        String valueOf;
        j.f(aVar, "oldQuality");
        j.f(aVar2, "newQuality");
        a0 a0Var = a0.VIDEO_QUALITY;
        String str = "auto";
        if (aVar.d()) {
            valueOf = "auto";
        } else {
            valueOf = String.valueOf(aVar.b());
        }
        if (!aVar2.d()) {
            str = String.valueOf(aVar2.b());
        }
        this.a.e(new q(a0Var, valueOf, str, this.b.invoke()));
    }

    @Override // com.amazon.aps.iva.ml.f
    public final void e(String str, String str2) {
        j.f(str, "oldValue");
        j.f(str2, "newValue");
        this.c.e(str, str2);
    }

    @Override // com.amazon.aps.iva.ml.f
    public final void f(String str, String str2) {
        j.f(str, "oldValue");
        j.f(str2, "newValue");
        this.c.f(str, str2);
    }
}
