package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.applovin.impl.sdk.r;
/* loaded from: classes.dex */
public class c {
    private static c a;
    private static final Object b = new Object();
    private final Bundle c;
    private final int d;

    private c(Context context) {
        Bundle bundle = null;
        try {
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } finally {
                this.c = bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            r.c("AndroidManifest", "Failed to get meta data.", e);
        }
        int i = 0;
        try {
            XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = openXmlResourceParser.getEventType();
            int i2 = 0;
            do {
                if (2 == eventType) {
                    try {
                        if (openXmlResourceParser.getName().equals("application")) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= openXmlResourceParser.getAttributeCount()) {
                                    break;
                                }
                                String attributeName = openXmlResourceParser.getAttributeName(i3);
                                String attributeValue = openXmlResourceParser.getAttributeValue(i3);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    i2 = Integer.valueOf(attributeValue.substring(1)).intValue();
                                    break;
                                }
                                i3++;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        i = i2;
                        try {
                            r.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            return;
                        } finally {
                            this.d = i;
                        }
                    }
                }
                eventType = openXmlResourceParser.next();
            } while (eventType != 1);
            this.d = i2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static c a(Context context) {
        c cVar;
        synchronized (b) {
            if (a == null) {
                a = new c(context);
            }
            cVar = a;
        }
        return cVar;
    }

    public String a(String str, String str2) {
        Bundle bundle = this.c;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public boolean a() {
        return this.d != 0;
    }

    public boolean a(String str) {
        Bundle bundle = this.c;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z) {
        Bundle bundle = this.c;
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }
}
