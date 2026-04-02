package com.facebook.ads.internal.util.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ch.qos.logback.core.net.SyslogConstants;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.redexgen.X.AnonymousClass90;
import com.facebook.ads.redexgen.X.C04398z;
import com.facebook.ads.redexgen.X.C1045Xn;
import com.facebook.ads.redexgen.X.C1046Xo;
import com.facebook.ads.redexgen.X.JQ;
import com.facebook.ads.redexgen.X.LK;
import com.facebook.ads.redexgen.X.LM;
import com.facebook.ads.redexgen.X.LN;
import com.facebook.ads.redexgen.X.LR;
import com.facebook.ads.redexgen.X.MF;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: assets/audience_network.dex */
public final class ActivityUtils implements Application.ActivityLifecycleCallbacks {
    public static Context A01;
    public static C1045Xn A02;
    public static byte[] A03;
    public static String[] A04 = {"ouMPsLdF8VOzsynXqmRiTnVq9sCULlEK", "RDluICFSUJyOT3sC2lXOFgStPQc7gg7Y", "UmtUlnThENixw5hdz8sG1KFdsGmJDk97", "fTn296Ch3TXxkAVBDyGQxp9TrJ", "IUqXVRs0X8uhoFuXuWrDHC", "AqSoSQ8lTXl56yd6tw1FPxb5AEpw6", "5ylHfIThOZnGyEtaFkstDkkPbeVs18fd", "i0x"};
    public static final LR A05;
    public static final List<LN> A06;
    public static final List<Runnable> A07;
    public static final Map<Activity, Integer> A08;
    public final Class<? extends Activity> A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "4AKSMNDzmxTAf23dNNcZP8";
            strArr2[7] = "cH1";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 12);
            i5++;
        }
    }

    public static void A02() {
        A03 = new byte[]{54, 58, 91, 121, 110, 115, 108, 115, 110, 99, 32, 58, 92, 80, 2, 21, 22, 74, 80, 115, 81, 70, 91, 68, 91, 70, 75, 18, 86, 91, 65, 81, 64, 87, 66, 83, 92, 81, 91, 87, 65, 28, 55, 6, 6, 53, 25, 24, 2, 19, 14, 2, 86, 31, 5, 86, 24, 25, 2, 86, 55, 6, 6, 26, 31, 21, 23, 2, 31, 25, 24, 88, 40, 4, 5, 8, 30, 25, 25, 14, 5, 31, 75, 6, 4, 15, 2, 13, 2, 8, 10, 31, 2, 4, 5, 75, 14, 19, 8, 14, 27, 31, 2, 4, 5, 75, 31, 3, 25, 4, 28, 5, 15, 30, 25, 2, 5, 12, 75, 25, 14, 12, 2, 24, 31, 14, 25, 42, 8, 31, 2, 29, 2, 31, 18, 40, 10, 7, 7, 9, 10, 8, 0, 24, 39, 2, 24, 31, 14, 5, 14, 25, 10, 41, 33, 101, 36, 38, 49, 44, 51, 44, 49, 60, 101, 54, 49, 36, 49, 32, Byte.MAX_VALUE, 101, 115, 66, 86, 80, 70, 71, 3, 66, 64, 87, 74, 85, 74, 87, 90, 3, 74, 80, 3, 77, 76, 87, 3, 81, 70, 80, 86, 78, 70, 71, 13, 74, 125, 107, 34, 56, 31, 29, 10, 33, 11, 10, 23, 18, 4, 21, 12};
    }

    static {
        A02();
        A08 = Collections.synchronizedMap(new WeakHashMap());
        A06 = Collections.synchronizedList(new ArrayList());
        A07 = new ArrayList();
        A05 = LR.A00();
    }

    public ActivityUtils(Class<? extends Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    @Nullable
    public static synchronized Activity A00() {
        synchronized (ActivityUtils.class) {
            Activity lastResumedActivity = null;
            Iterator<Map.Entry<Activity, Integer>> it = A08.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Activity, Integer> next = it.next();
                if (next.getValue().intValue() == 3) {
                    Activity lastResumedActivity2 = next.getKey();
                    lastResumedActivity = lastResumedActivity2;
                    break;
                }
            }
            Activity activity = null;
            boolean z = lastResumedActivity == null || Build.VERSION.SDK_INT < 28;
            if (z) {
                activity = LK.A00();
            }
            if (A02 != null && z && lastResumedActivity != activity) {
                String A012 = A01(19, 23, 62);
                AnonymousClass90 anonymousClass90 = new AnonymousClass90(A012, A01(203, 5, 20) + lastResumedActivity + A01(12, 7, 124) + activity);
                anonymousClass90.A03(1);
                A02.A06().A8y(A01(208, 8, 114), C04398z.A01, anonymousClass90);
            }
            return lastResumedActivity != null ? lastResumedActivity : activity;
        }
    }

    public static void A03(@NonNull C1046Xo c1046Xo) {
        if (!JQ.A17(c1046Xo) || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        LM lm = new LM(c1046Xo);
        synchronized (A07) {
            A07.add(lm);
        }
        MF.A01.A01().postDelayed(lm, 2000L);
    }

    public static synchronized void A04(C1045Xn c1045Xn, Class<? extends Activity> cls) {
        synchronized (ActivityUtils.class) {
            A02 = c1045Xn;
            A01 = c1045Xn.getApplicationContext();
            if (A01 instanceof Application) {
                ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
                if (aNActivityLifecycleCallbacksListener != null) {
                    Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                    synchronized (activityStateMap) {
                        try {
                            A08.putAll(activityStateMap);
                        } catch (ConcurrentModificationException unused) {
                            c1045Xn.A06().A8y(A01(208, 8, 114), C04398z.A00, new AnonymousClass90(A01(72, 80, FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT)));
                        }
                    }
                    ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(c1045Xn);
                }
                ((Application) A01).registerActivityLifecycleCallbacks(new ActivityUtils(cls));
            } else {
                c1045Xn.A06().A8y(A01(216, 3, 105), C04398z.A0V, new AnonymousClass90(A01(42, 30, 122)));
            }
        }
    }

    public static void A05(LN ln) {
        A06.add(ln);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A08.put(activity, 1);
        for (LN ln : A06) {
            ln.onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        Integer num = A08.get(activity);
        if (num == null || num.intValue() != 3) {
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A01(172, 31, 47), A01(SyslogConstants.LOG_LOCAL3, 20, 73) + num + A01(0, 12, 22) + activity);
            anonymousClass90.A03(0);
            A02.A06().A8y(A01(208, 8, 114), C04398z.A01, anonymousClass90);
        }
        A08.put(activity, 4);
        if (activity.getClass() != this.A00) {
            synchronized (A07) {
                arrayList = new ArrayList(A07);
                A07.clear();
            }
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                if (A04[0].charAt(23) == 's') {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[4] = "UBshke7O6W3uGW5erxsbv0";
                strArr[7] = "uKB";
                if (!hasNext) {
                    break;
                }
                MF.A01.A01().removeCallbacks((Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A08.put(activity, 5);
    }
}
