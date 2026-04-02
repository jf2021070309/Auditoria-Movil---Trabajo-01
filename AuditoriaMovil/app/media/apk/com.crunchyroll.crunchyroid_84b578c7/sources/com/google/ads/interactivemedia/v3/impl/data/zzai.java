package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.ab.f;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzai extends zzbm {
    private final boolean attached;
    private final zzau bounds;
    private final String detailedReason;
    private final boolean hidden;
    private final FriendlyObstructionPurpose purpose;
    private final String type;

    private zzai(boolean z, zzau zzauVar, String str, boolean z2, FriendlyObstructionPurpose friendlyObstructionPurpose, String str2) {
        this.attached = z;
        this.bounds = zzauVar;
        this.detailedReason = str;
        this.hidden = z2;
        this.purpose = friendlyObstructionPurpose;
        this.type = str2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public boolean attached() {
        return this.attached;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public zzau bounds() {
        return this.bounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbm) {
            zzbm zzbmVar = (zzbm) obj;
            if (this.attached == zzbmVar.attached() && this.bounds.equals(zzbmVar.bounds()) && ((str = this.detailedReason) != null ? str.equals(zzbmVar.detailedReason()) : zzbmVar.detailedReason() == null) && this.hidden == zzbmVar.hidden() && this.purpose.equals(zzbmVar.purpose()) && this.type.equals(zzbmVar.type())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int i2 = 1237;
        if (true != this.attached) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode2 = ((i ^ 1000003) * 1000003) ^ this.bounds.hashCode();
        String str = this.detailedReason;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        if (true == this.hidden) {
            i2 = 1231;
        }
        return ((((i3 ^ i2) * 1000003) ^ this.purpose.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public boolean hidden() {
        return this.hidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    public String toString() {
        boolean z = this.attached;
        String valueOf = String.valueOf(this.bounds);
        String str = this.detailedReason;
        boolean z2 = this.hidden;
        String valueOf2 = String.valueOf(this.purpose);
        String str2 = this.type;
        StringBuilder sb = new StringBuilder("ObstructionData{attached=");
        sb.append(z);
        sb.append(", bounds=");
        sb.append(valueOf);
        sb.append(", detailedReason=");
        sb.append(str);
        sb.append(", hidden=");
        sb.append(z2);
        sb.append(", purpose=");
        return f.a(sb, valueOf2, ", type=", str2, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public String type() {
        return this.type;
    }
}
