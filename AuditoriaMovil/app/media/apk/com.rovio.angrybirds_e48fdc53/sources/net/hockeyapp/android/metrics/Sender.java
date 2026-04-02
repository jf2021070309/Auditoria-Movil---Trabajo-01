package net.hockeyapp.android.metrics;

import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.HockeyLog;
/* loaded from: classes4.dex */
public class Sender {
    private AtomicInteger a = new AtomicInteger(0);
    private String b;
    protected WeakReference<b> mWeakPersistence;

    /* JADX INFO: Access modifiers changed from: protected */
    public void triggerSending() {
        if (requestCount() < 10) {
            try {
                AsyncTaskUtils.execute(new AsyncTask<Void, Void, Void>() { // from class: net.hockeyapp.android.metrics.Sender.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    /* renamed from: a */
                    public Void doInBackground(Void... voidArr) {
                        Sender.this.sendAvailableFiles();
                        return null;
                    }
                });
                return;
            } catch (RejectedExecutionException e) {
                HockeyLog.error("Could not send events. Executor rejected async task.", e);
                return;
            }
        }
        HockeyLog.debug("HockeyApp-Metrics", "We have already 10 pending requests, not sending anything.");
    }

    protected void triggerSendingForTesting(final HttpURLConnection httpURLConnection, final File file, final String str) {
        if (requestCount() < 10) {
            this.a.getAndIncrement();
            AsyncTaskUtils.execute(new AsyncTask<Void, Void, Void>() { // from class: net.hockeyapp.android.metrics.Sender.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                /* renamed from: a */
                public Void doInBackground(Void... voidArr) {
                    Sender.this.send(httpURLConnection, file, str);
                    return null;
                }
            });
        }
    }

    protected void sendAvailableFiles() {
        if (getPersistence() != null) {
            File b = getPersistence().b();
            String loadData = loadData(b);
            HttpURLConnection createConnection = createConnection();
            if (loadData != null && createConnection != null) {
                send(createConnection, b, loadData);
            }
            if (createConnection != null) {
                createConnection.disconnect();
            }
        }
    }

    protected void send(HttpURLConnection httpURLConnection, File file, String str) {
        if (httpURLConnection != null && file != null && str != null) {
            try {
                this.a.getAndIncrement();
                a(httpURLConnection, str);
                httpURLConnection.connect();
                onResponse(httpURLConnection, httpURLConnection.getResponseCode(), str, file);
            } catch (IOException e) {
                HockeyLog.debug("HockeyApp-Metrics", "Couldn't send data with " + e.toString());
                this.a.getAndDecrement();
                if (getPersistence() != null) {
                    HockeyLog.debug("HockeyApp-Metrics", "Persisting because of IOException: We're probably offline.");
                    getPersistence().c(file);
                }
            } catch (SecurityException e2) {
                HockeyLog.debug("HockeyApp-Metrics", "Couldn't send data with " + e2.toString());
                this.a.getAndDecrement();
                if (getPersistence() != null) {
                    HockeyLog.debug("HockeyApp-Metrics", "Persisting because of SecurityException: Missing INTERNET permission or the user might have removed the internet permission.");
                    getPersistence().c(file);
                }
            }
        }
    }

    protected String loadData(File file) {
        String str = null;
        if (getPersistence() != null && file != null && (str = getPersistence().a(file)) != null && str.isEmpty()) {
            getPersistence().b(file);
        }
        return str;
    }

