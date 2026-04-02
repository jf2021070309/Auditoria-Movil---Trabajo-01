package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzarg {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;
    private final String zze;
    private final MediaCodecInfo.CodecCapabilities zzf;

    private zzarg(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        if (str != null) {
            this.zza = str;
            this.zze = str2;
            this.zzf = codecCapabilities;
            boolean z3 = true;
            this.zzb = !z && codecCapabilities != null && zzave.zza >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
            this.zzc = codecCapabilities != null && zzave.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
            if (!z2 && (codecCapabilities == null || zzave.zza < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
                z3 = false;
            }
            this.zzd = z3;
            return;
        }
        throw null;
    }

    public static zzarg zza(String str) {
        return new zzarg("OMX.google.raw.decoder", null, null, false, false);
    }

    public static zzarg zzb(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new zzarg(str, str2, codecCapabilities, z, z2);
    }

    private final void zzh(String str) {
        String str2 = this.zza;
        String str3 = this.zze;
        String str4 = zzave.zze;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 20 + length + length2 + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzc() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.zzf.profileLevels;
    }

    public final boolean zzd(String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] zzc;
        if (str == null || this.zze == null) {
            return true;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            str2 = "video/avc";
        } else if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            str2 = "video/hevc";
        } else if (trim.startsWith("vp9")) {
            str2 = "video/x-vnd.on2.vp9";
        } else if (trim.startsWith("vp8")) {
            str2 = "video/x-vnd.on2.vp8";
        } else if (trim.startsWith("mp4a")) {
            str2 = "audio/mp4a-latm";
        } else if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            str2 = "audio/ac3";
        } else if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
            str2 = "audio/eac3";
        } else if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
            str2 = "audio/vnd.dts";
        } else if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
            str2 = "audio/vnd.dts.hd";
        } else if (trim.startsWith("opus")) {
            str2 = "audio/opus";
        } else {
            str2 = trim.startsWith("vorbis") ? "audio/vorbis" : null;
        }
        if (str2 == null) {
            return true;
        }
        if (!this.zze.equals(str2)) {
            StringBuilder sb = new StringBuilder(str.length() + 13 + str2.length());
            sb.append("codec.mime ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            zzh(sb.toString());
            return false;
        }
        Pair<Integer, Integer> zzd = zzarr.zzd(str);
        if (zzd == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc()) {
            if (codecProfileLevel.profile == ((Integer) zzd.first).intValue() && codecProfileLevel.level >= ((Integer) zzd.second).intValue()) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 22 + str2.length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        zzh(sb2.toString());
        return false;
    }

    public final boolean zze(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzh("sizeAndRate.vCaps");
            return false;
        } else if (zzi(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !zzi(videoCapabilities, i2, i, d)) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                zzh(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            sb2.append("x");
            sb2.append(d);
            String sb3 = sb2.toString();
            String str = this.zza;
            String str2 = this.zze;
            String str3 = zzave.zze;
            int length = String.valueOf(str).length();
            int length2 = String.valueOf(str2).length();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 25 + length + length2 + String.valueOf(str3).length());
            sb4.append("AssumedSupport [");
            sb4.append(sb3);
            sb4.append("] [");
            sb4.append(str);
            sb4.append(", ");
            sb4.append(str2);
            sb4.append("] [");
            sb4.append(str3);
            sb4.append("]");
            Log.d("MediaCodecInfo", sb4.toString());
            return true;
        }
    }

    public final boolean zzf(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzh("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(31);
            sb.append("sampleRate.support, ");
            sb.append(i);
            zzh(sb.toString());
            return false;
        }
    }

    public final boolean zzg(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzh("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() < i) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("channelCount.support, ");
            sb.append(i);
            zzh(sb.toString());
            return false;
        } else {
            return true;
        }
    }

    private static boolean zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }
}
