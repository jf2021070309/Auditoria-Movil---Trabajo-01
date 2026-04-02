package com.facebook.unity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
/* loaded from: classes.dex */
public abstract class BaseActivity extends Activity {
    public static final String ACTIVITY_PARAMS = "activity_params";
    protected CallbackManager mCallbackManager;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mCallbackManager = CallbackManager.Factory.create();
        if (FacebookSdk.isInitialized()) {
            return;
        }
        FacebookSdk.sdkInitialize(getApplicationContext());
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.mCallbackManager.onActivityResult(i, i2, intent);
        finish();
    }
}
