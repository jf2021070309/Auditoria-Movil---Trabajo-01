package com.amazon.aps.iva.wv;

import android.content.Context;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.model.Channel;
/* compiled from: DownloadModelCache.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.xe.a<Channel> implements g {
    public h(Context context) {
        super(Channel.class, context, "channel_cache", GsonHolder.getInstance());
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(Channel channel) {
        Channel channel2 = channel;
        com.amazon.aps.iva.yb0.j.f(channel2, "<this>");
        return channel2.getId();
    }
}
