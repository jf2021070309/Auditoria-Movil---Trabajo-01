package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
@Deprecated
/* loaded from: classes.dex */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static final String EXTRA_WAKE_LOCK_ID = "android.support.content.wakelockid";
    private static final SparseArray<PowerManager.WakeLock> sActiveWakeLocks = new SparseArray<>();
    private static int mNextId = 1;

    public static ComponentName startWakefulService(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            int id = mNextId;
            int i = id + 1;
            mNextId = i;
            if (i <= 0) {
                mNextId = 1;
            }
            intent.putExtra("android.support.content.wakelockid", id);
            ComponentName comp = context.startService(intent);
            if (comp == null) {
                return null;
            }
            PowerManager pm = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wl = pm.newWakeLock(1, "androidx.core:wake:" + comp.flattenToShortString());
            wl.setReferenceCounted(false);
            wl.acquire(60000L);
            sparseArray.put(id, wl);
            return comp;
        }
    }

    public static boolean completeWakefulIntent(Intent intent) {
        int id = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (id == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            PowerManager.WakeLock wl = sparseArray.get(id);
            if (wl != null) {
                wl.release();
                sparseArray.remove(id);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + id);
            return true;
        }
    }
}
