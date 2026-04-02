package net.hockeyapp.android.tasks;

import android.content.Context;
import java.io.IOException;
import java.net.URL;
import net.hockeyapp.android.listeners.DownloadFileListener;
/* loaded from: classes4.dex */
public class GetFileSizeTask extends DownloadFileTask {
    private long a;

    public GetFileSizeTask(Context context, String str, DownloadFileListener downloadFileListener) {
        super(context, str, downloadFileListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.hockeyapp.android.tasks.DownloadFileTask, android.os.AsyncTask
    public Long doInBackground(Void... voidArr) {
        try {
            return Long.valueOf(createConnection(new URL(getURLString()), 6).getContentLength());
        } catch (IOException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.hockeyapp.android.tasks.DownloadFileTask, android.os.AsyncTask
    public void onProgressUpdate(Integer... numArr) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.hockeyapp.android.tasks.DownloadFileTask, android.os.AsyncTask
    public void onPostExecute(Long l) {
        this.a = l.longValue();
        if (this.a > 0) {
            this.mNotifier.downloadSuccessful(this);
        } else {
            this.mNotifier.downloadFailed(this, false);
        }
    }

    public long getSize() {
        return this.a;
    }
}
