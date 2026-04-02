package com.ss.android.downloadlib.addownload.compliance;

import com.ss.android.downloadlib.addownload.ge.bn;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class q {
    public static void dr(String str, long j) {
        com.ss.android.downloadlib.addownload.ge.q q = bn.dr().q(j);
        if (!q.n()) {
            q.o.setRefer(str);
            com.ss.android.downloadlib.g.dr.dr().ge("lp_app_dialog_click", q);
        }
    }

    public static void ge(String str, long j) {
        dr(str, null, j);
    }

    public static void dr(String str, JSONObject jSONObject, long j) {
        com.ss.android.downloadlib.g.dr.dr().ge(str, jSONObject, bn.dr().q(j));
    }

    public static void dr(String str, com.ss.android.downloadlib.addownload.ge.q qVar) {
        com.ss.android.downloadlib.g.dr.dr().ge(str, qVar);
    }

    public static void dr(int i, com.ss.android.downloadlib.addownload.ge.q qVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("error_code", Integer.valueOf(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.ss.android.downloadlib.g.dr.dr().ge("lp_compliance_error", jSONObject, qVar);
    }

    public static void dr(int i, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("error_code", Integer.valueOf(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.ss.android.downloadlib.g.dr.dr().ge("lp_compliance_error", jSONObject, bn.dr().q(j));
    }
}
