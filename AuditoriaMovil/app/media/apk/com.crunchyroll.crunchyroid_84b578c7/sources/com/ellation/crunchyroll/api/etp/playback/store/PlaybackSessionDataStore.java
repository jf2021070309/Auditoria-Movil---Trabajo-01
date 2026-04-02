package com.ellation.crunchyroll.api.etp.playback.store;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.xe.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.application.e;
import kotlin.Metadata;
/* compiled from: PlaybackSessionDataStore.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0006\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionDataStore;", "Lcom/amazon/aps/iva/xe/a;", "Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionData;", "", "getInternalCacheableId", "(Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionData;)Ljava/lang/String;", "internalCacheableId", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public final class PlaybackSessionDataStore extends a<PlaybackSessionData> {
    public static final int $stable = 0;
    public static final PlaybackSessionDataStore INSTANCE = new PlaybackSessionDataStore();

    private PlaybackSessionDataStore() {
        super(PlaybackSessionData.class, e.b(), "active_playback_sessions", GsonHolder.getInstance());
    }

    @Override // com.amazon.aps.iva.xe.a
    public String getInternalCacheableId(PlaybackSessionData playbackSessionData) {
        j.f(playbackSessionData, "<this>");
        return playbackSessionData.getContentId();
    }
}
