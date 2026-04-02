package com.unity3d.ads.misc;

import android.os.Handler;
import android.os.Looper;
import com.facebook.appevents.AppEventsConstants;
import com.flurry.android.Constants;
import com.unity3d.ads.log.DeviceLog;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class Utilities {
    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(runnable, 0L);
    }

    public static void runOnUiThread(Runnable runnable, long j) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else {
            handler.post(runnable);
        }
    }

    public static String Sha256(String str) {
        return Sha256(str.getBytes());
    }

    public static String Sha256(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, 0, bArr.length);
            return toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            DeviceLog.exception("SHA-256 algorithm not found", e);
            return null;
        }
    }

    public static String toHexString(byte[] bArr) {
        int i;
        int length = bArr.length;
        String str = "";
        int i2 = 0;
        while (i2 < length) {
            if ((bArr[i2] & Constants.UNKNOWN) <= 15) {
                str = str + AppEventsConstants.EVENT_PARAM_VALUE_NO;
            }
            i2++;
            str = str + Integer.toHexString(i);
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean writeFile(java.io.File r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
        L3:
            return r0
        L4:
            r3 = 0
            r1 = 1
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L54
            r2.<init>(r4)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L54
            byte[] r3 = r5.getBytes()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r2.write(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r2.flush()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r2 == 0) goto L1a
            r2.close()     // Catch: java.lang.Exception -> L38
        L1a:
            r0 = r1
        L1b:
            if (r0 == 0) goto L3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrote file: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.unity3d.ads.log.DeviceLog.debug(r1)
            goto L3
        L38:
            r0 = move-exception
            java.lang.String r2 = "Error closing FileOutputStream"
            com.unity3d.ads.log.DeviceLog.exception(r2, r0)
            r0 = r1
            goto L1b
        L40:
            r1 = move-exception
            r2 = r3
        L42:
            java.lang.String r3 = "Could not write file"
            com.unity3d.ads.log.DeviceLog.exception(r3, r1)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L1b
            r2.close()     // Catch: java.lang.Exception -> L4d
            goto L1b
        L4d:
            r1 = move-exception
            java.lang.String r2 = "Error closing FileOutputStream"
            com.unity3d.ads.log.DeviceLog.exception(r2, r1)
            goto L1b
        L54:
            r0 = move-exception
            r2 = r3
        L56:
            if (r2 == 0) goto L5b
            r2.close()     // Catch: java.lang.Exception -> L5c
        L5b:
            throw r0
        L5c:
            r1 = move-exception
            java.lang.String r2 = "Error closing FileOutputStream"
            com.unity3d.ads.log.DeviceLog.exception(r2, r1)
            goto L5b
        L63:
            r0 = move-exception
            goto L56
        L65:
            r1 = move-exception
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.misc.Utilities.writeFile(java.io.File, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String readFile(java.io.File r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
        L3:
            return r0
        L4:
            java.lang.String r1 = ""
            boolean r2 = r5.exists()
            if (r2 == 0) goto L4a
            boolean r2 = r5.canRead()
            if (r2 == 0) goto L4a
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Exception -> L3a
            r2.<init>(r5)     // Catch: java.lang.Exception -> L3a
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L50
            r3.<init>(r2)     // Catch: java.lang.Exception -> L50
        L1c:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Exception -> L53
            if (r4 == 0) goto L27
            java.lang.String r1 = r1.concat(r4)     // Catch: java.lang.Exception -> L53
            goto L1c
        L27:
            r0 = r1
        L28:
            if (r3 == 0) goto L2d
            r3.close()     // Catch: java.lang.Exception -> L43
        L2d:
            if (r2 == 0) goto L3
            r2.close()     // Catch: java.lang.Exception -> L33
            goto L3
        L33:
            r1 = move-exception
            java.lang.String r2 = "Couldn't close FileReader"
            com.unity3d.ads.log.DeviceLog.exception(r2, r1)
            goto L3
        L3a:
            r1 = move-exception
            r2 = r0
            r3 = r0
        L3d:
            java.lang.String r4 = "Problem reading file"
            com.unity3d.ads.log.DeviceLog.exception(r4, r1)
            goto L28
        L43:
            r1 = move-exception
            java.lang.String r3 = "Couldn't close BufferedReader"
            com.unity3d.ads.log.DeviceLog.exception(r3, r1)
            goto L2d
        L4a:
            java.lang.String r1 = "File did not exist or couldn't be read"
            com.unity3d.ads.log.DeviceLog.error(r1)
            goto L3
        L50:
            r1 = move-exception
            r3 = r0
            goto L3d
        L53:
            r1 = move-exception
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.misc.Utilities.readFile(java.io.File):java.lang.String");
    }

    public static byte[] readFileBytes(File file) {
        if (file == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.close();
                fileInputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static JSONObject mergeJsonObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            if (jSONObject2 == null) {
                return jSONObject;
            }
            JSONObject jSONObject3 = new JSONObject();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject3.put(next, jSONObject2.get(next));
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (jSONObject3.has(next2) && (jSONObject3.get(next2) instanceof JSONObject) && (jSONObject.get(next2) instanceof JSONObject)) {
                    jSONObject3.put(next2, mergeJsonObjects(jSONObject.getJSONObject(next2), jSONObject3.getJSONObject(next2)));
                } else {
                    jSONObject3.put(next2, jSONObject.get(next2));
                }
            }
            return jSONObject3;
        }
        return jSONObject2;
    }
}
