package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zza extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ zzh zza;

    public zza(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        zzg zzgVar;
        boolean contains;
        zzg zzgVar2;
        OuterHighlightDrawable outerHighlightDrawable;
        zzh zzhVar = this.zza;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        zzgVar = zzhVar.zzk;
        if (zzgVar != null) {
            contains = zzhVar.zzd.contains(Math.round(x), Math.round(y));
            if (contains) {
                outerHighlightDrawable = this.zza.zze;
                if (outerHighlightDrawable.zzg(x, y)) {
                    return true;
                }
            }
            zzgVar2 = this.zza.zzk;
            zzgVar2.zza();
            return true;
        }
        return true;
    }
}
