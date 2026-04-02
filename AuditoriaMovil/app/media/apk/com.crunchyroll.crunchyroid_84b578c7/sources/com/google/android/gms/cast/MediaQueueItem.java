package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "MediaQueueItemCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class MediaQueueItem extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<MediaQueueItem> CREATOR = new zzck();
    public static final double DEFAULT_PLAYBACK_DURATION = Double.POSITIVE_INFINITY;
    public static final int INVALID_ITEM_ID = 0;
    @SafeParcelable.Field(id = 9)
    String zza;
    @SafeParcelable.Field(getter = "getMedia", id = 2)
    private MediaInfo zzb;
    @SafeParcelable.Field(getter = "getItemId", id = 3)
    private int zzc;
    @SafeParcelable.Field(getter = "getAutoplay", id = 4)
    private boolean zzd;
    @SafeParcelable.Field(getter = "getStartTime", id = 5)
    private double zze;
    @SafeParcelable.Field(getter = "getPlaybackDuration", id = 6)
    private double zzf;
    @SafeParcelable.Field(getter = "getPreloadTime", id = 7)
    private double zzg;
    @SafeParcelable.Field(getter = "getActiveTrackIds", id = 8)
    private long[] zzh;
    private c zzi;
    private final Writer zzj;

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private final MediaQueueItem zza;

        public Builder(MediaInfo mediaInfo) throws IllegalArgumentException {
            this.zza = new MediaQueueItem(mediaInfo, (zzcj) null);
        }

        public MediaQueueItem build() {
            this.zza.zzi();
            return this.zza;
        }

        public Builder clearItemId() {
            this.zza.getWriter().setItemId(0);
            return this;
        }

        public Builder setActiveTrackIds(long[] jArr) {
            this.zza.getWriter().setActiveTrackIds(jArr);
            return this;
        }

        public Builder setAutoplay(boolean z) {
            this.zza.getWriter().setAutoplay(z);
            return this;
        }

        public Builder setCustomData(c cVar) {
            this.zza.getWriter().setCustomData(cVar);
            return this;
        }

        public Builder setItemId(int i) {
            this.zza.getWriter().setItemId(i);
            return this;
        }

        public Builder setPlaybackDuration(double d) {
            this.zza.getWriter().setPlaybackDuration(d);
            return this;
        }

        public Builder setPreloadTime(double d) throws IllegalArgumentException {
            this.zza.getWriter().setPreloadTime(d);
            return this;
        }

        public Builder setStartTime(double d) throws IllegalArgumentException {
            this.zza.getWriter().setStartTime(d);
            return this;
        }

        public Builder(MediaQueueItem mediaQueueItem) throws IllegalArgumentException {
            this.zza = new MediaQueueItem(mediaQueueItem, (zzcj) null);
        }

        public Builder(c cVar) throws b {
            this.zza = new MediaQueueItem(cVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public class Writer {
        public Writer() {
        }

        @KeepForSdk
        public void setActiveTrackIds(long[] jArr) {
            MediaQueueItem.this.zzh = jArr;
        }

        @KeepForSdk
        public void setAutoplay(boolean z) {
            MediaQueueItem.this.zzd = z;
        }

        @KeepForSdk
        public void setCustomData(c cVar) {
            MediaQueueItem.this.zzi = cVar;
        }

        @KeepForSdk
        public void setItemId(int i) {
            MediaQueueItem.this.zzc = i;
        }

        @KeepForSdk
        public void setMedia(MediaInfo mediaInfo) {
            MediaQueueItem.this.zzb = mediaInfo;
        }

        @KeepForSdk
        public void setPlaybackDuration(double d) {
            if (!Double.isNaN(d)) {
                MediaQueueItem.this.zzf = d;
                return;
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }

        @KeepForSdk
        public void setPreloadTime(double d) {
            if (!Double.isNaN(d) && d >= 0.0d) {
                MediaQueueItem.this.zzg = d;
                return;
            }
            throw new IllegalArgumentException("preloadTime cannot be negative or NaN.");
        }

        @KeepForSdk
        public void setStartTime(double d) {
            if (Double.isNaN(d) || d >= 0.0d) {
                MediaQueueItem.this.zze = d;
                return;
            }
            throw new IllegalArgumentException("startTime cannot be negative.");
        }
    }

    @SafeParcelable.Constructor
    public MediaQueueItem(@SafeParcelable.Param(id = 2) MediaInfo mediaInfo, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) double d, @SafeParcelable.Param(id = 6) double d2, @SafeParcelable.Param(id = 7) double d3, @SafeParcelable.Param(id = 8) long[] jArr, @SafeParcelable.Param(id = 9) String str) {
        this.zze = Double.NaN;
        this.zzj = new Writer();
        this.zzb = mediaInfo;
        this.zzc = i;
        this.zzd = z;
        this.zze = d;
        this.zzf = d2;
        this.zzg = d3;
        this.zzh = jArr;
        this.zza = str;
        if (str == null) {
            this.zzi = null;
            return;
        }
        try {
            this.zzi = new c(str);
        } catch (b unused) {
            this.zzi = null;
            this.zza = null;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        c cVar = this.zzi;
        if (cVar != null) {
            z = false;
        } else {
            z = true;
        }
        c cVar2 = mediaQueueItem.zzi;
        if (cVar2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((cVar == null || cVar2 == null || JsonUtils.areJsonValuesEquivalent(cVar, cVar2)) && CastUtils.zze(this.zzb, mediaQueueItem.zzb) && this.zzc == mediaQueueItem.zzc && this.zzd == mediaQueueItem.zzd && (((Double.isNaN(this.zze) && Double.isNaN(mediaQueueItem.zze)) || this.zze == mediaQueueItem.zze) && this.zzf == mediaQueueItem.zzf && this.zzg == mediaQueueItem.zzg && Arrays.equals(this.zzh, mediaQueueItem.zzh))) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public boolean fromJson(c cVar) throws b {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (cVar.has("media")) {
            this.zzb = new MediaInfo(cVar.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (cVar.has("itemId") && this.zzc != (i = cVar.getInt("itemId"))) {
            this.zzc = i;
            z = true;
        }
        if (cVar.has("autoplay") && this.zzd != (z2 = cVar.getBoolean("autoplay"))) {
            this.zzd = z2;
            z = true;
        }
        double optDouble = cVar.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.zze) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.zze) > 1.0E-7d)) {
            this.zze = optDouble;
            z = true;
        }
        if (cVar.has("playbackDuration")) {
            double d = cVar.getDouble("playbackDuration");
            if (Math.abs(d - this.zzf) > 1.0E-7d) {
                this.zzf = d;
                z = true;
            }
        }
        if (cVar.has("preloadTime")) {
            double d2 = cVar.getDouble("preloadTime");
            if (Math.abs(d2 - this.zzg) > 1.0E-7d) {
                this.zzg = d2;
                z = true;
            }
        }
        if (cVar.has("activeTrackIds")) {
            a jSONArray = cVar.getJSONArray("activeTrackIds");
            int e = jSONArray.e();
            jArr = new long[e];
            for (int i2 = 0; i2 < e; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.zzh;
            if (jArr2 != null && jArr2.length == e) {
                for (int i3 = 0; i3 < e; i3++) {
                    if (this.zzh[i3] == jArr[i3]) {
                    }
                }
            }
            z3 = true;
            break;
        } else {
            jArr = null;
        }
        if (z3) {
            this.zzh = jArr;
            z = true;
        }
        if (cVar.has("customData")) {
            this.zzi = cVar.getJSONObject("customData");
            return true;
        }
        return z;
    }

    public long[] getActiveTrackIds() {
        return this.zzh;
    }

    public boolean getAutoplay() {
        return this.zzd;
    }

    public c getCustomData() {
        return this.zzi;
    }

    public int getItemId() {
        return this.zzc;
    }

    public MediaInfo getMedia() {
        return this.zzb;
    }

    public double getPlaybackDuration() {
        return this.zzf;
    }

    public double getPreloadTime() {
        return this.zzg;
    }

    public double getStartTime() {
        return this.zze;
    }

    @KeepForSdk
    public Writer getWriter() {
        return this.zzj;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzb, Integer.valueOf(this.zzc), Boolean.valueOf(this.zzd), Double.valueOf(this.zze), Double.valueOf(this.zzf), Double.valueOf(this.zzg), Integer.valueOf(Arrays.hashCode(this.zzh)), String.valueOf(this.zzi));
    }

    @KeepForSdk
    public c toJson() {
        c cVar = new c();
        try {
            MediaInfo mediaInfo = this.zzb;
            if (mediaInfo != null) {
                cVar.put("media", mediaInfo.zza());
            }
            int i = this.zzc;
            if (i != 0) {
                cVar.put("itemId", i);
            }
            cVar.put("autoplay", this.zzd);
            if (!Double.isNaN(this.zze)) {
                cVar.put("startTime", this.zze);
            }
            double d = this.zzf;
            if (d != Double.POSITIVE_INFINITY) {
                cVar.put("playbackDuration", d);
            }
            cVar.put("preloadTime", this.zzg);
            if (this.zzh != null) {
                a aVar = new a();
                for (long j : this.zzh) {
                    aVar.put(new Long(j));
                }
                cVar.put("activeTrackIds", aVar);
            }
            c cVar2 = this.zzi;
            if (cVar2 != null) {
                cVar.put("customData", cVar2);
            }
        } catch (b unused) {
        }
        return cVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String cVar;
        c cVar2 = this.zzi;
        if (cVar2 == null) {
            cVar = null;
        } else {
            cVar = cVar2.toString();
        }
        this.zza = cVar;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getMedia(), i, false);
        SafeParcelWriter.writeInt(parcel, 3, getItemId());
        SafeParcelWriter.writeBoolean(parcel, 4, getAutoplay());
        SafeParcelWriter.writeDouble(parcel, 5, getStartTime());
        SafeParcelWriter.writeDouble(parcel, 6, getPlaybackDuration());
        SafeParcelWriter.writeDouble(parcel, 7, getPreloadTime());
        SafeParcelWriter.writeLongArray(parcel, 8, getActiveTrackIds(), false);
        SafeParcelWriter.writeString(parcel, 9, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zzi() throws IllegalArgumentException {
        if (this.zzb != null) {
            if (!Double.isNaN(this.zze) && this.zze < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(this.zzf)) {
                if (!Double.isNaN(this.zzg) && this.zzg >= 0.0d) {
                    return;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public /* synthetic */ MediaQueueItem(MediaInfo mediaInfo, zzcj zzcjVar) {
        this(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    public /* synthetic */ MediaQueueItem(MediaQueueItem mediaQueueItem, zzcj zzcjVar) {
        this(mediaQueueItem.getMedia(), mediaQueueItem.getItemId(), mediaQueueItem.getAutoplay(), mediaQueueItem.getStartTime(), mediaQueueItem.getPlaybackDuration(), mediaQueueItem.getPreloadTime(), mediaQueueItem.getActiveTrackIds(), null);
        if (this.zzb != null) {
            this.zzi = mediaQueueItem.getCustomData();
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @KeepForSdk
    public MediaQueueItem(c cVar) throws b {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        fromJson(cVar);
    }
}
