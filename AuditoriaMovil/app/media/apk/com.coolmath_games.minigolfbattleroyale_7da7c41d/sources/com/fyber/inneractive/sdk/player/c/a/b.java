package com.fyber.inneractive.sdk.player.c.a;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class b {
    public static final b a = new b(new int[]{2});
    final int[] b;
    private final int c;

    private b(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.b = copyOf;
        Arrays.sort(copyOf);
        this.c = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Arrays.equals(this.b, bVar.b) && this.c == bVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c + (Arrays.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.c + ", supportedEncodings=" + Arrays.toString(this.b) + "]";
    }
}
