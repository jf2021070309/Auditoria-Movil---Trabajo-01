package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzcgm;
@TargetApi(24)
/* loaded from: classes.dex */
public class zzz extends zzx {
    public static final boolean zzp(int i2, int i3, int i4) {
        return Math.abs(i2 - i3) <= i4;
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
            int i2 = zzy.heightPixels;
            int i3 = zzy.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            double d2 = activity.getResources().getDisplayMetrics().density;
            Double.isNaN(d2);
            int intValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzdi)).intValue() * ((int) Math.round(d2 + 0.5d));
            return (zzp(i2, zzs + dimensionPixelSize, intValue) && zzp(i3, zzs2, intValue)) ? false : true;
        }
        return false;
    }
}
