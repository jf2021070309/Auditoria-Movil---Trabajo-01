package com.amazon.aps.iva.j6;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.aps.iva.h6.p;
import com.amazon.aps.iva.j6.d;
import com.amazon.aps.iva.j6.e;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.q5.l;
import com.amazon.aps.iva.q5.r;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.c0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t6.m;
import com.google.android.gms.ads.AdRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
/* compiled from: HlsPlaylistParser.java */
/* loaded from: classes.dex */
public final class g implements m.a<f> {
    public final e a;
    public final d b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern j = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern n = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern s = b("CAN-SKIP-DATERANGES");
    public static final Pattern t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern w = b("CAN-BLOCK-RELOAD");
    public static final Pattern x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern T = b("AUTOSELECT");
    public static final Pattern U = b("DEFAULT");
    public static final Pattern V = b("FORCED");
    public static final Pattern W = b("INDEPENDENT");
    public static final Pattern X = b("GAP");
    public static final Pattern Y = b("PRECISE");
    public static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern a0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* compiled from: HlsPlaylistParser.java */
    /* loaded from: classes.dex */
    public static final class a extends IOException {
    }

    /* compiled from: HlsPlaylistParser.java */
    /* loaded from: classes.dex */
    public static class b {
        public final BufferedReader a;
        public final Queue<String> b;
        public String c;

        public b(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
            this.b = arrayDeque;
            this.a = bufferedReader;
        }

        public final boolean a() throws IOException {
            String trim;
            if (this.c != null) {
                return true;
            }
            Queue<String> queue = this.b;
            if (!queue.isEmpty()) {
                String poll = queue.poll();
                poll.getClass();
                this.c = poll;
                return true;
            }
            do {
                String readLine = this.a.readLine();
                this.c = readLine;
                if (readLine != null) {
                    trim = readLine.trim();
                    this.c = trim;
                } else {
                    return false;
                }
            } while (trim.isEmpty());
            return true;
        }

