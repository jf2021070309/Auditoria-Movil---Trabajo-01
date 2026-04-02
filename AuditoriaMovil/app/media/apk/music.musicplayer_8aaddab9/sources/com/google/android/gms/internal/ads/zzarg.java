package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.common.api.CommonStatusCodes;
import e.a.d.a.a;
import java.util.Objects;
@TargetApi(16)
/* loaded from: classes.dex */
public final class zzarg {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;
    private final String zze;
    private final MediaCodecInfo.CodecCapabilities zzf;

    private zzarg(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        Objects.requireNonNull(str);
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
        String.valueOf(str2).length();
        String.valueOf(str3).length();
        String.valueOf(str4).length();
        str.length();
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    private static boolean zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        return (d2 == -1.0d || d2 <= 0.0d) ? videoCapabilities.isSizeSupported(i2, i3) : videoCapabilities.areSizeAndRateSupported(i2, i3, d2);
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzc() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzd(String str) {
        MediaCodecInfo.CodecProfileLevel[] zzc;
        if (str == null || this.zze == null) {
            return true;
        }
        String trim = str.trim();
        String str2 = (trim.startsWith("avc1") || trim.startsWith("avc3")) ? "video/avc" : (trim.startsWith("hev1") || trim.startsWith("hvc1")) ? "video/hevc" : trim.startsWith("vp9") ? "video/x-vnd.on2.vp9" : trim.startsWith("vp8") ? "video/x-vnd.on2.vp8" : trim.startsWith("mp4a") ? "audio/mp4a-latm" : (trim.startsWith("ac-3") || trim.startsWith("dac3")) ? "audio/ac3" : (trim.startsWith("ec-3") || trim.startsWith("dec3")) ? "audio/eac3" : (trim.startsWith("dtsc") || trim.startsWith("dtse")) ? "audio/vnd.dts" : (trim.startsWith("dtsh") || trim.startsWith("dtsl")) ? "audio/vnd.dts.hd" : trim.startsWith("opus") ? "audio/opus" : trim.startsWith("vorbis") ? "audio/vorbis" : null;
        if (str2 == null) {
            return true;
        }
        if (!this.zze.equals(str2)) {
            zzh(a.t(new StringBuilder(str2.length() + str.length() + 13), "codec.mime ", str, ", ", str2));
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
        zzh(a.t(new StringBuilder(str2.length() + str.length() + 22), "codec.profileLevel, ", str, ", ", str2));
        return false;
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final boolean zze(int i2, int i3, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
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
            if (i2 >= i3 || !zzi(videoCapabilities, i3, i2, d2)) {
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
            String str2 = this.zze;
            String str3 = zzave.zze;
            String.valueOf(str).length();
            String.valueOf(str2).length();
            String.valueOf(str3).length();
            sb.length();
            return true;
        }
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final boolean zzf(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzh("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i2)) {
            return true;
        } else {
            zzh(a.R(31, "sampleRate.support, ", i2));
            return false;
        }
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final boolean zzg(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzh("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() < i2) {
            zzh(a.R(33, "channelCount.support, ", i2));
            return false;
        } else {
            return true;
        }
    }
}
