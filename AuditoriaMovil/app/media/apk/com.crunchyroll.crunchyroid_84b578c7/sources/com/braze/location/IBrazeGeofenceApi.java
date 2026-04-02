package com.braze.location;

import android.app.PendingIntent;
import android.content.Context;
import com.braze.models.BrazeGeofence;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H&J&\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/braze/location/IBrazeGeofenceApi;", "", "Landroid/content/Context;", "context", "Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent", "applicationContext", "intent", "Lcom/amazon/aps/iva/kb0/q;", "teardownGeofences", "", "Lcom/braze/models/BrazeGeofence;", "geofenceList", "geofenceRequestIntent", "registerGeofences", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IBrazeGeofenceApi {
    PendingIntent getGeofenceTransitionPendingIntent(Context context);

    void registerGeofences(Context context, List<BrazeGeofence> list, PendingIntent pendingIntent);

    void teardownGeofences(Context context, PendingIntent pendingIntent);
}
