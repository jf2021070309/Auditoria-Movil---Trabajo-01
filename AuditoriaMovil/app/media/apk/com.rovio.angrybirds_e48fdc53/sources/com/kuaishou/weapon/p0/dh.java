package com.kuaishou.weapon.p0;

import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class dh {
    public static String a() {
        try {
            return b(String.format(" lsof -p %1$s ", Integer.valueOf(Process.myPid())));
        } catch (Exception e) {
            return null;
        }
    }

    public static String a(String str) {
        String str2 = "";
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(str).getInputStream()));
            try {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    str2 = "" + readLine;
                }
                try {
                    bufferedReader2.close();
                } catch (Exception e) {
                }
                return str2;
            } catch (Exception e2) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception e3) {
                    }
                }
                return "";
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception e4) {
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String b() {
        try {
            String a = a(" pidof adbd ");
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            return a.length() > 10 ? a.substring(0, 10) : a;
        } catch (Exception e) {
            return null;
        }
    }

    private static String b(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(str).getInputStream()));
            ArrayList arrayList = new ArrayList();
            do {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.contains("TCP") && !readLine.contains(":443")) {
                    arrayList.add(readLine);
                }
            } while (arrayList.size() <= 5);
            bufferedReader.close();
            if (arrayList.size() > 0) {
                return arrayList.toString();
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
        if (r3 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Set c() {
        /*
            r0 = 0
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L61
            r1.<init>()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L61
            java.lang.String r2 = " netstat -nap "
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L61
            java.lang.Process r2 = r3.exec(r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L61
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L61
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L61
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L61
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L61
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L61
        L1e:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            if (r2 == 0) goto L40
            java.lang.String r4 = "tcp"
            boolean r4 = r2.contains(r4)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            if (r4 == 0) goto L1e
            java.lang.String r4 = "ESTABLISHED"
            boolean r4 = r2.contains(r4)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            if (r4 == 0) goto L1e
            java.lang.String r4 = ":5555 "
            boolean r4 = r2.contains(r4)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            if (r4 == 0) goto L1e
            r1.add(r2)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            goto L1e
        L40:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            if (r2 <= 0) goto L4c
            r3.close()     // Catch: java.lang.Exception -> L4a
            goto L4b
        L4a:
            r0 = move-exception
        L4b:
            return r1
        L4c:
            r3.close()     // Catch: java.lang.Exception -> L50
            goto L66
        L50:
            r1 = move-exception
            goto L66
        L52:
            r0 = move-exception
            goto L59
        L54:
            r1 = move-exception
            goto L63
        L56:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L59:
            if (r3 == 0) goto L60
            r3.close()     // Catch: java.lang.Exception -> L5f
            goto L60
        L5f:
            r1 = move-exception
        L60:
            throw r0
        L61:
            r1 = move-exception
            r3 = r0
        L63:
            if (r3 == 0) goto L66
            goto L4c
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.dh.c():java.util.Set");
    }

    public static int d() {
        String readLine;
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(" netstat -apn | grep scrcpy ").getInputStream()));
            do {
                try {
                    readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader2.close();
                        } catch (Exception e) {
                        }
                        return 0;
                    }
                } catch (Exception e2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e3) {
                        }
                    }
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e4) {
                        }
                    }
                    throw th;
                }
            } while (!readLine.contains("scrcpy"));
            try {
                bufferedReader2.close();
                return 1;
            } catch (Exception e5) {
                return 1;
            }
        } catch (Exception e6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[Catch: all -> 0x008f, Exception -> 0x0092, TryCatch #7 {Exception -> 0x0092, all -> 0x008f, blocks: (B:4:0x001b, B:5:0x0020, B:7:0x0026, B:10:0x002e, B:12:0x0034, B:14:0x003a, B:15:0x003e, B:19:0x004e, B:22:0x0058, B:23:0x005c, B:26:0x0067, B:29:0x0072, B:16:0x0043, B:18:0x0049, B:32:0x007d), top: B:69:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0056 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject e() {
        /*
            java.lang.String r0 = "/"
            r1 = 0
            java.lang.String r2 = " netstat -an "
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L9d
            java.lang.Process r2 = r3.exec(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L9d
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L9d
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L9d
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L9d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L9d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L9d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            r2.<init>()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
        L20:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            if (r4 == 0) goto L7d
            boolean r5 = r4.contains(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            java.lang.String r6 = "@"
            if (r5 != 0) goto L34
            boolean r5 = r4.contains(r6)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            if (r5 == 0) goto L20
        L34:
            boolean r5 = r4.contains(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            if (r5 == 0) goto L43
            int r5 = r4.indexOf(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
        L3e:
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            goto L4e
        L43:
            boolean r5 = r4.contains(r6)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            if (r5 == 0) goto L4e
            int r5 = r4.indexOf(r6)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            goto L3e
        L4e:
            java.lang.String r5 = "/ddy"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            if (r5 == 0) goto L5c
            java.lang.String r5 = "0"
        L58:
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            goto L20
        L5c:
            java.lang.String r5 = "scrcpy"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            if (r5 == 0) goto L67
            java.lang.String r5 = "1"
            goto L58
        L67:
            java.lang.String r5 = "supersu"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            if (r5 == 0) goto L72
            java.lang.String r5 = "2"
            goto L58
        L72:
            java.lang.String r5 = "/adbd"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            if (r5 == 0) goto L20
            java.lang.String r5 = "3"
            goto L58
        L7d:
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            if (r0 <= 0) goto L89
            r3.close()     // Catch: java.lang.Exception -> L87
            goto L88
        L87:
            r0 = move-exception
        L88:
            return r2
        L89:
            r3.close()     // Catch: java.lang.Exception -> L8d
            goto L8e
        L8d:
            r0 = move-exception
        L8e:
            return r1
        L8f:
            r0 = move-exception
            r1 = r3
            goto L95
        L92:
            r0 = move-exception
            goto L9f
        L94:
            r0 = move-exception
        L95:
            if (r1 == 0) goto L9c
            r1.close()     // Catch: java.lang.Exception -> L9b
            goto L9c
        L9b:
            r1 = move-exception
        L9c:
            throw r0
        L9d:
            r0 = move-exception
            r3 = r1
        L9f:
            if (r3 == 0) goto La6
            r3.close()     // Catch: java.lang.Exception -> La5
            goto La6
        La5:
            r0 = move-exception
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.dh.e():org.json.JSONObject");
    }
}
