package net.hockeyapp.android.objects;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.utils.HockeyLog;
/* loaded from: classes4.dex */
public class CrashDetails {
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
    private final String a;
    private String b;
    private Date c;
    private Date d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private Boolean n;
    private String o;

    public CrashDetails(String str) {
        this.a = str;
        this.n = false;
        this.m = "";
    }

    public CrashDetails(String str, Throwable th) {
        this(str);
        this.n = false;
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        this.m = stringWriter.toString();
    }

    public CrashDetails(String str, Throwable th, String str2, Boolean bool) {
        this(str);
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        this.n = true;
        setFormat("Xamarin");
        if (bool.booleanValue()) {
            printWriter.print("Xamarin caused by: ");
            th.printStackTrace(printWriter);
        } else if (!TextUtils.isEmpty(str2)) {
            th.printStackTrace(printWriter);
            printWriter.print("Xamarin caused by: ");
            printWriter.print(str2);
        } else {
            th.printStackTrace(printWriter);
        }
        this.m = stringWriter.toString();
    }

    public static CrashDetails fromFile(File file) {
        return fromReader(file.getName().substring(0, file.getName().indexOf(".stacktrace")), new FileReader(file));
    }

    public static CrashDetails fromReader(String str, Reader reader) {
        BufferedReader bufferedReader = new BufferedReader(reader);
        CrashDetails crashDetails = new CrashDetails(str);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                if (!z) {
                    if (readLine.isEmpty()) {
                        z = true;
                    } else {
                        int indexOf = readLine.indexOf(":");
                        if (indexOf < 0) {
                            HockeyLog.error("Malformed header line when parsing crash details: \"" + readLine + "\"");
                        }
                        String trim = readLine.substring(0, indexOf).trim();
                        String trim2 = readLine.substring(indexOf + 1, readLine.length()).trim();
                        if (trim.equals("CrashReporter Key")) {
                            crashDetails.setReporterKey(trim2);
                        } else if (trim.equals("Start Date")) {
                            try {
                                crashDetails.setAppStartDate(DATE_FORMAT.parse(trim2));
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                        } else if (trim.equals("Date")) {
                            try {
                                crashDetails.setAppCrashDate(DATE_FORMAT.parse(trim2));
                            } catch (ParseException e2) {
                                throw new RuntimeException(e2);
                            }
                        } else if (trim.equals("Android")) {
                            crashDetails.setOsVersion(trim2);
                        } else if (trim.equals("Android Build")) {
                            crashDetails.setOsBuild(trim2);
                        } else if (trim.equals("Manufacturer")) {
                            crashDetails.setDeviceManufacturer(trim2);
                        } else if (trim.equals(ExifInterface.TAG_MODEL)) {
                            crashDetails.setDeviceModel(trim2);
                        } else if (trim.equals("Package")) {
                            crashDetails.setAppPackage(trim2);
                        } else if (trim.equals("Version Name")) {
                            crashDetails.setAppVersionName(trim2);
                        } else if (trim.equals("Version Code")) {
                            crashDetails.setAppVersionCode(trim2);
                        } else if (trim.equals("Thread")) {
                            crashDetails.setThreadName(trim2);
                        } else if (trim.equals("Format")) {
                            crashDetails.setFormat(trim2);
                        }
                    }
                } else {
                    sb.append(readLine).append("\n");
                }
            } else {
                crashDetails.setThrowableStackTrace(sb.toString());
                return crashDetails;
            }
        }
    }

    public void writeCrashReport() {
        writeCrashReport(Constants.FILES_PATH + "/" + this.a + ".stacktrace");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeCrashReport(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Writing unhandled exception to: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            net.hockeyapp.android.utils.HockeyLog.debug(r0)
            r2 = 0
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lb7
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lb7
            r0.<init>(r5)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lb7
            r1.<init>(r0)     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Lb7
            java.lang.String r0 = "Package"
            java.lang.String r2 = r4.i     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r0 = "Version Code"
            java.lang.String r2 = r4.k     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r0 = "Version Name"
            java.lang.String r2 = r4.j     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r0 = "Android"
            java.lang.String r2 = r4.e     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r0 = "Android Build"
            java.lang.String r2 = r4.f     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r0 = "Manufacturer"
            java.lang.String r2 = r4.g     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r0 = "Model"
            java.lang.String r2 = r4.h     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r0 = "Thread"
            java.lang.String r2 = r4.l     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r0 = "CrashReporter Key"
            java.lang.String r2 = r4.b     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r0 = "Start Date"
            java.text.SimpleDateFormat r2 = net.hockeyapp.android.objects.CrashDetails.DATE_FORMAT     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.util.Date r3 = r4.c     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r2 = r2.format(r3)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r0 = "Date"
            java.text.SimpleDateFormat r2 = net.hockeyapp.android.objects.CrashDetails.DATE_FORMAT     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.util.Date r3 = r4.d     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r2 = r2.format(r3)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.Boolean r0 = r4.n     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            if (r0 == 0) goto L89
            java.lang.String r0 = "Format"
            java.lang.String r2 = "Xamarin"
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
        L89:
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            java.lang.String r0 = r4.m     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r1.write(r0)     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            r1.flush()     // Catch: java.lang.Throwable -> Lc6 java.io.IOException -> Lc8
            if (r1 == 0) goto L9b
            r1.close()     // Catch: java.io.IOException -> L9c
        L9b:
            return
        L9c:
            r0 = move-exception
            java.lang.String r1 = "Error saving crash report!"
            net.hockeyapp.android.utils.HockeyLog.error(r1, r0)
            goto L9b
        La3:
            r0 = move-exception
            r1 = r2
        La5:
            java.lang.String r2 = "Error saving crash report!"
            net.hockeyapp.android.utils.HockeyLog.error(r2, r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 == 0) goto L9b
            r1.close()     // Catch: java.io.IOException -> Lb0
            goto L9b
        Lb0:
            r0 = move-exception
            java.lang.String r1 = "Error saving crash report!"
            net.hockeyapp.android.utils.HockeyLog.error(r1, r0)
            goto L9b
        Lb7:
            r0 = move-exception
            r1 = r2
        Lb9:
            if (r1 == 0) goto Lbe
            r1.close()     // Catch: java.io.IOException -> Lbf
        Lbe:
            throw r0
        Lbf:
            r1 = move-exception
            java.lang.String r2 = "Error saving crash report!"
            net.hockeyapp.android.utils.HockeyLog.error(r2, r1)
            goto Lbe
        Lc6:
            r0 = move-exception
            goto Lb9
        Lc8:
            r0 = move-exception
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.hockeyapp.android.objects.CrashDetails.writeCrashReport(java.lang.String):void");
    }

    private void a(Writer writer, String str, String str2) {
        writer.write(str + ": " + str2 + "\n");
    }

    public String getCrashIdentifier() {
        return this.a;
    }

    public String getReporterKey() {
        return this.b;
    }

    public void setReporterKey(String str) {
        this.b = str;
    }

    public Date getAppStartDate() {
        return this.c;
    }

    public void setAppStartDate(Date date) {
        this.c = date;
    }

    public Date getAppCrashDate() {
        return this.d;
    }

    public void setAppCrashDate(Date date) {
        this.d = date;
    }

    public String getOsVersion() {
        return this.e;
    }

    public void setOsVersion(String str) {
        this.e = str;
    }

    public String getOsBuild() {
        return this.f;
    }

    public void setOsBuild(String str) {
        this.f = str;
    }

    public String getDeviceManufacturer() {
        return this.g;
    }

    public void setDeviceManufacturer(String str) {
        this.g = str;
    }

    public String getDeviceModel() {
        return this.h;
    }

    public void setDeviceModel(String str) {
        this.h = str;
    }

    public String getAppPackage() {
        return this.i;
    }

    public void setAppPackage(String str) {
        this.i = str;
    }

    public String getAppVersionName() {
        return this.j;
    }

    public void setAppVersionName(String str) {
        this.j = str;
    }

    public String getAppVersionCode() {
        return this.k;
    }

    public void setAppVersionCode(String str) {
        this.k = str;
    }

    public String getThreadName() {
        return this.l;
    }

    public void setThreadName(String str) {
        this.l = str;
    }

    public String getThrowableStackTrace() {
        return this.m;
    }

    public void setThrowableStackTrace(String str) {
        this.m = str;
    }

    public Boolean getIsXamarinException() {
        return this.n;
    }

    public void setIsXamarinException(Boolean bool) {
        this.n = bool;
    }

    public String getFormat() {
        return this.o;
    }

    public void setFormat(String str) {
        this.o = str;
    }
}
