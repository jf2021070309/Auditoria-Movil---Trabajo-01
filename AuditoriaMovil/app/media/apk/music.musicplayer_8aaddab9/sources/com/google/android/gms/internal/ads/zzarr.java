package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.util.FileUtil;
import com.google.android.gms.ads.AdRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes.dex */
public final class zzarr {
    private static final SparseIntArray zzd;
    private static final SparseIntArray zze;
    private static final Map<String, Integer> zzf;
    private static final zzarg zza = zzarg.zza("OMX.google.raw.decoder");
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<zzarl, List<zzarg>> zzc = new HashMap<>();
    private static int zzg = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        zzd = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zze = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, AdRequest.MAX_CONTENT_URL_LENGTH);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, ThrowableProxyConverter.BUILDER_CAPACITY);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, Compressor.BUFFER_SIZE);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, FileUtil.BUF_SIZE);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        zzf = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", Integer.valueOf((int) AdRequest.MAX_CONTENT_URL_LENGTH));
        hashMap.put("H120", Integer.valueOf((int) ThrowableProxyConverter.BUILDER_CAPACITY));
        hashMap.put("H123", Integer.valueOf((int) Compressor.BUFFER_SIZE));
        hashMap.put("H150", Integer.valueOf((int) FileUtil.BUF_SIZE));
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    public static zzarg zza(String str, boolean z) throws zzarm {
        List<zzarg> zzb2 = zzb(str, z);
        if (zzb2.isEmpty()) {
            return null;
        }
        return zzb2.get(0);
    }

    public static synchronized List<zzarg> zzb(String str, boolean z) throws zzarm {
        synchronized (zzarr.class) {
            zzarl zzarlVar = new zzarl(str, z);
            HashMap<zzarl, List<zzarg>> hashMap = zzc;
            List<zzarg> list = hashMap.get(zzarlVar);
            if (list != null) {
                return list;
            }
            int i2 = zzave.zza;
            List<zzarg> zze2 = zze(zzarlVar, i2 >= 21 ? new zzarp(z) : new zzaro(null));
            if (z && zze2.isEmpty() && i2 >= 21 && i2 <= 23) {
                zze2 = zze(zzarlVar, new zzaro(null));
                if (!zze2.isEmpty()) {
                    String str2 = zze2.get(0).zza;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<zzarg> unmodifiableList = Collections.unmodifiableList(zze2);
            hashMap.put(zzarlVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static int zzc() throws zzarm {
        if (zzg == -1) {
            int i2 = 0;
            zzarg zza2 = zza("video/avc", false);
            if (zza2 != null) {
                MediaCodecInfo.CodecProfileLevel[] zzc2 = zza2.zzc();
                int length = zzc2.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = zzc2[i2].level;
                    int i5 = 9437184;
                    if (i4 == 1 || i4 == 2) {
                        i5 = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i5 = 101376;
                                continue;
                            case 64:
                                i5 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i5 = 414720;
                                continue;
                            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                                i5 = 921600;
                                continue;
                            case 1024:
                                i5 = 1310720;
                                continue;
                            case ThrowableProxyConverter.BUILDER_CAPACITY /* 2048 */:
                            case 4096:
                                i5 = 2097152;
                                continue;
                            case Compressor.BUFFER_SIZE /* 8192 */:
                                i5 = 2228224;
                                continue;
                            case 16384:
                                i5 = 5652480;
                                continue;
                            case FileUtil.BUF_SIZE /* 32768 */:
                            case 65536:
                                break;
                            default:
                                i5 = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i5, i3);
                    i2++;
                }
                i2 = Math.max(i3, zzave.zza >= 21 ? 345600 : 172800);
            }
            zzg = i2;
        }
        return zzg;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair<Integer, Integer> zzd(String str) {
        char c2;
        Integer valueOf;
        Integer valueOf2;
        String[] split = str.split("\\.");
        String str2 = split[0];
        int i2 = 2;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0 && c2 != 1) {
            if (c2 == 2 || c2 == 3) {
                int length = split.length;
                if (length < 2) {
                    Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                try {
                    if (split[1].length() == 6) {
                        valueOf = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                        valueOf2 = Integer.valueOf(Integer.parseInt(split[1].substring(4), 16));
                    } else if (length < 3) {
                        Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                        return null;
                    } else {
                        valueOf = Integer.valueOf(Integer.parseInt(split[1]));
                        valueOf2 = Integer.valueOf(Integer.parseInt(split[2]));
                    }
                    return new Pair<>(Integer.valueOf(zzd.get(valueOf.intValue())), Integer.valueOf(zze.get(valueOf2.intValue())));
                } catch (NumberFormatException unused) {
                    Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
            }
            return null;
        } else if (split.length < 4) {
            Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(str) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        } else {
            Matcher matcher = zzb.matcher(split[1]);
            if (!matcher.matches()) {
                Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(str) : new String("Ignoring malformed HEVC codec string: "));
                return null;
            }
            String group = matcher.group(1);
            if ("1".equals(group)) {
                i2 = 1;
            } else if (!"2".equals(group)) {
                String valueOf3 = String.valueOf(group);
                Log.w("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(valueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
            Integer num = zzf.get(split[3]);
            if (num == null) {
                String valueOf4 = String.valueOf(matcher.group(1));
                Log.w("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(valueOf4) : new String("Unknown HEVC level string: "));
                return null;
            }
            return new Pair<>(Integer.valueOf(i2), num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[Catch: Exception -> 0x01b9, TryCatch #2 {Exception -> 0x01b9, blocks: (B:102:0x0195, B:104:0x019f, B:106:0x01a7, B:108:0x01af, B:115:0x01be, B:120:0x01c7), top: B:154:0x0195 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.google.android.gms.internal.ads.zzarg> zze(com.google.android.gms.internal.ads.zzarl r18, com.google.android.gms.internal.ads.zzarn r19) throws com.google.android.gms.internal.ads.zzarm {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarr.zze(com.google.android.gms.internal.ads.zzarl, com.google.android.gms.internal.ads.zzarn):java.util.List");
    }
}
