package com.kwad.components.core.t;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.kwad.sdk.service.ServiceProvider;
import com.umeng.analytics.pro.bg;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class l {
    private static volatile l Ru;
    private SensorManager Rv;
    private final Map<String, a> Rw = new HashMap();
    private final Map<String, Set<SensorEventListener>> Rx = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static class a implements SensorEventListener {
        private final WeakReference<l> Ry;
        private final String key;

        public a(String str, l lVar) {
            this.key = str;
            this.Ry = new WeakReference<>(lVar);
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            l lVar = this.Ry.get();
            if (lVar != null) {
                lVar.a(this.key, sensorEvent);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onFailed();
    }

    private l() {
    }

    private void a(String str, int i, Sensor sensor) {
        getSensorManager().registerListener(aC(str), sensor, aJ(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, SensorEvent sensorEvent) {
        Set<SensorEventListener> set = this.Rx.get(str);
        if (set != null) {
            for (SensorEventListener sensorEventListener : set) {
                sensorEventListener.onSensorChanged(sensorEvent);
            }
        }
    }

    private void aB(String str) {
        a aVar = this.Rw.get(str);
        if (aVar != null) {
            this.Rw.remove(str);
            getSensorManager().unregisterListener(aVar);
        }
    }

    private a aC(String str) {
        a aVar = this.Rw.get(str);
        if (aVar == null) {
            a aVar2 = new a(str, this);
            this.Rw.put(str, aVar2);
            return aVar2;
        }
        return aVar;
    }

    private Sensor aI(int i) {
        SensorManager sensorManager;
        int i2;
        if (getSensorManager() == null) {
            return null;
        }
        if (i == 1) {
            sensorManager = getSensorManager();
            i2 = 10;
        } else if (i != 2) {
            return null;
        } else {
            sensorManager = getSensorManager();
            i2 = 4;
        }
        return sensorManager.getDefaultSensor(i2);
    }

    private static int aJ(int i) {
        if (i != -3) {
            if (i != -2) {
                return i != -1 ? 3 : 0;
            }
            return 1;
        }
        return 2;
    }

    private SensorManager getSensorManager() {
        if (this.Rv == null) {
            this.Rv = (SensorManager) ServiceProvider.getContext().getSystemService(bg.ac);
        }
        return this.Rv;
    }

    private static String l(int i, int i2) {
        return i + "_" + i2;
    }

    public static l qt() {
        if (Ru == null) {
            synchronized (l.class) {
                if (Ru == null) {
                    Ru = new l();
                }
            }
        }
        return Ru;
    }

    public final void a(int i, int i2, SensorEventListener sensorEventListener, b bVar) {
        Sensor aI = aI(i);
        if (aI == null) {
            bVar.onFailed();
            return;
        }
        String l = l(i, i2);
        Set<SensorEventListener> set = this.Rx.get(l);
        if (set != null) {
            set.add(sensorEventListener);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(sensorEventListener);
        this.Rx.put(l, hashSet);
        a(l, i2, aI);
    }

    public final void a(SensorEventListener sensorEventListener) {
        for (Map.Entry<String, Set<SensorEventListener>> entry : this.Rx.entrySet()) {
            Iterator<SensorEventListener> it = entry.getValue().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().equals(sensorEventListener)) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            if (entry.getValue().size() == 0) {
                aB(entry.getKey());
            }
        }
    }
}
