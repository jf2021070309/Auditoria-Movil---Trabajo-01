package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import com.kuaishou.weapon.p0.g;
import java.util.Locale;
import net.hockeyapp.android.listeners.DownloadFileListener;
import net.hockeyapp.android.objects.ErrorObject;
import net.hockeyapp.android.tasks.DownloadFileTask;
import net.hockeyapp.android.tasks.GetFileSizeTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.Util;
import net.hockeyapp.android.utils.VersionHelper;
/* loaded from: classes4.dex */
public class UpdateActivity extends Activity implements View.OnClickListener, UpdateActivityInterface, UpdateInfoListener {
    public static final String EXTRA_JSON = "json";
    public static final String EXTRA_URL = "url";
    private ErrorObject a;
    private Context b;
    protected DownloadFileTask mDownloadTask;
    protected VersionHelper mVersionHelper;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("App Update");
        setContentView(getLayoutView());
        this.b = this;
        this.mVersionHelper = new VersionHelper(this, getIntent().getStringExtra(EXTRA_JSON), this);
        configureView();
        this.mDownloadTask = (DownloadFileTask) getLastNonConfigurationInstance();
        if (this.mDownloadTask != null) {
            this.mDownloadTask.attach(this);
        }
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        if (this.mDownloadTask != null) {
            this.mDownloadTask.detach();
        }
        return this.mDownloadTask;
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        return onCreateDialog(i, null);
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i, Bundle bundle) {
        switch (i) {
            case 0:
                return new AlertDialog.Builder(this).setMessage("An error has occured").setCancelable(false).setTitle("Error").setIcon(17301543).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: net.hockeyapp.android.UpdateActivity.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        UpdateActivity.this.a = null;
                        dialogInterface.cancel();
                    }
                }).create();
            default:
                return null;
        }
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case 0:
                AlertDialog alertDialog = (AlertDialog) dialog;
                if (this.a != null) {
                    alertDialog.setMessage(this.a.getMessage());
                    return;
                } else {
                    alertDialog.setMessage("An unknown error has occured.");
                    return;
                }
            default:
                return;
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        enableUpdateButton();
        if (strArr.length != 0 && iArr.length != 0 && i == 1) {
            if (iArr[0] == 0) {
                prepareDownload();
                return;
            }
            HockeyLog.warn("User denied write permission, can't continue with updater task.");
            UpdateManagerListener lastListener = UpdateManager.getLastListener();
            if (lastListener != null) {
                lastListener.onUpdatePermissionsNotGranted();
            } else {
                new AlertDialog.Builder(this.b).setTitle(getString(R.string.hockeyapp_permission_update_title)).setMessage(getString(R.string.hockeyapp_permission_update_message)).setNegativeButton(getString(R.string.hockeyapp_permission_dialog_negative_button), (DialogInterface.OnClickListener) null).setPositiveButton(getString(R.string.hockeyapp_permission_dialog_positive_button), new DialogInterface.OnClickListener() { // from class: net.hockeyapp.android.UpdateActivity.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        this.prepareDownload();
                    }
                }).create().show();
            }
        }
    }

    @Override // net.hockeyapp.android.UpdateInfoListener
    public int getCurrentVersionCode() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 128).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    @Override // net.hockeyapp.android.UpdateActivityInterface
    public View getLayoutView() {
        return getLayoutInflater().inflate(R.layout.hockeyapp_activity_update, (ViewGroup) null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        prepareDownload();
        view.setEnabled(false);
    }

    protected void configureView() {
        long fileSizeBytes;
        TextView textView = (TextView) findViewById(R.id.label_title);
        textView.setText(getAppName());
        textView.setContentDescription(getAppName());
        final TextView textView2 = (TextView) findViewById(R.id.label_version);
        final String str = "Version " + this.mVersionHelper.getVersionString();
        final String fileDateString = this.mVersionHelper.getFileDateString();
        Object obj = "Unknown size";
        if (this.mVersionHelper.getFileSizeBytes() >= 0) {
            obj = String.format(Locale.US, "%.2f", Float.valueOf(((float) fileSizeBytes) / 1048576.0f)) + " MB";
        } else {
            AsyncTaskUtils.execute(new GetFileSizeTask(this, getIntent().getStringExtra("url"), new DownloadFileListener() { // from class: net.hockeyapp.android.UpdateActivity.3
                @Override // net.hockeyapp.android.listeners.DownloadFileListener
                public void downloadSuccessful(DownloadFileTask downloadFileTask) {
                    if (downloadFileTask instanceof GetFileSizeTask) {
                        textView2.setText(UpdateActivity.this.getString(R.string.hockeyapp_update_version_details_label, new Object[]{str, fileDateString, String.format(Locale.US, "%.2f", Float.valueOf(((float) ((GetFileSizeTask) downloadFileTask).getSize()) / 1048576.0f)) + " MB"}));
                        textView2.setContentDescription(textView2.getText());
                    }
                }
            }));
        }
        textView2.setText(getString(R.string.hockeyapp_update_version_details_label, new Object[]{str, fileDateString, obj}));
        ((Button) findViewById(R.id.button_update)).setOnClickListener(this);
        WebView webView = (WebView) findViewById(R.id.web_update_details);
        webView.clearCache(true);
        webView.destroyDrawingCache();
        webView.loadDataWithBaseURL(Constants.BASE_URL, getReleaseNotes(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
    }

    protected String getReleaseNotes() {
        return this.mVersionHelper.getReleaseNotes(false);
    }

    protected void startDownloadTask() {
        startDownloadTask(getIntent().getStringExtra("url"));
    }

    protected void startDownloadTask(String str) {
        createDownloadTask(str, new DownloadFileListener() { // from class: net.hockeyapp.android.UpdateActivity.4
            @Override // net.hockeyapp.android.listeners.DownloadFileListener
            public void downloadFailed(DownloadFileTask downloadFileTask, Boolean bool) {
                if (bool.booleanValue()) {
                    UpdateActivity.this.startDownloadTask();
                } else {
                    UpdateActivity.this.enableUpdateButton();
                }
            }

            @Override // net.hockeyapp.android.listeners.DownloadFileListener
            public void downloadSuccessful(DownloadFileTask downloadFileTask) {
                UpdateActivity.this.enableUpdateButton();
            }
        });
        AsyncTaskUtils.execute(this.mDownloadTask);
    }

    protected void createDownloadTask(String str, DownloadFileListener downloadFileListener) {
        this.mDownloadTask = new DownloadFileTask(this, str, downloadFileListener);
    }

    public void enableUpdateButton() {
        findViewById(R.id.button_update).setEnabled(true);
    }

    public String getAppName() {
        try {
            PackageManager packageManager = getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(getPackageName(), 0)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            return "";
        }
    }

    private boolean a(Context context) {
        return context.checkCallingOrSelfPermission(g.j) == 0;
    }

    private boolean a() {
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT >= 17 && Build.VERSION.SDK_INT < 21) {
                if (Settings.Global.getInt(getContentResolver(), "install_non_market_apps") != 1) {
                    z = false;
                }
            } else if (Settings.Secure.getInt(getContentResolver(), "install_non_market_apps") != 1) {
                z = false;
            }
        } catch (Settings.SettingNotFoundException e) {
        }
        return z;
    }

    protected void prepareDownload() {
        if (!Util.isConnectedToNetwork(this.b)) {
            this.a = new ErrorObject();
            this.a.setMessage(getString(R.string.hockeyapp_error_no_network_message));
            runOnUiThread(new Runnable() { // from class: net.hockeyapp.android.UpdateActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    UpdateActivity.this.showDialog(0);
                }
            });
        } else if (!a(this.b)) {
            if (Build.VERSION.SDK_INT < 23) {
                this.a = new ErrorObject();
                this.a.setMessage("The permission to access the external storage permission is not set. Please contact the developer.");
                runOnUiThread(new Runnable() { // from class: net.hockeyapp.android.UpdateActivity.6
                    @Override // java.lang.Runnable
                    public void run() {
                        UpdateActivity.this.showDialog(0);
                    }
                });
                return;
            }
            requestPermissions(new String[]{g.j}, 1);
        } else if (!a()) {
            this.a = new ErrorObject();
            this.a.setMessage("The installation from unknown sources is not enabled. Please check the device settings.");
            runOnUiThread(new Runnable() { // from class: net.hockeyapp.android.UpdateActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    UpdateActivity.this.showDialog(0);
                }
            });
        } else {
            startDownloadTask();
        }
    }
}
