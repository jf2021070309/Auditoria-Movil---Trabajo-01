package com.rovio.rcs.socialnetwork;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.model.AppInviteContent;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.widget.AppInviteDialog;
import com.facebook.share.widget.GameRequestDialog;
import com.qq.e.comm.managers.setting.GlobalSetting;
import com.rovio.fusion.Globals;
import com.rovio.rcs.socialnetwork.BaseSocialService;
import com.rovio.rcs.socialnetwork.SocialServiceExceptions;
import com.rovio.rcs.socialnetwork.SocialServiceObject;
import com.rovio.rcs.socialnetwork.SocialServiceRequest;
import com.rovio.rcs.socialnetwork.SocialServiceResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class FacebookService implements BaseSocialService {
    private static final String MINIMUM_FACEBOOK_SDK_VERSION = "4.28.0";
    private static final int REAUTH_ACTIVITY_CODE = 100;
    private BaseSocialService.LoginCallback a;
    private SocialServiceRequest b;
    private SocialServiceRequest.Callback c;
    private CallbackManager d;
    private Activity e;
    private boolean f;
    private final String g = "";
    private final String h = GlobalSetting.FACEBOOK_SDK_WRAPPER;
    private AccessTokenTracker i;
    private static final List<String> PERMISSIONS = Arrays.asList("publish_actions");
    private static boolean m_tokenUpdatedForSharing = false;
    private static boolean m_requestSharePermissionCancelled = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static String getFacebookAvatarImageURL(String str) {
        return "https://graph.facebook-com/v3.0/" + str + "/picture?type=normal";
    }

    public FacebookService(Activity activity) {
        if (activity == null) {
            this.e = Globals.getActivity();
            Globals.registerActivityListener(this);
            this.f = true;
        } else {
            this.e = activity;
            this.f = false;
        }
        FacebookSdk.sdkInitialize(this.e.getApplicationContext());
        if (!FacebookSdk.isInitialized()) {
            throw new SocialServiceExceptions("Facebook SDK Initialization failed", SocialServiceExceptions.ExceptionCode.FACEBOOK_SDK_INITIALIZATION_FAILED);
        }
        this.d = CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(this.d, new FacebookCallback<LoginResult>() { // from class: com.rovio.rcs.socialnetwork.FacebookService.1
            @Override // com.facebook.FacebookCallback
            public void onSuccess(LoginResult loginResult) {
                Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Facebook onSuccessCallback: " + loginResult);
                if (FacebookService.this.a != null) {
                    FacebookService.this.a.onCompleted(null, true);
                }
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Facebook onCancel. ");
                if (FacebookService.this.a != null) {
                    FacebookService.this.a.onCompleted(null, false);
                }
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Facebook onError: " + facebookException);
                if (FacebookService.this.a != null) {
                    FacebookService.this.a.onCompleted(null, false);
                }
            }
        });
        this.i = new FBServiceAccessTokenTracker();
        if (!c()) {
            throw new SocialServiceExceptions("Facebook SDK is incompatible.", SocialServiceExceptions.ExceptionCode.FACEBOOK_SDK_INITIALIZATION_FAILED);
        }
        String applicationId = FacebookSdk.getApplicationId();
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "applicationId: " + applicationId);
        if (applicationId.equals("")) {
            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "applicationId (" + applicationId + ") is invalid. Throwing exception...");
            throw new SocialServiceExceptions("Facebook app id is empty", SocialServiceExceptions.ExceptionCode.FACEBOOK_SDK_INITIALIZATION_FAILED);
        }
    }

    @Override // com.rovio.rcs.socialnetwork.BaseSocialService
    public String serviceName() {
        return BaseSocialService.FACEBOOK;
    }

    @Override // com.rovio.rcs.socialnetwork.BaseSocialService
    public boolean onOpenUrl(String str) {
        return false;
    }

    @Override // com.rovio.rcs.socialnetwork.BaseSocialService
    public void onActivate(boolean z) {
    }

    @Override // com.rovio.rcs.socialnetwork.BaseSocialService
    public boolean isLoggedIn() {
        return AccessToken.getCurrentAccessToken() != null;
    }

    @Override // com.rovio.rcs.socialnetwork.BaseSocialService
    public void login(BaseSocialService.LoginCallback loginCallback, final Map<String, String> map) {
        this.a = loginCallback;
        this.e.runOnUiThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.FacebookService.2
            @Override // java.lang.Runnable
            public void run() {
                if (!FacebookSdk.isInitialized()) {
                    FacebookService.this.a.onCompleted("", false);
                    return;
                }
                ArrayList arrayList = new ArrayList(Arrays.asList("public_profile", "user_friends"));
                String str = map != null ? (String) map.get("permission_request_birthday") : null;
                if (Boolean.valueOf(str == null || Boolean.parseBoolean(str)).booleanValue()) {
                    arrayList.add("user_birthday");
                }
                LoginManager.getInstance().logInWithReadPermissions(FacebookService.this.e, arrayList);
            }
        });
    }

    @Override // com.rovio.rcs.socialnetwork.BaseSocialService
    public void logout() {
        this.e.runOnUiThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.FacebookService.3
            @Override // java.lang.Runnable
            public void run() {
                LoginManager.getInstance().logOut();
            }
        });
    }

    @Override // com.rovio.rcs.socialnetwork.BaseSocialService
    public boolean supportMultipleAccounts() {
        return false;
    }

    @Override // com.rovio.rcs.socialnetwork.BaseSocialService
    public boolean isAccountAvailable() {
        return true;
    }

    @Override // com.rovio.rcs.socialnetwork.BaseSocialService
    public void accessAccount() {
    }

    @Override // com.rovio.rcs.socialnetwork.BaseSocialService
    public void startRequest(SocialServiceRequest socialServiceRequest, SocialServiceRequest.Callback callback) {
        if (!isLoggedIn()) {
            if (callback != null) {
                callback.onCompleted(new SocialServiceResponse(serviceName(), null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorNotLoggedIn, "Not logged in")));
                return;
            }
            return;
        }
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "request: " + socialServiceRequest.getClass());
        if (socialServiceRequest instanceof SocialServiceRequest.SocialGetUserProfileRequest) {
            a((SocialServiceRequest.SocialGetUserProfileRequest) socialServiceRequest, callback);
        } else if (socialServiceRequest instanceof SocialServiceRequest.SocialSharingRequest) {
            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "start sharing request");
            try {
                a((SocialServiceRequest.SocialSharingRequest) socialServiceRequest, callback);
            } catch (SocialServiceExceptions e) {
                if (e.getErrorCode().equals(SocialServiceExceptions.ExceptionCode.FACEBOOK_SESSION_SHARE_FAILED)) {
                    Log.e(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Facebook Sharing failed");
                }
            }
        } else if (socialServiceRequest instanceof SocialServiceRequest.SocialGetFriendsRequest) {
            a((SocialServiceRequest.SocialGetFriendsRequest) socialServiceRequest, callback);
        } else if (socialServiceRequest instanceof SocialServiceRequest.SocialAppRequest) {
            try {
                a((SocialServiceRequest.SocialAppRequest) socialServiceRequest, callback);
            } catch (SocialServiceExceptions e2) {
                if (e2.getErrorCode().equals(SocialServiceExceptions.ExceptionCode.FACEBOOK_SEND_APP_REQUEST_FAILED)) {
                    Log.e(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Unable to send the app request to Facebook: " + e2.getMessage());
                    if (callback != null) {
                        callback.onCompleted(new SocialServiceResponse(serviceName(), null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorSendAppRequestFailed, "Failed to send the app request to Facebook: " + e2.getMessage())));
                    }
                }
            }
        } else if (socialServiceRequest instanceof SocialServiceRequest.SocialAppInviteRequest) {
            try {
                a((SocialServiceRequest.SocialAppInviteRequest) socialServiceRequest, callback);
            } catch (SocialServiceExceptions e3) {
                if (e3.getErrorCode().equals(SocialServiceExceptions.ExceptionCode.FACEBOOK_SEND_APP_INVITE_REQUEST_FAILED)) {
                    Log.e(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Unable to send the app invite request to Facebook: " + e3.getMessage());
                    if (callback != null) {
                        callback.onCompleted(new SocialServiceResponse(serviceName(), null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorSendAppInviteRequestFailed, "Failed to send the app invite request to Facebook: " + e3.getMessage())));
                    }
                }
            }
        } else if (callback != null) {
            callback.onCompleted(new SocialServiceResponse(serviceName(), null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorUnsupportedRequest, "Request type not supported")));
        }
    }

    private void a(SocialServiceRequest.SocialGetUserProfileRequest socialGetUserProfileRequest, final SocialServiceRequest.Callback callback) {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Enter getUserProfile");
        if (callback == null) {
            Log.e(GlobalSetting.FACEBOOK_SDK_WRAPPER, "getUserProfile callback is null");
        } else if (!FacebookSdk.isInitialized()) {
            Log.e(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Cannot get Facebook user profile because FacebookSDK has not been correctly initialized!");
        } else if (AccessToken.getCurrentAccessToken() == null) {
            Log.e(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Cannot get Facebook user profile as there is no access token");
        } else {
            this.e.runOnUiThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.FacebookService.4
                @Override // java.lang.Runnable
                public void run() {
                    GraphRequest.newMeRequest(AccessToken.getCurrentAccessToken(), new GraphRequest.GraphJSONObjectCallback() { // from class: com.rovio.rcs.socialnetwork.FacebookService.4.1
                        @Override // com.facebook.GraphRequest.GraphJSONObjectCallback
                        public void onCompleted(JSONObject jSONObject, GraphResponse graphResponse) {
                            SocialServiceResponse.Error error;
                            SocialServiceObject.SocialUserProfile socialUserProfile = null;
                            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "enter onCompleted");
                            if (jSONObject == null || graphResponse == null) {
                                Log.e(GlobalSetting.FACEBOOK_SDK_WRAPPER, "user or response is null");
                            }
                            try {
                                AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
                                if (currentAccessToken == null) {
                                    error = new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorGetFailed, "Cannot get Facebook user profile as there is no access token");
                                } else if (graphResponse.getError() != null) {
                                    error = new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorGetFailed, graphResponse.getError().getErrorMessage());
                                } else {
                                    socialUserProfile = new SocialServiceObject.SocialUserProfile(jSONObject.getString("id"), null, jSONObject.getString("name"), "https://graph.facebook-com/v3.0/" + jSONObject.getString("id") + "/picture?type=large", currentAccessToken.getToken());
                                    error = null;
                                }
                            } catch (JSONException e) {
                                Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Exception when parsing user profile: " + e.getMessage());
                                error = new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorGetFailed, e.getMessage());
                            }
                            callback.onCompleted(new SocialServiceResponse(FacebookService.this.serviceName(), socialUserProfile, error));
                            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "exit onCompleted");
                        }
                    }).executeAsync();
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "start getting user profile");
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(SocialServiceRequest.SocialAppRequest socialAppRequest, SocialServiceRequest.Callback callback) {
        char c;
        boolean z;
        boolean z2;
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "sending request: " + socialAppRequest.title() + " - " + socialAppRequest.message());
        if (this.e == null) {
            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "SendAppRequest: m_activity == null");
            return;
        }
        try {
            this.c = callback;
            GameRequestContent.Builder title = new GameRequestContent.Builder().setMessage(socialAppRequest.message()).setTitle(socialAppRequest.title());
            switch (socialAppRequest.userInteractionMode()) {
                case PROMPT_CONFIRMATION_SUGGESTED:
                    title.setSuggestions(new ArrayList(Arrays.asList(socialAppRequest.userIds())));
                    break;
                case NO_CONFIRMATION:
                    Log.w(GlobalSetting.FACEBOOK_SDK_WRAPPER, "NO_CONFIRMATION interaction mode is not supported on android Facebook SDK 4.x! Fallingthrough CONFIRMATION_DIRECTED mode");
                case PROMPT_CONFIRMATION_DIRECTED:
                    StringBuilder sb = new StringBuilder();
                    for (String str : socialAppRequest.userIds()) {
                        sb.append(str).append(",");
                    }
                    title.setTo(sb.toString());
                    break;
            }
            for (Map.Entry<String, String> entry : socialAppRequest.customParams().entrySet()) {
                if (entry.getValue() != null) {
                    String key = entry.getKey();
                    switch (key.hashCode()) {
                        case -1489595877:
                            if (key.equals("object_id")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -854547461:
                            if (key.equals(ShareConstants.WEB_DIALOG_PARAM_FILTERS)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3076010:
                            if (key.equals(ShareConstants.WEB_DIALOG_PARAM_DATA)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1583758243:
                            if (key.equals(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            String value = entry.getValue();
                            switch (value.hashCode()) {
                                case -1408445520:
                                    if (value.equals("askfor")) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 3526536:
                                    if (value.equals("send")) {
                                        z2 = false;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 3571837:
                                    if (value.equals("turn")) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                default:
                                    z2 = true;
                                    break;
                            }
                            switch (z2) {
                                case false:
                                    title.setActionType(GameRequestContent.ActionType.SEND);
                                    continue;
                                    continue;
                                case true:
                                    title.setActionType(GameRequestContent.ActionType.ASKFOR);
                                    continue;
                                case true:
                                    title.setActionType(GameRequestContent.ActionType.TURN);
                                    continue;
                                default:
                                    Log.w(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Invalid action type for app request: " + entry.getValue() + ". Supported action_type values: [\"send\" | \"askfor\" | \"turn\"]");
                                    continue;
                            }
                        case 1:
                            title.setData(entry.getValue());
                            continue;
                        case 2:
                            String value2 = entry.getValue();
                            switch (value2.hashCode()) {
                                case -1402499720:
                                    if (value2.equals("app_non_users")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case 1844350570:
                                    if (value2.equals("app_users")) {
                                        z = false;
                                        break;
                                    }
                                    z = true;
                                    break;
                                default:
                                    z = true;
                                    break;
                            }
                            switch (z) {
                                case false:
                                    title.setFilters(GameRequestContent.Filters.APP_USERS);
                                    continue;
                                    continue;
                                case true:
                                    title.setFilters(GameRequestContent.Filters.APP_NON_USERS);
                                    continue;
                                default:
                                    Log.w(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Invalid filters specified for app request: " + entry.getValue() + ". Supported filters values: [\"app_users\" | \"app_non_users\"]");
                                    continue;
                            }
                        case 3:
                            title.setObjectId(entry.getValue());
                            continue;
                        default:
                            Log.w(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Invalid key specified for appRequest customParam: " + entry.getKey() + ". Supported custom parameters: [\"action_type\" | \"data\" | \"filters\"]");
                            continue;
                    }
                } else {
                    Log.w(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Value for custom parameter with key \"" + entry.getKey() + "\" cannot be null!");
                }
            }
            GameRequestDialog gameRequestDialog = new GameRequestDialog(this.e);
            gameRequestDialog.registerCallback(this.d, new FacebookCallback<GameRequestDialog.Result>() { // from class: com.rovio.rcs.socialnetwork.FacebookService.5
                @Override // com.facebook.FacebookCallback
                public void onSuccess(GameRequestDialog.Result result) {
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "GameRequest onSuccess callback received with result " + result);
                    FacebookService.this.c.onCompleted(new SocialServiceResponse(FacebookService.this.serviceName(), new SocialServiceObject.SocialSendAppRequestResult(), null));
                    FacebookService.this.c = null;
                }

                @Override // com.facebook.FacebookCallback
                public void onCancel() {
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "GameRequest onCancel callback received!");
                    SocialServiceObject.SocialSendAppRequestResult socialSendAppRequestResult = new SocialServiceObject.SocialSendAppRequestResult();
                    socialSendAppRequestResult.setCancelled(true);
                    FacebookService.this.c.onCompleted(new SocialServiceResponse(FacebookService.this.serviceName(), socialSendAppRequestResult, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorSendAppRequestFailed, "")));
                    FacebookService.this.c = null;
                }

                @Override // com.facebook.FacebookCallback
                public void onError(FacebookException facebookException) {
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "GameRequest onError callback received with error " + facebookException.getMessage());
                    FacebookService.this.c.onCompleted(new SocialServiceResponse(FacebookService.this.serviceName(), new SocialServiceObject.SocialSendAppRequestResult(), new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorSendAppRequestFailed, facebookException.getMessage())));
                    FacebookService.this.c = null;
                }
            });
            GameRequestContent build = title.build();
            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Showing gamerequestdialog with content: " + build.getTitle() + " | " + build.getMessage() + " | " + build.getActionType());
            gameRequestDialog.show(build);
        } catch (Exception e) {
            Log.e(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Exception when sending app request: " + e.getMessage());
            throw new SocialServiceExceptions(e.getMessage(), SocialServiceExceptions.ExceptionCode.FACEBOOK_SEND_APP_REQUEST_FAILED);
        }
    }

    private void a(SocialServiceRequest.SocialAppInviteRequest socialAppInviteRequest, SocialServiceRequest.Callback callback) {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "sending request: " + socialAppInviteRequest.appLinkUrl() + " - " + socialAppInviteRequest.previewImageUrl());
        if (this.e == null) {
            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "SendAppInviteRequest: m_activity == null");
            return;
        }
        try {
            this.c = callback;
            AppInviteContent build = new AppInviteContent.Builder().setApplinkUrl(socialAppInviteRequest.appLinkUrl()).setPreviewImageUrl(socialAppInviteRequest.previewImageUrl()).build();
            AppInviteDialog appInviteDialog = new AppInviteDialog(this.e);
            appInviteDialog.registerCallback(this.d, new FacebookCallback<AppInviteDialog.Result>() { // from class: com.rovio.rcs.socialnetwork.FacebookService.6
                @Override // com.facebook.FacebookCallback
                public void onSuccess(AppInviteDialog.Result result) {
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "AppInvite onSuccess callback received with result " + result);
                    FacebookService.this.c.onCompleted(new SocialServiceResponse(FacebookService.this.serviceName(), new SocialServiceObject.SocialSendAppInviteRequestResult(), null));
                    FacebookService.this.c = null;
                }

                @Override // com.facebook.FacebookCallback
                public void onCancel() {
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "AppInvite onCancel callback received!");
                    SocialServiceObject.SocialSendAppInviteRequestResult socialSendAppInviteRequestResult = new SocialServiceObject.SocialSendAppInviteRequestResult();
                    socialSendAppInviteRequestResult.setCancelled(true);
                    FacebookService.this.c.onCompleted(new SocialServiceResponse(FacebookService.this.serviceName(), socialSendAppInviteRequestResult, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorSendAppRequestFailed, "")));
                    FacebookService.this.c = null;
                }

                @Override // com.facebook.FacebookCallback
                public void onError(FacebookException facebookException) {
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "AppInvite onError callback received with error " + facebookException.getMessage());
                    FacebookService.this.c.onCompleted(new SocialServiceResponse(FacebookService.this.serviceName(), new SocialServiceObject.SocialSendAppInviteRequestResult(), new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorSendAppRequestFailed, facebookException.getMessage())));
                    FacebookService.this.c = null;
                }
            });
            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Showing AppInviteDialog with content: " + build.getApplinkUrl() + " | " + build.getPreviewImageUrl());
            appInviteDialog.show(build);
        } catch (Exception e) {
            Log.e(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Exception when sending app request: " + e.getMessage());
            throw new SocialServiceExceptions(e.getMessage(), SocialServiceExceptions.ExceptionCode.FACEBOOK_SEND_APP_REQUEST_FAILED);
        }
    }

    private void a(final SocialServiceRequest.SocialSharingRequest socialSharingRequest, final SocialServiceRequest.Callback callback) {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "sharing: " + socialSharingRequest.url() + socialSharingRequest.text());
        if (this.e == null) {
            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Share: m_activity == null");
            return;
        }
        try {
            this.e.runOnUiThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.FacebookService.7
                @Override // java.lang.Runnable
                public void run() {
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Sharing m_activity.runOnUiThread");
                    FacebookService.this.b = socialSharingRequest;
                    FacebookService.this.c = callback;
                    AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
                    if (currentAccessToken == null) {
                        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "No valid facebook token available: active token is null!");
                        return;
                    }
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "active token is " + currentAccessToken.toString());
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "m_requestSharePermissionCancelled:= " + FacebookService.m_requestSharePermissionCancelled);
                    if (FacebookService.m_requestSharePermissionCancelled && FacebookService.this.c != null) {
                        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "share request is cancelled. ");
                        boolean unused = FacebookService.m_requestSharePermissionCancelled = false;
                        FacebookService.this.c.onCompleted(new SocialServiceResponse(FacebookService.this.serviceName(), null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorRequestCancelled, "Facebook sharing request was cancelled.")));
                        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Cancellation: onCompleted ");
                        FacebookService.this.b = null;
                        FacebookService.this.c = null;
                        return;
                    }
                    Set<String> permissions = currentAccessToken.getPermissions();
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "permissions.size() = " + permissions.size());
                    Iterator<String> it = permissions.iterator();
                    while (it.hasNext()) {
                        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, it.next() + ",");
                    }
                    if (!permissions.containsAll(FacebookService.PERMISSIONS) && !FacebookService.m_tokenUpdatedForSharing) {
                        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "request Publish Permissions");
                        FacebookService.this.a();
                        return;
                    }
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "start creating sharing request");
                    if (socialSharingRequest.sharingType() == SocialServiceRequest.SocialSharingRequest.SharingType.SHARING_TYPE_VIDEO) {
                        FacebookService.this.a(socialSharingRequest);
                    } else if (socialSharingRequest.sharingType() == SocialServiceRequest.SocialSharingRequest.SharingType.SHARING_TYPE_SCORE) {
                        FacebookService.this.c(socialSharingRequest);
                    } else if (socialSharingRequest.url() == null || socialSharingRequest.url().length() <= 0) {
                        FacebookService.this.d(socialSharingRequest);
                    } else {
                        FacebookService.this.b(socialSharingRequest);
                    }
                }
            });
        } catch (Exception e) {
            throw new SocialServiceExceptions("Facebook session sharing failed", SocialServiceExceptions.ExceptionCode.FACEBOOK_SESSION_SHARE_FAILED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SocialServiceRequest.SocialSharingRequest socialSharingRequest) {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Sharing type: VIDEO");
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Video sharing is not currently implemented. Sharing basic link instead...");
        if (this.c != null) {
            this.c.onStarted(socialSharingRequest);
        }
        m_tokenUpdatedForSharing = false;
        Bundle bundle = new Bundle();
        if (socialSharingRequest.url() != null && socialSharingRequest.url().length() > 0) {
            bundle.putString("link", socialSharingRequest.url());
        }
        if (socialSharingRequest.text() != null && socialSharingRequest.text().length() > 0) {
            bundle.putString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, socialSharingRequest.text());
        }
        new GraphRequest(AccessToken.getCurrentAccessToken(), "me/feed", bundle, HttpMethod.POST, new GraphRequest.Callback() { // from class: com.rovio.rcs.socialnetwork.FacebookService.8
            @Override // com.facebook.GraphRequest.Callback
            public void onCompleted(GraphResponse graphResponse) {
                FacebookService.this.a(graphResponse, FacebookService.this.c);
            }
        }).executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SocialServiceRequest.SocialSharingRequest socialSharingRequest) {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Sharing type: LINK");
        if (this.c != null) {
            this.c.onStarted(socialSharingRequest);
        }
        m_tokenUpdatedForSharing = false;
        Bundle bundle = new Bundle();
        if (socialSharingRequest.url() != null && socialSharingRequest.url().length() > 0) {
            bundle.putString("link", socialSharingRequest.url());
        }
        if (socialSharingRequest.text() != null && socialSharingRequest.text().length() > 0) {
            bundle.putString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, socialSharingRequest.text());
            bundle.putString("description", socialSharingRequest.text());
        }
        if (socialSharingRequest.imageURL() != null && socialSharingRequest.imageURL().length() > 0) {
            bundle.putString("picture", socialSharingRequest.imageURL());
        }
        if (socialSharingRequest.title() != null && socialSharingRequest.title().length() > 0) {
            bundle.putString("name", socialSharingRequest.title());
        }
        new GraphRequest(AccessToken.getCurrentAccessToken(), "me/feed", bundle, HttpMethod.POST, new GraphRequest.Callback() { // from class: com.rovio.rcs.socialnetwork.FacebookService.9
            @Override // com.facebook.GraphRequest.Callback
            public void onCompleted(GraphResponse graphResponse) {
                FacebookService.this.a(graphResponse, FacebookService.this.c);
            }
        }).executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(SocialServiceRequest.SocialSharingRequest socialSharingRequest) {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Sharing type: SCORE");
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Publishing score: " + socialSharingRequest.text() + " to Facebook");
        m_tokenUpdatedForSharing = false;
        Bundle bundle = new Bundle();
        bundle.putString("score", socialSharingRequest.text());
        if (this.c != null) {
            this.c.onStarted(socialSharingRequest);
            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "onStarted has been invoked");
        }
        new GraphRequest(AccessToken.getCurrentAccessToken(), "me/scores", bundle, HttpMethod.POST, new GraphRequest.Callback() { // from class: com.rovio.rcs.socialnetwork.FacebookService.10
            @Override // com.facebook.GraphRequest.Callback
            public void onCompleted(GraphResponse graphResponse) {
                FacebookService.this.a(graphResponse, FacebookService.this.c);
            }
        }).executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SocialServiceRequest.SocialSharingRequest socialSharingRequest) {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Sharing type: " + socialSharingRequest.sharingType());
        if (socialSharingRequest.text() != null || socialSharingRequest.url() != null) {
            if (this.c != null) {
                this.c.onStarted(socialSharingRequest);
                Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "onStarted has been invoked");
            }
            m_tokenUpdatedForSharing = false;
            String str = "";
            if (socialSharingRequest.text() != null && socialSharingRequest.text().length() > 0) {
                str = "" + socialSharingRequest.text();
            }
            if (socialSharingRequest.url() != null && socialSharingRequest.url().length() > 0) {
                str = str + " " + socialSharingRequest.url();
            }
            Bundle bundle = new Bundle();
            bundle.putString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str);
            new GraphRequest(AccessToken.getCurrentAccessToken(), "me/feed", bundle, HttpMethod.POST, new GraphRequest.Callback() { // from class: com.rovio.rcs.socialnetwork.FacebookService.11
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(GraphResponse graphResponse) {
                    FacebookService.this.a(graphResponse, FacebookService.this.c);
                }
            }).executeAsync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(GraphResponse graphResponse, SocialServiceRequest.Callback callback) {
        Object obj;
        SocialServiceResponse.Error error;
        SocialServiceObject.SocialSharingResult socialSharingResult = null;
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "sharing response: " + graphResponse);
        if (callback != null) {
            if (graphResponse.getError() != null) {
                error = new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorPostFailed, graphResponse.getError().getErrorMessage());
            } else {
                SocialServiceObject.SocialSharingResult socialSharingResult2 = new SocialServiceObject.SocialSharingResult();
                try {
                    obj = graphResponse.getJSONObject().get("id");
                } catch (JSONException e) {
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Exception when parsing id from FB share response: " + e.getMessage());
                    obj = null;
                }
                if (obj != null) {
                    socialSharingResult2.setSharedPostId(obj.toString());
                }
                socialSharingResult = socialSharingResult2;
                error = null;
            }
            callback.onCompleted(new SocialServiceResponse(serviceName(), socialSharingResult, error));
        }
    }

    private void a(final SocialServiceRequest.SocialGetFriendsRequest socialGetFriendsRequest, final SocialServiceRequest.Callback callback) {
        this.e.runOnUiThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.FacebookService.12
            @Override // java.lang.Runnable
            public void run() {
                if (callback == null) {
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "getFriends callback is null");
                    return;
                }
                if (!FacebookService.this.isLoggedIn()) {
                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Could not get friends because no facebook user is currently logged in");
                }
                GraphRequest newMyFriendsRequest = GraphRequest.newMyFriendsRequest(AccessToken.getCurrentAccessToken(), new GraphRequest.GraphJSONArrayCallback() { // from class: com.rovio.rcs.socialnetwork.FacebookService.12.1
                    @Override // com.facebook.GraphRequest.GraphJSONArrayCallback
                    public void onCompleted(JSONArray jSONArray, GraphResponse graphResponse) {
                        SocialServiceResponse.Error error;
                        SocialServiceObject.SocialUserList socialUserList = null;
                        if (graphResponse.getError() != null) {
                            error = new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorGetFailed, graphResponse.getError().getErrorMessage());
                        } else {
                            ArrayList arrayList = new ArrayList(jSONArray.length());
                            for (int i = 0; i < jSONArray.length(); i++) {
                                try {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                                    SocialServiceObject.SocialUser socialUser = new SocialServiceObject.SocialUser(jSONObject.getString("id"));
                                    if (socialGetFriendsRequest.getRequestType() == SocialServiceRequest.SocialGetFriendsRequest.RequestType.FULL_PROFILE) {
                                        socialUser.setProfileImageURL(FacebookService.getFacebookAvatarImageURL(jSONObject.getString("id")));
                                        socialUser.setName(jSONObject.getString("name"));
                                    }
                                    arrayList.add(socialUser);
                                } catch (JSONException e) {
                                    Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Exception while parsing friends data: " + e.toString());
                                }
                            }
                            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "num of friends: " + arrayList.size());
                            socialUserList = new SocialServiceObject.SocialUserList(arrayList);
                            error = null;
                        }
                        callback.onCompleted(new SocialServiceResponse(FacebookService.this.serviceName(), socialUserList, error));
                    }
                });
                Bundle bundle = new Bundle();
                bundle.putString("limit", "500");
                bundle.putString(GraphRequest.FIELDS_PARAM, "id,name");
                newMyFriendsRequest.setParameters(bundle);
                try {
                    newMyFriendsRequest.executeAsync();
                } catch (IllegalStateException e) {
                    Log.e(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Could not send GetFriends request: " + e.toString());
                }
            }
        });
    }

    /* loaded from: classes4.dex */
    private class FBServiceAccessTokenTracker extends AccessTokenTracker {
        private FBServiceAccessTokenTracker() {
        }

        @Override // com.facebook.AccessTokenTracker
        protected void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken2) {
            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "onCurrentAccessTokenChanged: oldToken ");
            if (accessToken != null) {
                Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "Old Access Token: " + accessToken.toString());
            }
            if (accessToken2 != null) {
                Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "New Access Token: " + accessToken2.toString());
            }
            if (accessToken != accessToken2 && accessToken != null && accessToken2 != null) {
                FacebookService.this.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (isLoggedIn()) {
            LoginManager.getInstance().logInWithPublishPermissions(this.e, PERMISSIONS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "start token updated");
        m_tokenUpdatedForSharing = true;
        if (this.b != null) {
            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "start pending request");
            startRequest(this.b, this.c);
        }
    }

    public void onCreate() {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "onCreate");
    }

    public void onCreate(Bundle bundle) {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "onCreate(Bundle)");
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onResume() {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "onResume");
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onPause() {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "onPause");
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onDestroy() {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "onDestroy");
        if (this.f) {
            Globals.unregisterActivityListener(this);
        }
        if (this.i.isTracking()) {
            this.i.stopTracking();
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onNewIntent(Intent intent) {
        Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "onNewIntent");
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.d != null) {
            Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "onActivityResult " + i + ", " + i2 + ", " + intent);
            if (i == 100 && (i2 == 0 || i2 == -1)) {
                m_requestSharePermissionCancelled = true;
            }
            if (!this.d.onActivityResult(i, i2, intent) && intent == null && this.c != null) {
                Log.d(GlobalSetting.FACEBOOK_SDK_WRAPPER, "CallbackManager.onActivityResult failed. OnActivityResult Intent data is empty.");
                this.c.onCompleted(new SocialServiceResponse(serviceName(), new SocialServiceObject.SocialSendAppInviteRequestResult(), new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorPendingRequestFailed, "CallbackManager.onActivityResult failed. OnActivityResult Intent data is empty.")));
                this.c = null;
            }
        }
    }

    private boolean c() {
        String sdkVersion = FacebookSdk.getSdkVersion();
        if (versionCompare(!TextUtils.isEmpty(sdkVersion) ? sdkVersion.split("/")[0] : null, MINIMUM_FACEBOOK_SDK_VERSION).intValue() >= 0) {
            return true;
        }
        Log.e(GlobalSetting.FACEBOOK_SDK_WRAPPER, "The Facebook SDK in use (" + sdkVersion + ") is older than the one required (" + MINIMUM_FACEBOOK_SDK_VERSION + ") by this SDK.");
        return false;
    }

    public Integer versionCompare(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        return (i >= split.length || i >= split2.length) ? Integer.valueOf(Integer.signum(split.length - split2.length)) : Integer.valueOf(Integer.signum(Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i]))));
    }
}
