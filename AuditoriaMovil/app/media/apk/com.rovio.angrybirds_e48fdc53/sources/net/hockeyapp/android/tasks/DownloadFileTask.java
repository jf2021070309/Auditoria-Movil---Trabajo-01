package net.hockeyapp.android.tasks;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StrictMode;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.R;
import net.hockeyapp.android.listeners.DownloadFileListener;
/* loaded from: classes4.dex */
public class DownloadFileTask extends AsyncTask<Void, Integer, Long> {
    protected static final int MAX_REDIRECTS = 6;
    protected Context mContext;
    protected DownloadFileListener mNotifier;
    protected ProgressDialog mProgressDialog;
    protected String mUrlString;
    protected String mFilename = UUID.randomUUID() + ".apk";
    protected String mFilePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download";
    private String a = null;

    public DownloadFileTask(Context context, String str, DownloadFileListener downloadFileListener) {
        this.mContext = context;
        this.mUrlString = str;
        this.mNotifier = downloadFileListener;
    }

    public void attach(Context context) {
        this.mContext = context;
    }

    public void detach() {
        this.mContext = null;
        this.mProgressDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2 A[Catch: IOException -> 0x00f6, TRY_LEAVE, TryCatch #2 {IOException -> 0x00f6, blocks: (B:51:0x00ed, B:53:0x00f2), top: B:69:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Long doInBackground(java.lang.Void... r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.hockeyapp.android.tasks.DownloadFileTask.doInBackground(java.lang.Void[]):java.lang.Long");
    }

    protected void setConnectionProperties(HttpURLConnection httpURLConnection) {
        httpURLConnection.addRequestProperty("User-Agent", Constants.SDK_USER_AGENT);
        httpURLConnection.setInstanceFollowRedirects(true);
        if (Build.VERSION.SDK_INT <= 9) {
            httpURLConnection.setRequestProperty("connection", "close");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public URLConnection createConnection(URL url, int i) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        setConnectionProperties(httpURLConnection);
        int responseCode = httpURLConnection.getResponseCode();
        if ((responseCode == 301 || responseCode == 302 || responseCode == 303) && i != 0) {
            URL url2 = new URL(httpURLConnection.getHeaderField("Location"));
            if (!url.getProtocol().equals(url2.getProtocol())) {
                httpURLConnection.disconnect();
                return createConnection(url2, i - 1);
            }
            return httpURLConnection;
        }
        return httpURLConnection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onProgressUpdate(Integer... numArr) {
        try {
            if (this.mProgressDialog == null) {
                this.mProgressDialog = new ProgressDialog(this.mContext);
                this.mProgressDialog.setProgressStyle(1);
                this.mProgressDialog.setMessage("Loading...");
                this.mProgressDialog.setCancelable(false);
                this.mProgressDialog.show();
            }
            this.mProgressDialog.setProgress(numArr[0].intValue());
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Long l) {
        String str;
        if (this.mProgressDialog != null) {
            try {
                this.mProgressDialog.dismiss();
            } catch (Exception e) {
            }
        }
        if (l.longValue() > 0) {
            this.mNotifier.downloadSuccessful(this);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.fromFile(new File(this.mFilePath, this.mFilename)), AdBaseConstants.MIME_APK);
            intent.setFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
            StrictMode.VmPolicy vmPolicy = null;
            if (Build.VERSION.SDK_INT >= 24) {
                vmPolicy = StrictMode.getVmPolicy();
                StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().penaltyLog().build());
            }
            this.mContext.startActivity(intent);
            if (vmPolicy != null) {
                StrictMode.setVmPolicy(vmPolicy);
                return;
            }
            return;
        }
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
            builder.setTitle(R.string.hockeyapp_download_failed_dialog_title);
            if (this.a == null) {
                str = this.mContext.getString(R.string.hockeyapp_download_failed_dialog_message);
            } else {
                str = this.a;
            }
            builder.setMessage(str);
            builder.setNegativeButton(R.string.hockeyapp_download_failed_dialog_negative_button, new DialogInterface.OnClickListener() { // from class: net.hockeyapp.android.tasks.DownloadFileTask.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    DownloadFileTask.this.mNotifier.downloadFailed(DownloadFileTask.this, false);
                }
            });
            builder.setPositiveButton(R.string.hockeyapp_download_failed_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: net.hockeyapp.android.tasks.DownloadFileTask.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    DownloadFileTask.this.mNotifier.downloadFailed(DownloadFileTask.this, true);
                }
            });
            builder.create().show();
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getURLString() {
        return this.mUrlString + "&type=apk";
    }
}
