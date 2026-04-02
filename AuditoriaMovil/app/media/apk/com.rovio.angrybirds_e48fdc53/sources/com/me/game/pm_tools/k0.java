package com.me.game.pm_tools;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
/* loaded from: classes5.dex */
public class k0 {
    private static volatile k0 a;

    public static k0 b() {
        if (a == null) {
            synchronized (k0.class) {
                if (a == null) {
                    a = new k0();
                }
            }
        }
        return a;
    }

    public byte[] a(String str) {
        if (!str.endsWith(".png")) {
            str = str + ".png";
        }
        try {
            InputStream open = b.d.getResources().getAssets().open(String.format("pm_sdk/drawable/%s", str));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            w.b(open, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String c(String str) {
        try {
            return a0.e(b.d.getResources().getAssets().open(String.format("pm_sdk/language/%s.json", str)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
