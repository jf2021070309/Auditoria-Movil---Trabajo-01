package com.ironsource.sdk.controller;

import com.facebook.appevents.AppEventsConstants;
import java.security.MessageDigest;
import kotlin.UByte;
/* loaded from: classes2.dex */
final class t {
    String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(String str) {
        this.a = str;
    }

    private String a(String str) {
        try {
            return com.ironsource.sdk.utils.c.a(str);
        } catch (Exception e) {
            e.printStackTrace();
            return b(str);
        }
    }

    private String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & UByte.MAX_VALUE);
                if (hexString.length() < 2) {
                    hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.a));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
