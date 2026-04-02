package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzem extends zzgl {
    private final String TXXX;

    public zzem(String str) {
        if (str != null) {
            this.TXXX = str;
            return;
        }
        throw new NullPointerException("Null TXXX");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgl
    public String TXXX() {
        return this.TXXX;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgl) {
            return this.TXXX.equals(((zzgl) obj).TXXX());
        }
        return false;
    }

    public int hashCode() {
        return this.TXXX.hashCode() ^ 1000003;
    }

    public String toString() {
        return e.e("TimedMetadataWithKeys{TXXX=", this.TXXX, "}");
    }
}
