package com.kwad.sdk.core.f;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.kwad.sdk.core.f.a.b;
import com.kwad.sdk.core.f.a.c;
import com.kwad.sdk.core.f.a.d;
import com.kwad.sdk.core.f.a.e;
import com.kwad.sdk.core.f.a.g;
import com.kwad.sdk.core.f.a.h;
import com.kwad.sdk.core.f.a.i;
import com.kwad.sdk.core.f.a.j;
import com.kwad.sdk.oaid.OADIDSDKHelper;
import com.kwad.sdk.oaid.OADIDSDKHelper25;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.f;
import com.kwad.sdk.utils.at;
import com.kwad.sdk.utils.aw;
/* loaded from: classes.dex */
public final class a {
    private static String aqo = "";
    private static boolean aqp = false;
    private static boolean sGetOaidFail = false;

    public static String bc(Context context) {
        if (!at.Jb() || TextUtils.isEmpty(at.Jc())) {
            if (TextUtils.isEmpty(aqo)) {
                if (at.Jb() || ((f) ServiceProvider.get(f.class)).Q(2048L)) {
                    return aqo;
                }
                initAsync(context);
                return aqo;
            }
            return aqo;
        }
        return at.Jc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bd(Context context) {
        String oaid;
        if (!TextUtils.isEmpty(aqo) || context == null || aqp) {
            return;
        }
        aqp = true;
        if (sGetOaidFail) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String upperCase = Build.MANUFACTURER.toUpperCase();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -2053026509:
                    if (upperCase.equals("LENOVO")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1712043046:
                    if (upperCase.equals("SAMSUNG")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1706170181:
                    if (upperCase.equals("XIAOMI")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1134767290:
                    if (upperCase.equals("BLACKSHARK")) {
                        c = 2;
                        break;
                    }
                    break;
                case -602397472:
                    if (upperCase.equals("ONEPLUS")) {
                        c = 4;
                        break;
                    }
                    break;
                case 89163:
                    if (upperCase.equals("ZTE")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 2018896:
                    if (upperCase.equals("ASUS")) {
                        c = 11;
                        break;
                    }
                    break;
                case 2432928:
                    if (upperCase.equals("OPPO")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2555124:
                    if (upperCase.equals("SSUI")) {
                        c = 14;
                        break;
                    }
                    break;
                case 2634924:
                    if (upperCase.equals("VIVO")) {
                        c = 5;
                        break;
                    }
                    break;
                case 73239724:
                    if (upperCase.equals("MEIZU")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 74632627:
                    if (upperCase.equals("NUBIA")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 630905871:
                    if (upperCase.equals("MOTOLORA")) {
                        c = 7;
                        break;
                    }
                    break;
                case 976565563:
                    if (upperCase.equals("FERRMEOS")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 2141820391:
                    if (upperCase.equals("HUAWEI")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    oaid = new b(applicationContext).getOAID();
                    aqo = oaid;
                    break;
                case 1:
                case 2:
                    oaid = new i(applicationContext).getOAID();
                    aqo = oaid;
                    break;
                case 3:
                case 4:
                    oaid = new com.kwad.sdk.core.f.a.f(applicationContext).getOAID();
                    aqo = oaid;
                    break;
                case 5:
                    oaid = new h(applicationContext).getOAID();
                    aqo = oaid;
                    break;
                case 6:
                case 7:
                    oaid = new c(applicationContext).getOAID();
                    aqo = oaid;
                    break;
                case '\b':
                    oaid = new d(applicationContext).getOAID();
                    aqo = oaid;
                    break;
                case '\t':
                    oaid = new e(applicationContext).getOAID();
                    aqo = oaid;
                    break;
                case '\n':
                    oaid = new g(applicationContext).getOAID();
                    aqo = oaid;
                    break;
                case 11:
                    oaid = new com.kwad.sdk.core.f.a.a(applicationContext).getOAID();
                    aqo = oaid;
                    break;
                case '\f':
                case '\r':
                case 14:
                    oaid = new j(applicationContext).getOAID();
                    aqo = oaid;
                    break;
            }
            com.kwad.sdk.core.e.c.i("OAIDHelper", "manufacturer:" + upperCase + "--OAID:" + aqo);
            if (TextUtils.isEmpty(aqo)) {
                sGetOaidFail = true;
            }
            aqp = false;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    public static void initAsync(final Context context) {
        if (!TextUtils.isEmpty(aqo) || context == null) {
            return;
        }
        com.kwad.sdk.utils.g.execute(new aw() { // from class: com.kwad.sdk.core.f.a.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                a.bd(context);
                if (OADIDSDKHelper.isSupport()) {
                    OADIDSDKHelper.getOAId(context, new OADIDSDKHelper.a() { // from class: com.kwad.sdk.core.f.a.1.1
                        @Override // com.kwad.sdk.oaid.OADIDSDKHelper.a
                        public final void dr(String str) {
                            String unused = a.aqo = str;
                            a.mM();
                        }
                    });
                } else if (OADIDSDKHelper25.isSupport()) {
                    OADIDSDKHelper25.getOAId(context, new OADIDSDKHelper25.a() { // from class: com.kwad.sdk.core.f.a.1.2
                        @Override // com.kwad.sdk.oaid.OADIDSDKHelper25.a
                        public final void dr(String str) {
                            String unused = a.aqo = str;
                            a.mM();
                        }
                    });
                }
            }
        });
    }

    static /* synthetic */ void mM() {
    }
}
