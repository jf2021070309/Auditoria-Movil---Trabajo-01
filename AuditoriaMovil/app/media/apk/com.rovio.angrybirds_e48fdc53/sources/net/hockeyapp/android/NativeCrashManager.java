package net.hockeyapp.android;

import android.app.Activity;
import android.util.Log;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Date;
import java.util.UUID;
/* loaded from: classes4.dex */
public class NativeCrashManager {
    private static String a = "NativeCrashManager";
    private static SecureRandom b = new SecureRandom();

    static /* synthetic */ String a() {
        return c();
    }

    public static void handleDumpFiles(Activity activity, String str) {
        String[] d;
        for (String str2 : d()) {
            String createLogFile = createLogFile();
            if (createLogFile != null) {
                uploadDumpAndLog(activity, str, str2, createLogFile);
            }
        }
    }

    public static String createLogFile() {
        Date date = new Date();
        try {
            String uuid = UUID.randomUUID().toString();
            String str = Constants.FILES_PATH + "/" + uuid + ".faketrace";
            Log.d(a, "Writing unhandled exception to: " + str);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(str));
            bufferedWriter.write("Package: " + Constants.APP_PACKAGE + "\n");
            bufferedWriter.write("Version: " + Constants.APP_VERSION + "\n");
            bufferedWriter.write("Android: " + Constants.ANDROID_VERSION + "\n");
            bufferedWriter.write("Manufacturer: " + Constants.PHONE_MANUFACTURER + "\n");
            bufferedWriter.write("Model: " + Constants.PHONE_MODEL + "\n");
            bufferedWriter.write("Date: " + date + "\n");
            bufferedWriter.write("\n");
            bufferedWriter.write("MinidumpContainer");
            bufferedWriter.flush();
            bufferedWriter.close();
            return uuid + ".faketrace";
        } catch (Exception e) {
            return null;
        }
    }

    private static void b(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes(Charset.forName("UTF-8")));
    }

    private static void a(OutputStream outputStream, File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        fileInputStream.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(OutputStream outputStream, String str, boolean z) {
        b(outputStream, "--");
        b(outputStream, str);
        if (z) {
            b(outputStream, "--");
        }
        b(outputStream, "\r\n");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(OutputStream outputStream, String str) {
        b(outputStream, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(OutputStream outputStream, String str, File file) {
        b(outputStream, "Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + file.getName() + "\"\r\n");
        b(outputStream, "Content-Type: application/octet-stream\r\n");
        b(outputStream, "Content-Transfer-Encoding: binary\r\n\r\n");
        a(outputStream, file);
        b(outputStream, "\r\n");
    }

    private static String c() {
        StringBuilder sb = new StringBuilder(30);
        for (int i = 0; i < 30; i++) {
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_-".charAt(b.nextInt("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_-".length())));
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [net.hockeyapp.android.NativeCrashManager$1] */
    public static void uploadDumpAndLog(final Activity activity, final String str, final String str2, final String str3) {
        new Thread() { // from class: net.hockeyapp.android.NativeCrashManager.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                String a2 = NativeCrashManager.a();
                String replace = str2.replace(".dmp", ".desc");
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://rink.hockeyapp.net/api/2/apps/" + str + "/crashes/upload").openConnection();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    File file = new File(Constants.FILES_PATH, str2);
                    NativeCrashManager.c(byteArrayOutputStream, a2);
                    NativeCrashManager.b(byteArrayOutputStream, "attachment0", file);
                    File file2 = new File(Constants.FILES_PATH, str3);
                    NativeCrashManager.c(byteArrayOutputStream, a2);
                    NativeCrashManager.b(byteArrayOutputStream, "log", file2);
                    File file3 = new File(Constants.FILES_PATH, replace);
                    if (file3.exists()) {
                        NativeCrashManager.c(byteArrayOutputStream, a2);
                        NativeCrashManager.b(byteArrayOutputStream, "description", file3);
                    }
                    NativeCrashManager.b((OutputStream) byteArrayOutputStream, a2, true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty(DownloadUtils.CONTENT_TYPE, "multipart/form-data;boundary=" + a2);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setFixedLengthStreamingMode(byteArrayOutputStream.size());
                    byteArrayOutputStream.writeTo(httpURLConnection.getOutputStream());
                    int responseCode = httpURLConnection.getResponseCode();
                    String responseMessage = httpURLConnection.getResponseMessage();
                    httpURLConnection.disconnect();
                    if (responseCode != 200) {
                        Log.e(NativeCrashManager.a, "Failed to post HockeyApp crash report: " + responseMessage);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    activity.deleteFile(replace);
                    activity.deleteFile(str3);
                    activity.deleteFile(str2);
                }
            }
        }.start();
    }

    private static String[] d() {
        if (Constants.FILES_PATH != null) {
            File file = new File(Constants.FILES_PATH + "/");
            if (!file.mkdir() && !file.exists()) {
                return new String[0];
            }
            return file.list(new FilenameFilter() { // from class: net.hockeyapp.android.NativeCrashManager.2
                @Override // java.io.FilenameFilter
                public boolean accept(File file2, String str) {
                    return str.endsWith(".dmp");
                }
            });
        }
        Log.d(a, "Can't search for exception as file path is null.");
        return new String[0];
    }
}
