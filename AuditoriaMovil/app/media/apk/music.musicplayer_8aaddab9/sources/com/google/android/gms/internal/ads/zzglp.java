package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import c.d.a.b;
import c.d.a.d;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class zzglp extends d {
    private final WeakReference<zzbkj> zza;

    public zzglp(zzbkj zzbkjVar, byte[] bArr) {
        this.zza = new WeakReference<>(zzbkjVar);
    }

    @Override // c.d.a.d
    public final void onCustomTabsServiceConnected(ComponentName componentName, b bVar) {
        zzbkj zzbkjVar = this.zza.get();
        if (zzbkjVar != null) {
            zzbkjVar.zzf(bVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbkj zzbkjVar = this.zza.get();
        if (zzbkjVar != null) {
            zzbkjVar.zzg();
        }
    }
}
