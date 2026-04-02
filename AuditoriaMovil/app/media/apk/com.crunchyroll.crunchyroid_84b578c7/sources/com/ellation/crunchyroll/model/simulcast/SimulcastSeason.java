package com.ellation.crunchyroll.model.simulcast;

import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.FormattableSeason;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: SimulcastSeason.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/model/simulcast/SimulcastSeason;", "Ljava/io/Serializable;", "Lcom/ellation/crunchyroll/model/FormattableSeason;", "id", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SimulcastSeason implements Serializable, FormattableSeason {
    public static final int $stable = 0;
    private final String id;
    private final String title;

    public SimulcastSeason(String str, String str2) {
        j.f(str, "id");
        j.f(str2, "title");
        this.id = str;
        this.title = str2;
    }

    public static /* synthetic */ SimulcastSeason copy$default(SimulcastSeason simulcastSeason, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simulcastSeason.id;
        }
        if ((i & 2) != 0) {
            str2 = simulcastSeason.title;
        }
        return simulcastSeason.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final SimulcastSeason copy(String str, String str2) {
        j.f(str, "id");
        j.f(str2, "title");
        return new SimulcastSeason(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimulcastSeason)) {
            return false;
        }
        SimulcastSeason simulcastSeason = (SimulcastSeason) obj;
        if (j.a(this.id, simulcastSeason.id) && j.a(this.title, simulcastSeason.title)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return e.b("SimulcastSeason(id=", this.id, ", title=", this.title, ")");
    }

    public /* synthetic */ SimulcastSeason(String str, String str2, int i, com.amazon.aps.iva.yb0.e eVar) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
