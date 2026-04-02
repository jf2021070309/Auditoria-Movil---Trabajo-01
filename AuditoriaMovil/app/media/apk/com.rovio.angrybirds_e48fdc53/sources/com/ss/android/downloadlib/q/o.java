package com.ss.android.downloadlib.q;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.appdownloader.bn.bn;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class o implements com.ss.android.download.api.ge.dr {

    /* loaded from: classes3.dex */
    private static class dr {
        private static o dr = new o();
    }

    public static o dr() {
        return dr.dr;
    }

    @Override // com.ss.android.download.api.ge.dr
    public void dr(Throwable th, String str) {
        dr(true, th, str);
    }

    public void dr(boolean z, Throwable th, String str) {
        if (ge()) {
            return;
        }
        if (th == null) {
            th = new Throwable();
        }
        if (z) {
            ge(th);
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = th.getMessage();
        }
        yk.dr(jSONObject, "msg", str);
        yk.dr(jSONObject, "stack", Log.getStackTraceString(th));
        wb.xu().dr("service_ttdownloader", 1, jSONObject);
    }

    public void dr(String str) {
        dr(true, str);
    }

    public void dr(boolean z, String str) {
        if (ge()) {
            return;
        }
        if (z) {
            ge(new RuntimeException(str));
        }
        JSONObject jSONObject = new JSONObject();
        yk.dr(jSONObject, "msg", str);
        yk.dr(jSONObject, "stack", dr(new Throwable()));
        wb.xu().dr("service_ttdownloader", 2, jSONObject);
    }

    public void ge(String str) {
        ge(true, str);
    }

    public void ge(boolean z, String str) {
        if (ge()) {
            return;
        }
        if (z) {
            ge(new RuntimeException(str));
        }
        JSONObject jSONObject = new JSONObject();
        yk.dr(jSONObject, "msg", str);
        yk.dr(jSONObject, "stack", dr(new Throwable()));
        wb.xu().dr("service_ttdownloader", 3, jSONObject);
    }

    private void ge(Throwable th) {
        if (bn.ge(wb.getContext())) {
            throw new com.ss.android.downloadlib.q.dr(th);
        }
    }

    public static String dr(Throwable th) {
        try {
            return Log.getStackTraceString(th);
        } catch (Exception e) {
            return null;
        }
    }

    private boolean ge() {
        return wb.ll().optInt("enable_monitor", 1) != 1;
    }
}
