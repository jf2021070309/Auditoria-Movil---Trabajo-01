package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaas;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzn implements View.OnTouchListener {
    final /* synthetic */ zzs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzaas zzaasVar;
        zzaas zzaasVar2;
        zzaasVar = this.zza.zzh;
        if (zzaasVar != null) {
            zzaasVar2 = this.zza.zzh;
            zzaasVar2.zzd(motionEvent);
            return false;
        }
        return false;
    }
}
