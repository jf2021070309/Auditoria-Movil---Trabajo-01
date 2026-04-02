package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class co {
    public static void a(Context context, String str) {
        try {
            a(context, str, null, false, true);
        } catch (Throwable th) {
        }
    }

    public static void a(final Context context, String str, final String str2, final boolean z, boolean z2) {
        JSONObject jSONObject;
        StringBuilder sb;
        try {
            String str3 = ct.a + ct.e;
            String a = cu.a(context);
            if (!TextUtils.isEmpty(a)) {
                if (!ct.a() || str2 == null) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("?");
                    sb.append(a);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("?logId=");
                    sb.append(str2);
                    sb.append("&");
                    sb.append(a);
                }
                str3 = sb.toString();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (z2) {
                jSONObject = new JSONObject();
                String c = new bm(context).c(str);
                if (!TextUtils.isEmpty(c)) {
                    jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_DATA, c);
                }
            } else {
                jSONObject = new JSONObject(str);
            }
            l a2 = l.a(context);
            m mVar = new m(str3, jSONObject);
            mVar.a(WeaponHI.cookieData);
            mVar.b(WeaponHI.encryENV);
            a2.b(mVar, new j() { // from class: com.kuaishou.weapon.p0.co.1
                @Override // com.kuaishou.weapon.p0.j
                public final void a(String str4) {
                    de a3;
                    String str5;
                    long currentTimeMillis;
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    try {
                        if (str2.equals(cj.b)) {
                            de.a(context).a(System.currentTimeMillis());
                            return;
                        }
                        if (str2.equals(cj.c)) {
                            a3 = de.a(context);
                            str5 = de.bd;
                            currentTimeMillis = System.currentTimeMillis();
                        } else if (str2.equals(cj.d)) {
                            a3 = de.a(context);
                            str5 = de.bc;
                            currentTimeMillis = System.currentTimeMillis();
                        } else if (!str2.equals(cj.g)) {
                            if (str2.equals(cj.i)) {
                                de.a(context).a(de.bb, System.currentTimeMillis());
                                return;
                            }
                            return;
                        } else {
                            a3 = de.a(context);
                            str5 = de.bg;
                            currentTimeMillis = System.currentTimeMillis();
                        }
                        a3.a(str5, currentTimeMillis);
                    } catch (Exception e) {
                    }
                }

                @Override // com.kuaishou.weapon.p0.j
                public final void b(String str4) {
                    if (z) {
                        TextUtils.isEmpty(str2);
                    }
                }
            });
        } catch (Throwable th) {
        }
    }
}
