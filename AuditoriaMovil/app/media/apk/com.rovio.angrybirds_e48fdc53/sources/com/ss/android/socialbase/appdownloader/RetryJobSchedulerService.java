package com.ss.android.socialbase.appdownloader;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.impls.RetryScheduler;
import com.ss.android.socialbase.downloader.logger.Logger;
/* loaded from: classes3.dex */
public class RetryJobSchedulerService extends JobService {
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        DownloadComponentManager.setAppContext(this);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters != null) {
            int jobId = jobParameters.getJobId();
            Logger.i("RetrySchedulerService", "onStartJob, id = " + jobId);
            RetryScheduler.getInstance().doSchedulerRetry(jobId);
            return false;
        }
        return false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (DownloadComponentManager.notAutoRebootService()) {
            return 2;
        }
        return onStartCommand;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: all -> 0x00bf, TryCatch #1 {all -> 0x00bf, blocks: (B:14:0x002a, B:26:0x0049, B:28:0x0051, B:32:0x0071, B:34:0x0082, B:35:0x0085, B:37:0x008f, B:39:0x0095, B:41:0x00a3, B:43:0x00a8, B:17:0x0035), top: B:49:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #1 {all -> 0x00bf, blocks: (B:14:0x002a, B:26:0x0049, B:28:0x0051, B:32:0x0071, B:34:0x0082, B:35:0x0085, B:37:0x008f, B:39:0x0095, B:41:0x00a3, B:43:0x00a8, B:17:0x0035), top: B:49:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void dr(com.ss.android.socialbase.downloader.model.DownloadInfo r11, long r12, boolean r14, int r15) {
        /*
            if (r11 == 0) goto Lc4
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto La
            goto Lc4
        La:
            android.content.Context r2 = com.ss.android.socialbase.downloader.downloader.DownloadComponentManager.getAppContext()
            if (r2 != 0) goto L11
            return
        L11:
            boolean r3 = r11.isPauseReserveOnWifi()
            r4 = 3
            r5 = 2
            if (r3 == 0) goto L2a
            android.content.Context r3 = com.ss.android.socialbase.downloader.downloader.DownloadComponentManager.getAppContext()
            com.ss.android.socialbase.downloader.downloader.Downloader r3 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r3)
            com.ss.android.socialbase.downloader.downloader.IReserveWifiStatusListener r3 = r3.getReserveWifiStatusListener()
            if (r3 == 0) goto L2a
            r3.onStatusChanged(r11, r5, r4)
        L2a:
            java.lang.String r3 = "jobscheduler"
            java.lang.Object r3 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> Lbf
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3     // Catch: java.lang.Throwable -> Lbf
            if (r3 != 0) goto L35
            return
        L35:
            int r6 = r11.getId()     // Catch: java.lang.Throwable -> L3d
            r3.cancel(r6)     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Throwable -> Lbf
        L41:
            if (r15 == 0) goto L4e
            if (r14 == 0) goto L49
            if (r15 == r5) goto L49
            goto L4e
        L49:
            r6 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 + r12
            goto L51
        L4e:
            r12 = 1000(0x3e8, double:4.94E-321)
            r6 = r0
        L51:
            android.app.job.JobInfo$Builder r15 = new android.app.job.JobInfo$Builder     // Catch: java.lang.Throwable -> Lbf
            int r8 = r11.getId()     // Catch: java.lang.Throwable -> Lbf
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> Lbf
            java.lang.Class<com.ss.android.socialbase.appdownloader.RetryJobSchedulerService> r10 = com.ss.android.socialbase.appdownloader.RetryJobSchedulerService.class
            java.lang.String r10 = r10.getName()     // Catch: java.lang.Throwable -> Lbf
            r9.<init>(r2, r10)     // Catch: java.lang.Throwable -> Lbf
            r15.<init>(r8, r9)     // Catch: java.lang.Throwable -> Lbf
            android.app.job.JobInfo$Builder r12 = r15.setMinimumLatency(r12)     // Catch: java.lang.Throwable -> Lbf
            if (r14 == 0) goto L70
            goto L71
        L70:
            r5 = 1
        L71:
            android.app.job.JobInfo$Builder r12 = r12.setRequiredNetworkType(r5)     // Catch: java.lang.Throwable -> Lbf
            r13 = 0
            android.app.job.JobInfo$Builder r12 = r12.setRequiresCharging(r13)     // Catch: java.lang.Throwable -> Lbf
            android.app.job.JobInfo$Builder r12 = r12.setRequiresDeviceIdle(r13)     // Catch: java.lang.Throwable -> Lbf
            int r13 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r13 <= 0) goto L85
            r12.setOverrideDeadline(r6)     // Catch: java.lang.Throwable -> Lbf
        L85:
            android.app.job.JobInfo r12 = r12.build()     // Catch: java.lang.Throwable -> Lbf
            int r12 = r3.schedule(r12)     // Catch: java.lang.Throwable -> Lbf
            if (r12 <= 0) goto La6
            boolean r13 = r11.isPauseReserveOnWifi()     // Catch: java.lang.Throwable -> Lbf
            if (r13 == 0) goto La6
            android.content.Context r13 = com.ss.android.socialbase.downloader.downloader.DownloadComponentManager.getAppContext()     // Catch: java.lang.Throwable -> Lbf
            com.ss.android.socialbase.downloader.downloader.Downloader r13 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r13)     // Catch: java.lang.Throwable -> Lbf
            com.ss.android.socialbase.downloader.downloader.IReserveWifiStatusListener r13 = r13.getReserveWifiStatusListener()     // Catch: java.lang.Throwable -> Lbf
            if (r13 == 0) goto La6
            r13.onStatusChanged(r11, r4, r4)     // Catch: java.lang.Throwable -> Lbf
        La6:
            if (r12 > 0) goto Lbe
            java.lang.String r11 = "RetrySchedulerService"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbf
            r13.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r14 = "schedule err errCode = "
            r13.append(r14)     // Catch: java.lang.Throwable -> Lbf
            r13.append(r12)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> Lbf
            com.ss.android.socialbase.downloader.logger.Logger.w(r11, r12)     // Catch: java.lang.Throwable -> Lbf
        Lbe:
            goto Lc3
        Lbf:
            r11 = move-exception
            r11.printStackTrace()
        Lc3:
            return
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.RetryJobSchedulerService.dr(com.ss.android.socialbase.downloader.model.DownloadInfo, long, boolean, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void dr(int i) {
        Context appContext = DownloadComponentManager.getAppContext();
        if (appContext == null) {
            return;
        }
        try {
            JobScheduler jobScheduler = (JobScheduler) appContext.getSystemService("jobscheduler");
            if (jobScheduler == null) {
                return;
            }
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
