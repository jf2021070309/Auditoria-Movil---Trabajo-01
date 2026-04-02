package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.sdk.utils.Logger;
/* loaded from: classes2.dex */
public class InterstitialActivity extends ControllerActivity {
    private static final String a = InterstitialActivity.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(a, "onCreate");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(a, "onPause");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(a, "onResume");
    }
}
