package com.vungle.publisher;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
/* loaded from: classes4.dex */
public class ze {
    public static double a(double d, double d2) {
        if (d <= PangleAdapterUtils.CPM_DEFLAUT_VALUE || d2 <= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            throw new IllegalArgumentException("base and number must be greater than 0");
        }
        return Math.log(d2) / Math.log(d);
    }

    public static double a(double d, double d2, double d3, double d4) {
        if (d2 < a(d, d4 / Math.abs(d3))) {
            return Math.pow(d, d2) * d3;
        }
        return d4;
    }

    public static double a(double d, double d2, double d3) {
        return a(2.0d, d, d2, d3);
    }

    public static long a(long j, long j2, long j3) {
        if (j < 0 || j2 < 0 || j3 < 0) {
            throw new IllegalArgumentException("inputs must be positive");
        }
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return j2 < j3 / j ? j * j2 : j3;
    }

    public static long a(long j, long j2) {
        return a(j, j2, Long.MAX_VALUE);
    }
}
