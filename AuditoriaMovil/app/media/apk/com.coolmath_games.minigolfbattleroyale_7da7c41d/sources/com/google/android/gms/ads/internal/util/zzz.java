package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.appevents.codeless.internal.Constants;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzcgm;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public class zzz extends zzx {
    static final boolean zzp(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzad
    public final boolean zzo(Activity activity, Configuration configuration) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdk)).booleanValue()) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdm)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            zzber.zza();
            int zzs = zzcgm.zzs(activity, configuration.screenHeightDp);
            int zzs2 = zzcgm.zzs(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzt.zzc();
            DisplayMetrics zzy = zzs.zzy((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i = zzy.heightPixels;
            int i2 = zzy.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", Constants.PLATFORM);
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) zzbet.zzc().zzc(zzbjl.zzdi)).intValue();
            return (zzp(i, zzs + dimensionPixelSize, round) && zzp(i2, zzs2, round)) ? false : true;
        }
        return false;
    }
}
