package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzck {
    private static List<MediaCodecInfo> zzb;
    private static final Map<String, List<Map<String, Object>>> zza = new HashMap();
    private static final Object zzc = new Object();

    @TargetApi(16)
    public static List<Map<String, Object>> zza(String str) {
        ArrayList arrayList;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Object obj = zzc;
        synchronized (obj) {
            Map<String, List<Map<String, Object>>> map = zza;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            try {
                synchronized (obj) {
                    if (zzb == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            zzb = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else {
                            int codecCount = MediaCodecList.getCodecCount();
                            zzb = new ArrayList(codecCount);
                            for (int i2 = 0; i2 < codecCount; i2++) {
                                zzb.add(MediaCodecList.getCodecInfoAt(i2));
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : zzb) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            hashMap.put("profileLevels", arrayList2);
                            int i3 = Build.VERSION.SDK_INT;
                            if (i3 >= 21) {
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                hashMap.put("bitRatesBps", zzb(videoCapabilities.getBitrateRange()));
                                hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                hashMap.put("frameRates", zzb(videoCapabilities.getSupportedFrameRates()));
                                hashMap.put("widths", zzb(videoCapabilities.getSupportedWidths()));
                                hashMap.put("heights", zzb(videoCapabilities.getSupportedHeights()));
                            }
                            if (i3 >= 23) {
                                hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            }
                            arrayList.add(hashMap);
                        }
                    }
                    zza.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e2) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e2.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                zza.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    private static Integer[] zzb(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }
}
