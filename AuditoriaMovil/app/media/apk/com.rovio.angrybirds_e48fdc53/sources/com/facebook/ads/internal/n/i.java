package com.facebook.ads.internal.n;
/* loaded from: classes2.dex */
public enum i {
    HEIGHT_100(-1, 100),
    HEIGHT_120(-1, 120),
    HEIGHT_300(-1, 300),
    HEIGHT_400(-1, 400);
    
    private final int e;
    private final int f;

    i(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        switch (this.f) {
            case 100:
                return 1;
            case 120:
                return 2;
            case 300:
                return 3;
            case 400:
                return 4;
            default:
                return -1;
        }
    }
}
