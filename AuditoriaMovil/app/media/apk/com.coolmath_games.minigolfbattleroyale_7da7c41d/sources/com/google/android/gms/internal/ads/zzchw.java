package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
abstract class zzchw {
    private final WeakReference<View> zza;

    public zzchw(View view) {
        this.zza = new WeakReference<>(view);
    }

    protected abstract void zza(ViewTreeObserver viewTreeObserver);

    protected abstract void zzb(ViewTreeObserver viewTreeObserver);

    public final void zzc() {
        ViewTreeObserver zze = zze();
        if (zze != null) {
            zza(zze);
        }
    }

    public final void zzd() {
        ViewTreeObserver zze = zze();
        if (zze != null) {
            zzb(zze);
        }
    }

    protected final ViewTreeObserver zze() {
        ViewTreeObserver viewTreeObserver;
        View view = this.zza.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
