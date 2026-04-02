package com.rovio.fusion;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.CrashManager;
import net.hockeyapp.android.CrashManagerListener;
import net.hockeyapp.android.NativeCrashManager;
import net.hockeyapp.android.metrics.MetricsManager;
/* loaded from: classes2.dex */
public class HockeyAppWrapper implements IActivityListener {
    private static final String TAG = "fusion.HockeyAppWrapper";
    private static final boolean VERBOSE_LOGGING = false;

    private native void setUpBreakpad(String str);

    public HockeyAppWrapper() {
        Activity activity = Globals.getActivity();
        String c = c();
        Constants.loadFromContext(activity);
        setUpBreakpad(Constants.FILES_PATH);
        NativeCrashManager.handleDumpFiles(activity, c);
        a();
        b();
        Globals.registerActivityListener(this);
    }

    private void a() {
        CrashManager.register(Globals.getActivity(), c(), new CrashManagerListener() { // from class: com.rovio.fusion.HockeyAppWrapper.1
            @Override // net.hockeyapp.android.CrashManagerListener
            public boolean shouldAutoUploadCrashes() {
                return true;
            }
        });
    }

    private void b() {
        Activity activity = Globals.getActivity();
        MetricsManager.register(activity, activity.getApplication(), c());
    }

    private String c() {
        Activity activity = Globals.getActivity();
        Resources resources = activity.getResources();
        return resources.getString(resources.getIdentifier("hockeyAppId", "string", activity.getPackageName()));
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onResume() {
        a();
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onPause() {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onNewIntent(Intent intent) {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onDestroy() {
    }
}
