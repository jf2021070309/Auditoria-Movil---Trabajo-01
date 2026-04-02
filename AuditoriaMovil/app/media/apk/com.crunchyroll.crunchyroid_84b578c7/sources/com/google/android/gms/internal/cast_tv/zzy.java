package com.google.android.gms.internal.cast_tv;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.tv.media.EditAudioTracksData;
import com.google.android.gms.cast.tv.media.EditTracksInfoData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzy {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = new Logger("MediaTracksHelper");
    private static final zzfu zzc = zzfu.zzi(0, 1, 2, 3);

    public static final zzbr zza(String str, EditAudioTracksData editAudioTracksData, Map map, Set set, Set set2, zzx zzxVar) {
        if (!zze(str, 2, editAudioTracksData.getLanguage(), map, set, set2, zzxVar)) {
            MediaError build = new MediaError.Builder().setReason(MediaError.ERROR_REASON_LANGUAGE_NOT_SUPPORTED).setType("INVALID_REQUEST").build();
            build.setRequestId(editAudioTracksData.getRequestId());
            return new zzbr(build);
        }
        return new zzbr(null);
    }

    public static final zzbr zzb(String str, EditTracksInfoData editTracksInfoData, Map map, Set set, Set set2, zzx zzxVar) {
        zzo zzoVar;
        TextTrackStyle textTrackStyle = editTracksInfoData.getTextTrackStyle();
        if (textTrackStyle != null) {
            try {
                zzoVar = ((zzbn) zzxVar).zza.zzf;
                zzoVar.zzz(str, textTrackStyle, null);
            } catch (RemoteException unused) {
            }
        }
        String language = editTracksInfoData.getLanguage();
        long[] activeTrackIds = editTracksInfoData.getActiveTrackIds();
        Boolean enableTextTracks = editTracksInfoData.getEnableTextTracks();
        if (language != null) {
            if (!zze(str, 1, language, map, set, set2, zzxVar)) {
                MediaError build = new MediaError.Builder().setReason(MediaError.ERROR_REASON_LANGUAGE_NOT_SUPPORTED).setType("INVALID_REQUEST").build();
                build.setRequestId(editTracksInfoData.getRequestId());
                return new zzbr(build);
            }
        } else if (activeTrackIds != null) {
            HashSet hashSet = new HashSet();
            for (long j : activeTrackIds) {
                hashSet.add(Long.valueOf(j));
            }
            zzfu zzfuVar = zzc;
            int size = zzfuVar.size();
            for (int i = 0; i < size; i++) {
                int intValue = ((Integer) zzfuVar.get(i)).intValue();
                ArrayList arrayList = new ArrayList();
                for (MediaTrack mediaTrack : zzd(intValue, map, set, set2, zzxVar)) {
                    if (hashSet.contains(Long.valueOf(mediaTrack.getId()))) {
                        arrayList.add(mediaTrack);
                        hashSet.remove(Long.valueOf(mediaTrack.getId()));
                    }
                }
                zzxVar.zza(str, intValue, arrayList, null);
            }
            if (!hashSet.isEmpty()) {
                zzb.w("The following track IDs are ignored as they don't exist: ".concat(hashSet.toString()), new Object[0]);
            }
        } else if (enableTextTracks != null) {
            boolean booleanValue = enableTextTracks.booleanValue();
            TreeSet treeSet = new TreeSet();
            for (MediaTrack mediaTrack2 : zzd(1, map, set, set2, zzxVar)) {
                if (set.contains(Long.valueOf(mediaTrack2.getId()))) {
                    treeSet.add(Long.valueOf(mediaTrack2.getId()));
                }
            }
            if (!booleanValue) {
                if (!treeSet.isEmpty()) {
                    zzxVar.zza(str, 1, new ArrayList(), new ArrayList(treeSet));
                }
            } else if (treeSet.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    if (map.containsKey(l)) {
                        arrayList2.add((MediaTrack) map.get(l));
                    }
                }
                if (arrayList2.isEmpty()) {
                    List zzd = zzd(1, map, set, set2, zzxVar);
                    if (!zzd.isEmpty()) {
                        arrayList2.add((MediaTrack) zzd.get(0));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    zzxVar.zza(str, 1, arrayList2, new ArrayList());
                }
            }
        }
        return new zzbr(null);
    }

    private static String zzc(String str) {
        if (str != null) {
            return str.toLowerCase(Locale.US);
        }
        return "";
    }

    private static final List zzd(int i, Map map, Set set, Set set2, zzx zzxVar) {
        ArrayList arrayList = new ArrayList();
        for (MediaTrack mediaTrack : map.values()) {
            if (mediaTrack.getType() == i) {
                arrayList.add(mediaTrack);
            }
        }
        return arrayList;
    }

    private static final boolean zze(String str, int i, String str2, Map map, Set set, Set set2, zzx zzxVar) {
        if (TextUtils.isEmpty(str2)) {
            zzb.w("Ignoring empty or null language", new Object[0]);
            return false;
        }
        List<MediaTrack> zzd = zzd(i, map, set, set2, zzxVar);
        MediaTrack mediaTrack = null;
        for (MediaTrack mediaTrack2 : zzd) {
            if (true == TextUtils.equals(zzc(mediaTrack2.getLanguage()), zzc(str2))) {
                mediaTrack = mediaTrack2;
            }
        }
        if (mediaTrack == null) {
            for (MediaTrack mediaTrack3 : zzd) {
                String zzc2 = zzc(mediaTrack3.getLanguage());
                String zzc3 = zzc(str2);
                if (zzc2.startsWith(zzc3) || zzc3.startsWith(zzc2)) {
                    mediaTrack = mediaTrack3;
                }
            }
        }
        if (mediaTrack == null) {
            zzb.w("No matching track", new Object[0]);
            return false;
        }
        zzxVar.zza(str, i, zzfu.zzh(mediaTrack), null);
        return true;
    }
}
