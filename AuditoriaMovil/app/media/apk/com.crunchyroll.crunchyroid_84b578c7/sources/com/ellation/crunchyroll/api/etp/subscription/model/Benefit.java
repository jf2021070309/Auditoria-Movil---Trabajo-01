package com.ellation.crunchyroll.api.etp.subscription.model;

import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: Benefit.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/subscription/model/Benefit;", "", "benefit", "", FirebaseAnalytics.Param.SOURCE, "(Ljava/lang/String;Ljava/lang/String;)V", "getBenefit", "()Ljava/lang/String;", "getSource", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Benefit {
    public static final int $stable = 0;
    @SerializedName("benefit")
    private final String benefit;
    @SerializedName(FirebaseAnalytics.Param.SOURCE)
    private final String source;

    public Benefit(String str, String str2) {
        j.f(str, "benefit");
        this.benefit = str;
        this.source = str2;
        this.benefit = "cr_premium_plus";
    }

    public static /* synthetic */ Benefit copy$default(Benefit benefit, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = benefit.benefit;
        }
        if ((i & 2) != 0) {
            str2 = benefit.source;
        }
        return benefit.copy(str, str2);
    }

    public final String component1() {
        return this.benefit;
    }

    public final String component2() {
        return this.source;
    }

    public final Benefit copy(String str, String str2) {
        j.f(str, "benefit");
        return new Benefit(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Benefit)) {
            return false;
        }
        Benefit benefit = (Benefit) obj;
        if (j.a(this.benefit, benefit.benefit) && j.a(this.source, benefit.source)) {
            return true;
        }
        return false;
    }

    public final String getBenefit() {
        return this.benefit;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.benefit.hashCode() * 31;
        String str = this.source;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return e.b("Benefit(benefit=", this.benefit, ", source=", this.source, ")");
    }
}
