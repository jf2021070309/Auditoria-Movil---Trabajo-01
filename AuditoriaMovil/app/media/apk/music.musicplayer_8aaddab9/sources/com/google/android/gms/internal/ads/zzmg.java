package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
/* loaded from: classes.dex */
public final class zzmg implements DisplayManager.DisplayListener, zzme {
    private final DisplayManager zza;
    private zzmd zzb;

    private zzmg(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzme zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzmg(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        zzmd zzmdVar = this.zzb;
        if (zzmdVar == null || i2 != 0) {
            return;
        }
        zzmdVar.zza(zzd());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zza(zzmd zzmdVar) {
        this.zzb = zzmdVar;
        this.zza.registerDisplayListener(this, zzamq.zzh(null));
        zzmdVar.zza(zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzb() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }
}
