package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.a;
import com.umeng.commonsdk.internal.b;
/* loaded from: classes3.dex */
public class UMConfigureInternation {
    private static boolean isInternal = false;

    public static synchronized void sendInternal(final Context context) {
        synchronized (UMConfigureInternation.class) {
            if (context != null) {
                try {
                    if (!isInternal) {
                        new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMConfigureInternation.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                    String packageName = context.getPackageName();
                                    if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName)) {
                                        return;
                                    }
                                    if (currentProcessName.equals(packageName)) {
                                        try {
                                            if (UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                                                Context context2 = context;
                                                UMWorkDispatch.sendEvent(context2, a.n, b.a(context2).a(), null, PushUIConfig.dismissTime);
                                            }
                                        } catch (Throwable th) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                }
                            }
                        }).start();
                        isInternal = true;
                    }
                } finally {
                }
            }
        }
    }

    public static void doSelfCheck(Context context) {
        try {
            String currentProcessName = UMFrUtils.getCurrentProcessName(context);
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName)) {
                return;
            }
            if (currentProcessName.equals(packageName)) {
                try {
                    UMWorkDispatch.sendEvent(context, a.C, b.a(context).a(), null);
                } catch (Throwable th) {
                }
            }
        } catch (Throwable th2) {
        }
    }
}
