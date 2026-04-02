package com.ellation.crunchyroll.api.etp.index.model;

import com.amazon.aps.iva.yb0.e;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: EtpIndex.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/index/model/EtpIndex;", "", "isServiceAvailable", "", "isMarketingOptInEnabled", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpIndex {
    public static final int $stable = 0;
    @SerializedName("default_marketing_opt_in")
    private final boolean isMarketingOptInEnabled;
    @SerializedName("service_available")
    private final boolean isServiceAvailable;

    public EtpIndex() {
        this(false, false, 3, null);
    }

    public static /* synthetic */ EtpIndex copy$default(EtpIndex etpIndex, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = etpIndex.isServiceAvailable;
        }
        if ((i & 2) != 0) {
            z2 = etpIndex.isMarketingOptInEnabled;
        }
        return etpIndex.copy(z, z2);
    }

    public final boolean component1() {
        return this.isServiceAvailable;
    }

    public final boolean component2() {
        return this.isMarketingOptInEnabled;
    }

    public final EtpIndex copy(boolean z, boolean z2) {
        return new EtpIndex(z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EtpIndex)) {
            return false;
        }
        EtpIndex etpIndex = (EtpIndex) obj;
        if (this.isServiceAvailable == etpIndex.isServiceAvailable && this.isMarketingOptInEnabled == etpIndex.isMarketingOptInEnabled) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isServiceAvailable;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        boolean z2 = this.isMarketingOptInEnabled;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i2 + i;
    }

    public final boolean isMarketingOptInEnabled() {
        return this.isMarketingOptInEnabled;
    }

    public final boolean isServiceAvailable() {
        return this.isServiceAvailable;
    }

    public String toString() {
        boolean z = this.isServiceAvailable;
        boolean z2 = this.isMarketingOptInEnabled;
        return "EtpIndex(isServiceAvailable=" + z + ", isMarketingOptInEnabled=" + z2 + ")";
    }

    public EtpIndex(boolean z, boolean z2) {
        this.isServiceAvailable = z;
        this.isMarketingOptInEnabled = z2;
    }

    public /* synthetic */ EtpIndex(boolean z, boolean z2, int i, e eVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2);
    }
}
