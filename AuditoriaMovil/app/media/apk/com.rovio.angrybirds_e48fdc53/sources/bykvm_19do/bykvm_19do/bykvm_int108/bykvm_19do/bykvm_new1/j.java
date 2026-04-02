package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
/* loaded from: classes.dex */
public final class j {
    private SharedPreferences a;

    public j(Context context) {
        this.a = context.getSharedPreferences("npth", 0);
    }

    public String a() {
        String c = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.i.e().c();
        return (TextUtils.isEmpty(c) || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(c)) ? this.a.getString("device_id", AppEventsConstants.EVENT_PARAM_VALUE_NO) : c;
    }

    public void a(String str) {
        this.a.edit().putString("device_id", str).apply();
    }
}
