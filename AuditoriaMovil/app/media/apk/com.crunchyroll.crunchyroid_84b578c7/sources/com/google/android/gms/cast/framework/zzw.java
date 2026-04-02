package com.google.android.gms.cast.framework;

import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzbt;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzw extends zzaf {
    final /* synthetic */ CastSession zza;

    public /* synthetic */ zzw(CastSession castSession, zzv zzvVar) {
        this.zza = castSession;
    }

    @Override // com.google.android.gms.cast.framework.zzag
    public final void zzb(int i) {
        CastSession.zzh(this.zza, i);
    }

    @Override // com.google.android.gms.cast.framework.zzag
    public final void zzc(final String str, final String str2) {
        com.google.android.gms.cast.zzr zzrVar;
        com.google.android.gms.cast.zzr zzrVar2;
        com.google.android.gms.cast.zzr zzrVar3;
        CastSession castSession = this.zza;
        zzrVar = castSession.zzi;
        if (zzrVar != null) {
            zzrVar2 = castSession.zzi;
            if (zzrVar2.zzl()) {
                zzrVar3 = this.zza.zzi;
                final zzbt zzbtVar = (zzbt) zzrVar3;
                zzbtVar.doWrite(TaskApiCall.builder().run(new RemoteCall(str, str2, null) { // from class: com.google.android.gms.cast.zzbd
                    public final /* synthetic */ String zzb;
                    public final /* synthetic */ String zzc;

                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(Object obj, Object obj2) {
                        zzbt.this.zzG(this.zzb, this.zzc, null, (com.google.android.gms.cast.internal.zzx) obj, (TaskCompletionSource) obj2);
                    }
                }).setMethodKey(8407).build()).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.cast.framework.zzu
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        CastSession.zzi(zzw.this.zza, "joinApplication", task);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.cast.framework.zzag
    public final void zzd(final String str, final LaunchOptions launchOptions) {
        com.google.android.gms.cast.zzr zzrVar;
        com.google.android.gms.cast.zzr zzrVar2;
        com.google.android.gms.cast.zzr zzrVar3;
        CastSession castSession = this.zza;
        zzrVar = castSession.zzi;
        if (zzrVar != null) {
            zzrVar2 = castSession.zzi;
            if (zzrVar2.zzl()) {
                zzrVar3 = this.zza.zzi;
                final zzbt zzbtVar = (zzbt) zzrVar3;
                zzbtVar.doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzay
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(Object obj, Object obj2) {
                        zzbt.this.zzH(str, launchOptions, (com.google.android.gms.cast.internal.zzx) obj, (TaskCompletionSource) obj2);
                    }
                }).setMethodKey(8406).build()).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.cast.framework.zzt
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        CastSession.zzi(zzw.this.zza, "launchApplication", task);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.cast.framework.zzag
    public final void zze(final String str) {
        com.google.android.gms.cast.zzr zzrVar;
        com.google.android.gms.cast.zzr zzrVar2;
        com.google.android.gms.cast.zzr zzrVar3;
        CastSession castSession = this.zza;
        zzrVar = castSession.zzi;
        if (zzrVar != null) {
            zzrVar2 = castSession.zzi;
            if (zzrVar2.zzl()) {
                zzrVar3 = this.zza.zzi;
                final zzbt zzbtVar = (zzbt) zzrVar3;
                zzbtVar.doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzbj
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(Object obj, Object obj2) {
                        zzbt.this.zzN(str, (com.google.android.gms.cast.internal.zzx) obj, (TaskCompletionSource) obj2);
                    }
                }).setMethodKey(8409).build());
            }
        }
    }
}
