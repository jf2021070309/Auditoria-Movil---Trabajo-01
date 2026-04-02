package com.ss.android.socialbase.appdownloader.dr;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class ll extends dr {
    private String g;
    private String q;

    public ll(Context context, DownloadSetting downloadSetting, String str, String str2, String str3) {
        super(context, downloadSetting, str);
        this.g = str2;
        this.q = str3;
    }

    @Override // com.ss.android.socialbase.appdownloader.dr.q
    public Intent ge() {
        String str;
        String optString = this.ge.optString("s");
        String dr = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("ak"), optString);
        String dr2 = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("am"), optString);
        String dr3 = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("an"), optString);
        String str2 = null;
        if (TextUtils.isEmpty(dr3) || dr3.split(",").length != 2) {
            return null;
        }
        String[] split = dr3.split(",");
        String dr4 = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("al"), optString);
        String dr5 = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("ao"), optString);
        if (TextUtils.isEmpty(dr5) || dr5.split(",").length != 2) {
            return null;
        }
        String[] split2 = dr5.split(",");
        JSONObject optJSONObject = this.ge.optJSONObject(DownloadSettingKeys.KEY_ANTI_HIJACK_DIR);
        if (optJSONObject != null) {
            String optString2 = optJSONObject.optString(DownloadSettingKeys.AntiHijackDir.KEY_ANTI_HIJACK_DIR_NAME);
            if (!TextUtils.isEmpty(optString2) && optString2.contains("%s")) {
                try {
                    str = String.format(optString2, this.q);
                } catch (Throwable th) {
                    str = this.q;
                }
                str2 = str;
            } else {
                str2 = this.q;
            }
            if (str2.length() > 255) {
                str2 = dr4.substring(str2.length() - 255);
            }
        }
        Intent intent = new Intent(dr);
        intent.putExtra(split2[0], split2[1]);
        intent.putExtra(dr2, this.g);
        intent.putExtra(dr4, str2);
        intent.putExtra(split[0], Integer.parseInt(split[1]));
        intent.addFlags(268468224);
        return intent;
    }
}
