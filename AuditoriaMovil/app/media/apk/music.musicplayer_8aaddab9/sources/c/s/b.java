package c.s;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;
/* loaded from: classes.dex */
public class b extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        try {
            if (a.f2503b) {
                return;
            }
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException e2) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e2);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                return;
            }
            a.c(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
        } catch (Exception e3) {
            Log.e("MultiDex", "MultiDex installation failure", e3);
            StringBuilder y = e.a.d.a.a.y("MultiDex installation failed (");
            y.append(e3.getMessage());
            y.append(").");
            throw new RuntimeException(y.toString());
        }
    }
}
