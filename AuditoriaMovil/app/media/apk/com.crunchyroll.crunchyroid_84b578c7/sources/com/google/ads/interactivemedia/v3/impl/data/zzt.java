package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.amazon.aps.iva.n4.a;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzt extends zzay {
    private final String detailedReason;
    private final FriendlyObstructionPurpose purpose;
    private final View view;

    private zzt(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.view = view;
        this.purpose = friendlyObstructionPurpose;
        this.detailedReason = str;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzay
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzay) {
            zzay zzayVar = (zzay) obj;
            if (this.view.equals(zzayVar.view()) && this.purpose.equals(zzayVar.purpose()) && ((str = this.detailedReason) != null ? str.equals(zzayVar.detailedReason()) : zzayVar.detailedReason() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.view.hashCode() ^ 1000003) * 1000003) ^ this.purpose.hashCode();
        String str = this.detailedReason;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzay
    public FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    public String toString() {
        String valueOf = String.valueOf(this.view);
        String valueOf2 = String.valueOf(this.purpose);
        return b.c(a.b("FriendlyObstructionImpl{view=", valueOf, ", purpose=", valueOf2, ", detailedReason="), this.detailedReason, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzay
    public View view() {
        return this.view;
    }
}
