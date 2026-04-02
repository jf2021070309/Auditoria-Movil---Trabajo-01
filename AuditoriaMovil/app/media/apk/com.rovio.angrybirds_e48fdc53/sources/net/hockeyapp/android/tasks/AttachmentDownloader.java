package net.hockeyapp.android.tasks;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.objects.FeedbackAttachment;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.ImageUtils;
import net.hockeyapp.android.views.AttachmentView;
/* loaded from: classes4.dex */
public class AttachmentDownloader {
    private Queue<b> a;
    private boolean b;

    /* loaded from: classes4.dex */
    private static class a {
        public static final AttachmentDownloader a = new AttachmentDownloader();

        private a() {
        }
    }

    public static AttachmentDownloader getInstance() {
        return a.a;
    }

    private AttachmentDownloader() {
        this.a = new LinkedList();
        this.b = false;
    }

    public void download(FeedbackAttachment feedbackAttachment, AttachmentView attachmentView) {
        this.a.add(new b(feedbackAttachment, attachmentView));
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        b peek;
        if (!this.b && (peek = this.a.peek()) != null) {
            c cVar = new c(peek, new Handler() { // from class: net.hockeyapp.android.tasks.AttachmentDownloader.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    final b bVar = (b) AttachmentDownloader.this.a.poll();
                    if (!bVar.c() && bVar.e()) {
                        postDelayed(new Runnable() { // from class: net.hockeyapp.android.tasks.AttachmentDownloader.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AttachmentDownloader.this.a.add(bVar);
                                AttachmentDownloader.this.a();
                            }
                        }, 3000L);
                    }
                    AttachmentDownloader.this.b = false;
                    AttachmentDownloader.this.a();
                }
            });
            this.b = true;
            AsyncTaskUtils.execute(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class b {
        private final FeedbackAttachment a;
        private final AttachmentView b;
        private boolean c;
        private int d;

        private b(FeedbackAttachment feedbackAttachment, AttachmentView attachmentView) {
            this.a = feedbackAttachment;
            this.b = attachmentView;
            this.c = false;
            this.d = 2;
        }

        public FeedbackAttachment a() {
            return this.a;
        }

        public AttachmentView b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }

        public void a(boolean z) {
            this.c = z;
        }

        public boolean d() {
            return this.d > 0;
        }

        public boolean e() {
            int i = this.d - 1;
            this.d = i;
            return i >= 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class c extends AsyncTask<Void, Integer, Boolean> {
        private final b a;
        private final Handler b;
        private File c = Constants.getHockeyAppStorageDir();
        private Bitmap d = null;
        private int e = 1;

        public c(b bVar, Handler handler) {
            this.a = bVar;
            this.b = handler;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            FeedbackAttachment a = this.a.a();
            if (a.isAvailableInCache()) {
                HockeyLog.error("Cached...");
                a();
                return true;
            }
            HockeyLog.error("Downloading...");
            boolean a2 = a(a.getUrl(), a.getCacheId());
            if (a2) {
                a();
            }
            return Boolean.valueOf(a2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onProgressUpdate(Integer... numArr) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            AttachmentView b = this.a.b();
            this.a.a(bool.booleanValue());
            if (bool.booleanValue()) {
                b.setImage(this.d, this.e);
            } else if (!this.a.d()) {
                b.signalImageLoadingError();
            }
            this.b.sendEmptyMessage(0);
        }

        private void a() {
            try {
                String cacheId = this.a.a().getCacheId();
                AttachmentView b = this.a.b();
                this.e = ImageUtils.determineOrientation(new File(this.c, cacheId));
                this.d = ImageUtils.decodeSampledBitmap(new File(this.c, cacheId), this.e == 0 ? b.getWidthLandscape() : b.getWidthPortrait(), this.e == 0 ? b.getMaxHeightLandscape() : b.getMaxHeightPortrait());
            } catch (IOException e) {
                e.printStackTrace();
                this.d = null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00c6 A[Catch: IOException -> 0x00cf, TRY_LEAVE, TryCatch #6 {IOException -> 0x00cf, blocks: (B:53:0x00c1, B:55:0x00c6), top: B:81:0x00c1 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean a(java.lang.String r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.hockeyapp.android.tasks.AttachmentDownloader.c.a(java.lang.String, java.lang.String):boolean");
        }

        private URLConnection a(URL url) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.addRequestProperty("User-Agent", Constants.SDK_USER_AGENT);
            httpURLConnection.setInstanceFollowRedirects(true);
            if (Build.VERSION.SDK_INT <= 9) {
                httpURLConnection.setRequestProperty("connection", "close");
            }
            return httpURLConnection;
        }
    }
}
