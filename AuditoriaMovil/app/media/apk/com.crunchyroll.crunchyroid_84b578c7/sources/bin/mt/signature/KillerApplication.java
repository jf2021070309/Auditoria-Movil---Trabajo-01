package bin.mt.signature;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.lsposed.hiddenapibypass.HiddenApiBypass;
/* loaded from: classes5.dex */
public class KillerApplication extends Application {
    public static final String URL = "https://github.com/L-JINBIN/ApkSignatureKillerEx";

    static {
        killPM("com.crunchyroll.crunchyroid", "MIIDjDCCAnSgAwIBAgIETRAuSDANBgkqhkiG9w0BAQUFADCBhjELMAkGA1UEBhMCQ0ExCzAJBgNV\nBAgTAkNBMRYwFAYDVQQHEw1TYW4gRnJhbmNpc2NvMRowGAYDVQQKExFDcnVuY2h5cm9sbCwgSW5j\nLjEaMBgGA1UECxMRQ3J1bmNoeXJvbGwsIEluYy4xGjAYBgNVBAMTEUNydW5jaHlyb2xsLCBJbmMu\nMCAXDTEwMTIyMTA0MzQxNloYDzIxNDcxMTEzMDQzNDE2WjCBhjELMAkGA1UEBhMCQ0ExCzAJBgNV\nBAgTAkNBMRYwFAYDVQQHEw1TYW4gRnJhbmNpc2NvMRowGAYDVQQKExFDcnVuY2h5cm9sbCwgSW5j\nLjEaMBgGA1UECxMRQ3J1bmNoeXJvbGwsIEluYy4xGjAYBgNVBAMTEUNydW5jaHlyb2xsLCBJbmMu\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApTsmFgIcFnnSP7qI7e9DRdChkq6pIcbW\nXsOPPwLaQ+vC56GIZwj9nfLLijarujRjLonWSm6ZJJTVZHGmFeTHP/MFaGU3c/Rt6R4UkDAn1Keu\niPFfKr0QvgOiJj7dmstwUaDLHYuSdWo+bWd6rhpThst0UzUaL3p5xgdMfJK7S3nF5QkURX0H0fHW\nS0WstTDTjgylZgL5xM1ZdgTcmx5O9gd8JeTixKlSC3j52DGZTUx4lC7YRMcuq+KlHPhNyh0bcwC2\nBIQJsT/bZEGs0ze222UZSM6H5ORRyqh2E7+SNopmqjrLtO1RShkB6tEHMnkhdH/fsMPEz6fVpcTC\nRB2g1QIDAQABMA0GCSqGSIb3DQEBBQUAA4IBAQASWU4PT2kLsft1NO5uu9X4Na5aU6VQ3Rni7POq\nprYb3BdDwscM6pumKoqukNKF9/IUrnB+GAEeLfr6GAsfzYt8zSq6otKwZ6rxwd58PExyn6358Jh7\n80erMJ6RScrEDEp+H3pGUIaUGZv5borJ+BBnDYxGY878JBkEXPbY5DN6yT5UyI1Bip55CO9yi+cA\nQ3mnSQKXv2wsDD+rj7Tov8PMutuHVI8+q/7T1gTFg06MxeW4mAOgB1I3fw6UatRItXujplTWGCGU\nkE3VYOOfyMpoc7T9VBnYtqU+UXWstxOr14NY2Ab+lfryxsTgw7xSAVCnhaRH7EOi/nI9b1GP2uc5\n");
        killOpen("com.crunchyroll.crunchyroid");
    }

