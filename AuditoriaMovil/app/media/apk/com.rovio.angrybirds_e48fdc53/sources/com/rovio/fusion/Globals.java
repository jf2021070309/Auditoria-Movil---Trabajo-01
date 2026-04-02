package com.rovio.fusion;

import android.app.Activity;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.rovio.fusionapp.Gen;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class Globals {
    private static final boolean ENABLE_LOGGING = false;
    private static ViewGroup m_rootViewGroup;
    private static Activity m_activity = null;
    private static ActivityState m_activityState = ActivityState.CREATED;
    private static ArrayList<ActivityListener> m_activityListeners = new ArrayList<>();
    private static ArrayList<Runnable> m_runnableQueue = new ArrayList<>();
    private static String mLibraryName = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum ActivityState {
        CREATED,
        STARTED,
        RESUMED,
        PAUSED,
        STOPPED,
        DESTROYED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface InvokeListener {
        void invoke(ActivityListener activityListener);
    }

    public static void setActivity(Activity activity) {
        m_activity = activity;
    }

    public static Activity getActivity() {
        if (m_activity == null) {
            throw new IllegalStateException("The Activity instance has not been set.");
        }
        return m_activity;
    }

    public static int getAPILevel() {
        return Build.VERSION.SDK_INT;
    }

    public static ConnectivityManager getConnectivityManager() {
        return (ConnectivityManager) m_activity.getSystemService("connectivity");
    }

    public static String getPathToFileCacheDirectory() {
        return getActivity().getCacheDir().getAbsolutePath() + '/';
    }

    private static void invokeActivityListeners(InvokeListener invokeListener) {
        ActivityListener[] activityListenerArr;
        synchronized (m_activityListeners) {
            activityListenerArr = new ActivityListener[m_activityListeners.size()];
            m_activityListeners.toArray(activityListenerArr);
        }
        for (ActivityListener activityListener : activityListenerArr) {
            invokeListener.invoke(activityListener);
        }
    }

    public static void onStart() {
        m_activityState = ActivityState.STARTED;
        invokeActivityListeners(new InvokeListener() { // from class: com.rovio.fusion.Globals.1
            @Override // com.rovio.fusion.Globals.InvokeListener
            public void invoke(ActivityListener activityListener) {
                activityListener.onStart();
            }
        });
    }

    public static void onResume() {
        m_activityState = ActivityState.RESUMED;
        invokeActivityListeners(new InvokeListener() { // from class: com.rovio.fusion.Globals.2
            @Override // com.rovio.fusion.Globals.InvokeListener
            public void invoke(ActivityListener activityListener) {
                activityListener.onResume();
            }
        });
    }

    public static void onPause() {
        m_activityState = ActivityState.PAUSED;
        invokeActivityListeners(new InvokeListener() { // from class: com.rovio.fusion.Globals.3
            @Override // com.rovio.fusion.Globals.InvokeListener
            public void invoke(ActivityListener activityListener) {
                activityListener.onPause();
            }
        });
    }

    public static void onStop() {
        m_activityState = ActivityState.STOPPED;
        invokeActivityListeners(new InvokeListener() { // from class: com.rovio.fusion.Globals.4
            @Override // com.rovio.fusion.Globals.InvokeListener
            public void invoke(ActivityListener activityListener) {
                activityListener.onStop();
            }
        });
    }

    public static void onDestroy() {
        m_activityState = ActivityState.DESTROYED;
        invokeActivityListeners(new InvokeListener() { // from class: com.rovio.fusion.Globals.5
            @Override // com.rovio.fusion.Globals.InvokeListener
            public void invoke(ActivityListener activityListener) {
                activityListener.onDestroy();
            }
        });
    }

    public static void onActivityResult(final int i, final int i2, final Intent intent) {
        invokeActivityListeners(new InvokeListener() { // from class: com.rovio.fusion.Globals.6
            @Override // com.rovio.fusion.Globals.InvokeListener
            public void invoke(ActivityListener activityListener) {
                activityListener.onActivityResult(i, i2, intent);
            }
        });
    }

    public static void onNewIntent(final Intent intent) {
        invokeActivityListeners(new InvokeListener() { // from class: com.rovio.fusion.Globals.7
            @Override // com.rovio.fusion.Globals.InvokeListener
            public void invoke(ActivityListener activityListener) {
                activityListener.onNewIntent(intent);
            }
        });
    }

    /* loaded from: classes2.dex */
    static class DispatchStatus {
        boolean a = false;

        public void set(boolean z) {
            this.a = z;
        }

        public boolean value() {
            return this.a;
        }
    }

    public static boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final DispatchStatus dispatchStatus = new DispatchStatus();
        invokeActivityListeners(new InvokeListener() { // from class: com.rovio.fusion.Globals.8
            @Override // com.rovio.fusion.Globals.InvokeListener
            public void invoke(ActivityListener activityListener) {
                DispatchStatus.this.set(DispatchStatus.this.value() || activityListener.dispatchKeyEvent(keyEvent));
            }
        });
        return dispatchStatus.value();
    }

    public static boolean isStarted() {
        return m_activityState == ActivityState.STARTED || isResumed() || isPaused();
    }

    public static boolean isResumed() {
        return m_activityState == ActivityState.RESUMED;
    }

    public static boolean isPaused() {
        return m_activityState == ActivityState.PAUSED;
    }

    public static boolean isStopped() {
        return m_activityState == ActivityState.STOPPED;
    }

    public static ViewGroup getRootViewGroup() {
        if (m_rootViewGroup == null) {
            m_rootViewGroup = new RelativeLayout(getActivity());
            m_activity.addContentView(m_rootViewGroup, new ViewGroup.LayoutParams(-1, -1));
        }
        return m_rootViewGroup;
    }

    public static void runOnGLThread(Runnable runnable) {
        runOnAppThread(runnable);
    }

    public static void runOnAppThread(Runnable runnable) {
        synchronized (m_runnableQueue) {
            m_runnableQueue.add(runnable);
        }
    }

    public static void runAppThreadRunnables() {
        synchronized (m_runnableQueue) {
            if (m_runnableQueue.size() != 0) {
                Runnable[] runnableArr = new Runnable[m_runnableQueue.size()];
                m_runnableQueue.toArray(runnableArr);
                m_runnableQueue.clear();
                for (Runnable runnable : runnableArr) {
                    runnable.run();
                }
            }
        }
    }

    public static void registerActivityListener(ActivityListener activityListener) {
        if (activityListener != null) {
            synchronized (m_activityListeners) {
                m_activityListeners.add(activityListener);
            }
        }
    }

    public static void unregisterActivityListener(ActivityListener activityListener) {
        synchronized (m_activityListeners) {
            m_activityListeners.remove(activityListener);
        }
    }

    public static void loadLibraries() {
        newInstanceIfAvailable("com.rovio.fusion.Haptics");
        Debug("System.loadLibrary(" + getLibraryName() + ")");
        System.loadLibrary(getLibraryName());
    }

    public static String getLibraryName() {
        if (mLibraryName == null) {
            mLibraryName = Gen.library_name;
        }
        return mLibraryName;
    }

    public static void setLibraryName(String str) {
        mLibraryName = str;
    }

    public static Object newInstanceIfAvailable(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Debug("Class " + str + " available, creating instance ...");
            return cls.newInstance();
        } catch (Exception e) {
            Debug("Class " + str + " not available");
            return null;
        }
    }

    /* loaded from: classes2.dex */
    private static class CompatWrapper extends ActivityListener {
        IActivityListener a;

        public CompatWrapper(IActivityListener iActivityListener) {
            this.a = iActivityListener;
        }

        @Override // com.rovio.fusion.ActivityListener, com.rovio.fusion.IActivityListener
        public void onResume() {
            this.a.onResume();
        }

        @Override // com.rovio.fusion.ActivityListener, com.rovio.fusion.IActivityListener
        public void onPause() {
            this.a.onPause();
        }

        @Override // com.rovio.fusion.ActivityListener, com.rovio.fusion.IActivityListener
        public void onDestroy() {
            this.a.onDestroy();
        }

        @Override // com.rovio.fusion.ActivityListener, com.rovio.fusion.IActivityListener
        public void onNewIntent(Intent intent) {
            this.a.onNewIntent(intent);
        }

        @Override // com.rovio.fusion.ActivityListener, com.rovio.fusion.IActivityListener
        public void onActivityResult(int i, int i2, Intent intent) {
            this.a.onActivityResult(i, i2, intent);
        }
    }

    public static void registerActivityListener(IActivityListener iActivityListener) {
        registerActivityListener((ActivityListener) new CompatWrapper(iActivityListener));
    }

    public static void unregisterActivityListener(IActivityListener iActivityListener) {
        unregisterActivityListener((ActivityListener) new CompatWrapper(iActivityListener));
    }

    private static void Debug(String str) {
    }
}
