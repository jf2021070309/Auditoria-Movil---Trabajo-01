package com.kwad.sdk.crash;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c {
    public final String aud;
    public final boolean azC;
    public final boolean azD;
    public final com.kwad.sdk.crash.model.b azG;
    public final com.kwad.sdk.crash.model.a azH;
    public final h azI;
    public final String[] azJ;
    public final String[] azK;
    public final boolean azL;
    public final f azM;
    public final String azN;
    public final String azO;
    public final String azP;
    public final String azQ;
    public final List<com.kwad.sdk.crash.a> azR;
    public final double azy;
    public final String channel;
    public final Context context;
    public final boolean isExternal;
    public final String platform;
    public final String version;

    /* loaded from: classes.dex */
    public static class a {
        private String Um;
        private int Un;
        public int Uo;
        private String appId;
        private String appName;
        private String appPackageName;
        private String appVersion;
        private int asB;
        private String aud;
        private f azM;
        private String azN;
        private String azO;
        private String azS;
        private h azT;
        private String[] azU;
        public String[] azV;
        private String channel;
        private Context context;
        private String platform;
        private String sdkVersion;
        private String version;
        private boolean azL = false;
        private boolean azC = false;
        private boolean azD = false;
        private boolean isExternal = false;
        private String azP = "";
        private String azQ = "";
        private List<com.kwad.sdk.crash.a> azR = new ArrayList();
        private double azy = 1.0d;

        public final a A(List<String> list) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        com.kwad.sdk.crash.a aVar = new com.kwad.sdk.crash.a();
                        aVar.parseJson(jSONObject);
                        this.azR.add(aVar);
                    } catch (Exception e) {
                        com.kwad.sdk.core.e.c.w("ExceptionCollectorConfigs", e.toString());
                    }
                }
            }
            return this;
        }

        public final c EA() {
            return new c(this, (byte) 0);
        }

        public final a a(f fVar) {
            this.azM = fVar;
            return this;
        }

        public final a a(h hVar) {
            this.azT = hVar;
            return this;
        }

        public final a bn(boolean z) {
            this.azC = z;
            return this;
        }

        public final a bo(boolean z) {
            this.azD = z;
            return this;
        }

        public final a bp(boolean z) {
            this.isExternal = z;
            return this;
        }

        public final a bx(Context context) {
            this.context = context;
            return this;
        }

        public final a cC(int i) {
            this.asB = i;
            return this;
        }

        public final a cD(int i) {
            this.Un = i;
            return this;
        }

        public final a cE(int i) {
            this.Uo = 1;
            return this;
        }

        public final a d(String[] strArr) {
            this.azU = strArr;
            return this;
        }

        public final a e(String[] strArr) {
            this.azV = strArr;
            return this;
        }

        public final a el(String str) {
            this.azP = str;
            return this;
        }

        public final a em(String str) {
            this.azQ = str;
            return this;
        }

        public final a en(String str) {
            this.platform = str;
            return this;
        }

        public final a eo(String str) {
            this.aud = str;
            return this;
        }

        public final a ep(String str) {
            this.channel = str;
            return this;
        }

        public final a eq(String str) {
            this.azO = str;
            return this;
        }

        public final a er(String str) {
            this.azS = str;
            return this;
        }

        public final a es(String str) {
            this.sdkVersion = str;
            return this;
        }

        public final a et(String str) {
            this.Um = str;
            return this;
        }

        public final a eu(String str) {
            this.appPackageName = str;
            return this;
        }

        public final a ev(String str) {
            this.appId = str;
            return this;
        }

        public final a ew(String str) {
            this.appName = str;
            return this;
        }

        public final a ex(String str) {
            this.appVersion = str;
            return this;
        }

        public final a j(double d) {
            this.azy = d;
            return this;
        }
    }

    private c(a aVar) {
        com.kwad.sdk.crash.model.b bVar = new com.kwad.sdk.crash.model.b();
        this.azG = bVar;
        com.kwad.sdk.crash.model.a aVar2 = new com.kwad.sdk.crash.model.a();
        this.azH = aVar2;
        ArrayList arrayList = new ArrayList();
        this.azR = arrayList;
        this.azL = aVar.azL;
        this.azC = aVar.azC;
        this.azD = aVar.azD;
        this.isExternal = aVar.isExternal;
        this.azP = aVar.azP;
        this.azQ = aVar.azQ;
        this.context = aVar.context;
        this.azM = aVar.azM;
        this.platform = aVar.platform;
        this.version = aVar.version;
        this.aud = aVar.aud;
        this.channel = aVar.channel;
        this.azN = aVar.azN;
        this.azO = aVar.azO;
        aVar2.aAu = aVar.appId;
        aVar2.mAppName = aVar.appName;
        aVar2.aAw = aVar.appVersion;
        aVar2.aAv = aVar.appPackageName;
        bVar.aAz = aVar.Um;
        bVar.aAA = aVar.Un;
        bVar.mSdkVersion = aVar.sdkVersion;
        bVar.aAy = aVar.asB;
        bVar.aAx = aVar.azS;
        bVar.aAB = aVar.Uo;
        this.azI = aVar.azT;
        this.azJ = aVar.azU;
        this.azK = aVar.azV;
        arrayList.addAll(aVar.azR);
        this.azy = aVar.azy;
    }

    /* synthetic */ c(a aVar, byte b) {
        this(aVar);
    }

    public final f Ey() {
        return this.azM;
    }

    public final boolean Ez() {
        return this.azL;
    }
}
