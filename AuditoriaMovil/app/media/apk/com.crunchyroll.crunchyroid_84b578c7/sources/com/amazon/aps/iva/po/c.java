package com.amazon.aps.iva.po;

import com.amazon.aps.iva.kj.c;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.api.model.Subtitle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PlayerStreamsDataMapper.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    @Override // com.amazon.aps.iva.po.b
    public final com.amazon.aps.iva.kj.c a(String str, Streams streams, com.amazon.aps.iva.fg.d dVar) {
        Stream stream;
        Collection<Stream> values;
        Object obj;
        j.f(str, "assetId");
        j.f(streams, "streams");
        j.f(dVar, "videoData");
        c.a a = d.a(str, streams, dVar);
        if (a == null) {
            c.b b = d.b(str, streams, dVar);
            if (b == null) {
                Map<String, Stream> map = streams.getStreams().get("drm_multitrack_text_dash");
                String str2 = null;
                if (map != null && (values = map.values()) != null) {
                    Iterator<T> it = values.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (!m.b0(((Stream) obj).getUrl())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    stream = (Stream) obj;
                } else {
                    stream = null;
                }
                String str3 = (stream == null || (str3 = stream.getUrl()) == null) ? "" : "";
                if (stream != null) {
                    str2 = stream.getVideoToken();
                }
                String str4 = str2;
                String str5 = (String) x.v0(streams.getBifs());
                com.amazon.aps.iva.kj.b bVar = com.amazon.aps.iva.kj.b.DASH;
                Collection<Subtitle> values2 = streams.getSubtitles().values();
                ArrayList arrayList = new ArrayList(r.Y(values2));
                for (Subtitle subtitle : values2) {
                    String locale = subtitle.getLocale();
                    String url = subtitle.getUrl();
                    if (url == null) {
                        url = "";
                    }
                    arrayList.add(new com.amazon.aps.iva.kj.d(locale, url));
                }
                return new c.b(str, str5, bVar, str3, arrayList, str4, null, streams.getSessionState(), 386);
            }
            return b;
        }
        return a;
    }
}
