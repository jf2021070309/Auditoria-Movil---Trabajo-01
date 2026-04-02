package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.n4.a;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzac extends zzbj {
    private final String content;
    private final String contentType;
    private final int errorCode;
    private final String id;

    public zzac(String str, String str2, String str3, int i) {
        if (str != null) {
            this.id = str;
            if (str2 != null) {
                this.content = str2;
                if (str3 != null) {
                    this.contentType = str3;
                    this.errorCode = i;
                    return;
                }
                throw new NullPointerException("Null contentType");
            }
            throw new NullPointerException("Null content");
        }
        throw new NullPointerException("Null id");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String content() {
        return this.content;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String contentType() {
        return this.contentType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbj) {
            zzbj zzbjVar = (zzbj) obj;
            if (this.id.equals(zzbjVar.id()) && this.content.equals(zzbjVar.content()) && this.contentType.equals(zzbjVar.contentType()) && this.errorCode == zzbjVar.errorCode()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public int errorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        return ((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.content.hashCode()) * 1000003) ^ this.contentType.hashCode()) * 1000003) ^ this.errorCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String id() {
        return this.id;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.content;
        String str3 = this.contentType;
        int i = this.errorCode;
        StringBuilder b = a.b("NetworkResponseData{id=", str, ", content=", str2, ", contentType=");
        b.append(str3);
        b.append(", errorCode=");
        b.append(i);
        b.append("}");
        return b.toString();
    }
}
