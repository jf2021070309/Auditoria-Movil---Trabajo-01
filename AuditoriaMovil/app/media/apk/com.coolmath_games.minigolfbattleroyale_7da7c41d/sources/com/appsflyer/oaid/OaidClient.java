package com.appsflyer.oaid;

import android.content.Context;
import android.os.Build;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class OaidClient {
    private final Context context;
    private final Logger logger;
    private final long timeout;
    private final TimeUnit unit;

    public OaidClient(Context context, long j, TimeUnit timeUnit) {
        Logger logger = Logger.getLogger("AppsFlyerOaid6.2.4");
        this.logger = logger;
        this.context = context;
        this.timeout = j;
        this.unit = timeUnit;
        logger.setLevel(Level.OFF);
    }

    public OaidClient(Context context) {
        this(context, 1L, TimeUnit.SECONDS);
    }

    private static boolean isHuawei() {
        try {
            if (!Build.BRAND.equalsIgnoreCase("huawei")) {
                if (((Integer) Class.forName("com.huawei.android.os.BuildEx$VERSION").getDeclaredField("EMUI_SDK_INT").get(null)).intValue() <= 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    private static boolean isMsaAvailableAtRuntime() {
        try {
            IIdentifierListener.class.getName();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public Info fetch() {
        Info fetchMsa;
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (isHuawei()) {
                fetchMsa = fetchHuawei();
            } else {
                fetchMsa = isMsaAvailableAtRuntime() ? OaidMsaClient.fetchMsa(this.context, this.logger, this.timeout, this.unit) : null;
            }
            Logger logger = this.logger;
            logger.info("Fetch " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            return fetchMsa;
        } catch (Throwable th) {
            this.logger.info(th.getMessage());
            return null;
        }
    }

    private Info fetchHuawei() {
        try {
            FutureTask futureTask = new FutureTask(new Callable<Info>() { // from class: com.appsflyer.oaid.OaidClient.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Info call() {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(OaidClient.this.context);
                    if (advertisingIdInfo == null) {
                        return null;
                    }
                    return new Info(advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                }
            });
            new Thread(futureTask).start();
            return (Info) futureTask.get(this.timeout, this.unit);
        } catch (Throwable th) {
            this.logger.info(th.getMessage());
            return null;
        }
    }

    public void setLogging(boolean z) {
        this.logger.setLevel(z ? null : Level.OFF);
    }

    /* loaded from: classes.dex */
    public static class Info {
        private final String id;
        private final Boolean lat;

        public Info(String str, Boolean bool) {
            this.id = str;
            this.lat = bool;
        }

        public Info(String str) {
            this(str, null);
        }

        public String getId() {
            return this.id;
        }

        public Boolean getLat() {
            return this.lat;
        }
    }
}
