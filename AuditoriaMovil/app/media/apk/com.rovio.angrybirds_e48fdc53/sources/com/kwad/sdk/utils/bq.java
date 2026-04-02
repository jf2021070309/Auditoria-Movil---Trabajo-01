package com.kwad.sdk.utils;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.kwad.sdk.service.ServiceProvider;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class bq {
    private static boolean aKG = false;
    private static final List<a> aKH = new ArrayList();

    /* loaded from: classes3.dex */
    public static class a implements com.kwad.sdk.core.b {
        public String aKI;
        public String aKJ;
        public int level;

        @Override // com.kwad.sdk.core.b
        public final void parseJson(JSONObject jSONObject) {
        }

        @Override // com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            t.putValue(jSONObject, "level", this.level);
            t.putValue(jSONObject, "ssid", this.aKI);
            t.putValue(jSONObject, "bssid", this.aKJ);
            return jSONObject;
        }
    }

    /* renamed from: do  reason: not valid java name */
    public static boolean m22do(Context context) {
        return (context.getApplicationInfo().targetSdkVersion < 29 || Build.VERSION.SDK_INT < 29) ? Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.g) == -1 && ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.h) == -1 : ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.g) == -1;
    }

    public static List<a> m(Context context, int i) {
        WifiManager wifiManager;
        if (at.Jd()) {
            return new ArrayList();
        }
        if (!aKG && ServiceProvider.HB().canReadNearbyWifiList()) {
            List<a> list = aKH;
            if (list.isEmpty() && context != null) {
                if (((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(32L)) {
                    return list;
                }
                try {
                } catch (Exception e) {
                    aKG = true;
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                }
                if (m22do(context) || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) == null) {
                    return list;
                }
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (scanResults != null) {
                    for (ScanResult scanResult : scanResults) {
                        a aVar = new a();
                        aVar.aKI = scanResult.SSID;
                        aVar.aKJ = scanResult.BSSID;
                        aVar.level = scanResult.level;
                        if (connectionInfo.getBSSID() == null || scanResult.BSSID == null || !TextUtils.equals(connectionInfo.getBSSID().replace("\"", ""), scanResult.BSSID.replace("\"", "")) || connectionInfo.getSSID() == null || scanResult.SSID == null || !TextUtils.equals(connectionInfo.getSSID().replace("\"", ""), scanResult.SSID.replace("\"", ""))) {
                            aKH.add(aVar);
                        } else {
                            aKH.add(0, aVar);
                        }
                        List<a> list2 = aKH;
                        if (list2.size() >= i) {
                            return list2;
                        }
                    }
                }
                return aKH;
            }
        }
        return aKH;
    }
}
