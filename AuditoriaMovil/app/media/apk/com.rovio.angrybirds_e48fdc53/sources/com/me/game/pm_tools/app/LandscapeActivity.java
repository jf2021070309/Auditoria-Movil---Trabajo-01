package com.me.game.pm_tools.app;

import android.app.Activity;
import android.os.Bundle;
import com.me.game.pm_tools.j;
/* loaded from: classes5.dex */
public class LandscapeActivity extends Activity {
    private j a;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        j jVar = this.a;
        if (jVar != null) {
            jVar.dismiss();
        }
    }
}
