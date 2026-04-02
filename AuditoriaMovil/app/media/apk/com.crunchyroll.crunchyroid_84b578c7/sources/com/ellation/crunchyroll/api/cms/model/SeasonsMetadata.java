package com.ellation.crunchyroll.api.cms.model;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: SeasonsMetadata.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/api/cms/model/SeasonsMetadata;", "Ljava/io/Serializable;", "_versionsConsidered", "", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "versionsConsidered", "getVersionsConsidered", "()Z", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/ellation/crunchyroll/api/cms/model/SeasonsMetadata;", "equals", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SeasonsMetadata implements Serializable {
    public static final int $stable = 0;
    @SerializedName("versions_considered")
    private final Boolean _versionsConsidered;

    public SeasonsMetadata() {
        this(null, 1, null);
    }

    private final Boolean component1() {
        return this._versionsConsidered;
    }

    public static /* synthetic */ SeasonsMetadata copy$default(SeasonsMetadata seasonsMetadata, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = seasonsMetadata._versionsConsidered;
        }
        return seasonsMetadata.copy(bool);
    }

    public final SeasonsMetadata copy(Boolean bool) {
        return new SeasonsMetadata(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SeasonsMetadata) && j.a(this._versionsConsidered, ((SeasonsMetadata) obj)._versionsConsidered)) {
            return true;
        }
        return false;
    }

    public final boolean getVersionsConsidered() {
        Boolean bool = this._versionsConsidered;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this._versionsConsidered;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        Boolean bool = this._versionsConsidered;
        return "SeasonsMetadata(_versionsConsidered=" + bool + ")";
    }

    public SeasonsMetadata(Boolean bool) {
        this._versionsConsidered = bool;
    }

    public /* synthetic */ SeasonsMetadata(Boolean bool, int i, e eVar) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }
}
