package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.ab.f;
import com.amazon.aps.iva.n4.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzp extends zzaw {
    private final String addtlConsent;
    private final String gdprApplies;
    private final String tcString;
    private final String uspString;

    public zzp(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.gdprApplies = str;
            if (str2 != null) {
                this.tcString = str2;
                if (str3 != null) {
                    this.addtlConsent = str3;
                    if (str4 != null) {
                        this.uspString = str4;
                        return;
                    }
                    throw new NullPointerException("Null uspString");
                }
                throw new NullPointerException("Null addtlConsent");
            }
            throw new NullPointerException("Null tcString");
        }
        throw new NullPointerException("Null gdprApplies");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaw
    public String addtlConsent() {
        return this.addtlConsent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaw) {
            zzaw zzawVar = (zzaw) obj;
            if (this.gdprApplies.equals(zzawVar.gdprApplies()) && this.tcString.equals(zzawVar.tcString()) && this.addtlConsent.equals(zzawVar.addtlConsent()) && this.uspString.equals(zzawVar.uspString())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaw
    public String gdprApplies() {
        return this.gdprApplies;
    }

    public int hashCode() {
        return ((((((this.gdprApplies.hashCode() ^ 1000003) * 1000003) ^ this.tcString.hashCode()) * 1000003) ^ this.addtlConsent.hashCode()) * 1000003) ^ this.uspString.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaw
    public String tcString() {
        return this.tcString;
    }

    public String toString() {
        String str = this.gdprApplies;
        String str2 = this.tcString;
        return f.a(a.b("ConsentSettings{gdprApplies=", str, ", tcString=", str2, ", addtlConsent="), this.addtlConsent, ", uspString=", this.uspString, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaw
    public String uspString() {
        return this.uspString;
    }
}