        public final String b() throws IOException {
            if (a()) {
                String str = this.c;
                this.c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public g() {
        this(e.n, null);
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static r c(String str, r.b[] bVarArr) {
        r.b[] bVarArr2 = new r.b[bVarArr.length];
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            r.b bVar = bVarArr[i2];
            bVarArr2[i2] = new r.b(bVar.c, bVar.d, bVar.e, null);
        }
        return new r(str, true, bVarArr2);
    }

    public static r.b d(String str, String str2, HashMap hashMap) throws h0 {
        String k2 = k(str, J, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = K;
        if (equals) {
            String l2 = l(str, pattern, hashMap);
            return new r.b(l.d, null, "video/mp4", Base64.decode(l2.substring(l2.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new r.b(l.d, null, "hls", g0.H(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !"1".equals(k2)) {
                return null;
            }
            String l3 = l(str, pattern, hashMap);
            byte[] decode = Base64.decode(l3.substring(l3.indexOf(44)), 0);
            UUID uuid = l.e;
            return new r.b(uuid, null, "video/mp4", com.amazon.aps.iva.o7.i.a(uuid, null, decode));
        }
    }

    public static int e(String str, Pattern pattern) throws h0 {
        return Integer.parseInt(l(str, pattern, Collections.emptyMap()));
    }

    public static d f(e eVar, d dVar, b bVar, String str) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        HashMap hashMap2;
        HashMap hashMap3;
        int i2;
        String str4;
        ArrayList arrayList3;
        int i3;
        String hexString;
        long j2;
        HashMap hashMap4;
        long j3;
        boolean z2;
        r rVar;
        String hexString2;
        long j4;
        String hexString3;
        String str5;
        boolean z3 = eVar.c;
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        d.e eVar2 = new d.e(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str6 = "";
        d dVar2 = dVar;
        e eVar3 = eVar;
        boolean z4 = z3;
        d.e eVar4 = eVar2;
        String str7 = "";
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = -1;
        int i4 = 0;
        long j14 = -9223372036854775807L;
        boolean z5 = false;
        boolean z6 = false;
        int i5 = 0;
        int i6 = 1;
        long j15 = -9223372036854775807L;
        long j16 = -9223372036854775807L;
        boolean z7 = false;
        r rVar2 = null;
        r rVar3 = null;
        boolean z8 = false;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i7 = 0;
        boolean z9 = false;
        d.c cVar = null;
        ArrayList arrayList8 = arrayList5;
        d.a aVar = null;
        while (bVar.a()) {
            String b2 = bVar.b();
            if (b2.startsWith("#EXT")) {
                arrayList7.add(b2);
            }
            if (b2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String l2 = l(b2, q, hashMap5);
                if ("VOD".equals(l2)) {
                    i4 = 1;
                } else if ("EVENT".equals(l2)) {
                    i4 = 2;
                }
            } else if (b2.equals("#EXT-X-I-FRAMES-ONLY")) {
                z9 = true;
            } else if (b2.startsWith("#EXT-X-START")) {
                double parseDouble = Double.parseDouble(l(b2, C, Collections.emptyMap()));
                z5 = h(b2, Y);
                j14 = (long) (parseDouble * 1000000.0d);
                i4 = i4;
            } else {
                int i8 = i4;
                if (b2.startsWith("#EXT-X-SERVER-CONTROL")) {
                    double i9 = i(b2, r);
                    long j17 = i9 == -9.223372036854776E18d ? -9223372036854775807L : (long) (i9 * 1000000.0d);
                    boolean h2 = h(b2, s);
                    double i10 = i(b2, u);
                    long j18 = i10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (i10 * 1000000.0d);
                    double i11 = i(b2, v);
                    eVar4 = new d.e(j17, h2, j18, i11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (i11 * 1000000.0d), h(b2, w));
                } else if (b2.startsWith("#EXT-X-PART-INF")) {
                    j16 = (long) (Double.parseDouble(l(b2, o, Collections.emptyMap())) * 1000000.0d);
                } else {
                    boolean startsWith = b2.startsWith("#EXT-X-MAP");
                    Pattern pattern = E;
                    arrayList2 = arrayList7;
                    Pattern pattern2 = K;
                    if (startsWith) {
                        String l3 = l(b2, pattern2, hashMap5);
                        String k2 = k(b2, pattern, null, hashMap5);
                        if (k2 != null) {
                            int i12 = g0.a;
                            String[] split = k2.split("@", -1);
                            j13 = Long.parseLong(split[0]);
                            if (split.length > 1) {
                                j7 = Long.parseLong(split[1]);
                            }
                        }
                        int i13 = (j13 > (-1L) ? 1 : (j13 == (-1L) ? 0 : -1));
                        if (i13 == 0) {
                            j7 = 0;
                        }
                        if (str9 != null && str8 == null) {
                            throw h0.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        cVar = new d.c(l3, str9, j7, str8, j13);
                        if (i13 != 0) {
                            j7 += j13;
                        }
                        i4 = i8;
                        j13 = -1;
                        arrayList7 = arrayList2;
                    } else {
                        hashMap = hashMap6;
                        d.a aVar2 = aVar;
                        if (b2.startsWith("#EXT-X-TARGETDURATION")) {
                            j15 = e(b2, m) * 1000000;
                        } else if (b2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            j6 = Long.parseLong(l(b2, x, Collections.emptyMap()));
                            arrayList = arrayList6;
                            str2 = str6;
                            j8 = j6;
                            str3 = str10;
                            aVar = aVar2;
                            arrayList6 = arrayList;
                            str10 = str3;
                            i4 = i8;
                            arrayList7 = arrayList2;
                            hashMap6 = hashMap;
                            str6 = str2;
                        } else if (b2.startsWith("#EXT-X-VERSION")) {
                            i6 = e(b2, p);
                        } else {
                            if (b2.startsWith("#EXT-X-DEFINE")) {
                                String k3 = k(b2, a0, null, hashMap5);
                                if (k3 != null) {
                                    String str11 = eVar3.l.get(k3);
                                    if (str11 != null) {
                                        hashMap5.put(k3, str11);
                                    }
                                } else {
                                    hashMap5.put(l(b2, P, hashMap5), l(b2, Z, hashMap5));
                                }
                                hashMap2 = hashMap5;
                                arrayList = arrayList6;
                                str2 = str6;
                                str3 = str10;
                                hashMap3 = hashMap;
                            } else if (b2.startsWith("#EXTINF")) {
                                j11 = new BigDecimal(l(b2, y, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                str7 = k(b2, z, str6, hashMap5);
                            } else {
                                if (b2.startsWith("#EXT-X-SKIP")) {
                                    int e2 = e(b2, t);
                                    com.amazon.aps.iva.cq.b.C(dVar2 != null && arrayList4.isEmpty());
                                    int i14 = g0.a;
                                    int i15 = (int) (j6 - dVar2.k);
                                    int i16 = e2 + i15;
                                    if (i15 < 0 || i16 > dVar2.r.size()) {
                                        throw new a();
                                    }
                                    while (i15 < i16) {
                                        d.c cVar2 = (d.c) dVar2.r.get(i15);
                                        String str12 = str6;
                                        if (j6 != dVar2.k) {
                                            int i17 = (dVar2.j - i5) + cVar2.e;
                                            ArrayList arrayList9 = new ArrayList();
                                            long j19 = j10;
                                            int i18 = 0;
                                            while (true) {
                                                ImmutableList immutableList = cVar2.n;
                                                i2 = i16;
                                                if (i18 >= immutableList.size()) {
                                                    break;
                                                }
                                                d.a aVar3 = (d.a) immutableList.get(i18);
                                                arrayList9.add(new d.a(aVar3.b, aVar3.c, aVar3.d, i17, j19, aVar3.g, aVar3.h, aVar3.i, aVar3.j, aVar3.k, aVar3.l, aVar3.m, aVar3.n));
                                                j19 += aVar3.d;
                                                i18++;
                                                i16 = i2;
                                                str12 = str12;
                                                arrayList6 = arrayList6;
                                            }
                                            str4 = str12;
                                            arrayList3 = arrayList6;
                                            cVar2 = new d.c(cVar2.b, cVar2.c, cVar2.m, cVar2.d, i17, j10, cVar2.g, cVar2.h, cVar2.i, cVar2.j, cVar2.k, cVar2.l, arrayList9);
                                        } else {
                                            i2 = i16;
                                            str4 = str12;
                                            arrayList3 = arrayList6;
                                        }
                                        arrayList4.add(cVar2);
                                        j10 += cVar2.d;
                                        long j20 = cVar2.k;
                                        if (j20 != -1) {
                                            j7 = cVar2.j + j20;
                                        }
                                        String str13 = cVar2.i;
                                        if (str13 == null || !str13.equals(Long.toHexString(j8))) {
                                            str8 = str13;
                                        }
                                        j8++;
                                        i15++;
                                        int i19 = cVar2.e;
                                        d.c cVar3 = cVar2.c;
                                        r rVar4 = cVar2.g;
                                        dVar2 = dVar;
                                        i7 = i19;
                                        str9 = cVar2.h;
                                        cVar = cVar3;
                                        rVar3 = rVar4;
                                        i16 = i2;
                                        j9 = j10;
                                        str6 = str4;
                                        arrayList6 = arrayList3;
                                    }
                                    str2 = str6;
                                    eVar3 = eVar;
                                    dVar2 = dVar;
                                    arrayList = arrayList6;
                                    str3 = str10;
                                    aVar = aVar2;
                                } else {
                                    ArrayList arrayList10 = arrayList6;
                                    str2 = str6;
                                    if (b2.startsWith("#EXT-X-KEY")) {
                                        String l4 = l(b2, H, hashMap5);
                                        String k4 = k(b2, I, "identity", hashMap5);
                                        if ("NONE".equals(l4)) {
                                            treeMap.clear();
                                            str5 = null;
                                        } else {
                                            String k5 = k(b2, L, null, hashMap5);
                                            if ("identity".equals(k4)) {
                                                if ("AES-128".equals(l4)) {
                                                    str9 = l(b2, pattern2, hashMap5);
                                                    str8 = k5;
                                                    eVar3 = eVar;
                                                    dVar2 = dVar;
                                                    i4 = i8;
                                                    arrayList7 = arrayList2;
                                                    hashMap6 = hashMap;
                                                    aVar = aVar2;
                                                    str6 = str2;
                                                    arrayList6 = arrayList10;
                                                }
                                            } else {
                                                String str14 = str10;
                                                if (str14 == null) {
                                                    str10 = ("SAMPLE-AES-CENC".equals(l4) || "SAMPLE-AES-CTR".equals(l4)) ? "cenc" : "cbcs";
                                                } else {
                                                    str10 = str14;
                                                }
                                                r.b d2 = d(b2, k4, hashMap5);
                                                if (d2 != null) {
                                                    treeMap.put(k4, d2);
                                                    str5 = k5;
                                                }
                                            }
                                            str8 = k5;
                                            str9 = null;
                                            eVar3 = eVar;
                                            dVar2 = dVar;
                                            i4 = i8;
                                            arrayList7 = arrayList2;
                                            hashMap6 = hashMap;
                                            aVar = aVar2;
                                            str6 = str2;
                                            arrayList6 = arrayList10;
                                        }
                                        str8 = str5;
                                        rVar3 = null;
                                        str9 = null;
                                        eVar3 = eVar;
                                        dVar2 = dVar;
                                        i4 = i8;
                                        arrayList7 = arrayList2;
                                        hashMap6 = hashMap;
                                        aVar = aVar2;
                                        str6 = str2;
                                        arrayList6 = arrayList10;
                                    } else {
                                        str3 = str10;
                                        if (b2.startsWith("#EXT-X-BYTERANGE")) {
                                            String l5 = l(b2, D, hashMap5);
                                            int i20 = g0.a;
                                            String[] split2 = l5.split("@", -1);
                                            j13 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j7 = Long.parseLong(split2[1]);
                                            }
                                        } else if (b2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i5 = Integer.parseInt(b2.substring(b2.indexOf(58) + 1));
                                            eVar3 = eVar;
                                            dVar2 = dVar;
                                            aVar = aVar2;
                                            arrayList = arrayList10;
                                            z6 = true;
                                        } else if (b2.equals("#EXT-X-DISCONTINUITY")) {
                                            i7++;
                                        } else {
                                            if (b2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j5 == 0) {
                                                    j5 = g0.Q(g0.T(b2.substring(b2.indexOf(58) + 1))) - j10;
                                                } else {
                                                    arrayList = arrayList10;
                                                }
                                            } else if (b2.equals("#EXT-X-GAP")) {
                                                eVar3 = eVar;
                                                dVar2 = dVar;
                                                aVar = aVar2;
                                                arrayList = arrayList10;
                                                z8 = true;
                                            } else if (b2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                eVar3 = eVar;
                                                dVar2 = dVar;
                                                aVar = aVar2;
                                                arrayList = arrayList10;
                                                z4 = true;
                                            } else if (b2.equals("#EXT-X-ENDLIST")) {
                                                eVar3 = eVar;
                                                dVar2 = dVar;
                                                aVar = aVar2;
                                                arrayList = arrayList10;
                                                z7 = true;
                                            } else if (b2.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long j21 = j(b2, A);
                                                Matcher matcher = B.matcher(b2);
                                                if (matcher.find()) {
                                                    String group = matcher.group(1);
                                                    group.getClass();
                                                    i3 = Integer.parseInt(group);
                                                } else {
                                                    i3 = -1;
                                                }
                                                d.b bVar2 = new d.b(Uri.parse(c0.c(str, l(b2, pattern2, hashMap5))), j21, i3);
                                                arrayList = arrayList10;
                                                arrayList.add(bVar2);
                                            } else {
                                                arrayList = arrayList10;
                                                if (b2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                    if (aVar2 == null && "PART".equals(l(b2, N, hashMap5))) {
                                                        String l6 = l(b2, pattern2, hashMap5);
                                                        long j22 = j(b2, F);
                                                        long j23 = j(b2, G);
                                                        if (str9 == null) {
                                                            hexString3 = null;
                                                        } else {
                                                            hexString3 = str8 != null ? str8 : Long.toHexString(j8);
                                                        }
                                                        if (rVar3 == null && !treeMap.isEmpty()) {
                                                            r.b[] bVarArr = (r.b[]) treeMap.values().toArray(new r.b[0]);
                                                            r rVar5 = new r(str3, true, bVarArr);
                                                            if (rVar2 == null) {
                                                                rVar2 = c(str3, bVarArr);
                                                            }
                                                            rVar3 = rVar5;
                                                        }
                                                        int i21 = (j22 > (-1L) ? 1 : (j22 == (-1L) ? 0 : -1));
                                                        if (i21 == 0 || j23 != -1) {
                                                            aVar = new d.a(l6, cVar, 0L, i7, j9, rVar3, str9, hexString3, i21 != 0 ? j22 : 0L, j23, false, false, true);
                                                        } else {
                                                            aVar = aVar2;
                                                        }
                                                        eVar3 = eVar;
                                                        dVar2 = dVar;
                                                    }
                                                } else if (b2.startsWith("#EXT-X-PART")) {
                                                    if (str9 == null) {
                                                        hexString2 = null;
                                                    } else {
                                                        hexString2 = str8 != null ? str8 : Long.toHexString(j8);
                                                    }
                                                    String l7 = l(b2, pattern2, hashMap5);
                                                    long parseDouble2 = (long) (Double.parseDouble(l(b2, n, Collections.emptyMap())) * 1000000.0d);
                                                    boolean h3 = h(b2, W) | (z4 && arrayList8.isEmpty());
                                                    boolean h4 = h(b2, X);
                                                    String k6 = k(b2, pattern, null, hashMap5);
                                                    if (k6 != null) {
                                                        int i22 = g0.a;
                                                        String[] split3 = k6.split("@", -1);
                                                        j4 = Long.parseLong(split3[0]);
                                                        if (split3.length > 1) {
                                                            j12 = Long.parseLong(split3[1]);
                                                        }
                                                    } else {
                                                        j4 = -1;
                                                    }
                                                    int i23 = (j4 > (-1L) ? 1 : (j4 == (-1L) ? 0 : -1));
                                                    if (i23 == 0) {
                                                        j12 = 0;
                                                    }
                                                    if (rVar3 == null && !treeMap.isEmpty()) {
                                                        r.b[] bVarArr2 = (r.b[]) treeMap.values().toArray(new r.b[0]);
                                                        r rVar6 = new r(str3, true, bVarArr2);
                                                        if (rVar2 == null) {
                                                            rVar2 = c(str3, bVarArr2);
                                                        }
                                                        rVar3 = rVar6;
                                                    }
                                                    arrayList8.add(new d.a(l7, cVar, parseDouble2, i7, j9, rVar3, str9, hexString2, j12, j4, h4, h3, false));
                                                    j9 += parseDouble2;
                                                    if (i23 != 0) {
                                                        j12 += j4;
                                                    }
                                                    eVar3 = eVar;
                                                    dVar2 = dVar;
                                                    arrayList6 = arrayList;
                                                    str10 = str3;
                                                    i4 = i8;
                                                    arrayList7 = arrayList2;
                                                    hashMap6 = hashMap;
                                                    aVar = aVar2;
                                                    str6 = str2;
                                                } else if (!b2.startsWith("#")) {
                                                    if (str9 == null) {
                                                        hexString = null;
                                                    } else {
                                                        hexString = str8 != null ? str8 : Long.toHexString(j8);
                                                    }
                                                    long j24 = j8 + 1;
                                                    String m2 = m(b2, hashMap5);
                                                    d.c cVar4 = (d.c) hashMap.get(m2);
                                                    int i24 = (j13 > (-1L) ? 1 : (j13 == (-1L) ? 0 : -1));
                                                    if (i24 == 0) {
                                                        j2 = 0;
                                                    } else {
                                                        if (z9 && cVar == null && cVar4 == null) {
                                                            cVar4 = new d.c(m2, null, 0L, null, j7);
                                                            hashMap.put(m2, cVar4);
                                                        }
                                                        j2 = j7;
                                                    }
                                                    if (rVar3 != null || treeMap.isEmpty()) {
                                                        hashMap4 = hashMap5;
                                                        j3 = j24;
                                                        z2 = false;
                                                        rVar = rVar3;
                                                    } else {
                                                        hashMap4 = hashMap5;
                                                        j3 = j24;
                                                        z2 = false;
                                                        r.b[] bVarArr3 = (r.b[]) treeMap.values().toArray(new r.b[0]);
                                                        rVar = new r(str3, true, bVarArr3);
                                                        if (rVar2 == null) {
                                                            rVar2 = c(str3, bVarArr3);
                                                        }
                                                    }
                                                    arrayList4.add(new d.c(m2, cVar != null ? cVar : cVar4, str7, j11, i7, j10, rVar, str9, hexString, j2, j13, z8, arrayList8));
                                                    j9 = j10 + j11;
                                                    arrayList8 = new ArrayList();
                                                    if (i24 != 0) {
                                                        j2 += j13;
                                                    }
                                                    j7 = j2;
                                                    eVar3 = eVar;
                                                    dVar2 = dVar;
                                                    z8 = z2;
                                                    str10 = str3;
                                                    rVar3 = rVar;
                                                    hashMap6 = hashMap;
                                                    i4 = i8;
                                                    j11 = 0;
                                                    j13 = -1;
                                                    j10 = j9;
                                                    hashMap5 = hashMap4;
                                                    j8 = j3;
                                                    arrayList7 = arrayList2;
                                                    aVar = aVar2;
                                                    str6 = str2;
                                                    str7 = str6;
                                                    arrayList6 = arrayList;
                                                }
                                            }
                                            hashMap2 = hashMap5;
                                            hashMap3 = hashMap;
                                        }
                                        eVar3 = eVar;
                                        dVar2 = dVar;
                                        aVar = aVar2;
                                        arrayList = arrayList10;
                                    }
                                }
                                arrayList6 = arrayList;
                                str10 = str3;
                                i4 = i8;
                                arrayList7 = arrayList2;
                                hashMap6 = hashMap;
                                str6 = str2;
                            }
                            eVar3 = eVar;
                            dVar2 = dVar;
                            arrayList6 = arrayList;
                            str10 = str3;
                            hashMap6 = hashMap3;
                            i4 = i8;
                            hashMap5 = hashMap2;
                            arrayList7 = arrayList2;
                            aVar = aVar2;
                            str6 = str2;
                        }
                        arrayList = arrayList6;
                        str2 = str6;
                        str3 = str10;
                        aVar = aVar2;
                        arrayList6 = arrayList;
                        str10 = str3;
                        i4 = i8;
                        arrayList7 = arrayList2;
                        hashMap6 = hashMap;
                        str6 = str2;
                    }
                }
                hashMap = hashMap6;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                str2 = str6;
                str3 = str10;
                arrayList6 = arrayList;
                str10 = str3;
                i4 = i8;
                arrayList7 = arrayList2;
                hashMap6 = hashMap;
                str6 = str2;
            }
        }
        int i25 = i4;
        d.a aVar4 = aVar;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList7;
        HashMap hashMap7 = new HashMap();
        for (int i26 = 0; i26 < arrayList11.size(); i26++) {
            d.b bVar3 = (d.b) arrayList11.get(i26);
            long j25 = bVar3.b;
            if (j25 == -1) {
                j25 = (j6 + arrayList4.size()) - (arrayList8.isEmpty() ? 1L : 0L);
            }
            int i27 = bVar3.c;
            if (i27 == -1 && j16 != -9223372036854775807L) {
                i27 = (arrayList8.isEmpty() ? ((d.c) Iterables.getLast(arrayList4)).n : arrayList8).size() - 1;
                Uri uri = bVar3.a;
                hashMap7.put(uri, new d.b(uri, j25, i27));
            }
            Uri uri2 = bVar3.a;
            hashMap7.put(uri2, new d.b(uri2, j25, i27));
        }
        if (aVar4 != null) {
            arrayList8.add(aVar4);
        }
        return new d(i25, str, arrayList12, j14, z5, j5, z6, i5, j6, i6, j15, j16, z4, z7, j5 != 0, rVar2, arrayList4, arrayList8, eVar4, hashMap7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13, types: [int] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    public static e g(b bVar, String str) throws IOException {
        ArrayList arrayList;
        String str2;
        int i2;
        int i3;
        Uri d2;
        char c2;
        v vVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        e.b bVar2;
        String str3;
        ArrayList arrayList4;
        v vVar2;
        v vVar3;
        int parseInt;
        String str4;
        e.b bVar3;
        String str5;
        e.b bVar4;
        HashSet hashSet;
        HashMap hashMap;
        boolean z2;
        int i4;
        ArrayList arrayList5;
        int i5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i6;
        int i7;
        ArrayList arrayList9;
        float f2;
        Uri d3;
        HashMap hashMap2;
        String str6;
        String str7 = str;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            boolean a2 = bVar.a();
            Pattern pattern = K;
            String str8 = "application/x-mpegURL";
            boolean z5 = z3;
            Pattern pattern2 = P;
            if (a2) {
                String b2 = bVar.b();
                ArrayList arrayList18 = arrayList14;
                if (b2.startsWith("#EXT")) {
                    arrayList17.add(b2);
                }
                boolean startsWith = b2.startsWith("#EXT-X-I-FRAME-STREAM-INF");
                ArrayList arrayList19 = arrayList17;
                if (b2.startsWith("#EXT-X-DEFINE")) {
                    hashMap4.put(l(b2, pattern2, hashMap4), l(b2, Z, hashMap4));
                } else if (b2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z3 = true;
                    arrayList9 = arrayList15;
                    arrayList8 = arrayList11;
                    arrayList7 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList5 = arrayList16;
                    hashMap2 = hashMap3;
                    hashMap3 = hashMap2;
                    arrayList14 = arrayList18;
                    arrayList17 = arrayList19;
                    arrayList16 = arrayList5;
                    arrayList13 = arrayList6;
                    arrayList12 = arrayList7;
                    arrayList11 = arrayList8;
                    arrayList15 = arrayList9;
                } else if (b2.startsWith("#EXT-X-MEDIA")) {
                    arrayList15.add(b2);
                } else if (b2.startsWith("#EXT-X-SESSION-KEY")) {
                    r.b d4 = d(b2, k(b2, I, "identity", hashMap4), hashMap4);
                    if (d4 != null) {
                        String l2 = l(b2, H, hashMap4);
                        if (!"SAMPLE-AES-CENC".equals(l2) && !"SAMPLE-AES-CTR".equals(l2)) {
                            str6 = "cbcs";
                        } else {
                            str6 = "cenc";
                        }
                        arrayList16.add(new r(str6, true, d4));
                    }
                } else if (b2.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    boolean contains = b2.contains("CLOSED-CAPTIONS=NONE") | z4;
                    if (startsWith) {
                        i4 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i4 = 0;
                    }
                    int e2 = e(b2, h);
                    Matcher matcher = c.matcher(b2);
                    if (matcher.find()) {
                        arrayList5 = arrayList16;
                        String group = matcher.group(1);
                        group.getClass();
                        i5 = Integer.parseInt(group);
                    } else {
                        arrayList5 = arrayList16;
                        i5 = -1;
                    }
                    arrayList6 = arrayList13;
                    String k2 = k(b2, j, null, hashMap4);
                    arrayList7 = arrayList12;
                    String k3 = k(b2, k, null, hashMap4);
                    if (k3 != null) {
                        int i8 = g0.a;
                        arrayList8 = arrayList11;
                        String[] split = k3.split("x", -1);
                        i6 = Integer.parseInt(split[0]);
                        i7 = Integer.parseInt(split[1]);
                        if (i6 <= 0 || i7 <= 0) {
                            i7 = -1;
                            i6 = -1;
                        }
                    } else {
                        arrayList8 = arrayList11;
                        i6 = -1;
                        i7 = -1;
                    }
                    arrayList9 = arrayList15;
                    String k4 = k(b2, l, null, hashMap4);
                    if (k4 != null) {
                        f2 = Float.parseFloat(k4);
                    } else {
                        f2 = -1.0f;
                    }
                    HashMap hashMap5 = hashMap3;
                    String k5 = k(b2, d, null, hashMap4);
                    String k6 = k(b2, e, null, hashMap4);
                    String k7 = k(b2, f, null, hashMap4);
                    String k8 = k(b2, g, null, hashMap4);
                    if (startsWith) {
                        d3 = c0.d(str7, l(b2, pattern, hashMap4));
                    } else if (bVar.a()) {
                        d3 = c0.d(str7, m(bVar.b(), hashMap4));
                    } else {
                        throw h0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                    }
                    v.a aVar = new v.a();
                    aVar.b(arrayList10.size());
                    aVar.j = "application/x-mpegURL";
                    aVar.h = k2;
                    aVar.f = i5;
                    aVar.g = e2;
                    aVar.p = i6;
                    aVar.q = i7;
                    aVar.r = f2;
                    aVar.e = i4;
                    arrayList10.add(new e.b(d3, new v(aVar), k5, k6, k7, k8));
                    hashMap2 = hashMap5;
                    ArrayList arrayList20 = (ArrayList) hashMap2.get(d3);
                    if (arrayList20 == null) {
                        arrayList20 = new ArrayList();
                        hashMap2.put(d3, arrayList20);
                    }
                    arrayList20.add(new p.b(i5, e2, k5, k6, k7, k8));
                    z3 = z5;
                    z4 = contains;
                    hashMap3 = hashMap2;
                    arrayList14 = arrayList18;
                    arrayList17 = arrayList19;
                    arrayList16 = arrayList5;
                    arrayList13 = arrayList6;
                    arrayList12 = arrayList7;
                    arrayList11 = arrayList8;
                    arrayList15 = arrayList9;
                }
                z3 = z5;
                arrayList9 = arrayList15;
                arrayList8 = arrayList11;
                arrayList7 = arrayList12;
                arrayList6 = arrayList13;
                arrayList5 = arrayList16;
                hashMap2 = hashMap3;
                hashMap3 = hashMap2;
                arrayList14 = arrayList18;
                arrayList17 = arrayList19;
                arrayList16 = arrayList5;
                arrayList13 = arrayList6;
                arrayList12 = arrayList7;
                arrayList11 = arrayList8;
                arrayList15 = arrayList9;
            } else {
                ArrayList arrayList21 = arrayList15;
                ArrayList arrayList22 = arrayList11;
                ArrayList arrayList23 = arrayList12;
                ArrayList arrayList24 = arrayList13;
                ArrayList arrayList25 = arrayList14;
                ArrayList arrayList26 = arrayList17;
                ArrayList arrayList27 = arrayList16;
                HashMap hashMap6 = hashMap3;
                ArrayList arrayList28 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i9 = 0;
                while (i9 < arrayList10.size()) {
                    e.b bVar5 = (e.b) arrayList10.get(i9);
                    if (hashSet2.add(bVar5.a)) {
                        v vVar4 = bVar5.b;
                        if (vVar4.k == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        com.amazon.aps.iva.cq.b.C(z2);
                        ArrayList arrayList29 = (ArrayList) hashMap6.get(bVar5.a);
                        arrayList29.getClass();
                        f0 f0Var = new f0(new p(null, null, arrayList29));
                        v.a aVar2 = new v.a(vVar4);
                        aVar2.i = f0Var;
                        hashSet = hashSet2;
                        hashMap = hashMap6;
                        arrayList28.add(new e.b(bVar5.a, new v(aVar2), bVar5.c, bVar5.d, bVar5.e, bVar5.f));
                    } else {
                        hashSet = hashSet2;
                        hashMap = hashMap6;
                    }
                    i9++;
                    hashSet2 = hashSet;
                    hashMap6 = hashMap;
                }
                int i10 = 0;
                ArrayList arrayList30 = null;
                v vVar5 = null;
                while (i10 < arrayList21.size()) {
                    String str9 = (String) arrayList21.get(i10);
                    String l3 = l(str9, Q, hashMap4);
                    String l4 = l(str9, pattern2, hashMap4);
                    v.a aVar3 = new v.a();
                    aVar3.a = q.b(l3, ":", l4);
                    aVar3.b = l4;
                    aVar3.j = str8;
                    boolean h2 = h(str9, U);
                    Pattern pattern3 = pattern2;
                    boolean z6 = h2;
                    if (h(str9, V)) {
                        z6 = (h2 ? 1 : 0) | true;
                    }
                    ?? r5 = z6;
                    if (h(str9, T)) {
                        r5 = (z6 ? 1 : 0) | true;
                    }
                    aVar3.d = r5;
                    String k9 = k(str9, R, null, hashMap4);
                    if (TextUtils.isEmpty(k9)) {
                        i3 = 0;
                        str2 = str8;
                    } else {
                        int i11 = g0.a;
                        str2 = str8;
                        String[] split2 = k9.split(",", -1);
                        if (g0.k(split2, "public.accessibility.describes-video")) {
                            i2 = AdRequest.MAX_CONTENT_URL_LENGTH;
                        } else {
                            i2 = 0;
                        }
                        if (g0.k(split2, "public.accessibility.transcribes-spoken-dialog")) {
                            i2 |= 4096;
                        }
                        if (g0.k(split2, "public.accessibility.describes-music-and-sound")) {
                            i2 |= 1024;
                        }
                        if (g0.k(split2, "public.easy-to-read")) {
                            i3 = i2 | 8192;
                        } else {
                            i3 = i2;
                        }
                    }
                    aVar3.e = i3;
                    aVar3.c = k(str9, O, null, hashMap4);
                    String k10 = k(str9, pattern, null, hashMap4);
                    if (k10 == null) {
                        d2 = null;
                    } else {
                        d2 = c0.d(str7, k10);
                    }
                    Pattern pattern4 = pattern;
                    f0 f0Var2 = new f0(new p(l3, l4, Collections.emptyList()));
                    String l5 = l(str9, M, hashMap4);
                    switch (l5.hashCode()) {
                        case -959297733:
                            if (l5.equals("SUBTITLES")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -333210994:
                            if (l5.equals("CLOSED-CAPTIONS")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62628790:
                            if (l5.equals("AUDIO")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 81665115:
                            if (l5.equals("VIDEO")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 == 3) {
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < arrayList10.size()) {
                                            bVar4 = (e.b) arrayList10.get(i12);
                                            if (!l3.equals(bVar4.c)) {
                                                i12++;
                                            }
                                        } else {
                                            bVar4 = null;
                                        }
                                    }
                                    if (bVar4 != null) {
                                        v vVar6 = bVar4.b;
                                        String s2 = g0.s(2, vVar6.j);
                                        aVar3.h = s2;
                                        aVar3.k = com.amazon.aps.iva.q5.g0.e(s2);
                                        aVar3.p = vVar6.r;
                                        aVar3.q = vVar6.s;
                                        aVar3.r = vVar6.t;
                                    }
                                    if (d2 != null) {
                                        aVar3.i = f0Var2;
                                        arrayList3 = arrayList22;
                                        arrayList3.add(new e.a(d2, new v(aVar3), l4));
                                        vVar = vVar5;
                                        arrayList4 = arrayList24;
                                        arrayList2 = arrayList23;
                                    }
                                }
                                arrayList3 = arrayList22;
                                vVar = vVar5;
                                arrayList4 = arrayList24;
                                arrayList2 = arrayList23;
                            } else {
                                arrayList3 = arrayList22;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList10.size()) {
                                        bVar3 = (e.b) arrayList10.get(i13);
                                        vVar3 = vVar5;
                                        if (!l3.equals(bVar3.d)) {
                                            i13++;
                                            vVar5 = vVar3;
                                        }
                                    } else {
                                        vVar3 = vVar5;
                                        bVar3 = null;
                                    }
                                }
                                if (bVar3 != null) {
                                    String s3 = g0.s(1, bVar3.b.j);
                                    aVar3.h = s3;
                                    str5 = com.amazon.aps.iva.q5.g0.e(s3);
                                } else {
                                    str5 = null;
                                }
                                String k11 = k(str9, i, null, hashMap4);
                                if (k11 != null) {
                                    int i14 = g0.a;
                                    aVar3.x = Integer.parseInt(k11.split("/", 2)[0]);
                                    if ("audio/eac3".equals(str5) && k11.endsWith("/JOC")) {
                                        aVar3.h = "ec+3";
                                        str5 = "audio/eac3-joc";
                                    }
                                }
                                aVar3.k = str5;
                                if (d2 != null) {
                                    aVar3.i = f0Var2;
                                    arrayList2 = arrayList23;
                                    arrayList2.add(new e.a(d2, new v(aVar3), l4));
                                } else {
                                    arrayList2 = arrayList23;
                                    if (bVar3 != null) {
                                        vVar2 = new v(aVar3);
                                        arrayList4 = arrayList24;
                                        i10++;
                                        arrayList24 = arrayList4;
                                        arrayList23 = arrayList2;
                                        arrayList22 = arrayList3;
                                        pattern2 = pattern3;
                                        str8 = str2;
                                        pattern = pattern4;
                                        vVar5 = vVar2;
                                        str7 = str;
                                    }
                                }
                            }
                        } else {
                            vVar3 = vVar5;
                            arrayList2 = arrayList23;
                            arrayList3 = arrayList22;
                            String l6 = l(str9, S, hashMap4);
                            if (l6.startsWith("CC")) {
                                parseInt = Integer.parseInt(l6.substring(2));
                                str4 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(l6.substring(7));
                                str4 = "application/cea-708";
                            }
                            if (arrayList30 == null) {
                                arrayList30 = new ArrayList();
                            }
                            aVar3.k = str4;
                            aVar3.C = parseInt;
                            arrayList30.add(new v(aVar3));
                        }
                        vVar2 = vVar3;
                        arrayList4 = arrayList24;
                        i10++;
                        arrayList24 = arrayList4;
                        arrayList23 = arrayList2;
                        arrayList22 = arrayList3;
                        pattern2 = pattern3;
                        str8 = str2;
                        pattern = pattern4;
                        vVar5 = vVar2;
                        str7 = str;
                    } else {
                        vVar = vVar5;
                        arrayList2 = arrayList23;
                        arrayList3 = arrayList22;
                        int i15 = 0;
                        while (true) {
                            if (i15 < arrayList10.size()) {
                                bVar2 = (e.b) arrayList10.get(i15);
                                if (!l3.equals(bVar2.e)) {
                                    i15++;
                                }
                            } else {
                                bVar2 = null;
                            }
                        }
                        if (bVar2 != null) {
                            String s4 = g0.s(3, bVar2.b.j);
                            aVar3.h = s4;
                            str3 = com.amazon.aps.iva.q5.g0.e(s4);
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = "text/vtt";
                        }
                        aVar3.k = str3;
                        aVar3.i = f0Var2;
                        if (d2 != null) {
                            arrayList4 = arrayList24;
                            arrayList4.add(new e.a(d2, new v(aVar3), l4));
                        } else {
                            arrayList4 = arrayList24;
                            com.amazon.aps.iva.t5.p.g();
                        }
                    }
                    vVar2 = vVar;
                    i10++;
                    arrayList24 = arrayList4;
                    arrayList23 = arrayList2;
                    arrayList22 = arrayList3;
                    pattern2 = pattern3;
                    str8 = str2;
                    pattern = pattern4;
                    vVar5 = vVar2;
                    str7 = str;
                }
                v vVar7 = vVar5;
                ArrayList arrayList31 = arrayList24;
                ArrayList arrayList32 = arrayList23;
                ArrayList arrayList33 = arrayList22;
                if (z4) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = arrayList30;
                }
                return new e(str, arrayList26, arrayList28, arrayList33, arrayList32, arrayList31, arrayList25, vVar7, arrayList, z5, hashMap4, arrayList27);
            }
        }
    }

    public static boolean h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return -9.223372036854776E18d;
    }

    public static long j(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String k(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return m(str2, map);
        }
        return str2;
    }

    public static String l(String str, Pattern pattern, Map<String, String> map) throws h0 {
        String k2 = k(str, pattern, null, map);
        if (k2 != null) {
            return k2;
        }
        throw h0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String m(String str, Map<String, String> map) {
        Matcher matcher = b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[Catch: all -> 0x0101, LOOP:0: B:32:0x0069->B:81:0x0069, LOOP_START, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:40:0x0093, B:42:0x009b, B:44:0x00a3, B:46:0x00ab, B:48:0x00b3, B:50:0x00bb, B:52:0x00c3, B:54:0x00cb, B:57:0x00d4, B:58:0x00d8, B:63:0x00fa, B:64:0x0100, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:68:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa A[Catch: all -> 0x0101, TRY_ENTER, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:40:0x0093, B:42:0x009b, B:44:0x00a3, B:46:0x00ab, B:48:0x00b3, B:50:0x00bb, B:52:0x00c3, B:54:0x00cb, B:57:0x00d4, B:58:0x00d8, B:63:0x00fa, B:64:0x0100, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:68:0x000f }] */
    @Override // com.amazon.aps.iva.t6.m.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r7, com.amazon.aps.iva.w5.h r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j6.g.a(android.net.Uri, com.amazon.aps.iva.w5.h):java.lang.Object");
    }

    public g(e eVar, d dVar) {
        this.a = eVar;
        this.b = dVar;
    }
}
