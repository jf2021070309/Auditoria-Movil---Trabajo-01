package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.amazon.aps.iva.p8.d;
import com.amazon.aps.iva.p8.e;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int b = 0;
    public final HashMap<Integer, String> c = new HashMap<>();
    public final a d = new a();
    public final b e = new b();

    /* loaded from: classes.dex */
    public class a extends RemoteCallbackList<d> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(d dVar, Object obj) {
            MultiInstanceInvalidationService.this.c.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    public class b extends e {
        public b() {
        }

        public final void o0(String[] strArr, int i) {
            synchronized (MultiInstanceInvalidationService.this.d) {
                String str = MultiInstanceInvalidationService.this.c.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.d.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.d.getBroadcastCookie(i2)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.c.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.d.getBroadcastItem(i2).e(strArr);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                MultiInstanceInvalidationService.this.d.finishBroadcast();
            }
        }

        public final int p0(d dVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.d) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.b + 1;
                multiInstanceInvalidationService.b = i;
                if (multiInstanceInvalidationService.d.register(dVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.c.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.b--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.e;
    }
}
