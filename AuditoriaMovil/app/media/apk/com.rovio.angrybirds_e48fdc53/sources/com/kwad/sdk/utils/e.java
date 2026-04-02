package com.kwad.sdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.flurry.android.Constants;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes3.dex */
public final class e {
    private static HashMap<String, ArrayList<String>> aHR = new HashMap<>();
    private static String aHS;

    private static ArrayList<String> H(Context context, String str) {
        String packageName;
        Signature[] I;
        if (context == null || (packageName = context.getPackageName()) == null) {
            return null;
        }
        if (aHR.get(str) != null) {
            return aHR.get(str);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            for (Signature signature : I(context, packageName)) {
                String str2 = "error!";
                if ("MD5".equals(str)) {
                    str2 = a(signature, "MD5");
                } else if ("SHA1".equals(str)) {
                    str2 = a(signature, "SHA1");
                } else if ("SHA256".equals(str)) {
                    str2 = a(signature, "SHA256");
                }
                arrayList.add(str2);
            }
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.e("AppSigningUtil", "签名信息列表获取失败 " + e.getMessage());
        }
        aHR.put(str, arrayList);
        return arrayList;
    }

    private static Signature[] I(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.signatures;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.e("AppSigningUtil", e.getMessage());
            return null;
        }
    }

    private static String a(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] digest = messageDigest.digest(byteArray);
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    sb.append(Integer.toHexString((b & Constants.UNKNOWN) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                return sb.substring(0, sb.length() - 1);
            }
            return "error!";
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.e("AppSigningUtil", e.getMessage());
            return "error!";
        }
    }

    public static String bI(Context context) {
        if (TextUtils.isEmpty(aHS)) {
            ArrayList<String> H = H(context, "SHA1");
            if (H != null && H.size() != 0) {
                aHS = H.get(0);
            }
            return aHS;
        }
        return aHS;
    }
}
