package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.nearby.messages.Strategy;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
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
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(Strategy.TTL_SECONDS_DEFAULT, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED, "160x600_as");
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");
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
            r4.append(r0)
            java.lang.String r0 = "x"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "_as"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r5.<init>(r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.AdSize.<init>(int, int):void");
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize zzh = zzcgm.zzh(context, i, 50, 0);
        zzh.zze = true;
        return zzh;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
        int zzj = zzcgm.zzj(context, 0);
        if (zzj == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.zzg = zzj;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getCurrentOrientationInterscrollerAdSize(Context context, int i) {
        return zzj(i, zzcgm.zzj(context, 0));
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        AdSize adSize = new AdSize(i, 0);
        adSize.zzg = i2;
        adSize.zzf = true;
        if (i2 < 32) {
            StringBuilder sb = new StringBuilder(129);
            sb.append("The maximum height set for the inline adaptive ad size was ");
            sb.append(i2);
            sb.append(" dp, which is below the minimum recommended value of 32 dp.");
            zzcgt.zzi(sb.toString());
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize zzh = zzcgm.zzh(context, i, 50, 2);
        zzh.zze = true;
        return zzh;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i) {
        int zzj = zzcgm.zzj(context, 2);
        AdSize adSize = new AdSize(i, 0);
        if (zzj == -1) {
            return INVALID;
        }
        adSize.zzg = zzj;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getLandscapeInterscrollerAdSize(Context context, int i) {
        return zzj(i, zzcgm.zzj(context, 2));
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize zzh = zzcgm.zzh(context, i, 50, 1);
        zzh.zze = true;
        return zzh;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i) {
        int zzj = zzcgm.zzj(context, 1);
        AdSize adSize = new AdSize(i, 0);
        if (zzj == -1) {
            return INVALID;
        }
        adSize.zzg = zzj;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getPortraitInterscrollerAdSize(Context context, int i) {
        return zzj(i, zzcgm.zzj(context, 1));
    }

    private static AdSize zzj(int i, int i2) {
        if (i2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.zzi = i2;
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

    public int getWidth() {
        return this.zzb;
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

    public String toString() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzb() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(boolean z) {
        this.zzf = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i) {
        this.zzg = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzf() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(boolean z) {
        this.zzh = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzh() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(int i) {
        this.zzi = i;
    }

    public int getHeightInPixels(Context context) {
        int i = this.zzc;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i != -2) {
            zzber.zza();
            return zzcgm.zzs(context, this.zzc);
        }
        return zzbdl.zza(context.getResources().getDisplayMetrics());
    }

    public int getWidthInPixels(Context context) {
        int i = this.zzb;
        if (i != -3) {
            if (i != -1) {
                zzber.zza();
                return zzcgm.zzs(context, this.zzb);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Parcelable.Creator<zzbdl> creator = zzbdl.CREATOR;
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0 && i2 != -2 && i2 != -4) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            this.zzb = i;
            this.zzc = i2;
            this.zzd = str;
        }
    }
}
