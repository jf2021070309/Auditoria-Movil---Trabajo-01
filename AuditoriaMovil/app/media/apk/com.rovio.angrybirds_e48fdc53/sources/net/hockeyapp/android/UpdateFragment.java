package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import com.kuaishou.weapon.p0.g;
import java.util.Locale;
import net.hockeyapp.android.listeners.DownloadFileListener;
import net.hockeyapp.android.tasks.DownloadFileTask;
import net.hockeyapp.android.tasks.GetFileSizeTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.VersionHelper;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes4.dex */
public class UpdateFragment extends DialogFragment implements View.OnClickListener, UpdateInfoListener {
    public static final String FRAGMENT_URL = "url";
    public static final String FRAGMENT_VERSION_INFO = "versionInfo";
    private DownloadFileTask mDownloadTask;
    private String mUrlString;
    private VersionHelper mVersionHelper;
    private JSONArray mVersionInfo;

    public static UpdateFragment newInstance(JSONArray jSONArray, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putString(FRAGMENT_VERSION_INFO, jSONArray.toString());
        UpdateFragment updateFragment = new UpdateFragment();
        updateFragment.setArguments(bundle);
        return updateFragment;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.mUrlString = getArguments().getString("url");
            this.mVersionInfo = new JSONArray(getArguments().getString(FRAGMENT_VERSION_INFO));
            setStyle(1, 16973939);
        } catch (JSONException e) {
            dismiss();
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long fileSizeBytes;
        View layoutView = getLayoutView();
        this.mVersionHelper = new VersionHelper(getActivity(), this.mVersionInfo.toString(), this);
        ((TextView) layoutView.findViewById(R.id.label_title)).setText(getAppName());
        final TextView textView = (TextView) layoutView.findViewById(R.id.label_version);
        final String str = "Version " + this.mVersionHelper.getVersionString();
        final String fileDateString = this.mVersionHelper.getFileDateString();
        Object obj = "Unknown size";
        if (this.mVersionHelper.getFileSizeBytes() >= 0) {
            obj = String.format(Locale.US, "%.2f", Float.valueOf(((float) fileSizeBytes) / 1048576.0f)) + " MB";
        } else {
            AsyncTaskUtils.execute(new GetFileSizeTask(getActivity(), this.mUrlString, new DownloadFileListener() { // from class: net.hockeyapp.android.UpdateFragment.1
                @Override // net.hockeyapp.android.listeners.DownloadFileListener
                public void downloadSuccessful(DownloadFileTask downloadFileTask) {
                    if (downloadFileTask instanceof GetFileSizeTask) {
                        textView.setText(UpdateFragment.this.getString(R.string.hockeyapp_update_version_details_label, new Object[]{str, fileDateString, String.format(Locale.US, "%.2f", Float.valueOf(((float) ((GetFileSizeTask) downloadFileTask).getSize()) / 1048576.0f)) + " MB"}));
                    }
                }
            }));
        }
        textView.setText(getString(R.string.hockeyapp_update_version_details_label, new Object[]{str, fileDateString, obj}));
        ((Button) layoutView.findViewById(R.id.button_update)).setOnClickListener(this);
        WebView webView = (WebView) layoutView.findViewById(R.id.web_update_details);
        webView.clearCache(true);
        webView.destroyDrawingCache();
        webView.loadDataWithBaseURL(Constants.BASE_URL, this.mVersionHelper.getReleaseNotes(false), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
        return layoutView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        prepareDownload();
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (strArr.length != 0 && iArr.length != 0 && i == 1) {
            if (iArr[0] == 0) {
                startDownloadTask(getActivity());
                return;
            }
            HockeyLog.warn("User denied write permission, can't continue with updater task.");
            UpdateManagerListener lastListener = UpdateManager.getLastListener();
            if (lastListener != null) {
                lastListener.onUpdatePermissionsNotGranted();
            } else {
                new AlertDialog.Builder(getActivity()).setTitle(getString(R.string.hockeyapp_permission_update_title)).setMessage(getString(R.string.hockeyapp_permission_update_message)).setNegativeButton(getString(R.string.hockeyapp_permission_dialog_negative_button), (DialogInterface.OnClickListener) null).setPositiveButton(getString(R.string.hockeyapp_permission_dialog_positive_button), new DialogInterface.OnClickListener() { // from class: net.hockeyapp.android.UpdateFragment.2
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
            return getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 128).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        } catch (NullPointerException e2) {
            return -1;
        }
    }

    public void prepareDownload() {
        if (Build.VERSION.SDK_INT < 23 || getActivity().checkSelfPermission(g.j) == 0) {
            startDownloadTask(getActivity());
            dismiss();
            return;
        }
        requestPermissions(new String[]{g.j}, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startDownloadTask(final Activity activity) {
        this.mDownloadTask = new DownloadFileTask(activity, this.mUrlString, new DownloadFileListener() { // from class: net.hockeyapp.android.UpdateFragment.3
            @Override // net.hockeyapp.android.listeners.DownloadFileListener
            public void downloadFailed(DownloadFileTask downloadFileTask, Boolean bool) {
                if (bool.booleanValue()) {
                    UpdateFragment.this.startDownloadTask(activity);
                }
            }

            @Override // net.hockeyapp.android.listeners.DownloadFileListener
            public void downloadSuccessful(DownloadFileTask downloadFileTask) {
            }
        });
        AsyncTaskUtils.execute(this.mDownloadTask);
    }

    public String getAppName() {
        Activity activity = getActivity();
        try {
            PackageManager packageManager = activity.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(activity.getPackageName(), 0)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            return "";
        }
    }

    public View getLayoutView() {
        LinearLayout linearLayout = new LinearLayout(getActivity());
        LayoutInflater.from(getActivity()).inflate(R.layout.hockeyapp_fragment_update, linearLayout);
        return linearLayout;
    }
}
