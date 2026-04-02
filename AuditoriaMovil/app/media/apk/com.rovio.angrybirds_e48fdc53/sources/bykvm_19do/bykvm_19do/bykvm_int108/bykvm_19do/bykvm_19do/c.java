package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.j;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.m;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.i;
import com.facebook.share.internal.ShareConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    static volatile boolean f = true;
    private a a;
    private final Context b;
    private volatile long c;
    private volatile boolean d = false;
    private final SharedPreferences e;

    public c(Context context) {
        if (context == null || !(context instanceof Application)) {
            throw new IllegalArgumentException("context must not be null or not application");
        }
        this.b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("anr_monitor_table", 0);
        this.e = sharedPreferences;
        this.c = sharedPreferences.getLong("trace_anr_happen_time", 0L);
        g.a(100, 100);
    }

    private String a(BufferedReader bufferedReader) throws IOException {
        if (bufferedReader == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null || readLine.trim().length() <= 0) {
                break;
            }
            sb.append(readLine);
            sb.append("\n");
        }
        return sb.toString();
    }

    private static void a(String str) {
        for (bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.f fVar : i.d().a()) {
            fVar.a(bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.ANR, str, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        r0 = new java.lang.Object[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        r0[0] = r5;
        r0[1] = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object[] a(java.io.BufferedReader r8, java.util.regex.Pattern... r9) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L2d
            if (r9 == 0) goto L2d
            int r1 = r9.length
            if (r1 > 0) goto L9
            goto L2d
        L9:
            java.lang.String r1 = r8.readLine()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2d
            int r2 = r9.length     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r2) goto L9
            r5 = r9[r4]
            java.util.regex.Matcher r6 = r5.matcher(r1)     // Catch: java.lang.Throwable -> L2c
            boolean r6 = r6.matches()     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L29
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L2c
            r0[r3] = r5
            r8 = 1
            r0[r8] = r1
            goto L2d
        L29:
            int r4 = r4 + 1
            goto L12
        L2c:
            r8 = move-exception
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.c.a(java.io.BufferedReader, java.util.regex.Pattern[]):java.lang.Object[]");
    }

    public JSONObject a(String str, int i, String str2) {
        BufferedReader bufferedReader;
        int i2;
        BufferedReader bufferedReader2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.exists() && file.canRead()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    try {
                        Pattern compile = Pattern.compile("-{5}\\spid\\s\\d+\\sat\\s\\d+-\\d+-\\d+\\s\\d{2}:\\d{2}:\\d{2}\\s-{5}");
                        Pattern compile2 = Pattern.compile("-{5}\\send\\s\\d+\\s-{5}");
                        Pattern compile3 = Pattern.compile("Cmd\\sline:\\s(\\S+)");
                        Pattern compile4 = Pattern.compile("\".+\"\\s(daemon\\s){0,1}prio=\\d+\\stid=\\d+\\s.*");
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                        boolean z = false;
                        Object[] a = a(bufferedReader, compile);
                        if (a != null) {
                            long parseLong = Long.parseLong(a[1].toString().split("\\s")[2]);
                            long time = simpleDateFormat.parse(a[1].toString().split("\\s")[4] + " " + a[1].toString().split("\\s")[5]).getTime();
                            Object[] a2 = a(bufferedReader, compile3);
                            if (a2 != null) {
                                String str3 = a2[1].toString().split("\\s")[2];
                                if (parseLong == i && str3.equalsIgnoreCase(str2) && (this.c == 0 || Math.abs(this.c - time) >= 20000)) {
                                    this.c = time;
                                    SharedPreferences sharedPreferences = this.e;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putLong("trace_anr_happen_time", this.c).apply();
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("anrTime", time);
                                    while (true) {
                                        Object[] a3 = a(bufferedReader, compile2, compile4);
                                        if (a3 == null || a3[0] != compile4) {
                                            break;
                                        }
                                        Matcher matcher = Pattern.compile("\".+\"").matcher(a3[1].toString());
                                        String substring = matcher.find() ? matcher.group().substring(1, matcher.group().length() - 1) : "";
                                        Matcher matcher2 = Pattern.compile("tid=\\d+").matcher(a3[1].toString());
                                        if (matcher2.find()) {
                                            String group = matcher2.group();
                                            i2 = Integer.parseInt(group.substring(group.indexOf("=") + 1));
                                        } else {
                                            i2 = -1;
                                        }
                                        String a4 = a(bufferedReader);
                                        if (i2 != -1 && !TextUtils.isEmpty(substring) && !TextUtils.isEmpty(a4) && substring.equalsIgnoreCase("main")) {
                                            jSONObject.put("mainStackFromTrace", a4);
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        jSONObject.put("thread_number", 1);
                                        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.f.a(bufferedReader);
                                        return jSONObject;
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.f.a(bufferedReader);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.f.a(bufferedReader2);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.f.a(bufferedReader2);
                throw th;
            }
            bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.f.a(bufferedReader);
            return null;
        }
        return null;
    }

    public void a() {
        if (this.d) {
            return;
        }
        if (Build.VERSION.SDK_INT < 21) {
            a aVar = new a(this, "/data/anr/", 8);
            this.a = aVar;
            aVar.startWatching();
        } else {
            new d(this);
        }
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i, String str, int i2) {
        JSONObject jSONObject;
        JSONObject a;
        JSONArray q = g.q();
        long uptimeMillis = SystemClock.uptimeMillis();
        JSONObject c = g.c(uptimeMillis);
        JSONArray a2 = g.a(100, uptimeMillis);
        try {
            jSONObject = e.a(f);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        String a3 = e.a(this.b, i2);
        if (TextUtils.isEmpty(a3)) {
            return false;
        }
        if (i == 200 && (a = a(str, Process.myPid(), this.b.getPackageName())) != null && a.length() > 0) {
            jSONObject = a;
        }
        if (jSONObject == null || jSONObject.length() <= 0) {
            return true;
        }
        try {
            jSONObject.put("pid", Process.myPid());
            jSONObject.put("package", this.b.getPackageName());
            jSONObject.put("is_remote_process", 0);
            bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_for12.a aVar = new bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_for12.a(new JSONObject());
            aVar.a(ShareConstants.WEB_DIALOG_PARAM_DATA, jSONObject.toString());
            aVar.a("is_anr", (Object) 1);
            aVar.a("timestamp", Long.valueOf(System.currentTimeMillis()));
            aVar.a("event_type", "anr");
            aVar.a("history_message", q);
            aVar.a("current_message", c);
            aVar.a("pending_messages", a2);
            aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
            aVar.a("crash_time", Long.valueOf(System.currentTimeMillis()));
            aVar.a("anr_info", a3);
            aVar.a("all_thread_stacks", m.a((String) null));
            bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_for12.a a4 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.bykvm_19do.e.a().a(bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.ANR, aVar);
            bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.d.a(this.b, bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.ANR.a(), (String) null);
            bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_byte12b.a.a().b(a4.a());
            a(a3);
            return true;
        } catch (Throwable th) {
            j.b(th);
            return true;
        }
    }
}
