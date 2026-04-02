package com.rovio.rcs.socialnetwork;

import com.rovio.fusion.IActivityListener;
import com.rovio.rcs.socialnetwork.SocialServiceRequest;
import java.util.Map;
/* loaded from: classes4.dex */
public interface BaseSocialService extends IActivityListener {
    public static final String FACEBOOK = "Facebook";
    public static final String OTHER = "Others";

    /* loaded from: classes4.dex */
    public interface LoginCallback {
        void onCompleted(String str, boolean z);
    }

    void accessAccount();

    boolean isAccountAvailable();

    boolean isLoggedIn();

    void login(LoginCallback loginCallback, Map<String, String> map);

    void logout();

    void onActivate(boolean z);

    boolean onOpenUrl(String str);

    String serviceName();

    void startRequest(SocialServiceRequest socialServiceRequest, SocialServiceRequest.Callback callback);

    boolean supportMultipleAccounts();
}
