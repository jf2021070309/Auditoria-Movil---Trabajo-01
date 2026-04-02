package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzam extends zzbq {
    private final Integer height;
    private final Integer width;

    public zzam(Integer num, Integer num2) {
        this.width = num;
        this.height = num2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbq) {
            zzbq zzbqVar = (zzbq) obj;
            if (this.width.equals(zzbqVar.width()) && this.height.equals(zzbqVar.height())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.width.hashCode() ^ 1000003) * 1000003) ^ this.height.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbq
    public Integer height() {
        return this.height;
    }

    public String toString() {
        Integer num = this.width;
        Integer num2 = this.height;
        return "SizeData{width=" + num + ", height=" + num2 + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbq
    public Integer width() {
        return this.width;
    }
}
