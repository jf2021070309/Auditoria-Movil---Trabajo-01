package com.kwad.sdk.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.facebook.places.model.PlaceFields;
import com.kwad.sdk.service.ServiceProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class ax {
    private static Context aJp;
    private static Map<String, j> aJq = new HashMap();
    private static b aJr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a extends j<com.kwad.sdk.k.a.b> {
        private static com.kwad.sdk.k.a.b aJs;

        public a(boolean z) {
            super(z);
        }

        private static int a(CellInfo cellInfo) {
            if (cellInfo == null) {
                return -1;
            }
            try {
                return ((CellSignalStrength) s.f(cellInfo, "getCellSignalStrength", new Object[0])).getLevel();
            } catch (Throwable th) {
                return -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.kwad.sdk.utils.j
        /* renamed from: cR */
        public com.kwad.sdk.k.a.b bR(Context context) {
            int i;
            int i2;
            if (at.IT() || ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(64L)) {
                return aJs;
            }
            com.kwad.sdk.k.a.b bVar = aJs;
            if (bVar != null) {
                return bVar;
            }
            CellInfo cellInfo = null;
            if (context == null || at.IT()) {
                return null;
            }
            int i3 = -1;
            if (Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.g) != -1) {
                if (be.checkSelfPermission(context, com.kuaishou.weapon.p0.g.g) == 0) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
                    CellLocation cellLocation = telephonyManager.getCellLocation();
                    if (cellLocation instanceof CdmaCellLocation) {
                        CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                        i2 = cdmaCellLocation.getBaseStationId();
                        i = cdmaCellLocation.getNetworkId();
                    } else if (cellLocation instanceof GsmCellLocation) {
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                        i2 = gsmCellLocation.getCid();
                        i = gsmCellLocation.getLac();
                    } else {
                        i = -1;
                        i2 = -1;
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        Iterator<CellInfo> it = telephonyManager.getAllCellInfo().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            CellInfo next = it.next();
                            if (next != null && next.isRegistered()) {
                                cellInfo = next;
                                break;
                            }
                        }
                        if (cellInfo != null) {
                            i3 = a(cellInfo);
                        }
                    }
                    aJs = new com.kwad.sdk.k.a.b(i2, i, i3);
                }
                return aJs;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b implements SensorEventListener {
        private d aJt;
        private d aJu;
        private d aJv;
        protected boolean aIm = false;
        private boolean aJw = false;

        public b(Context context) {
            try {
                cS(context);
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            }
        }

        private List<com.kwad.sdk.k.a.e> Jp() {
            ArrayList arrayList = new ArrayList();
            d dVar = this.aJt;
            if (dVar != null) {
                arrayList.add(com.kwad.sdk.k.a.e.a(dVar.Jq(), this.aJt.getTimestamp()));
            }
            d dVar2 = this.aJu;
            if (dVar2 != null) {
                arrayList.add(com.kwad.sdk.k.a.e.a(dVar2.Jq(), this.aJu.getTimestamp()));
            }
            d dVar3 = this.aJv;
            if (dVar3 != null) {
                arrayList.add(com.kwad.sdk.k.a.e.a(dVar3.Jq(), this.aJv.getTimestamp()));
            }
            return arrayList;
        }

        private static boolean a(SensorManager sensorManager, int i, SensorEventListener sensorEventListener) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(i);
            if (defaultSensor == null) {
                return false;
            }
            return sensorManager.registerListener(sensorEventListener, defaultSensor, 3);
        }

        private void cS(Context context) {
            SensorManager sensorManager;
            try {
                sensorManager = (SensorManager) context.getSystemService(com.umeng.analytics.pro.bg.ac);
            } catch (Exception e) {
                sensorManager = null;
            }
            if (sensorManager == null) {
                return;
            }
            boolean a = a(sensorManager, 1, this);
            com.kwad.sdk.core.e.c.d("SensitiveInfoCollectors", "accelerometerSensorAvailable: " + a);
            boolean a2 = a(sensorManager, 4, this);
            com.kwad.sdk.core.e.c.d("SensitiveInfoCollectors", "gyroscopeSensorAvailable : " + a2);
            boolean a3 = a(sensorManager, 9, this);
            com.kwad.sdk.core.e.c.d("SensitiveInfoCollectors", "gravitySensorAvailable : " + a3);
        }

        private synchronized List<com.kwad.sdk.k.a.e> cT(Context context) {
            final ArrayList arrayList;
            arrayList = new ArrayList();
            final SensorManager sensorManager = (SensorManager) context.getSystemService(com.umeng.analytics.pro.bg.ac);
            final CountDownLatch countDownLatch = new CountDownLatch(3);
            if (!a(sensorManager, 1, new c() { // from class: com.kwad.sdk.utils.ax.b.1
                @Override // android.hardware.SensorEventListener
                public final void onSensorChanged(SensorEvent sensorEvent) {
                    com.kwad.sdk.core.e.c.d("SensitiveInfoCollectors", "onSensorChanged, type: " + sensorEvent.sensor.getType());
                    arrayList.add(com.kwad.sdk.k.a.e.a(sensorEvent, System.currentTimeMillis()));
                    countDownLatch.countDown();
                    sensorManager.unregisterListener(this);
                }
            })) {
                countDownLatch.countDown();
            }
            if (!a(sensorManager, 4, new c() { // from class: com.kwad.sdk.utils.ax.b.2
                @Override // android.hardware.SensorEventListener
                public final void onSensorChanged(SensorEvent sensorEvent) {
                    com.kwad.sdk.core.e.c.d("SensitiveInfoCollectors", "onSensorChanged, type: " + sensorEvent.sensor.getType());
                    arrayList.add(com.kwad.sdk.k.a.e.a(sensorEvent, System.currentTimeMillis()));
                    countDownLatch.countDown();
                    sensorManager.unregisterListener(this);
                }
            })) {
                countDownLatch.countDown();
            }
            if (!a(sensorManager, 9, new c() { // from class: com.kwad.sdk.utils.ax.b.3
                @Override // android.hardware.SensorEventListener
                public final void onSensorChanged(SensorEvent sensorEvent) {
                    com.kwad.sdk.core.e.c.d("SensitiveInfoCollectors", "onSensorChanged, type: " + sensorEvent.sensor.getType());
                    arrayList.add(com.kwad.sdk.k.a.e.a(sensorEvent, System.currentTimeMillis()));
                    countDownLatch.countDown();
                    sensorManager.unregisterListener(this);
                }
            })) {
                countDownLatch.countDown();
            }
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
            }
            return arrayList;
        }

        private List<com.kwad.sdk.k.a.e> cV(Context context) {
            if (context == null) {
                return null;
            }
            return this.aJw ? cT(context) : Jp();
        }

        public final List<com.kwad.sdk.k.a.e> cU(Context context) {
            if (this.aIm) {
                return null;
            }
            try {
                return cV(context);
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                return null;
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent == null) {
                return;
            }
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                this.aJt = new d(sensorEvent);
            } else if (type == 4) {
                this.aJu = new d(sensorEvent);
            } else if (type != 9) {
            } else {
                this.aJv = new d(sensorEvent);
            }
        }
    }

    /* loaded from: classes3.dex */
    static abstract class c implements SensorEventListener {
        c() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class d {
        private SensorEvent aJA;
        private long timestamp = System.currentTimeMillis();

        public d(SensorEvent sensorEvent) {
            this.aJA = sensorEvent;
        }

        public final SensorEvent Jq() {
            return this.aJA;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class e extends j<com.kwad.sdk.k.a.f> {
        public e(boolean z) {
            super(z);
        }

        private static com.kwad.sdk.k.a.f cW(Context context) {
            com.kwad.sdk.k.a.f fVar = new com.kwad.sdk.k.a.f();
            fVar.aGF = au.cF(context);
            fVar.aGE = au.cD(context);
            return fVar;
        }

        @Override // com.kwad.sdk.utils.j
        protected final /* synthetic */ com.kwad.sdk.k.a.f bR(Context context) {
            return cW(context);
        }
    }

    public static com.kwad.sdk.k.a.b Hi() {
        if (Jo()) {
            return (com.kwad.sdk.k.a.b) fH("baseStationEnable");
        }
        return null;
    }

    public static com.kwad.sdk.k.a.f Hj() {
        if (Jo()) {
            return (com.kwad.sdk.k.a.f) fH("simCardInfoEnable");
        }
        return null;
    }

    public static List<com.kwad.sdk.k.a.e> Jj() {
        if (o.HW()) {
            Context applicationContext = ServiceProvider.getContext().getApplicationContext();
            if (aJr == null) {
                aJr = new b(applicationContext);
            }
            return aJr.cU(applicationContext);
        }
        return null;
    }

    private static boolean Jo() {
        return aJp != null;
    }

    private static <T> j<T> fG(String str) {
        try {
            return aJq.get(str);
        } catch (Exception e2) {
            return null;
        }
    }

    private static <T> T fH(String str) {
        j fG = fG(str);
        if (fG != null) {
            return (T) fG.bQ(aJp);
        }
        return null;
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        com.kwad.sdk.service.a.f fVar = (com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class);
        if (fVar == null) {
            com.kwad.sdk.core.e.c.d("SensitiveInfoCollectors", "init sdkConfigProvider is null");
        } else if (!Jo()) {
            aJp = context.getApplicationContext();
            aJq.put("baseStationEnable", new a(fVar.xv()));
            aJq.put("simCardInfoEnable", new e(fVar.xt()));
        } else {
            if (aJq.containsKey("baseStationEnable")) {
                boolean xv = fVar.xv();
                j fG = fG("baseStationEnable");
                if (fG != null) {
                    fG.aO(xv);
                }
            }
            if (aJq.containsKey("simCardInfoEnable")) {
                boolean xt = fVar.xt();
                j fG2 = fG("simCardInfoEnable");
                if (fG2 != null) {
                    fG2.aO(xt);
                }
            }
        }
    }
}
