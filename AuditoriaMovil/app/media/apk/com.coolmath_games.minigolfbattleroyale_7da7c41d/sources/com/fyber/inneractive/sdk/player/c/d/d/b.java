package com.fyber.inneractive.sdk.player.c.d.d;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.c.d.d.a;
import com.fyber.inneractive.sdk.player.c.f.a;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;
/* loaded from: classes.dex */
final class b {
    private static final int a = t.e("vide");
    private static final int b = t.e("soun");
    private static final int c = t.e("text");
    private static final int d = t.e("sbtl");
    private static final int e = t.e("subt");
    private static final int f = t.e("clcp");
    private static final int g = t.e("cenc");
    private static final int h = t.e("meta");

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private interface InterfaceC0056b {
        int a();

        int b();

        boolean c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
        if (r5 == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.player.c.d.d.i a(com.fyber.inneractive.sdk.player.c.d.d.a.C0055a r25, com.fyber.inneractive.sdk.player.c.d.d.a.b r26, long r27, com.fyber.inneractive.sdk.player.c.c.a r29, boolean r30) throws com.fyber.inneractive.sdk.player.c.l {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.d.b.a(com.fyber.inneractive.sdk.player.c.d.d.a$a, com.fyber.inneractive.sdk.player.c.d.d.a$b, long, com.fyber.inneractive.sdk.player.c.c.a, boolean):com.fyber.inneractive.sdk.player.c.d.d.i");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.player.c.d.d.l a(com.fyber.inneractive.sdk.player.c.d.d.i r44, com.fyber.inneractive.sdk.player.c.d.d.a.C0055a r45, com.fyber.inneractive.sdk.player.c.d.j r46) throws com.fyber.inneractive.sdk.player.c.l {
        /*
            Method dump skipped, instructions count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.d.b.a(com.fyber.inneractive.sdk.player.c.d.d.i, com.fyber.inneractive.sdk.player.c.d.d.a$a, com.fyber.inneractive.sdk.player.c.d.j):com.fyber.inneractive.sdk.player.c.d.d.l");
    }

    public static com.fyber.inneractive.sdk.player.c.f.a a(a.b bVar, boolean z) {
        if (z) {
            return null;
        }
        com.fyber.inneractive.sdk.player.c.k.k kVar = bVar.aQ;
        kVar.c(8);
        while (kVar.b() >= 8) {
            int i = kVar.b;
            int j = kVar.j();
            if (kVar.j() == com.fyber.inneractive.sdk.player.c.d.d.a.aB) {
                kVar.c(i);
                int i2 = i + j;
                kVar.d(12);
                while (true) {
                    if (kVar.b >= i2) {
                        break;
                    }
                    int i3 = kVar.b;
                    int j2 = kVar.j();
                    if (kVar.j() == com.fyber.inneractive.sdk.player.c.d.d.a.aC) {
                        kVar.c(i3);
                        int i4 = i3 + j2;
                        kVar.d(8);
                        ArrayList arrayList = new ArrayList();
                        while (kVar.b < i4) {
                            a.InterfaceC0060a a2 = com.fyber.inneractive.sdk.player.c.d.d.f.a(kVar);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new com.fyber.inneractive.sdk.player.c.f.a(arrayList);
                        }
                    } else {
                        kVar.d(j2 - 8);
                    }
                }
                return null;
            }
            kVar.d(j - 8);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static c a(com.fyber.inneractive.sdk.player.c.k.k kVar, int i, int i2, String str, com.fyber.inneractive.sdk.player.c.c.a aVar, boolean z) throws com.fyber.inneractive.sdk.player.c.l {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        c cVar;
        int i8;
        int i9;
        int i10;
        int i11;
        List<byte[]> list;
        int i12;
        int i13;
        int i14;
        int i15;
        String str2;
        int i16;
        int i17;
        String str3;
        int i18;
        String str4;
        boolean z2;
        int i19;
        int i20;
        String str5;
        String str6;
        String str7;
        List list2;
        long j;
        String str8;
        String str9 = str;
        com.fyber.inneractive.sdk.player.c.c.a aVar2 = aVar;
        kVar.c(12);
        int j2 = kVar.j();
        c cVar2 = new c(j2);
        int i21 = 0;
        int i22 = 0;
        while (i22 < j2) {
            int i23 = kVar.b;
            int j3 = kVar.j();
            boolean z3 = true;
            String str10 = "childAtomSize should be positive";
            com.fyber.inneractive.sdk.player.c.k.a.a(j3 > 0 ? 1 : i21, "childAtomSize should be positive");
            int j4 = kVar.j();
            if (j4 != com.fyber.inneractive.sdk.player.c.d.d.a.b && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.c && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.Z && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.al && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.d && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.e && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.f && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.aK && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.aL) {
                if (j4 != com.fyber.inneractive.sdk.player.c.d.d.a.i && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.aa && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.n && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.p && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.r && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.u && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.s && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.t && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.ay && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.az && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.l && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.m && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.j && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.aO) {
                    if (j4 != com.fyber.inneractive.sdk.player.c.d.d.a.aj && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.au && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.av && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.aw && j4 != com.fyber.inneractive.sdk.player.c.d.d.a.ax) {
                        if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.aN) {
                            cVar2.b = com.fyber.inneractive.sdk.player.c.h.a(Integer.toString(i), "application/x-camera-motion", aVar2);
                        }
                        i3 = j3;
                        i8 = i23;
                        i5 = i21;
                        cVar = cVar2;
                        i9 = j2;
                        i10 = i22;
                    } else {
                        kVar.c(i23 + 8 + 8);
                        if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.aj) {
                            list2 = null;
                            j = Long.MAX_VALUE;
                        } else {
                            if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.au) {
                                int i24 = (j3 - 8) - 8;
                                byte[] bArr = new byte[i24];
                                kVar.a(bArr, i21, i24);
                                list2 = Collections.singletonList(bArr);
                                j = Long.MAX_VALUE;
                                str8 = "application/x-quicktime-tx3g";
                            } else {
                                if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.av) {
                                    str7 = "application/x-mp4-vtt";
                                } else if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.aw) {
                                    list2 = null;
                                    j = 0;
                                } else if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.ax) {
                                    cVar2.d = 1;
                                    str7 = "application/x-mp4-cea-608";
                                } else {
                                    throw new IllegalStateException();
                                }
                                list2 = null;
                                j = Long.MAX_VALUE;
                                str8 = str7;
                            }
                            i12 = j3;
                            i6 = j2;
                            i7 = i23;
                            cVar2.b = com.fyber.inneractive.sdk.player.c.h.a(Integer.toString(i), str8, 0, str, -1, aVar, j, list2);
                        }
                        str8 = "application/ttml+xml";
                        i12 = j3;
                        i6 = j2;
                        i7 = i23;
                        cVar2.b = com.fyber.inneractive.sdk.player.c.h.a(Integer.toString(i), str8, 0, str, -1, aVar, j, list2);
                    }
                } else {
                    i12 = j3;
                    i6 = j2;
                    i7 = i23;
                    kVar.c(i7 + 8 + 8);
                    if (z) {
                        i13 = kVar.e();
                        kVar.d(6);
                    } else {
                        kVar.d(8);
                        i13 = 0;
                    }
                    if (i13 == 0 || i13 == 1) {
                        int e2 = kVar.e();
                        kVar.d(6);
                        byte[] bArr2 = kVar.a;
                        int i25 = kVar.b;
                        kVar.b = i25 + 1;
                        byte[] bArr3 = kVar.a;
                        int i26 = kVar.b;
                        kVar.b = i26 + 1;
                        i14 = ((bArr2[i25] & UByte.MAX_VALUE) << 8) | (bArr3[i26] & UByte.MAX_VALUE);
                        kVar.b += 2;
                        z3 = true;
                        if (i13 == 1) {
                            kVar.d(16);
                        }
                        i15 = e2;
                    } else if (i13 == 2) {
                        kVar.d(16);
                        i14 = (int) Math.round(Double.longBitsToDouble(kVar.l()));
                        i15 = kVar.n();
                        kVar.d(20);
                    }
                    int i27 = kVar.b;
                    if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.aa) {
                        j4 = a(kVar, i7, i12, cVar2, i22);
                        kVar.c(i27);
                    }
                    String str11 = "audio/raw";
                    if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.n) {
                        str2 = "audio/ac3";
                    } else if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.p) {
                        str2 = "audio/eac3";
                    } else if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.r) {
                        str2 = "audio/vnd.dts";
                    } else if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.s || j4 == com.fyber.inneractive.sdk.player.c.d.d.a.t) {
                        str2 = "audio/vnd.dts.hd";
                    } else if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.u) {
                        str2 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.ay) {
                        str2 = "audio/3gpp";
                    } else if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.az) {
                        str2 = "audio/amr-wb";
                    } else if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.l || j4 == com.fyber.inneractive.sdk.player.c.d.d.a.m) {
                        str2 = "audio/raw";
                    } else if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.j) {
                        str2 = "audio/mpeg";
                    } else {
                        str2 = j4 == com.fyber.inneractive.sdk.player.c.d.d.a.aO ? "audio/alac" : null;
                    }
                    String str12 = str2;
                    int i28 = i14;
                    int i29 = i15;
                    byte[] bArr4 = null;
                    while (i27 - i7 < i12) {
                        kVar.c(i27);
                        int j5 = kVar.j();
                        com.fyber.inneractive.sdk.player.c.k.a.a(j5 > 0 ? z3 : false, str10);
                        int j6 = kVar.j();
                        if (j6 == com.fyber.inneractive.sdk.player.c.d.d.a.J || (z && j6 == com.fyber.inneractive.sdk.player.c.d.d.a.k)) {
                            i16 = j5;
                            String str13 = str10;
                            String str14 = str12;
                            i17 = i22;
                            str3 = str11;
                            if (j6 != com.fyber.inneractive.sdk.player.c.d.d.a.J) {
                                i18 = kVar.b;
                                while (true) {
                                    if (i18 - i27 >= i16) {
                                        str4 = str13;
                                        i18 = -1;
                                        break;
                                    }
                                    kVar.c(i18);
                                    int j7 = kVar.j();
                                    if (j7 > 0) {
                                        str4 = str13;
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                        str4 = str13;
                                    }
                                    com.fyber.inneractive.sdk.player.c.k.a.a(z2, str4);
                                    if (kVar.j() == com.fyber.inneractive.sdk.player.c.d.d.a.J) {
                                        break;
                                    }
                                    i18 += j7;
                                    str13 = str4;
                                }
                            } else {
                                i18 = i27;
                                str4 = str13;
                            }
                            if (i18 != -1) {
                                Pair<String, byte[]> a2 = a(kVar, i18);
                                String str15 = (String) a2.first;
                                byte[] bArr5 = (byte[]) a2.second;
                                if ("audio/mp4a-latm".equals(str15)) {
                                    Pair<Integer, Integer> a3 = com.fyber.inneractive.sdk.player.c.k.c.a(bArr5);
                                    int intValue = ((Integer) a3.first).intValue();
                                    bArr4 = bArr5;
                                    i29 = ((Integer) a3.second).intValue();
                                    i28 = intValue;
                                } else {
                                    bArr4 = bArr5;
                                }
                                str12 = str15;
                            } else {
                                str12 = str14;
                            }
                        } else {
                            if (j6 == com.fyber.inneractive.sdk.player.c.d.d.a.o) {
                                kVar.c(i27 + 8);
                                cVar2.b = com.fyber.inneractive.sdk.player.c.a.a.a(kVar, Integer.toString(i), str9, aVar2);
                            } else if (j6 == com.fyber.inneractive.sdk.player.c.d.d.a.q) {
                                kVar.c(i27 + 8);
                                cVar2.b = com.fyber.inneractive.sdk.player.c.a.a.b(kVar, Integer.toString(i), str9, aVar2);
                            } else {
                                if (j6 == com.fyber.inneractive.sdk.player.c.d.d.a.v) {
                                    i19 = j5;
                                    i20 = i27;
                                    str5 = str10;
                                    str6 = str12;
                                    i17 = i22;
                                    str3 = str11;
                                    cVar2.b = com.fyber.inneractive.sdk.player.c.h.a(Integer.toString(i), str12, -1, -1, i29, i28, null, aVar, str);
                                } else {
                                    i19 = j5;
                                    i20 = i27;
                                    str5 = str10;
                                    str6 = str12;
                                    i17 = i22;
                                    str3 = str11;
                                    if (j6 == com.fyber.inneractive.sdk.player.c.d.d.a.aO) {
                                        i16 = i19;
                                        byte[] bArr6 = new byte[i16];
                                        i27 = i20;
                                        kVar.c(i27);
                                        kVar.a(bArr6, 0, i16);
                                        bArr4 = bArr6;
                                        str4 = str5;
                                        str12 = str6;
                                    }
                                }
                                i16 = i19;
                                i27 = i20;
                                str4 = str5;
                                str12 = str6;
                            }
                            i16 = j5;
                            str5 = str10;
                            str6 = str12;
                            i17 = i22;
                            str3 = str11;
                            str4 = str5;
                            str12 = str6;
                        }
                        i27 += i16;
                        str10 = str4;
                        str11 = str3;
                        i22 = i17;
                        z3 = true;
                    }
                    String str16 = str12;
                    int i30 = i22;
                    String str17 = str11;
                    if (cVar2.b != null || str16 == null) {
                        i5 = 0;
                        i3 = i12;
                        i4 = i30;
                    } else {
                        i4 = i30;
                        i3 = i12;
                        i5 = 0;
                        cVar2.b = com.fyber.inneractive.sdk.player.c.h.a(Integer.toString(i), str16, -1, -1, i29, i28, str17.equals(str16) ? 2 : -1, bArr4 == null ? null : Collections.singletonList(bArr4), aVar, 0, str);
                    }
                    cVar = cVar2;
                    i8 = i7;
                    i10 = i4;
                    i9 = i6;
                }
                i3 = i12;
                cVar = cVar2;
                i8 = i7;
                i9 = i6;
                i5 = 0;
                i10 = i22;
            } else {
                Object obj = "childAtomSize should be positive";
                i3 = j3;
                i4 = i22;
                i5 = i21;
                i6 = j2;
                i7 = i23;
                kVar.c(i7 + 8 + 8);
                kVar.d(16);
                int e3 = kVar.e();
                int e4 = kVar.e();
                float f2 = 1.0f;
                kVar.d(50);
                int i31 = kVar.b;
                if (j4 == com.fyber.inneractive.sdk.player.c.d.d.a.Z) {
                    j4 = a(kVar, i7, i3, cVar2, i4);
                    kVar.c(i31);
                }
                int i32 = -1;
                String str18 = null;
                List<byte[]> list3 = null;
                byte[] bArr7 = null;
                int i33 = i5;
                while (i31 - i7 < i3) {
                    kVar.c(i31);
                    int i34 = kVar.b;
                    int j8 = kVar.j();
                    if (j8 == 0 && kVar.b - i7 == i3) {
                        break;
                    }
                    com.fyber.inneractive.sdk.player.c.k.a.a(j8 > 0 ? 1 : i5, obj);
                    int j9 = kVar.j();
                    Object obj2 = obj;
                    if (j9 == com.fyber.inneractive.sdk.player.c.d.d.a.H) {
                        com.fyber.inneractive.sdk.player.c.k.a.b(str18 == null ? 1 : i5);
                        kVar.c(i34 + 8);
                        com.fyber.inneractive.sdk.player.c.l.a a4 = com.fyber.inneractive.sdk.player.c.l.a.a(kVar);
                        list = a4.a;
                        cVar2.c = a4.b;
                        if (i33 == 0) {
                            f2 = a4.e;
                        }
                        str18 = "video/avc";
                    } else if (j9 == com.fyber.inneractive.sdk.player.c.d.d.a.I) {
                        com.fyber.inneractive.sdk.player.c.k.a.b(str18 == null ? 1 : i5);
                        kVar.c(i34 + 8);
                        com.fyber.inneractive.sdk.player.c.l.c a5 = com.fyber.inneractive.sdk.player.c.l.c.a(kVar);
                        list = a5.a;
                        cVar2.c = a5.b;
                        str18 = "video/hevc";
                    } else {
                        if (j9 == com.fyber.inneractive.sdk.player.c.d.d.a.aM) {
                            com.fyber.inneractive.sdk.player.c.k.a.b(str18 == null ? 1 : i5);
                            str18 = j4 == com.fyber.inneractive.sdk.player.c.d.d.a.aK ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        } else if (j9 == com.fyber.inneractive.sdk.player.c.d.d.a.g) {
                            com.fyber.inneractive.sdk.player.c.k.a.b(str18 == null ? 1 : i5);
                            str18 = "video/3gpp";
                        } else {
                            if (j9 == com.fyber.inneractive.sdk.player.c.d.d.a.J) {
                                com.fyber.inneractive.sdk.player.c.k.a.b(str18 == null ? 1 : i5);
                                Pair<String, byte[]> a6 = a(kVar, i34);
                                list3 = Collections.singletonList(a6.second);
                                i11 = j4;
                                str18 = (String) a6.first;
                            } else {
                                if (j9 != com.fyber.inneractive.sdk.player.c.d.d.a.ai) {
                                    if (j9 == com.fyber.inneractive.sdk.player.c.d.d.a.aI) {
                                        int i35 = i34 + 8;
                                        while (true) {
                                            if (i35 - i34 >= j8) {
                                                i11 = j4;
                                                bArr7 = null;
                                                break;
                                            }
                                            kVar.c(i35);
                                            int j10 = kVar.j();
                                            i11 = j4;
                                            if (kVar.j() == com.fyber.inneractive.sdk.player.c.d.d.a.aJ) {
                                                bArr7 = Arrays.copyOfRange(kVar.a, i35, j10 + i35);
                                                break;
                                            }
                                            i35 += j10;
                                            j4 = i11;
                                        }
                                    } else {
                                        i11 = j4;
                                        if (j9 == com.fyber.inneractive.sdk.player.c.d.d.a.aH) {
                                            int d2 = kVar.d();
                                            kVar.d(3);
                                            if (d2 == 0) {
                                                int d3 = kVar.d();
                                                if (d3 == 0) {
                                                    i32 = i5;
                                                } else if (d3 == 1) {
                                                    i32 = 1;
                                                } else if (d3 == 2) {
                                                    i32 = 2;
                                                } else if (d3 == 3) {
                                                    i32 = 3;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    kVar.c(i34 + 8);
                                    f2 = kVar.n() / kVar.n();
                                    i11 = j4;
                                    i33 = 1;
                                }
                                i31 += j8;
                                j4 = i11;
                                obj = obj2;
                            }
                            i31 += j8;
                            j4 = i11;
                            obj = obj2;
                        }
                        i11 = j4;
                        i31 += j8;
                        j4 = i11;
                        obj = obj2;
                    }
                    i11 = j4;
                    list3 = list;
                    i31 += j8;
                    j4 = i11;
                    obj = obj2;
                }
                if (str18 != null) {
                    cVar = cVar2;
                    i8 = i7;
                    i9 = i6;
                    i10 = i4;
                    cVar.b = com.fyber.inneractive.sdk.player.c.h.a(Integer.toString(i), str18, -1, e3, e4, list3, i2, f2, bArr7, i32, null, aVar);
                }
                cVar = cVar2;
                i8 = i7;
                i10 = i4;
                i9 = i6;
            }
            kVar.c(i8 + i3);
            i22 = i10 + 1;
            str9 = str;
            aVar2 = aVar;
            j2 = i9;
            cVar2 = cVar;
            i21 = i5;
        }
        return cVar2;
    }

    private static Pair<long[], long[]> a(a.C0055a c0055a) {
        a.b d2;
        if (c0055a == null || (d2 = c0055a.d(com.fyber.inneractive.sdk.player.c.d.d.a.Q)) == null) {
            return Pair.create(null, null);
        }
        com.fyber.inneractive.sdk.player.c.k.k kVar = d2.aQ;
        kVar.c(8);
        int a2 = com.fyber.inneractive.sdk.player.c.d.d.a.a(kVar.j());
        int n = kVar.n();
        long[] jArr = new long[n];
        long[] jArr2 = new long[n];
        for (int i = 0; i < n; i++) {
            jArr[i] = a2 == 1 ? kVar.p() : kVar.h();
            jArr2[i] = a2 == 1 ? kVar.l() : kVar.j();
            byte[] bArr = kVar.a;
            int i2 = kVar.b;
            kVar.b = i2 + 1;
            byte[] bArr2 = kVar.a;
            int i3 = kVar.b;
            kVar.b = i3 + 1;
            if (((short) (((bArr[i2] & UByte.MAX_VALUE) << 8) | (bArr2[i3] & UByte.MAX_VALUE))) != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            kVar.d(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> a(com.fyber.inneractive.sdk.player.c.k.k kVar, int i) {
        kVar.c(i + 8 + 4);
        kVar.d(1);
        a(kVar);
        kVar.d(2);
        int d2 = kVar.d();
        if ((d2 & 128) != 0) {
            kVar.d(2);
        }
        if ((d2 & 64) != 0) {
            kVar.d(kVar.e());
        }
        if ((d2 & 32) != 0) {
            kVar.d(2);
        }
        kVar.d(1);
        a(kVar);
        int d3 = kVar.d();
        String str = null;
        if (d3 == 32) {
            str = "video/mp4v-es";
        } else if (d3 == 33) {
            str = "video/avc";
        } else if (d3 != 35) {
            if (d3 != 64) {
                if (d3 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (d3 == 165) {
                    str = "audio/ac3";
                } else if (d3 != 166) {
                    switch (d3) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (d3) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        kVar.d(12);
        kVar.d(1);
        int a2 = a(kVar);
        byte[] bArr = new byte[a2];
        kVar.a(bArr, 0, a2);
        return Pair.create(str, bArr);
    }

    private static int a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        int d2 = kVar.d();
        int i = d2 & 127;
        while ((d2 & 128) == 128) {
            d2 = kVar.d();
            i = (i << 7) | (d2 & 127);
        }
        return i;
    }

    /* loaded from: classes.dex */
    private static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final com.fyber.inneractive.sdk.player.c.k.k f;
        private final com.fyber.inneractive.sdk.player.c.k.k g;
        private int h;
        private int i;

        public a(com.fyber.inneractive.sdk.player.c.k.k kVar, com.fyber.inneractive.sdk.player.c.k.k kVar2, boolean z) {
            this.g = kVar;
            this.f = kVar2;
            this.e = z;
            kVar2.c(12);
            this.a = kVar2.n();
            kVar.c(12);
            this.i = kVar.n();
            com.fyber.inneractive.sdk.player.c.k.a.b(kVar.j() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public final boolean a() {
            int i = this.b + 1;
            this.b = i;
            if (i == this.a) {
                return false;
            }
            this.d = this.e ? this.f.p() : this.f.h();
            if (this.b == this.h) {
                this.c = this.g.n();
                this.g.d(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? this.g.n() - 1 : -1;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    private static final class f {
        final int a;
        final long b;
        final int c;

        public f(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {
        public final j[] a;
        public com.fyber.inneractive.sdk.player.c.h b;
        public int c;
        public int d = 0;

        public c(int i) {
            this.a = new j[i];
        }
    }

    /* loaded from: classes.dex */
    static final class d implements InterfaceC0056b {
        private final int a;
        private final int b;
        private final com.fyber.inneractive.sdk.player.c.k.k c;

        public d(a.b bVar) {
            com.fyber.inneractive.sdk.player.c.k.k kVar = bVar.aQ;
            this.c = kVar;
            kVar.c(12);
            this.a = this.c.n();
            this.b = this.c.n();
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.d.b.InterfaceC0056b
        public final int a() {
            return this.b;
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.d.b.InterfaceC0056b
        public final int b() {
            int i = this.a;
            return i == 0 ? this.c.n() : i;
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.d.b.InterfaceC0056b
        public final boolean c() {
            return this.a != 0;
        }
    }

    /* loaded from: classes.dex */
    static final class e implements InterfaceC0056b {
        private final com.fyber.inneractive.sdk.player.c.k.k a;
        private final int b;
        private final int c;
        private int d;
        private int e;

        @Override // com.fyber.inneractive.sdk.player.c.d.d.b.InterfaceC0056b
        public final boolean c() {
            return false;
        }

        public e(a.b bVar) {
            com.fyber.inneractive.sdk.player.c.k.k kVar = bVar.aQ;
            this.a = kVar;
            kVar.c(12);
            this.c = this.a.n() & 255;
            this.b = this.a.n();
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.d.b.InterfaceC0056b
        public final int a() {
            return this.b;
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.d.b.InterfaceC0056b
        public final int b() {
            int i = this.c;
            if (i == 8) {
                return this.a.d();
            }
            if (i == 16) {
                return this.a.e();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 == 0) {
                int d = this.a.d();
                this.e = d;
                return (d & 240) >> 4;
            }
            return this.e & 15;
        }
    }

    private static int a(com.fyber.inneractive.sdk.player.c.k.k kVar, int i, int i2, c cVar, int i3) {
        int i4 = kVar.b;
        while (true) {
            if (i4 - i >= i2) {
                return 0;
            }
            kVar.c(i4);
            int j = kVar.j();
            com.fyber.inneractive.sdk.player.c.k.a.a(j > 0, "childAtomSize should be positive");
            if (kVar.j() == com.fyber.inneractive.sdk.player.c.d.d.a.V) {
                int i5 = i4 + 8;
                Pair pair = null;
                boolean z = false;
                Integer num = null;
                j jVar = null;
                while (i5 - i4 < j) {
                    kVar.c(i5);
                    int j2 = kVar.j();
                    int j3 = kVar.j();
                    if (j3 == com.fyber.inneractive.sdk.player.c.d.d.a.ab) {
                        num = Integer.valueOf(kVar.j());
                    } else if (j3 == com.fyber.inneractive.sdk.player.c.d.d.a.W) {
                        kVar.d(4);
                        z = kVar.j() == g;
                    } else if (j3 == com.fyber.inneractive.sdk.player.c.d.d.a.X) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= j2) {
                                jVar = null;
                                break;
                            }
                            kVar.c(i6);
                            int j4 = kVar.j();
                            if (kVar.j() == com.fyber.inneractive.sdk.player.c.d.d.a.Y) {
                                kVar.d(6);
                                boolean z2 = kVar.d() == 1;
                                int d2 = kVar.d();
                                byte[] bArr = new byte[16];
                                kVar.a(bArr, 0, 16);
                                jVar = new j(z2, d2, bArr);
                            } else {
                                i6 += j4;
                            }
                        }
                    }
                    i5 += j2;
                }
                if (z) {
                    com.fyber.inneractive.sdk.player.c.k.a.a(num != null, "frma atom is mandatory");
                    com.fyber.inneractive.sdk.player.c.k.a.a(jVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, jVar);
                }
                if (pair != null) {
                    cVar.a[i3] = (j) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            i4 += j;
        }
    }
}
