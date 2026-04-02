package com.kwad.components.core.request.model;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import com.kwad.sdk.k.a.d;
import com.kwad.sdk.k.a.e;
import com.kwad.sdk.k.a.f;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.AbiUtil;
import com.kwad.sdk.utils.au;
import com.kwad.sdk.utils.be;
import com.kwad.sdk.utils.bq;
import com.kwad.sdk.utils.n;
import com.kwad.sdk.utils.t;
import com.umeng.analytics.pro.bg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b implements com.kwad.sdk.core.b {
    private int PR;
    private String PS;
    private int PT;
    private Long PU;
    private Long PV;
    private Long PW;
    private Long PX;
    private String PY;
    private String PZ;
    private long Qb;
    private String Qc;
    private String Qd;
    private long Qe;
    private String Qg;
    private String Qh;
    private boolean Qi;
    private List<a> Qk;
    private f Ql;
    private d Qm;
    private com.kwad.sdk.k.a.b Qn;
    private List<e> Qo;
    private List<bq.a> Qa = new CopyOnWriteArrayList();
    private int Qf = -1;
    private float screenBrightness = -1.0f;
    private int Qj = -1;

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
        public int Qp = -1;
        public int Qq = -1;
        public int Qr = -1;
        public int streamType;

        private a(int i) {
            this.streamType = i;
        }

        private static int aD(int i) {
            if (i != 0) {
                if (i == 1) {
                    return 1;
                }
                if (i == 2) {
                    return 2;
                }
                if (i == 3) {
                    return 3;
                }
                if (i == 4) {
                    return 4;
                }
                if (i == 5) {
                    return 5;
                }
            }
            return 0;
        }

        public static List<a> aj(Context context) {
            AudioManager audioManager;
            ArrayList arrayList = new ArrayList();
            if (context == null || com.kwad.sdk.core.config.d.Q(256L)) {
                return arrayList;
            }
            try {
                audioManager = (AudioManager) context.getSystemService("audio");
            } catch (Exception e) {
            }
            if (audioManager == null) {
                return arrayList;
            }
            for (int i = 0; i <= 5; i++) {
                a aVar = new a(i);
                int aD = aD(i);
                aVar.Qr = audioManager.getStreamVolume(aD);
                aVar.Qp = audioManager.getStreamMaxVolume(aD);
                if (Build.VERSION.SDK_INT >= 28) {
                    aVar.Qq = audioManager.getStreamMinVolume(aD);
                }
                arrayList.add(aVar);
            }
            return arrayList;
        }
    }

    private void ai(Context context) {
        if (com.kwad.sdk.core.config.d.Q(512L)) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = context.registerReceiver(null, intentFilter);
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.Qi = intExtra == 2 || intExtra == 5;
            int intExtra2 = registerReceiver.getIntExtra("plugged", -1);
            if (intExtra2 == 2) {
                this.Qj = 1;
            } else if (intExtra2 == 1) {
                this.Qj = 2;
            } else if (intExtra2 == 4) {
                this.Qj = 3;
            } else if (intExtra2 == 0) {
                this.Qj = 0;
            }
        }
    }

    private static Context getContext() {
        return ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext();
    }

    public static b pM() {
        b bVar = new b();
        bVar.PR = be.JG();
        bVar.PS = AbiUtil.bF(getContext());
        bVar.PT = be.db(getContext());
        bVar.PU = Long.valueOf(be.dc(getContext()));
        bVar.PV = Long.valueOf(be.da(getContext()));
        bVar.PW = Long.valueOf(be.JD());
        bVar.PX = Long.valueOf(be.JE());
        bVar.PY = au.cB(getContext());
        bVar.PZ = au.cC(getContext());
        bVar.Qa.addAll(au.m(getContext(), 15));
        bVar.Qb = be.JK();
        bVar.Qe = be.JL();
        bVar.Qh = be.JM();
        bVar.Qg = be.JN();
        bVar.Qc = be.JO();
        bVar.Qd = be.JP();
        Context context = getContext();
        if (context != null) {
            bVar.Qf = be.dj(context);
            bVar.Qk = new CopyOnWriteArrayList(a.aj(context));
            bVar.ai(context);
        }
        bVar.Qm = n.HS();
        bVar.Qn = au.Hi();
        List<e> Jj = au.Jj();
        if (Jj != null) {
            bVar.Qo = new CopyOnWriteArrayList(Jj);
        }
        bVar.Ql = au.Hj();
        return bVar;
    }

    @Override // com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
    }

    @Override // com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, "cpuCount", this.PR);
        t.putValue(jSONObject, "cpuAbi", this.PS);
        t.putValue(jSONObject, "batteryPercent", this.PT);
        t.putValue(jSONObject, "totalMemorySize", this.PU.longValue());
        t.putValue(jSONObject, "availableMemorySize", this.PV.longValue());
        t.putValue(jSONObject, "totalDiskSize", this.PW.longValue());
        t.putValue(jSONObject, "availableDiskSize", this.PX.longValue());
        t.putValue(jSONObject, "imsi", this.PY);
        t.putValue(jSONObject, bg.aa, this.PZ);
        t.putValue(jSONObject, "wifiList", this.Qa);
        t.putValue(jSONObject, "bootTime", this.Qb);
        t.putValue(jSONObject, "romName", this.Qc);
        t.putValue(jSONObject, "romVersion", this.Qd);
        t.putValue(jSONObject, "romBuildTimestamp", this.Qe);
        t.putValue(jSONObject, "ringerMode", this.Qf);
        t.putValue(jSONObject, "audioStreamInfo", this.Qk);
        t.putValue(jSONObject, "baseBandVersion", this.Qg);
        t.putValue(jSONObject, "fingerPrint", this.Qh);
        t.putValue(jSONObject, "screenBrightness", this.screenBrightness);
        t.putValue(jSONObject, "isCharging", this.Qi);
        t.putValue(jSONObject, "chargeType", this.Qj);
        f fVar = this.Ql;
        if (fVar != null) {
            t.a(jSONObject, "simCardInfo", fVar);
        }
        d dVar = this.Qm;
        if (dVar != null) {
            t.a(jSONObject, "environmentInfo", dVar);
        }
        com.kwad.sdk.k.a.b bVar = this.Qn;
        if (bVar != null) {
            t.a(jSONObject, "baseStationInfo", bVar);
        }
        List<e> list = this.Qo;
        if (list != null) {
            t.putValue(jSONObject, "sensorEventInfoList", list);
        }
        return jSONObject;
    }
}
