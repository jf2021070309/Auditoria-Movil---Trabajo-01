package com.braze.ui.activities;

import androidx.fragment.app.h;
import com.braze.Braze;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
/* compiled from: BrazeBaseFragmentActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/braze/ui/activities/BrazeBaseFragmentActivity;", "Landroidx/fragment/app/h;", "Lcom/amazon/aps/iva/kb0/q;", "onStart", "onResume", "onPause", "onStop", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class BrazeBaseFragmentActivity extends h {
    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        BrazeInAppMessageManager.Companion.getInstance().unregisterInAppMessageManager(this);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        BrazeInAppMessageManager.Companion.getInstance().registerInAppMessageManager(this);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onStart() {
        super.onStart();
        Braze.Companion.getInstance(this).openSession(this);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onStop() {
        super.onStop();
        Braze.Companion.getInstance(this).closeSession(this);
    }
}
