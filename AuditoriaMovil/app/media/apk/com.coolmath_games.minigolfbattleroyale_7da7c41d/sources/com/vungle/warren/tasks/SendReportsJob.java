package com.vungle.warren.tasks;

import android.os.Bundle;
import android.util.Log;
import com.google.gson.JsonObject;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.Report;
import com.vungle.warren.network.Response;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import java.io.IOException;
import java.util.List;
/* loaded from: classes2.dex */
public class SendReportsJob implements Job {
    private static final long DEFAULT_DELAY = 30000;
    static final String TAG = SendReportsJob.class.getCanonicalName();
    private Repository repository;
    private VungleApiClient vungleApiClient;

    public SendReportsJob(Repository repository, VungleApiClient vungleApiClient) {
        this.repository = repository;
        this.vungleApiClient = vungleApiClient;
    }

    public static JobInfo makeJobInfo(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("sendAll", z);
        return new JobInfo(TAG).setExtras(bundle).setPriority(5).setReschedulePolicy(30000L, 1);
    }

    @Override // com.vungle.warren.tasks.Job
    public int onRunJob(Bundle bundle, JobRunner jobRunner) {
        List<Report> list;
        Response<JsonObject> execute;
        if (bundle.getBoolean("sendAll", false)) {
            list = this.repository.loadAllReportToSend().get();
        } else {
            list = this.repository.loadReadyOrFailedReportToSend().get();
        }
        if (list == null) {
            return 1;
        }
        for (Report report : list) {
            try {
                execute = this.vungleApiClient.reportAd(report.toReportBody()).execute();
            } catch (DatabaseHelper.DBException unused) {
            } catch (IOException e) {
                Log.d(TAG, "SendReportsJob: IOEx");
                for (Report report2 : list) {
                    report2.setStatus(3);
                    try {
                        this.repository.save(report2);
                    } catch (DatabaseHelper.DBException unused2) {
                        return 1;
                    }
                }
                Log.e(TAG, Log.getStackTraceString(e));
                return 2;
            }
            if (execute.code() == 200) {
                this.repository.delete(report);
            } else {
                report.setStatus(3);
                this.repository.save(report);
                long retryAfterHeaderValue = this.vungleApiClient.getRetryAfterHeaderValue(execute);
                if (retryAfterHeaderValue > 0) {
                    jobRunner.execute(makeJobInfo(false).setDelay(retryAfterHeaderValue));
                    return 1;
                }
            }
        }
        return 0;
    }
}
