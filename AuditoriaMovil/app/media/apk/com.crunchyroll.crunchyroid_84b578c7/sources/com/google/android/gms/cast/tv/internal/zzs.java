package com.google.android.gms.cast.tv.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.cast_tv.zzcf;
import com.google.android.gms.internal.cast_tv.zzci;
import com.google.android.gms.internal.cast_tv.zzcp;
import com.google.android.gms.internal.cast_tv.zzcq;
import com.google.android.gms.internal.cast_tv.zzdx;
import com.google.android.gms.internal.cast_tv.zzdz;
import com.google.android.gms.internal.cast_tv.zzed;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.net.URL;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzs implements zza {
    final /* synthetic */ CastTvHostService zza;

    public /* synthetic */ zzs(CastTvHostService castTvHostService, zzr zzrVar) {
        this.zza = castTvHostService;
    }

    @Override // com.google.android.gms.cast.tv.internal.zza
    public final Task zza(final URL url) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        CastTvHostService.m42$$Nest$mdispatchClientOperation(this.zza, new zzu() { // from class: com.google.android.gms.cast.tv.internal.zzl
            @Override // com.google.android.gms.cast.tv.internal.zzu
            public final void zza(zzt zztVar) {
                zzs zzsVar = zzs.this;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                URL url2 = url;
                if (!zztVar.zzc.zzd().contains(zzci.CAST_TV_CLIENT_CAPABILITY_GET_CAST_DEVICE_HEADERS_SUPPORTED)) {
                    CastTvHostService.m49$$Nest$sfgetlog().w("Client doesn't support GetCastDeviceHeaders API.", new Object[0]);
                    taskCompletionSource2.setException(new ApiException(zzai.zza));
                    return;
                }
                zzcp zza = zzcq.zza();
                zza.zza(url2.toString());
                zztVar.zza.zze(new zzed((zzcq) zza.zzi()), new zzq(zzsVar, taskCompletionSource2));
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.cast.tv.internal.zza
    public final void zzb(final zzdx zzdxVar) {
        CastTvHostService.m42$$Nest$mdispatchClientOperation(this.zza, new zzu() { // from class: com.google.android.gms.cast.tv.internal.zzm
            @Override // com.google.android.gms.cast.tv.internal.zzu
            public final void zza(zzt zztVar) {
                zzdx zzdxVar2 = zzdx.this;
                if (zztVar.zzc.zzd().contains(zzci.CAST_TV_CLIENT_CAPABILITY_LOGGING_SUPPORTED)) {
                    zztVar.zza.zzf(zzdxVar2);
                }
            }
        });
    }

    @Override // com.google.android.gms.cast.tv.internal.zza
    public final void zzc(final boolean z) {
        CastTvHostService.m42$$Nest$mdispatchClientOperation(this.zza, new zzu() { // from class: com.google.android.gms.cast.tv.internal.zzn
            @Override // com.google.android.gms.cast.tv.internal.zzu
            public final void zza(zzt zztVar) {
                zztVar.zza.zzg(z);
            }
        });
    }

    @Override // com.google.android.gms.cast.tv.internal.zza
    public final void zzd(final zzcf zzcfVar) {
        CastTvHostService.m42$$Nest$mdispatchClientOperation(this.zza, new zzu() { // from class: com.google.android.gms.cast.tv.internal.zzp
            @Override // com.google.android.gms.cast.tv.internal.zzu
            public final void zza(zzt zztVar) {
                zztVar.zza.zzh(new zzdz(zzcf.this));
            }
        });
    }

    @Override // com.google.android.gms.cast.tv.internal.zza
    public final void zze(final String str, final String str2, final String str3) {
        CastTvHostService.m42$$Nest$mdispatchClientOperation(this.zza, new zzu() { // from class: com.google.android.gms.cast.tv.internal.zzo
            @Override // com.google.android.gms.cast.tv.internal.zzu
            public final void zza(zzt zztVar) {
                zztVar.zza.zzi(str, str2, str3);
            }
        });
    }
}
