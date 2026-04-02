package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.ws.WebSocketProtocol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzbf implements com.google.android.gms.cast.internal.zzar {
    final /* synthetic */ RemoteMediaClient zza;
    private com.google.android.gms.cast.zzr zzb;
    private final AtomicLong zzc = new AtomicLong((CastUtils.zza() & WebSocketProtocol.PAYLOAD_SHORT_MAX) * NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS);

    public zzbf(RemoteMediaClient remoteMediaClient) {
        this.zza = remoteMediaClient;
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final long zza() {
        return this.zzc.getAndIncrement();
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final void zzb(String str, String str2, final long j, String str3) {
        com.google.android.gms.cast.zzr zzrVar = this.zzb;
        if (zzrVar != null) {
            zzrVar.zzh(str, str2).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.cast.framework.media.zzbe
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    int i;
                    com.google.android.gms.cast.internal.zzaq zzaqVar;
                    if (exc instanceof ApiException) {
                        i = ((ApiException) exc).getStatusCode();
                    } else {
                        i = 13;
                    }
                    long j2 = j;
                    zzaqVar = zzbf.this.zza.zzd;
                    zzaqVar.zzP(j2, i);
                }
            });
            return;
        }
        throw new IllegalStateException("Device is not connected");
    }

    public final void zzc(com.google.android.gms.cast.zzr zzrVar) {
        this.zzb = zzrVar;
    }
}
