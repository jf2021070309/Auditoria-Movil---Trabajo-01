package com.kuaishou.weapon.p0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class am {
    private static final String a = "tun";
    private static final String b = "ppp";
    private static int c;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
        if (r2 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONArray a() {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = "cat /proc/net/route"
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> L72
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L72
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L72
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L72
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6e
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L6e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L6e
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L6c
            r1.<init>()     // Catch: java.lang.Throwable -> L6c
        L28:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L4f
            java.lang.String r4 = com.kuaishou.weapon.p0.bn.a(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = "tun"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L6c
            if (r5 != 0) goto L42
            java.lang.String r5 = "ppp"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L28
        L42:
            java.lang.String r5 = "\t"
            java.lang.String[] r4 = r4.split(r5)     // Catch: java.lang.Throwable -> L6c
            r5 = 0
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L6c
            r1.add(r4)     // Catch: java.lang.Throwable -> L6c
            goto L28
        L4f:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6c
        L53:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L61
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L6c
            r0.put(r4)     // Catch: java.lang.Throwable -> L6c
            goto L53
        L61:
            r3.close()     // Catch: java.io.IOException -> L65
            goto L66
        L65:
            r1 = move-exception
        L66:
            r2.close()     // Catch: java.io.IOException -> L6a
            goto L7e
        L6a:
            r1 = move-exception
            goto L7e
        L6c:
            r1 = move-exception
            goto L70
        L6e:
            r2 = move-exception
            r2 = r1
        L70:
            r1 = r3
            goto L74
        L72:
            r2 = move-exception
            r2 = r1
        L74:
            if (r1 == 0) goto L7b
            r1.close()     // Catch: java.io.IOException -> L7a
            goto L7b
        L7a:
            r1 = move-exception
        L7b:
            if (r2 == 0) goto L7e
            goto L66
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.am.a():org.json.JSONArray");
    }

    public static boolean a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                return networkCapabilities != null && networkCapabilities.hasTransport(4);
            }
            return connectivityManager.getNetworkInfo(17).isConnectedOrConnecting();
        } catch (Throwable th) {
            return false;
        }
    }

    public static String b() {
        String property = System.getProperty("http.proxyHost");
        return TextUtils.isEmpty(property) ? "" : property;
    }

    public static String b(Context context) {
        try {
            JSONArray a2 = a();
            return a2 != null ? a2.toString() : a(context) ? "[\"con\"]" : "";
        } catch (Throwable th) {
            return "";
        }
    }

    public static int c() {
        return c;
    }

    public static String d() {
        StringBuilder sb = new StringBuilder();
        try {
            c = 0;
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            if (keyStore != null) {
                keyStore.load(null, null);
                Enumeration<String> aliases = keyStore.aliases();
                while (aliases.hasMoreElements()) {
                    c++;
                    X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(aliases.nextElement());
                    if (x509Certificate.getIssuerDN().getName().contains("2022") || x509Certificate.getIssuerDN().getName().contains("2023") || x509Certificate.getIssuerDN().getName().contains("HttpCanary") || x509Certificate.getIssuerDN().getName().contains("macbook") || x509Certificate.getIssuerDN().getName().contains("proxy") || x509Certificate.getIssuerDN().getName().contains("Proxy") || x509Certificate.getIssuerDN().getName().contains(ImagesContract.LOCAL) || x509Certificate.getIssuerDN().getName().contains("github")) {
                        sb.append(x509Certificate.getIssuerDN().getName());
                        sb.append("|");
                    }
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        } catch (Throwable th) {
        }
        return sb.toString();
    }
}
