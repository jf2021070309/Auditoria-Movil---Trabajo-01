package e.a.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.play_billing.zza;
/* loaded from: classes.dex */
public final class d0 extends BroadcastReceiver {
    public final p a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4991b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e0 f4992c;

    public /* synthetic */ d0(e0 e0Var, p pVar) {
        this.f4992c = e0Var;
        this.a = pVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a(zza.zzg(intent, "BillingBroadcastManager"), zza.zzi(intent.getExtras()));
    }
}
