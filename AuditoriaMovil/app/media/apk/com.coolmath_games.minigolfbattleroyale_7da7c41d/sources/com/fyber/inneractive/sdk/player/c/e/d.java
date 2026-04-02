package com.fyber.inneractive.sdk.player.c.e;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class d {
    private static final SparseIntArray d;
    private static final SparseIntArray e;
    private static final Map<String, Integer> f;
    private static final com.fyber.inneractive.sdk.player.c.e.a a = new com.fyber.inneractive.sdk.player.c.e.a("OMX.google.raw.decoder", null, null, false);
    private static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<a, List<com.fyber.inneractive.sdk.player.c.e.a>> c = new HashMap<>();
    private static int g = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        int a();

        MediaCodecInfo a(int i);

        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b extends Exception {
        /* synthetic */ b(Throwable th, byte b) {
            this(th);
        }

        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public static com.fyber.inneractive.sdk.player.c.e.a a() {
        return a;
    }

    public static com.fyber.inneractive.sdk.player.c.e.a a(String str, boolean z) throws b {
        List<com.fyber.inneractive.sdk.player.c.e.a> b2 = b(str, z);
        if (b2.isEmpty()) {
            return null;
        }
        return b2.get(0);
    }

    private static synchronized List<com.fyber.inneractive.sdk.player.c.e.a> b(String str, boolean z) throws b {
        synchronized (d.class) {
            a aVar = new a(str, z);
            List<com.fyber.inneractive.sdk.player.c.e.a> list = c.get(aVar);
            if (list != null) {
                return list;
            }
            List<com.fyber.inneractive.sdk.player.c.e.a> a2 = a(aVar, t.a >= 21 ? new e(z) : new C0059d((byte) 0));
            if (z && a2.isEmpty() && 21 <= t.a && t.a <= 23) {
                a2 = a(aVar, new C0059d((byte) 0));
                if (!a2.isEmpty()) {
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + a2.get(0).a);
                }
            }
            a(a2);
            List<com.fyber.inneractive.sdk.player.c.e.a> unmodifiableList = Collections.unmodifiableList(a2);
            c.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static int b() throws b {
        if (g == -1) {
            int i = 0;
            com.fyber.inneractive.sdk.player.c.e.a a2 = a("video/avc", false);
            if (a2 != null) {
                MediaCodecInfo.CodecProfileLevel[] a3 = a2.a();
                int length = a3.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = a3[i].level;
                    int i4 = 9437184;
                    if (i3 == 1 || i3 == 2) {
                        i4 = 25344;
                    } else {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                continue;
                            case 64:
                                i4 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i4 = 414720;
                                continue;
                            case 512:
                                i4 = 921600;
                                continue;
                            case 1024:
                                i4 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                continue;
                            case 8192:
                                i4 = 2228224;
                                continue;
                            case 16384:
                                i4 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i4 = -1;
                                continue;
                        }
                    }
                    i2 = Math.max(i4, i2);
                    i++;
                }
                i = Math.max(i2, t.a >= 21 ? 345600 : 172800);
            }
            g = i;
        }
        return g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r3.equals("hev1") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r9.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r5) {
                case 3006243: goto L36;
                case 3006244: goto L2c;
                case 3199032: goto L23;
                case 3214780: goto L19;
                default: goto L18;
            }
        L18:
            goto L40
        L19:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
            r2 = r8
            goto L41
        L23:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L40
            goto L41
        L2c:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
            r2 = r6
            goto L41
        L36:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
            r2 = r7
            goto L41
        L40:
            r2 = r4
        L41:
            if (r2 == 0) goto L4f
            if (r2 == r8) goto L4f
            if (r2 == r7) goto L4a
            if (r2 == r6) goto L4a
            return r0
        L4a:
            android.util.Pair r9 = a(r9, r1)
            return r9
        L4f:
            int r2 = r1.length
            r3 = 4
            java.lang.String r4 = "Ignoring malformed HEVC codec string: "
            java.lang.String r5 = "MediaCodecUtil"
            if (r2 >= r3) goto L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.w(r5, r9)
            return r0
        L67:
            java.util.regex.Pattern r2 = com.fyber.inneractive.sdk.player.c.e.d.b
            r3 = r1[r8]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L85
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.w(r5, r9)
            return r0
        L85:
            java.lang.String r9 = r2.group(r8)
            java.lang.String r3 = "1"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L93
            r7 = r8
            goto L9b
        L93:
            java.lang.String r3 = "2"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto Lc7
        L9b:
            java.util.Map<java.lang.String, java.lang.Integer> r9 = com.fyber.inneractive.sdk.player.c.e.d.f
            r1 = r1[r6]
            java.lang.Object r9 = r9.get(r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto Lbd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown HEVC level string: "
            r9.<init>(r1)
            java.lang.String r1 = r2.group(r8)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r5, r9)
            return r0
        Lbd:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.<init>(r1, r9)
            return r0
        Lc7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown HEVC profile string: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.w(r5, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.e.d.a(java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01b2 A[Catch: Exception -> 0x0286, TryCatch #2 {Exception -> 0x0286, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:27:0x0068, B:29:0x006e, B:32:0x0078, B:34:0x007c, B:36:0x0084, B:39:0x0090, B:41:0x0096, B:43:0x009e, B:45:0x00a8, B:47:0x00b2, B:49:0x00bc, B:51:0x00c6, B:53:0x00d0, B:55:0x00da, B:57:0x00e4, B:59:0x00ee, B:61:0x00f8, B:63:0x0102, B:65:0x010c, B:68:0x0118, B:70:0x011c, B:72:0x0124, B:74:0x012e, B:76:0x0138, B:78:0x0142, B:81:0x014d, B:84:0x0155, B:86:0x015d, B:88:0x0167, B:90:0x0171, B:92:0x017b, B:94:0x0183, B:96:0x018d, B:99:0x0198, B:101:0x019c, B:103:0x01a4, B:109:0x01b2, B:111:0x01ba, B:141:0x022d, B:144:0x0235, B:146:0x023b, B:147:0x0252, B:148:0x0270), top: B:160:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x027b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.fyber.inneractive.sdk.player.c.e.a> a(com.fyber.inneractive.sdk.player.c.e.d.a r17, com.fyber.inneractive.sdk.player.c.e.d.c r18) throws com.fyber.inneractive.sdk.player.c.e.d.b {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.e.d.a(com.fyber.inneractive.sdk.player.c.e.d$a, com.fyber.inneractive.sdk.player.c.e.d$c):java.util.List");
    }

    private static void a(List<com.fyber.inneractive.sdk.player.c.e.a> list) {
        if (t.a < 26) {
            if (list.size() <= 1 || !"OMX.MTK.AUDIO.DECODER.RAW".equals(list.get(0).a)) {
                return;
            }
            for (int i = 1; i < list.size(); i++) {
                com.fyber.inneractive.sdk.player.c.e.a aVar = list.get(i);
                if ("OMX.google.raw.decoder".equals(aVar.a)) {
                    list.remove(i);
                    list.add(0, aVar);
                    return;
                }
            }
        }
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        Integer valueOf;
        Integer num;
        if (strArr.length < 2) {
            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                num = valueOf2;
            } else {
                Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            Integer valueOf3 = Integer.valueOf(d.get(num.intValue()));
            if (valueOf3 == null) {
                Log.w("MediaCodecUtil", "Unknown AVC profile: " + num);
                return null;
            }
            Integer valueOf4 = Integer.valueOf(e.get(valueOf.intValue()));
            if (valueOf4 == null) {
                Log.w("MediaCodecUtil", "Unknown AVC level: " + valueOf);
                return null;
            }
            return new Pair<>(valueOf3, valueOf4);
        } catch (NumberFormatException unused) {
            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e implements c {
        private final int a;
        private MediaCodecInfo[] b;

        @Override // com.fyber.inneractive.sdk.player.c.e.d.c
        public final boolean b() {
            return true;
        }

        public e(boolean z) {
            this.a = z ? 1 : 0;
        }

        @Override // com.fyber.inneractive.sdk.player.c.e.d.c
        public final int a() {
            c();
            return this.b.length;
        }

        @Override // com.fyber.inneractive.sdk.player.c.e.d.c
        public final MediaCodecInfo a(int i) {
            c();
            return this.b[i];
        }

        @Override // com.fyber.inneractive.sdk.player.c.e.d.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        private void c() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fyber.inneractive.sdk.player.c.e.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0059d implements c {
        @Override // com.fyber.inneractive.sdk.player.c.e.d.c
        public final boolean b() {
            return false;
        }

        private C0059d() {
        }

        /* synthetic */ C0059d(byte b) {
            this();
        }

        @Override // com.fyber.inneractive.sdk.player.c.e.d.c
        public final int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.fyber.inneractive.sdk.player.c.e.d.c
        public final MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.fyber.inneractive.sdk.player.c.e.d.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final int hashCode() {
            String str = this.a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.b ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.a, aVar.a) && this.b == aVar.b) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        sparseIntArray.put(66, 1);
        d.put(77, 2);
        d.put(88, 4);
        d.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        e.put(11, 4);
        e.put(12, 8);
        e.put(13, 16);
        e.put(20, 32);
        e.put(21, 64);
        e.put(22, 128);
        e.put(30, 256);
        e.put(31, 512);
        e.put(32, 1024);
        e.put(40, 2048);
        e.put(41, 4096);
        e.put(42, 8192);
        e.put(50, 16384);
        e.put(51, 32768);
        e.put(52, 65536);
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("L30", 1);
        f.put("L60", 4);
        f.put("L63", 16);
        f.put("L90", 64);
        f.put("L93", 256);
        f.put("L120", 1024);
        f.put("L123", 4096);
        f.put("L150", 16384);
        f.put("L153", 65536);
        f.put("L156", 262144);
        f.put("L180", 1048576);
        f.put("L183", 4194304);
        f.put("L186", 16777216);
        f.put("H30", 2);
        f.put("H60", 8);
        f.put("H63", 32);
        f.put("H90", 128);
        f.put("H93", 512);
        f.put("H120", 2048);
        f.put("H123", 8192);
        f.put("H150", 32768);
        f.put("H153", 131072);
        f.put("H156", 524288);
        f.put("H180", 2097152);
        f.put("H183", 8388608);
        f.put("H186", 33554432);
    }
}
