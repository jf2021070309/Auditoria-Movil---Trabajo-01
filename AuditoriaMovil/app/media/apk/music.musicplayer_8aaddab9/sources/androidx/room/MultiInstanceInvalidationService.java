package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import c.v.c;
import c.v.d;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<Integer, String> f635b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final RemoteCallbackList<c> f636c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final d f637d = new b();

    /* loaded from: classes.dex */
    public class a extends RemoteCallbackList<c> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(c cVar, Object obj) {
            MultiInstanceInvalidationService.this.f635b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    public class b extends d {
        public b() {
        }

        public int R0(c cVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f636c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i2 = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i2;
                if (multiInstanceInvalidationService.f636c.register(cVar, Integer.valueOf(i2))) {
                    MultiInstanceInvalidationService.this.f635b.put(Integer.valueOf(i2), str);
                    return i2;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.a--;
                return 0;
            }
        }

        public void S0(c cVar, int i2) {
            synchronized (MultiInstanceInvalidationService.this.f636c) {
                MultiInstanceInvalidationService.this.f636c.unregister(cVar);
                MultiInstanceInvalidationService.this.f635b.remove(Integer.valueOf(i2));
            }
        }

        public void s0(int i2, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f636c) {
                String str = MultiInstanceInvalidationService.this.f635b.get(Integer.valueOf(i2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f636c.beginBroadcast();
                for (int i3 = 0; i3 < beginBroadcast; i3++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f636c.getBroadcastCookie(i3)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f635b.get(Integer.valueOf(intValue));
                    if (i2 != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f636c.getBroadcastItem(i3).D(strArr);
                        } catch (RemoteException e2) {
                            Log.w("ROOM", "Error invoking a remote callback", e2);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f636c.finishBroadcast();
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f637d;
    }
}
