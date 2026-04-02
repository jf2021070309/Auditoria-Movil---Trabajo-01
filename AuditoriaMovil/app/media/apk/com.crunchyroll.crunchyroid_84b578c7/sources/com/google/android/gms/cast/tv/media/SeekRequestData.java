package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "SeekRequestDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class SeekRequestData extends AbstractSafeParcelable implements zzw {
    public static final long SEEK_POSITION_INFINITE_MS = 4294967296000L;
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    zza zzb;
    @SafeParcelable.Field(getter = "getResumeState", id = 3)
    private final int zzd;
    @SafeParcelable.Field(getter = "getCurrentTime", id = 4)
    private final Long zze;
    @SafeParcelable.Field(getter = "getRelativeTime", id = 5)
    private final Long zzf;
    private static final Logger zzc = new Logger("SeekReq");
    public static final Parcelable.Creator<SeekRequestData> CREATOR = new zzx();

    /* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface SeekResumeState {
        public static final int PLAYBACK_PAUSE = 2;
        public static final int PLAYBACK_START = 1;
        public static final int PLAYBACK_UNCHANGED = 0;
    }

    public SeekRequestData(long j, c cVar, int i, Long l, Long l2) {
        this(new zza(j, null, null), 1, l, (Long) null);
    }

    public static SeekRequestData zza(c cVar) {
        char c;
        Long l;
        String optString = cVar.optString("resumeState");
        int hashCode = optString.hashCode();
        int i = 0;
        if (hashCode != 304486066) {
            if (hashCode == 307803422 && optString.equals("PLAYBACK_START")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (optString.equals("PLAYBACK_PAUSE")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                i = 2;
            }
        } else {
            i = 1;
        }
        Long l2 = null;
        if (cVar.has("currentTime")) {
            l = Long.valueOf(CastUtils.secToMillisec(cVar.optDouble("currentTime")));
        } else {
            l = null;
        }
        if (cVar.has("relativeTime")) {
            l2 = Long.valueOf(CastUtils.secToMillisec(cVar.optDouble("relativeTime")));
        }
        return new SeekRequestData(zza.zzb(cVar), i, l, l2);
    }

    public Long getCurrentTime() {
        return this.zze;
    }

    @Override // com.google.android.gms.cast.RequestData
    public c getCustomData() {
        return this.zzb.getCustomData();
    }

    public Long getRelativeTime() {
        return this.zzf;
    }

    @Override // com.google.android.gms.cast.RequestData
    public final long getRequestId() {
        return this.zzb.getRequestId();
    }

    public int getResumeState() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.zza = this.zzb.zza();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, getResumeState());
        SafeParcelWriter.writeLongObject(parcel, 4, getCurrentTime(), false);
        SafeParcelWriter.writeLongObject(parcel, 5, getRelativeTime(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zzb() {
        c cVar = new c();
        try {
            cVar.put("requestId", this.zzb.getRequestId());
            cVar.putOpt("customData", getCustomData());
            int i = this.zzd;
            if (i != 1) {
                if (i == 2) {
                    cVar.put("resumeState", "PLAYBACK_PAUSE");
                }
            } else {
                cVar.put("resumeState", "PLAYBACK_START");
            }
            Long l = this.zze;
            if (l != null) {
                cVar.put("currentTime", CastUtils.millisecToSec(l.longValue()));
            }
            Long l2 = this.zzf;
            if (l2 != null) {
                cVar.put("relativeTime", CastUtils.millisecToSec(l2.longValue()));
            }
        } catch (b e) {
            zzc.e("Failed to transform SeekRequestData into JSON", e);
        }
        return cVar;
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }

    public final void zzd(com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zzb.zzd(zzlVar);
    }

    @SafeParcelable.Constructor
    public SeekRequestData(@SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) Long l, @SafeParcelable.Param(id = 5) Long l2) {
        this(new zza(bundle), i, l, l2);
    }

    private SeekRequestData(zza zzaVar, int i, Long l, Long l2) {
        this.zzb = zzaVar;
        this.zzd = i;
        this.zze = l;
        this.zzf = l2;
    }
}
