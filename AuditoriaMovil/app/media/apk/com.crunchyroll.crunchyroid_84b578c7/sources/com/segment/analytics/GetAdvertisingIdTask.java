package com.segment.analytics;

import android.content.ContentResolver;
import android.content.Context;
import android.os.AsyncTask;
import android.provider.Settings;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.integrations.Logger;
import java.util.concurrent.CountDownLatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class GetAdvertisingIdTask extends AsyncTask<Context, Void, Pair<String, Boolean>> {
    private final AnalyticsContext analyticsContext;
    private final CountDownLatch latch;
    private final Logger logger;

    public GetAdvertisingIdTask(AnalyticsContext analyticsContext, CountDownLatch countDownLatch, Logger logger) {
        this.analyticsContext = analyticsContext;
        this.latch = countDownLatch;
        this.logger = logger;
    }

    private Pair<String, Boolean> getAmazonFireAdvertisingID(Context context) throws Exception {
        boolean z;
        ContentResolver contentResolver = context.getContentResolver();
        if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.logger.debug("Not collecting advertising ID because limit_ad_tracking (Amazon Fire OS) is true.", new Object[0]);
            return Pair.create(null, Boolean.FALSE);
        }
        return Pair.create(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.TRUE);
    }

    private Pair<String, Boolean> getGooglePlayServicesAdvertisingID(Context context) throws Exception {
        Object invoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
        if (((Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0])).booleanValue()) {
            this.logger.debug("Not collecting advertising ID because isLimitAdTrackingEnabled (Google Play Services) is true.", new Object[0]);
            return Pair.create(null, Boolean.FALSE);
        }
        return Pair.create((String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]), Boolean.TRUE);
    }

    @Override // android.os.AsyncTask
    public Pair<String, Boolean> doInBackground(Context... contextArr) {
        Context context = contextArr[0];
        try {
            return getGooglePlayServicesAdvertisingID(context);
        } catch (Exception e) {
            this.logger.error(e, "Unable to collect advertising ID from Google Play Services.", new Object[0]);
            try {
                return getAmazonFireAdvertisingID(context);
            } catch (Exception e2) {
                this.logger.error(e2, "Unable to collect advertising ID from Amazon Fire OS.", new Object[0]);
                this.logger.debug("Unable to collect advertising ID from Amazon Fire OS and Google Play Services.", new Object[0]);
                return null;
            }
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Pair<String, Boolean> pair) {
        super.onPostExecute((GetAdvertisingIdTask) pair);
        if (pair != null) {
            try {
                AnalyticsContext.Device device = this.analyticsContext.device();
                if (device == null) {
                    this.logger.debug("Not collecting advertising ID because context.device is null.", new Object[0]);
                } else {
                    device.putAdvertisingInfo((String) pair.first, ((Boolean) pair.second).booleanValue());
                }
            } finally {
                this.latch.countDown();
            }
        }
    }
}
