package com.ellation.crunchyroll.cast.session.audio;

import com.amazon.aps.iva.ye.j;
import com.amazon.aps.iva.ze.b;
import com.amazon.aps.iva.ze.c;
import com.google.gson.Gson;
import kotlin.Metadata;
/* compiled from: ChromecastAudioReaderImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ellation/crunchyroll/cast/session/audio/ChromecastAudioReaderImpl;", "Lcom/amazon/aps/iva/ze/c;", "Lcom/amazon/aps/iva/ye/j;", "sessionManagerProvider", "Lcom/amazon/aps/iva/ye/j;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "Lcom/amazon/aps/iva/ze/b;", "getAudioVersions", "()Lcom/amazon/aps/iva/ze/b;", "audioVersions", "<init>", "(Lcom/amazon/aps/iva/ye/j;Lcom/google/gson/Gson;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ChromecastAudioReaderImpl implements c {
    private final Gson gson;
    private final j sessionManagerProvider;

    public ChromecastAudioReaderImpl(j jVar, Gson gson) {
        com.amazon.aps.iva.yb0.j.f(jVar, "sessionManagerProvider");
        com.amazon.aps.iva.yb0.j.f(gson, "gson");
        this.sessionManagerProvider = jVar;
        this.gson = gson;
    }

    @Override // com.amazon.aps.iva.ze.c
    public b getAudioVersions() {
        String str;
        Gson gson = this.gson;
        com.amazon.aps.iva.ye.b castSession = this.sessionManagerProvider.getCastSession();
        if (castSession != null) {
            str = castSession.getMetadataString("versions");
        } else {
            str = null;
        }
        return (b) gson.fromJson(str, (Class<Object>) b.class);
    }
}
