package com.vungle.warren.analytics;

import com.google.gson.JsonObject;
import com.vungle.warren.tasks.AnalyticsJob;
import com.vungle.warren.tasks.JobRunner;
/* loaded from: classes2.dex */
public class JobDelegateAnalytics implements AdAnalytics {
    private final JobRunner jobRunner;

    @Override // com.vungle.warren.analytics.AdAnalytics
    public void saveVungleUrls(String[] strArr) {
    }

    public JobDelegateAnalytics(JobRunner jobRunner) {
        this.jobRunner = jobRunner;
    }

    @Override // com.vungle.warren.analytics.AdAnalytics
    public String[] ping(String[] strArr) {
        this.jobRunner.execute(AnalyticsJob.makeJob(3, null, strArr, 0));
        this.jobRunner.execute(AnalyticsJob.makeJob(1, null, strArr, 1));
        return new String[0];
    }

    @Override // com.vungle.warren.analytics.AdAnalytics
    public void ri(JsonObject jsonObject) {
        this.jobRunner.execute(AnalyticsJob.makeJob(0, jsonObject.toString(), null, 1));
    }

    @Override // com.vungle.warren.analytics.AdAnalytics
    public String[] retryUnsent() {
        this.jobRunner.execute(AnalyticsJob.makeJob(2, null, null, 1));
        return new String[0];
    }
}
