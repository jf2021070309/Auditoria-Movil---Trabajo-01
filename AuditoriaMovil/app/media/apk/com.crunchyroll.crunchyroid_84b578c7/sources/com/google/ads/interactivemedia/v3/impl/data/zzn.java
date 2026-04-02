package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.b6.x;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzn extends zzau {
    private final int height;
    private final int left;
    private final int top;
    private final int width;

    private zzn(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.height = i3;
        this.width = i4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzau) {
            zzau zzauVar = (zzau) obj;
            if (this.left == zzauVar.left() && this.top == zzauVar.top() && this.height == zzauVar.height() && this.width == zzauVar.width()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.left ^ 1000003) * 1000003) ^ this.top) * 1000003) ^ this.height) * 1000003) ^ this.width;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzau
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzau
    public int left() {
        return this.left;
    }

    public String toString() {
        int i = this.left;
        int i2 = this.top;
        int i3 = this.height;
        int i4 = this.width;
        StringBuilder a = x.a("BoundingRectData{left=", i, ", top=", i2, ", height=");
        a.append(i3);
        a.append(", width=");
        a.append(i4);
        a.append("}");
        return a.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzau
    public int top() {
        return this.top;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzau
    public int width() {
        return this.width;
    }
}
