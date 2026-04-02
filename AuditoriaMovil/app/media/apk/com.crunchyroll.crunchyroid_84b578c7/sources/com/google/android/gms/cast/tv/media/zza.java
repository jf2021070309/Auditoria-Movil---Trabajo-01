package com.google.android.gms.cast.tv.media;

import android.annotation.TargetApi;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.util.PlatformVersion;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zza implements zzw {
    private long zza;
    private final c zzb;
    private com.google.android.gms.internal.cast_tv.zzl zzc;

    public zza(long j, c cVar, com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zza = j;
        this.zzb = cVar;
        this.zzc = zzlVar;
    }

    public static zza zzb(c cVar) {
        return new zza(cVar.optLong("requestId"), cVar.optJSONObject("customData"), null);
    }

    @Override // com.google.android.gms.cast.RequestData
    public final c getCustomData() {
        return this.zzb;
    }

    @Override // com.google.android.gms.cast.RequestData
    public final long getRequestId() {
        return this.zza;
    }

    @TargetApi(21)
    public final Bundle zza() {
        com.google.android.gms.internal.cast_tv.zzl zzlVar;
        Bundle bundle = new Bundle();
        bundle.putLong("requestId", this.zza);
        c cVar = this.zzb;
        if (cVar != null) {
            bundle.putString("customData", cVar.toString());
        }
        if (PlatformVersion.isAtLeastLollipop() && (zzlVar = this.zzc) != null) {
            bundle.putBinder("defaultHandler", zzlVar.asBinder());
        }
        return bundle;
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzc;
    }

    public final void zzd(com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zzc = zzlVar;
    }

    public final void zze(long j) {
        this.zza = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zza(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = "requestId"
            long r0 = r6.getLong(r0)
            java.lang.String r2 = "customData"
            java.lang.String r2 = r6.getString(r2)
            com.amazon.aps.iva.if0.c r2 = com.google.android.gms.cast.internal.CastUtils.jsonStringToJsonObject(r2)
            boolean r3 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            r4 = 0
            if (r3 != 0) goto L18
            goto L24
        L18:
            java.lang.String r3 = "defaultHandler"
            android.os.IBinder r6 = r6.getBinder(r3)
            if (r6 == 0) goto L24
            com.google.android.gms.internal.cast_tv.zzl r4 = com.google.android.gms.internal.cast_tv.zzk.zzb(r6)
        L24:
            r5.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.tv.media.zza.<init>(android.os.Bundle):void");
    }
}
