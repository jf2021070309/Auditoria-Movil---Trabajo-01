package com.flurry.sdk;

import android.location.Location;
import bolts.MeasurementEvent;
import java.util.Map;
/* loaded from: classes2.dex */
public class im extends kt {
    private static final String a = im.class.getSimpleName();

    public final String a(String str, Map<String, String> map) {
        String replace;
        Location g;
        Location g2;
        String a2 = a(str);
        while (a2 != null) {
            if (a("timestamp_epoch_millis", a2)) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                ko.a(3, a, "Replacing param timestamp_epoch_millis with: " + valueOf);
                replace = str.replace(a2, ma.c(valueOf));
            } else if (a("session_duration_millis", a2)) {
                jm.a();
                String l = Long.toString(jm.f());
                ko.a(3, a, "Replacing param session_duration_millis with: " + l);
                replace = str.replace(a2, ma.c(l));
            } else if (a("fg_timespent_millis", a2)) {
                jm.a();
                String l2 = Long.toString(jm.f());
                ko.a(3, a, "Replacing param fg_timespent_millis with: " + l2);
                replace = str.replace(a2, ma.c(l2));
            } else if (a("install_referrer", a2)) {
                String b = new ht().b();
                if (b == null) {
                    b = "";
                }
                ko.a(3, a, "Replacing param install_referrer with: " + b);
                replace = str.replace(a2, ma.c(b));
            } else if (a("geo_latitude", a2)) {
                String str2 = "";
                if (jr.a().g() != null) {
                    str2 = "" + ma.a(g2.getLatitude(), jr.d());
                }
                ko.a(3, a, "Replacing param geo_latitude with: " + str2);
                replace = str.replace(a2, ma.c(str2));
            } else if (a("geo_longitude", a2)) {
                String str3 = "";
                if (jr.a().g() != null) {
                    str3 = "" + ma.a(g.getLongitude(), jr.d());
                }
                ko.a(3, a, "Replacing param geo_longitude with: " + str3);
                replace = str.replace(a2, ma.c(str3));
            } else if (a("publisher_user_id", a2)) {
                String str4 = (String) lr.a().a("UserId");
                ko.a(3, a, "Replacing param publisher_user_id with: " + str4);
                replace = str.replace(a2, ma.c(str4));
            } else if (a(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, a2)) {
                if (map.containsKey(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY)) {
                    ko.a(3, a, "Replacing param event_name with: " + map.get(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY));
                    replace = str.replace(a2, ma.c(map.get(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY)));
                } else {
                    ko.a(3, a, "Replacing param event_name with empty string");
                    replace = str.replace(a2, "");
                }
            } else if (a("event_time_millis", a2)) {
                if (map.containsKey("event_time_millis")) {
                    ko.a(3, a, "Replacing param event_time_millis with: " + map.get("event_time_millis"));
                    replace = str.replace(a2, ma.c(map.get("event_time_millis")));
                } else {
                    ko.a(3, a, "Replacing param event_time_millis with empty string");
                    replace = str.replace(a2, "");
                }
            } else {
                ko.a(3, a, "Unknown param: " + a2);
                replace = str.replace(a2, "");
            }
            a2 = a(replace);
            str = replace;
        }
        return str;
    }
}
