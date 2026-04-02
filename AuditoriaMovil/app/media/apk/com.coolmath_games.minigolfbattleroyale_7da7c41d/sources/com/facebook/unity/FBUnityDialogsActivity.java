package com.facebook.unity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareContent;
import com.facebook.share.widget.ShareDialog;
import java.util.Locale;
/* loaded from: classes.dex */
public class FBUnityDialogsActivity extends BaseActivity {
    public static final String DIALOG_TYPE = "dialog_type";
    public static final String FEED_DIALOG_PARAMS = "feed_dialog_params";
    public static final String SHARE_DIALOG_PARAMS = "share_dialog_params";
    private static String TAG = FBUnityDialogsActivity.class.getName();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.unity.BaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        ShareContent build;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra(SHARE_DIALOG_PARAMS)) {
            bundleExtra = intent.getBundleExtra(SHARE_DIALOG_PARAMS);
            build = FBDialogUtils.createShareContentBuilder(bundleExtra).build();
        } else if (intent.hasExtra(FEED_DIALOG_PARAMS)) {
            bundleExtra = intent.getBundleExtra(FEED_DIALOG_PARAMS);
            build = FBDialogUtils.createFeedContentBuilder(bundleExtra).build();
        } else {
            Log.e(TAG, String.format(Locale.ROOT, "Failed to find extra %s or %s", SHARE_DIALOG_PARAMS, FEED_DIALOG_PARAMS));
            finish();
            return;
        }
        ShareDialog shareDialog = new ShareDialog(this);
        final UnityMessage unityMessage = new UnityMessage("OnShareLinkComplete");
        String string = bundleExtra.getString(Constants.CALLBACK_ID_KEY);
        if (string != null) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, string);
        }
        shareDialog.registerCallback(this.mCallbackManager, new FacebookCallback<Sharer.Result>() { // from class: com.facebook.unity.FBUnityDialogsActivity.1
            @Override // com.facebook.FacebookCallback
            public void onSuccess(Sharer.Result result) {
                if (result.getPostId() != null) {
                    unityMessage.putID(result.getPostId());
                }
                unityMessage.put("posted", true);
                unityMessage.send();
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                unityMessage.putCancelled();
                unityMessage.send();
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                unityMessage.sendError(facebookException.getMessage());
            }
        });
        shareDialog.show(build, (ShareDialog.Mode) getIntent().getSerializableExtra(DIALOG_TYPE));
    }
}
