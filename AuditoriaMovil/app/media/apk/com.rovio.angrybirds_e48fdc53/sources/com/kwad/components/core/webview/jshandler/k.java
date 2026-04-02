package com.kwad.components.core.webview.jshandler;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.text.TextUtils;
import com.kwad.components.core.t.l;
import com.umeng.analytics.pro.bg;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k implements SensorEventListener, com.kwad.sdk.core.webview.c.a {
    private Map<Integer, com.kwad.sdk.core.webview.c.c> TE = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int TH;
        public ArrayList<Float> TI;
        public int accuracy;
        public long timestamp;
        public int type;

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final void parseJson(JSONObject jSONObject) {
            if (jSONObject == null || jSONObject == null) {
                return;
            }
            this.type = jSONObject.optInt("type");
            this.TH = jSONObject.optInt(bg.aU);
            this.timestamp = jSONObject.optLong("timestamp");
            this.accuracy = jSONObject.optInt("accuracy");
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            ArrayList<Float> arrayList = new ArrayList<>();
            if (optJSONArray == null) {
                this.TI = arrayList;
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    Object obj = optJSONArray.get(i);
                    if (obj != null) {
                        arrayList.add((Float) obj);
                    }
                } catch (Throwable th) {
                }
            }
            this.TI = arrayList;
        }

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            int i = this.type;
            if (i != 0) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "type", i);
            }
            int i2 = this.TH;
            if (i2 != 0) {
                com.kwad.sdk.utils.t.putValue(jSONObject, bg.aU, i2);
            }
            long j = this.timestamp;
            if (j != 0) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "timestamp", j);
            }
            int i3 = this.accuracy;
            if (i3 != 0) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "accuracy", i3);
            }
            if (!this.TI.isEmpty()) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "values", this.TI);
            }
            return jSONObject;
        }
    }

    private void a(int i, int i2, final com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.components.core.t.l.qt().a(i, i2, this, new l.b() { // from class: com.kwad.components.core.webview.jshandler.k.1
            @Override // com.kwad.components.core.t.l.b
            public final void onFailed() {
                cVar.onError(-1, "sensor is not support");
            }
        });
    }

    private void a(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type == 4) {
            type = 2;
        } else if (type == 10) {
            type = 1;
        }
        com.kwad.sdk.core.webview.c.c cVar = this.TE.get(Integer.valueOf(type));
        if (cVar != null) {
            ArrayList<Float> arrayList = new ArrayList<>();
            for (int i = 0; i < sensorEvent.values.length; i++) {
                arrayList.add(Float.valueOf(sensorEvent.values[i]));
            }
            a aVar = new a();
            aVar.TI = arrayList;
            aVar.timestamp = sensorEvent.timestamp;
            aVar.accuracy = sensorEvent.accuracy;
            cVar.a(aVar);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (TextUtils.isEmpty(str)) {
            cVar.onError(-1, "data is empty");
            return;
        }
        a aVar = new a();
        try {
            aVar.parseJson(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.TE.put(Integer.valueOf(aVar.type), cVar);
        a(aVar.type, aVar.TH, cVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerSensorListener";
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        com.kwad.components.core.t.l.qt().a(this);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a(sensorEvent);
    }
}
