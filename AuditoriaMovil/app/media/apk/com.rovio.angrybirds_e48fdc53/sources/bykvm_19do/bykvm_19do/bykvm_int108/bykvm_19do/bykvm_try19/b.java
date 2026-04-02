package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_try19;

import android.os.Handler;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.j;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.i;
import com.facebook.appevents.AppEventsConstants;
/* loaded from: classes.dex */
public class b extends a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Handler handler, long j, long j2) {
        super(handler, j, j2);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String c = i.e().c();
        if (TextUtils.isEmpty(c) || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(c)) {
            a(c());
            str = "[DeviceIdTask] did is null, continue check.";
        } else {
            i.j().a(c);
            str = "[DeviceIdTask] did is " + c;
        }
        j.a(str);
    }
}
