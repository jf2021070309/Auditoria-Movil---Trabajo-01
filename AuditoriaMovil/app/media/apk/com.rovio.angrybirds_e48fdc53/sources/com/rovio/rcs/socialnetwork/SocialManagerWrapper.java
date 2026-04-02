package com.rovio.rcs.socialnetwork;

import com.rovio.fusion.Globals;
import com.rovio.rcs.socialnetwork.SocialServiceManager;
import com.rovio.rcs.socialnetwork.SocialServiceRequest;
import com.rovio.rcs.socialnetwork.SocialServiceResponse;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class SocialManagerWrapper {
    private static final boolean ENABLE_LOGGING = false;
    private static SocialManagerWrapper instance;
    private long a;
    private SocialServiceManager b = new SocialServiceManager();

    /* JADX INFO: Access modifiers changed from: private */
    public native void onGetFriendsCallback(long j, String str, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onGetUserProfileCallback(long j, String str, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onLoginCompleteCallback(long j, String str, boolean z, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onSendAppInviteRequestCallback(long j, SocialServiceResponse socialServiceResponse, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onSendAppRequestCallback(long j, SocialServiceResponse socialServiceResponse, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onShareCallback(long j, SocialServiceResponse socialServiceResponse, int i);

    public static SocialManagerWrapper createSocialManagerWrapper(long j) {
        if (instance == null) {
            instance = new SocialManagerWrapper(j);
        }
        return instance;
    }

    private SocialManagerWrapper(long j) {
        this.a = j;
    }

    public void destroy() {
        this.a = 0L;
    }

    public void setServiceConfiguration(String str, boolean z) {
        SocialServiceManager.sServiceConfigurationInfo.put(str, Boolean.valueOf(z));
        if (this.b != null) {
            this.b.configure(null);
        }
    }

    public int numOfServices() {
        if (this.b == null) {
            return 0;
        }
        return this.b.numOfServices();
    }

    public String[] serviceNames() {
        if (this.b == null) {
            return null;
        }
        return this.b.getServiceNames();
    }

    public void serviceLogin(final String str, final int i, final String str2) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                if (SocialManagerWrapper.this.b != null) {
                    SocialManagerWrapper.this.b.serviceLogin(str, new SocialServiceManager.LoginCallback() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.1.1
                        @Override // com.rovio.rcs.socialnetwork.SocialServiceManager.LoginCallback
                        public void onLoginCompleted(String str3, boolean z) {
                            SocialManagerWrapper.this.a(str3, z, i);
                        }
                    }, SocialManagerWrapper.this.a(str2));
                }
            }
        });
    }

    public void serviceLogout(final String str) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                if (SocialManagerWrapper.this.b != null) {
                    SocialManagerWrapper.this.b.serviceLogout(str);
                }
            }
        });
    }

    public boolean isServiceLoggedIn(String str) {
        if (this.b != null) {
            return this.b.isServiceLoggedin(str);
        }
        return false;
    }

    public void getUserProfile(final String str, final int i) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                BaseSocialService socialServiceForName = SocialManagerWrapper.this.b != null ? SocialManagerWrapper.this.b.getSocialServiceForName(str) : null;
                if (socialServiceForName == null) {
                    SocialManagerWrapper.this.d(new SocialServiceResponse(str, null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorNoService, "Service not configured!")), i);
                } else {
                    socialServiceForName.startRequest(new SocialServiceRequest.SocialGetUserProfileRequest(), new SocialServiceRequest.Callback() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.3.1
                        @Override // com.rovio.rcs.socialnetwork.SocialServiceRequest.Callback
                        public void onStarted(SocialServiceRequest socialServiceRequest) {
                        }

                        @Override // com.rovio.rcs.socialnetwork.SocialServiceRequest.Callback
                        public void onCompleted(SocialServiceResponse socialServiceResponse) {
                            if (socialServiceResponse == null) {
                                socialServiceResponse = new SocialServiceResponse(str, null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorGetFailed, "Response from SocialService is null!"));
                            }
                            SocialManagerWrapper.this.d(socialServiceResponse, i);
                        }
                    });
                }
            }
        });
    }

    public void sendAppRequest(final int i, final String[] strArr, final String str, final String str2, final String str3, final String str4, final int i2) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                BaseSocialService socialServiceForName = SocialManagerWrapper.this.b != null ? SocialManagerWrapper.this.b.getSocialServiceForName(str4) : null;
                if (socialServiceForName == null) {
                    SocialManagerWrapper.this.b(new SocialServiceResponse(str4, null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorNoService, "Service not configured!")), i2);
                } else {
                    socialServiceForName.startRequest(new SocialServiceRequest.SocialAppRequest(SocialServiceRequest.SocialAppRequest.UserInteractionMode.values()[i], strArr, str, str2, SocialManagerWrapper.this.a(str3)), new SocialServiceRequest.Callback() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.4.1
                        @Override // com.rovio.rcs.socialnetwork.SocialServiceRequest.Callback
                        public void onStarted(SocialServiceRequest socialServiceRequest) {
                        }

                        @Override // com.rovio.rcs.socialnetwork.SocialServiceRequest.Callback
                        public void onCompleted(SocialServiceResponse socialServiceResponse) {
                            if (socialServiceResponse == null) {
                                socialServiceResponse = new SocialServiceResponse(str4, null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorGetFailed, "Response from SocialService is null!"));
                            }
                            SocialManagerWrapper.this.b(socialServiceResponse, i2);
                        }
                    });
                }
            }
        });
    }

    public void sendAppInviteRequest(final String str, final String str2, final String str3, final int i) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.5
            @Override // java.lang.Runnable
            public void run() {
                BaseSocialService socialServiceForName = SocialManagerWrapper.this.b != null ? SocialManagerWrapper.this.b.getSocialServiceForName(str3) : null;
                if (socialServiceForName == null) {
                    SocialManagerWrapper.this.c(new SocialServiceResponse(str3, null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorNoService, "Service not configured!")), i);
                } else {
                    socialServiceForName.startRequest(new SocialServiceRequest.SocialAppInviteRequest(str, str2), new SocialServiceRequest.Callback() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.5.1
                        @Override // com.rovio.rcs.socialnetwork.SocialServiceRequest.Callback
                        public void onStarted(SocialServiceRequest socialServiceRequest) {
                        }

                        @Override // com.rovio.rcs.socialnetwork.SocialServiceRequest.Callback
                        public void onCompleted(SocialServiceResponse socialServiceResponse) {
                            if (socialServiceResponse == null) {
                                socialServiceResponse = new SocialServiceResponse(str3, null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorGetFailed, "Response from SocialService is null!"));
                            }
                            SocialManagerWrapper.this.c(socialServiceResponse, i);
                        }
                    });
                }
            }
        });
    }

    public void share(final String str, final String str2, final String str3, final String str4, final String str5, final int i, final int i2) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.6
            @Override // java.lang.Runnable
            public void run() {
                BaseSocialService socialServiceForName = SocialManagerWrapper.this.b != null ? SocialManagerWrapper.this.b.getSocialServiceForName(str5) : null;
                if (socialServiceForName == null) {
                    SocialManagerWrapper.this.d(new SocialServiceResponse(str5, null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorNoService, "Service not configured!")), i2);
                } else {
                    socialServiceForName.startRequest(new SocialServiceRequest.SocialSharingRequest(SocialServiceRequest.SocialSharingRequest.SharingType.values()[i], str, str2, str4, str3), new SocialServiceRequest.Callback() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.6.1
                        @Override // com.rovio.rcs.socialnetwork.SocialServiceRequest.Callback
                        public void onStarted(SocialServiceRequest socialServiceRequest) {
                        }

                        @Override // com.rovio.rcs.socialnetwork.SocialServiceRequest.Callback
                        public void onCompleted(SocialServiceResponse socialServiceResponse) {
                            if (socialServiceResponse == null) {
                                socialServiceResponse = new SocialServiceResponse(str5, null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorGetFailed, "Response from SocialService is null!"));
                            }
                            SocialManagerWrapper.this.a(socialServiceResponse, i2);
                        }
                    });
                }
            }
        });
    }

    public void getFriends(final String str, final int i, final String str2, final int i2) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.7
            @Override // java.lang.Runnable
            public void run() {
                BaseSocialService socialServiceForName = SocialManagerWrapper.this.b != null ? SocialManagerWrapper.this.b.getSocialServiceForName(str2) : null;
                if (socialServiceForName == null) {
                    SocialManagerWrapper.this.e(new SocialServiceResponse(str2, null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorNoService, "service " + str2 + " doesn't exist!")), i2);
                } else {
                    socialServiceForName.startRequest(new SocialServiceRequest.SocialGetFriendsRequest(str, i), new SocialServiceRequest.Callback() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.7.1
                        @Override // com.rovio.rcs.socialnetwork.SocialServiceRequest.Callback
                        public void onStarted(SocialServiceRequest socialServiceRequest) {
                        }

                        @Override // com.rovio.rcs.socialnetwork.SocialServiceRequest.Callback
                        public void onCompleted(SocialServiceResponse socialServiceResponse) {
                            SocialManagerWrapper.this.e(socialServiceResponse, i2);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (JSONException e) {
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final SocialServiceResponse socialServiceResponse, final int i) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.8
            @Override // java.lang.Runnable
            public void run() {
                if (SocialManagerWrapper.this.a != 0) {
                    SocialManagerWrapper.this.onShareCallback(SocialManagerWrapper.this.a, socialServiceResponse, i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final SocialServiceResponse socialServiceResponse, final int i) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.9
            @Override // java.lang.Runnable
            public void run() {
                if (SocialManagerWrapper.this.a != 0) {
                    SocialManagerWrapper.this.onSendAppRequestCallback(SocialManagerWrapper.this.a, socialServiceResponse, i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final SocialServiceResponse socialServiceResponse, final int i) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.10
            @Override // java.lang.Runnable
            public void run() {
                if (SocialManagerWrapper.this.a != 0) {
                    SocialManagerWrapper.this.onSendAppInviteRequestCallback(SocialManagerWrapper.this.a, socialServiceResponse, i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final SocialServiceResponse socialServiceResponse, final int i) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.11
            @Override // java.lang.Runnable
            public void run() {
                if (SocialManagerWrapper.this.a != 0) {
                    SocialManagerWrapper.this.onGetUserProfileCallback(SocialManagerWrapper.this.a, socialServiceResponse.toJSON().toString(), i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SocialServiceResponse socialServiceResponse, final int i) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.12
            @Override // java.lang.Runnable
            public void run() {
                if (SocialManagerWrapper.this.a != 0) {
                    SocialManagerWrapper.this.onGetFriendsCallback(SocialManagerWrapper.this.a, socialServiceResponse.toJSON().toString(), i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final boolean z, final int i) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.socialnetwork.SocialManagerWrapper.13
            @Override // java.lang.Runnable
            public void run() {
                if (SocialManagerWrapper.this.a != 0) {
                    SocialManagerWrapper.this.onLoginCompleteCallback(SocialManagerWrapper.this.a, str, z, i);
                }
            }
        });
    }
}
