package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbsn {
    private final View zza;
    private final Map zzb;
    private final zzbyf zzc;

    public zzbsn(zzbsm zzbsmVar) {
        View view;
        Map map;
        View view2;
        view = zzbsmVar.zza;
        this.zza = view;
        map = zzbsmVar.zzb;
        this.zzb = map;
        view2 = zzbsmVar.zza;
        zzbyf zza = zzbsh.zza(view2.getContext());
        this.zzc = zza;
        if (zza != null && !map.isEmpty()) {
            try {
                zza.zzf(new zzbso(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
            } catch (RemoteException unused) {
                zzbzo.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list) {
        if (list != null && !list.isEmpty()) {
            if (this.zzc == null) {
                zzbzo.zzj("Failed to get internal reporting info generator in recordClick.");
            }
            try {
                this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzbsl(this, list));
                return;
            } catch (RemoteException e) {
                zzbzo.zzg("RemoteException recording click: ".concat(e.toString()));
                return;
            }
        }
        zzbzo.zzj("No click urls were passed to recordClick");
    }

    public final void zzb(List list) {
        if (list != null && !list.isEmpty()) {
            zzbyf zzbyfVar = this.zzc;
            if (zzbyfVar != null) {
                try {
                    zzbyfVar.zzh(list, ObjectWrapper.wrap(this.zza), new zzbsk(this, list));
                    return;
                } catch (RemoteException e) {
                    zzbzo.zzg("RemoteException recording impression urls: ".concat(e.toString()));
                    return;
                }
            }
            zzbzo.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        zzbzo.zzj("No impression urls were passed to recordImpression");
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbyf zzbyfVar = this.zzc;
        if (zzbyfVar != null) {
            try {
                zzbyfVar.zzj(ObjectWrapper.wrap(motionEvent));
                return;
            } catch (RemoteException unused) {
                zzbzo.zzg("Failed to call remote method.");
                return;
            }
        }
        zzbzo.zze("Failed to get internal reporting info generator.");
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzk(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbsj(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(list, ObjectWrapper.wrap(this.zza), new zzbsi(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
