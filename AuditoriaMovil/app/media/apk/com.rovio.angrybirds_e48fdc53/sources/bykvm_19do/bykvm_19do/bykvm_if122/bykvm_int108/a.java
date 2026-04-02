package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108;

import android.text.TextUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.v2.GMMediationAdSdk;
import com.bytedance.msdk.api.v2.GMSettingConfigCallback;
import com.kwad.components.offline.api.BuildConfig;
/* loaded from: classes.dex */
public class a {
    private static final GMSettingConfigCallback a = new C0053a();

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0053a implements GMSettingConfigCallback {
        C0053a() {
        }

        @Override // com.bytedance.msdk.api.v2.GMSettingConfigCallback
        public void configLoad() {
            try {
                a.d();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r7[r4].length() <= r8[r4].length()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r7.length <= r8.length) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(java.lang.String r7, java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 == 0) goto L11
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L11
            goto L8e
        L11:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L1a
        L17:
            r1 = r2
            goto L8e
        L1a:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L8d
            java.lang.String r0 = "v"
            boolean r4 = r7.startsWith(r0)
            java.lang.String r5 = "V"
            if (r4 != 0) goto L30
            boolean r4 = r7.startsWith(r5)
            if (r4 == 0) goto L34
        L30:
            java.lang.String r7 = r7.substring(r3)
        L34:
            boolean r0 = r8.startsWith(r0)
            if (r0 != 0) goto L40
            boolean r0 = r8.startsWith(r5)
            if (r0 == 0) goto L44
        L40:
            java.lang.String r8 = r8.substring(r3)
        L44:
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r7.length
            int r4 = r8.length
            int r0 = java.lang.Math.min(r0, r4)
            r4 = r1
        L55:
            if (r4 >= r0) goto L83
            r5 = r7[r4]
            int r5 = r5.length()
            r6 = r8[r4]
            int r6 = r6.length()
            if (r5 != r6) goto L74
            r5 = r7[r4]
            r6 = r8[r4]
            int r5 = r5.compareTo(r6)
            if (r5 != 0) goto L72
            int r4 = r4 + 1
            goto L55
        L72:
            r1 = r5
            goto L8e
        L74:
            r7 = r7[r4]
            int r7 = r7.length()
            r8 = r8[r4]
            int r8 = r8.length()
            if (r7 > r8) goto L8d
            goto L17
        L83:
            int r0 = r7.length
            int r4 = r8.length
            if (r0 != r4) goto L88
            goto L8e
        L88:
            int r7 = r7.length
            int r8 = r8.length
            if (r7 > r8) goto L8d
            goto L17
        L8d:
            r1 = r3
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.a.a(java.lang.String, java.lang.String):int");
    }

    public static boolean b(String str, String str2) {
        String str3;
        StringBuilder sb;
        String str4;
        StringBuilder sb2;
        String str5;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (!str.equals("pangle")) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1128782217:
                    if (str.equals("klevin")) {
                        c = 5;
                        break;
                    }
                    break;
                case -902468465:
                    if (str.equals("sigmob")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3432:
                    if (str.equals("ks")) {
                        c = 6;
                        break;
                    }
                    break;
                case 102199:
                    if (str.equals("gdt")) {
                        c = 3;
                        break;
                    }
                    break;
                case 92668925:
                    if (str.equals("admob")) {
                        c = 0;
                        break;
                    }
                    break;
                case 93498907:
                    if (str.equals("baidu")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111433589:
                    if (str.equals("unity")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1126045977:
                    if (str.equals("mintegral")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str3 = "17.2.0.43";
                    if (a(str2, "17.2.0.43") == 0) {
                        sb = new StringBuilder();
                        str4 = "admobAdapter版本正常，要求<=";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        Logger.d("TTMediationSDK_InitChecker", sb.toString());
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "admobAdapter版本不符合，要求<=";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        Logger.e("TTMediationSDK_InitChecker", sb2.toString());
                        return false;
                    }
                case 1:
                    str3 = "9.29.0";
                    if (a(str2, "9.29.0") == 0) {
                        sb = new StringBuilder();
                        str4 = "百度Adapter版本正常，要求等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        Logger.d("TTMediationSDK_InitChecker", sb.toString());
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "百度Adapter版本不符合，要求等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        Logger.e("TTMediationSDK_InitChecker", sb2.toString());
                        return false;
                    }
                case 2:
                    str3 = "4.3.0.11";
                    if (a(str2, "4.3.0.11") == 0) {
                        sb = new StringBuilder();
                        str4 = "unityAdapter版本正常，要求等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        Logger.d("TTMediationSDK_InitChecker", sb.toString());
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "unityAdapter版本不符合，要求等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        Logger.e("TTMediationSDK_InitChecker", sb2.toString());
                        return false;
                    }
                case 3:
                    str3 = "4.520.1390.1";
                    if (a(str2, "4.520.1390.1") == 0) {
                        sb = new StringBuilder();
                        str4 = "gdtAdapter版本正常，要求等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        Logger.d("TTMediationSDK_InitChecker", sb.toString());
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "gdtAdapter版本不符合，要求等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        Logger.e("TTMediationSDK_InitChecker", sb2.toString());
                        return false;
                    }
                case 4:
                    str3 = "4.11.0.0";
                    if (a(str2, "4.11.0.0") == 0) {
                        sb = new StringBuilder();
                        str4 = "sigmobAdapter版本正常, 要求版本等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        Logger.d("TTMediationSDK_InitChecker", sb.toString());
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "sigmobAdapter版本不符合, 要求版本等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        Logger.e("TTMediationSDK_InitChecker", sb2.toString());
                        return false;
                    }
                case 5:
                    str3 = "2.11.0.3.5";
                    if (a(str2, "2.11.0.3.5") == 0) {
                        sb = new StringBuilder();
                        str4 = "klevinAdapter版本正常, 要求版本等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        Logger.d("TTMediationSDK_InitChecker", sb.toString());
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "klevinAdapter版本不符合, 要求版本等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        Logger.e("TTMediationSDK_InitChecker", sb2.toString());
                        return false;
                    }
                case 6:
                    str3 = "3.3.44.0";
                    if (a(str2, "3.3.44.0") == 0) {
                        sb = new StringBuilder();
                        str4 = "快手Adapter版本正常, 要求版本等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        Logger.d("TTMediationSDK_InitChecker", sb.toString());
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "快手Adapter版本不符合, 要求版本等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        Logger.e("TTMediationSDK_InitChecker", sb2.toString());
                        return false;
                    }
                case 7:
                    str3 = "16.4.17.2";
                    if (a(str2, "16.4.17.2") == 0) {
                        sb = new StringBuilder();
                        str4 = "MintegralAdapter版本正常, 要求版本等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        Logger.d("TTMediationSDK_InitChecker", sb.toString());
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "MintegralAdapter版本不符合, 要求版本等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        Logger.e("TTMediationSDK_InitChecker", sb2.toString());
                        return false;
                    }
                default:
                    return false;
            }
        }
        return true;
    }

    public static void c() {
        try {
            if (Logger.isDebug() && GMMediationAdSdk.configLoadSuccess()) {
                d();
            }
        } catch (Throwable th) {
        }
    }

    public static boolean c(String str, String str2) {
        String str3;
        StringBuilder sb;
        String str4;
        StringBuilder sb2;
        String str5;
        String sb3;
        String sb4;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (!str.equals("baidu") && !str.equals("admob")) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1128782217:
                    if (str.equals("klevin")) {
                        c = 4;
                        break;
                    }
                    break;
                case -995541405:
                    if (str.equals("pangle")) {
                        c = 0;
                        break;
                    }
                    break;
                case -902468465:
                    if (str.equals("sigmob")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3432:
                    if (str.equals("ks")) {
                        c = 5;
                        break;
                    }
                    break;
                case 102199:
                    if (str.equals("gdt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 111433589:
                    if (str.equals("unity")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1126045977:
                    if (str.equals("mintegral")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str3 = "5.3.0.5";
                    if (a(str2, "5.3.0.5") == 0) {
                        sb = new StringBuilder();
                        str4 = "穿山甲版本正常，要求等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        sb3 = sb.toString();
                        Logger.d("TTMediationSDK_InitChecker", sb3);
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "穿山甲版本不符合，要求等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        sb4 = sb2.toString();
                        Logger.e("TTMediationSDK_InitChecker", sb4);
                        return false;
                    }
                case 1:
                    str3 = "4.3.0";
                    if (a(str2, "4.3.0") == 0) {
                        sb = new StringBuilder();
                        str4 = "unity版本正常，要求等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        sb3 = sb.toString();
                        Logger.d("TTMediationSDK_InitChecker", sb3);
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "unity版本不符合，要求等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        sb4 = sb2.toString();
                        Logger.e("TTMediationSDK_InitChecker", sb4);
                        return false;
                    }
                case 2:
                    str3 = "4.520.1390";
                    if (a(str2, "4.520.1390") == 0) {
                        sb = new StringBuilder();
                        str4 = "gdt版本正常，要求等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        sb3 = sb.toString();
                        Logger.d("TTMediationSDK_InitChecker", sb3);
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "gdt版本不符合，要求等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        sb4 = sb2.toString();
                        Logger.e("TTMediationSDK_InitChecker", sb4);
                        return false;
                    }
                case 3:
                    str3 = "4.11.0";
                    if (a(str2, "4.11.0") == 0) {
                        sb = new StringBuilder();
                        str4 = "sigmob版本正常, 要求版本等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        sb3 = sb.toString();
                        Logger.d("TTMediationSDK_InitChecker", sb3);
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "sigmob版本不符合, 要求版本等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        sb4 = sb2.toString();
                        Logger.e("TTMediationSDK_InitChecker", sb4);
                        return false;
                    }
                case 4:
                    str3 = "2.11.0.3";
                    if (a(str2, "2.11.0.3") == 0) {
                        sb = new StringBuilder();
                        str4 = "klevin版本正常, 要求版本等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        sb3 = sb.toString();
                        Logger.d("TTMediationSDK_InitChecker", sb3);
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "klevin版本不符合, 要求版本等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        sb4 = sb2.toString();
                        Logger.e("TTMediationSDK_InitChecker", sb4);
                        return false;
                    }
                case 5:
                    str3 = BuildConfig.VERSION_NAME;
                    if (a(str2, BuildConfig.VERSION_NAME) == 0) {
                        sb = new StringBuilder();
                        str4 = "快手版本正常, 要求版本等于";
                        sb.append(str4);
                        sb.append(str3);
                        sb.append("，当前是");
                        sb.append(str2);
                        sb3 = sb.toString();
                        Logger.d("TTMediationSDK_InitChecker", sb3);
                        break;
                    } else {
                        sb2 = new StringBuilder();
                        str5 = "快手版本不符合, 要求版本等于";
                        sb2.append(str5);
                        sb2.append(str3);
                        sb2.append("，当前是");
                        sb2.append(str2);
                        sb4 = sb2.toString();
                        Logger.e("TTMediationSDK_InitChecker", sb4);
                        return false;
                    }
                case 6:
                    if (!TextUtils.isEmpty(str2) && str2.contains("16.4.17")) {
                        sb3 = "Mintegral版本正常, 要求版本等于16.4.17，当前是" + str2;
                        Logger.d("TTMediationSDK_InitChecker", sb3);
                        break;
                    } else {
                        sb4 = "Mintegral版本不符合, 要求版本等于16.4.17，当前是" + str2;
                        Logger.e("TTMediationSDK_InitChecker", sb4);
                        return false;
                    }
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        synchronized (a.class) {
            if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d() != null) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().b();
            }
        }
    }
}
