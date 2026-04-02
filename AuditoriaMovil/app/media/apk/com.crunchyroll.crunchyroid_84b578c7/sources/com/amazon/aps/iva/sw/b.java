package com.amazon.aps.iva.sw;

import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.Channel;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.List;
/* compiled from: ToDownload.kt */
/* loaded from: classes2.dex */
public final class b implements Serializable {
    public final PlayableAsset b;
    public final Playhead c;
    public final Season d;
    public final ContentContainer e;
    public final Panel f;
    public final Channel g;
    public final List<String> h;
    public final List<String> i;

    public b(PlayableAsset playableAsset, Playhead playhead, Season season, ContentContainer contentContainer, Panel panel, Channel channel, List<String> list, List<String> list2) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        com.amazon.aps.iva.yb0.j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        com.amazon.aps.iva.yb0.j.f(channel, "channel");
        com.amazon.aps.iva.yb0.j.f(list, "assetIdsOrder");
        com.amazon.aps.iva.yb0.j.f(list2, "seasonIdsOrder");
        this.b = playableAsset;
        this.c = playhead;
        this.d = season;
        this.e = contentContainer;
        this.f = panel;
        this.g = channel;
        this.h = list;
        this.i = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, bVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, bVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, bVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, bVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, bVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, bVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, bVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, bVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() * 31;
        int i = 0;
        Playhead playhead = this.c;
        if (playhead == null) {
            hashCode = 0;
        } else {
            hashCode = playhead.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Season season = this.d;
        if (season != null) {
            i = season.hashCode();
        }
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.f.hashCode();
        return this.i.hashCode() + defpackage.a.a(this.h, (this.g.hashCode() + ((hashCode4 + ((hashCode3 + ((i2 + i) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ToDownload(asset=" + this.b + ", playhead=" + this.c + ", season=" + this.d + ", content=" + this.e + ", panel=" + this.f + ", channel=" + this.g + ", assetIdsOrder=" + this.h + ", seasonIdsOrder=" + this.i + ")";
    }
}
