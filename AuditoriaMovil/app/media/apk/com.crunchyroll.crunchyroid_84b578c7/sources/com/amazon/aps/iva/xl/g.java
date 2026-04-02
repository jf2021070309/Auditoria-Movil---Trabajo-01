package com.amazon.aps.iva.xl;

import com.google.gson.Gson;
/* compiled from: ChromecastSubtitlesReaderImpl.kt */
/* loaded from: classes2.dex */
public final class g implements f {
    public final com.amazon.aps.iva.ye.j a;
    public final Gson b;

    public g(com.amazon.aps.iva.ye.j jVar, Gson gson) {
        this.a = jVar;
        this.b = gson;
    }

    @Override // com.amazon.aps.iva.xl.f
    public final d a() {
        String str;
        com.amazon.aps.iva.ye.b castSession = this.a.getCastSession();
        if (castSession != null) {
            str = castSession.getMetadataString("subtitles");
        } else {
            str = null;
        }
        return (d) this.b.fromJson(str, (Class<Object>) d.class);
    }
}
