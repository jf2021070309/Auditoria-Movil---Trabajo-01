package com.kuaishou.weapon.p0;

import android.content.Context;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Build;
import android.provider.Settings;
import com.facebook.places.model.PlaceFields;
/* loaded from: classes.dex */
public class al {
    public static boolean a(Context context) {
        try {
            if (Build.VERSION.SDK_INT > 22) {
                try {
                    LocationManager locationManager = (LocationManager) context.getSystemService(PlaceFields.LOCATION);
                    LocationProvider provider = locationManager.getProvider("gps");
                    if (provider != null) {
                        locationManager.addTestProvider(provider.getName(), provider.requiresNetwork(), provider.requiresSatellite(), provider.requiresCell(), provider.hasMonetaryCost(), provider.supportsAltitude(), provider.supportsSpeed(), provider.supportsBearing(), provider.getPowerRequirement(), provider.getAccuracy());
                    } else {
                        locationManager.addTestProvider("gps", true, true, false, false, true, true, true, 3, 1);
                    }
                    locationManager.setTestProviderEnabled("gps", true);
                    locationManager.setTestProviderStatus("gps", 2, null, System.currentTimeMillis());
                } catch (SecurityException e) {
                    return false;
                }
            } else if (Settings.Secure.getInt(context.getContentResolver(), "mock_location", 0) == 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            return false;
        }
    }
}
