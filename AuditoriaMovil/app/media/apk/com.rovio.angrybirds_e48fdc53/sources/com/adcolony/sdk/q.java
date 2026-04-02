package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.widget.Toast;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.CRC32;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class q {
    static ExecutorService a = Executors.newSingleThreadExecutor();

    q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        if (com.adcolony.sdk.a.d()) {
            try {
                com.adcolony.sdk.a.c().getApplication().getPackageManager().getApplicationInfo(str, 0);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        try {
            af a2 = com.adcolony.sdk.a.a();
            return a2.g().a(new File(new StringBuilder().append(a2.l().g()).append("026ae9c9824b3e483fa6c71fa88f57ae27816141").toString())) && a2.g().a(new File(new StringBuilder().append(a2.l().g()).append("7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5").toString()));
        } catch (Exception e) {
            au.h.b("Unable to delete controller or launch response.");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        if (!com.adcolony.sdk.a.d()) {
            return "1.0";
        }
        try {
            return com.adcolony.sdk.a.c().getPackageManager().getPackageInfo(com.adcolony.sdk.a.c().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            au.h.b("Failed to retrieve package info.");
            return "1.0";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c() {
        if (com.adcolony.sdk.a.d()) {
            try {
                return com.adcolony.sdk.a.c().getPackageManager().getPackageInfo(com.adcolony.sdk.a.c().getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                au.h.b("Failed to retrieve package info.");
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d() {
        if (!com.adcolony.sdk.a.d()) {
            return "";
        }
        Activity c = com.adcolony.sdk.a.c();
        PackageManager packageManager = c.getApplication().getPackageManager();
        try {
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(c.getPackageName(), 0));
            if (applicationLabel == null) {
                return "";
            }
            return applicationLabel.toString();
        } catch (PackageManager.NameNotFoundException e) {
            au.h.b("Failed to retrieve application label.");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(String str) {
        CRC32 crc32 = new CRC32();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            crc32.update(str.charAt(i));
        }
        return (int) crc32.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        try {
            return x.a(str);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONArray a(int i) {
        JSONArray b = as.b();
        for (int i2 = 0; i2 < i; i2++) {
            as.a(b, e());
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        Arrays.sort(strArr);
        Arrays.sort(strArr2);
        return Arrays.equals(strArr, strArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Runnable runnable) {
        if (!com.adcolony.sdk.a.d()) {
            return false;
        }
        com.adcolony.sdk.a.c().runOnUiThread(runnable);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        if (str != null && str.length() <= 128) {
            return true;
        }
        au.e.b("String must be non-null and the max length is 128 characters.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(AudioManager audioManager) {
        if (audioManager != null) {
            return audioManager.getStreamVolume(3) > 0;
        }
        au.h.b("isAudioEnabled() called with a null AudioManager");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double b(AudioManager audioManager) {
        if (audioManager == null) {
            au.h.b("getAudioVolume() called with a null AudioManager");
            return PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        }
        double streamVolume = audioManager.getStreamVolume(3);
        double streamMaxVolume = audioManager.getStreamMaxVolume(3);
        return streamMaxVolume != PangleAdapterUtils.CPM_DEFLAUT_VALUE ? streamVolume / streamMaxVolume : PangleAdapterUtils.CPM_DEFLAUT_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AudioManager a(Context context) {
        if (context == null) {
            au.h.b("getAudioManager called with a null Context");
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(String str) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    au.b.a(">").b(file.getAbsolutePath());
                    e(file.getAbsolutePath());
                } else {
                    au.b.b(file.getAbsolutePath());
                }
            }
        }
    }

    static String a(double d, int i) {
        StringBuilder sb = new StringBuilder();
        a(d, i, sb);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(double d, int i, StringBuilder sb) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            sb.append(d);
            return;
        }
        if (d < PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            d = -d;
            sb.append('-');
        }
        if (i == 0) {
            sb.append(Math.round(d));
            return;
        }
        long pow = (long) Math.pow(10.0d, i);
        long round = Math.round(pow * d);
        sb.append(round / pow);
        sb.append('.');
        long j = round % pow;
        if (j == 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append('0');
            }
            return;
        }
        for (long j2 = j * 10; j2 < pow; j2 *= 10) {
            sb.append('0');
        }
        sb.append(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Activity activity) {
        try {
            return activity.getPackageName();
        } catch (Exception e) {
            return "unknown";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(String str) {
        try {
            return (int) Long.parseLong(str, 16);
        } catch (NumberFormatException e) {
            au.f.b("Unable to parse '" + str + "' as a color.");
            return -16777216;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Activity activity) {
        int identifier;
        if (activity != null && (identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return activity.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f() {
        return com.adcolony.sdk.a.d() && Build.VERSION.SDK_INT >= 24 && com.adcolony.sdk.a.c().isInMultiWindowMode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str, File file) {
        boolean z = false;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        try {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            messageDigest.update(bArr, 0, read);
                        } finally {
                            try {
                                fileInputStream.close();
                            } catch (IOException e) {
                                au.h.b("Exception on closing MD5 input stream");
                            }
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException("Unable to process file for MD5", e2);
                    }
                }
                z = str.equals(String.format("%40s", new BigInteger(1, messageDigest.digest()).toString(16)).replace(' ', '0'));
            } catch (FileNotFoundException e3) {
                au.h.b("Exception while getting FileInputStream");
            }
        } catch (NoSuchAlgorithmException e4) {
            au.h.b("Exception while getting Digest");
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Date g(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ");
        try {
            return simpleDateFormat.parse(str);
        } catch (Exception e) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").parse(str);
            } catch (Exception e2) {
                try {
                    return new SimpleDateFormat("yyyy-MM-dd").parse(str);
                } catch (Exception e3) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(JSONArray jSONArray) {
        String str = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            switch (jSONArray.getInt(i)) {
                case 1:
                    str = str + "MO";
                    break;
                case 2:
                    str = str + "TU";
                    break;
                case 3:
                    str = str + "WE";
                    break;
                case 4:
                    str = str + "TH";
                    break;
                case 5:
                    str = str + "FR";
                    break;
                case 6:
                    str = str + "SA";
                    break;
                case 7:
                    str = str + "SU";
                    break;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(JSONArray jSONArray) {
        String str = "";
        int i = 0;
        while (i < jSONArray.length()) {
            if (i > 0) {
                str = str + ",";
            }
            String str2 = str + jSONArray.getInt(i);
            i++;
            str = str2;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Intent intent, boolean z) {
        try {
            if (z) {
                com.adcolony.sdk.a.c().startActivity(Intent.createChooser(intent, "Handle this via..."));
            } else {
                com.adcolony.sdk.a.c().startActivity(intent);
            }
            return true;
        } catch (Exception e) {
            au.f.b(e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Intent intent) {
        return a(intent, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(final String str, final int i) {
        if (com.adcolony.sdk.a.d()) {
            a(new Runnable() { // from class: com.adcolony.sdk.q.1
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(com.adcolony.sdk.a.c(), str, i).show();
                }
            });
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(m mVar) {
        boolean z = true;
        int i = 0;
        try {
            if (com.adcolony.sdk.a.d()) {
                int i2 = (int) (com.adcolony.sdk.a.c().getPackageManager().getPackageInfo(com.adcolony.sdk.a.c().getPackageName(), 0).lastUpdateTime / 1000);
                if (new File(mVar.g() + "AppVersion").exists()) {
                    if (as.c(as.c(mVar.g() + "AppVersion"), "last_update") != i2) {
                        i = 1;
                    } else {
                        z = false;
                    }
                } else {
                    i = 2;
                }
                if (z) {
                    JSONObject a2 = as.a();
                    as.b(a2, "last_update", i2);
                    as.h(a2, mVar.g() + "AppVersion");
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONArray b(Context context) {
        JSONArray b = as.b();
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    b = as.b();
                    for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                        b.put(packageInfo.requestedPermissions[i]);
                    }
                }
            } catch (Exception e) {
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {
        double a;
        double b = System.currentTimeMillis();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(double d) {
            a(d);
        }

        void a(double d) {
            this.a = d;
            this.b = (System.currentTimeMillis() / 1000.0d) + this.a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a() {
            return b() == PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        }

        double b() {
            double currentTimeMillis = this.b - (System.currentTimeMillis() / 1000.0d);
            return currentTimeMillis <= PangleAdapterUtils.CPM_DEFLAUT_VALUE ? PangleAdapterUtils.CPM_DEFLAUT_VALUE : currentTimeMillis;
        }

        public String toString() {
            return q.a(b(), 2);
        }
    }
}
