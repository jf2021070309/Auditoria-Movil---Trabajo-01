package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbzh {
    public static final Handler zza = new zzflm(Looper.getMainLooper());
    private static final String zzb = AdView.class.getName();
    private static final String zzc = InterstitialAd.class.getName();
    private static final String zzd = AdManagerAdView.class.getName();
    private static final String zze = AdManagerInterstitialAd.class.getName();
    private static final String zzf = SearchAdView.class.getName();
    private static final String zzg = AdLoader.class.getName();
    private float zzh = -1.0f;

    private final a zzA(Collection collection) throws b {
        a aVar = new a();
        for (Object obj : collection) {
            zzB(aVar, obj);
        }
        return aVar;
    }

    private final void zzB(a aVar, Object obj) throws b {
        if (obj instanceof Bundle) {
            aVar.put(zzh((Bundle) obj));
        } else if (obj instanceof Map) {
            aVar.put(zzi((Map) obj));
        } else if (obj instanceof Collection) {
            aVar.put(zzA((Collection) obj));
        } else if (obj instanceof Object[]) {
            aVar.put(zzg((Object[]) obj));
        } else {
            aVar.put(obj);
        }
    }

    private final void zzC(c cVar, String str, Object obj) throws b {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) zzba.zzc().zzb(zzbbf.zzt)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            cVar.put(str, zzh((Bundle) obj));
        } else if (obj instanceof Map) {
            cVar.put(str, zzi((Map) obj));
        } else if (obj instanceof Collection) {
            cVar.put(String.valueOf(str), zzA((Collection) obj));
        } else if (obj instanceof Object[]) {
            cVar.put(str, zzA(Arrays.asList((Object[]) obj)));
        } else {
            int i = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    numArr = new Integer[0];
                } else {
                    int length = iArr.length;
                    Integer[] numArr2 = new Integer[length];
                    while (i < length) {
                        numArr2[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                    numArr = numArr2;
                }
                cVar.put(str, zzg(numArr));
            } else if (obj instanceof double[]) {
                double[] dArr2 = (double[]) obj;
                if (dArr2 == null) {
                    dArr = new Double[0];
                } else {
                    int length2 = dArr2.length;
                    Double[] dArr3 = new Double[length2];
                    while (i < length2) {
                        dArr3[i] = Double.valueOf(dArr2[i]);
                        i++;
                    }
                    dArr = dArr3;
                }
                cVar.put(str, zzg(dArr));
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    lArr = new Long[0];
                } else {
                    int length3 = jArr.length;
                    Long[] lArr2 = new Long[length3];
                    while (i < length3) {
                        lArr2[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                    lArr = lArr2;
                }
                cVar.put(str, zzg(lArr));
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    boolArr = new Boolean[0];
                } else {
                    int length4 = zArr.length;
                    Boolean[] boolArr2 = new Boolean[length4];
                    while (i < length4) {
                        boolArr2[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                    boolArr = boolArr2;
                }
                cVar.put(str, zzg(boolArr));
            } else {
                cVar.put(str, obj);
            }
        }
    }

    private static final void zzD(ViewGroup viewGroup, zzq zzqVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int zzx = zzx(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzqVar.zzf - zzx, zzqVar.zzc - zzx, 17));
        viewGroup.addView(frameLayout, zzqVar.zzf, zzqVar.zzc);
    }

    public static int zza(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        if (i == i2) {
            return Math.round(displayMetrics.heightPixels / displayMetrics.density);
        }
        return Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static AdSize zzc(Context context, int i, int i2, int i3) {
        int round;
        int zza2 = zza(context, i3);
        if (zza2 == -1) {
            return AdSize.INVALID;
        }
        int min = Math.min(90, Math.round(zza2 * 0.15f));
        if (i > 655) {
            round = Math.round((i / 728.0f) * 90.0f);
        } else if (i > 632) {
            round = 81;
        } else if (i > 526) {
            round = Math.round((i / 468.0f) * 60.0f);
        } else if (i > 432) {
            round = 68;
        } else {
            round = Math.round((i / 320.0f) * 50.0f);
        }
        return new AdSize(i, Math.max(Math.min(round, min), 50));
    }

    public static String zzd() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static String zze(String str) {
        return zzz(str, "MD5");
    }

    public static String zzf(String str) {
        return zzz(str, "SHA-256");
    }

    @VisibleForTesting
    public static boolean zzo(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbdh.zzd.zze());
    }

    public static final int zzp(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    @VisibleForTesting
    public static final String zzq(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i < stackTraceElementArr.length) {
                StackTraceElement stackTraceElement = stackTraceElementArr[i2];
                String className = stackTraceElement.getClassName();
                if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!zzb.equalsIgnoreCase(className) && !zzc.equalsIgnoreCase(className) && !zzd.equalsIgnoreCase(className) && !zze.equalsIgnoreCase(className) && !zzf.equalsIgnoreCase(className) && !zzg.equalsIgnoreCase(className))) {
                    i2 = i;
                }
            } else {
                str2 = null;
                break;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i3 = 2; i3 > 0 && stringTokenizer.hasMoreElements(); i3--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean zzr() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            if (!str.contains("generic") && !str.contains("emulator")) {
                return false;
            }
            return true;
        }
        return Build.DEVICE.startsWith("generic");
    }

    public static final boolean zzs(Context context, int i) {
        if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean zzt(Context context) {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
            return false;
        }
        return true;
    }

    public static final boolean zzu() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static final int zzv(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    public static final void zzw(Context context, String str, String str2, Bundle bundle, boolean z, zzbzg zzbzgVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = GoogleApiAvailabilityLight.getInstance().getApkVersion(context) + ".231004000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzbzgVar.zza(appendQueryParameter.toString());
    }

    public static final int zzx(Context context, int i) {
        return zzp(context.getResources().getDisplayMetrics(), i);
    }

    public static final String zzy(Context context) {
        String string;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            string = null;
        } else {
            string = Settings.Secure.getString(contentResolver, "android_id");
        }
        return zzz((string == null || zzr()) ? "emulator" : "emulator", "MD5");
    }

    private static String zzz(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public final int zzb(Context context, int i) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                if (this.zzh < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.zzh = displayMetrics.density;
                }
            }
        }
        return Math.round(i / this.zzh);
    }

    @VisibleForTesting
    public final a zzg(Object[] objArr) throws b {
        a aVar = new a();
        for (Object obj : objArr) {
            zzB(aVar, obj);
        }
        return aVar;
    }

    public final c zzh(Bundle bundle) throws b {
        c cVar = new c();
        for (String str : bundle.keySet()) {
            zzC(cVar, str, bundle.get(str));
        }
        return cVar;
    }

    public final c zzi(Map map) throws b {
        try {
            c cVar = new c();
            for (String str : map.keySet()) {
                zzC(cVar, str, map.get(str));
            }
            return cVar;
        } catch (ClassCastException e) {
            throw new b("Could not convert map to JSON: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public final c zzj(Bundle bundle, c cVar) {
        if (bundle == null) {
            return null;
        }
        try {
            return zzh(bundle);
        } catch (b e) {
            zzbzo.zzh("Error converting Bundle to JSON", e);
            return null;
        }
    }

    public final void zzk(c cVar, c cVar2) throws b {
        Iterator<String> keys = cVar2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = cVar2.get(next);
            try {
                Object obj2 = cVar.get(next);
                if (c.class.isInstance(obj2) && c.class.isInstance(obj)) {
                    zzk((c) obj2, (c) obj);
                }
            } catch (b unused) {
                cVar.put(next, obj);
            }
        }
    }

    public final void zzl(ViewGroup viewGroup, zzq zzqVar, String str, String str2) {
        if (str2 != null) {
            zzbzo.zzj(str2);
        }
        zzD(viewGroup, zzqVar, str, -65536, -16777216);
    }

    public final void zzm(ViewGroup viewGroup, zzq zzqVar, String str) {
        zzD(viewGroup, zzqVar, "Ads by Google", -16777216, -1);
    }

    public final void zzn(Context context, String str, String str2, Bundle bundle, boolean z) {
        zzw(context, str, "gmob-apps", bundle, true, new zzbzg() { // from class: com.google.android.gms.internal.ads.zzbze
            @Override // com.google.android.gms.internal.ads.zzbzg
            public final boolean zza(String str3) {
                new zzbzf(zzbzh.this, str3).start();
                return true;
            }
        });
    }
}
