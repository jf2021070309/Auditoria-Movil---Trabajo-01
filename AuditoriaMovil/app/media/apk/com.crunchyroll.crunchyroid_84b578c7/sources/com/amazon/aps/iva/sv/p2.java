package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.api.etp.playback.model.SkipEvents;
/* compiled from: SkipEventsInteractor.kt */
/* loaded from: classes2.dex */
public final class p2 implements com.amazon.aps.iva.fg.e {
    public final com.amazon.aps.iva.ow.a a;

    public p2(com.amazon.aps.iva.ow.b bVar) {
        this.a = bVar;
    }

    @Override // com.amazon.aps.iva.fg.e
    public final Object getSkipEvents(String str, com.amazon.aps.iva.ob0.d<? super SkipEvents> dVar) {
        return this.a.readItem(str, dVar);
    }
}
