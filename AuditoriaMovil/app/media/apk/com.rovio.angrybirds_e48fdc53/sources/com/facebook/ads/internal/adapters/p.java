package com.facebook.ads.internal.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.settings.a;
import com.facebook.share.internal.ShareConstants;
import com.qq.e.comm.pi.ACTD;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class p extends ae {
    private Context d;
    private af e;
    private String g;
    private String h;
    private long i;
    private ad j;
    private ag k;
    private final String c = UUID.randomUUID().toString();
    private boolean f = false;

    private void c() {
        LocalBroadcastManager.getInstance(this.d).registerReceiver(this.k, this.k.a());
    }

    private void d() {
        if (this.k != null) {
            try {
                LocalBroadcastManager.getInstance(this.d).unregisterReceiver(this.k);
            } catch (Exception e) {
            }
        }
    }

    private String e() {
        if (this.a != null) {
            String urlPrefix = AdSettings.getUrlPrefix();
            Uri parse = Uri.parse((urlPrefix == null || urlPrefix.isEmpty()) ? "https://www.facebook.com/audience_network/server_side_reward" : String.format("https://www.%s.facebook.com/audience_network/server_side_reward", urlPrefix));
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(parse.getScheme());
            builder.authority(parse.getAuthority());
            builder.path(parse.getPath());
            builder.query(parse.getQuery());
            builder.fragment(parse.getFragment());
            builder.appendQueryParameter(com.umeng.analytics.pro.d.N, this.a.getUserID());
            builder.appendQueryParameter(com.kuaishou.weapon.p0.t.x, this.a.getCurrency());
            builder.appendQueryParameter("ptid", this.c);
            builder.appendQueryParameter(ACTD.APPID_KEY, this.g);
            return builder.build().toString();
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ae
    public int a() {
        if (this.j == null) {
            return -1;
        }
        return this.j.m();
    }

    @Override // com.facebook.ads.internal.adapters.ae
    public void a(Context context, af afVar, Map<String, Object> map, final boolean z) {
        this.d = context;
        this.e = afVar;
        this.f = false;
        this.h = (String) map.get(AudienceNetworkActivity.PLACEMENT_ID);
        this.i = ((Long) map.get(AudienceNetworkActivity.REQUEST_TIME)).longValue();
        this.g = this.h != null ? this.h.split("_")[0] : "";
        this.j = ad.a((JSONObject) map.get(ShareConstants.WEB_DIALOG_PARAM_DATA));
        if (TextUtils.isEmpty(this.j.a())) {
            this.e.a(this, AdError.INTERNAL_ERROR);
            return;
        }
        this.k = new ag(this.c, this, afVar);
        c();
        final com.facebook.ads.internal.d.b bVar = new com.facebook.ads.internal.d.b(context);
        bVar.a(this.j.a());
        bVar.a(this.j.i(), -1, -1);
        bVar.a(this.j.j(), -1, -1);
        bVar.a(this.j.i(), -1, -1);
        for (String str : this.j.o()) {
            bVar.a(str, -1, -1);
        }
        bVar.a(new com.facebook.ads.internal.d.a() { // from class: com.facebook.ads.internal.adapters.p.1
            private void c() {
                p.this.f = true;
                p.this.e.a(p.this);
                p.this.j.b(bVar.b(p.this.j.a()));
            }

            @Override // com.facebook.ads.internal.d.a
            public void a() {
                c();
            }

            @Override // com.facebook.ads.internal.d.a
            public void b() {
                if (z) {
                    p.this.e.a(p.this, AdError.CACHE_ERROR);
                } else {
                    c();
                }
            }
        });
    }

    @Override // com.facebook.ads.internal.adapters.ae
    public boolean b() {
        if (this.f) {
            String e = e();
            this.j.a(e);
            Intent intent = new Intent(this.d, AudienceNetworkActivity.class);
            intent.putExtra(AudienceNetworkActivity.VIEW_TYPE, a.EnumC0117a.REWARDED_VIDEO);
            intent.putExtra("rewardedVideoAdDataBundle", this.j);
            intent.putExtra(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.c);
            intent.putExtra(AudienceNetworkActivity.REWARD_SERVER_URL, e);
            intent.putExtra(AudienceNetworkActivity.PLACEMENT_ID, this.h);
            intent.putExtra(AudienceNetworkActivity.REQUEST_TIME, this.i);
            if (this.b != -1 && Settings.System.getInt(this.d.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                intent.putExtra(AudienceNetworkActivity.PREDEFINED_ORIENTATION_KEY, this.b);
            } else if (!com.facebook.ads.internal.l.a.k(this.d)) {
                intent.putExtra(AudienceNetworkActivity.PREDEFINED_ORIENTATION_KEY, 6);
            }
            if (!(this.d instanceof Activity)) {
                intent.setFlags(intent.getFlags() | DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
            }
            this.d.startActivity(intent);
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
        d();
    }
}
