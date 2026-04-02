package net.hockeyapp.android;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Toast;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import net.hockeyapp.android.objects.FeedbackUserDataElement;
import net.hockeyapp.android.tasks.ParseFeedbackTask;
import net.hockeyapp.android.tasks.SendFeedbackTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.PrefsUtil;
import net.hockeyapp.android.utils.Util;
/* loaded from: classes4.dex */
public class FeedbackManager {
    private static Activity b;
    private static String h;
    private static String i;
    private static BroadcastReceiver a = null;
    private static boolean c = false;
    private static String d = null;
    private static String e = null;
    private static FeedbackUserDataElement f = FeedbackUserDataElement.REQUIRED;
    private static FeedbackUserDataElement g = FeedbackUserDataElement.REQUIRED;
    private static FeedbackManagerListener j = null;

    public static void register(Context context) {
        register(context, Util.getAppIdentifier(context));
    }

    public static void register(Context context, FeedbackManagerListener feedbackManagerListener) {
        register(context, Util.getAppIdentifier(context), feedbackManagerListener);
    }

    public static void register(Context context, String str) {
        register(context, str, null);
    }

    public static void register(Context context, String str, FeedbackManagerListener feedbackManagerListener) {
        register(context, Constants.BASE_URL, str, feedbackManagerListener);
    }

    public static void register(Context context, String str, String str2, FeedbackManagerListener feedbackManagerListener) {
        if (context != null) {
            d = Util.sanitizeAppIdentifier(str2);
            e = str;
            j = feedbackManagerListener;
            Constants.loadFromContext(context);
        }
    }

    public static void unregister() {
        j = null;
    }

    public static void showFeedbackActivity(Context context, Uri... uriArr) {
        showFeedbackActivity(context, null, uriArr);
    }

    public static void showFeedbackActivity(Context context, Bundle bundle, Uri... uriArr) {
        if (context != null) {
            Class<? extends FeedbackActivity> cls = null;
            if (j != null) {
                cls = j.getFeedbackActivityClass();
            }
            if (cls == null) {
                cls = FeedbackActivity.class;
            }
            boolean z = j != null && j.shouldCreateNewFeedbackThread();
            Intent intent = new Intent();
            if (bundle != null && !bundle.isEmpty()) {
                intent.putExtras(bundle);
            }
            intent.setFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
            intent.setClass(context, cls);
            intent.putExtra("url", b(context));
            intent.putExtra(FeedbackActivity.EXTRA_FORCE_NEW_THREAD, z);
            intent.putExtra(FeedbackActivity.EXTRA_INITIAL_USER_NAME, h);
            intent.putExtra(FeedbackActivity.EXTRA_INITIAL_USER_EMAIL, i);
            intent.putExtra(FeedbackActivity.EXTRA_INITIAL_ATTACHMENTS, uriArr);
            context.startActivity(intent);
        }
    }

