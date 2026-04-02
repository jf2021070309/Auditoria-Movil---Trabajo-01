package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.config.z;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.download.api.download.o;
import com.ss.android.download.api.model.DownloadShortInfo;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.rb;
import com.ss.android.downloadlib.rb.cu;
import com.ss.android.socialbase.appdownloader.DownloadHandlerService;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.DownloadProcessDispatcher;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class q implements bn, cu.dr {
    private static final String dr = q.class.getSimpleName();
    private final Map<Integer, Object> bn;
    private long cu;

    /* renamed from: de  reason: collision with root package name */
    private boolean f10de;
    private g g;
    private final cu ge;
    private final boolean i;
    private DownloadEventConfig il;
    private o ll;
    private SoftReference<OnItemClickListener> lp;
    private rb o;
    private WeakReference<Context> q;
    private DownloadShortInfo rb;
    private boolean t;
    private DownloadModel v;
    private final IDownloadListener wb;
    private DownloadController x;
    private DownloadInfo xu;
    private long yk;
    private SoftReference<IDownloadButtonClickListener> z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface dr {
        void dr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface ge {
        void dr(long j);
    }

    public q() {
        cu cuVar = new cu(Looper.getMainLooper(), this);
        this.ge = cuVar;
        this.bn = new ConcurrentHashMap();
        this.wb = new rb.dr(cuVar);
        this.cu = -1L;
        this.v = null;
        this.il = null;
        this.x = null;
        this.o = new rb(this);
        this.g = new g(cuVar);
        this.i = DownloadSetting.obtainGlobal().optBugFix("ttdownloader_callback_twice");
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    /* renamed from: dr */
    public q ge(Context context) {
        if (context != null) {
            this.q = new WeakReference<>(context);
        }
        wb.ge(context);
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    /* renamed from: dr */
    public q ge(int i, DownloadStatusChangeListener downloadStatusChangeListener) {
        if (downloadStatusChangeListener != null) {
            if (wb.ll().optInt("back_use_softref_listener") == 1) {
                this.bn.put(Integer.valueOf(i), downloadStatusChangeListener);
            } else {
                this.bn.put(Integer.valueOf(i), new SoftReference(downloadStatusChangeListener));
            }
        }
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    /* renamed from: dr */
    public q ge(DownloadModel downloadModel) {
        if (downloadModel != null) {
            if (downloadModel.isAd()) {
                if (downloadModel.getId() <= 0 || TextUtils.isEmpty(downloadModel.getLogExtra())) {
                    com.ss.android.downloadlib.q.o.dr().dr("setDownloadModel ad error");
                }
            } else if (downloadModel.getId() == 0 && (downloadModel instanceof AdDownloadModel)) {
                com.ss.android.downloadlib.q.o.dr().dr(false, "setDownloadModel id=0");
                if (DownloadSetting.obtainGlobal().optBugFix("fix_model_id")) {
                    ((AdDownloadModel) downloadModel).setId(downloadModel.getDownloadUrl().hashCode());
                }
            }
            com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadModel);
            this.cu = downloadModel.getId();
            this.v = downloadModel;
            if (xu.dr(downloadModel)) {
                ((AdDownloadModel) downloadModel).setExtraValue(3L);
                com.ss.android.downloadad.api.dr.ge g = com.ss.android.downloadlib.addownload.ge.bn.dr().g(this.cu);
                if (g != null && g.yk() != 3) {
                    g.q(3L);
                    com.ss.android.downloadlib.addownload.ge.ll.dr().dr(g);
                }
            }
        }
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    /* renamed from: dr */
    public q ge(DownloadController downloadController) {
        JSONObject extra;
        this.x = downloadController;
        if (com.ss.android.downloadlib.rb.q.ge(this.v).optInt("force_auto_open") == 1) {
            cu().setLinkMode(1);
        }
        if (DownloadSetting.obtainGlobal().optBugFix("fix_show_dialog") && (extra = this.v.getExtra()) != null && extra.optInt("subprocess") > 0) {
            cu().setEnableNewActivity(false);
        }
        com.ss.android.downloadlib.addownload.ge.bn.dr().dr(this.cu, cu());
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    /* renamed from: dr */
    public q ge(DownloadEventConfig downloadEventConfig) {
        this.il = downloadEventConfig;
        this.f10de = yk().getDownloadScene() == 0;
        com.ss.android.downloadlib.addownload.ge.bn.dr().dr(this.cu, yk());
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    public bn dr(OnItemClickListener onItemClickListener) {
        if (onItemClickListener == null) {
            this.lp = null;
        } else {
            this.lp = new SoftReference<>(onItemClickListener);
        }
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    public void dr() {
        this.t = true;
        com.ss.android.downloadlib.addownload.ge.bn.dr().dr(this.cu, yk());
        com.ss.android.downloadlib.addownload.ge.bn.dr().dr(this.cu, cu());
        this.o.dr(this.cu);
        x();
        if (wb.ll().optInt("enable_empty_listener", 1) == 1 && this.bn.get(Integer.MIN_VALUE) == null) {
            ge(Integer.MIN_VALUE, new com.ss.android.download.api.config.dr());
        }
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    public boolean dr(int i) {
        if (i == 0) {
            this.bn.clear();
        } else {
            this.bn.remove(Integer.valueOf(i));
        }
        if (this.bn.isEmpty()) {
            this.t = false;
            this.yk = System.currentTimeMillis();
            if (this.xu != null) {
                Downloader.getInstance(wb.getContext()).removeTaskMainListener(this.xu.getId());
            }
            o oVar = this.ll;
            if (oVar != null && oVar.getStatus() != AsyncTask.Status.FINISHED) {
                this.ll.cancel(true);
            }
            this.o.dr(this.xu);
            String str = dr;
            StringBuilder sb = new StringBuilder();
            sb.append("onUnbind removeCallbacksAndMessages, downloadUrl:");
            DownloadInfo downloadInfo = this.xu;
            sb.append(downloadInfo == null ? "" : downloadInfo.getUrl());
            com.ss.android.downloadlib.rb.t.dr(str, sb.toString(), null);
            this.ge.removeCallbacksAndMessages(null);
            this.rb = null;
            this.xu = null;
            return true;
        }
        if (this.bn.size() == 1 && this.bn.containsKey(Integer.MIN_VALUE)) {
            this.o.ge(this.xu);
        }
        return false;
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    public void dr(boolean z) {
        if (this.xu != null) {
            if (z) {
                com.ss.android.socialbase.appdownloader.o.g ge2 = com.ss.android.socialbase.appdownloader.g.wb().ge();
                if (ge2 != null) {
                    ge2.dr(this.xu);
                }
                Downloader.getInstance(DownloadComponentManager.getAppContext()).cancel(this.xu.getId(), true);
                return;
            }
            Intent intent = new Intent(wb.getContext(), DownloadHandlerService.class);
            intent.setAction("android.ss.intent.action.DOWNLOAD_DELETE");
            intent.putExtra("extra_click_download_ids", this.xu.getId());
            wb.getContext().startService(intent);
        }
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    public boolean ge() {
        return this.t;
    }

    public boolean o() {
        DownloadInfo downloadInfo = this.xu;
        return (downloadInfo == null || downloadInfo.getStatus() == 0) ? false : true;
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    public long g() {
        return this.yk;
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    public bn dr(long j) {
        if (j != 0) {
            DownloadModel dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(j);
            if (dr2 != null) {
                this.v = dr2;
                this.cu = j;
                this.o.dr(j);
            }
        } else {
            com.ss.android.downloadlib.q.o.dr().dr(false, "setModelId");
        }
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    public void ge(int i) {
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("error actionType");
        }
        this.o.dr(this.cu);
        if (!com.ss.android.downloadlib.addownload.ge.bn.dr().q(this.cu).m()) {
            com.ss.android.downloadlib.q.o.dr().dr("handleDownload ModelBox !isStrictValid");
        }
        if (!this.o.dr(getContext(), i, this.f10de)) {
            boolean o2 = o(i);
            if (i != 1) {
                if (i == 2 && !o2) {
                    String str = dr;
                    com.ss.android.downloadlib.rb.t.dr(str, "handleDownload id:" + this.cu + ",pBC:", null);
                    ge(true);
                }
            } else if (!o2) {
                String str2 = dr;
                com.ss.android.downloadlib.rb.t.dr(str2, "handleDownload id:" + this.cu + ",pIC:", null);
                o(true);
            }
        }
    }

    public boolean q() {
        return wb.ll().optInt("quick_app_enable_switch", 0) == 0 && this.v.getQuickAppModel() != null && !TextUtils.isEmpty(this.v.getQuickAppModel().dr()) && com.ss.android.downloadlib.addownload.o.dr(this.xu) && com.ss.android.downloadlib.rb.yk.dr(getContext(), new Intent("android.intent.action.VIEW", Uri.parse(this.v.getQuickAppModel().dr())));
    }

    private boolean o(int i) {
        if (q()) {
            int i2 = -1;
            String dr2 = this.v.getQuickAppModel().dr();
            if (i == 1) {
                i2 = 5;
            } else if (i == 2) {
                i2 = 4;
            }
            DownloadModel downloadModel = this.v;
            if (downloadModel instanceof AdDownloadModel) {
                ((AdDownloadModel) downloadModel).setFunnelType(3);
            }
            boolean o2 = com.ss.android.downloadlib.rb.ll.o(wb.getContext(), dr2);
            if (o2) {
                com.ss.android.downloadlib.g.dr.dr().dr(this.cu, i);
                Message obtain = Message.obtain();
                obtain.what = i2;
                obtain.obj = Long.valueOf(this.v.getId());
                com.ss.android.downloadlib.addownload.o.dr().dr(this, i2, this.v);
            } else {
                com.ss.android.downloadlib.g.dr.dr().dr(this.cu, false, 0);
            }
            return o2;
        }
        return false;
    }

    public void ge(boolean z) {
        q(z);
    }

    private void t() {
        SoftReference<OnItemClickListener> softReference = this.lp;
        if (softReference != null && softReference.get() != null) {
            this.lp.get().onItemClick(this.v, yk(), cu());
            this.lp = null;
            return;
        }
        wb.ge().dr(getContext(), this.v, cu(), yk());
    }

    public void o(boolean z) {
        if (z) {
            com.ss.android.downloadlib.g.dr.dr().dr(this.cu, 1);
        }
        v();
    }

    private void q(boolean z) {
        if (com.ss.android.downloadlib.rb.q.ge(this.v).optInt("notification_opt_2") == 1 && this.xu != null) {
            DownloadNotificationManager.getInstance().cancelNotification(this.xu.getId());
        }
        bn(z);
    }

    public void bn() {
        this.ge.post(new Runnable() { // from class: com.ss.android.downloadlib.addownload.q.1
            @Override // java.lang.Runnable
            public void run() {
                for (DownloadStatusChangeListener downloadStatusChangeListener : rb.dr(q.this.bn)) {
                    downloadStatusChangeListener.onInstalled(q.this.lp());
                }
            }
        });
    }

    @Override // com.ss.android.downloadlib.rb.cu.dr
    public void dr(Message message) {
        if (message != null && this.t && message.what == 3) {
            this.xu = (DownloadInfo) message.obj;
            this.o.dr(message, lp(), this.bn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext() {
        WeakReference<Context> weakReference = this.q;
        if (weakReference != null && weakReference.get() != null) {
            return this.q.get();
        }
        return wb.getContext();
    }

    private DownloadEventConfig yk() {
        DownloadEventConfig downloadEventConfig = this.il;
        return downloadEventConfig == null ? new o.dr().dr() : downloadEventConfig;
    }

    private DownloadController cu() {
        if (this.x == null) {
            this.x = new com.ss.android.download.api.download.ge();
        }
        return this.x;
    }

    private void v() {
        String str = dr;
        com.ss.android.downloadlib.rb.t.dr(str, "pICD", null);
        if (this.o.g(this.xu)) {
            com.ss.android.downloadlib.rb.t.dr(str, "pICD BC", null);
            bn(false);
            return;
        }
        com.ss.android.downloadlib.rb.t.dr(str, "pICD IC", null);
        t();
    }

    private void bn(final boolean z) {
        DownloadModel downloadModel;
        String str = dr;
        com.ss.android.downloadlib.rb.t.dr(str, "pBCD", null);
        if (il()) {
            com.ss.android.downloadlib.addownload.ge.q q = com.ss.android.downloadlib.addownload.ge.bn.dr().q(this.cu);
            if (this.f10de) {
                if (ll()) {
                    if (g(false) && q.g != null && q.g.isAutoDownloadOnCardShow()) {
                        dr(z, true);
                        return;
                    }
                    return;
                }
                dr(z, true);
                return;
            } else if (this.v.isAd() && q.g != null && q.g.enableShowComplianceDialog() && q.ge != null && com.ss.android.downloadlib.addownload.compliance.ge.dr().dr(q.ge) && com.ss.android.downloadlib.addownload.compliance.ge.dr().dr(q)) {
                return;
            } else {
                dr(z, true);
                return;
            }
        }
        com.ss.android.downloadlib.rb.t.dr(str, "pBCD continue download, status:" + this.xu.getStatus(), null);
        DownloadInfo downloadInfo = this.xu;
        if (downloadInfo != null && (downloadModel = this.v) != null) {
            downloadInfo.setOnlyWifi(downloadModel.isNeedWifi());
        }
        final int status = this.xu.getStatus();
        final int id = this.xu.getId();
        final com.ss.android.downloadad.api.dr.ge dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(this.xu);
        if (status == -2 || status == -1) {
            this.o.dr(this.xu, z);
            if (dr2 != null) {
                dr2.xu(System.currentTimeMillis());
                dr2.ll(this.xu.getCurBytes());
            }
            this.xu.setDownloadFromReserveWifi(false);
            this.g.dr(new com.ss.android.downloadlib.addownload.ge.q(this.cu, this.v, yk(), cu()));
            this.g.dr(id, this.xu.getCurBytes(), this.xu.getTotalBytes(), new dr() { // from class: com.ss.android.downloadlib.addownload.q.2
                @Override // com.ss.android.downloadlib.addownload.q.dr
                public void dr() {
                    if (q.this.g.dr()) {
                        return;
                    }
                    q qVar = q.this;
                    qVar.dr(id, status, qVar.xu);
                }
            });
        } else if (yk.dr(status)) {
            if (!this.v.enablePause()) {
                return;
            }
            this.g.dr(true);
            com.ss.android.downloadlib.o.xu.dr().ge(com.ss.android.downloadlib.addownload.ge.bn.dr().g(this.cu));
            com.ss.android.downloadlib.addownload.g.bn.dr().dr(dr2, status, new com.ss.android.downloadlib.addownload.g.o() { // from class: com.ss.android.downloadlib.addownload.q.3
                @Override // com.ss.android.downloadlib.addownload.g.o
                public void dr(com.ss.android.downloadad.api.dr.ge geVar) {
                    if (q.this.xu == null && DownloadSetting.obtainGlobal().optBugFix("fix_handle_pause")) {
                        q.this.xu = Downloader.getInstance(wb.getContext()).getDownloadInfo(id);
                    }
                    q.this.o.dr(q.this.xu, z);
                    if (q.this.xu != null && DownloadUtils.isWifi(wb.getContext()) && q.this.xu.isPauseReserveOnWifi()) {
                        q.this.xu.stopPauseReserveOnWifi();
                        com.ss.android.downloadlib.g.dr.dr().ge("pause_reserve_wifi_cancel_on_wifi", dr2);
                        return;
                    }
                    q qVar = q.this;
                    qVar.dr(id, status, qVar.xu);
                }
            });
        } else {
            this.o.dr(this.xu, z);
            dr(id, status, this.xu);
        }
    }

    public void dr(boolean z, final boolean z2) {
        if (z) {
            com.ss.android.downloadlib.g.dr.dr().dr(this.cu, 2);
        }
        if (!com.ss.android.downloadlib.rb.wb.ge(com.kuaishou.weapon.p0.g.j) && !cu().enableNewActivity()) {
            this.v.setFilePath(this.o.ge());
        }
        if (com.ss.android.downloadlib.rb.q.o(this.v) == 0) {
            com.ss.android.downloadlib.rb.t.dr(dr, "pBCD not start", null);
            this.o.dr(new z() { // from class: com.ss.android.downloadlib.addownload.q.4
                @Override // com.ss.android.download.api.config.z
                public void dr() {
                    com.ss.android.downloadlib.rb.t.dr(q.dr, "pBCD start download", null);
                    q.this.rb(z2);
                }

                @Override // com.ss.android.download.api.config.z
                public void dr(String str) {
                    com.ss.android.downloadlib.rb.t.dr(q.dr, "pBCD onDenied", null);
                }
            });
            return;
        }
        rb(z2);
    }

    private boolean il() {
        if (DownloadSetting.obtainGlobal().optBugFix("fix_click_start")) {
            DownloadInfo downloadInfo = this.xu;
            if (downloadInfo == null) {
                return true;
            }
            if ((downloadInfo.getStatus() == -3 && this.xu.getCurBytes() <= 0) || this.xu.getStatus() == 0 || this.xu.getStatus() == -4) {
                return true;
            }
            return DownloadUtils.isDownloadSuccessAndFileNotExist(this.xu.getStatus(), this.xu.getSavePath(), this.xu.getName());
        }
        DownloadInfo downloadInfo2 = this.xu;
        if (downloadInfo2 == null) {
            return true;
        }
        return !(downloadInfo2.getStatus() == -3 || Downloader.getInstance(wb.getContext()).canResume(this.xu.getId())) || this.xu.getStatus() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dr(int i, int i2, DownloadInfo downloadInfo) {
        if (DownloadSetting.obtainGlobal().optBugFix("fix_click_start")) {
            if (i2 != -3 && !DownloadProcessDispatcher.getInstance().canResume(i)) {
                dr(false, false);
                return;
            } else {
                com.ss.android.socialbase.appdownloader.g.wb().dr(wb.getContext(), i, i2);
                return;
            }
        }
        com.ss.android.socialbase.appdownloader.g.wb().dr(wb.getContext(), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rb(final boolean z) {
        this.g.dr(new com.ss.android.downloadlib.addownload.ge.q(this.cu, this.v, yk(), cu()));
        this.g.dr(0, 0L, 0L, new dr() { // from class: com.ss.android.downloadlib.addownload.q.5
            @Override // com.ss.android.downloadlib.addownload.q.dr
            public void dr() {
                if (!q.this.g.dr()) {
                    q.this.xu(z);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xu(boolean z) {
        for (DownloadStatusChangeListener downloadStatusChangeListener : rb.dr(this.bn)) {
            downloadStatusChangeListener.onDownloadStart(this.v, cu());
        }
        int dr2 = this.o.dr(wb.getContext(), this.wb);
        String str = dr;
        com.ss.android.downloadlib.rb.t.dr(str, "beginDown id:" + dr2, null);
        if (dr2 != 0) {
            if (this.xu == null || DownloadSetting.obtainGlobal().optBugFix("fix_click_start")) {
                if (z) {
                    this.o.dr();
                }
            } else {
                this.o.dr(this.xu, false);
            }
        } else {
            DownloadInfo build = new DownloadInfo.Builder(this.v.getDownloadUrl()).build();
            build.setStatus(-1);
            dr(build);
            com.ss.android.downloadlib.g.dr.dr().dr(this.cu, new BaseException(2, "start download failed, id=0"));
            com.ss.android.downloadlib.q.o.dr().ge("beginDown");
        }
        if (this.o.dr(o())) {
            com.ss.android.downloadlib.rb.t.dr(str, "beginDown IC id:" + dr2, null);
            t();
        }
    }

    public void rb() {
        if (this.bn.size() == 0) {
            return;
        }
        for (DownloadStatusChangeListener downloadStatusChangeListener : rb.dr(this.bn)) {
            downloadStatusChangeListener.onIdle();
        }
        DownloadInfo downloadInfo = this.xu;
        if (downloadInfo != null) {
            downloadInfo.setStatus(-4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class o extends AsyncTask<String, Void, DownloadInfo> {
        private o() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: dr */
        public DownloadInfo doInBackground(String... strArr) {
            DownloadInfo downloadInfo = null;
            if (strArr == null || (strArr.length >= 1 && TextUtils.isEmpty(strArr[0]))) {
                return null;
            }
            String str = strArr[0];
            if (q.this.v != null && !TextUtils.isEmpty(q.this.v.getFilePath())) {
                downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(str, q.this.v.getFilePath());
            }
            if (downloadInfo == null) {
                return com.ss.android.socialbase.appdownloader.g.wb().dr(wb.getContext(), str);
            }
            return downloadInfo;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: dr */
        public void onPostExecute(DownloadInfo downloadInfo) {
            super.onPostExecute(downloadInfo);
            if (!isCancelled() && q.this.v != null) {
                try {
                    com.ss.android.downloadlib.addownload.ge.o dr = com.ss.android.downloadlib.rb.yk.dr(q.this.v.getPackageName(), q.this.v.getVersionCode(), q.this.v.getVersionName());
                    com.ss.android.downloadlib.addownload.ge.xu.dr().dr(q.this.v.getVersionCode(), dr.ge(), com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo));
                    boolean dr2 = dr.dr();
                    if (downloadInfo != null && downloadInfo.getId() != 0 && (dr2 || !Downloader.getInstance(wb.getContext()).isDownloadSuccessAndFileNotExist(downloadInfo))) {
                        Downloader.getInstance(wb.getContext()).removeTaskMainListener(downloadInfo.getId());
                        if (q.this.xu == null || q.this.xu.getStatus() != -4) {
                            q.this.xu = downloadInfo;
                            if (!q.this.i) {
                                Downloader.getInstance(wb.getContext()).setMainThreadListener(q.this.xu.getId(), q.this.wb);
                            } else {
                                Downloader.getInstance(wb.getContext()).setMainThreadListener(q.this.xu.getId(), q.this.wb, false);
                            }
                        } else {
                            q.this.xu = null;
                        }
                        q.this.o.dr(q.this.xu, q.this.lp(), rb.dr(q.this.bn));
                    } else {
                        if (downloadInfo != null && Downloader.getInstance(wb.getContext()).isDownloadSuccessAndFileNotExist(downloadInfo)) {
                            DownloadNotificationManager.getInstance().cancelNotification(downloadInfo.getId());
                            q.this.xu = null;
                        }
                        if (q.this.xu != null) {
                            Downloader.getInstance(wb.getContext()).removeTaskMainListener(q.this.xu.getId());
                            if (!q.this.i) {
                                Downloader.getInstance(q.this.getContext()).setMainThreadListener(q.this.xu.getId(), q.this.wb);
                            } else {
                                Downloader.getInstance(q.this.getContext()).setMainThreadListener(q.this.xu.getId(), q.this.wb, false);
                            }
                        }
                        if (!dr2) {
                            for (DownloadStatusChangeListener downloadStatusChangeListener : rb.dr(q.this.bn)) {
                                downloadStatusChangeListener.onIdle();
                            }
                            q.this.xu = null;
                        } else {
                            q qVar = q.this;
                            qVar.xu = new DownloadInfo.Builder(qVar.v.getDownloadUrl()).build();
                            q.this.xu.setStatus(-3);
                            q.this.o.dr(q.this.xu, q.this.lp(), rb.dr(q.this.bn));
                        }
                    }
                    q.this.o.o(q.this.xu);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void dr(DownloadInfo downloadInfo) {
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.obj = downloadInfo;
        this.ge.sendMessage(obtain);
    }

    private void x() {
        o oVar = this.ll;
        if (oVar != null && oVar.getStatus() != AsyncTask.Status.FINISHED) {
            this.ll.cancel(true);
        }
        o oVar2 = new o();
        this.ll = oVar2;
        com.ss.android.downloadlib.rb.ge.dr(oVar2, this.v.getDownloadUrl(), this.v.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadShortInfo lp() {
        if (this.rb == null) {
            this.rb = new DownloadShortInfo();
        }
        return this.rb;
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    public void xu() {
        com.ss.android.downloadlib.addownload.ge.bn.dr().bn(this.cu);
    }

    @Override // com.ss.android.downloadlib.addownload.bn
    public bn dr(IDownloadButtonClickListener iDownloadButtonClickListener) {
        if (iDownloadButtonClickListener == null) {
            this.z = null;
        } else {
            this.z = new SoftReference<>(iDownloadButtonClickListener);
        }
        return this;
    }

    public boolean ll() {
        SoftReference<IDownloadButtonClickListener> softReference = this.z;
        if (softReference == null) {
            return false;
        }
        return xu.dr(this.v, softReference.get());
    }

    public boolean g(boolean z) {
        SoftReference<IDownloadButtonClickListener> softReference = this.z;
        if (softReference != null && softReference.get() != null) {
            try {
                if (!z) {
                    this.z.get().handleComplianceDialog(true);
                } else {
                    this.z.get().handleMarketFailedComplianceDialog();
                }
                this.z = null;
                return true;
            } catch (Exception e) {
                com.ss.android.downloadlib.q.o.dr().ge("mDownloadButtonClickListener has recycled");
                return false;
            }
        }
        com.ss.android.downloadlib.q.o.dr().ge("mDownloadButtonClickListener has recycled");
        return false;
    }
}
