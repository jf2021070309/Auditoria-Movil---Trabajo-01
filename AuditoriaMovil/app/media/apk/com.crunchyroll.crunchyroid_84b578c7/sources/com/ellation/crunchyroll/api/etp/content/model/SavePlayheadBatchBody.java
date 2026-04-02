package com.ellation.crunchyroll.api.etp.content.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: SavePlayheadBatchBody.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/SavePlayheadBatchBody;", "", "batch", "", "", "Lcom/ellation/crunchyroll/api/etp/content/model/PlayheadBatchEntry;", "(Ljava/util/Map;)V", "getBatch", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SavePlayheadBatchBody {
    public static final int $stable = 8;
    @SerializedName("batch")
    private final Map<String, PlayheadBatchEntry> batch;

    public SavePlayheadBatchBody(Map<String, PlayheadBatchEntry> map) {
        j.f(map, "batch");
        this.batch = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavePlayheadBatchBody copy$default(SavePlayheadBatchBody savePlayheadBatchBody, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = savePlayheadBatchBody.batch;
        }
        return savePlayheadBatchBody.copy(map);
    }

    public final Map<String, PlayheadBatchEntry> component1() {
        return this.batch;
    }

    public final SavePlayheadBatchBody copy(Map<String, PlayheadBatchEntry> map) {
        j.f(map, "batch");
        return new SavePlayheadBatchBody(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SavePlayheadBatchBody) && j.a(this.batch, ((SavePlayheadBatchBody) obj).batch)) {
            return true;
        }
        return false;
    }

    public final Map<String, PlayheadBatchEntry> getBatch() {
        return this.batch;
    }

    public int hashCode() {
        return this.batch.hashCode();
    }

    public String toString() {
        Map<String, PlayheadBatchEntry> map = this.batch;
        return "SavePlayheadBatchBody(batch=" + map + ")";
    }
}
