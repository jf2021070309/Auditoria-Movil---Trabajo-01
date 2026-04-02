package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.work.WorkRequest;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
final class zzah implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final Object zzb = new Object();
    private boolean zzc = false;
    private BillingClientStateListener zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzah(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzs zzsVar) {
        this.zza = billingClientImpl;
        this.zzd = billingClientStateListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(BillingResult billingResult) {
        BillingClientImpl.zze(this.zza, new zzae(this, billingResult));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zza.zza("BillingClient", "Billing service connected.");
        BillingClientImpl.zzi(this.zza, com.google.android.gms.internal.play_billing.zzc.zzo(iBinder));
        if (BillingClientImpl.zzw(this.zza, new zzaf(this), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzag(this)) == null) {
            zzf(BillingClientImpl.zzx(this.zza));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Billing service disconnected.");
        BillingClientImpl.zzi(this.zza, null);
        BillingClientImpl.zzj(this.zza, 0);
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingServiceDisconnected();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        synchronized (this.zzb) {
            this.zzd = null;
            this.zzc = true;
        }
    }
}
