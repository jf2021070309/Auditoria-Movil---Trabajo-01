package com.kwad.sdk.core.download.b;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.kwad.sdk.DownloadTask;
import com.kwad.sdk.api.push.KsNotificationCompat;
import com.kwad.sdk.core.download.DownloadParams;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.d;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.e;
import com.kwad.sdk.utils.ar;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class a implements d {
    private static c anZ;
    private static HashMap<String, WeakReference<Bitmap>> anY = new HashMap<>();
    private static final Handler aoa = new HandlerC0253a();

    /* renamed from: com.kwad.sdk.core.download.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class HandlerC0253a extends Handler {
        private final SparseArray<Long> aob;

        HandlerC0253a() {
            super(Looper.getMainLooper());
            this.aob = new SparseArray<>();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean z = message.arg1 == 1;
            boolean z2 = message.arg2 == 1;
            boolean z3 = message.arg2 == 2;
            Long l = this.aob.get(message.what);
            NotificationManager notificationManager = (NotificationManager) com.kwad.sdk.c.wO().getContext().getSystemService("notification");
            if (notificationManager == null) {
                return;
            }
            if (com.kwad.sdk.c.wO().bL(message.what) == null && !z3) {
                removeMessages(message.what);
                notificationManager.cancel(message.what);
            } else if (!z && l != null && System.currentTimeMillis() - l.longValue() < 110) {
                sendMessageDelayed(Message.obtain(message), (l.longValue() + 110) - System.currentTimeMillis());
            } else {
                if (z2) {
                    notificationManager.cancel(message.what);
                }
                a.a(message.what, (Notification) message.obj);
                this.aob.put(message.what, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        private static String aoc = "ksad_notification_default_icon";
        private String Xp;
        private String aod;
        private String aoe;
        private String aog;
        private String name;
        private int progress;
        private File aof = null;
        private boolean aoh = false;

        private b() {
        }

        public static String AA() {
            return aoc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(DownloadTask downloadTask, String str, String str2) {
            b bVar = new b();
            Object tag = downloadTask.getTag();
            if (tag instanceof DownloadParams) {
                DownloadParams downloadParams = (DownloadParams) tag;
                File bP = ((com.kwad.sdk.service.a.c) ServiceProvider.get(com.kwad.sdk.service.a.c.class)).bP(downloadParams.mAppIcon);
                if (bP != null && bP.exists()) {
                    bVar.aof = bP;
                }
                bVar.name = downloadParams.mAppName;
            }
            bVar.aoh = downloadTask.isPaused();
            bVar.Xp = str;
            bVar.aog = str2;
            bVar.aod = a.V(downloadTask.getSmallFileSoFarBytes()) + " / " + a.V(downloadTask.getSmallFileTotalBytes());
            bVar.aoe = a.V((long) downloadTask.getSmallFileTotalBytes());
            bVar.progress = (int) ((((float) downloadTask.getSmallFileSoFarBytes()) * 100.0f) / ((float) downloadTask.getSmallFileTotalBytes()));
            return bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(DownloadParams downloadParams, String str, String str2) {
            File bP;
            b bVar = new b();
            bVar.name = downloadParams.mAppName;
            if (!TextUtils.isEmpty(downloadParams.mAppIcon) && (bP = ((com.kwad.sdk.service.a.c) ServiceProvider.get(com.kwad.sdk.service.a.c.class)).bP(downloadParams.mAppIcon)) != null && bP.exists()) {
                bVar.aof = bP;
            }
            bVar.Xp = str;
            bVar.aoe = a.V(downloadParams.mAppSize);
            bVar.aog = str2;
            return bVar;
        }

        public final String AB() {
            return this.aod;
        }

        public final String AC() {
            return this.aoe;
        }

        public final String AD() {
            return this.Xp;
        }

        public final File AE() {
            return this.aof;
        }

        public final String AF() {
            return "正在下载 " + this.progress + "%";
        }

        public final String AG() {
            return this.aog;
        }

        public final String getName() {
            String str = this.name;
            return str == null ? "" : str;
        }

        public final int getProgress() {
            return this.progress;
        }

        public final boolean isPaused() {
            return this.aoh;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {
        private static void e(Intent intent) {
            DownloadTask g = g(intent);
            if (g == null) {
                return;
            }
            com.kwad.sdk.c.wO().bN(g.getId());
        }

        private static void f(Intent intent) {
            DownloadTask g = g(intent);
            if (g == null) {
                return;
            }
            g.setNotificationRemoved(true);
        }

        private static DownloadTask g(Intent intent) {
            int i = intent.getExtras().getInt(DBDefinition.TASK_ID, 0);
            if (i == 0) {
                return null;
            }
            return com.kwad.sdk.c.wO().bL(i);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getExtras() == null) {
                return;
            }
            String action = intent.getAction();
            if ("com.ksad.action.ACTION_NOTIFICATION_CLICK_CONTROL_BTN".equals(action)) {
                e(intent);
            } else if ("com.ksad.action.ACTION_NOTIFICATION_REMOVED".equals(action)) {
                f(intent);
            }
        }
    }

    private static Bitmap A(Context context, String str) {
        WeakReference<Bitmap> weakReference = anY.get(str);
        Bitmap bitmap = weakReference != null ? weakReference.get() : null;
        if (bitmap == null || bitmap.isRecycled()) {
            Bitmap decodeResource = BitmapFactory.decodeResource(ar.cv(context), ar.ar(context, str));
            anY.put(str, new WeakReference<>(decodeResource));
            return decodeResource;
        }
        return bitmap;
    }

    private static void Az() {
        if (anZ != null) {
            return;
        }
        anZ = new c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ksad.action.ACTION_NOTIFICATION_CLICK_CONTROL_BTN");
        intentFilter.addAction("com.ksad.action.ACTION_NOTIFICATION_REMOVED");
        ServiceProvider.HA().registerReceiver(anZ, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String V(long j) {
        return String.format("%.2fMB", Float.valueOf((((float) j) / 1000.0f) / 1000.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(int i, Notification notification) {
        Az();
        NotificationManager notificationManager = (NotificationManager) ServiceProvider.HA().getSystemService("notification");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("download_channel", "ksad", 3);
                notificationChannel.enableLights(false);
                notificationChannel.enableVibration(false);
                notificationChannel.setSound(null, null);
                notificationChannel.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            notificationManager.notify(i, notification);
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    private static void a(Context context, RemoteViews remoteViews, boolean z, boolean z2, PendingIntent pendingIntent, int i, int i2, int i3) {
        KsNotificationCompat.Builder builder = new KsNotificationCompat.Builder(context, "download_channel");
        builder.setContent(remoteViews).setWhen(System.currentTimeMillis()).setOngoing(false).setAutoCancel(false).setOnlyAlertOnce(true).setPriority(-1).setContentIntent(pendingIntent).setSmallIcon(ar.ar(context, "ksad_notification_small_icon"));
        if (z2) {
            builder.setDeleteIntent(b(context, "com.ksad.action.ACTION_NOTIFICATION_REMOVED", i));
        }
        Handler handler = aoa;
        handler.removeMessages(i);
        handler.obtainMessage(i, i2, i3, builder.build()).sendToTarget();
    }

    private void a(Context context, com.kwad.sdk.core.download.b.b bVar, b bVar2) {
        bVar.setName(bVar2.getName());
        File AE = bVar2.AE();
        if (!((AE == null || !AE.exists()) ? false : a(bVar, AE))) {
            a(context, bVar, b.AA());
        }
        bVar.setStatus(bVar2.AD());
        bVar.setSize(bVar2.AC());
        bVar.setInstallText(bVar2.AG());
    }

    private void a(Context context, com.kwad.sdk.core.download.b.c cVar, b bVar) {
        cVar.setName(bVar.getName());
        File AE = bVar.AE();
        if (!((AE == null || !AE.exists()) ? false : a(cVar, AE))) {
            a(context, cVar, b.AA());
        }
        cVar.setStatus(bVar.AD());
        cVar.setSize(bVar.AB());
        cVar.setPercentNum(bVar.AF());
        cVar.setProgress(100, bVar.getProgress(), false);
        cVar.setControlBtnPaused(bVar.isPaused());
    }

    private boolean a(Context context, com.kwad.sdk.core.download.b.b bVar, String str) {
        try {
            bVar.setIcon(A(context, str));
            return true;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            com.kwad.sdk.service.c.gatherException(e);
            return false;
        }
    }

    private boolean a(Context context, com.kwad.sdk.core.download.b.c cVar, String str) {
        try {
            cVar.setIcon(A(context, str));
            return true;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            com.kwad.sdk.service.c.gatherException(e);
            return false;
        }
    }

    private boolean a(com.kwad.sdk.core.download.b.b bVar, File file) {
        try {
            bVar.setIcon(q(file));
            return true;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            com.kwad.sdk.service.c.gatherException(e);
            return false;
        }
    }

    private boolean a(com.kwad.sdk.core.download.b.c cVar, File file) {
        try {
            cVar.setIcon(q(file));
            return true;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            com.kwad.sdk.service.c.gatherException(e);
            return false;
        }
    }

    private static PendingIntent b(Context context, String str, int i) {
        Intent intent = new Intent(str);
        intent.putExtra(DBDefinition.TASK_ID, i);
        return PendingIntent.getBroadcast(context, i, intent, 0);
    }

    private static DownloadParams n(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return null;
        }
        Object tag = downloadTask.getTag();
        DownloadParams downloadParams = tag instanceof DownloadParams ? (DownloadParams) tag : new DownloadParams();
        downloadParams.mAppSize = downloadTask.getSmallFileTotalBytes();
        downloadParams.mTaskId = downloadTask.getId();
        downloadParams.filePath = downloadTask.getTargetFilePath();
        return downloadParams;
    }

    private static Bitmap q(File file) {
        String absolutePath = file.getAbsolutePath();
        WeakReference<Bitmap> weakReference = anY.get(absolutePath);
        Bitmap bitmap = weakReference != null ? weakReference.get() : null;
        if (bitmap == null || bitmap.isRecycled()) {
            Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath);
            anY.put(absolutePath, new WeakReference<>(decodeFile));
            return decodeFile;
        }
        return bitmap;
    }

    @Override // com.kwad.sdk.d
    public final void a(DownloadTask downloadTask, boolean z) {
        com.kwad.sdk.core.download.b.c a;
        Context context = ((e) ServiceProvider.get(e.class)).getContext();
        if (context == null || downloadTask.isNotificationRemoved() || (a = com.kwad.sdk.core.download.b.c.a(context, downloadTask.getId(), downloadTask.downloadEnablePause)) == null) {
            return;
        }
        a(context, a, b.a(downloadTask, "正在下载", (String) null));
        a(context, a.build(), false, true, null, downloadTask.getId(), z ? 1 : 0, downloadTask.isCompleted() ? 1 : 0);
    }

    @Override // com.kwad.sdk.d
    public final void bO(int i) {
        Context context = ((e) ServiceProvider.get(e.class)).getContext();
        if (context == null) {
            return;
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(i);
    }

    @Override // com.kwad.sdk.d
    public final void bO(String str) {
        Context context = ((e) ServiceProvider.get(e.class)).getContext();
        DownloadParams co = com.kwad.sdk.core.a.yQ().co(str);
        com.kwad.sdk.core.a.yQ().cp(str);
        if (context == null || co == null) {
            return;
        }
        com.kwad.sdk.core.a.yQ().cp(co.filePath);
        b a = b.a(co, "安装完成", "立刻打开");
        com.kwad.sdk.core.download.b.b aY = com.kwad.sdk.core.download.b.b.aY(context);
        if (aY == null) {
            return;
        }
        a(context, aY, a);
        a(context, aY.build(), false, false, com.kwad.sdk.e.m(co.mPkgname, co.mTaskId), co.mTaskId, 1, 2);
    }

    @Override // com.kwad.sdk.d
    public final void g(File file) {
        Context context = ((e) ServiceProvider.get(e.class)).getContext();
        DownloadParams co = com.kwad.sdk.core.a.yQ().co(file.getAbsolutePath());
        com.kwad.sdk.core.a.yQ().cp(file.getAbsolutePath());
        if (context == null || co == null) {
            return;
        }
        AdTemplate cq = com.kwad.sdk.core.a.yQ().cq(co.mDownloadid);
        if (cq != null) {
            cq.installFrom = "recall";
            com.kwad.sdk.core.download.c.Av().at(cq);
        }
        b a = b.a(co, "下载完成", "立即安装");
        com.kwad.sdk.core.download.b.b aY = com.kwad.sdk.core.download.b.b.aY(context);
        if (aY == null) {
            return;
        }
        a(context, aY, a);
        a(context, aY.build(), false, false, com.kwad.sdk.e.a(file, co.mTaskId, co.requestInstallPermission), co.mTaskId, 1, 2);
    }

    @Override // com.kwad.sdk.d
    public final void i(DownloadTask downloadTask) {
        Object tag = downloadTask.getTag();
        if (tag instanceof DownloadParams) {
            String str = ((DownloadParams) tag).mAppIcon;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File bP = ((com.kwad.sdk.service.a.c) ServiceProvider.get(com.kwad.sdk.service.a.c.class)).bP(str);
            if (bP == null || !bP.exists()) {
                ((com.kwad.sdk.service.a.c) ServiceProvider.get(com.kwad.sdk.service.a.c.class)).a(true, str, "", "");
            }
        }
    }

    @Override // com.kwad.sdk.d
    public final void j(DownloadTask downloadTask) {
        Context context = ((e) ServiceProvider.get(e.class)).getContext();
        if (context == null || downloadTask.isNotificationRemoved()) {
            return;
        }
        b a = b.a(downloadTask, downloadTask.getSmallFileSoFarBytes() > 0 && downloadTask.getSmallFileTotalBytes() > 0 ? "正在下载" : "准备下载", (String) null);
        com.kwad.sdk.core.download.b.c a2 = com.kwad.sdk.core.download.b.c.a(context, downloadTask.getId(), downloadTask.downloadEnablePause);
        if (a2 == null) {
            return;
        }
        a(context, a2, a);
        a(context, a2.build(), false, true, null, downloadTask.getId(), 1, downloadTask.isCompleted() ? 1 : 0);
    }

    @Override // com.kwad.sdk.d
    public final void k(DownloadTask downloadTask) {
        Context context = ((e) ServiceProvider.get(e.class)).getContext();
        if (context == null) {
            return;
        }
        DownloadParams n = n(downloadTask);
        com.kwad.sdk.core.download.b.b aY = com.kwad.sdk.core.download.b.b.aY(context);
        if (aY == null) {
            return;
        }
        a(context, aY, b.a(downloadTask, "下载完成", "立即安装"));
        com.kwad.sdk.core.a.yQ().a(downloadTask.getTargetFilePath(), n);
        com.kwad.sdk.core.a.yQ().a(n.mPkgname, n);
        a(context, aY.build(), false, false, com.kwad.sdk.e.l(downloadTask), downloadTask.getId(), 1, 1);
    }
}
