package com.kwad.sdk.utils;

import android.text.TextUtils;
import com.kwad.sdk.core.request.model.StatusInfo;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.internal.api.SplashExtraDataImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class b {
    public static int HC() {
        String Is = y.Is();
        if (TextUtils.isEmpty(Is)) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(Is);
            int optInt = jSONObject.optInt("currentDailyCount");
            if (b(jSONObject.optLong("lastShowTimestamp"), System.currentTimeMillis())) {
                return optInt;
            }
            return 0;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            return 0;
        }
    }

    private static boolean b(long j, long j2) {
        if (j > 0 && j2 > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return simpleDateFormat.format(new Date(j)).equals(simpleDateFormat.format(new Date(j2)));
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            }
        }
        return false;
    }

    public static StatusInfo.SplashStyleControl c(SceneImpl sceneImpl) {
        StatusInfo.SplashStyleControl splashStyleControl = new StatusInfo.SplashStyleControl();
        if (sceneImpl != null && e(sceneImpl)) {
            SplashExtraDataImpl splashExtraDataImpl = sceneImpl.splashExtraData;
            splashStyleControl.disableShake = splashExtraDataImpl.disableShake;
            splashStyleControl.disableRotate = splashExtraDataImpl.disableRotate;
            splashStyleControl.disableSlide = splashExtraDataImpl.disableSlide;
            return splashStyleControl;
        }
        return null;
    }

    public static StatusInfo.NativeAdStyleControl d(SceneImpl sceneImpl) {
        StatusInfo.NativeAdStyleControl nativeAdStyleControl = new StatusInfo.NativeAdStyleControl();
        if (sceneImpl == null || sceneImpl.nativeAdExtraData == null) {
            return null;
        }
        nativeAdStyleControl.enableShake = sceneImpl.nativeAdExtraData.enableShake;
        return nativeAdStyleControl;
    }

    private static boolean e(SceneImpl sceneImpl) {
        return sceneImpl.splashExtraData != null;
    }
}
