package com.ss.android.downloadlib.addownload.compliance;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import com.qq.e.ads.nativ.NativeUnifiedADAppInfoImpl;
import com.ss.android.download.api.config.de;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.addownload.ge.bn;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb;
import com.ss.android.downloadlib.rb.o;
import com.ss.android.downloadlib.rb.yk;
import com.umeng.analytics.pro.bg;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class ge {
    private SoftReference<Activity> dr;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class dr {
        private static ge dr = new ge();
    }

    public static ge dr() {
        return dr.dr;
    }

    private ge() {
    }

    public void dr(long j) {
        TTDelegateActivity.dr(j);
    }

    public boolean dr(DownloadModel downloadModel) {
        if (downloadModel.isAd() && wb.ll().optInt("ad_lp_show_app_dialog") != 0) {
            String webUrl = downloadModel.getDeepLink() == null ? null : downloadModel.getDeepLink().getWebUrl();
            return (TextUtils.isEmpty(webUrl) || Pattern.compile(wb.ll().optString("ad_allow_web_url_regex", ".+(www.chengzijianzhan.com|www.toutiaopage.com/tetris/page|ad.toutiao.com/tetris/page).+")).matcher(webUrl).matches()) ? false : true;
        }
        return false;
    }

    public boolean dr(com.ss.android.downloadlib.addownload.ge.q qVar) {
        long j;
        long j2;
        if (TextUtils.isEmpty(qVar.ge.getLogExtra())) {
            q.dr(9, qVar);
            com.ss.android.downloadlib.q.o.dr().dr("requestAppInfo getLogExtra null");
            j2 = 0;
        } else {
            try {
                j = yk.dr(new JSONObject(qVar.ge.getLogExtra()), "convert_id");
            } catch (Exception e) {
                e.printStackTrace();
                j = 0;
            }
            if (j <= 0) {
                q.dr(3, qVar);
            }
            j2 = j;
        }
        final long j3 = qVar.dr;
        com.ss.android.downloadlib.addownload.ge.ge dr2 = o.dr().dr(j2, j3);
        if (dr2 != null) {
            g.dr().dr(dr2.dr(), j3, dr2.g);
            dr(dr2.dr());
            q.dr("lp_app_dialog_try_show", qVar);
            return true;
        }
        StringBuilder sb = new StringBuilder();
        if (j2 > 0) {
            sb.append("convert_id=");
            sb.append(j2);
        }
        if (!TextUtils.isEmpty(qVar.ge.getPackageName())) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append("package_name=");
            sb.append(qVar.ge.getPackageName());
        }
        if (sb.length() <= 0) {
            q.dr(6, qVar);
            return false;
        }
        final long j4 = j2;
        com.ss.android.downloadlib.rb.o.dr((o.dr<String, R>) new o.dr<String, Boolean>() { // from class: com.ss.android.downloadlib.addownload.compliance.ge.2
            @Override // com.ss.android.downloadlib.rb.o.dr
            public Boolean dr(String str) {
                final boolean[] zArr = {false};
                wb.g().dr("GET", str, new HashMap(), new de() { // from class: com.ss.android.downloadlib.addownload.compliance.ge.2.1
                    @Override // com.ss.android.download.api.config.de
                    public void dr(String str2) {
                        zArr[0] = ge.this.dr(j4, j3, str2);
                    }

                    @Override // com.ss.android.download.api.config.de
                    public void dr(Throwable th) {
                        q.dr(2, j3);
                        zArr[0] = false;
                    }
                });
                return Boolean.valueOf(zArr[0]);
            }
        }, "https://apps.oceanengine.com/customer/api/app/pkg_info?" + sb.toString()).dr(new o.dr<Boolean, Object>() { // from class: com.ss.android.downloadlib.addownload.compliance.ge.1
            @Override // com.ss.android.downloadlib.rb.o.dr
            public Object dr(Boolean bool) {
                if (bool.booleanValue()) {
                    ge.this.dr(com.ss.android.downloadlib.addownload.ge.ge.dr(j4, j3));
                    q.ge("lp_app_dialog_try_show", j3);
                    return null;
                }
                ge.this.ge(j3);
                return null;
            }
        }).dr();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dr(long j, long j2, String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("package");
            if (optJSONObject != null && optJSONObject.length() != 0) {
                com.ss.android.downloadlib.addownload.ge.ge geVar = new com.ss.android.downloadlib.addownload.ge.ge();
                geVar.dr = j;
                geVar.ge = j2;
                geVar.g = optJSONObject.optString("icon_url");
                geVar.q = optJSONObject.optString("app_name");
                geVar.o = optJSONObject.optString(bg.o);
                geVar.bn = optJSONObject.optString(NativeUnifiedADAppInfoImpl.Keys.VERSION_NAME);
                geVar.rb = optJSONObject.optString("developer_name");
                geVar.ll = optJSONObject.optString("policy_url");
                JSONArray optJSONArray = optJSONObject.optJSONArray("permissions");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject = (JSONObject) optJSONArray.get(i);
                        geVar.xu.add(new Pair<>(jSONObject.optString("permission_name"), jSONObject.optString("permission_desc")));
                    }
                }
                o.dr().dr(geVar);
                g.dr().dr(geVar.dr(), j2, geVar.g);
                return true;
            }
            q.dr(7, j2);
            return false;
        } catch (Exception e) {
            com.ss.android.downloadlib.q.o.dr().dr(e, "AdLpComplianceManager parseResponse");
            q.dr(7, j2);
            return false;
        }
    }

    public void ge(long j) {
        com.ss.android.downloadlib.addownload.q dr2 = rb.dr().dr(bn.dr().q(j).ge.getDownloadUrl());
        if (dr2 != null) {
            dr2.dr(true, true);
            return;
        }
        q.dr(11, j);
        com.ss.android.downloadlib.q.o.dr().ge("startDownload handler null");
    }

    public void dr(Activity activity) {
        this.dr = new SoftReference<>(activity);
    }

    public Activity ge() {
        Activity activity = this.dr.get();
        this.dr = null;
        return activity;
    }
}
