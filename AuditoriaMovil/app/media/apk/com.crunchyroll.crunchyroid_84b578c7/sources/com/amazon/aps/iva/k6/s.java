package com.amazon.aps.iva.k6;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q5.z;
import com.amazon.aps.iva.t5.g0;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
/* compiled from: MediaCodecUtil.java */
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class s {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap<a, List<n>> b = new HashMap<>();
    public static int c = -1;

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final boolean b;
        public final boolean c;

        public a(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (TextUtils.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int b = com.amazon.aps.iva.c80.a.b(this.a, 31, 31);
            int i2 = 1231;
            if (this.b) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i3 = (b + i) * 31;
            if (!this.c) {
                i2 = 1237;
            }
            return i3 + i2;
        }
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes.dex */
    public static class b extends Exception {
        public b(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes.dex */
    public interface c {
        MediaCodecInfo a(int i);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes.dex */
    public static final class d implements c {
        @Override // com.amazon.aps.iva.k6.s.c
        public final MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.amazon.aps.iva.k6.s.c
        public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.k6.s.c
        public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.amazon.aps.iva.k6.s.c
        public final int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.amazon.aps.iva.k6.s.c
        public final boolean e() {
            return false;
        }
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes.dex */
    public static final class e implements c {
        public final int a;
        public MediaCodecInfo[] b;

        public e(boolean z, boolean z2) {
            int i;
            if (!z && !z2) {
                i = 0;
            } else {
                i = 1;
            }
            this.a = i;
        }

        @Override // com.amazon.aps.iva.k6.s.c
        public final MediaCodecInfo a(int i) {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
            return this.b[i];
        }

        @Override // com.amazon.aps.iva.k6.s.c
        public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.amazon.aps.iva.k6.s.c
        public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.amazon.aps.iva.k6.s.c
        public final int d() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
            return this.b.length;
        }

        @Override // com.amazon.aps.iva.k6.s.c
        public final boolean e() {
            return true;
        }
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes.dex */
    public interface f<T> {
        int d(T t);
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (g0.a < 26 && g0.b.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new r(new com.amazon.aps.iva.g1.n(4)));
        }
        int i = g0.a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((n) arrayList.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new r(new z(5)));
            }
        }
        if (i < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).a)) {
            arrayList.add((n) arrayList.remove(0));
        }
    }

    public static String b(v vVar) {
        Pair<Integer, Integer> d2;
        if ("audio/eac3-joc".equals(vVar.m)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(vVar.m) && (d2 = d(vVar)) != null) {
            int intValue = ((Integer) d2.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
                return "audio/lg-ac3";
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0148, code lost:
        if (r1.equals("11") == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0359 A[Catch: NumberFormatException -> 0x0368, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0368, blocks: (B:248:0x0316, B:250:0x0328, B:261:0x0344, B:272:0x0359), top: B:558:0x0316 }] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> d(com.amazon.aps.iva.q5.v r26) {
        /*
            Method dump skipped, instructions count: 2288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.s.d(com.amazon.aps.iva.q5.v):android.util.Pair");
    }

    public static synchronized List<n> e(String str, boolean z, boolean z2) throws b {
        c dVar;
        synchronized (s.class) {
            a aVar = new a(str, z, z2);
            HashMap<a, List<n>> hashMap = b;
            List<n> list = hashMap.get(aVar);
            if (list != null) {
                return list;
            }
            int i = g0.a;
            if (i >= 21) {
                dVar = new e(z, z2);
            } else {
                dVar = new d();
            }
            ArrayList<n> f2 = f(aVar, dVar);
            if (z && f2.isEmpty() && 21 <= i && i <= 23) {
                f2 = f(aVar, new d());
                if (!f2.isEmpty()) {
                    String str2 = f2.get(0).a;
                    com.amazon.aps.iva.t5.p.g();
                }
            }
            a(str, f2);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) f2);
            hashMap.put(aVar, copyOf);
            return copyOf;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[Catch: Exception -> 0x0126, TryCatch #1 {Exception -> 0x0126, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:68:0x0117, B:13:0x0034, B:16:0x003f, B:63:0x0108, B:65:0x010e, B:67:0x0114, B:69:0x0121, B:70:0x0124), top: B:77:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.amazon.aps.iva.k6.n> f(com.amazon.aps.iva.k6.s.a r20, com.amazon.aps.iva.k6.s.c r21) throws com.amazon.aps.iva.k6.s.b {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.s.f(com.amazon.aps.iva.k6.s$a, com.amazon.aps.iva.k6.s$c):java.util.ArrayList");
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = g0.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = g0.b;
            if ("a70".equals(str3) || ("Xiaomi".equals(g0.c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = g0.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = g0.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(g0.c))) {
            String str6 = g0.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(g0.c)) {
            String str7 = g0.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && g0.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (g0.a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        } else if (com.amazon.aps.iva.q5.g0.k(str)) {
            return true;
        } else {
            String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
            if (lowerCase.startsWith("arc.")) {
                return false;
            }
            if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
                return true;
            }
            if (!lowerCase.startsWith("omx.") && !lowerCase.startsWith("c2.")) {
                return true;
            }
            return false;
        }
    }

    public static int i() throws b {
        n nVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        int i2;
        if (c == -1) {
            int i3 = 0;
            List<n> e2 = e("video/avc", false, false);
            if (e2.isEmpty()) {
                nVar = null;
            } else {
                nVar = e2.get(0);
            }
            if (nVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = codecProfileLevelArr[i3].level;
                    if (i5 != 1 && i5 != 2) {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                continue;
                            case 64:
                                i2 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i2 = 414720;
                                continue;
                            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                                i2 = 921600;
                                continue;
                            case 1024:
                                i2 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                continue;
                            case 8192:
                                i2 = 2228224;
                                continue;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i2 = 5652480;
                                continue;
                            case 32768:
                            case Cast.MAX_MESSAGE_LENGTH /* 65536 */:
                                i2 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i2 = 35651584;
                                continue;
                            default:
                                i2 = -1;
                                continue;
                        }
                    } else {
                        i2 = 25344;
                    }
                    i4 = Math.max(i2, i4);
                    i3++;
                }
                if (g0.a >= 21) {
                    i = 345600;
                } else {
                    i = 172800;
                }
                i3 = Math.max(i4, i);
            }
            c = i3;
        }
        return c;
    }
}
