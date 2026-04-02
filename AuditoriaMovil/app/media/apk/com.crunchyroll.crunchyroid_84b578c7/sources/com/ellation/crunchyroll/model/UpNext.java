package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: UpNext.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b#\u0010\u001d¨\u0006&"}, d2 = {"Lcom/ellation/crunchyroll/model/UpNext;", "Lcom/ellation/crunchyroll/model/PlayheadTimeProvider;", "Lcom/ellation/crunchyroll/model/Panel;", "component1", "", "component2", "", "component3", "component4", "panel", "playheadSec", "neverWatched", "fullyWatched", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Lcom/ellation/crunchyroll/model/Panel;", "getPanel", "()Lcom/ellation/crunchyroll/model/Panel;", "J", "getPlayheadSec", "()J", "Z", "getNeverWatched", "()Z", "getFullyWatched", "Lcom/amazon/aps/iva/x50/t;", "getResourceType", "()Lcom/amazon/aps/iva/x50/t;", "resourceType", "isEpisode", "<init>", "(Lcom/ellation/crunchyroll/model/Panel;JZZ)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UpNext implements PlayheadTimeProvider {
    public static final int $stable = 8;
    @SerializedName("fully_watched")
    private final boolean fullyWatched;
    @SerializedName("never_watched")
    private final boolean neverWatched;
    @SerializedName("panel")
    private final Panel panel;
    @SerializedName("playhead")
    private final long playheadSec;

    public UpNext(Panel panel, long j, boolean z, boolean z2) {
        j.f(panel, "panel");
        this.panel = panel;
        this.playheadSec = j;
        this.neverWatched = z;
        this.fullyWatched = z2;
    }

    public static /* synthetic */ UpNext copy$default(UpNext upNext, Panel panel, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            panel = upNext.panel;
        }
        if ((i & 2) != 0) {
            j = upNext.playheadSec;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = upNext.neverWatched;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = upNext.fullyWatched;
        }
        return upNext.copy(panel, j2, z3, z2);
    }

    public final Panel component1() {
        return this.panel;
    }

    public final long component2() {
        return this.playheadSec;
    }

    public final boolean component3() {
        return this.neverWatched;
    }

    public final boolean component4() {
        return this.fullyWatched;
    }

    public final UpNext copy(Panel panel, long j, boolean z, boolean z2) {
        j.f(panel, "panel");
        return new UpNext(panel, j, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpNext)) {
            return false;
        }
        UpNext upNext = (UpNext) obj;
        if (j.a(this.panel, upNext.panel) && this.playheadSec == upNext.playheadSec && this.neverWatched == upNext.neverWatched && this.fullyWatched == upNext.fullyWatched) {
            return true;
        }
        return false;
    }

    public final boolean getFullyWatched() {
        return this.fullyWatched;
    }

    public final boolean getNeverWatched() {
        return this.neverWatched;
    }

    public final Panel getPanel() {
        return this.panel;
    }

    @Override // com.ellation.crunchyroll.model.PlayheadTimeProvider
    public long getPlayheadSec() {
        return this.playheadSec;
    }

    public final t getResourceType() {
        return this.panel.getResourceType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = i.a(this.playheadSec, this.panel.hashCode() * 31, 31);
        boolean z = this.neverWatched;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (a + i2) * 31;
        boolean z2 = this.fullyWatched;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    public final boolean isEpisode() {
        if (getResourceType() == t.EPISODE) {
            return true;
        }
        return false;
    }

    public String toString() {
        Panel panel = this.panel;
        long j = this.playheadSec;
        boolean z = this.neverWatched;
        boolean z2 = this.fullyWatched;
        return "UpNext(panel=" + panel + ", playheadSec=" + j + ", neverWatched=" + z + ", fullyWatched=" + z2 + ")";
    }

    public /* synthetic */ UpNext(Panel panel, long j, boolean z, boolean z2, int i, e eVar) {
        this(panel, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
    }
}
