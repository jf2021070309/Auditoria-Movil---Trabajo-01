package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.internal.AnalyticsEvents;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeph implements zzery<zzepi> {
    private final zzfsn zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set<String> zzd;

    public zzeph(zzfsn zzfsnVar, ViewGroup viewGroup, Context context, Set<String> set) {
        this.zza = zzfsnVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzepi> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzepg
            private final zzeph zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzepi zzb() throws Exception {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzei)).booleanValue() || this.zzb == null || !this.zzd.contains("banner")) {
            Boolean bool = null;
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzej)).booleanValue() && this.zzd.contains(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE)) {
                Context context = this.zzc;
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    Window window = activity.getWindow();
                    boolean z = true;
                    if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                        try {
                            if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) == 0) {
                                z = false;
                            }
                            bool = Boolean.valueOf(z);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    } else {
                        bool = true;
                    }
                    return new zzepi(bool);
                }
            }
            return new zzepi(null);
        }
        return new zzepi(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
    }
}
