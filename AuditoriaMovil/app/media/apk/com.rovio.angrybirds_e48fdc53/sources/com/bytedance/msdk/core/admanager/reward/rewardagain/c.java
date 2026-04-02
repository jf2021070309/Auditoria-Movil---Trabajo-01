package com.bytedance.msdk.core.admanager.reward.rewardagain;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import com.bytedance.ad.sdk.ad_mediation_sdk.R;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.adapter.util.DownloadImageTask;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener;
import com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdLoadCallback;
import com.bytedance.msdk.api.v2.slot.GMAdSlotRewardVideo;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private static final Map<String, com.bytedance.msdk.core.admanager.reward.rewardagain.b> j = new ConcurrentHashMap();
    private static final Map<String, com.bytedance.msdk.core.admanager.reward.rewardagain.a> k = new ConcurrentHashMap();
    private static i l = new i();
    private final Context a;
    private final AdSlot b;
    private final GMAdSlotRewardVideo c;
    private GMRewardedAdListener d;
    private GMRewardedAdListener e;
    private Activity f;
    private Map<TTAdConstant.GroMoreExtraKey, Object> g;
    private volatile boolean h = false;
    private volatile boolean i = false;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        final /* synthetic */ com.bytedance.msdk.core.admanager.reward.rewardagain.a a;
        final /* synthetic */ String b;
        final /* synthetic */ Dialog c;

        a(com.bytedance.msdk.core.admanager.reward.rewardagain.a aVar, String str, Dialog dialog) {
            this.a = aVar;
            this.b = str;
            this.c = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.b(this.a, this.b);
            this.c.dismiss();
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        final /* synthetic */ String a;
        final /* synthetic */ Dialog b;

        b(String str, Dialog dialog) {
            this.a = str;
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.e(this.a);
            this.b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.msdk.core.admanager.reward.rewardagain.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0087c implements Runnable {
        final /* synthetic */ com.bytedance.msdk.core.admanager.reward.rewardagain.a a;
        final /* synthetic */ String b;

        RunnableC0087c(com.bytedance.msdk.core.admanager.reward.rewardagain.a aVar, String str) {
            this.a = aVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.b(this.a, this.b);
            c.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.e(this.a);
            c.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements GMRewardedAdLoadCallback {
        final /* synthetic */ bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.i a;

        e(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.i iVar) {
            this.a = iVar;
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdLoadCallback
        public void onRewardVideoAdLoad() {
            if (c.this.h) {
                return;
            }
            c.this.h = true;
            this.a.a(c.this.f, c.this.g);
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdLoadCallback
        public void onRewardVideoCached() {
            if (c.this.h) {
                return;
            }
            c.this.h = true;
            this.a.a(c.this.f, c.this.g);
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdLoadCallback
        public void onRewardVideoLoadFail(AdError adError) {
            if (c.this.h) {
                return;
            }
            c.this.h = true;
            if (c.this.d != null) {
                c.this.d.onRewardedAdClosed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.h) {
                return;
            }
            c.this.h = true;
            if (c.this.d != null) {
                c.this.d.onRewardedAdClosed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements GMRewardedAdListener {
        g() {
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardClick() {
            if (c.this.e != null) {
                c.this.e.onRewardClick();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardVerify(RewardItem rewardItem) {
            if (c.this.e != null) {
                c.this.e.onRewardVerify(rewardItem);
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardedAdClosed() {
            if (c.this.d != null) {
                c.this.d.onRewardedAdClosed();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardedAdShow() {
            c.a(c.this.b != null ? c.this.b.getAdUnitId() : "");
            if (c.this.e != null) {
                c.this.e.onRewardedAdShow();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardedAdShowFail(AdError adError) {
            if (c.this.e != null) {
                c.this.e.onRewardedAdShowFail(adError);
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onSkippedVideo() {
            if (c.this.e != null) {
                c.this.e.onSkippedVideo();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onVideoComplete() {
            if (c.this.e != null) {
                c.this.e.onVideoComplete();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onVideoError() {
            if (c.this.e != null) {
                c.this.e.onVideoError();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements GMRewardedAdListener {
        h() {
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardClick() {
            if (c.this.e != null) {
                c.this.e.onRewardClick();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardVerify(RewardItem rewardItem) {
            if (c.this.e != null) {
                c.this.e.onRewardVerify(rewardItem);
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardedAdClosed() {
            if (c.this.d != null) {
                c.this.d.onRewardedAdClosed();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardedAdShow() {
            if (c.this.e != null) {
                c.this.e.onRewardedAdShow();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardedAdShowFail(AdError adError) {
            if (c.this.e != null) {
                c.this.e.onRewardedAdShowFail(adError);
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onSkippedVideo() {
            if (c.this.e != null) {
                c.this.e.onSkippedVideo();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onVideoComplete() {
            if (c.this.e != null) {
                c.this.e.onVideoComplete();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onVideoError() {
            if (c.this.e != null) {
                c.this.e.onVideoError();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public com.bytedance.msdk.core.admanager.reward.rewardagain.b a;
        public Runnable b;
        public Runnable c;
    }

    public c(Context context, AdSlot adSlot, GMAdSlotRewardVideo gMAdSlotRewardVideo, GMRewardedAdListener gMRewardedAdListener, GMRewardedAdListener gMRewardedAdListener2) {
        this.a = context;
        this.b = adSlot;
        this.c = gMAdSlotRewardVideo;
        if (gMRewardedAdListener != null) {
            this.d = gMRewardedAdListener;
        }
        if (gMRewardedAdListener2 != null) {
            this.e = gMRewardedAdListener2;
        }
    }

    private void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.i iVar) {
        iVar.a(new g());
        iVar.b(new h());
    }

    public static void a(String str) {
        f0 a2 = f0.a((String) null, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
        String d2 = a2.d("ra_show_count");
        try {
            if (TextUtils.isEmpty(d2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, 1);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(f(), jSONObject);
                a2.b("ra_show_count", jSONObject2.toString());
                return;
            }
            JSONObject jSONObject3 = new JSONObject(d2);
            String f2 = f();
            JSONObject optJSONObject = jSONObject3.optJSONObject(f2);
            if (optJSONObject == null) {
                a2.b("ra_show_count", "");
                optJSONObject = new JSONObject();
            }
            optJSONObject.put(str, optJSONObject.optInt(str, 0) + 1);
            jSONObject3.put(f2, optJSONObject);
            a2.b("ra_show_count", jSONObject3.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str, com.bytedance.msdk.core.admanager.reward.rewardagain.a aVar) {
        if (TextUtils.isEmpty(str) || aVar == null) {
            return;
        }
        k.put(str, aVar);
    }

    public static void a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                com.bytedance.msdk.core.admanager.reward.rewardagain.b bVar = new com.bytedance.msdk.core.admanager.reward.rewardagain.b();
                bVar.d(optJSONObject.optString("ra_id"));
                bVar.e(optJSONObject.optString("title"));
                bVar.c(optJSONObject.optString("pic_url"));
                bVar.b(optJSONObject.optString("btn_ok"));
                bVar.a(optJSONObject.optString("btn_cancel"));
                j.put(bVar.d(), bVar);
            }
        }
    }

    public static com.bytedance.msdk.core.admanager.reward.rewardagain.a b(String str) {
        return k.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.bytedance.msdk.core.admanager.reward.rewardagain.a aVar, String str) {
        int a2 = a(this.b, aVar);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.b, str, a2);
        if (a2 == 0) {
            a();
            return;
        }
        GMRewardedAdListener gMRewardedAdListener = this.d;
        if (gMRewardedAdListener != null) {
            gMRewardedAdListener.onRewardedAdClosed();
        }
    }

    public static double c(String str) {
        com.bytedance.msdk.core.admanager.reward.rewardagain.a aVar = k.get(str);
        return aVar != null ? aVar.a() : PangleAdapterUtils.CPM_DEFLAUT_VALUE;
    }

    private void c(com.bytedance.msdk.core.admanager.reward.rewardagain.a aVar, String str) {
        i iVar = new i();
        l = iVar;
        iVar.a = j.get(aVar.b());
        l.b = new RunnableC0087c(aVar, str);
        l.c = new d(str);
        Intent intent = new Intent(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), GMRewardAgainDialogActivity.class);
        intent.setFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d().startActivity(intent);
    }

    public static int d(String str) {
        String d2 = f0.a((String) null, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).d("ra_show_count");
        if (TextUtils.isEmpty(d2)) {
            return 0;
        }
        try {
            JSONObject optJSONObject = new JSONObject(d2).optJSONObject(f());
            if (optJSONObject != null) {
                return optJSONObject.optInt(str, 0);
            }
            return 0;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        i iVar = l;
        iVar.a = null;
        iVar.b = null;
        iVar.c = null;
    }

    public static i e() {
        return l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        GMRewardedAdListener gMRewardedAdListener = this.d;
        if (gMRewardedAdListener != null) {
            gMRewardedAdListener.onRewardedAdClosed();
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.b(this.b, str);
    }

    private static String f() {
        return new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
    }

    public static void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        k.remove(str);
    }

    public int a(AdSlot adSlot, com.bytedance.msdk.core.admanager.reward.rewardagain.a aVar) {
        if (!this.i) {
            Logger.d("TTMediationSDK", "--==--ra: 还未触发rewardVerify");
            return 1;
        }
        String adUnitId = adSlot.getAdUnitId();
        int c = aVar.c();
        int d2 = d(adUnitId);
        if (d2 >= c) {
            Logger.d("TTMediationSDK", "--==--ra: 激励再得展示次数超过限制，限制: " + c + ", 已经展示: " + d2);
            return 2;
        } else if (j.get(aVar.b()) == null) {
            Logger.d("TTMediationSDK", "--==--ra: 激励再得样式为空");
            return 3;
        } else if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.a.c().b()) {
            Logger.d("TTMediationSDK", "--==--ra: 命中请求熔断");
            return 4;
        } else if (!m.b().b(adUnitId)) {
            Logger.d("TTMediationSDK", "--==--ra: 命中展示频控");
            return 5;
        } else if (m.b().c(adUnitId)) {
            return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(adUnitId, adSlot);
        } else {
            Logger.d("TTMediationSDK", "--==--ra: 命中展示间隔");
            return 6;
        }
    }

    public void a() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.i iVar = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.i(this.a, this.b.getAdUnitId());
        a(iVar);
        this.b.setIsRa(1);
        iVar.a(this.b, this.c, new e(iVar));
        ThreadHelper.postOnUiThreadDelayed(new f(), 500L);
    }

    public void a(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        this.f = activity;
        this.g = map;
    }

    public void a(GMRewardedAdListener gMRewardedAdListener) {
        if (gMRewardedAdListener != null) {
            this.d = gMRewardedAdListener;
        }
    }

    public void a(com.bytedance.msdk.core.admanager.reward.rewardagain.a aVar, String str) {
        Activity activity = this.f;
        if (activity == null || activity.isFinishing() || this.f.isDestroyed()) {
            Logger.d("TTMediationSDK", "--==-- reward again show activity dialog");
            c(aVar, str);
            return;
        }
        Dialog dialog = new Dialog(this.f);
        View inflate = LayoutInflater.from(this.f.getApplicationContext()).inflate(R.layout.reward_again_dialog, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.ra_pic);
        TextView textView = (TextView) inflate.findViewById(R.id.ra_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.ra_btn_ok);
        TextView textView3 = (TextView) inflate.findViewById(R.id.ra_btn_cancel);
        com.bytedance.msdk.core.admanager.reward.rewardagain.b bVar = j.get(aVar.b());
        if (bVar != null) {
            textView.setText(bVar.e());
            textView2.setText(bVar.b());
            textView3.setText(bVar.a());
            if (!TextUtils.isEmpty(bVar.c())) {
                new DownloadImageTask(imageView).execute(bVar.c());
            }
        }
        textView2.setOnClickListener(new a(aVar, str, dialog));
        textView3.setOnClickListener(new b(str, dialog));
        dialog.setContentView(inflate);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.show();
    }

    public void b() {
        this.i = true;
    }

    public void b(GMRewardedAdListener gMRewardedAdListener) {
        if (gMRewardedAdListener != null) {
            this.e = gMRewardedAdListener;
        }
    }
}
