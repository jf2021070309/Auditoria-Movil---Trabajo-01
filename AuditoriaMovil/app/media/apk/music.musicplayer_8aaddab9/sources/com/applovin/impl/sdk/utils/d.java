package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.applovin.impl.sdk.v;
/* loaded from: classes.dex */
public class d {
    private static d a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f4296b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f4297c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4298d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4299e;

    private d(Context context) {
        boolean z;
        Bundle bundle = null;
        try {
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e2) {
                v.c("AndroidManifest", "Failed to get meta data.", e2);
            }
            int i2 = 0;
            try {
                XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
                int eventType = openXmlResourceParser.getEventType();
                int i3 = 0;
                z = false;
                do {
                    if (2 == eventType) {
                        try {
                            if (openXmlResourceParser.getName().equals("application")) {
                                for (int i4 = 0; i4 < openXmlResourceParser.getAttributeCount(); i4++) {
                                    String attributeName = openXmlResourceParser.getAttributeName(i4);
                                    String attributeValue = openXmlResourceParser.getAttributeValue(i4);
                                    if (attributeName.equals("networkSecurityConfig")) {
                                        i3 = Integer.valueOf(attributeValue.substring(1)).intValue();
                                    } else if (attributeName.equals("usesCleartextTraffic")) {
                                        z = Boolean.valueOf(attributeValue).booleanValue();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            i2 = i3;
                            try {
                                v.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                                this.f4298d = i2;
                                this.f4299e = z;
                            } catch (Throwable th2) {
                                this.f4298d = i2;
                                this.f4299e = z;
                                throw th2;
                            }
                        }
                    }
                    eventType = openXmlResourceParser.next();
                } while (eventType != 1);
                this.f4298d = i3;
            } catch (Throwable th3) {
                th = th3;
                z = false;
            }
            this.f4299e = z;
        } finally {
            this.f4297c = bundle;
        }
    }

    public static d a(Context context) {
        d dVar;
        synchronized (f4296b) {
            if (a == null) {
                a = new d(context);
            }
            dVar = a;
        }
        return dVar;
    }

    public String a(String str, String str2) {
        Bundle bundle = this.f4297c;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public boolean a() {
        return this.f4298d != 0;
    }

    public boolean a(String str) {
        Bundle bundle = this.f4297c;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z) {
        Bundle bundle = this.f4297c;
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }
}
