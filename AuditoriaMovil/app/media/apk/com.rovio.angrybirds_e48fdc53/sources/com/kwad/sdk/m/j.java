package com.kwad.sdk.m;

import android.app.Application;
import android.content.Context;
import com.kwad.sdk.api.core.ResContext;
import com.kwad.sdk.api.loader.Wrapper;
import com.kwad.sdk.service.ServiceProvider;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context as(Context context) {
        return ((ResContext) context).getDelegatedContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean at(Context context) {
        return context instanceof ResContext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context dq(Context context) {
        Context applicationContext = unwrapContextIfNeed(context).getApplicationContext();
        if (applicationContext instanceof Application) {
            return applicationContext;
        }
        for (int i = 0; i < 10; i++) {
            applicationContext = applicationContext.getApplicationContext();
            if (applicationContext instanceof Application) {
                return applicationContext;
            }
            if (at(applicationContext)) {
                applicationContext = as(applicationContext);
            }
        }
        return applicationContext;
    }

    public static void onDestroy(Context context) {
        Wrapper.onDestroy(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context unwrapContextIfNeed(Context context) {
        if (at(context)) {
            context = as(context);
        }
        if (at(context)) {
            RuntimeException runtimeException = null;
            for (int i = 0; i < 10; i++) {
                if (runtimeException == null) {
                    boolean hasInitFinish = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).hasInitFinish();
                    RuntimeException runtimeException2 = new RuntimeException("expect normalContext --context:" + context.getClass().getName() + "--initFinish:" + hasInitFinish);
                    ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(runtimeException2);
                    runtimeException = runtimeException2;
                }
                context = as(context);
                if (!at(context)) {
                    return context;
                }
            }
            return context;
        }
        return context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context wrapContextIfNeed(Context context) {
        return Wrapper.wrapContextIfNeed(context);
    }
}
