package com.ellation.crunchyroll.model.watchlist;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: WatchlistPanel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ellation/crunchyroll/model/watchlist/WatchlistPanel;", "", "playheadSec", "", "isFullyWatched", "", "isFavorite", "isNew", "neverWatched", "panel", "Lcom/ellation/crunchyroll/model/Panel;", "(JZZZZLcom/ellation/crunchyroll/model/Panel;)V", "()Z", "getNeverWatched", "getPanel", "()Lcom/ellation/crunchyroll/model/Panel;", "getPlayheadSec", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchlistPanel {
    public static final int $stable = 8;
    @SerializedName("is_favorite")
    private final boolean isFavorite;
    @SerializedName("fully_watched")
    private final boolean isFullyWatched;
    @SerializedName(AppSettingsData.STATUS_NEW)
    private final boolean isNew;
    @SerializedName("never_watched")
    private final boolean neverWatched;
    @SerializedName("panel")
    private final Panel panel;
    @SerializedName("playhead")
    private final long playheadSec;

    public WatchlistPanel() {
        this(0L, false, false, false, false, null, 63, null);
    }

    public static /* synthetic */ WatchlistPanel copy$default(WatchlistPanel watchlistPanel, long j, boolean z, boolean z2, boolean z3, boolean z4, Panel panel, int i, Object obj) {
        long j2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Panel panel2;
        if ((i & 1) != 0) {
            j2 = watchlistPanel.playheadSec;
        } else {
            j2 = j;
        }
        if ((i & 2) != 0) {
            z5 = watchlistPanel.isFullyWatched;
        } else {
            z5 = z;
        }
        if ((i & 4) != 0) {
            z6 = watchlistPanel.isFavorite;
        } else {
            z6 = z2;
        }
        if ((i & 8) != 0) {
            z7 = watchlistPanel.isNew;
        } else {
            z7 = z3;
        }
        if ((i & 16) != 0) {
            z8 = watchlistPanel.neverWatched;
        } else {
            z8 = z4;
        }
        if ((i & 32) != 0) {
            panel2 = watchlistPanel.panel;
        } else {
            panel2 = panel;
        }
        return watchlistPanel.copy(j2, z5, z6, z7, z8, panel2);
    }

    public final long component1() {
        return this.playheadSec;
    }

    public final boolean component2() {
        return this.isFullyWatched;
    }

    public final boolean component3() {
        return this.isFavorite;
    }

    public final boolean component4() {
        return this.isNew;
    }

    public final boolean component5() {
        return this.neverWatched;
    }

    public final Panel component6() {
        return this.panel;
    }

    public final WatchlistPanel copy(long j, boolean z, boolean z2, boolean z3, boolean z4, Panel panel) {
        return new WatchlistPanel(j, z, z2, z3, z4, panel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchlistPanel)) {
            return false;
        }
        WatchlistPanel watchlistPanel = (WatchlistPanel) obj;
        if (this.playheadSec == watchlistPanel.playheadSec && this.isFullyWatched == watchlistPanel.isFullyWatched && this.isFavorite == watchlistPanel.isFavorite && this.isNew == watchlistPanel.isNew && this.neverWatched == watchlistPanel.neverWatched && j.a(this.panel, watchlistPanel.panel)) {
            return true;
        }
        return false;
    }

    public final boolean getNeverWatched() {
        return this.neverWatched;
    }

    public final Panel getPanel() {
        return this.panel;
    }

    public final long getPlayheadSec() {
        return this.playheadSec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.playheadSec) * 31;
        boolean z = this.isFullyWatched;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z2 = this.isFavorite;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.isNew;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z4 = this.neverWatched;
        if (!z4) {
            i = z4 ? 1 : 0;
        }
        int i8 = (i7 + i) * 31;
        Panel panel = this.panel;
        if (panel == null) {
            hashCode = 0;
        } else {
            hashCode = panel.hashCode();
        }
        return i8 + hashCode;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final boolean isFullyWatched() {
        return this.isFullyWatched;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public String toString() {
        long j = this.playheadSec;
        boolean z = this.isFullyWatched;
        boolean z2 = this.isFavorite;
        boolean z3 = this.isNew;
        boolean z4 = this.neverWatched;
        Panel panel = this.panel;
        return "WatchlistPanel(playheadSec=" + j + ", isFullyWatched=" + z + ", isFavorite=" + z2 + ", isNew=" + z3 + ", neverWatched=" + z4 + ", panel=" + panel + ")";
    }

    public WatchlistPanel(long j, boolean z, boolean z2, boolean z3, boolean z4, Panel panel) {
        this.playheadSec = j;
        this.isFullyWatched = z;
        this.isFavorite = z2;
        this.isNew = z3;
        this.neverWatched = z4;
        this.panel = panel;
    }

    public /* synthetic */ WatchlistPanel(long j, boolean z, boolean z2, boolean z3, boolean z4, Panel panel, int i, e eVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? null : panel);
    }
}
