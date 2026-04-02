package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.n4.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzy extends zzbc {
    private final String adsIdentityToken;
    private final String appSetId;
    private final int appSetIdScope;
    private final String deviceId;
    private final String idType;
    private final boolean isLimitedAdTracking;

    public zzy(String str, String str2, boolean z, String str3, int i, String str4) {
        this.deviceId = str;
        this.idType = str2;
        this.isLimitedAdTracking = z;
        if (str3 != null) {
            this.appSetId = str3;
            this.appSetIdScope = i;
            if (str4 != null) {
                this.adsIdentityToken = str4;
                return;
            }
            throw new NullPointerException("Null adsIdentityToken");
        }
        throw new NullPointerException("Null appSetId");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbc
    public String adsIdentityToken() {
        return this.adsIdentityToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbc
    public String appSetId() {
        return this.appSetId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbc
    public int appSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbc
    public String deviceId() {
        return this.deviceId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbc) {
            zzbc zzbcVar = (zzbc) obj;
            String str = this.deviceId;
            if (str != null ? str.equals(zzbcVar.deviceId()) : zzbcVar.deviceId() == null) {
                if (this.idType.equals(zzbcVar.idType()) && this.isLimitedAdTracking == zzbcVar.isLimitedAdTracking() && this.appSetId.equals(zzbcVar.appSetId()) && this.appSetIdScope == zzbcVar.appSetIdScope() && this.adsIdentityToken.equals(zzbcVar.adsIdentityToken())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i;
        String str = this.deviceId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((hashCode ^ 1000003) * 1000003) ^ this.idType.hashCode();
        if (true != this.isLimitedAdTracking) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((((hashCode2 * 1000003) ^ i) * 1000003) ^ this.appSetId.hashCode()) * 1000003) ^ this.appSetIdScope) * 1000003) ^ this.adsIdentityToken.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbc
    public String idType() {
        return this.idType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbc
    public boolean isLimitedAdTracking() {
        return this.isLimitedAdTracking;
    }

    public String toString() {
        String str = this.deviceId;
        String str2 = this.idType;
        boolean z = this.isLimitedAdTracking;
        String str3 = this.appSetId;
        int i = this.appSetIdScope;
        String str4 = this.adsIdentityToken;
        StringBuilder b = a.b("IdentifierInfo{deviceId=", str, ", idType=", str2, ", isLimitedAdTracking=");
        b.append(z);
        b.append(", appSetId=");
        b.append(str3);
        b.append(", appSetIdScope=");
        b.append(i);
        b.append(", adsIdentityToken=");
        b.append(str4);
        b.append("}");
        return b.toString();
    }
}
