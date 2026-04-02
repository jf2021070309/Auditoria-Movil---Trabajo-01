package com.google.android.gms.cast.tv.media;

import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class MediaTracksModifier {
    private static final Logger zza = new Logger("MediaTracksModifier");
    private final MediaStatusModifier zzb;
    private final Set zzc = new TreeSet();
    private final Set zzd = new TreeSet();

    public MediaTracksModifier(MediaStatusModifier mediaStatusModifier) {
        this.zzb = mediaStatusModifier;
    }

    public void clear() {
        this.zzc.clear();
        this.zzd.clear();
    }

    public Set<Long> getActiveTrackIds() {
        return this.zzc;
    }

    public List<MediaTrack> getActiveTracksByType(int i) {
        ArrayList arrayList = new ArrayList();
        for (MediaTrack mediaTrack : getMediaTracks()) {
            if (this.zzc.contains(Long.valueOf(mediaTrack.getId())) && mediaTrack.getType() == i) {
                arrayList.add(mediaTrack);
            }
        }
        return arrayList;
    }

    public List<MediaTrack> getMediaTracks() {
        MediaInfoModifier mediaInfoModifier = this.zzb.getMediaInfoModifier();
        if (mediaInfoModifier == null) {
            return new ArrayList();
        }
        List<MediaTrack> mediaTracks = mediaInfoModifier.getMediaTracks();
        if (mediaTracks == null) {
            return new ArrayList();
        }
        return mediaTracks;
    }

    public List<MediaTrack> getMediaTracksByType(int i) {
        ArrayList arrayList = new ArrayList();
        for (MediaTrack mediaTrack : getMediaTracks()) {
            if (mediaTrack.getType() == i) {
                arrayList.add(mediaTrack);
            }
        }
        return arrayList;
    }

    public MediaTracksModifier setActiveTrackIds(long[] jArr) {
        this.zzc.clear();
        if (jArr != null) {
            for (long j : jArr) {
                this.zzc.add(Long.valueOf(j));
            }
        }
        return this;
    }

    public void setActiveTracksByType(int i, List<MediaTrack> list) {
        HashSet hashSet = new HashSet();
        for (MediaTrack mediaTrack : list) {
            hashSet.add(Long.valueOf(mediaTrack.getId()));
        }
        setActiveTracksByType(i, hashSet);
    }

    public final com.google.android.gms.internal.cast_tv.zzz zza() {
        return new com.google.android.gms.internal.cast_tv.zzz(getMediaTracks(), new ArrayList(this.zzc), new ArrayList(this.zzd));
    }

    public final void zzb(MediaStatus mediaStatus) {
        new MediaStatusWriter(mediaStatus).setActiveTrackIds(CastUtils.toLongArray(this.zzc));
    }

    public final void zzc(List list) {
        this.zzd.clear();
        this.zzd.addAll(list);
    }

    public void setActiveTracksByType(int i, Set<Long> set) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (MediaTrack mediaTrack : getMediaTracks()) {
            if (this.zzc.contains(Long.valueOf(mediaTrack.getId())) && mediaTrack.getType() == i) {
                hashSet.add(Long.valueOf(mediaTrack.getId()));
            }
            if (set.contains(Long.valueOf(mediaTrack.getId())) && mediaTrack.getType() == i) {
                hashSet2.add(Long.valueOf(mediaTrack.getId()));
            }
        }
        HashSet hashSet3 = new HashSet(set);
        hashSet3.removeAll(hashSet2);
        zza.w("Cannot set the following active track IDs %s for type %d,because they are either missing or having a mismatching type", hashSet3.toString(), Integer.valueOf(i));
        this.zzc.removeAll(hashSet);
        this.zzc.addAll(hashSet2);
    }
}
