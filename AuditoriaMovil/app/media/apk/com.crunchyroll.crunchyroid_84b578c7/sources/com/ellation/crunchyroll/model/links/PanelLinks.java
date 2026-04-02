package com.ellation.crunchyroll.model.links;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.model.Href;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PanelLinks.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/model/links/PanelLinks;", "Ljava/io/Serializable;", "streams", "Lcom/ellation/crunchyroll/api/model/Href;", "(Lcom/ellation/crunchyroll/api/model/Href;)V", "getStreams", "()Lcom/ellation/crunchyroll/api/model/Href;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PanelLinks implements Serializable {
    public static final int $stable = 0;
    @SerializedName("streams")
    private final Href streams;

    public PanelLinks() {
        this(null, 1, null);
    }

    public static /* synthetic */ PanelLinks copy$default(PanelLinks panelLinks, Href href, int i, Object obj) {
        if ((i & 1) != 0) {
            href = panelLinks.streams;
        }
        return panelLinks.copy(href);
    }

    public final Href component1() {
        return this.streams;
    }

    public final PanelLinks copy(Href href) {
        return new PanelLinks(href);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PanelLinks) && j.a(this.streams, ((PanelLinks) obj).streams)) {
            return true;
        }
        return false;
    }

    public final Href getStreams() {
        return this.streams;
    }

    public int hashCode() {
        Href href = this.streams;
        if (href == null) {
            return 0;
        }
        return href.hashCode();
    }

    public String toString() {
        Href href = this.streams;
        return "PanelLinks(streams=" + href + ")";
    }

    public PanelLinks(Href href) {
        this.streams = href;
    }

    public /* synthetic */ PanelLinks(Href href, int i, e eVar) {
        this((i & 1) != 0 ? null : href);
    }
}
