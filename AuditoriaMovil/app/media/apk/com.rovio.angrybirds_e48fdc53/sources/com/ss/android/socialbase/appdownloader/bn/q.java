package com.ss.android.socialbase.appdownloader.bn;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.socialbase.appdownloader.rb;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* loaded from: classes3.dex */
public class q {
    private static String bn;
    public static String dr;
    public static String o;
    private static String q;
    private static String rb;
    private static String g = "";
    public static String ge = "";
    private static Boolean xu = null;

    public static boolean dr() {
        return dr("EMUI");
    }

    public static boolean ge() {
        return dr("MIUI");
    }

    public static boolean o() {
        return dr("VIVO");
    }

    public static boolean g() {
        x();
        return dr(dr);
    }

    public static boolean q() {
        return dr("FLYME");
    }

    public static boolean bn() {
        return dr("SAMSUNG");
    }

    public static String rb() {
        if (q == null) {
            dr("");
        }
        return q;
    }

    public static String xu() {
        if (bn == null) {
            dr("");
        }
        return bn;
    }

    public static String ll() {
        if (o == null) {
            dr("");
        }
        return o;
    }

    private static void x() {
        if (TextUtils.isEmpty(dr)) {
            DownloadComponentManager.ensureOPPO();
            dr = DownloadConstants.UPPER_OPPO;
            g = "ro.build.version." + DownloadConstants.LOWER_OPPO + "rom";
            ge = "com." + DownloadConstants.LOWER_OPPO + ".market";
        }
    }

    public static boolean dr(String str) {
        x();
        String str2 = q;
        if (str2 != null) {
            return str2.equals(str);
        }
        String g2 = g("ro.miui.ui.version.name");
        bn = g2;
        if (!TextUtils.isEmpty(g2)) {
            q = "MIUI";
            o = "com.xiaomi.market";
            rb = bn;
        } else {
            String g3 = g("ro.build.version.emui");
            bn = g3;
            if (!TextUtils.isEmpty(g3)) {
                q = "EMUI";
                o = "com.huawei.appmarket";
            } else {
                String g4 = g(g);
                bn = g4;
                if (TextUtils.isEmpty(g4)) {
                    String g5 = g("ro.vivo.os.version");
                    bn = g5;
                    if (!TextUtils.isEmpty(g5)) {
                        q = "VIVO";
                        o = "com.bbk.appstore";
                    } else {
                        String g6 = g("ro.smartisan.version");
                        bn = g6;
                        if (!TextUtils.isEmpty(g6)) {
                            q = "SMARTISAN";
                            o = "com.smartisanos.appstore";
                        } else {
                            String g7 = g("ro.gn.sv.version");
                            bn = g7;
                            if (!TextUtils.isEmpty(g7)) {
                                q = "QIONEE";
                                o = "com.gionee.aora.market";
                            } else {
                                String g8 = g("ro.lenovo.lvp.version");
                                bn = g8;
                                if (!TextUtils.isEmpty(g8)) {
                                    q = "LENOVO";
                                    o = "com.lenovo.leos.appstore";
                                } else if (wb().toUpperCase().contains("SAMSUNG")) {
                                    q = "SAMSUNG";
                                    o = "com.sec.android.app.samsungapps";
                                } else if (wb().toUpperCase().contains("ZTE")) {
                                    q = "ZTE";
                                    o = "zte.com.market";
                                } else if (wb().toUpperCase().contains("NUBIA")) {
                                    q = "NUBIA";
                                    o = "cn.nubia.neostore";
                                } else if (t().toUpperCase().contains("FLYME")) {
                                    q = "FLYME";
                                    o = "com.meizu.mstore";
                                    bn = t();
                                } else if (wb().toUpperCase().contains("ONEPLUS")) {
                                    q = "ONEPLUS";
                                    bn = g("ro.rom.version");
                                    if (rb.dr(ge) > -1) {
                                        o = ge;
                                    } else {
                                        o = "com.heytap.market";
                                    }
                                } else {
                                    q = wb().toUpperCase();
                                    o = "";
                                    bn = "";
                                }
                            }
                        }
                    }
                } else {
                    q = dr;
                    if (rb.dr(ge) > -1) {
                        o = ge;
                    } else {
                        o = "com.heytap.market";
                    }
                }
            }
        }
        return q.equals(str);
    }

    public static String ge(String str) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
        } catch (Throwable th) {
            bufferedReader = null;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            DownloadUtils.safeClose(bufferedReader);
            return readLine;
        } catch (Throwable th2) {
            DownloadUtils.safeClose(bufferedReader);
            return null;
        }
    }

    public static String o(String str) throws Throwable {
        return (String) Class.forName("android.os.SystemProperties").getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(null, str);
    }

    public static String g(String str) {
        if (DownloadSetting.getGlobalSettings().optBoolean(DownloadSettingKeys.ENABLE_REFLECT_SYSTEM_PROPERTIES, true)) {
            try {
                return o(str);
            } catch (Throwable th) {
                th.printStackTrace();
                return ge(str);
            }
        }
        return ge(str);
    }

    public static String wb() {
        return Build.MANUFACTURER == null ? "" : Build.MANUFACTURER.trim();
    }

    public static String t() {
        return Build.DISPLAY == null ? "" : Build.DISPLAY.trim();
    }

    public static boolean yk() {
        lp();
        return "V10".equals(rb);
    }

    public static boolean cu() {
        lp();
        return "V11".equals(rb);
    }

    public static boolean v() {
        lp();
        return "V12".equals(rb);
    }

    private static void lp() {
        if (rb == null) {
            try {
                rb = g("ro.miui.ui.version.name");
            } catch (Exception e) {
                e.printStackTrace();
            }
            String str = rb;
            if (str == null) {
                str = "";
            }
            rb = str;
        }
    }

    public static boolean il() {
        if (xu == null) {
            xu = Boolean.valueOf(g.rb().equals("harmony"));
        }
        return xu.booleanValue();
    }
}
