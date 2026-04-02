package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
/* loaded from: classes.dex */
public final class zzcal {
    @Nonnull
    private final View zza;
    private final Map<String, WeakReference<View>> zzb;
    private final zzcfn zzc;

    public zzcal(zzcak zzcakVar) {
        View view;
        Map<String, WeakReference<View>> map;
        View view2;
        view = zzcakVar.zza;
        this.zza = view;
        map = zzcakVar.zzb;
        this.zzb = map;
        view2 = zzcakVar.zza;
        zzcfn zza = zzcah.zza(view2.getContext());
        this.zzc = zza;
        if (zza == null || map.isEmpty()) {
            return;
        }
        try {
            zza.zzi(new zzcam(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
        } catch (RemoteException unused) {
            zzcgt.zzf("Failed to call remote method.");
        }
    }

    public final void zza(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzcai(this, updateImpressionUrlsCallback));
        } catch (RemoteException e2) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e2.toString()));
        }
    }

    public final void zzb(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzh(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzcaj(this, updateClickUrlCallback));
        } catch (RemoteException e2) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e2.toString()));
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzcfn zzcfnVar = this.zzc;
        if (zzcfnVar == null) {
            zzcgt.zzd("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzcfnVar.zzf(ObjectWrapper.wrap(motionEvent));
        } catch (RemoteException unused) {
            zzcgt.zzf("Failed to call remote method.");
        }
    }
}
