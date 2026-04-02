package net.hockeyapp.android.tasks;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import net.hockeyapp.android.R;
import net.hockeyapp.android.UpdateActivity;
import net.hockeyapp.android.UpdateFragment;
import net.hockeyapp.android.UpdateManagerListener;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.Util;
import net.hockeyapp.android.utils.VersionCache;
import org.json.JSONArray;
/* loaded from: classes4.dex */
public class CheckUpdateTaskWithUI extends CheckUpdateTask {
    private Activity a;
    private AlertDialog b;
    protected boolean mIsDialogRequired;

    public CheckUpdateTaskWithUI(WeakReference<Activity> weakReference, String str, String str2, UpdateManagerListener updateManagerListener, boolean z) {
        super(weakReference, str, str2, updateManagerListener);
        this.a = null;
        this.b = null;
        this.mIsDialogRequired = false;
        if (weakReference != null) {
            this.a = weakReference.get();
        }
        this.mIsDialogRequired = z;
    }

    @Override // net.hockeyapp.android.tasks.CheckUpdateTask
    public void detach() {
        super.detach();
        this.a = null;
        if (this.b != null) {
            this.b.dismiss();
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.hockeyapp.android.tasks.CheckUpdateTask, android.os.AsyncTask
    public void onPostExecute(JSONArray jSONArray) {
        super.onPostExecute(jSONArray);
        if (jSONArray != null && this.mIsDialogRequired) {
            a(jSONArray);
        }
    }

    private void a(final JSONArray jSONArray) {
        if (getCachingEnabled()) {
            HockeyLog.verbose("HockeyUpdate", "Caching is enabled. Setting version to cached one.");
            VersionCache.setVersionInfo(this.a, jSONArray.toString());
        }
        if (this.a != null && !this.a.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
            builder.setTitle(R.string.hockeyapp_update_dialog_title);
            if (!this.mandatory.booleanValue()) {
                builder.setMessage(R.string.hockeyapp_update_dialog_message);
                builder.setNegativeButton(R.string.hockeyapp_update_dialog_negative_button, new DialogInterface.OnClickListener() { // from class: net.hockeyapp.android.tasks.CheckUpdateTaskWithUI.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        CheckUpdateTaskWithUI.this.cleanUp();
                        if (CheckUpdateTaskWithUI.this.listener != null) {
                            CheckUpdateTaskWithUI.this.listener.onCancel();
                        }
                    }
                });
                builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: net.hockeyapp.android.tasks.CheckUpdateTaskWithUI.2
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        CheckUpdateTaskWithUI.this.cleanUp();
                        if (CheckUpdateTaskWithUI.this.listener != null) {
                            CheckUpdateTaskWithUI.this.listener.onCancel();
                        }
                    }
                });
                builder.setPositiveButton(R.string.hockeyapp_update_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: net.hockeyapp.android.tasks.CheckUpdateTaskWithUI.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (CheckUpdateTaskWithUI.this.getCachingEnabled()) {
                            VersionCache.setVersionInfo(CheckUpdateTaskWithUI.this.a, "[]");
                        }
                        WeakReference weakReference = new WeakReference(CheckUpdateTaskWithUI.this.a);
                        if (!Util.fragmentsSupported().booleanValue() || !Util.runsOnTablet(weakReference).booleanValue()) {
                            CheckUpdateTaskWithUI.this.a(jSONArray, (Boolean) false);
                        } else {
                            CheckUpdateTaskWithUI.this.b(jSONArray);
                        }
                    }
                });
                this.b = builder.create();
                this.b.show();
                return;
            }
            Toast.makeText(this.a, String.format(this.a.getString(R.string.hockeyapp_update_mandatory_toast), Util.getAppName(this.a)), 1).show();
            a(jSONArray, (Boolean) true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONArray jSONArray) {
        if (this.a != null) {
            FragmentTransaction beginTransaction = this.a.getFragmentManager().beginTransaction();
            beginTransaction.setTransition(4097);
            Fragment findFragmentByTag = this.a.getFragmentManager().findFragmentByTag("hockey_update_dialog");
            if (findFragmentByTag != null) {
                beginTransaction.remove(findFragmentByTag);
            }
            beginTransaction.addToBackStack(null);
            Class<? extends UpdateFragment> cls = UpdateFragment.class;
            if (this.listener != null) {
                cls = this.listener.getUpdateFragmentClass();
            }
            try {
                ((DialogFragment) cls.getMethod("newInstance", JSONArray.class, String.class).invoke(null, jSONArray, getURLString("apk"))).show(beginTransaction, "hockey_update_dialog");
            } catch (Exception e) {
                HockeyLog.error("An exception happened while showing the update fragment:");
                e.printStackTrace();
                HockeyLog.error("Showing update activity instead.");
                a(jSONArray, (Boolean) false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONArray jSONArray, Boolean bool) {
        Class<? extends UpdateActivity> cls = null;
        if (this.listener != null) {
            cls = this.listener.getUpdateActivityClass();
        }
        if (cls == null) {
            cls = UpdateActivity.class;
        }
        if (this.a != null) {
            Intent intent = new Intent();
            intent.setClass(this.a, cls);
            intent.putExtra(UpdateActivity.EXTRA_JSON, jSONArray.toString());
            intent.putExtra("url", getURLString("apk"));
            this.a.startActivity(intent);
            if (bool.booleanValue()) {
                this.a.finish();
            }
        }
        cleanUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.hockeyapp.android.tasks.CheckUpdateTask
    public void cleanUp() {
        super.cleanUp();
        this.a = null;
        this.b = null;
    }
}
