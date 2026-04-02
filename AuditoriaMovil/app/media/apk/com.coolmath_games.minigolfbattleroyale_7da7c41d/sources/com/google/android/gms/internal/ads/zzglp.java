package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzglp extends CustomTabsServiceConnection {
    private final WeakReference<zzbkj> zza;

    public zzglp(zzbkj zzbkjVar, byte[] bArr) {
        this.zza = new WeakReference<>(zzbkjVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbkj zzbkjVar = this.zza.get();
        if (zzbkjVar != null) {
            zzbkjVar.zzf(customTabsClient);
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
