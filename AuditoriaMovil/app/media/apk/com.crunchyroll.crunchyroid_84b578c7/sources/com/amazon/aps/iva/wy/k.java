package com.amazon.aps.iva.wy;

import android.content.Intent;
import android.content.res.Configuration;
/* compiled from: Presenter.kt */
/* loaded from: classes2.dex */
public interface k {
    void onActivityResult(int i, int i2, Intent intent);

    void onConfigurationChanged(Configuration configuration);

    void onCreate();

    void onDestroy();

    void onNewIntent(Intent intent);

    void onPause();

    void onPreDestroy();

    void onResume();

    void onStart();

    void onStop();
}
