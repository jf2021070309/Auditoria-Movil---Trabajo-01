package com.facebook.unity;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.share.model.AppGroupCreationContent;
import com.facebook.share.widget.CreateAppGroupDialog;
import java.util.Locale;
/* loaded from: classes.dex */
public class FBUnityCreateGameGroupActivity extends BaseActivity {
    public static String CREATE_GAME_GROUP_PARAMS = "create_game_group_params";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.unity.BaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppGroupCreationContent.Builder builder = new AppGroupCreationContent.Builder();
        Bundle bundleExtra = getIntent().getBundleExtra(CREATE_GAME_GROUP_PARAMS);
        final UnityMessage unityMessage = new UnityMessage("OnGroupCreateComplete");
        if (bundleExtra.containsKey(Constants.CALLBACK_ID_KEY)) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, bundleExtra.getString(Constants.CALLBACK_ID_KEY));
        }
        if (bundleExtra.containsKey("name")) {
            builder.setName(bundleExtra.getString("name"));
        }
        if (bundleExtra.containsKey("description")) {
            builder.setDescription(bundleExtra.getString("name"));
        }
        if (bundleExtra.containsKey("privacy")) {
            String string = bundleExtra.getString("privacy");
            AppGroupCreationContent.AppGroupPrivacy appGroupPrivacy = AppGroupCreationContent.AppGroupPrivacy.Closed;
            if (string.equalsIgnoreCase("closed")) {
                appGroupPrivacy = AppGroupCreationContent.AppGroupPrivacy.Closed;
            } else if (string.equalsIgnoreCase("open")) {
                appGroupPrivacy = AppGroupCreationContent.AppGroupPrivacy.Open;
            } else {
                unityMessage.sendError(String.format(Locale.ROOT, "Unknown privacy setting for group creation: %s", string));
                finish();
            }
            builder.setAppGroupPrivacy(appGroupPrivacy);
        }
        CreateAppGroupDialog createAppGroupDialog = new CreateAppGroupDialog(this);
        createAppGroupDialog.registerCallback(this.mCallbackManager, new FacebookCallback<CreateAppGroupDialog.Result>() { // from class: com.facebook.unity.FBUnityCreateGameGroupActivity.1
            @Override // com.facebook.FacebookCallback
            public void onSuccess(CreateAppGroupDialog.Result result) {
                unityMessage.put("id", result.getId());
                unityMessage.send();
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                unityMessage.putCancelled();
                unityMessage.send();
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                unityMessage.sendError(facebookException.getLocalizedMessage());
            }
        });
        createAppGroupDialog.show(builder.build());
    }
}
