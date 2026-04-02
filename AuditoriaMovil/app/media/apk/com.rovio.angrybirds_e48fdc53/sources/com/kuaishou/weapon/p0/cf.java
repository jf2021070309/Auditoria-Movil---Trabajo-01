package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class cf {
    public static void a(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("result", 0) == 1) {
                JSONObject jSONObject2 = new JSONObject(new bm(context).a(jSONObject.getString("dataRsp")));
                String string = jSONObject2.getString("conjure");
                if (jSONObject2.getInt("status") == 1) {
                    bw.a(context, string);
                    bw.b(context, string);
                }
            }
        } catch (Exception e) {
        }
    }

    public static void a(final Context context, String str, String str2, boolean z) {
        JSONObject jSONObject;
        try {
            String str3 = ct.a + ct.f;
            String a = cu.a(context);
            if (!TextUtils.isEmpty(a)) {
                if (!ct.a() || str2 == null) {
                    str3 = str3 + "?" + a;
                } else {
                    str3 = str3 + "?logId=" + str2 + "&" + a;
                }
            }
            String str4 = str3;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (z) {
                jSONObject = new JSONObject();
                String c = new bm(context).c(str);
                if (!TextUtils.isEmpty(c)) {
                    jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_DATA, c);
                }
            } else {
                jSONObject = new JSONObject(str);
            }
            n.a().a(new k(context, WeaponHI.cookieData, WeaponHI.encryENV, str4, jSONObject, new j() { // from class: com.kuaishou.weapon.p0.cf.1
                @Override // com.kuaishou.weapon.p0.j
                public final void a(String str5) {
                    cf.a(context, str5);
                }

                @Override // com.kuaishou.weapon.p0.j
                public final void b(String str5) {
                }
            }));
        } catch (Exception e) {
        }
    }
}
