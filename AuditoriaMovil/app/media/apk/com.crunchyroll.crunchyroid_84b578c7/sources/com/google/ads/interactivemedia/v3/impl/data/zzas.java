package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzas extends zzbw {
    private final float volume;

    private zzas(float f) {
        this.volume = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbw) && Float.floatToIntBits(this.volume) == Float.floatToIntBits(((zzbw) obj).volume())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.volume) ^ 1000003;
    }

    public String toString() {
        float f = this.volume;
        return "VolumeUpdateData{volume=" + f + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbw
    public float volume() {
        return this.volume;
    }
}
