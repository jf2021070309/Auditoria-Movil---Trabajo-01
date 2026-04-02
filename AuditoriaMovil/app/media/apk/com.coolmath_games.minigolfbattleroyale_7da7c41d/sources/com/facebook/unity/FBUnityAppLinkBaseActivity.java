package com.facebook.unity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
/* loaded from: classes.dex */
public abstract class FBUnityAppLinkBaseActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Log.v(FB.TAG, "Saving deep link from deep linking activity");
        FB.SetIntent(getIntent());
        Log.v(FB.TAG, "Returning to main activity");
        startActivity(new Intent(this, getMainActivityClass()));
        finish();
    }

    private Class<?> getMainActivityClass() {
        try {
            return Class.forName(getPackageManager().getLaunchIntentForPackage(getPackageName()).getComponent().getClassName());
        } catch (Exception unused) {
            Log.e(FB.TAG, "Unable to find Main Activity Class");
            return null;
        }
    }
}