    private static Field findField(Class<?> cls, String str) throws NoSuchFieldException {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e) {
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls.equals(Object.class)) {
                    break;
                }
                try {
                    Field declaredField2 = cls.getDeclaredField(str);
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e;
        }
    }

    private static String getApkPath(String str) {
        String str2;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
            do {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return null;
                }
                String[] split = readLine.split("\\s+");
                str2 = split[split.length - 1];
            } while (!isApkPath(str, str2));
            bufferedReader.close();
            return str2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static File getDataFile(String str) {
        String name = Environment.getExternalStorageDirectory().getName();
        if (name.matches("\\d+")) {
            File file = new File("/data/user/" + name + "/" + str);
            if (file.canWrite()) {
                return file;
            }
        }
        return new File("/data/data/" + str);
    }

    private static native void hookApkPath(String str, String str2);

    private static boolean isApkPath(String str, String str2) {
        if (str2.startsWith("/") && str2.endsWith(".apk")) {
            String[] split = str2.substring(1).split("/", 6);
            int length = split.length;
            if (length == 4 || length == 5) {
                if (split[0].equals("data") && split[1].equals("app") && split[length - 1].equals("base.apk")) {
                    return split[length - 2].startsWith(str);
                }
                if (split[0].equals("mnt") && split[1].equals("asec") && split[length - 1].equals("pkg.apk")) {
                    return split[length - 2].startsWith(str);
                }
            } else if (length == 3) {
                if (split[0].equals("data") && split[1].equals("app")) {
                    return split[2].startsWith(str);
                }
            } else if (length == 6 && split[0].equals("mnt") && split[1].equals("expand") && split[3].equals("app") && split[5].equals("base.apk")) {
                return split[4].endsWith(str);
            }
        }
        return false;
    }

    private static void killOpen(String str) {
        try {
            System.loadLibrary("SignatureKiller");
            String apkPath = getApkPath(str);
            if (apkPath == null) {
                System.err.println("Get apk path failed");
                return;
            }
            File file = new File(apkPath);
            File file2 = new File(getDataFile(str), "origin.apk");
            try {
                ZipFile zipFile = new ZipFile(file);
                ZipEntry entry = zipFile.getEntry("assets/SignatureKiller/origin.apk");
                if (entry == null) {
                    PrintStream printStream = System.err;
                    printStream.println("Entry not found: assets/SignatureKiller/origin.apk");
                    zipFile.close();
                    return;
                }
                if (!file2.exists() || file2.length() != entry.getSize()) {
                    InputStream inputStream = zipFile.getInputStream(entry);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArr = new byte[102400];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                zipFile.close();
                hookApkPath(file.getAbsolutePath(), file2.getAbsolutePath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable unused) {
            System.err.println("Load SignatureKiller library failed");
        }
    }

    private static void killPM(final String str, String str2) {
        final Signature signature = new Signature(Base64.decode(str2, 0));
        final Parcelable.Creator creator = PackageInfo.CREATOR;
        try {
            findField(PackageInfo.class, "CREATOR").set(null, new Parcelable.Creator<PackageInfo>() { // from class: bin.mt.signature.KillerApplication.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public PackageInfo createFromParcel(Parcel parcel) {
                    Signature[] apkContentsSigners;
                    PackageInfo packageInfo = (PackageInfo) creator.createFromParcel(parcel);
                    if (packageInfo.packageName.equals(str)) {
                        if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                            packageInfo.signatures[0] = signature;
                        }
                        if (Build.VERSION.SDK_INT >= 28 && packageInfo.signingInfo != null && (apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners()) != null && apkContentsSigners.length > 0) {
                            apkContentsSigners[0] = signature;
                        }
                    }
                    return packageInfo;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public PackageInfo[] newArray(int i) {
                    return (PackageInfo[]) creator.newArray(i);
                }
            });
            if (Build.VERSION.SDK_INT >= 28) {
                HiddenApiBypass.addHiddenApiExemptions("Landroid/os/Parcel;", "Landroid/content/pm", "Landroid/app");
            }
            try {
                Object obj = findField(PackageManager.class, "sPackageInfoCache").get(null);
                obj.getClass().getMethod("clear", new Class[0]).invoke(obj, new Object[0]);
            } catch (Throwable unused) {
            }
            try {
                ((Map) findField(Parcel.class, "mCreators").get(null)).clear();
            } catch (Throwable unused2) {
            }
            try {
                ((Map) findField(Parcel.class, "sPairedCreators").get(null)).clear();
            } catch (Throwable unused3) {
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
