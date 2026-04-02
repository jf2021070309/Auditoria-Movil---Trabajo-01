package com.sdk.ksdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.bytedance.msdk.api.v2.GMMediationAdSdk;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.facebook.appevents.AppEventsConstants;
import com.flurry.android.Constants;
import com.sdk.ksdk.gro.GMAdManagerHolder;
import com.sdk.ksdk.gro.GroBannerAD;
import com.sdk.ksdk.gro.GroInteractionAD;
import com.sdk.ksdk.gro.GroRewardAD;
import com.sdk.ksdk.gro.GroSplashActivity;
import com.sdk.ksdk.listener.BannerListener;
import com.sdk.ksdk.listener.InteractionListener;
import com.sdk.ksdk.listener.NRewardVideoListener;
import com.sdk.ksdk.util.AllAdConfig;
import com.sdk.ksdk.util.AppInfoUtil;
import com.sdk.ksdk.util.GroAdConfig;
import com.sdk.ksdk.util.HexUtil;
import com.sdk.ksdk.util.Logger;
import com.sdk.ksdk.util.ManifestUtil;
import com.sdk.ksdk.util.Var;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class KSDK {
    private static KSDK instance;
    private static boolean sInit = false;
    private List<Integer> ableAdType;
    public HashMap<String, Integer> adTypeIndex;
    private AllAdConfig allAdConfig;
    public Activity currentActivity;
    private GroBannerAD groBannerAD;
    private GroInteractionAD groInteractionAD;
    private GroRewardAD groRewardAD;
    private List<Integer> looperIndex;
    private OkHttpClient okHttpClient;
    private ScheduledExecutorService scheduledExecutorService;
    private boolean isAutoClick = false;
    public int advertisePlan = 7;
    private int looperCount = 0;
    private int requestCount = 0;
    private boolean requestIsSuccess = false;
    private boolean isInitKs = false;
    private boolean isNeedRequest = true;
    private boolean isStartTime = false;

    private KSDK() {
    }

    public static KSDK getInstance() {
        if (instance == null) {
            instance = new KSDK();
        }
        return instance;
    }

    public void init(Activity activity, AllAdConfig allAdConfig, String umAppId) {
        if (activity == null) {
            Log.i(Var.TAG, "activity为空，无法初始化");
            return;
        }
        AppInfoUtil.getInstance().init(activity);
        ManifestUtil.getInstance().initManifest(activity);
        if (allAdConfig == null) {
            Log.i(Var.TAG, "AllAdConfig为空，无法初始化");
        } else if (TextUtils.isEmpty(umAppId)) {
            Log.i(Var.TAG, "请传入您的UM应用id");
        } else if (!sInit) {
            this.currentActivity = activity;
            this.allAdConfig = allAdConfig;
            this.scheduledExecutorService = new ScheduledThreadPoolExecutor(4);
            this.okHttpClient = new OkHttpClient();
            this.ableAdType = new ArrayList();
            if (allAdConfig.getGromoreAdConfig() != null) {
                initGromore(activity, allAdConfig.getGromoreAdConfig());
                this.ableAdType.add(0);
            }
            this.looperIndex = new ArrayList();
            HashMap<String, Integer> hashMap = new HashMap<>();
            this.adTypeIndex = hashMap;
            hashMap.put(Var.INTER_KEY, 0);
            this.adTypeIndex.put("full", 0);
            this.adTypeIndex.put(Var.REWARD_KEY, 0);
            UMConfigure.init(activity, umAppId, AppInfoUtil.getInstance().getAppName(), 1, "");
            requestApi();
            new Handler().postDelayed(new Runnable() { // from class: com.sdk.ksdk.KSDK.1
                @Override // java.lang.Runnable
                public void run() {
                    KSDK.this.isNeedRequest = false;
                }
            }, PushUIConfig.dismissTime);
            sInit = true;
        }
    }

    private void initGromore(Activity activity, GroAdConfig groAdConfig) {
        this.groInteractionAD = new GroInteractionAD();
        if (groAdConfig.getInteractionId() != null) {
            this.groInteractionAD.setIds(groAdConfig.getInteractionId());
        }
        this.groInteractionAD.setTimeClickCount(groAdConfig.getInteractionTimeClickCount());
        GroRewardAD groRewardAD = new GroRewardAD();
        this.groRewardAD = groRewardAD;
        groRewardAD.setTimeClickCount(groAdConfig.getRewardVideoTimeClickCount());
        this.groBannerAD = new GroBannerAD();
        GMAdManagerHolder.init(activity, groAdConfig.getAppId(), groAdConfig.getAppId());
        GMMediationAdSdk.requestPermissionIfNecessary(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestApi() {
        if (!this.isNeedRequest) {
            Logger.i("已到达5 second");
            startToTime(true, true);
            return;
        }
        this.requestCount++;
        String packageString = AppInfoUtil.getInstance().getPackageName();
        String versionName = AppInfoUtil.getInstance().getVersionName();
        String key = md5(packageString + "ASK" + versionName);
        String server = HexUtil.hheexx2(Var.server);
        if (TextUtils.isEmpty(server)) {
            Logger.i("request为空");
            return;
        }
        Logger.i("request:" + packageString + "，" + versionName + "，" + key);
        RequestBody formBody = new FormBody.Builder().add("appPackage", packageString).add("version", versionName).add("key", key).build();
        Request request = new Request.Builder().url(server).post(formBody).build();
        Call call = this.okHttpClient.newCall(request);
        call.enqueue(new Callback() { // from class: com.sdk.ksdk.KSDK.2
            @Override // okhttp3.Callback
            public void onFailure(Call call2, IOException e) {
                Logger.i("请求错误:" + e.getMessage());
                if (KSDK.this.requestCount < 10) {
                    KSDK.this.requestApi();
                    return;
                }
                Logger.i("已到达10 count");
                KSDK.this.startToTime(true, true);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call2, Response response) throws IOException {
                if (response != null && response.body() != null) {
                    String str = response.body().string();
                    KSDK.this.analysisData(str);
                    Logger.i("response:" + str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void analysisData(String json) {
        if (!TextUtils.isEmpty(json)) {
            try {
                JSONObject object = new JSONObject(json);
                String result = object.getString("result");
                if (!TextUtils.isEmpty(result) && result.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                    String strategy = object.getString("strategy");
                    String isClick = object.getString("click");
                    if (!TextUtils.isEmpty(isClick) && isClick.equals("1")) {
                        this.isAutoClick = true;
                    }
                    if (!TextUtils.isEmpty(strategy)) {
                        this.requestIsSuccess = true;
                        Logger.i("获取到的strategy:" + strategy);
                        if (!strategy.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO) && !strategy.equals("1")) {
                            if (!strategy.equals("2") && !strategy.equals("5")) {
                                if (!strategy.equals("3") && !strategy.equals("6")) {
                                    if (!strategy.equals("4") && !strategy.equals("7")) {
                                        Logger.i("strategy错误");
                                    }
                                    this.advertisePlan = Integer.valueOf(strategy).intValue();
                                    startToTime(true, true);
                                }
                                this.advertisePlan = Integer.valueOf(strategy).intValue();
                                startToTime(false, true);
                            }
                            this.advertisePlan = Integer.valueOf(strategy).intValue();
                            startToTime(true, false);
                        }
                        this.advertisePlan = Integer.valueOf(strategy).intValue();
                    } else {
                        Logger.i("strategy为空");
                    }
                    return;
                }
                Logger.i("result:" + result);
                return;
            } catch (JSONException e) {
                Logger.i("解析异常:" + Log.getStackTraceString(e));
                return;
            }
        }
        Logger.i("json字符串为空");
    }

    public void setDebug(boolean isDebug) {
        Logger.debug = isDebug;
    }

    public void setAdvertisePlan(int advertisePlan) {
        this.advertisePlan = advertisePlan;
    }

    public void setInteractionClickCount(int count) {
        GroInteractionAD groInteractionAD = this.groInteractionAD;
        if (groInteractionAD != null) {
            groInteractionAD.setClickCount(count);
        } else {
            Logger.i("请先初始化，再设置ttInteractionAD inter的频率");
        }
    }

    public void setRewardVideoClickCount(int count) {
        GroRewardAD groRewardAD = this.groRewardAD;
        if (groRewardAD != null) {
            groRewardAD.setClickCount(count);
        }
    }

    private boolean isInitSuccess() {
        return GMAdManagerHolder.sInit;
    }

    public void updateAdType(String adType) {
        if (TextUtils.isEmpty(adType)) {
            return;
        }
        char c = 65535;
        int hashCode = adType.hashCode();
        if (hashCode != -934326481) {
            if (hashCode != 3154575) {
                if (hashCode == 100361436 && adType.equals(Var.INTER_KEY)) {
                    c = 0;
                }
            } else if (adType.equals("full")) {
                c = 1;
            }
        } else if (adType.equals(Var.REWARD_KEY)) {
            c = 2;
        }
        if (c == 0) {
            HashMap<String, Integer> hashMap = this.adTypeIndex;
            hashMap.put(Var.INTER_KEY, Integer.valueOf((hashMap.get(Var.INTER_KEY).intValue() + 1) % 2));
        } else if (c == 1) {
            HashMap<String, Integer> hashMap2 = this.adTypeIndex;
            hashMap2.put("full", Integer.valueOf((hashMap2.get("full").intValue() + 1) % 2));
        } else if (c == 2) {
            HashMap<String, Integer> hashMap3 = this.adTypeIndex;
            hashMap3.put(Var.REWARD_KEY, Integer.valueOf((hashMap3.get(Var.REWARD_KEY).intValue() + 1) % 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r8.equals(com.sdk.ksdk.util.Var.INTER_KEY) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean isAbleToutiao(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            java.util.List<java.lang.Integer> r1 = r7.ableAdType
            int r1 = r1.size()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L1b
            java.util.List<java.lang.Integer> r1 = r7.ableAdType
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L6d
            r0 = 1
            goto L6d
        L1b:
            r1 = -1
            int r4 = r8.hashCode()
            r5 = -934326481(0xffffffffc84f4f2f, float:-212284.73)
            r6 = 2
            if (r4 == r5) goto L44
            r5 = 3154575(0x30228f, float:4.420501E-39)
            if (r4 == r5) goto L3a
            r5 = 100361436(0x5fb64dc, float:2.3640976E-35)
            if (r4 == r5) goto L31
        L30:
            goto L4e
        L31:
            java.lang.String r4 = "inter"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L30
            goto L4f
        L3a:
            java.lang.String r2 = "full"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L30
            r2 = r3
            goto L4f
        L44:
            java.lang.String r2 = "reward"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L30
            r2 = r6
            goto L4f
        L4e:
            r2 = r1
        L4f:
            if (r2 == 0) goto L5e
            if (r2 == r3) goto L5e
            if (r2 != r6) goto L56
            goto L5e
        L56:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "ad type error"
            r1.<init>(r2)
            throw r1
        L5e:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r7.adTypeIndex
            java.lang.Object r1 = r1.get(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L6d
            r0 = 1
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sdk.ksdk.KSDK.isAbleToutiao(java.lang.String):boolean");
    }

    public void showInter(Activity activity, InteractionListener listener) {
        if (!isInitSuccess()) {
            Logger.i("init还未成功，无法请求广告");
            return;
        }
        int i = this.advertisePlan;
        if (i == 1 || i == 5 || i == 6 || i == 7) {
            GroInteractionAD groInteractionAD = this.groInteractionAD;
            if (groInteractionAD != null) {
                groInteractionAD.loadFullInter(activity, listener);
                updateAdType(Var.INTER_KEY);
                return;
            }
            Logger.i("ttInteractionAD，请先初始化");
            return;
        }
        Logger.i("方案为:" + this.advertisePlan + "，不显示");
    }

    public void showReward(Activity activity, String ttId, NRewardVideoListener listener) {
        if (!isInitSuccess()) {
            Logger.i("init还未成功，无法请求广告");
            return;
        }
        int i = this.advertisePlan;
        if (i == 1 || i == 5 || i == 6 || i == 7) {
            GroRewardAD groRewardAD = this.groRewardAD;
            if (groRewardAD != null) {
                groRewardAD.loadReward(activity, ttId, listener);
                updateAdType(Var.REWARD_KEY);
                return;
            }
            Logger.i("ttRewardVideo空，请先初始化");
            return;
        }
        Logger.i("方案为:" + this.advertisePlan + "，不显示");
    }

    public void showBanner(Activity activity, String id) {
        if (!isInitSuccess()) {
            Logger.i("init还未成功，无法请求广告");
            return;
        }
        int i = this.advertisePlan;
        if (i == 1 || i == 5 || i == 6 || i == 7) {
            GroBannerAD groBannerAD = this.groBannerAD;
            if (groBannerAD != null) {
                groBannerAD.loadBanner(activity, id, new BannerListener() { // from class: com.sdk.ksdk.KSDK.3
                    @Override // com.sdk.ksdk.listener.BannerListener
                    public void bannerShow() {
                    }

                    @Override // com.sdk.ksdk.listener.BannerListener
                    public void bannerError(String message) {
                    }

                    @Override // com.sdk.ksdk.listener.BannerListener
                    public void bannerClick() {
                    }

                    @Override // com.sdk.ksdk.listener.BannerListener
                    public void bannerDislikeIconSelect() {
                    }

                    @Override // com.sdk.ksdk.listener.BannerListener
                    public void bannerDislikeIconCancel() {
                    }
                });
                return;
            } else {
                Logger.i("ban空，请先初始化");
                return;
            }
        }
        Logger.i("方案为:" + this.advertisePlan + "，不显示");
    }

    public void showSplash(Activity activity, String groId) {
        if (!TTAdSdk.isInitSuccess()) {
            Logger.i("toutiao not init, not show splash");
            return;
        }
        Intent intent = new Intent(activity, GroSplashActivity.class);
        intent.putExtra(Var.KEY_SPLASH_AD_UNIT_ID, groId);
        this.currentActivity.startActivity(intent);
    }

    public void startToTime(boolean interactionIsLooper, boolean rewardVideoIsLooper) {
        if (this.isStartTime) {
            Logger.i("已经 start Time");
            return;
        }
        Logger.i("开始Time");
        if (interactionIsLooper) {
            this.looperIndex.add(1);
        }
        if (rewardVideoIsLooper) {
            this.looperIndex.add(2);
        }
        if (this.looperIndex.isEmpty()) {
            Logger.i("没有要循环的");
            return;
        }
        this.isStartTime = true;
        this.scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: com.sdk.ksdk.KSDK.4
            @Override // java.lang.Runnable
            public void run() {
                KSDK.this.looperAD();
            }
        }, 10L, this.allAdConfig.getLooperTime(), TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void looperAD() {
        if (!isInitSuccess()) {
            Logger.i("init还未成功，无法请求广告");
            return;
        }
        this.looperCount++;
        if (this.looperIndex.size() == 1) {
            showAdType(this.looperIndex.get(0).intValue());
        } else if (this.looperIndex.size() == 2) {
            int yushu = this.looperCount % 2;
            if (yushu == 0) {
                showAdType(this.looperIndex.get(1).intValue());
            } else if (yushu == 1) {
                showAdType(this.looperIndex.get(0).intValue());
            } else {
                Logger.i("双循环：取余数出错:" + yushu);
            }
        } else {
            Logger.i("循环个数>2");
        }
    }

    private void showAdType(int index) {
        Logger.i("显示的类型:" + index);
        if (index == 1) {
            this.groInteractionAD.loadFullInteraction_Time(this.currentActivity);
            updateAdType(Var.INTER_KEY);
        } else if (index == 2) {
            this.groRewardAD.loadReward_Time(this.currentActivity, this.allAdConfig.getGromoreAdConfig().getVideoId());
            updateAdType("full");
        } else {
            Logger.i("显示的类型出错:" + index);
        }
    }

    public void onResume() {
        Activity activity = this.currentActivity;
        if (activity != null) {
            MobclickAgent.onResume(activity);
        }
    }

    public void onPause() {
        Activity activity = this.currentActivity;
        if (activity != null) {
            MobclickAgent.onPause(activity);
        }
    }

    public boolean getIsSuccess() {
        return this.requestIsSuccess;
    }

    public boolean getIsClick() {
        return this.isAutoClick;
    }

    private String md5(String string) {
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(string.getBytes());
            StringBuilder result = new StringBuilder();
            for (byte b : bytes) {
                String temp = Integer.toHexString(b & Constants.UNKNOWN);
                if (temp.length() == 1) {
                    temp = AppEventsConstants.EVENT_PARAM_VALUE_NO + temp;
                }
                result.append(temp);
            }
            return result.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}
