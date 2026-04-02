package com.kwad.sdk.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.facebook.places.model.PlaceFields;
import java.net.InetAddress;
/* loaded from: classes3.dex */
public final class ag {
    private static int aIZ = 0;
    private static boolean aJa;

    public static NetworkInfo ck(Context context) {
        ConnectivityManager connectivityManager;
        if (SystemUtil.b(context, com.kuaishou.weapon.p0.g.b) && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static int cl(Context context) {
        if (context != null && SystemUtil.b(context, com.kuaishou.weapon.p0.g.b) && SystemUtil.b(context, com.kuaishou.weapon.p0.g.c)) {
            try {
                NetworkInfo ck = ck(context);
                if (!(ck != null && ck.isConnected())) {
                    return 0;
                }
                if (1 == ck.getType()) {
                    return 100;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService(PlaceFields.PHONE);
                if (telephonyManager != null) {
                    int l = l(context, telephonyManager.getNetworkType());
                    if (l != 20) {
                        switch (l) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                return 2;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                                return 3;
                            case 13:
                                return 4;
                            default:
                                return 0;
                        }
                    }
                    return 5;
                }
            } catch (Exception e) {
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:10:0x001a, B:12:0x002c, B:14:0x003a, B:15:0x003d, B:47:0x009f, B:49:0x00a5, B:50:0x00a8, B:51:0x00ab, B:17:0x0042, B:20:0x004c, B:23:0x0056, B:26:0x0060, B:29:0x006a, B:32:0x0075, B:35:0x007d, B:38:0x0085, B:41:0x008d, B:44:0x0095, B:52:0x00ad, B:54:0x00b1, B:56:0x00b7, B:58:0x00bd, B:61:0x00c4, B:63:0x00ca, B:64:0x00cd, B:66:0x00d3, B:67:0x00d6, B:48:0x00a2), top: B:79:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:10:0x001a, B:12:0x002c, B:14:0x003a, B:15:0x003d, B:47:0x009f, B:49:0x00a5, B:50:0x00a8, B:51:0x00ab, B:17:0x0042, B:20:0x004c, B:23:0x0056, B:26:0x0060, B:29:0x006a, B:32:0x0075, B:35:0x007d, B:38:0x0085, B:41:0x008d, B:44:0x0095, B:52:0x00ad, B:54:0x00b1, B:56:0x00b7, B:58:0x00bd, B:61:0x00c4, B:63:0x00ca, B:64:0x00cd, B:66:0x00d3, B:67:0x00d6, B:48:0x00a2), top: B:79:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.ag.d(android.content.Context, java.lang.String, boolean):int");
    }

    private static boolean fB(String str) {
        return str.contains("nrState=NOT_RESTRICTED") || str.contains("nrState=CONNECTED");
    }

    public static boolean fC(String str) {
        return p(str, 3000);
    }

    public static int getActiveNetworkType(Context context) {
        try {
            NetworkInfo ck = ck(context);
            if (ck == null) {
                return -1;
            }
            return ck.getType();
        } catch (Exception e) {
            return -1;
        }
    }

    private static int getSubId() {
        if (Build.VERSION.SDK_INT >= 24) {
            return SubscriptionManager.getDefaultDataSubscriptionId();
        }
        return -1;
    }

    public static boolean isMobileConnected(Context context) {
        try {
            NetworkInfo ck = ck(context);
            if (ck != null && ck.isConnected()) {
                return ck.getType() == 0;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean isNetworkConnected(Context context) {
        try {
            NetworkInfo ck = ck(context);
            if (ck != null) {
                if (ck.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isWifiConnected(Context context) {
        try {
            NetworkInfo ck = ck(context);
            if (ck != null && ck.isConnected()) {
                return 1 == ck.getType();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[Catch: Exception -> 0x0079, TRY_ENTER, TryCatch #0 {Exception -> 0x0079, blocks: (B:6:0x0012, B:9:0x001d, B:11:0x0026, B:23:0x0050, B:25:0x0056, B:27:0x0066, B:28:0x006c, B:12:0x002b, B:14:0x0035), top: B:33:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int l(android.content.Context r5, int r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L7a
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            boolean r0 = com.kwad.sdk.utils.SystemUtil.b(r5, r0)
            if (r0 == 0) goto L7a
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r5.getSystemService(r0)     // Catch: java.lang.Exception -> L79
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> L79
            if (r0 != 0) goto L1d
            return r6
        L1d:
            int r1 = getSubId()     // Catch: java.lang.Exception -> L79
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L2b
        L26:
            android.telephony.ServiceState r5 = r0.getServiceState()     // Catch: java.lang.Exception -> L79
            goto L4d
        L2b:
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch: java.lang.Exception -> L79
            int r5 = r5.targetSdkVersion     // Catch: java.lang.Exception -> L79
            r2 = 29
            if (r5 < r2) goto L3a
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L79
            if (r5 < r2) goto L3a
            goto L26
        L3a:
            java.lang.String r5 = "getServiceStateForSubscriber"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L4b
            r2[r3] = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = com.kwad.sdk.utils.s.f(r0, r5, r2)     // Catch: java.lang.Throwable -> L4b
            android.telephony.ServiceState r5 = (android.telephony.ServiceState) r5     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r5 = move-exception
            goto L26
        L4d:
            if (r5 != 0) goto L50
            return r6
        L50:
            boolean r0 = com.kwad.sdk.utils.as.IP()     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L6c
            java.lang.String r0 = "com.huawei.android.telephony.ServiceStateEx"
            java.lang.String r1 = "getConfigRadioTechnology"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L79
            r2[r3] = r5     // Catch: java.lang.Exception -> L79
            java.lang.Object r5 = com.kwad.sdk.utils.s.a(r0, r1, r2)     // Catch: java.lang.Exception -> L79
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L79
            if (r5 == 0) goto L7a
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L79
            r6 = r5
            goto L7a
        L6c:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L79
            boolean r5 = fB(r5)     // Catch: java.lang.Exception -> L79
            if (r5 == 0) goto L7a
            r6 = 20
            goto L7a
        L79:
            r5 = move-exception
        L7a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.ag.l(android.content.Context, int):int");
    }

    private static boolean p(String str, int i) {
        try {
            return InetAddress.getByName(str).isReachable(3000);
        } catch (Throwable th) {
            return false;
        }
    }
}
