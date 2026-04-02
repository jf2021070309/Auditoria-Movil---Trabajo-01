package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.games.VideosClient;
import com.google.android.gms.games.internal.zzf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public final class zzn extends zzf.zzw<VideosClient.OnCaptureOverlayStateListener> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(ListenerHolder listenerHolder) {
        super(listenerHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
    public final void onCaptureOverlayStateChanged(final int i) {
        zzc(new zzf.zzar(i) { // from class: com.google.android.gms.games.internal.zzm
            private final int zzdr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdr = i;
            }

            @Override // com.google.android.gms.games.internal.zzf.zzar
            public final void accept(Object obj) {
                ((VideosClient.OnCaptureOverlayStateListener) obj).onCaptureOverlayStateChanged(this.zzdr);
            }
        });
    }
}
