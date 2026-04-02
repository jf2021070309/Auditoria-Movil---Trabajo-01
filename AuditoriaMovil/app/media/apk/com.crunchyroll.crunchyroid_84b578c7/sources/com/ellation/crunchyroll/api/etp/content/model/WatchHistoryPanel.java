package com.ellation.crunchyroll.api.etp.content.model;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: WatchHistoryPanel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/WatchHistoryPanel;", "", "playhead", "", "panel", "Lcom/ellation/crunchyroll/model/Panel;", "fullyWatched", "", "(JLcom/ellation/crunchyroll/model/Panel;Z)V", "getFullyWatched", "()Z", "getPanel", "()Lcom/ellation/crunchyroll/model/Panel;", "getPlayhead", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchHistoryPanel {
    public static final int $stable = 8;
    @SerializedName("fully_watched")
    private final boolean fullyWatched;
    @SerializedName("panel")
    private final Panel panel;
    @SerializedName("playhead")
    private final long playhead;

    public WatchHistoryPanel() {
        this(0L, null, false, 7, null);
    }

    public static /* synthetic */ WatchHistoryPanel copy$default(WatchHistoryPanel watchHistoryPanel, long j, Panel panel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = watchHistoryPanel.playhead;
        }
        if ((i & 2) != 0) {
            panel = watchHistoryPanel.panel;
        }
        if ((i & 4) != 0) {
            z = watchHistoryPanel.fullyWatched;
        }
        return watchHistoryPanel.copy(j, panel, z);
    }

    public final long component1() {
        return this.playhead;
    }

    public final Panel component2() {
        return this.panel;
    }

    public final boolean component3() {
        return this.fullyWatched;
    }

    public final WatchHistoryPanel copy(long j, Panel panel, boolean z) {
        return new WatchHistoryPanel(j, panel, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchHistoryPanel)) {
            return false;
        }
        WatchHistoryPanel watchHistoryPanel = (WatchHistoryPanel) obj;
        if (this.playhead == watchHistoryPanel.playhead && j.a(this.panel, watchHistoryPanel.panel) && this.fullyWatched == watchHistoryPanel.fullyWatched) {
            return true;
        }
        return false;
    }

    public final boolean getFullyWatched() {
        return this.fullyWatched;
    }

    public final Panel getPanel() {
        return this.panel;
    }

    public final long getPlayhead() {
        return this.playhead;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.playhead) * 31;
        Panel panel = this.panel;
        if (panel == null) {
            hashCode = 0;
        } else {
            hashCode = panel.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        boolean z = this.fullyWatched;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public String toString() {
        long j = this.playhead;
        Panel panel = this.panel;
        boolean z = this.fullyWatched;
        return "WatchHistoryPanel(playhead=" + j + ", panel=" + panel + ", fullyWatched=" + z + ")";
    }

    public WatchHistoryPanel(long j, Panel panel, boolean z) {
        this.playhead = j;
        this.panel = panel;
        this.fullyWatched = z;
    }

    public /* synthetic */ WatchHistoryPanel(long j, Panel panel, boolean z, int i, e eVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : panel, (i & 4) != 0 ? false : z);
    }
}
