package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.b6.x;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzal extends zzbp {
    private final int major;
    private final int micro;
    private final int minor;

    public zzal(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.micro = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbp) {
            zzbp zzbpVar = (zzbp) obj;
            if (this.major == zzbpVar.major() && this.minor == zzbpVar.minor() && this.micro == zzbpVar.micro()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.major ^ 1000003) * 1000003) ^ this.minor) * 1000003) ^ this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbp
    public int major() {
        return this.major;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbp
    public int micro() {
        return this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbp
    public int minor() {
        return this.minor;
    }

    public String toString() {
        int i = this.major;
        int i2 = this.minor;
        return e.f(x.a("SecureSignalsVersionData{major=", i, ", minor=", i2, ", micro="), this.micro, "}");
    }
}
