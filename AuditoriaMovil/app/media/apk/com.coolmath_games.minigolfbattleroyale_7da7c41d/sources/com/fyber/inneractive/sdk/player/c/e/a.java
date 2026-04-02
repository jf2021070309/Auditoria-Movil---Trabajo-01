package com.fyber.inneractive.sdk.player.c.e;

import android.media.MediaCodecInfo;
import android.util.Log;
import com.fyber.inneractive.sdk.player.c.k.t;
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final MediaCodecInfo.CodecCapabilities e;

    public static a a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        return new a(str, str2, codecCapabilities, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
        if ((com.fyber.inneractive.sdk.player.c.k.t.a >= 21 && r4.isFeatureSupported("tunneled-playback")) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = com.fyber.inneractive.sdk.player.c.k.a.a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.a = r2
            r1.d = r3
            r1.e = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L2a
            if (r4 == 0) goto L2a
            int r5 = com.fyber.inneractive.sdk.player.c.k.t.a
            r0 = 19
            if (r5 < r0) goto L25
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L25
            r5 = r2
            goto L26
        L25:
            r5 = r3
        L26:
            if (r5 == 0) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r3
        L2b:
            r1.b = r5
            if (r4 == 0) goto L43
            int r5 = com.fyber.inneractive.sdk.player.c.k.t.a
            r0 = 21
            if (r5 < r0) goto L3f
            java.lang.String r5 = "tunneled-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L3f
            r4 = r2
            goto L40
        L3f:
            r4 = r3
        L40:
            if (r4 == 0) goto L43
            goto L44
        L43:
            r2 = r3
        L44:
            r1.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.e.a.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean):void");
    }

    public final MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.e.profileLevels;
    }

    public final boolean a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        } else if (a(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !a(videoCapabilities, i2, i, d)) {
                a("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d) + "] [" + this.a + ", " + this.d + "] [" + t.e + "]");
            return true;
        }
    }

    public final void a(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.a + ", " + this.d + "] [" + t.e + "]");
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }
}
