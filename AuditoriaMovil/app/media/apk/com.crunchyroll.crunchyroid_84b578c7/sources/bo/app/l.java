package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import com.braze.location.IBrazeGeofenceApi;
import java.util.List;
/* loaded from: classes.dex */
public final class l {
    private IBrazeGeofenceApi a;

    public l() {
        IBrazeGeofenceApi iBrazeGeofenceApi;
        try {
            Object newInstance = Class.forName("com.braze.location.BrazeInternalGeofenceApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            com.amazon.aps.iva.yb0.j.d(newInstance, "null cannot be cast to non-null type com.braze.location.IBrazeGeofenceApi");
            iBrazeGeofenceApi = (IBrazeGeofenceApi) newInstance;
        } catch (Exception unused) {
            iBrazeGeofenceApi = null;
        }
        this.a = iBrazeGeofenceApi;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final PendingIntent b(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        IBrazeGeofenceApi iBrazeGeofenceApi = this.a;
        if (iBrazeGeofenceApi != null) {
            return iBrazeGeofenceApi.getGeofenceTransitionPendingIntent(context);
        }
        return null;
    }

    public final void a(Context context, PendingIntent pendingIntent) {
        com.amazon.aps.iva.yb0.j.f(context, "applicationContext");
        com.amazon.aps.iva.yb0.j.f(pendingIntent, "intent");
        IBrazeGeofenceApi iBrazeGeofenceApi = this.a;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.teardownGeofences(context, pendingIntent);
        }
    }

    public final void a(Context context, List list, PendingIntent pendingIntent) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(list, "geofenceList");
        com.amazon.aps.iva.yb0.j.f(pendingIntent, "geofenceRequestIntent");
        IBrazeGeofenceApi iBrazeGeofenceApi = this.a;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.registerGeofences(context, list, pendingIntent);
        }
    }
}
