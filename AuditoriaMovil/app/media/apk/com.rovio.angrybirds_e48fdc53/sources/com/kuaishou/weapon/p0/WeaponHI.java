package com.kuaishou.weapon.p0;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class WeaponHI {
    public static int ii;
    public static List<Integer> isList;
    public static Context mContext;
    public static IWeaponInitParams mParams;
    public static String sKSAppkey = "";
    public static String sKSSecKey = "";
    public static String sKSSdkver = "";
    public static String hostVersionName = "";
    public static String sKDeviceId = "";
    public static String skProductName = "";
    public static String cookieData = "";
    public static String encryENV = "";
    public static String sUserId = "";
    public static String sChannel = "";
    public static boolean as = false;

    public static void iD() {
        try {
            iP(mContext);
        } catch (Throwable th) {
        }
        try {
            db.a(mContext).a(100);
            cw.a(mContext).a(100);
            dc.a(mContext).a(100);
            da.a(mContext).a(100, 0);
            cx.a(mContext).a(100);
            cy.a(mContext).a(100);
            dd.a(mContext).a(100);
            cz.a(mContext).a();
        } catch (Exception e) {
        }
    }

    public static void iP(Context context) {
        try {
            long b = de.a(context).b();
            long currentTimeMillis = (System.currentTimeMillis() - b) - (h.a(context, "re_po_rt").c(de.h, 12) * 3600000);
            if (b < 1 || currentTimeMillis > 0) {
                n.a().a(new cv(context));
            }
        } catch (Throwable th) {
        }
    }

    public static void init(Context context, final IWeaponInitParams iWeaponInitParams) {
        try {
            Context applicationContext = context.getApplicationContext();
            mContext = applicationContext;
            if (applicationContext instanceof Application) {
                n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.WeaponHI.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            WeaponHI.mParams = IWeaponInitParams.this;
                            WeaponHI.sKSAppkey = IWeaponInitParams.this.getAppKey();
                            WeaponHI.sKSSecKey = IWeaponInitParams.this.getSecKey();
                            WeaponHI.sKSSdkver = "5.2.3";
                            WeaponHI.hostVersionName = bg.q(WeaponHI.mContext);
                            WeaponHI.sKDeviceId = IWeaponInitParams.this.getDeviceId();
                            WeaponHI.skProductName = IWeaponInitParams.this.getProductName();
                            WeaponHI.sUserId = IWeaponInitParams.this.getUserId();
                            WeaponHI.sChannel = IWeaponInitParams.this.getChannel();
                            WeaponHI.as = IWeaponInitParams.this.getAPPLISTSwitch();
                            WeaponHI.cookieData = bg.B(WeaponHI.mContext);
                            try {
                                h a = h.a(WeaponHI.mContext, "re_po_rt");
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(t.a, cl.m());
                                jSONObject.put(t.t, cl.b(WeaponHI.mContext));
                                jSONObject.put("a", bg.q(WeaponHI.mContext));
                                jSONObject.put("p", bg.s(WeaponHI.mContext));
                                jSONObject.put("s", "5.2.3");
                                jSONObject.put(t.h, TextUtils.isEmpty(a.a(de.g)) ? 1 : 0);
                                WeaponHI.encryENV = new bm(WeaponHI.mContext).c(jSONObject.toString());
                                String a2 = a.a(de.u);
                                if (!TextUtils.isEmpty(a2)) {
                                    WeaponHI.isList = Arrays.asList(a2.split("\\|"));
                                    WeaponHI.ii = a.c(de.v, 5);
                                }
                            } catch (Throwable th) {
                            }
                            WeaponHI.init(WeaponHI.sKSAppkey, WeaponHI.sKSSecKey, IWeaponInitParams.this.getPrivacySwitch());
                        } catch (Throwable th2) {
                        }
                    }
                });
            } else {
                Log.e("Risk", "context  is not application！！！");
            }
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void init(String str, String str2, boolean z) {
        try {
            h.a(mContext, "re_po_rt").a("a1_p_s_p_s", Boolean.valueOf(z));
            n.a();
            bs.a(mContext);
            br.a(mContext);
        } catch (Exception e) {
        }
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.WeaponHI.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    q a = q.a(WeaponHI.mContext);
                    if (a == null) {
                        return;
                    }
                    a.a();
                } catch (Exception e2) {
                }
            }
        });
    }

    public static void setPS(final boolean z) {
        try {
            n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.WeaponHI.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (WeaponHI.mContext != null) {
                        h a = h.a(WeaponHI.mContext, "re_po_rt");
                        boolean z2 = z;
                        if (!z2) {
                            a.a("a1_p_s_p_s_c_b", Boolean.valueOf(z2));
                        } else if (a.e("a1_p_s_p_s_c_b")) {
                        } else {
                            a.a("a1_p_s_p_s_c_b", Boolean.valueOf(z));
                            try {
                                if (a.c(de.bk, 1) == 1) {
                                    db.a(WeaponHI.mContext).a(103);
                                    dc.a(WeaponHI.mContext).a(103);
                                    da.a(WeaponHI.mContext).a(103, 0);
                                    cx.a(WeaponHI.mContext).a(103);
                                }
                            } catch (Throwable th) {
                            }
                        }
                    }
                }
            });
        } catch (Exception e) {
        }
    }
}