    protected HttpURLConnection createConnection() {
        HttpURLConnection httpURLConnection;
        IOException e;
        URL url;
        try {
            if (getCustomServerURL() == null) {
                url = new URL("https://gate.hockeyapp.net/v2/track");
            } else {
                url = new URL(this.b);
                if (url == null) {
                    url = new URL("https://gate.hockeyapp.net/v2/track");
                }
            }
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (IOException e2) {
            httpURLConnection = null;
            e = e2;
        }
        try {
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty(DownloadUtils.CONTENT_TYPE, "application/x-json-stream");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
        } catch (IOException e3) {
            e = e3;
            HockeyLog.error("HockeyApp-Metrics", "Could not open connection for provided URL with exception: ", e);
            return httpURLConnection;
        }
        return httpURLConnection;
    }

    protected void onResponse(HttpURLConnection httpURLConnection, int i, String str, File file) {
        this.a.getAndDecrement();
        HockeyLog.debug("HockeyApp-Metrics", "response code " + Integer.toString(i));
        if (isRecoverableError(i)) {
            HockeyLog.debug("HockeyApp-Metrics", "Recoverable error (probably a server error), persisting data:\n" + str);
            if (getPersistence() != null) {
                getPersistence().c(file);
                return;
            }
            return;
        }
        if (getPersistence() != null) {
            getPersistence().b(file);
        }
        StringBuilder sb = new StringBuilder();
        if (isExpected(i)) {
            triggerSending();
        } else {
            onUnexpected(httpURLConnection, i, sb);
        }
    }

    protected boolean isRecoverableError(int i) {
        return Arrays.asList(Integer.valueOf((int) TTAdConstant.INTERACTION_TYPE_CODE), 429, Integer.valueOf((int) TTAdConstant.SHOW_POLL_TIME_SPLASH_DEFAULT), 503, 511).contains(Integer.valueOf(i));
    }

    protected boolean isExpected(int i) {
        return 200 <= i && i <= 203;
    }

    protected void onUnexpected(HttpURLConnection httpURLConnection, int i, StringBuilder sb) {
        String format = String.format(Locale.ROOT, "Unexpected response code: %d", Integer.valueOf(i));
        sb.append(format);
        sb.append("\n");
        HockeyLog.error("HockeyApp-Metrics", format);
        readResponse(httpURLConnection, sb);
    }

    private void a(HttpURLConnection httpURLConnection, String str) {
        Writer writer = null;
        if (httpURLConnection != null && str != null) {
            try {
                HockeyLog.debug("HockeyApp-Metrics", "Sending payload:\n" + str);
                HockeyLog.debug("HockeyApp-Metrics", "Using URL:" + httpURLConnection.getURL().toString());
                writer = getWriter(httpURLConnection);
                writer.write(str);
                writer.flush();
            } catch (Throwable th) {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        HockeyLog.error("HockeyApp-Metrics", "Couldn't close writer with: " + e.toString());
                    }
                }
                throw th;
            }
        }
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e2) {
                HockeyLog.error("HockeyApp-Metrics", "Couldn't close writer with: " + e2.toString());
            }
        }
    }

    protected void readResponse(HttpURLConnection httpURLConnection, StringBuilder sb) {
        String responseMessage;
        StringBuffer stringBuffer = new StringBuffer();
        InputStream inputStream = null;
        try {
            try {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnection.getInputStream();
                }
                if (errorStream != null) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        stringBuffer.append(readLine);
                    }
                    responseMessage = stringBuffer.toString();
                } else {
                    responseMessage = httpURLConnection.getResponseMessage();
                }
                if (!TextUtils.isEmpty(responseMessage)) {
                    HockeyLog.verbose(responseMessage);
                } else {
                    HockeyLog.verbose("HockeyApp-Metrics", "Couldn't log response, result is null or empty string");
                }
                if (errorStream != null) {
                    try {
                        errorStream.close();
                    } catch (IOException e) {
                        HockeyLog.error("HockeyApp-Metrics", e.toString());
                    }
                }
            } catch (IOException e2) {
                HockeyLog.error("HockeyApp-Metrics", e2.toString());
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        HockeyLog.error("HockeyApp-Metrics", e3.toString());
                    }
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    HockeyLog.error("HockeyApp-Metrics", e4.toString());
                }
            }
            throw th;
        }
    }

    protected Writer getWriter(HttpURLConnection httpURLConnection) {
        if (Build.VERSION.SDK_INT >= 19) {
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.setRequestProperty(DownloadUtils.CONTENT_TYPE, "application/x-json-stream");
            return new OutputStreamWriter(new GZIPOutputStream(httpURLConnection.getOutputStream(), true), "UTF-8");
        }
        return new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
    }

    protected b getPersistence() {
        if (this.mWeakPersistence == null) {
            return null;
        }
        return this.mWeakPersistence.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPersistence(b bVar) {
        this.mWeakPersistence = new WeakReference<>(bVar);
    }

    protected int requestCount() {
        return this.a.get();
    }

    protected String getCustomServerURL() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setCustomServerURL(String str) {
        this.b = str;
    }
}
