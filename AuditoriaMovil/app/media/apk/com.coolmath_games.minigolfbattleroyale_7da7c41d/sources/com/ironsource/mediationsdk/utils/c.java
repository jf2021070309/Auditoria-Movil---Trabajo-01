package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public class c {
    private boolean a = true;
    private IronSourceError b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.utils.c$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.model.m.values().length];
            a = iArr;
            try {
                iArr[com.ironsource.mediationsdk.model.m.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.ironsource.mediationsdk.model.m.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) e.clone();
        }
    }

    private static int a(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), true)) {
            if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
                if (currentTimeMillis - IronSourceUtils.getLongFromSharedPrefs(context, a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), 0L) < IronSourceUtils.getIntFromSharedPrefs(context, a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), 0) * 1000) {
                    return a.c;
                }
            }
            if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
                int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
                String a2 = a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
                int intFromSharedPrefs2 = IronSourceUtils.getIntFromSharedPrefs(context, a2, 0);
                String a3 = a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2);
                if (currentTimeMillis >= IronSourceUtils.getLongFromSharedPrefs(context, a3, 0L)) {
                    IronSourceUtils.saveIntToSharedPrefs(context, a2, 0);
                    IronSourceUtils.saveLongToSharedPrefs(context, a3, 0L);
                } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                    return a.b;
                }
            }
            return a.d;
        }
        return a.a;
    }

    private static long a(com.ironsource.mediationsdk.model.m mVar) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i = AnonymousClass1.a[mVar.ordinal()];
        if (i == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private static String a(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? IronSourceConstants.INTERSTITIAL_AD_UNIT : ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.BANNER ? IronSourceConstants.BANNER_AD_UNIT : ad_unit.toString();
    }

    private static String a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    public static synchronized void a(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (c.class) {
            if (context == null) {
                return;
            }
            com.ironsource.mediationsdk.model.l placementAvailabilitySettings = interstitialPlacement.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName(), placementAvailabilitySettings);
        }
    }

    public static synchronized void a(Context context, Placement placement) {
        synchronized (c.class) {
            if (context == null) {
                return;
            }
            com.ironsource.mediationsdk.model.l placementAvailabilitySettings = placement.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName(), placementAvailabilitySettings);
        }
    }

    public static synchronized void a(Context context, com.ironsource.mediationsdk.model.g gVar) {
        synchronized (c.class) {
            if (context == null) {
                return;
            }
            com.ironsource.mediationsdk.model.l placementAvailabilitySettings = gVar.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            a(context, IronSourceConstants.BANNER_AD_UNIT, gVar.getPlacementName(), placementAvailabilitySettings);
        }
    }

    private static void a(Context context, String str, String str2, com.ironsource.mediationsdk.model.l lVar) {
        boolean z = lVar.a;
        IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), z);
        if (z) {
            boolean z2 = lVar.b;
            IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, "CappingManager.IS_CAPPING_ENABLED", str2), z2);
            if (z2) {
                IronSourceUtils.saveIntToSharedPrefs(context, a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), lVar.e);
                IronSourceUtils.saveStringToSharedPrefs(context, a(str, "CappingManager.CAPPING_TYPE", str2), lVar.d.toString());
            }
            boolean z3 = lVar.c;
            IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, "CappingManager.IS_PACING_ENABLED", str2), z3);
            if (z3) {
                IronSourceUtils.saveIntToSharedPrefs(context, a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), lVar.f);
            }
        }
    }

    public static synchronized boolean a(Context context, String str) {
        boolean z;
        synchronized (c.class) {
            z = a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str) != a.d;
        }
        return z;
    }

    public static synchronized boolean a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        boolean z;
        synchronized (c.class) {
            z = a(context, a(ad_unit), str) != a.d;
        }
        return z;
    }

    public static synchronized int b(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (c.class) {
            if (context != null && interstitialPlacement != null) {
                if (interstitialPlacement.getPlacementAvailabilitySettings() != null) {
                    return a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
                }
            }
            return a.d;
        }
    }

    public static synchronized int b(Context context, Placement placement) {
        synchronized (c.class) {
            if (context != null && placement != null) {
                if (placement.getPlacementAvailabilitySettings() != null) {
                    return a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
                }
            }
            return a.d;
        }
    }

    public static synchronized void b(Context context, String str, IronSource.AD_UNIT ad_unit) {
        synchronized (c.class) {
            b(context, a(ad_unit), str);
        }
    }

    private static void b(Context context, String str, String str2) {
        int i = 0;
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            IronSourceUtils.saveLongToSharedPrefs(context, a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            IronSourceUtils.getIntFromSharedPrefs(context, a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String a2 = a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a2, 0);
            if (intFromSharedPrefs == 0) {
                String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(context, a(str, "CappingManager.CAPPING_TYPE", str2), com.ironsource.mediationsdk.model.m.PER_DAY.toString());
                com.ironsource.mediationsdk.model.m mVar = null;
                com.ironsource.mediationsdk.model.m[] values = com.ironsource.mediationsdk.model.m.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    com.ironsource.mediationsdk.model.m mVar2 = values[i];
                    if (mVar2.c.equals(stringFromSharedPrefs)) {
                        mVar = mVar2;
                        break;
                    }
                    i++;
                }
                IronSourceUtils.saveLongToSharedPrefs(context, a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2), a(mVar));
            }
            IronSourceUtils.saveIntToSharedPrefs(context, a2, intFromSharedPrefs + 1);
        }
    }

    public static synchronized boolean b(Context context, String str) {
        boolean z;
        synchronized (c.class) {
            z = a(context, IronSourceConstants.BANNER_AD_UNIT, str) != a.d;
        }
        return z;
    }

    public static synchronized void c(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (c.class) {
            if (interstitialPlacement != null) {
                b(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
            }
        }
    }

    public static synchronized void c(Context context, Placement placement) {
        synchronized (c.class) {
            if (placement != null) {
                b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
            }
        }
    }

    public static synchronized boolean c(Context context, String str) {
        boolean z;
        synchronized (c.class) {
            z = a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str) != a.d;
        }
        return z;
    }

    public static synchronized void d(Context context, String str) {
        synchronized (c.class) {
            b(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str);
        }
    }

    public static synchronized void e(Context context, String str) {
        synchronized (c.class) {
            b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
        }
    }

    public static synchronized void f(Context context, String str) {
        synchronized (c.class) {
            if (!TextUtils.isEmpty(str)) {
                b(context, IronSourceConstants.BANNER_AD_UNIT, str);
            }
        }
    }

    public void a(IronSourceError ironSourceError) {
        this.a = false;
        this.b = ironSourceError;
    }

    public boolean a() {
        return this.a;
    }

    public IronSourceError b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb;
        if (a()) {
            sb = new StringBuilder("valid:");
            sb.append(this.a);
        } else {
            sb = new StringBuilder("valid:");
            sb.append(this.a);
            sb.append(", IronSourceError:");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
