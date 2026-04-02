package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.e4.e;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: MarketingNotificationSettingsBody.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/MarketingNotificationSettingsBody;", "", "optOutNewsLetters", "", "optOutPromotionalUpdates", "optOutStoreDeals", "(ZZZ)V", "getOptOutNewsLetters", "()Z", "getOptOutPromotionalUpdates", "getOptOutStoreDeals", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MarketingNotificationSettingsBody {
    public static final int $stable = 0;
    @SerializedName("opt_out_newsletters")
    private final boolean optOutNewsLetters;
    @SerializedName("opt_out_promotional_updates")
    private final boolean optOutPromotionalUpdates;
    @SerializedName("opt_out_store_deals")
    private final boolean optOutStoreDeals;

    public MarketingNotificationSettingsBody(boolean z, boolean z2, boolean z3) {
        this.optOutNewsLetters = z;
        this.optOutPromotionalUpdates = z2;
        this.optOutStoreDeals = z3;
    }

    public static /* synthetic */ MarketingNotificationSettingsBody copy$default(MarketingNotificationSettingsBody marketingNotificationSettingsBody, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = marketingNotificationSettingsBody.optOutNewsLetters;
        }
        if ((i & 2) != 0) {
            z2 = marketingNotificationSettingsBody.optOutPromotionalUpdates;
        }
        if ((i & 4) != 0) {
            z3 = marketingNotificationSettingsBody.optOutStoreDeals;
        }
        return marketingNotificationSettingsBody.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.optOutNewsLetters;
    }

    public final boolean component2() {
        return this.optOutPromotionalUpdates;
    }

    public final boolean component3() {
        return this.optOutStoreDeals;
    }

    public final MarketingNotificationSettingsBody copy(boolean z, boolean z2, boolean z3) {
        return new MarketingNotificationSettingsBody(z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketingNotificationSettingsBody)) {
            return false;
        }
        MarketingNotificationSettingsBody marketingNotificationSettingsBody = (MarketingNotificationSettingsBody) obj;
        if (this.optOutNewsLetters == marketingNotificationSettingsBody.optOutNewsLetters && this.optOutPromotionalUpdates == marketingNotificationSettingsBody.optOutPromotionalUpdates && this.optOutStoreDeals == marketingNotificationSettingsBody.optOutStoreDeals) {
            return true;
        }
        return false;
    }

    public final boolean getOptOutNewsLetters() {
        return this.optOutNewsLetters;
    }

    public final boolean getOptOutPromotionalUpdates() {
        return this.optOutPromotionalUpdates;
    }

    public final boolean getOptOutStoreDeals() {
        return this.optOutStoreDeals;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.optOutNewsLetters;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r2 = this.optOutPromotionalUpdates;
        int i3 = r2;
        if (r2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z2 = this.optOutStoreDeals;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i4 + i;
    }

    public String toString() {
        boolean z = this.optOutNewsLetters;
        boolean z2 = this.optOutPromotionalUpdates;
        boolean z3 = this.optOutStoreDeals;
        StringBuilder sb = new StringBuilder("MarketingNotificationSettingsBody(optOutNewsLetters=");
        sb.append(z);
        sb.append(", optOutPromotionalUpdates=");
        sb.append(z2);
        sb.append(", optOutStoreDeals=");
        return e.c(sb, z3, ")");
    }
}
