package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzav;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
final class zzg extends RelativeLayout {
    final zzav zza;
    boolean zzb;

    public zzg(Context context, String str, String str2, String str3) {
        super(context);
        zzav zzavVar = new zzav(context, str);
        this.zza = zzavVar;
        zzavVar.zzd(str2);
        this.zza.zzc(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzb) {
            return false;
        }
        this.zza.zza(motionEvent);
        return false;
    }
}
