package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzdnk implements zzblt {
    final /* synthetic */ zzdog zza;
    final /* synthetic */ ViewGroup zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdnk(zzdog zzdogVar, ViewGroup viewGroup) {
        this.zza = zzdogVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zza() {
        zzdog zzdogVar = this.zza;
        zzfoj<String> zzfojVar = zzdnh.zza;
        Map<String, WeakReference<View>> zzk = zzdogVar.zzk();
        if (zzk == null) {
            return;
        }
        int size = zzfojVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (zzk.get(zzfojVar.get(i)) != null) {
                this.zza.onClick(this.zzb);
                return;
            }
            i = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zzb(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final JSONObject zzc() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final JSONObject zzd() {
        return this.zza.zzq();
    }
}
