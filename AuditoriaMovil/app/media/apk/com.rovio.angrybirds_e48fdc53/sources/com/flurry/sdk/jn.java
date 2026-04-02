package com.flurry.sdk;

import android.provider.Settings;
import android.text.TextUtils;
import com.flurry.sdk.ln;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public class jn {
    private static final String b = jn.class.getSimpleName();
    private static jn c;
    public final Map<jv, byte[]> a;
    private final Set<String> d;
    private a e;
    private jx f;
    private String g;
    private final kj<ln> h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum a {
        NONE,
        ADVERTISING,
        DEVICE,
        REPORTED_IDS,
        FINISHED
    }

    private jn() {
        HashSet hashSet = new HashSet();
        hashSet.add("null");
        hashSet.add("9774d56d682e549c");
        hashSet.add("dead00beef");
        this.d = Collections.unmodifiableSet(hashSet);
        this.a = new HashMap();
        this.e = a.NONE;
        this.h = new kj<ln>() { // from class: com.flurry.sdk.jn.1
            @Override // com.flurry.sdk.kj
            public final /* synthetic */ void a(ln lnVar) {
                switch (AnonymousClass4.a[lnVar.c - 1]) {
                    case 1:
                        if (!jn.this.b()) {
                            return;
                        }
                        ka.a().b(new mc() { // from class: com.flurry.sdk.jn.1.1
                            @Override // com.flurry.sdk.mc
                            public final void a() {
                                jn.this.d();
                            }
                        });
                        return;
                    default:
                        return;
                }
            }
        };
        kk.a().a("com.flurry.android.sdk.FlurrySessionEvent", this.h);
        ka.a().b(new mc() { // from class: com.flurry.sdk.jn.2
            @Override // com.flurry.sdk.mc
            public final void a() {
                jn.b(jn.this);
            }
        });
    }

    public static synchronized jn a() {
        jn jnVar;
        synchronized (jn.class) {
            if (c == null) {
                c = new jn();
            }
            jnVar = c;
        }
        return jnVar;
    }

    public final boolean b() {
        return a.FINISHED.equals(this.e);
    }

    public final boolean c() {
        return this.f == null || !this.f.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.flurry.sdk.jn$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;

        static {
            try {
                b[a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[a.ADVERTISING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[a.DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[a.REPORTED_IDS.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            a = new int[ln.a.a().length];
            try {
                a[ln.a.a - 1] = 1;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ma.b();
        this.f = e();
        if (b()) {
            h();
            kk.a().a(new jp());
        }
    }

    private static jx e() {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(ka.a().a);
            return new jx(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (Exception e) {
            ko.b(b, "GOOGLE PLAY SERVICES ERROR: " + e.getMessage());
            ko.b(b, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return null;
        } catch (NoClassDefFoundError e2) {
            ko.b(b, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return null;
        }
    }

    private static void a(String str, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeUTF(str);
            } catch (Throwable th) {
                th = th;
                try {
                    ko.a(6, b, "Error when saving deviceId", th);
                } finally {
                    ma.a(dataOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
        }
    }

    private static String f() {
        DataInputStream dataInputStream;
        File fileStreamPath = ka.a().a.getFileStreamPath(".flurryb.");
        if (fileStreamPath != null && fileStreamPath.exists()) {
            try {
                dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
            } catch (Throwable th) {
                th = th;
                dataInputStream = null;
            }
            try {
                r0 = 1 == dataInputStream.readInt() ? dataInputStream.readUTF() : null;
            } catch (Throwable th2) {
                th = th2;
                try {
                    ko.a(6, b, "Error when loading deviceId", th);
                    return r0;
                } finally {
                    ma.a((Closeable) dataInputStream);
                }
            }
        }
        return r0;
    }

    private String g() {
        String[] list;
        DataInputStream dataInputStream;
        String str = null;
        File filesDir = ka.a().a.getFilesDir();
        if (filesDir != null && (list = filesDir.list(new FilenameFilter() { // from class: com.flurry.sdk.jn.3
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(".flurryagent.");
            }
        })) != null && list.length != 0) {
            File fileStreamPath = ka.a().a.getFileStreamPath(list[0]);
            if (fileStreamPath != null && fileStreamPath.exists()) {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                    try {
                        if (46586 == dataInputStream.readUnsignedShort() && 2 == dataInputStream.readUnsignedShort()) {
                            dataInputStream.readUTF();
                            str = dataInputStream.readUTF();
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            ko.a(6, b, "Error when loading deviceId", th);
                            return str;
                        } finally {
                            ma.a((Closeable) dataInputStream);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = null;
                }
            }
        }
        return str;
    }

    private void h() {
        String str;
        if (this.f == null) {
            str = null;
        } else {
            str = this.f.a;
        }
        if (str != null) {
            ko.a(3, b, "Fetched advertising id");
            this.a.put(jv.AndroidAdvertisingId, ma.d(str));
        }
        String str2 = this.g;
        if (str2 != null) {
            ko.a(3, b, "Fetched device id");
            this.a.put(jv.DeviceId, ma.d(str2));
        }
    }

    static /* synthetic */ void b(jn jnVar) {
        String str;
        while (!a.FINISHED.equals(jnVar.e)) {
            switch (jnVar.e) {
                case NONE:
                    jnVar.e = a.ADVERTISING;
                    break;
                case ADVERTISING:
                    jnVar.e = a.DEVICE;
                    break;
                case DEVICE:
                    jnVar.e = a.REPORTED_IDS;
                    break;
                case REPORTED_IDS:
                    jnVar.e = a.FINISHED;
                    break;
            }
            try {
            } catch (Exception e) {
                ko.a(4, b, "Exception during id fetch:" + jnVar.e + ", " + e);
            }
            switch (jnVar.e) {
                case ADVERTISING:
                    jnVar.d();
                    continue;
                case DEVICE:
                    ma.b();
                    String string = Settings.Secure.getString(ka.a().a.getContentResolver(), "android_id");
                    if (!((TextUtils.isEmpty(string) || jnVar.d.contains(string.toLowerCase(Locale.US))) ? false : true)) {
                        str = null;
                    } else {
                        str = "AND" + string;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = f();
                        if (TextUtils.isEmpty(str)) {
                            str = jnVar.g();
                            if (TextUtils.isEmpty(str)) {
                                str = "ID" + Long.toString(Double.doubleToLongBits(Math.random()) + ((System.nanoTime() + (ma.i(lx.a(ka.a().a)) * 37)) * 37), 16);
                            }
                            if (!TextUtils.isEmpty(str)) {
                                File fileStreamPath = ka.a().a.getFileStreamPath(".flurryb.");
                                if (lz.a(fileStreamPath)) {
                                    a(str, fileStreamPath);
                                }
                            }
                        }
                    }
                    jnVar.g = str;
                    continue;
                    break;
                case REPORTED_IDS:
                    jnVar.h();
                    continue;
                default:
                    continue;
            }
            ko.a(4, b, "Exception during id fetch:" + jnVar.e + ", " + e);
        }
        kk.a().a(new jo());
    }
}
