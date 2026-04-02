package com.kuaishou.weapon.p0;

import android.location.Location;
import android.net.wifi.WifiInfo;
import android.telephony.TelephonyManager;
import com.facebook.appevents.AppEventsConstants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class cr {
    private cs a = new cs();

    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            cs csVar = new cs();
            int a = csVar.a(TelephonyManager.class, "getDeviceId", new Object[0]);
            if (a > 0) {
                jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, a);
            }
            int a2 = csVar.a(TelephonyManager.class, "getSubscriberId", new Object[0]);
            if (a2 > 0) {
                jSONObject.put("1", a2);
            }
            int a3 = csVar.a(TelephonyManager.class, "getSimSerialNumber", new Object[0]);
            if (a3 > 0) {
                jSONObject.put("2", a3);
            }
            int a4 = csVar.a(Location.class, "getLatitude", new Object[0]);
            if (a4 > 0) {
                jSONObject.put("3", a4);
            }
            int a5 = csVar.a(Location.class, "getLongitude", new Object[0]);
            if (a5 > 0) {
                jSONObject.put("4", a5);
            }
            int a6 = csVar.a(WifiInfo.class, "getMacAddress", new Object[0]);
            if (a6 > 0) {
                jSONObject.put("6", a6);
            }
            int a7 = csVar.a(WifiInfo.class, "getBSSID", new Object[0]);
            if (a7 > 0) {
                jSONObject.put("7", a7);
            }
            int a8 = csVar.a(WifiInfo.class, "getRssi", new Object[0]);
            if (a8 > 0) {
                jSONObject.put("8", a8);
            }
            int a9 = csVar.a(JSONObject.class, "toString", new Object[0]);
            if (a9 > 0) {
                jSONObject.put("9", a9);
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            int a = this.a.a();
            if (a <= 0) {
                return null;
            }
            int a2 = this.a.a(a, TelephonyManager.class, "getDeviceId", new Object[0]);
            if (a2 > 0) {
                jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, a2);
            }
            int a3 = this.a.a(a, TelephonyManager.class, "getSubscriberId", new Object[0]);
            if (a3 > 0) {
                jSONObject.put("1", a3);
            }
            int a4 = this.a.a(a, TelephonyManager.class, "getSimSerialNumber", new Object[0]);
            if (a4 > 0) {
                jSONObject.put("2", a4);
            }
            int a5 = this.a.a(a, Location.class, "getLatitude", new Object[0]);
            if (a5 > 0) {
                jSONObject.put("3", a5);
            }
            int a6 = this.a.a(a, Location.class, "getLongitude", new Object[0]);
            if (a6 > 0) {
                jSONObject.put("4", a6);
            }
            int a7 = this.a.a(a, WifiInfo.class, "getMacAddress", new Object[0]);
            if (a7 > 0) {
                jSONObject.put("6", a7);
            }
            int a8 = this.a.a(a, WifiInfo.class, "getBSSID", new Object[0]);
            if (a8 > 0) {
                jSONObject.put("7", a8);
            }
            int a9 = this.a.a(a, WifiInfo.class, "getRssi", new Object[0]);
            if (a9 > 0) {
                jSONObject.put("8", a9);
            }
            int a10 = this.a.a(a, JSONObject.class, "toString", new Object[0]);
            if (a10 > 0) {
                jSONObject.put("9", a10);
            }
            return jSONObject;
        } catch (Exception e) {
            return null;
        }
    }
}
