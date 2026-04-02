package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class V6 implements GY {
    public static byte[] A04;
    public final int A00;
    public final List<V7> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{5};
    }

    public V6(List<V7> list) {
        this.A01 = list;
        this.A00 = list.size();
        this.A02 = new long[this.A00 * 2];
        for (int i2 = 0; i2 < this.A00; i2++) {
            V7 v7 = list.get(i2);
            int i3 = i2 * 2;
            this.A02[i3] = v7.A01;
            this.A02[i3 + 1] = v7.A00;
        }
        long[] jArr = this.A02;
        this.A03 = Arrays.copyOf(jArr, jArr.length);
        Arrays.sort(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6A(long j2) {
        ArrayList arrayList = null;
        V7 cue = null;
        SpannableStringBuilder normalCueTextBuilder = null;
        for (int i2 = 0; i2 < this.A00; i2++) {
            long[] jArr = this.A02;
            if (jArr[i2 * 2] <= j2 && j2 < jArr[(i2 * 2) + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                V7 v7 = this.A01.get(i2);
                if (v7.A00()) {
                    if (cue == null) {
                        cue = v7;
                    } else {
                        String A00 = A00(0, 1, 126);
                        if (normalCueTextBuilder == null) {
                            normalCueTextBuilder = new SpannableStringBuilder();
                            normalCueTextBuilder.append(cue.A0C).append((CharSequence) A00).append(v7.A0C);
                        } else {
                            normalCueTextBuilder.append((CharSequence) A00).append(v7.A0C);
                        }
                    }
                } else {
                    arrayList.add(v7);
                }
            }
        }
        if (normalCueTextBuilder != null) {
            arrayList.add(new V7(normalCueTextBuilder));
        } else if (cue != null) {
            arrayList.add(cue);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6a(int i2) {
        boolean z = true;
        IJ.A03(i2 >= 0);
        if (i2 >= this.A03.length) {
            z = false;
        }
        IJ.A03(z);
        return this.A03[i2];
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6b() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6z(long j2) {
        int A0A = C0676Iy.A0A(this.A03, j2, false, false);
        if (A0A < this.A03.length) {
            return A0A;
        }
        return -1;
    }
}
