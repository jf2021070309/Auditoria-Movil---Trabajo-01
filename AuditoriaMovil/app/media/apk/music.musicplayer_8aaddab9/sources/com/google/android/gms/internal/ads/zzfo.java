package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.core.rolling.helper.Compressor;
import com.google.android.gms.ads.AdRequest;
import e.a.d.a.a;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzfo {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    private final boolean zzg;

    public zzfo(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zze = z4;
        this.zzf = z6;
        this.zzg = zzalt.zzb(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if ("Nexus 10".equals(r3) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfo zza(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzfo r11 = new com.google.android.gms.internal.ads.zzfo
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3f
            int r3 = com.google.android.gms.internal.ads.zzamq.zza
            r5 = 19
            if (r3 < r5) goto L3f
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L3f
            r5 = 22
            if (r3 > r5) goto L3d
            java.lang.String r3 = com.google.android.gms.internal.ads.zzamq.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2c
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3d
        L2c:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L3d
            goto L3f
        L3d:
            r8 = 1
            goto L40
        L3f:
            r8 = 0
        L40:
            r3 = 21
            if (r4 == 0) goto L52
            int r5 = com.google.android.gms.internal.ads.zzamq.zza
            if (r5 < r3) goto L52
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L52
            r9 = 1
            goto L53
        L52:
            r9 = 0
        L53:
            if (r20 != 0) goto L66
            if (r4 == 0) goto L64
            int r5 = com.google.android.gms.internal.ads.zzamq.zza
            if (r5 < r3) goto L64
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L64
            goto L66
        L64:
            r10 = 0
            goto L67
        L66:
            r10 = 1
        L67:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfo.zza(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzfo");
    }

    private final void zzh(String str) {
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = zzamq.zze;
        String.valueOf(str2).length();
        String.valueOf(str4).length();
        str.length();
        str3.length();
    }

    private static boolean zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        Point zzj = zzj(videoCapabilities, i2, i3);
        int i4 = zzj.x;
        int i5 = zzj.y;
        return (d2 == -1.0d || d2 < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d2));
    }

    private static Point zzj(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzamq.zzw(i2, widthAlignment) * widthAlignment, zzamq.zzw(i3, heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzc(zzafv zzafvVar) throws zzfy {
        int i2;
        String zzd;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str = zzafvVar.zzi;
        int i3 = 16;
        if (str != null && (zzd = zzalt.zzd(str)) != null) {
            if (this.zzb.equals(zzd)) {
                Pair<Integer, Integer> zzf = zzge.zzf(zzafvVar);
                if (zzf != null) {
                    int intValue = ((Integer) zzf.first).intValue();
                    int intValue2 = ((Integer) zzf.second).intValue();
                    if (!this.zzg) {
                        if (intValue == 42) {
                            intValue = 42;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel[] zzb = zzb();
                    if (zzamq.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzb.length == 0) {
                        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                        int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                        int i4 = intValue3 >= 180000000 ? 1024 : intValue3 >= 120000000 ? AdRequest.MAX_CONTENT_URL_LENGTH : intValue3 >= 60000000 ? 256 : intValue3 >= 30000000 ? 128 : intValue3 >= 18000000 ? 64 : intValue3 >= 12000000 ? 32 : intValue3 >= 7200000 ? 16 : intValue3 >= 3600000 ? 8 : intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel.profile = 1;
                        codecProfileLevel.level = i4;
                        zzb = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzb) {
                        if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                        }
                    }
                    String str2 = zzafvVar.zzi;
                    zzh(a.t(new StringBuilder(zzd.length() + String.valueOf(str2).length() + 22), "codec.profileLevel, ", str2, ", ", zzd));
                }
            } else {
                String str3 = zzafvVar.zzi;
                zzh(a.t(new StringBuilder(zzd.length() + String.valueOf(str3).length() + 13), "codec.mime ", str3, ", ", zzd));
            }
            return false;
        }
        if (this.zzg) {
            int i5 = zzafvVar.zzq;
            if (i5 <= 0 || (i2 = zzafvVar.zzr) <= 0) {
                return true;
            }
            if (zzamq.zza >= 21) {
                return zzf(i5, i2, zzafvVar.zzs);
            }
            boolean z = i5 * i2 <= zzge.zze();
            if (!z) {
                zzh(a.S(40, "legacyFrameSize, ", zzafvVar.zzq, "x", zzafvVar.zzr));
            }
            return z;
        }
        int i6 = zzamq.zza;
        if (i6 >= 21) {
            int i7 = zzafvVar.zzz;
            if (i7 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    zzh("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities == null) {
                    zzh("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i7)) {
                    zzh(a.R(31, "sampleRate.support, ", i7));
                    return false;
                }
            }
            int i8 = zzafvVar.zzy;
            if (i8 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.zzd;
                if (codecCapabilities3 == null) {
                    zzh("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        zzh("channelCount.aCaps");
                    } else {
                        String str4 = this.zza;
                        String str5 = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i6 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str5) && !"audio/3gpp".equals(str5) && !"audio/amr-wb".equals(str5) && !"audio/mp4a-latm".equals(str5) && !"audio/vorbis".equals(str5) && !"audio/opus".equals(str5) && !"audio/raw".equals(str5) && !"audio/flac".equals(str5) && !"audio/g711-alaw".equals(str5) && !"audio/g711-mlaw".equals(str5) && !"audio/gsm".equals(str5))) {
                            if ("audio/ac3".equals(str5)) {
                                i3 = 6;
                            } else if (!"audio/eac3".equals(str5)) {
                                i3 = 30;
                            }
                            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 59);
                            sb.append("AssumedMaxChannelAdjustment: ");
                            sb.append(str4);
                            sb.append(", [");
                            sb.append(maxInputChannelCount);
                            sb.append(" to ");
                            sb.append(i3);
                            sb.append("]");
                            Log.w("MediaCodecInfo", sb.toString());
                            maxInputChannelCount = i3;
                        }
                        if (maxInputChannelCount < i8) {
                            zzh(a.R(33, "channelCount.support, ", i8));
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(zzafv zzafvVar) {
        if (this.zzg) {
            return this.zze;
        }
        Pair<Integer, Integer> zzf = zzge.zzf(zzafvVar);
        return zzf != null && ((Integer) zzf.first).intValue() == 42;
    }

    public final zzba zze(zzafv zzafvVar, zzafv zzafvVar2) {
        int i2 = true != zzamq.zzc(zzafvVar.zzl, zzafvVar2.zzl) ? 8 : 0;
        if (this.zzg) {
            if (zzafvVar.zzt != zzafvVar2.zzt) {
                i2 |= 1024;
            }
            if (!this.zze && (zzafvVar.zzq != zzafvVar2.zzq || zzafvVar.zzr != zzafvVar2.zzr)) {
                i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if (!zzamq.zzc(zzafvVar.zzx, zzafvVar2.zzx)) {
                i2 |= ThrowableProxyConverter.BUILDER_CAPACITY;
            }
            String str = this.zza;
            if (zzamq.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzafvVar.zzd(zzafvVar2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzba(this.zza, zzafvVar, zzafvVar2, true != zzafvVar.zzd(zzafvVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzafvVar.zzy != zzafvVar2.zzy) {
                i2 |= 4096;
            }
            if (zzafvVar.zzz != zzafvVar2.zzz) {
                i2 |= Compressor.BUFFER_SIZE;
            }
            if (zzafvVar.zzA != zzafvVar2.zzA) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair<Integer, Integer> zzf = zzge.zzf(zzafvVar);
                Pair<Integer, Integer> zzf2 = zzge.zzf(zzafvVar2);
                if (zzf != null && zzf2 != null) {
                    int intValue = ((Integer) zzf.first).intValue();
                    int intValue2 = ((Integer) zzf2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzba(this.zza, zzafvVar, zzafvVar2, 3, 0);
                    }
                }
            }
            if (!zzafvVar.zzd(zzafvVar2)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzba(this.zza, zzafvVar, zzafvVar2, 1, 0);
            }
        }
        return new zzba(this.zza, zzafvVar, zzafvVar2, 0, i2);
    }

    public final boolean zzf(int i2, int i3, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzh("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzh("sizeAndRate.vCaps");
            return false;
        } else if (zzi(videoCapabilities, i2, i3, d2)) {
            return true;
        } else {
            if (i2 >= i3 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzamq.zzb)) || !zzi(videoCapabilities, i3, i2, d2))) {
                StringBuilder w = a.w(69, "sizeAndRate.support, ", i2, "x", i3);
                w.append("x");
                w.append(d2);
                zzh(w.toString());
                return false;
            }
            StringBuilder w2 = a.w(69, "sizeAndRate.rotated, ", i2, "x", i3);
            w2.append("x");
            w2.append(d2);
            String sb = w2.toString();
            String str = this.zza;
            String str2 = this.zzb;
            String str3 = zzamq.zze;
            String.valueOf(str).length();
            String.valueOf(str3).length();
            sb.length();
            str2.length();
            return true;
        }
    }

    public final Point zzg(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzj(videoCapabilities, i2, i3);
    }
}
