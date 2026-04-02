package com.rovio.fusion;

import android.content.Intent;
/* loaded from: classes2.dex */
public interface IActivityListener {
    void onActivityResult(int i, int i2, Intent intent);

    void onDestroy();

    void onNewIntent(Intent intent);

    void onPause();

    void onResume();
}
