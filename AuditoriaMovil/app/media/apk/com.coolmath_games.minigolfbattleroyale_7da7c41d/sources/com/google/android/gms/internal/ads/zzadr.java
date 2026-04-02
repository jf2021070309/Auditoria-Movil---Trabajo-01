package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzadr implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzadt zza;
    private final Handler zzb;

    public zzadr(zzadt zzadtVar, Handler handler) {
        this.zza = zzadtVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.zzb.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzadq
            private final zzadr zza;
            private final int zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzadr zzadrVar = this.zza;
                zzadt.zzd(zzadrVar.zza, this.zzb);
            }
        });
    }
}
