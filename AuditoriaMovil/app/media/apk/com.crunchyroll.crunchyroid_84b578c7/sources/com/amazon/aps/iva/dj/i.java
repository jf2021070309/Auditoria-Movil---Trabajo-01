package com.amazon.aps.iva.dj;

import com.amazon.aps.iva.js.z;
import com.amazon.aps.iva.x50.t;
/* compiled from: PlayerAnalyticsUtils.kt */
/* loaded from: classes.dex */
public final class i implements h {
    public final com.amazon.aps.iva.tl.a a;

    public i(com.amazon.aps.iva.tl.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.dj.h
    public final com.amazon.aps.iva.ls.a a(String str) {
        if (com.amazon.aps.iva.yb0.j.a(str, t.MUSIC_VIDEO.toString())) {
            return com.amazon.aps.iva.ls.a.WATCH_MUSIC_VIDEO;
        }
        if (com.amazon.aps.iva.yb0.j.a(str, t.CONCERT.toString())) {
            return com.amazon.aps.iva.ls.a.WATCH_CONCERT;
        }
        if (com.amazon.aps.iva.yb0.j.a(str, t.EPISODE.toString())) {
            return com.amazon.aps.iva.ls.a.EPISODE;
        }
        if (com.amazon.aps.iva.yb0.j.a(str, t.MOVIE.toString())) {
            return com.amazon.aps.iva.ls.a.MOVIE;
        }
        return com.amazon.aps.iva.ls.a.MEDIA;
    }

    @Override // com.amazon.aps.iva.dj.h
    public final z b(String str) {
        if (str != null && this.a.a(str)) {
            return z.b.a;
        }
        return z.a.a;
    }
}
