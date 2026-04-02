package com.kwad.framework.filedownloader.f;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.appevents.AppEventsConstants;
import com.flurry.android.Constants;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.kwad.sdk.utils.ap;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class f {
    private static String aff;
    private static Boolean afg;
    private static int afd = 65536;
    private static long afe = 2000;
    private static Boolean afh = null;
    private static final Pattern afi = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    public static void O(long j) {
        if (!ap(c.vP())) {
            throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-time'.");
        }
        afe = j;
    }

    public static String a(int i, com.kwad.framework.filedownloader.a.b bVar) {
        if (bVar != null) {
            String aZ = bVar.aZ(DownloadUtils.ETAG);
            if (d.aeU) {
                d.c(f.class, "etag find %s for task(%d)", aZ, Integer.valueOf(i));
            }
            return aZ;
        }
        throw new RuntimeException("connection is null when findEtag");
    }

    public static String a(com.kwad.framework.filedownloader.a.b bVar, String str) {
        String br = br(bVar.aZ(DownloadUtils.CONTENT_DISPOSITION));
        if (TextUtils.isEmpty(br)) {
            br = bo(str);
        }
        return br.replaceAll("\\/", "_");
    }

    public static String a(String str, boolean z, String str2) {
        if (str == null) {
            return null;
        }
        if (z) {
            if (str2 == null) {
                return null;
            }
            return q(str, str2);
        }
        return str;
    }

    private static boolean a(int i, com.kwad.framework.filedownloader.d.c cVar, Boolean bool) {
        if (cVar == null) {
            if (d.aeU) {
                d.c(f.class, "can't continue %d model == null", Integer.valueOf(i));
            }
            return false;
        } else if (cVar.uH() == null) {
            if (d.aeU) {
                d.c(f.class, "can't continue %d temp path == null", Integer.valueOf(i));
            }
            return false;
        } else {
            return a(i, cVar, cVar.uH(), null);
        }
    }

    public static boolean a(int i, com.kwad.framework.filedownloader.d.c cVar, String str, Boolean bool) {
        if (str == null) {
            if (d.aeU) {
                d.c(f.class, "can't continue %d path = null", Integer.valueOf(i));
                return false;
            }
            return false;
        }
        File file = new File(str);
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (!exists || isDirectory) {
            if (d.aeU) {
                d.c(f.class, "can't continue %d file not suit, exists[%B], directory[%B]", Integer.valueOf(i), Boolean.valueOf(exists), Boolean.valueOf(isDirectory));
                return false;
            }
            return false;
        }
        long length = file.length();
        long vp = cVar.vp();
        if (cVar.vs() <= 1 && vp == 0) {
            if (d.aeU) {
                d.c(f.class, "can't continue %d the downloaded-record is zero.", Integer.valueOf(i));
                return false;
            }
            return false;
        }
        long total = cVar.getTotal();
        if (length < vp || (total != -1 && (length > total || vp >= total))) {
            if (d.aeU) {
                d.c(f.class, "can't continue %d dirty data fileLength[%d] sofar[%d] total[%d]", Integer.valueOf(i), Long.valueOf(length), Long.valueOf(vp), Long.valueOf(total));
                return false;
            }
            return false;
        } else if (bool == null || bool.booleanValue() || total != length) {
            return true;
        } else {
            if (d.aeU) {
                d.c(f.class, "can't continue %d, because of the output stream doesn't support seek, but the task has already pre-allocated, so we only can download it from the very beginning.", Integer.valueOf(i));
                return false;
            }
            return false;
        }
    }

    public static boolean ap(Context context) {
        boolean endsWith;
        Boolean bool = afg;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (e.vR().aeY) {
            endsWith = true;
        } else if (((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)) == null) {
            d.d(f.class, "fail to get the activity manager!", new Object[0]);
            return false;
        } else {
            endsWith = ap.getProcessName(context).endsWith(":filedownloader");
        }
        Boolean valueOf = Boolean.valueOf(endsWith);
        afg = valueOf;
        return valueOf.booleanValue();
    }

    public static void aq(Context context) {
        File ar = ar(context);
        try {
            ar.getParentFile().mkdirs();
            ar.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static File ar(Context context) {
        return new File(context.getFilesDir().getAbsolutePath() + File.separator + "filedownloader", ".old_file_converted");
    }

    public static long b(int i, com.kwad.framework.filedownloader.a.b bVar) {
        long bv = bv(bVar.aZ(DownloadUtils.CONTENT_LENGTH));
        String aZ = bVar.aZ(DownloadUtils.TRANSFER_ENCODING);
        if (bv < 0) {
            if (!(aZ != null && aZ.equals(DownloadUtils.VALUE_CHUNKED))) {
                if (!e.vR().aeX) {
                    throw new FileDownloadGiveUpRetryException("can't know the size of the download file, and its Transfer-Encoding is not Chunked either.\nyou can ignore such exception by add http.lenient=true to the filedownloader.properties");
                }
                if (d.aeU) {
                    d.c(f.class, "%d response header is not legal but HTTP lenient is true, so handle as the case of transfer encoding chunk", Integer.valueOf(i));
                }
            }
            return -1L;
        }
        return bv;
    }

    public static String b(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    public static boolean b(int i, com.kwad.framework.filedownloader.d.c cVar) {
        return a(i, cVar, (Boolean) null);
    }

    public static void bH(int i) {
        if (!ap(c.vP())) {
            throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-step'.");
        }
        afd = i;
    }

    public static String bn(String str) {
        return q(vV(), bo(str));
    }

    private static String bo(String str) {
        return bq(str);
    }

    public static String bp(String str) {
        return b("%s.temp", str);
    }

    public static String bq(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                int i = b & Constants.UNKNOWN;
                if (i < 16) {
                    sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Huh, MD5 should be supported?", e2);
        }
    }

    public static String br(String str) {
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = afi.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (IllegalStateException e) {
        }
        return null;
    }

    public static String bs(String str) {
        int length = str.length();
        int i = 2;
        int i2 = (File.separatorChar == '\\' && length > 2 && str.charAt(1) == ':') ? 2 : 0;
        int lastIndexOf = str.lastIndexOf(File.separatorChar);
        if (lastIndexOf != -1 || i2 <= 0) {
            i = lastIndexOf;
        }
        if (i == -1 || str.charAt(length - 1) == File.separatorChar) {
            return null;
        }
        return (str.indexOf(File.separatorChar) == i && str.charAt(i2) == File.separatorChar) ? str.substring(0, i + 1) : str.substring(0, i);
    }

    public static String bt(String str) {
        return "FileDownloader-" + str;
    }

    public static boolean bu(String str) {
        return c.vP().checkCallingOrSelfPermission(str) == 0;
    }

    private static long bv(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            return -1L;
        }
    }

    public static com.kwad.framework.filedownloader.e.a bw(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("found invalid internal destination path, empty");
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            file.delete();
            if (!file.createNewFile()) {
                throw new RuntimeException(b("found invalid internal destination path[%s], & path is directory[%B]", str, Boolean.valueOf(file.isDirectory())));
            }
        }
        if (file.exists() || file.createNewFile()) {
            return com.kwad.framework.filedownloader.download.b.us().b(file);
        }
        throw new IOException(b("create new file error  %s", file.getAbsolutePath()));
    }

    private static void bx(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void by(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static int g(String str, String str2, boolean z) {
        return com.kwad.framework.filedownloader.download.b.us().ut().g(str, str2, z);
    }

    public static boolean g(long j, long j2) {
        return j > ((long) vT()) && j2 > vU();
    }

    private static String q(String str, String str2) {
        if (str2 != null) {
            if (str != null) {
                return b("%s%s%s", str, File.separator, str2);
            }
            throw new IllegalStateException("can't generate real path, the directory is null");
        }
        throw new IllegalStateException("can't generate real path, the file name is null");
    }

    public static int r(String str, String str2) {
        return com.kwad.framework.filedownloader.download.b.us().ut().g(str, str2, false);
    }

    public static void s(String str, String str2) {
        bx(str2);
        by(str);
    }

    private static int vT() {
        return afd;
    }

    private static long vU() {
        return afe;
    }

    private static String vV() {
        if (TextUtils.isEmpty(aff)) {
            return (c.vP().getExternalCacheDir() == null ? Environment.getDownloadCacheDirectory() : c.vP().getExternalCacheDir()).getAbsolutePath();
        }
        return aff;
    }

    public static boolean vW() {
        ConnectivityManager connectivityManager = (ConnectivityManager) c.vP().getSystemService("connectivity");
        if (connectivityManager == null) {
            d.d(f.class, "failed to get connectivity manager!", new Object[0]);
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null || activeNetworkInfo.getType() != 1;
    }

    public static String vX() {
        return b("FileDownloader/%s", BuildConfig.VERSION_NAME);
    }
}
