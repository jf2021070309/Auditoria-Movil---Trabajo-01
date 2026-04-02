package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        zzfz zzgaVar;
        synchronized (zzge.class) {
            zzfx zzfxVar = new zzfx(str, z, z2);
            List<zzfo> list = zzc.get(zzfxVar);
            if (list != null) {
                return list;
            }
            if (zzamq.zza >= 21) {
                zzgaVar = new zzgb(z, z2);
            } else {
                zzgaVar = new zzga(null);
            }
            ArrayList<zzfo> zzg = zzg(zzfxVar, zzgaVar);
            if (z && zzg.isEmpty() && zzamq.zza >= 21 && zzamq.zza <= 23) {
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
                if (zzamq.zza < 26 && zzamq.zzb.equals("R9") && zzg.size() == 1 && zzg.get(0).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzg.add(zzfo.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzg, zzfu.zza);
            }
            if (zzamq.zza < 21 && zzg.size() > 1) {
                String str3 = zzg.get(0).zza;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    zzi(zzg, zzfv.zza);
                }
            }
            if (zzamq.zza < 32 && zzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(zzg.get(0).zza)) {
                zzg.add(zzg.remove(0));
            }
            List<zzfo> unmodifiableList = Collections.unmodifiableList(zzg);
            zzc.put(zzfxVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static List<zzfo> zzd(List<zzfo> list, final zzafv zzafvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzgd(zzafvVar) { // from class: com.google.android.gms.internal.ads.zzft
            private final zzafv zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzafvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzgd
            public final int zza(Object obj) {
                zzafv zzafvVar2 = this.zza;
                zzfo zzfoVar = (zzfo) obj;
                int i = zzge.zza;
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
        int i;
        if (zzd == -1) {
            int i2 = 0;
            zzfo zzb2 = zzb("video/avc", false, false);
            if (zzb2 != null) {
                MediaCodecInfo.CodecProfileLevel[] zzb3 = zzb2.zzb();
                int length = zzb3.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = zzb3[i2].level;
                    if (i4 == 1 || i4 == 2) {
                        i = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                continue;
                            case 64:
                                i = 202752;
                                continue;
                            case 128:
                            case 256:
                                i = 414720;
                                continue;
                            case 512:
                                i = 921600;
                                continue;
                            case 1024:
                                i = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                continue;
                            case 8192:
                                i = 2228224;
                                continue;
                            case 16384:
                                i = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                continue;
                            default:
                                i = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, zzamq.zza >= 21 ? 345600 : 172800);
            }
            zzd = i2;
        }
        return zzd;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02fd A[Catch: NumberFormatException -> 0x030d, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x030d, blocks: (B:168:0x02a6, B:170:0x02b8, B:181:0x02d4, B:197:0x02fd), top: B:557:0x02a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> zzf(com.google.android.gms.internal.ads.zzafv r17) {
        /*
            Method dump skipped, instructions count: 2694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzge.zzf(com.google.android.gms.internal.ads.zzafv):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d7 A[Catch: Exception -> 0x0368, TryCatch #0 {Exception -> 0x0368, blocks: (B:161:0x02a5, B:167:0x02bc, B:173:0x02d1, B:175:0x02d7, B:180:0x02e8, B:182:0x02f2, B:192:0x031e, B:195:0x0324, B:183:0x02f7, B:185:0x0307, B:187:0x030f, B:176:0x02dd), top: B:221:0x02a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02dd A[Catch: Exception -> 0x0368, TryCatch #0 {Exception -> 0x0368, blocks: (B:161:0x02a5, B:167:0x02bc, B:173:0x02d1, B:175:0x02d7, B:180:0x02e8, B:182:0x02f2, B:192:0x031e, B:195:0x0324, B:183:0x02f7, B:185:0x0307, B:187:0x030f, B:176:0x02dd), top: B:221:0x02a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02f2 A[Catch: Exception -> 0x0368, TryCatch #0 {Exception -> 0x0368, blocks: (B:161:0x02a5, B:167:0x02bc, B:173:0x02d1, B:175:0x02d7, B:180:0x02e8, B:182:0x02f2, B:192:0x031e, B:195:0x0324, B:183:0x02f7, B:185:0x0307, B:187:0x030f, B:176:0x02dd), top: B:221:0x02a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f7 A[Catch: Exception -> 0x0368, TryCatch #0 {Exception -> 0x0368, blocks: (B:161:0x02a5, B:167:0x02bc, B:173:0x02d1, B:175:0x02d7, B:180:0x02e8, B:182:0x02f2, B:192:0x031e, B:195:0x0324, B:183:0x02f7, B:185:0x0307, B:187:0x030f, B:176:0x02dd), top: B:221:0x02a5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<com.google.android.gms.internal.ads.zzfo> zzg(com.google.android.gms.internal.ads.zzfx r23, com.google.android.gms.internal.ads.zzfz r24) throws com.google.android.gms.internal.ads.zzfy {
        /*
            Method dump skipped, instructions count: 1001
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

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzgdVar;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzgd zzgdVar2 = this.zza;
                int i = zzge.zza;
                return zzgdVar2.zza(obj2) - zzgdVar2.zza(obj);
            }
        });
    }
}
