package com.google.android.gms.internal.cast_tv;

import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.tv.media.EditAudioTracksData;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzbj extends zzk {
    final /* synthetic */ String zza;
    final /* synthetic */ EditAudioTracksData zzb;
    final /* synthetic */ zzbp zzc;

    public zzbj(zzbp zzbpVar, String str, EditAudioTracksData editAudioTracksData) {
        this.zzc = zzbpVar;
        this.zza = str;
        this.zzb = editAudioTracksData;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzl
    public final zzbr zze() {
        zzx zzxVar;
        zzz zzi = zzbp.zzi(this.zzc);
        zzxVar = this.zzc.zzj;
        int i = zzy.zza;
        TreeSet treeSet = new TreeSet();
        TreeSet treeSet2 = new TreeSet();
        TreeMap treeMap = new TreeMap();
        List list = zzi.zzb;
        if (list != null) {
            treeSet.addAll(list);
        }
        List list2 = zzi.zzc;
        if (list2 != null) {
            treeSet2.addAll(list2);
        }
        for (MediaTrack mediaTrack : zzi.zza) {
            treeMap.put(Long.valueOf(mediaTrack.getId()), mediaTrack);
        }
        return zzy.zza(this.zza, this.zzb, treeMap, treeSet, treeSet2, zzxVar);
    }
}
