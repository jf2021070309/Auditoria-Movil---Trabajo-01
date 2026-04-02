package com.amazon.aps.iva.k6;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.q5.g0;
import com.amazon.aps.iva.q5.v;
import com.google.android.gms.ads.AdRequest;
import okhttp3.internal.http2.Http2;
/* compiled from: MediaCodecInfo.java */
/* loaded from: classes.dex */
public final class n {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    /* compiled from: MediaCodecInfo.java */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int a(android.media.MediaCodecInfo.VideoCapabilities r4, int r5, int r6, double r7) {
            /*
                java.util.List r4 = com.amazon.aps.iva.a3.b.c(r4)
                r0 = 0
                if (r4 == 0) goto L63
                boolean r1 = r4.isEmpty()
                if (r1 != 0) goto L63
                java.lang.String r1 = com.amazon.aps.iva.t5.g0.b
                java.lang.String r2 = "sabrina"
                boolean r2 = r1.equals(r2)
                r3 = 1
                if (r2 != 0) goto L3d
                java.lang.String r2 = "boreal"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L3d
                java.lang.String r1 = com.amazon.aps.iva.t5.g0.d
                java.lang.String r2 = "Lenovo TB-X605"
                boolean r2 = r1.startsWith(r2)
                if (r2 != 0) goto L3d
                java.lang.String r2 = "Lenovo TB-X606"
                boolean r2 = r1.startsWith(r2)
                if (r2 != 0) goto L3d
                java.lang.String r2 = "Lenovo TB-X616"
                boolean r1 = r1.startsWith(r2)
                if (r1 == 0) goto L3b
                goto L3d
            L3b:
                r1 = r0
                goto L3e
            L3d:
                r1 = r3
            L3e:
                if (r1 == 0) goto L41
                goto L63
            L41:
                com.amazon.aps.iva.a3.a.b()
                int r7 = (int) r7
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r5 = com.amazon.aps.iva.df0.b.c(r5, r6, r7)
            L49:
                int r6 = r4.size()
                if (r0 >= r6) goto L62
                java.lang.Object r6 = r4.get(r0)
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r6 = com.amazon.aps.iva.d2.g0.d(r6)
                boolean r6 = com.amazon.aps.iva.d2.h0.f(r6, r5)
                if (r6 == 0) goto L5f
                r4 = 2
                return r4
            L5f:
                int r0 = r0 + 1
                goto L49
            L62:
                return r3
            L63:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.n.a.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
        }
    }

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = g0.m(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = com.amazon.aps.iva.t5.g0.a;
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
        if (r11 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        if (com.amazon.aps.iva.t5.g0.a < 21) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
        if (r11.isFeatureSupported("secure-playback") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
        if (r15 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0070, code lost:
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.k6.n h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            com.amazon.aps.iva.k6.n r13 = new com.amazon.aps.iva.k6.n
            r14 = 1
            r0 = 0
            if (r11 == 0) goto L46
            int r1 = com.amazon.aps.iva.t5.g0.a
            r2 = 19
            if (r1 < r2) goto L16
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L16
            r2 = r14
            goto L17
        L16:
            r2 = r0
        L17:
            if (r2 == 0) goto L46
            r2 = 22
            if (r1 > r2) goto L41
            java.lang.String r1 = com.amazon.aps.iva.t5.g0.d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L2f
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L41
        L2f:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L3f
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L41
        L3f:
            r1 = r14
            goto L42
        L41:
            r1 = r0
        L42:
            if (r1 != 0) goto L46
            r6 = r14
            goto L47
        L46:
            r6 = r0
        L47:
            r1 = 21
            if (r11 == 0) goto L5a
            int r2 = com.amazon.aps.iva.t5.g0.a
            if (r2 < r1) goto L59
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L59
            r2 = r14
            goto L5a
        L59:
            r2 = r0
        L5a:
            if (r15 != 0) goto L72
            if (r11 == 0) goto L70
            int r15 = com.amazon.aps.iva.t5.g0.a
            if (r15 < r1) goto L6c
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L6c
            r15 = r14
            goto L6d
        L6c:
            r15 = r0
        L6d:
            if (r15 == 0) goto L70
            goto L72
        L70:
            r7 = r0
            goto L73
        L72:
            r7 = r14
        L73:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.n.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.amazon.aps.iva.k6.n");
    }

    public final com.amazon.aps.iva.a6.g b(v vVar, v vVar2) {
        int i;
        int i2;
        boolean z = false;
        if (!com.amazon.aps.iva.t5.g0.a(vVar.m, vVar2.m)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.h) {
            if (vVar.u != vVar2.u) {
                i |= 1024;
            }
            if (!this.e && (vVar.r != vVar2.r || vVar.s != vVar2.s)) {
                i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if (!com.amazon.aps.iva.t5.g0.a(vVar.y, vVar2.y)) {
                i |= 2048;
            }
            if (com.amazon.aps.iva.t5.g0.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a)) {
                z = true;
            }
            if (z && !vVar.c(vVar2)) {
                i |= 2;
            }
            if (i == 0) {
                String str = this.a;
                if (vVar.c(vVar2)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new com.amazon.aps.iva.a6.g(str, vVar, vVar2, i2, 0);
            }
        } else {
            if (vVar.z != vVar2.z) {
                i |= 4096;
            }
            if (vVar.A != vVar2.A) {
                i |= 8192;
            }
            if (vVar.B != vVar2.B) {
                i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str2 = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str2)) {
                Pair<Integer, Integer> d = s.d(vVar);
                Pair<Integer, Integer> d2 = s.d(vVar2);
                if (d != null && d2 != null) {
                    int intValue = ((Integer) d.first).intValue();
                    int intValue2 = ((Integer) d2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new com.amazon.aps.iva.a6.g(this.a, vVar, vVar2, 3, 0);
                    }
                }
            }
            if (!vVar.c(vVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(str2)) {
                i |= 2;
            }
            if (i == 0) {
                return new com.amazon.aps.iva.a6.g(this.a, vVar, vVar2, 1, 0);
            }
        }
        return new com.amazon.aps.iva.a6.g(this.a, vVar, vVar2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(com.amazon.aps.iva.q5.v r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.n.c(com.amazon.aps.iva.q5.v, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(com.amazon.aps.iva.q5.v r10) throws com.amazon.aps.iva.k6.s.b {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.n.d(com.amazon.aps.iva.q5.v):boolean");
    }

    public final boolean e(v vVar) {
        if (this.h) {
            return this.e;
        }
        Pair<Integer, Integer> d = s.d(vVar);
        if (d != null && ((Integer) d.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i, int i2, double d) {
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (com.amazon.aps.iva.t5.g0.a >= 29) {
            int a2 = a.a(videoCapabilities, i, i2, d);
            if (a2 == 2) {
                return true;
            }
            if (a2 == 1) {
                StringBuilder a3 = x.a("sizeAndRate.cover, ", i, "x", i2, "@");
                a3.append(d);
                g(a3.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) && "mcv5a".equals(com.amazon.aps.iva.t5.g0.b)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && a(videoCapabilities, i2, i, d)) {
                    x.a("sizeAndRate.rotated, ", i, "x", i2, "@").append(d);
                    int i3 = com.amazon.aps.iva.t5.g0.a;
                    com.amazon.aps.iva.t5.p.b();
                }
            }
            StringBuilder a4 = x.a("sizeAndRate.support, ", i, "x", i2, "@");
            a4.append(d);
            g(a4.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        int i = com.amazon.aps.iva.t5.g0.a;
        com.amazon.aps.iva.t5.p.b();
    }

    public final String toString() {
        return this.a;
    }
}
