package com.google.android.gms.cast.tv.internal;

import android.os.Binder;
import com.google.android.gms.internal.cast_tv.zzeb;
import com.google.android.gms.internal.cast_tv.zzeh;
import com.google.android.gms.internal.cast_tv.zzej;
import com.google.android.gms.internal.cast_tv.zzek;
import com.google.android.gms.internal.cast_tv.zzeq;
import com.google.android.gms.internal.cast_tv.zzes;
import com.google.android.gms.internal.cast_tv.zzeu;
import com.google.android.gms.internal.cast_tv.zzfa;
import com.google.android.gms.internal.cast_tv.zzfc;
import com.google.android.gms.internal.cast_tv.zzfe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzag extends zzek {
    final /* synthetic */ CastTvHostService zza;

    public /* synthetic */ zzag(CastTvHostService castTvHostService, zzaf zzafVar) {
        this.zza = castTvHostService;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzel
    public final void zzb(final zzes zzesVar, final zzeh zzehVar) {
        zzaj.zza().post(new Runnable() { // from class: com.google.android.gms.cast.tv.internal.zzaa
            @Override // java.lang.Runnable
            public final void run() {
                zzag zzagVar = zzag.this;
                zzagVar.zza.checkLaunchSupported(zzesVar, zzehVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzel
    @Deprecated
    public final void zzc(zzeu zzeuVar, final zzeh zzehVar) {
        zzaj.zza().post(new Runnable() { // from class: com.google.android.gms.cast.tv.internal.zzae
            @Override // java.lang.Runnable
            public final void run() {
                zzag zzagVar = zzag.this;
                zzagVar.zza.notifyBooleanCallback(zzehVar, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzel
    public final void zzd(zzfa zzfaVar, final zzeh zzehVar) {
        zzaj.zza().post(new Runnable() { // from class: com.google.android.gms.cast.tv.internal.zzac
            @Override // java.lang.Runnable
            public final void run() {
                zzag zzagVar = zzag.this;
                zzagVar.zza.notifyBooleanCallback(zzehVar, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzel
    public final void zze(final String str, final String str2, final String str3, final zzeq zzeqVar) {
        final int callingUid = Binder.getCallingUid();
        zzaj.zza().post(new Runnable() { // from class: com.google.android.gms.cast.tv.internal.zzw
            @Override // java.lang.Runnable
            public final void run() {
                zzag zzagVar = zzag.this;
                zzagVar.zza.onMessage(str, str2, str3, zzeqVar, callingUid);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzel
    public final void zzf(final zzfe zzfeVar) {
        final int callingUid = Binder.getCallingUid();
        zzaj.zza().post(new Runnable() { // from class: com.google.android.gms.cast.tv.internal.zzx
            @Override // java.lang.Runnable
            public final void run() {
                zzag zzagVar = zzag.this;
                zzagVar.zza.onSenderConnected(zzfeVar, callingUid);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzel
    public final void zzg(final zzfc zzfcVar) {
        final int callingUid = Binder.getCallingUid();
        zzaj.zza().post(new Runnable() { // from class: com.google.android.gms.cast.tv.internal.zzz
            @Override // java.lang.Runnable
            public final void run() {
                zzag zzagVar = zzag.this;
                zzagVar.zza.onSenderDisconnected(zzfcVar, callingUid);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzel
    public final void zzh() {
        final int callingUid = Binder.getCallingUid();
        zzaj.zza().post(new Runnable() { // from class: com.google.android.gms.cast.tv.internal.zzab
            @Override // java.lang.Runnable
            public final void run() {
                zzag zzagVar = zzag.this;
                zzagVar.zza.onStopApplication(callingUid);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzel
    public final void zzi(final zzej zzejVar) {
        final int callingUid = Binder.getCallingUid();
        zzaj.zza().post(new Runnable() { // from class: com.google.android.gms.cast.tv.internal.zzy
            @Override // java.lang.Runnable
            public final void run() {
                zzag zzagVar = zzag.this;
                zzagVar.zza.addClientEntry(zzejVar, callingUid);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzel
    public final void zzj(final zzeb zzebVar) {
        final int callingUid = Binder.getCallingUid();
        zzaj.zza().post(new Runnable() { // from class: com.google.android.gms.cast.tv.internal.zzad
            @Override // java.lang.Runnable
            public final void run() {
                zzag zzagVar = zzag.this;
                zzagVar.zza.setClientInfo(callingUid, zzebVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzel
    public final void zzk(final zzej zzejVar, final zzeb zzebVar) {
        final int callingUid = Binder.getCallingUid();
        zzaj.zza().post(new Runnable() { // from class: com.google.android.gms.cast.tv.internal.zzv
            @Override // java.lang.Runnable
            public final void run() {
                zzag zzagVar = zzag.this;
                zzej zzejVar2 = zzejVar;
                int i = callingUid;
                zzeb zzebVar2 = zzebVar;
                zzagVar.zza.addClientEntry(zzejVar2, i);
                zzagVar.zza.setClientInfo(i, zzebVar2);
            }
        });
    }
}
