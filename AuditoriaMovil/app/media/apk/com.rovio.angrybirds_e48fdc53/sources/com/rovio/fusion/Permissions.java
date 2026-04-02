package com.rovio.fusion;

import android.app.Activity;
import android.os.Looper;
import android.support.v4.app.ActivityCompat;
import java.util.HashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class Permissions {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static HashMap<Integer, PermissionCallback> s_callbacks;
    private static int s_nextRequestCode;

    /* loaded from: classes2.dex */
    public interface PermissionCallback {
        void onRequirePermissionResult(boolean z);
    }

    static {
        $assertionsDisabled = !Permissions.class.desiredAssertionStatus();
        s_nextRequestCode = Integer.MAX_VALUE;
        s_callbacks = new HashMap<>();
    }

    public static boolean require(String str) {
        return requireSync(str, null);
    }

    private static void require(String str, PermissionCallback permissionCallback) {
        requireAsync(str, null, permissionCallback);
    }

    public static void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PermissionCallback remove;
        synchronized (s_callbacks) {
            remove = s_callbacks.remove(new Integer(i));
            if (!$assertionsDisabled && remove == null) {
                throw new AssertionError();
            }
        }
        if (strArr.length == 1) {
            remove.onRequirePermissionResult(iArr[0] == 0);
        } else if (!$assertionsDisabled) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class PermissionResult implements Future<Boolean> {
        static final /* synthetic */ boolean $assertionsDisabled;
        private Boolean a;

        static {
            $assertionsDisabled = !Permissions.class.desiredAssertionStatus();
        }

        public synchronized void set(boolean z) {
            if (!$assertionsDisabled && this.a != null) {
                throw new AssertionError();
            }
            this.a = new Boolean(z);
            notifyAll();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Future
        public synchronized Boolean get() {
            return get(0L, TimeUnit.MILLISECONDS);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Future
        public synchronized Boolean get(long j, TimeUnit timeUnit) {
            Boolean bool;
            while (this.a == null) {
                try {
                    wait(timeUnit.toMillis(j));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    bool = new Boolean(false);
                }
            }
            bool = this.a;
            return bool;
        }

        @Override // java.util.concurrent.Future
        public synchronized boolean isDone() {
            return this.a != null;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }
    }

    private static boolean requireSync(String str, String str2) {
        if ($assertionsDisabled || blockingAllowed()) {
            final PermissionResult permissionResult = new PermissionResult();
            requireAsync(str, str2, new PermissionCallback() { // from class: com.rovio.fusion.Permissions.1
                @Override // com.rovio.fusion.Permissions.PermissionCallback
                public void onRequirePermissionResult(boolean z) {
                    PermissionResult.this.set(z);
                }
            });
            return permissionResult.get().booleanValue();
        }
        throw new AssertionError();
    }

    private static void requireAsync(String str, String str2, PermissionCallback permissionCallback) {
        Activity activity = Globals.getActivity();
        if (!$assertionsDisabled && activity == null) {
            throw new AssertionError();
        }
        if (ActivityCompat.checkSelfPermission(activity, str) == 0) {
            permissionCallback.onRequirePermissionResult(true);
            return;
        }
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
        }
        ActivityCompat.requestPermissions(activity, new String[]{str}, storeCallback(permissionCallback));
    }

    private static boolean blockingAllowed() {
        Thread currentThread = Thread.currentThread();
        return (currentThread == Looper.getMainLooper().getThread() || currentThread.getName() == new StringBuilder().append("GLThread ").append(currentThread.getId()).toString()) ? false : true;
    }

    private static int storeCallback(PermissionCallback permissionCallback) {
        int i;
        synchronized (s_callbacks) {
            i = s_nextRequestCode;
            s_nextRequestCode = i - 1;
            s_callbacks.put(new Integer(i), permissionCallback);
        }
        return i;
    }
}
