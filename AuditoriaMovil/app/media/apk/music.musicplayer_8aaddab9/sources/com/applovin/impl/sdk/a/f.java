package com.applovin.impl.sdk.a;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* loaded from: classes.dex */
public class f {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3808b;

    /* renamed from: c  reason: collision with root package name */
    private String f3809c;

    public f(m mVar) {
        this.a = mVar;
        this.f3808b = mVar.L();
    }

    public String a(String str) {
        try {
            return ScriptInjector.injectScriptContentIntoHtml(this.f3809c, str);
        } catch (Throwable th) {
            this.a.B().b("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            return str;
        }
    }

    public void a() {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.av)).booleanValue()) {
            v B = this.a.B();
            StringBuilder y = e.a.d.a.a.y("Initializing Open Measurement SDK v");
            y.append(c());
            y.append("...");
            B.b("OpenMeasurementService", y.toString());
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.f.1
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    Omid.activate(f.this.f3808b);
                    v B2 = f.this.a.B();
                    StringBuilder y2 = e.a.d.a.a.y("Init ");
                    y2.append(f.this.b() ? "succeeded" : "failed");
                    y2.append(" and took ");
                    y2.append(System.currentTimeMillis() - currentTimeMillis);
                    y2.append("ms");
                    B2.b("OpenMeasurementService", y2.toString());
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f.this.f3808b.getResources().openRawResource(R.raw.omsdk_v_1_0)));
                        try {
                            try {
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    sb.append(readLine);
                                }
                                f.this.f3809c = sb.toString();
                            } finally {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                }
                            }
                            bufferedReader.close();
                        } catch (IOException e2) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
                        }
                    } catch (Throwable th2) {
                        f.this.a.B().b("OpenMeasurementService", "Failed to retrieve resource omskd_v_1_0.js", th2);
                    }
                }
            });
        }
    }

    public boolean b() {
        return Omid.isActive();
    }

    public String c() {
        return Omid.getVersion();
    }

    public Partner d() {
        return Partner.createPartner((String) this.a.a(com.applovin.impl.sdk.c.b.aw), AppLovinSdk.VERSION);
    }

    public String e() {
        return this.f3809c;
    }
}
