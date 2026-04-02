package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class zzdp extends com.google.android.gms.cast.internal.zzc {
    private com.google.android.gms.cast.internal.zzas zza;
    protected final WeakReference zzg;
    final /* synthetic */ RemoteMediaPlayer zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzh = remoteMediaPlayer;
        this.zzg = new WeakReference(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzdo(this, status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        Object obj;
        zzdm zzdmVar;
        zzdm zzdmVar2;
        com.google.android.gms.cast.internal.zzw zzwVar = (com.google.android.gms.cast.internal.zzw) anyClient;
        obj = this.zzh.zza;
        synchronized (obj) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.zzg.get();
            if (googleApiClient != null) {
                zzdmVar = this.zzh.zzc;
                zzdmVar.zzc(googleApiClient);
                try {
                    zza(zzwVar);
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (Throwable unused) {
                    setResult((zzdp) new zzdo(this, new Status(2100)));
                }
                zzdmVar2 = this.zzh.zzc;
                zzdmVar2.zzc(null);
                return;
            }
            setResult((zzdp) new zzdo(this, new Status(2100)));
        }
    }

    public abstract void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws com.google.android.gms.cast.internal.zzao;

    public final com.google.android.gms.cast.internal.zzas zzb() {
        if (this.zza == null) {
            this.zza = new zzdn(this);
        }
        return this.zza;
    }
}