    public static void checkForAnswersAndNotify(final Context context) {
        String feedbackTokenFromPrefs = PrefsUtil.getInstance().getFeedbackTokenFromPrefs(context);
        if (feedbackTokenFromPrefs != null) {
            int i2 = context.getSharedPreferences(ParseFeedbackTask.PREFERENCES_NAME, 0).getInt(ParseFeedbackTask.ID_LAST_MESSAGE_SEND, -1);
            SendFeedbackTask sendFeedbackTask = new SendFeedbackTask(context, b(context), null, null, null, null, null, feedbackTokenFromPrefs, new Handler() { // from class: net.hockeyapp.android.FeedbackManager.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    String string = message.getData().getString(SendFeedbackTask.BUNDLE_FEEDBACK_RESPONSE);
                    if (string != null) {
                        ParseFeedbackTask parseFeedbackTask = new ParseFeedbackTask(context, string, null, "fetch");
                        parseFeedbackTask.setUrlString(FeedbackManager.b(context));
                        AsyncTaskUtils.execute(parseFeedbackTask);
                    }
                }
            }, true);
            sendFeedbackTask.setShowProgressDialog(false);
            sendFeedbackTask.setLastMessageId(i2);
            AsyncTaskUtils.execute(sendFeedbackTask);
        }
    }

    public static FeedbackManagerListener getLastListener() {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(Context context) {
        return e + "api/2/apps/" + d + "/feedback/";
    }

    public static FeedbackUserDataElement getRequireUserName() {
        return f;
    }

    public static void setRequireUserName(FeedbackUserDataElement feedbackUserDataElement) {
        f = feedbackUserDataElement;
    }

    public static FeedbackUserDataElement getRequireUserEmail() {
        return g;
    }

    public static void setRequireUserEmail(FeedbackUserDataElement feedbackUserDataElement) {
        g = feedbackUserDataElement;
    }

    public static void setUserName(String str) {
        h = str;
    }

    public static void setUserEmail(String str) {
        i = str;
    }

    public static void setActivityForScreenshot(Activity activity) {
        b = activity;
        if (!c) {
            a();
        }
    }

    public static void unsetCurrentActivityForScreenshot(Activity activity) {
        if (b != null && b == activity) {
            b();
            b = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [net.hockeyapp.android.FeedbackManager$2] */
    public static void takeScreenshot(final Context context) {
        View decorView = b.getWindow().getDecorView();
        decorView.setDrawingCacheEnabled(true);
        final Bitmap drawingCache = decorView.getDrawingCache();
        String localClassName = b.getLocalClassName();
        File hockeyAppStorageDir = Constants.getHockeyAppStorageDir();
        File file = new File(hockeyAppStorageDir, localClassName + ".jpg");
        int i2 = 1;
        while (file.exists()) {
            file = new File(hockeyAppStorageDir, localClassName + "_" + i2 + ".jpg");
            i2++;
        }
        new AsyncTask<File, Void, Boolean>() { // from class: net.hockeyapp.android.FeedbackManager.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Boolean doInBackground(File... fileArr) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileArr[0]);
                    drawingCache.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.close();
                    return true;
                } catch (IOException e2) {
                    HockeyLog.error("Could not save screenshot.", e2);
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public void onPostExecute(Boolean bool) {
                if (!bool.booleanValue()) {
                    Toast.makeText(context, "Screenshot could not be created. Sorry.", 1).show();
                }
            }
        }.execute(file);
        a aVar = new a(file.getAbsolutePath());
        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(b, aVar);
        aVar.a(mediaScannerConnection);
        mediaScannerConnection.connect();
        Toast.makeText(context, "Screenshot '" + file.getName() + "' is available in gallery.", 1).show();
    }

    private static void a() {
        c = true;
        int identifier = b.getResources().getIdentifier("ic_menu_camera", "drawable", "android");
        Intent intent = new Intent();
        intent.setAction("net.hockeyapp.android.SCREENSHOT");
        ((NotificationManager) b.getSystemService("notification")).notify(1, Util.createNotification(b, PendingIntent.getBroadcast(b, 1, intent, 1073741824), "HockeyApp Feedback", "Take a screenshot for your feedback.", identifier));
        if (a == null) {
            a = new BroadcastReceiver() { // from class: net.hockeyapp.android.FeedbackManager.3
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent2) {
                    FeedbackManager.takeScreenshot(context);
                }
            };
        }
        b.registerReceiver(a, new IntentFilter("net.hockeyapp.android.SCREENSHOT"));
    }

    private static void b() {
        c = false;
        b.unregisterReceiver(a);
        ((NotificationManager) b.getSystemService("notification")).cancel(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a implements MediaScannerConnection.MediaScannerConnectionClient {
        private MediaScannerConnection a;
        private String b;

        private a(String str) {
            this.a = null;
            this.b = str;
        }

        public void a(MediaScannerConnection mediaScannerConnection) {
            this.a = mediaScannerConnection;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
            if (this.a != null) {
                this.a.scanFile(this.b, null);
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            HockeyLog.verbose(String.format("Scanned path %s -> URI = %s", str, uri.toString()));
            this.a.disconnect();
        }
    }
}
