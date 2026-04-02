package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.location.Location;
import com.fyber.inneractive.sdk.util.h;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
/* loaded from: classes.dex */
public final class h {
    private static boolean a;
    private static Boolean b;

    /* loaded from: classes.dex */
    public interface a {
        void a(Location location);
    }

    public static void a(Context context, final a aVar) {
        if (b == null) {
            try {
                a = (Class.forName("com.google.android.gms.common.GoogleApiAvailability") == null || Class.forName("com.google.android.gms.location.LocationServices") == null) ? false : true;
            } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError unused) {
            }
            if (a) {
                b = Boolean.valueOf(g.a(context));
            } else {
                b = Boolean.FALSE;
            }
        }
        if (b.booleanValue()) {
            if (l.d("android.permission.ACCESS_FINE_LOCATION") || l.d("android.permission.ACCESS_COARSE_LOCATION")) {
                try {
                    LocationServices.getFusedLocationProviderClient(context).getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() { // from class: com.fyber.inneractive.sdk.util.f.1
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final /* synthetic */ void onSuccess(Location location) {
                            Location location2 = location;
                            h.a aVar2 = h.a.this;
                            if (aVar2 != null) {
                                aVar2.a(location2);
                            }
                        }
                    });
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
