package com.kwad.sdk.core.request.model;

import android.content.Context;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.InstalledAppInfoManager;
import com.kwad.sdk.utils.ae;
import com.kwad.sdk.utils.ap;
import com.kwad.sdk.utils.au;
import com.kwad.sdk.utils.be;
import com.kwad.sdk.utils.k;
import com.kwad.sdk.utils.y;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class b extends com.kwad.sdk.core.response.a.a {
    private static boolean atS;
    private static JSONArray atT;
    public String Qc;
    public String Ur;
    public int Us;
    public int Uu;
    public String Uv;
    public int Ux;
    public int Uy;
    public String amJ;
    public String amK;
    public String atU;
    public String atV;
    public String atW;
    public String atX;
    public String atY;
    public String atZ;
    public int aua;
    public int aub;
    public String auc;
    public String aud;
    public String aue;
    public int auf;
    public String aug;
    public String auh;
    public String aui;
    public JSONArray auj;
    public String auk;
    public String aum;
    public String aun;
    public String auo;
    public String auq;
    public String aur;
    public int aul = 0;
    public long aup = 0;

    public static b Cs() {
        b bVar = new b();
        bVar.amK = au.getOaid();
        bVar.aud = au.getDeviceId();
        bVar.aug = be.JH();
        bVar.Us = 1;
        bVar.Uu = be.JT();
        bVar.atZ = be.getOsVersion();
        bVar.aui = y.Iw();
        com.kwad.sdk.components.f fVar = (com.kwad.sdk.components.f) com.kwad.sdk.components.c.f(com.kwad.sdk.components.f.class);
        if (fVar != null) {
            bVar.auh = fVar.nU();
        }
        com.kwad.sdk.service.a.e eVar = (com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class);
        if (eVar != null) {
            bVar.amJ = au.cw(eVar.getContext());
        }
        return bVar;
    }

    private static synchronized JSONArray bh(Context context) {
        synchronized (b.class) {
            if (!atS) {
                atS = true;
                InstalledAppInfoManager.a(context, new com.kwad.sdk.g.a<JSONArray>() { // from class: com.kwad.sdk.core.request.model.b.1
                    private static void g(JSONArray jSONArray) {
                        JSONArray unused = b.atT = jSONArray;
                    }

                    @Override // com.kwad.sdk.g.a
                    public final /* synthetic */ void accept(JSONArray jSONArray) {
                        g(jSONArray);
                    }
                });
            }
            JSONArray jSONArray = atT;
            if (jSONArray != null) {
                atT = null;
                return jSONArray;
            }
            return null;
        }
    }

    public static b g(boolean z, int i) {
        b bVar = new b();
        com.kwad.sdk.service.a.e eVar = (com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class);
        Context context = eVar.getContext();
        bVar.amJ = au.cw(context);
        bVar.atU = au.cz(context);
        bVar.atV = au.cA(context);
        bVar.atW = be.de(context);
        bVar.amK = au.getOaid();
        bVar.aug = be.JH();
        bVar.Ur = be.JJ();
        bVar.Us = 1;
        bVar.Uu = be.JT();
        bVar.atZ = be.getOsVersion();
        bVar.Uv = k.getLanguage();
        bVar.Uy = k.getScreenHeight(context);
        bVar.Ux = k.getScreenWidth(context);
        bVar.aua = k.bU(context);
        bVar.aub = k.bV(context);
        bVar.auc = au.cx(context);
        if (z) {
            bVar.auj = bh(context);
        }
        bVar.aud = au.getDeviceId();
        bVar.aup = be.JI();
        bVar.aue = be.JQ();
        bVar.aui = y.Iw();
        com.kwad.sdk.components.f fVar = (com.kwad.sdk.components.f) com.kwad.sdk.components.c.f(com.kwad.sdk.components.f.class);
        if (fVar != null) {
            bVar.auh = fVar.nU();
        }
        bVar.auf = be.JR();
        StringBuilder sb = new StringBuilder("DeviceInfo i=");
        sb.append(eVar.getAppId());
        sb.append(",n=");
        sb.append(eVar.getAppName());
        sb.append(",external:");
        sb.append(eVar.getIsExternal());
        sb.append(",v1:");
        sb.append(eVar.getApiVersion());
        sb.append(",v2:3.3.44");
        sb.append(",d:");
        sb.append(bVar.aud);
        sb.append(",dh:");
        String str = bVar.aud;
        sb.append(str != null ? Integer.valueOf(str.hashCode()) : "");
        sb.append(",o:");
        sb.append(bVar.amK);
        sb.append(",b:489");
        sb.append(",p:");
        sb.append(ap.isInMainProcess(context));
        sb.append(",dy:");
        sb.append(com.kwad.framework.a.a.aaq);
        com.kwad.sdk.core.e.c.cW(sb.toString());
        bVar.auk = be.JS();
        bVar.aul = i;
        if (xA()) {
            bVar.aum = com.kwad.sdk.b.b.yy().getVersion(context, "com.smile.gifmaker");
            bVar.aun = com.kwad.sdk.b.b.yy().getVersion(context, "com.kuaishou.nebula");
            bVar.auo = com.kwad.sdk.b.b.yy().getVersion(context, "com.tencent.mm");
        }
        bVar.Qc = be.JO();
        bVar.atY = ae.cj(context);
        bVar.auq = be.JX();
        bVar.aur = be.fQ("/data/data");
        return bVar;
    }

    private static boolean xA() {
        return ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xA();
    }
}
