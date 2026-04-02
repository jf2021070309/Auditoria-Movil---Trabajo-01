package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.RecentlyNonNull;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzcgt;
import e.a.d.a.a;
@VisibleForTesting
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    @RecentlyNonNull
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    @RecentlyNonNull
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    @RecentlyNonNull
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    @RecentlyNonNull
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    @RecentlyNonNull
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    @RecentlyNonNull
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(SyslogConstants.LOG_LOCAL4, 600, "160x600_as");
    @RecentlyNonNull
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    @RecentlyNonNull
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    @RecentlyNonNull
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    @RecentlyNonNull
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");
    @RecentlyNonNull
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdSize(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r6)
        La:
            r1 = -2
            if (r7 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r7)
        L14:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 4
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "x"
            java.lang.String r3 = "_as"
            java.lang.String r0 = e.a.d.a.a.t(r4, r0, r2, r1, r3)
            r5.<init>(r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.AdSize.<init>(int, int):void");
    }

    public AdSize(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            throw new IllegalArgumentException(a.R(37, "Invalid width for AdSize: ", i2));
        }
        if (i3 < 0 && i3 != -2 && i3 != -4) {
            throw new IllegalArgumentException(a.R(38, "Invalid height for AdSize: ", i3));
        }
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = str;
    }

    @RecentlyNonNull
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i2) {
        AdSize zzh = zzcgm.zzh(context, i2, 50, 0);
        zzh.zze = true;
        return zzh;
    }

    @RecentlyNonNull
    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i2) {
        int zzj = zzcgm.zzj(context, 0);
        if (zzj == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i2, 0);
        adSize.zzg = zzj;
        adSize.zzf = true;
        return adSize;
    }

    @RecentlyNonNull
    public static AdSize getCurrentOrientationInterscrollerAdSize(@RecentlyNonNull Context context, int i2) {
        return zzj(i2, zzcgm.zzj(context, 0));
    }

    @RecentlyNonNull
    public static AdSize getInlineAdaptiveBannerAdSize(int i2, int i3) {
        AdSize adSize = new AdSize(i2, 0);
        adSize.zzg = i3;
        adSize.zzf = true;
        if (i3 < 32) {
            StringBuilder sb = new StringBuilder(129);
            sb.append("The maximum height set for the inline adaptive ad size was ");
            sb.append(i3);
            sb.append(" dp, which is below the minimum recommended value of 32 dp.");
            zzcgt.zzi(sb.toString());
        }
        return adSize;
    }

    @RecentlyNonNull
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i2) {
        AdSize zzh = zzcgm.zzh(context, i2, 50, 2);
        zzh.zze = true;
        return zzh;
    }

    @RecentlyNonNull
    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i2) {
        int zzj = zzcgm.zzj(context, 2);
        AdSize adSize = new AdSize(i2, 0);
        if (zzj == -1) {
            return INVALID;
        }
        adSize.zzg = zzj;
        adSize.zzf = true;
        return adSize;
    }

    @RecentlyNonNull
    public static AdSize getLandscapeInterscrollerAdSize(@RecentlyNonNull Context context, int i2) {
        return zzj(i2, zzcgm.zzj(context, 2));
    }

    @RecentlyNonNull
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i2) {
        AdSize zzh = zzcgm.zzh(context, i2, 50, 1);
        zzh.zze = true;
        return zzh;
    }

    @RecentlyNonNull
    public static AdSize getPortraitInlineAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i2) {
        int zzj = zzcgm.zzj(context, 1);
        AdSize adSize = new AdSize(i2, 0);
        if (zzj == -1) {
            return INVALID;
        }
        adSize.zzg = zzj;
        adSize.zzf = true;
        return adSize;
    }

    @RecentlyNonNull
    public static AdSize getPortraitInterscrollerAdSize(@RecentlyNonNull Context context, int i2) {
        return zzj(i2, zzcgm.zzj(context, 1));
    }

    private static AdSize zzj(int i2, int i3) {
        if (i3 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i2, 0);
        adSize.zzi = i3;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdSize) {
            AdSize adSize = (AdSize) obj;
            return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
        }
        return false;
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(@RecentlyNonNull Context context) {
        int i2 = this.zzc;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 != -2) {
            zzber.zza();
            return zzcgm.zzs(context, this.zzc);
        }
        return zzbdl.zza(context.getResources().getDisplayMetrics());
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(@RecentlyNonNull Context context) {
        int i2 = this.zzb;
        if (i2 != -3) {
            if (i2 != -1) {
                zzber.zza();
                return zzcgm.zzs(context, this.zzb);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Parcelable.Creator<zzbdl> creator = zzbdl.CREATOR;
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    @RecentlyNonNull
    public String toString() {
        return this.zzd;
    }

    public final boolean zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return this.zzf;
    }

    public final void zzc(boolean z) {
        this.zzf = true;
    }

    public final void zzd(int i2) {
        this.zzg = i2;
    }

    public final int zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final void zzg(boolean z) {
        this.zzh = true;
    }

    public final int zzh() {
        return this.zzi;
    }

    public final void zzi(int i2) {
        this.zzi = i2;
    }
}
