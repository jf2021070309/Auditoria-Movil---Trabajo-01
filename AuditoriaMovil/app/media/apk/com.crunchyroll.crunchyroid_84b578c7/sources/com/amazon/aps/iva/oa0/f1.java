package com.amazon.aps.iva.oa0;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.google.common.primitives.UnsignedBytes;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Hex;
/* compiled from: Utils.java */
/* loaded from: classes4.dex */
public final class f1 {
    public static double a;
    public static int b;
    public static String c;

    static {
        new com.amazon.aps.iva.b30.j(f1.class.getSimpleName());
        c = null;
    }

    public static String a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (!h(uri) && uri.getHost() != null && !uri.getHost().endsWith("sng.link")) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("_android_dl");
        if (queryParameter != null) {
            return queryParameter;
        }
        return uri.getQueryParameter("_dl");
    }

    public static String b(Throwable th) {
        StringBuilder sb = new StringBuilder("Exception: \n");
        sb.append(th.getMessage());
        sb.append("\nStack trace: \n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        return sb.toString();
    }

    public static String c(Context context) {
        boolean z;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "wwan";
        }
        NetworkInfo activeNetworkInfo2 = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo2 != null && activeNetworkInfo2.isConnected()) {
            activeNetworkInfo2.getType();
        }
        return "wifi";
    }

    public static long d(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref-event-index", 0);
        long j = sharedPreferences.getLong("event-index", -1L) + 1;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("event-index", j);
        edit.commit();
        return j;
    }

    public static HashSet e() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        hashSet.add("0000-0000");
        return hashSet;
    }

    public static UUID f(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref-singular-id", 0);
        String string = sharedPreferences.getString("singular-id", null);
        if (string != null) {
            return UUID.fromString(string);
        }
        UUID randomUUID = UUID.randomUUID();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("singular-id", randomUUID.toString());
        edit.commit();
        return randomUUID;
    }

    public static void g(com.amazon.aps.iva.na0.c cVar) {
        com.amazon.aps.iva.b6.d dVar = u0.p.d.h;
        if (cVar.a != null && dVar != null) {
            com.amazon.aps.iva.ln.b bVar = (com.amazon.aps.iva.ln.b) dVar.c;
            com.amazon.aps.iva.xb0.a aVar = (com.amazon.aps.iva.xb0.a) dVar.d;
            com.amazon.aps.iva.yb0.j.f(bVar, "this$0");
            com.amazon.aps.iva.yb0.j.f(aVar, "$onComplete");
            bVar.d.post(new com.amazon.aps.iva.a6.b1(bVar, 3, cVar, aVar));
        }
    }

    public static boolean h(Uri uri) {
        u0 u0Var;
        com.amazon.aps.iva.na0.b bVar;
        ArrayList arrayList;
        if (uri != null && (u0Var = u0.p) != null && (bVar = u0Var.d) != null && (arrayList = bVar.k) != null && arrayList.size() != 0) {
            if (uri.getScheme() == null) {
                uri = Uri.parse("https://" + uri.toString());
            }
            Iterator it = u0.p.d.k.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (uri.getHost() != null && uri.getHost().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(String str) {
        if (str != null && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean j(String str) {
        if (i(str)) {
            return false;
        }
        Matcher matcher = Pattern.compile("^[0-]+$").matcher(str);
        if (!e().contains(str) && !matcher.matches()) {
            return false;
        }
        return true;
    }

    public static double k(long j) {
        return (System.currentTimeMillis() - j) * 0.001d;
    }

    public static String l(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str2.getBytes(Hex.DEFAULT_CHARSET_NAME));
            messageDigest.update(str.getBytes(Hex.DEFAULT_CHARSET_NAME));
            byte[] digest = messageDigest.digest();
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[digest.length * 2];
            for (int i = 0; i < digest.length; i++) {
                int i2 = digest[i] & UnsignedBytes.MAX_VALUE;
                int i3 = i * 2;
                cArr2[i3] = cArr[i2 >>> 4];
                cArr2[i3 + 1] = cArr[i2 & 15];
            }
            return new String(cArr2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
