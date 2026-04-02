package com.ellation.crunchyroll.api.model;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: ContinueWatchingPanel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/api/model/ContinueWatchingPanel;", "", "playhead", "", "isFullyWatched", "", "isNew", "panel", "Lcom/ellation/crunchyroll/model/Panel;", "(JZZLcom/ellation/crunchyroll/model/Panel;)V", "()Z", "getPanel", "()Lcom/ellation/crunchyroll/model/Panel;", "getPlayhead", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContinueWatchingPanel {
    public static final int $stable = 8;
    @SerializedName("fully_watched")
    private final boolean isFullyWatched;
    @SerializedName(AppSettingsData.STATUS_NEW)
    private final boolean isNew;
    @SerializedName("panel")
    private final Panel panel;
    @SerializedName("playhead")
    private final long playhead;

    public ContinueWatchingPanel() {
        this(0L, false, false, null, 15, null);
    }

    public static /* synthetic */ ContinueWatchingPanel copy$default(ContinueWatchingPanel continueWatchingPanel, long j, boolean z, boolean z2, Panel panel, int i, Object obj) {
        if ((i & 1) != 0) {
            j = continueWatchingPanel.playhead;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            z = continueWatchingPanel.isFullyWatched;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = continueWatchingPanel.isNew;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            panel = continueWatchingPanel.panel;
        }
        return continueWatchingPanel.copy(j2, z3, z4, panel);
    }

    public final long component1() {
        return this.playhead;
    }

    public final boolean component2() {
        return this.isFullyWatched;
    }

    public final boolean component3() {
        return this.isNew;
    }

    public final Panel component4() {
        return this.panel;
    }

    public final ContinueWatchingPanel copy(long j, boolean z, boolean z2, Panel panel) {
        return new ContinueWatchingPanel(j, z, z2, panel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContinueWatchingPanel)) {
            return false;
        }
        ContinueWatchingPanel continueWatchingPanel = (ContinueWatchingPanel) obj;
        if (this.playhead == continueWatchingPanel.playhead && this.isFullyWatched == continueWatchingPanel.isFullyWatched && this.isNew == continueWatchingPanel.isNew && j.a(this.panel, continueWatchingPanel.panel)) {
            return true;
        }
        return false;
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
        boolean z = this.isFullyWatched;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z2 = this.isNew;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int i4 = (i3 + i) * 31;
        Panel panel = this.panel;
        if (panel == null) {
            hashCode = 0;
        } else {
            hashCode = panel.hashCode();
        }
        return i4 + hashCode;
    }

    public final boolean isFullyWatched() {
        return this.isFullyWatched;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public String toString() {
        long j = this.playhead;
        boolean z = this.isFullyWatched;
        boolean z2 = this.isNew;
        Panel panel = this.panel;
        return "ContinueWatchingPanel(playhead=" + j + ", isFullyWatched=" + z + ", isNew=" + z2 + ", panel=" + panel + ")";
    }

    public ContinueWatchingPanel(long j, boolean z, boolean z2, Panel panel) {
        this.playhead = j;
        this.isFullyWatched = z;
        this.isNew = z2;
        this.panel = panel;
    }

    public /* synthetic */ ContinueWatchingPanel(long j, boolean z, boolean z2, Panel panel, int i, e eVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : panel);
    }
}
