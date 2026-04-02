package com.kwai.adclient.kscommerciallogger;

import com.kwai.adclient.kscommerciallogger.model.c;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class a {
    private com.kwai.adclient.kscommerciallogger.a.a aMY;
    private com.kwai.adclient.kscommerciallogger.a.b aMZ;
    private JSONObject aNa;
    private boolean aNb;
    private boolean isDebug;

    /* renamed from: com.kwai.adclient.kscommerciallogger.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0277a {
        private static a aNc;

        public static a KU() {
            if (aNc == null) {
                aNc = new a((byte) 0);
            }
            return aNc;
        }
    }

    private a() {
        this.isDebug = false;
        this.aNb = false;
    }

    /* synthetic */ a(byte b) {
        this();
    }

    public static a KU() {
        return C0277a.KU();
    }

    private void d(c cVar) {
        com.kwai.adclient.kscommerciallogger.a.a aVar = this.aMY;
        if (aVar != null) {
            String tag = cVar.getTag();
            String str = cVar.KY() == null ? "" : cVar.KY().value;
            Object[] objArr = new Object[5];
            objArr[0] = cVar.KZ() == null ? "" : cVar.KZ().value;
            objArr[1] = cVar.La() != null ? cVar.La().getValue() : "";
            objArr[2] = cVar.Ld();
            objArr[3] = b.Q(cVar.Lb());
            objArr[4] = b.Q(cVar.Lc());
            aVar.P(tag, str);
        }
    }

    public final JSONObject KV() {
        return this.aNa;
    }

    public final boolean KW() {
        return this.aNb;
    }

    public final void a(com.kwai.adclient.kscommerciallogger.a.a aVar, com.kwai.adclient.kscommerciallogger.a.b bVar, JSONObject jSONObject, boolean z, boolean z2) {
        this.aMY = aVar;
        this.aMZ = bVar;
        this.aNa = null;
        this.isDebug = z;
        this.aNb = z2;
    }

    public final void c(c cVar) {
        if (cVar == null) {
            this.aMY.Q("KSCommercialLogger", "rl rtLog is null please check it");
            return;
        }
        d(cVar);
        com.kwai.adclient.kscommerciallogger.a.b bVar = this.aMZ;
        if (bVar != null) {
            bVar.R(cVar.KX(), cVar.toString());
        }
    }

    public final boolean isDebug() {
        return this.isDebug;
    }
}
