package com.rovio.rcs.ads;

import android.content.Intent;
import com.rovio.rcs.ads.AdsSdkConstants;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class AdsSdkBase {
    protected Listener a = null;

    /* loaded from: classes4.dex */
    interface Listener {
        void onAdError(int i, String str);

        void onAdError(AdsSdkConstants.Error error);

        void onAdHidden(boolean z);

        void onAdReady(boolean z);

        void onAdShown();

        void onAdSizeChanged(int i, int i2);

        void onClick();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(HashMap<String, String> hashMap);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Listener listener) {
        this.a = listener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onResume() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onPause() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, Intent intent) {
    }
}
