package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Log;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.util.FileUtil;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class zzge {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<zzfx, List<zzfo>> zzc = new HashMap<>();
    private static int zzd = -1;

    public static zzfo zza() throws zzfy {
        return zzb("audio/raw", false, false);
    }

    public static zzfo zzb(String str, boolean z, boolean z2) throws zzfy {
        List<zzfo> zzc2 = zzc(str, false, false);
        if (zzc2.isEmpty()) {
            return null;
        }
        return zzc2.get(0);
    }

    public static synchronized List<zzfo> zzc(String str, boolean z, boolean z2) throws zzfy {
        synchronized (zzge.class) {
            zzfx zzfxVar = new zzfx(str, z, z2);
            HashMap<zzfx, List<zzfo>> hashMap = zzc;
            List<zzfo> list = hashMap.get(zzfxVar);
            if (list != null) {
                return list;
            }
            int i2 = zzamq.zza;
            ArrayList<zzfo> zzg = zzg(zzfxVar, i2 >= 21 ? new zzgb(z, z2) : new zzga(null));
            if (z && zzg.isEmpty() && i2 >= 21 && i2 <= 23) {
                zzg = zzg(zzfxVar, new zzga(null));
                if (!zzg.isEmpty()) {
                    String str2 = zzg.get(0).zza;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/raw".equals(str)) {
                if (i2 < 26 && zzamq.zzb.equals("R9") && zzg.size() == 1 && zzg.get(0).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzg.add(zzfo.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzg, zzfu.zza);
            }
            if (i2 < 21 && zzg.size() > 1) {
                String str3 = zzg.get(0).zza;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    zzi(zzg, zzfv.zza);
                }
            }
            if (i2 < 32 && zzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(zzg.get(0).zza)) {
                zzg.add(zzg.remove(0));
            }
            List<zzfo> unmodifiableList = Collections.unmodifiableList(zzg);
            hashMap.put(zzfxVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static List<zzfo> zzd(List<zzfo> list, final zzafv zzafvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzgd(zzafvVar) { // from class: com.google.android.gms.internal.ads.zzft
            private final zzafv zza;

            {
                this.zza = zzafvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzgd
            public final int zza(Object obj) {
                zzafv zzafvVar2 = this.zza;
                zzfo zzfoVar = (zzfo) obj;
                int i2 = zzge.zza;
                try {
                    return !zzfoVar.zzc(zzafvVar2) ? 0 : 1;
                } catch (zzfy unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    public static int zze() throws zzfy {
        int i2;
        if (zzd == -1) {
            int i3 = 0;
            zzfo zzb2 = zzb("video/avc", false, false);
            if (zzb2 != null) {
                MediaCodecInfo.CodecProfileLevel[] zzb3 = zzb2.zzb();
                int length = zzb3.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = zzb3[i3].level;
                    if (i5 == 1 || i5 == 2) {
                        i2 = 25344;
                    } else {
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
                            case ThrowableProxyConverter.BUILDER_CAPACITY /* 2048 */:
                            case 4096:
                                i2 = 2097152;
                                continue;
                            case Compressor.BUFFER_SIZE /* 8192 */:
                                i2 = 2228224;
                                continue;
                            case 16384:
                                i2 = 5652480;
                                continue;
                            case FileUtil.BUF_SIZE /* 32768 */:
                            case 65536:
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
                    }
                    i4 = Math.max(i2, i4);
                    i3++;
                }
                i3 = Math.max(i4, zzamq.zza >= 21 ? 345600 : 172800);
            }
            zzd = i3;
        }
        return zzd;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x030a A[Catch: NumberFormatException -> 0x0319, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0319, blocks: (B:169:0x02a5, B:171:0x02b7, B:182:0x02d3, B:198:0x030a), top: B:559:0x02a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> zzf(com.google.android.gms.internal.ads.zzafv r15) {
        /*
            Method dump skipped, instructions count: 2624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzge.zzf(com.google.android.gms.internal.ads.zzafv):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x019b, code lost:
        if ("SCV31".equals(r5) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d9, code lost:
        if (r8.startsWith("t0") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
        if (r11.startsWith("HM") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010f, code lost:
        if ("SO-02E".equals(r11) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013b, code lost:
        if ("C1605".equals(r10) == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0292 A[Catch: Exception -> 0x031c, TryCatch #0 {Exception -> 0x031c, blocks: (B:157:0x0261, B:163:0x0278, B:169:0x028c, B:171:0x0292, B:176:0x02a0, B:178:0x02a8, B:188:0x02d2, B:191:0x02d8, B:179:0x02ad, B:181:0x02bd, B:183:0x02c5, B:172:0x0297), top: B:218:0x0261 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0297 A[Catch: Exception -> 0x031c, TryCatch #0 {Exception -> 0x031c, blocks: (B:157:0x0261, B:163:0x0278, B:169:0x028c, B:171:0x0292, B:176:0x02a0, B:178:0x02a8, B:188:0x02d2, B:191:0x02d8, B:179:0x02ad, B:181:0x02bd, B:183:0x02c5, B:172:0x0297), top: B:218:0x0261 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a8 A[Catch: Exception -> 0x031c, TryCatch #0 {Exception -> 0x031c, blocks: (B:157:0x0261, B:163:0x0278, B:169:0x028c, B:171:0x0292, B:176:0x02a0, B:178:0x02a8, B:188:0x02d2, B:191:0x02d8, B:179:0x02ad, B:181:0x02bd, B:183:0x02c5, B:172:0x0297), top: B:218:0x0261 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ad A[Catch: Exception -> 0x031c, TryCatch #0 {Exception -> 0x031c, blocks: (B:157:0x0261, B:163:0x0278, B:169:0x028c, B:171:0x0292, B:176:0x02a0, B:178:0x02a8, B:188:0x02d2, B:191:0x02d8, B:179:0x02ad, B:181:0x02bd, B:183:0x02c5, B:172:0x0297), top: B:218:0x0261 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<com.google.android.gms.internal.ads.zzfo> zzg(com.google.android.gms.internal.ads.zzfx r23, com.google.android.gms.internal.ads.zzfz r24) throws com.google.android.gms.internal.ads.zzfy {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzge.zzg(com.google.android.gms.internal.ads.zzfx, com.google.android.gms.internal.ads.zzfz):java.util.ArrayList");
    }

    private static boolean zzh(MediaCodecInfo mediaCodecInfo) {
        if (zzamq.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String zza2 = zzflf.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        return zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.") || (zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.") || !(zza2.startsWith("omx.") || zza2.startsWith("c2."));
    }

    private static <T> void zzi(List<T> list, final zzgd<T> zzgdVar) {
        Collections.sort(list, new Comparator(zzgdVar) { // from class: com.google.android.gms.internal.ads.zzfw
            private final zzgd zza;

            {
                this.zza = zzgdVar;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzgd zzgdVar2 = this.zza;
                int i2 = zzge.zza;
                return zzgdVar2.zza(obj2) - zzgdVar2.zza(obj);
            }
        });
    }
}
