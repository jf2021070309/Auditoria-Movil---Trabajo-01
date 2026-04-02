package com.ss.android.downloadlib.activity;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.q.o;
import com.ss.android.downloadlib.rb.xu;
/* loaded from: classes3.dex */
public class JumpKllkActivity extends TTDelegateActivity {
    @Override // com.ss.android.downloadlib.activity.TTDelegateActivity
    protected void dr() {
        if (getIntent() == null) {
            o.dr().dr("handleIntent is null");
            com.ss.android.socialbase.appdownloader.o.dr((Activity) this);
        }
        String stringExtra = getIntent().getStringExtra("p");
        long longExtra = getIntent().getLongExtra("id", 0L);
        if (TextUtils.isEmpty(stringExtra) || longExtra == 0) {
            o.dr().dr("getPackage or id is null");
            com.ss.android.socialbase.appdownloader.o.dr((Activity) this);
        }
        int optInt = wb.ll().optInt("ab", 0);
        xu.dr(this, stringExtra, longExtra, optInt == 1);
        if (optInt != 1) {
            com.ss.android.socialbase.appdownloader.o.dr((Activity) this);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.ss.android.socialbase.appdownloader.o.dr((Activity) this);
    }
}
