package com.amazon.aps.iva.po;

import com.amazon.aps.iva.kj.c;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.google.android.gms.cast.MediaError;
/* compiled from: PlayerStreamsDataMapper.kt */
/* loaded from: classes2.dex */
public final class a implements b {
    @Override // com.amazon.aps.iva.po.b
    public final com.amazon.aps.iva.kj.c a(String str, Streams streams, com.amazon.aps.iva.fg.d dVar) {
        j.f(str, "assetId");
        j.f(streams, "streams");
        j.f(dVar, "videoData");
        c.a a = d.a(str, streams, dVar);
        if (a == null) {
            c.b b = d.b(str, streams, dVar);
            if (b == null) {
                return new c.a(str, null, null, false, null, MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE);
            }
            return b;
        }
        return a;
    }
}
