package com.yasirkula.unity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.gms.drive.DriveFile;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class NativeShareCustomShareDialog extends DialogFragment {
    private boolean sentShareResult;

    /* loaded from: classes2.dex */
    private static class CustomShareDialogAdapter extends ArrayAdapter<ResolveInfo> {
        private PackageManager packageManager;
        private Activity unityActivity;

        /* loaded from: classes2.dex */
        private static class ViewHolder {
            private final ImageView icon;
            private final TextView label;

            public ViewHolder(TextView textView, ImageView imageView) {
                this.label = textView;
                this.icon = imageView;
            }
        }

        private CustomShareDialogAdapter(Activity activity, List<ResolveInfo> list) {
            super(activity, R.layout.native_share_grid_element, list);
            this.unityActivity = activity;
            this.packageManager = activity.getPackageManager();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.unityActivity.getLayoutInflater().inflate(R.layout.native_share_grid_element, viewGroup, false);
                view.setTag(new ViewHolder((TextView) view.findViewById(R.id.native_share_app_name), (ImageView) view.findViewById(R.id.native_share_app_icon)));
            }
            ResolveInfo item = getItem(i);
            ViewHolder viewHolder = (ViewHolder) view.getTag();
            viewHolder.label.setText(item.loadLabel(this.packageManager));
            viewHolder.icon.setImageDrawable(item.loadIcon(this.packageManager));
            return view;
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        final Intent CreateIntentFromBundle = NativeShare.CreateIntentFromBundle(getActivity(), getArguments());
        String string = getArguments().getString(NativeShareFragment.TITLE_ID);
        ArrayList<String> stringArrayList = getArguments().getStringArrayList(NativeShareFragment.TARGET_PACKAGE_ID);
        ArrayList<String> stringArrayList2 = getArguments().getStringArrayList(NativeShareFragment.TARGET_CLASS_ID);
        PackageManager packageManager = getActivity().getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(CreateIntentFromBundle, 65536);
        if (stringArrayList.size() > 1) {
            for (int size = queryIntentActivities.size() - 1; size >= 0; size--) {
                ActivityInfo activityInfo = queryIntentActivities.get(size).activityInfo;
                String str = activityInfo.applicationInfo.packageName;
                String str2 = activityInfo.name;
                for (int size2 = stringArrayList.size() - 1; size2 >= 0; size2--) {
                    if (str.equals(stringArrayList.get(size2)) && (stringArrayList2.get(size2).length() == 0 || str2.equals(stringArrayList2.get(size2)))) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (!z) {
                    queryIntentActivities.remove(size);
                }
            }
        }
        if (queryIntentActivities.size() == 0) {
            return new AlertDialog.Builder(getActivity()).setTitle(string).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.yasirkula.unity.NativeShareCustomShareDialog.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    NativeShareCustomShareDialog.this.dismiss();
                }
            }).setMessage("No apps can perform this action.").create();
        }
        if (queryIntentActivities.size() == 1) {
            StartTargetActivity(CreateIntentFromBundle, queryIntentActivities.get(0).activityInfo);
            dismiss();
        } else {
            Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
        }
        final CustomShareDialogAdapter customShareDialogAdapter = new CustomShareDialogAdapter(getActivity(), queryIntentActivities);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.native_share_grid_view, (ViewGroup) null);
        GridView gridView = (GridView) inflate.findViewById(R.id.native_share_grid_view_holder);
        gridView.setAdapter((ListAdapter) customShareDialogAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.yasirkula.unity.NativeShareCustomShareDialog.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                NativeShareCustomShareDialog.this.StartTargetActivity(CreateIntentFromBundle, customShareDialogAdapter.getItem(i).activityInfo);
                NativeShareCustomShareDialog.this.dismiss();
            }
        });
        return new AlertDialog.Builder(getActivity()).setTitle(string).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: com.yasirkula.unity.NativeShareCustomShareDialog.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                NativeShareCustomShareDialog.this.dismiss();
            }
        }).setView(inflate).create();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        dismiss();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.sentShareResult) {
            return;
        }
        this.sentShareResult = true;
        NativeShare.shareResultReceiver.OnShareCompleted(2, "");
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Log.d(CrashlyticsReport.DEVELOPMENT_PLATFORM_UNITY, "Dismissed custom share dialog");
        if (!this.sentShareResult) {
            this.sentShareResult = true;
            NativeShare.shareResultReceiver.OnShareCompleted(2, "");
        }
        Activity activity = getActivity();
        if (activity == null || !(activity instanceof NativeShareCustomShareDialogActivity)) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void StartTargetActivity(Intent intent, ActivityInfo activityInfo) {
        ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
        String flattenToString = componentName.flattenToString();
        Log.d(CrashlyticsReport.DEVELOPMENT_PLATFORM_UNITY, "Shared on app: " + flattenToString);
        NativeShare.shareResultReceiver.OnShareCompleted(1, flattenToString);
        this.sentShareResult = true;
        intent.setFlags(DriveFile.MODE_READ_ONLY);
        intent.setComponent(componentName);
        startActivity(intent);
    }
}
