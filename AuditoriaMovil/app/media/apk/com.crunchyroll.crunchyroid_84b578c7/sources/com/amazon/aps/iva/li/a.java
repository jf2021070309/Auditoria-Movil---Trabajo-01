package com.amazon.aps.iva.li;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.music.MusicAsset;
/* compiled from: WatchMusicAnalyticsData.kt */
/* loaded from: classes.dex */
public final class a {
    public final MusicAsset a;

    static {
        int i = MusicAsset.$stable;
    }

    public a(MusicAsset musicAsset) {
        j.f(musicAsset, "musicAsset");
        this.a = musicAsset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && j.a(this.a, ((a) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WatchMusicAnalyticsData(musicAsset=" + this.a + ")";
    }
}
