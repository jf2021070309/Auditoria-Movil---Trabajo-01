package com.amazon.aps.iva.cx;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
/* compiled from: DownloadingConfigImpl.kt */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.jg.a, Serializable {
    @SerializedName("auto_retry_streams")
    private final boolean b;

    @Override // com.amazon.aps.iva.jg.a
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && this.b == ((i) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.b;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.b;
        return "DownloadingConfigImpl(autoRetryStreams=" + z + ")";
    }
}
