package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class zzbk extends BasePendingResult {
    private com.google.android.gms.cast.internal.zzas zza;
    private final boolean zzb;
    final /* synthetic */ RemoteMediaClient zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbk(RemoteMediaClient remoteMediaClient, boolean z) {
        super((GoogleApiClient) null);
        this.zzg = remoteMediaClient;
        this.zzb = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzbj(this, status);
    }

    public abstract void zza() throws com.google.android.gms.cast.internal.zzao;

    public final com.google.android.gms.cast.internal.zzas zzb() {
        if (this.zza == null) {
            this.zza = new zzbi(this);
        }
        return this.zza;
    }

    public final void zzc() {
        Object obj;
        List<RemoteMediaClient.Listener> list;
        List<RemoteMediaClient.Callback> list2;
        if (!this.zzb) {
            list = this.zzg.zzi;
            for (RemoteMediaClient.Listener listener : list) {
                listener.onSendingRemoteMediaRequest();
            }
            list2 = this.zzg.zzj;
            for (RemoteMediaClient.Callback callback : list2) {
                callback.onSendingRemoteMediaRequest();
            }
        }
        try {
            obj = this.zzg.zzb;
            synchronized (obj) {
                zza();
            }
        } catch (com.google.android.gms.cast.internal.zzao unused) {
            setResult(new zzbj(this, new Status(2100)));
        }
    }
}
