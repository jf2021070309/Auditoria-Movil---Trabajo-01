package com.amazon.aps.iva.ml;

import com.amazon.aps.iva.ks.w;
import com.amazon.aps.iva.ye.j;
/* compiled from: PlaybackMediaProvider.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.dj.d {
    public final com.amazon.aps.iva.dj.d a;
    public final a b;
    public final j c;

    public e(com.amazon.aps.iva.dj.e eVar, b bVar, j jVar) {
        this.a = eVar;
        this.b = bVar;
        this.c = jVar;
    }

    @Override // com.amazon.aps.iva.dj.d
    public final w a() {
        if (this.c.isCastConnected()) {
            return this.b.a();
        }
        return this.a.a();
    }
}
