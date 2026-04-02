package com.rovio.rcs.socialnetwork;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.rovio.rcs.socialnetwork.BaseSocialService;
import com.rovio.rcs.socialnetwork.SocialServiceRequest;
import com.rovio.rcs.socialnetwork.SocialServiceResponse;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes4.dex */
public class SocialServiceManager {
    private static final boolean ENABLE_LOGGING = false;
    private static final String TAG = SocialServiceManager.class.getSimpleName();
    static Map<String, Boolean> sServiceConfigurationInfo = new HashMap();
    private Map<String, BaseSocialService> a;
    private Queue<SocialServiceRequestMetaData> b;
    private boolean c = false;

    /* loaded from: classes4.dex */
    public interface Callback {
        void onCompleted(SocialServiceResponse[] socialServiceResponseArr);

        void onStarted(SocialServiceRequest socialServiceRequest);
    }

    /* loaded from: classes4.dex */
    public interface LoginCallback {
        void onLoginCompleted(String str, boolean z);
    }

    public SocialServiceManager(Activity activity) {
        configure(activity);
    }

    public SocialServiceManager() {
        configure(null);
    }

    public void configure(Activity activity) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        if (this.b == null) {
            this.b = new LinkedList();
        }
        if (sServiceConfigurationInfo.get(BaseSocialService.FACEBOOK) == Boolean.TRUE && this.a.get(BaseSocialService.FACEBOOK) == null) {
            a(activity, "com.rovio.rcs.socialnetwork.FacebookService");
        }
    }

    public int numOfServices() {
        return this.a.size();
    }

    public String[] getServiceNames() {
        return (String[]) this.a.keySet().toArray(new String[0]);
    }

    public BaseSocialService getSocialServiceForName(String str) {
        return this.a.get(str);
    }

    public void serviceLogin(final String str, final LoginCallback loginCallback, Map<String, String> map) {
        BaseSocialService socialServiceForName = getSocialServiceForName(str);
        if (socialServiceForName != null) {
            socialServiceForName.login(new BaseSocialService.LoginCallback() { // from class: com.rovio.rcs.socialnetwork.SocialServiceManager.1
                @Override // com.rovio.rcs.socialnetwork.BaseSocialService.LoginCallback
                public void onCompleted(String str2, boolean z) {
                    loginCallback.onLoginCompleted(str, z);
                }
            }, map);
        } else {
            loginCallback.onLoginCompleted(str, false);
        }
    }

    public void serviceLogout(String str) {
        BaseSocialService socialServiceForName = getSocialServiceForName(str);
        if (socialServiceForName != null) {
            socialServiceForName.logout();
        }
    }

    public boolean isServiceLoggedin(String str) {
        BaseSocialService socialServiceForName = getSocialServiceForName(str);
        if (socialServiceForName != null) {
            return socialServiceForName.isLoggedIn();
        }
        return false;
    }

    public boolean onOpenUrl(String str) {
        return false;
    }

    public void onActivate(boolean z) {
    }

    public void onResume() {
        for (Map.Entry<String, BaseSocialService> entry : this.a.entrySet()) {
            entry.getValue().onResume();
        }
    }

    public void onPause() {
        for (Map.Entry<String, BaseSocialService> entry : this.a.entrySet()) {
            entry.getValue().onPause();
        }
    }

    public void onDestroy() {
        for (Map.Entry<String, BaseSocialService> entry : this.a.entrySet()) {
            entry.getValue().onDestroy();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        for (Map.Entry<String, BaseSocialService> entry : this.a.entrySet()) {
            entry.getValue().onActivityResult(i, i2, intent);
        }
    }

    public void startRequest(SocialServiceRequest socialServiceRequest, String[] strArr, Callback callback) {
        SocialServiceRequestMetaData socialServiceRequestMetaData = new SocialServiceRequestMetaData(socialServiceRequest, strArr, callback);
        if (socialServiceRequestMetaData != null) {
            this.b.offer(socialServiceRequestMetaData);
            if (this.b.peek() == socialServiceRequestMetaData) {
                a(socialServiceRequestMetaData);
            }
        }
    }

    private void a(Activity activity, String str) {
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(Activity.class);
            declaredConstructor.setAccessible(true);
            BaseSocialService baseSocialService = (BaseSocialService) declaredConstructor.newInstance(activity);
            if (baseSocialService != null) {
                this.a.put(baseSocialService.serviceName(), baseSocialService);
            }
            declaredConstructor.setAccessible(false);
        } catch (Exception e) {
            if (str.equals("com.rovio.rcs.socialnetwork.FacebookService")) {
                sServiceConfigurationInfo.put(BaseSocialService.FACEBOOK, false);
                Log.e(TAG, "Could not create Facebook service");
                e.printStackTrace();
            }
            if ((e instanceof InvocationTargetException) && (e.getCause() instanceof SocialServiceExceptions) && e.getCause().getMessage() != null) {
                Log.e(TAG, e.getCause().getMessage());
            }
        }
    }

    private void a(SocialServiceRequestMetaData socialServiceRequestMetaData) {
        if (socialServiceRequestMetaData != null) {
            b(socialServiceRequestMetaData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final SocialServiceRequestMetaData socialServiceRequestMetaData) {
        String[] b;
        if (socialServiceRequestMetaData != null) {
            int length = socialServiceRequestMetaData.b().length;
            final AtomicInteger atomicInteger = new AtomicInteger(length);
            final SocialServiceResponse[] socialServiceResponseArr = new SocialServiceResponse[length];
            this.c = false;
            for (String str : socialServiceRequestMetaData.b()) {
                BaseSocialService socialServiceForName = getSocialServiceForName(str);
                if (socialServiceForName == null) {
                    socialServiceResponseArr[atomicInteger.decrementAndGet()] = new SocialServiceResponse(str, null, new SocialServiceResponse.Error(SocialServiceResponse.Error.ErrorCode.SocialServiceErrorUnsupportedRequest, "Service not available"));
                } else if (socialServiceForName.isLoggedIn()) {
                    socialServiceForName.startRequest(socialServiceRequestMetaData.a(), new SocialServiceRequest.Callback() { // from class: com.rovio.rcs.socialnetwork.SocialServiceManager.2
                        @Override // com.rovio.rcs.socialnetwork.SocialServiceRequest.Callback
                        public void onStarted(SocialServiceRequest socialServiceRequest) {
                            if (!SocialServiceManager.this.c && (socialServiceRequest instanceof SocialServiceRequest.SocialSharingRequest)) {
                                SocialServiceManager.this.c = true;
                                Callback c = socialServiceRequestMetaData.c();
                                if (c != null) {
                                    c.onStarted(socialServiceRequestMetaData.a());
                                }
                            }
                        }

                        @Override // com.rovio.rcs.socialnetwork.SocialServiceRequest.Callback
                        public void onCompleted(SocialServiceResponse socialServiceResponse) {
                            int decrementAndGet = atomicInteger.decrementAndGet();
                            socialServiceResponseArr[decrementAndGet] = socialServiceResponse;
                            if (decrementAndGet == 0) {
                                Callback c = socialServiceRequestMetaData.c();
                                if (c != null) {
                                    c.onCompleted(socialServiceResponseArr);
                                }
                                SocialServiceManager.this.b.poll();
                                SocialServiceRequestMetaData socialServiceRequestMetaData2 = (SocialServiceRequestMetaData) SocialServiceManager.this.b.peek();
                                if (socialServiceRequestMetaData2 != null) {
                                    SocialServiceManager.this.b(socialServiceRequestMetaData2);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SocialServiceRequestMetaData {
        private SocialServiceRequest a;
        private String[] b;
        private Callback c;

        public SocialServiceRequestMetaData(SocialServiceRequest socialServiceRequest, String[] strArr, Callback callback) {
            this.a = socialServiceRequest;
            this.b = strArr;
            this.c = callback;
        }

        SocialServiceRequest a() {
            return this.a;
        }

        String[] b() {
            return this.b;
        }

        Callback c() {
            return this.c;
        }
    }
}
