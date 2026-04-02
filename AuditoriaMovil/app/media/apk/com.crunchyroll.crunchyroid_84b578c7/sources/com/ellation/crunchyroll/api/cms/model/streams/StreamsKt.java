package com.ellation.crunchyroll.api.cms.model.streams;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: Streams.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*&\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003\u0012\u0004\u0012\u00020\u00060\u0002¨\u0006\u0007"}, d2 = {"toStream", "Lcom/ellation/crunchyroll/api/cms/model/streams/Streams;", "Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "", "", "Lcom/ellation/crunchyroll/api/cms/model/streams/Stream;", "Lcom/ellation/crunchyroll/api/cms/model/streams/StreamsMeta;", "api_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StreamsKt {
    public static final Streams toStream(ContentApiResponse<Map<String, Map<String, Stream>>, StreamsMeta> contentApiResponse) {
        j.f(contentApiResponse, "<this>");
        return new Streams(contentApiResponse.getMeta().getMediaId(), (Map) x.t0(contentApiResponse.getData()), contentApiResponse.getMeta().getAudioLocale(), contentApiResponse.getMeta().getSubtitles(), contentApiResponse.getMeta().getCaptions(), contentApiResponse.getMeta().getBifs(), null, null, 192, null);
    }
}
