package com.saraphines.game;

import android.os.Bundle;
import com.rovio.fusion.App;
import com.sdk.ksdk.KSDK;
import com.sdk.ksdk.util.AllAdConfig;
import com.sdk.ksdk.util.GroAdConfig;
/* loaded from: classes4.dex */
public class MyActivity extends App {
    public void initAd() {
        String[] tt_ids = {"102465671"};
        GroAdConfig ga = new GroAdConfig("5435272", tt_ids, "102465670");
        AllAdConfig all = new AllAdConfig(ga);
        all.setLooperTime(75);
        KSDK.getInstance().setDebug(true);
        KSDK.getInstance().init(this, all, "634f7ff088ccdf4b7e4d5765");
    }

    @Override // com.rovio.fusion.App, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initAd();
    }

    @Override // com.rovio.fusion.App, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        KSDK.getInstance().onPause();
    }

    @Override // com.rovio.fusion.App, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        KSDK.getInstance().onResume();
    }
}
