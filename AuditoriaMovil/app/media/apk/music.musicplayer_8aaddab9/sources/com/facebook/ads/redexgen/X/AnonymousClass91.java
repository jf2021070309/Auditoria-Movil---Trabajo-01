package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import ch.qos.logback.core.util.FileUtil;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.91  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass91 {
    public static AtomicInteger A00;
    public static byte[] A01;
    public static String[] A02 = {"TEIgz1GSUxi0w6HxI", "WqDufwBE7AlvD41n6qdN4YbCXU2LtDad", "95AkSvnB6didgYS0", "q9Pm9O4XheyxpjJIaV85netzFUNpUTJ1", "laKi0sQOm1cRNFPmXQKezZzTFfBBOlTJ", "R9By8R7rHrFXxi8d0eZrOpOQKJFwFXXr", "DNKj97yZe49oXEmfRz7aINNiwqbkjDQZ", "HsAQREGxpVIGFVt11mTJ2r8ajNtMZb1h"};
    public static final Object A03;
    public static final String A04;
    public static final Map<String, Integer> A05;
    public static final Set<String> A06;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{7, 95, 83, 55, 1, 28, 3, 48, 28, 6, 29, 7, 22, 1, 73, 83, 63, 29, 18, 91, 8, 92, 24, 25, 16, 25, 8, 25, 92, 24, 25, 30, 9, 27, 92, 25, 10, 25, 18, 8, 15, 92, 26, 21, 16, 25, 82, 14, 44, 35, 106, 57, 109, 41, 40, 33, 40, 57, 40, 109, 43, 36, 33, 40, 108, 119, 118, 113, 102, 116, 108, 99, 97, 118, 117, 42, 25, 10, 1, 27, 44, 0, 26, 1, 27, 41, 45, 46, 26, 11, 6, 10, 1, 12, 10, 33, 10, 27, 24, 0, 29, 4, 31, 58, 61, 40, 42, 111, 43, 42, 45, 58, 40, 111, 42, 57, 42, 33, 59, 60, 111, 41, 38, 35, 42, 97, 69, 9, 38, 35, 42, 111, 60, 38, 53, 42, 117, 111, 111, 87, 85, 76, 76, 89, 88, 28, 89, 74, 89, 82, 72, 79, 18, 40, 16, 18, 11, 11, 18, 21, 28, 91, 24, 20, 9, 9, 14, 11, 15, 30, 31, 91, 31, 30, 25, 14, 28, 91, 30, 13, 30, 21, 15, 91, 23, 18, 21, 30, 85, 98, 68, 79, 95, 88, 81, 22, 66, 89, 22, 67, 70, 82, 87, 66, 83, 22, 67, 88, 68, 83, 85, 89, 68, 82, 83, 82, 22, 82, 83, 84, 67, 81, 122, 89, 81, 115, 64, 83, 88, 66, 24, 22, 87, 82, 82, 95, 88, 81, 22, 66, 89, 22, 121, 88, 81, 89, 95, 88, 81, 115, 64, 83, 88, 66, 24, 58, 17, 0, 8, 21, 6, 19, 19, 2, 10, 23, 19, 88, 93, 72, 93, Byte.MAX_VALUE, 126, 68, 119, 116, 124, 124, 114, 117, 124, 43, 42, 45, 58, 40, 35, 32, 40, 60, 91, 84, 83, 84, 78, 85, 88, 89, 29, 88, 75, 88, 83, 73, 29, 78, 85, 82, 72, 81, 89, 29, 83, 82, 73, 29, 95, 88, 29, 72, 77, 89, 92, 73, 88, 89, 29, 73, 82, 29, 114, 83, 90, 82, 84, 83, 90, 120, 75, 88, 83, 73, 19, 107, 102, 126, 104, 126, 126, 100, 98, 99, 82, 100, 105, 72, 94, 72, 72, 82, 84, 85, 100, 79, 82, 86, 94, 105, 113, 115, 106, 106, Byte.MAX_VALUE, 126, 95, 108, Byte.MAX_VALUE, 116, 110, 105, 58, 39, 58, 49, 55, 32, 54, 59, 50, 39, 75, 77, 90, 76, 65, 72, 93, 103, 91, 87, 92, 93, 119, 106, 110, 102, 85, 88, 81, 68};
    }

    static {
        A06();
        A04 = AnonymousClass91.class.getName();
        A03 = new Object();
        A06 = Collections.synchronizedSet(new HashSet());
        A05 = Collections.synchronizedMap(new HashMap());
        A00 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) - A06.size();
    }

    public static AnonymousClass93 A01(String str, C8U c8u, Map<String, String> map) {
        AnonymousClass93 anonymousClass93 = null;
        try {
            anonymousClass93 = new AnonymousClass93(c8u.A07().A01(), c8u.A07().A02(), new C04288n(str, map, true).A02());
            A0C(anonymousClass93, c8u);
            return anonymousClass93;
        } catch (Exception unused) {
            return anonymousClass93;
        }
    }

    public static JSONArray A03(C8U c8u) {
        return A04(c8u, -1);
    }

    public static JSONArray A04(C8U c8u, int i2) {
        InterfaceC04388y A062;
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                if (new File(c8u.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8u)).exists()) {
                    fileInputStream = c8u.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8u));
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null || i2 == 0) {
                            break;
                        }
                        JSONObject jSONObject = new JSONObject(readLine);
                        if (!jSONObject.has(A02(260, 7, 27))) {
                            jSONObject.put(A02(260, 7, 27), String.valueOf(0));
                        }
                        String string = jSONObject.getString(A02(343, 2, 126));
                        if (!A06.contains(string)) {
                            int attempt = jSONObject.getInt(A02(260, 7, 27));
                            if (A05.containsKey(string)) {
                                jSONObject.put(A02(260, 7, 27), String.valueOf(A05.get(string)));
                            } else {
                                A0E(string, attempt);
                            }
                            jSONArray.put(jSONObject);
                            if (i2 > 0) {
                                i2--;
                            }
                        }
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        e = e2;
                        A062 = c8u.A06();
                        A062.A3Q(e);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException | JSONException e3) {
                c8u.A06().A3Q(e3);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                        e = e4;
                        A062 = c8u.A06();
                        A062.A3Q(e);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject A05(AnonymousClass93 anonymousClass93) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A02(343, 2, 126), UUID.randomUUID().toString());
        jSONObject.put(A02(406, 4, 93), anonymousClass93.A03());
        jSONObject.put(A02(402, 4, 127), MC.A02(anonymousClass93.A01()));
        jSONObject.put(A02(355, 12, 71), MC.A02(anonymousClass93.A00()));
        jSONObject.put(A02(345, 10, 113), anonymousClass93.A02());
        jSONObject.put(A02(267, 4, 64), anonymousClass93.A04() != null ? new JSONObject(anonymousClass93.A04()) : new JSONObject());
        jSONObject.put(A02(260, 7, 27), String.valueOf(0));
        return jSONObject;
    }

    public static void A07(Context context) {
        synchronized (A03) {
            File file = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), context));
            if (file.exists()) {
                file.delete();
            }
            A09(context, 0);
            A06.clear();
            A05.clear();
        }
    }

    public static void A08(Context context) {
        A09(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) + 1);
    }

    public static void A09(Context context, int i2) {
        int i3 = 0;
        SharedPreferences.Editor edit = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).edit();
        if (i2 >= 0) {
            i3 = i2;
        }
        edit.putInt(A02(75, 10, 19), i3).apply();
    }

    public static void A0A(C8U c8u, String str) {
        File file = new File(c8u.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            c8u.A06().A3Q(new RuntimeException(A02(47, 18, 49)));
        }
    }

    public static void A0B(C1045Xn c1045Xn, String str) {
        Integer num = A05.get(str);
        if (num == null) {
            if (c1045Xn.A03().A8P()) {
                Log.e(A04, A02(189, 66, 74));
            }
            num = 0;
        } else {
            A05.remove(str);
        }
        A05.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void A0C(AnonymousClass93 anonymousClass93, C8U c8u) {
        if (anonymousClass93 != null && c8u != null) {
            synchronized (A03) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8u);
                    File file = new File(c8u.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int A07 = JS.A07(c8u);
                        long fileSize = file.length();
                        if (A07 > 0 && fileSize > A07) {
                            boolean delete = file.delete();
                            A09(c8u, 0);
                            A06.clear();
                            A05.clear();
                            if (delete) {
                                Map<String, String> A4S = c8u.A02().A4S();
                                A4S.put(A02(383, 7, 62), A02(271, 10, FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT));
                                A4S.put(A02(390, 12, 68), String.valueOf(2401));
                                A01(A02(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 36, 51) + fileSize + A02(1, 15, 15) + A00.getAndIncrement(), c8u, A4S);
                                return;
                            }
                            Log.e(A02(85, 17, 19), A02(16, 31, 0));
                        }
                    }
                    JSONObject A052 = A05(anonymousClass93);
                    FileOutputStream openFileOutput = c8u.openFileOutput(processSpecificName, FileUtil.BUF_SIZE);
                    String line = A052.toString() + A02(0, 1, 113);
                    openFileOutput.write(line.getBytes());
                    openFileOutput.close();
                    A08(c8u);
                } catch (Exception e2) {
                    c8u.A06().A3Q(e2);
                }
            }
        }
    }

    public static void A0D(String str) {
        A05.remove(str);
        A06.add(str);
    }

    public static void A0E(String str, int i2) {
        if (!A06.contains(str)) {
            boolean containsKey = A05.containsKey(str);
            if (A02[7].charAt(23) == 'F') {
                throw new RuntimeException();
            }
            A02[6] = "rEqe91lv7lznGuMpeMm8YlOivWfc8wjs";
            if (containsKey) {
                A05.remove(str);
            }
            A05.put(str, Integer.valueOf(i2));
            return;
        }
        throw new RuntimeException(A02(290, 53, 65));
    }

    public static boolean A0F(C8U c8u) {
        if (JS.A0O(c8u)) {
            return A0H(c8u);
        }
        boolean A0G = A0G(c8u);
        String[] strArr = A02;
        if (strArr[0].length() != strArr[5].length()) {
            String[] strArr2 = A02;
            strArr2[3] = "3ABJ1YchwKShiC4YrWnTlA0erUDCQvCN";
            strArr2[1] = "wuaZskSkctYpKQ1vHIoiu3NDqUJM9HRQ";
            return A0G;
        }
        throw new RuntimeException();
    }

    public static boolean A0G(C8U c8u) {
        JSONArray debugLogEvents = new JSONArray();
        synchronized (A03) {
            int i2 = 0;
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStream = null;
            try {
                if (new File(c8u.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8u)).exists()) {
                    fileInputStream = c8u.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8u));
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (A02[4].charAt(1) != 'a') {
                            throw new RuntimeException();
                        }
                        A02[2] = "N2MSSJLvxCxpns9Z";
                        if (readLine != null) {
                            JSONObject jSONObject = new JSONObject(readLine);
                            String string = jSONObject.getString(A02(343, 2, 126));
                            if (!A06.contains(string)) {
                                if (A05.containsKey(string)) {
                                    Integer attempt = A05.get(string);
                                    int retryLimit = attempt != null ? attempt.intValue() : 0;
                                    Integer valueOf = Integer.valueOf(retryLimit);
                                    int A022 = JS.A02(c8u);
                                    if (A022 > -1) {
                                        int retryLimit2 = A022 - 1;
                                        if (valueOf.intValue() > retryLimit2) {
                                            A0D(string);
                                            i2++;
                                        }
                                    }
                                    String eventId = A02(260, 7, 27);
                                    jSONObject.put(eventId, String.valueOf(valueOf));
                                    debugLogEvents.put(jSONObject);
                                } else {
                                    debugLogEvents.put(jSONObject);
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            int length = debugLogEvents.length();
                            for (int i3 = 0; i3 < length; i3++) {
                                JSONObject debugLog = debugLogEvents.getJSONObject(i3);
                                sb.append(debugLog.toString());
                                sb.append('\n');
                            }
                            fileOutputStream = c8u.openFileOutput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8u), 0);
                            fileOutputStream.write(sb.toString().getBytes());
                        }
                    }
                }
                A09(c8u, A00(c8u));
                if (i2 > 0) {
                    c8u.A06().A8y(A02(271, 10, FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT), C04398z.A2L, new AnonymousClass90(A02(138, 15, 64), A02(367, 16, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH) + i2));
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        c8u.A06().A3Q(e2);
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A06.clear();
                A05.clear();
                return true;
            } catch (IOException | JSONException e3) {
                c8u.A06().A3Q(e3);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                        c8u.A06().A3Q(e4);
                        A06.clear();
                        A05.clear();
                        return false;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A06.clear();
                A05.clear();
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x017e, code lost:
        r5 = r17.openFileInput(r3);
        r4 = r17.openFileOutput(r11, 0);
        r2 = new byte[1024];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018b, code lost:
        r1 = r5.read(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018f, code lost:
        if (r1 <= 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0191, code lost:
        r4.write(r2, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0196, code lost:
        r5.close();
        r7.close();
        A0A(r17, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025c A[Catch: IOException -> 0x0274, all -> 0x02dc, TryCatch #3 {IOException -> 0x0274, blocks: (B:111:0x0257, B:113:0x025c, B:115:0x0261, B:117:0x0266, B:119:0x026b, B:121:0x0270), top: B:156:0x0257, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0261 A[Catch: IOException -> 0x0274, all -> 0x02dc, TryCatch #3 {IOException -> 0x0274, blocks: (B:111:0x0257, B:113:0x025c, B:115:0x0261, B:117:0x0266, B:119:0x026b, B:121:0x0270), top: B:156:0x0257, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0266 A[Catch: IOException -> 0x0274, all -> 0x02dc, TryCatch #3 {IOException -> 0x0274, blocks: (B:111:0x0257, B:113:0x025c, B:115:0x0261, B:117:0x0266, B:119:0x026b, B:121:0x0270), top: B:156:0x0257, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026b A[Catch: IOException -> 0x0274, all -> 0x02dc, TryCatch #3 {IOException -> 0x0274, blocks: (B:111:0x0257, B:113:0x025c, B:115:0x0261, B:117:0x0266, B:119:0x026b, B:121:0x0270), top: B:156:0x0257, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0270 A[Catch: IOException -> 0x0274, all -> 0x02dc, TRY_LEAVE, TryCatch #3 {IOException -> 0x0274, blocks: (B:111:0x0257, B:113:0x025c, B:115:0x0261, B:117:0x0266, B:119:0x026b, B:121:0x0270), top: B:156:0x0257, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b1 A[Catch: IOException -> 0x02c9, all -> 0x02dc, TryCatch #7 {IOException -> 0x02c9, blocks: (B:134:0x02ac, B:136:0x02b1, B:138:0x02b6, B:140:0x02bb, B:142:0x02c0, B:144:0x02c5), top: B:158:0x02ac, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b6 A[Catch: IOException -> 0x02c9, all -> 0x02dc, TryCatch #7 {IOException -> 0x02c9, blocks: (B:134:0x02ac, B:136:0x02b1, B:138:0x02b6, B:140:0x02bb, B:142:0x02c0, B:144:0x02c5), top: B:158:0x02ac, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02bb A[Catch: IOException -> 0x02c9, all -> 0x02dc, TryCatch #7 {IOException -> 0x02c9, blocks: (B:134:0x02ac, B:136:0x02b1, B:138:0x02b6, B:140:0x02bb, B:142:0x02c0, B:144:0x02c5), top: B:158:0x02ac, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c0 A[Catch: IOException -> 0x02c9, all -> 0x02dc, TryCatch #7 {IOException -> 0x02c9, blocks: (B:134:0x02ac, B:136:0x02b1, B:138:0x02b6, B:140:0x02bb, B:142:0x02c0, B:144:0x02c5), top: B:158:0x02ac, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c5 A[Catch: IOException -> 0x02c9, all -> 0x02dc, TRY_LEAVE, TryCatch #7 {IOException -> 0x02c9, blocks: (B:134:0x02ac, B:136:0x02b1, B:138:0x02b6, B:140:0x02bb, B:142:0x02c0, B:144:0x02c5), top: B:158:0x02ac, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0257 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0H(com.facebook.ads.redexgen.X.C8U r17) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass91.A0H(com.facebook.ads.redexgen.X.8U):boolean");
    }

    public static boolean A0I(String str) {
        return A06.contains(str) || A05.containsKey(str);
    }
}
