package com.flurry.sdk;

import android.text.TextUtils;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class jl {
    public static String a = jl.class.getName();

    public static String a(String str) {
        String str2 = "a=" + ka.a().d;
        if (!TextUtils.isEmpty(str)) {
            return String.format("%s&%s", str2, "cid=" + b(str));
        }
        return str2;
    }

    private static String b(String str) {
        byte[] bArr;
        if (str == null || str.trim().length() <= 0) {
            bArr = null;
        } else {
            try {
                bArr = ma.e(str);
                if (bArr != null && bArr.length == 20) {
                    try {
                        ko.a(5, a, "syndication hashedId is:" + new String(bArr));
                    } catch (Exception e) {
                        ko.a(6, a, "Exception in getHashedSyndicationIdString()");
                        return ma.a(bArr);
                    }
                } else {
                    ko.a(6, a, "sha1 is not 20 bytes long: " + Arrays.toString(bArr));
                    bArr = null;
                }
            } catch (Exception e2) {
                bArr = null;
            }
        }
        return ma.a(bArr);
    }
}
