package com.amazon.aps.iva.ml;

import com.amazon.aps.iva.es.r;
import com.amazon.aps.iva.yb0.j;
/* compiled from: PlayerSettingsAnalytics.kt */
/* loaded from: classes2.dex */
public final class g implements f {
    public final com.amazon.aps.iva.ds.a a;

    public g(com.amazon.aps.iva.ds.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.ml.f
    public final void b(boolean z) {
        this.a.e(new r("closedCaptions", String.valueOf(!z), String.valueOf(z)));
    }

    @Override // com.amazon.aps.iva.ml.f
    public final void c(boolean z) {
        this.a.e(new r("streamOverCellular", String.valueOf(!z), String.valueOf(z)));
    }

    @Override // com.amazon.aps.iva.ml.f
    public final void e(String str, String str2) {
        j.f(str, "oldValue");
        j.f(str2, "newValue");
        this.a.e(new r("subtitles/CC", str, str2));
    }

    @Override // com.amazon.aps.iva.ml.f
    public final void f(String str, String str2) {
        j.f(str, "oldValue");
        j.f(str2, "newValue");
        this.a.e(new r("audio", str, str2));
    }
}
