package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzel extends zzeb {
    private final int appVersion;
    private final String packageName;

    public zzel(int i, String str) {
        this.appVersion = i;
        if (str != null) {
            this.packageName = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzeb
    public int appVersion() {
        return this.appVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeb) {
            zzeb zzebVar = (zzeb) obj;
            if (this.appVersion == zzebVar.appVersion() && this.packageName.equals(zzebVar.packageName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.appVersion ^ 1000003) * 1000003) ^ this.packageName.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzeb
    public String packageName() {
        return this.packageName;
    }

    public String toString() {
        int i = this.appVersion;
        String str = this.packageName;
        return "MarketAppInfo{appVersion=" + i + ", packageName=" + str + "}";
    }
}
