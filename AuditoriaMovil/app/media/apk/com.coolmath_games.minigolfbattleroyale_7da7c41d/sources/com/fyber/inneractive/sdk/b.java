package com.fyber.inneractive.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.fyber.inneractive.sdk.c.c;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
/* loaded from: classes.dex */
public class b {
    public static int a(Context context, Intent intent) {
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null");
        }
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null) {
            return 0;
        }
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            String str = resolveInfo.activityInfo.name;
            try {
                ((BroadcastReceiver) Class.forName(str).newInstance()).onReceive(context, intent);
            } catch (ClassNotFoundException unused) {
                IAlog.d("%sCould not find receiver for %s", IAlog.a((Class<?>) b.class), str);
            } catch (Exception unused2) {
                IAlog.d("%sError instantiating or executing registration for kit %s", IAlog.a((Class<?>) b.class), str);
            }
        }
        if (c.a.a.a.size() == 0) {
            Log.e("Inneractive_error", "Critical error raised while initializing SDK - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
        }
        return queryBroadcastReceivers.size();
    }
}
