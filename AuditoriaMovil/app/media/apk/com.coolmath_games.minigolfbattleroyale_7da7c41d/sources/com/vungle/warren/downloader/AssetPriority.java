package com.vungle.warren.downloader;
/* loaded from: classes2.dex */
public class AssetPriority implements Comparable {
    private final Integer firstPriority;
    private final Integer secondPriority;

    public AssetPriority(int i, int i2) {
        this.firstPriority = Integer.valueOf(i);
        this.secondPriority = Integer.valueOf(i2);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof AssetPriority) {
            AssetPriority assetPriority = (AssetPriority) obj;
            int compareTo = this.firstPriority.compareTo(assetPriority.firstPriority);
            return compareTo == 0 ? this.secondPriority.compareTo(assetPriority.secondPriority) : compareTo;
        }
        return -1;
    }

    public String toString() {
        return "AssetPriority{firstPriority=" + this.firstPriority + ", secondPriority=" + this.secondPriority + '}';
    }
}
