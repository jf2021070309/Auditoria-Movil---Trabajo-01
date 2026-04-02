package com.amazon.aps.iva.qw;

import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.api.model.Subtitle;
import java.util.Collection;
/* compiled from: SubtitlesDownloader.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Streams, Collection<? extends Subtitle>> {
    public static final f h = new f();

    public f() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Collection<? extends Subtitle> invoke(Streams streams) {
        Streams streams2 = streams;
        com.amazon.aps.iva.yb0.j.f(streams2, "$this$$receiver");
        return streams2.getSubtitles().values();
    }
}
