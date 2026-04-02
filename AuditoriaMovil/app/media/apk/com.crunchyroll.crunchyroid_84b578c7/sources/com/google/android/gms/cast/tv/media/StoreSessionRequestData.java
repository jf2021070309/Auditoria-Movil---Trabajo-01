package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "StoreSessionRequestDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class StoreSessionRequestData extends AbstractSafeParcelable implements zzw {
    public static final Parcelable.Creator<StoreSessionRequestData> CREATOR = new zzab();
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    @SafeParcelable.Field(id = 3)
    Bundle zzb;
    private final zza zzc;
    private final Map zzd;
    private com.google.android.gms.internal.cast_tv.zzu zze;

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StoreSessionRequestData(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.Bundle r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.os.Bundle r5) {
        /*
            r3 = this;
            com.google.android.gms.cast.tv.media.zza r0 = new com.google.android.gms.cast.tv.media.zza
            r0.<init>(r4)
            java.lang.String r4 = "targetDeviceCapabilities"
            java.io.Serializable r4 = r5.getSerializable(r4)
            boolean r1 = r4 instanceof java.util.Map
            if (r1 != 0) goto L15
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            goto L17
        L15:
            java.util.Map r4 = (java.util.Map) r4
        L17:
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            r2 = 0
            if (r1 != 0) goto L1f
            goto L2b
        L1f:
            java.lang.String r1 = "storeSessionDefaultHandler"
            android.os.IBinder r5 = r5.getBinder(r1)
            if (r5 == 0) goto L2b
            com.google.android.gms.internal.cast_tv.zzu r2 = com.google.android.gms.internal.cast_tv.zzt.zzb(r5)
        L2b:
            r3.<init>(r0, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.tv.media.StoreSessionRequestData.<init>(android.os.Bundle, android.os.Bundle):void");
    }

    public static StoreSessionRequestData zza(c cVar) {
        zza zzb = zza.zzb(cVar);
        c optJSONObject = cVar.optJSONObject("targetDeviceCapabilities");
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, Boolean.valueOf(optJSONObject.optBoolean(next)));
            }
        }
        return new StoreSessionRequestData(zzb, hashMap, null);
    }

    @Override // com.google.android.gms.cast.RequestData
    public c getCustomData() {
        return this.zzc.getCustomData();
    }

    @Override // com.google.android.gms.cast.RequestData
    public final long getRequestId() {
        return this.zzc.getRequestId();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        com.google.android.gms.internal.cast_tv.zzu zzuVar;
        this.zza = this.zzc.zza();
        if (this.zzb == null) {
            this.zzb = new Bundle();
        }
        Map map = this.zzd;
        if (map != null) {
            this.zzb.putSerializable("targetDeviceCapabilities", new HashMap(map));
        }
        if (this.zzb == null) {
            this.zzb = new Bundle();
        }
        if (PlatformVersion.isAtLeastLollipop() && (zzuVar = this.zze) != null) {
            this.zzb.putBinder("storeSessionDefaultHandler", zzuVar.asBinder());
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        SafeParcelWriter.writeBundle(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.internal.cast_tv.zzu zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzc.zzc();
    }

    public final void zzd(com.google.android.gms.internal.cast_tv.zzu zzuVar) {
        this.zze = zzuVar;
    }

    private StoreSessionRequestData(zza zzaVar, Map map, com.google.android.gms.internal.cast_tv.zzu zzuVar) {
        this.zzc = zzaVar;
        this.zzd = map;
        this.zze = zzuVar;
    }
}
