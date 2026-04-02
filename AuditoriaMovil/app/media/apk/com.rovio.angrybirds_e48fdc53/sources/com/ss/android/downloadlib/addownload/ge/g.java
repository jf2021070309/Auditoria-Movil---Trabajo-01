package com.ss.android.downloadlib.addownload.ge;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.wb;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes3.dex */
public class g {
    private static volatile g dr;
    private final LinkedList<dr> ge = new LinkedList<>();
    private static final String[] o = {"com", "android", "ss"};
    private static final int[] g = {3101, 3102, 3103, 3201, 3202, 3203};

    private g() {
    }

    public static g dr() {
        if (dr == null) {
            synchronized (g.class) {
                if (dr == null) {
                    dr = new g();
                }
            }
        }
        return dr;
    }

    public void dr(String str) {
        dr o2;
        ge();
        if (!TextUtils.isEmpty(str) && (o2 = o(str)) != null) {
            synchronized (this.ge) {
                this.ge.add(o2);
            }
        }
    }

    public void ge(String str) {
        ge();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.ge) {
            Iterator<dr> it = this.ge.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().dr)) {
                    it.remove();
                    return;
                }
            }
        }
    }

    public dr dr(com.ss.android.downloadad.api.dr.ge geVar) {
        if (geVar == null) {
            return null;
        }
        ge();
        synchronized (this.ge) {
            Iterator<dr> it = this.ge.iterator();
            while (it.hasNext()) {
                dr next = it.next();
                if (next.q > geVar.e()) {
                    return next;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r7[1] = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<com.ss.android.downloadlib.addownload.ge.g.dr, java.lang.Integer> ge(com.ss.android.downloadad.api.dr.ge r18) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.ge.g.ge(com.ss.android.downloadad.api.dr.ge):android.util.Pair");
    }

    private void ge() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.ge) {
            Iterator<dr> it = this.ge.iterator();
            while (it.hasNext() && currentTimeMillis - it.next().q > 1800000) {
                it.remove();
            }
        }
    }

    private dr o(String str) {
        try {
            PackageManager packageManager = wb.getContext().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return new dr(str, packageInfo.versionCode, packageInfo.versionName, (String) packageManager.getApplicationLabel(packageInfo.applicationInfo), System.currentTimeMillis());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static boolean dr(String str, String str2) {
        String[] split;
        String[] split2;
        boolean z;
        try {
            split = str.split("\\.");
            split2 = str2.split("\\.");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (split.length != 0 && split2.length != 0) {
            int i = 0;
            int i2 = 0;
            for (String str3 : split) {
                String[] strArr = o;
                int length = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = false;
                        break;
                    }
                    String str4 = strArr[i3];
                    if (!str4.equals(str3)) {
                        i3++;
                    } else {
                        if (i < split2.length && str4.equals(split2[i])) {
                            i++;
                        }
                        z = true;
                    }
                }
                if (!z) {
                    int i4 = i2;
                    int i5 = i;
                    while (i < split2.length) {
                        if (str3.equals(split2[i])) {
                            if (i == i5) {
                                i5++;
                            }
                            i4++;
                            if (i4 >= 2) {
                                return true;
                            }
                        }
                        i++;
                    }
                    i = i5;
                    i2 = i4;
                }
            }
            return false;
        }
        return false;
    }

    /* loaded from: classes3.dex */
    public static class dr {
        public final String dr;
        public final String g;
        public final int ge;
        public final String o;
        public final long q;

        private dr(String str, int i, String str2, String str3, long j) {
            this.dr = str;
            this.ge = i;
            this.o = str2 != null ? str2.toLowerCase() : null;
            this.g = str3 != null ? str3.toLowerCase() : null;
            this.q = j;
        }
    }
}
