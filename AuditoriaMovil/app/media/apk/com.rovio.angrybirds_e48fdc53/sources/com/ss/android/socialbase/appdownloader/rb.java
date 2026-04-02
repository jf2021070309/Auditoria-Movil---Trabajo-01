package com.ss.android.socialbase.appdownloader;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
/* loaded from: classes3.dex */
public final class rb {
    public static int dr(String str) {
        if (o(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = DownloadComponentManager.getAppContext().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static dr ge(String str) {
        try {
            PackageManager packageManager = DownloadComponentManager.getAppContext().getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return dr(packageManager, packageManager.getPackageInfo(str, 0));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static dr dr(PackageManager packageManager, PackageInfo packageInfo) {
        String str;
        Drawable drawable;
        if (packageInfo == null) {
            return null;
        }
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String str2 = packageInfo.packageName;
        if (applicationInfo != null && applicationInfo.loadLabel(packageManager) != null) {
            str = applicationInfo.loadLabel(packageManager).toString();
        } else {
            str = "";
        }
        try {
            drawable = applicationInfo.loadIcon(packageManager);
        } catch (Exception e) {
            drawable = null;
        }
        return new dr(str2, str, drawable, applicationInfo.sourceDir, packageInfo.versionName, packageInfo.versionCode, (applicationInfo.flags & 1) != 0);
    }

    /* loaded from: classes3.dex */
    public static class dr {
        private int bn;
        private String dr;
        private String g;
        private String ge;
        private Drawable o;
        private String q;
        private boolean rb;

        public Drawable dr() {
            return this.o;
        }

        public void dr(Drawable drawable) {
            this.o = drawable;
        }

        public boolean ge() {
            return this.rb;
        }

        public void dr(boolean z) {
            this.rb = z;
        }

        public String o() {
            return this.dr;
        }

        public void dr(String str) {
            this.dr = str;
        }

        public String g() {
            return this.ge;
        }

        public void ge(String str) {
            this.ge = str;
        }

        public String q() {
            return this.g;
        }

        public void o(String str) {
            this.g = str;
        }

        public int bn() {
            return this.bn;
        }

        public void dr(int i) {
            this.bn = i;
        }

        public String rb() {
            return this.q;
        }

        public void g(String str) {
            this.q = str;
        }

        public dr(String str, String str2, Drawable drawable, String str3, String str4, int i, boolean z) {
            ge(str2);
            dr(drawable);
            dr(str);
            o(str3);
            g(str4);
            dr(i);
            dr(z);
        }

        public String toString() {
            return "{\n  pkg name: " + o() + "\n  app icon: " + dr() + "\n  app name: " + g() + "\n  app path: " + q() + "\n  app v name: " + rb() + "\n  app v code: " + bn() + "\n  is system: " + ge() + "}";
        }
    }

    private static boolean o(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
