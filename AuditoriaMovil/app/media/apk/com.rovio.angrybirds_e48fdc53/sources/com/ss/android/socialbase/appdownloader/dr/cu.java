package com.ss.android.socialbase.appdownloader.dr;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class cu extends dr {
    public cu(Context context, DownloadSetting downloadSetting, String str) {
        super(context, downloadSetting, str);
    }

    @Override // com.ss.android.socialbase.appdownloader.dr.q
    public Intent ge() {
        String optString = this.ge.optString("s");
        String dr = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("bb"), optString);
        if (TextUtils.isEmpty(dr) || dr.split(",").length != 2) {
            return null;
        }
        String dr2 = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("bc"), optString);
        if (TextUtils.isEmpty(dr2) || dr2.split(",").length != 2) {
            return null;
        }
        String[] split = dr.split(",");
        String[] split2 = dr2.split(",");
        String dr3 = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("bd"), optString);
        String dr4 = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("be"), optString);
        String dr5 = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("bf"), optString);
        HashMap hashMap = new HashMap();
        hashMap.put(split[0], split[1]);
        hashMap.put(split2[0], split2[1]);
        hashMap.put(dr3, this.o);
        Intent intent = new Intent();
        intent.setAction(dr5);
        intent.setData(Uri.parse(dr4 + dr(hashMap)));
        intent.addFlags(268468224);
        return intent;
    }

    public static String dr(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            stringBuffer.append(entry.getKey());
            stringBuffer.append("=");
            stringBuffer.append(URLEncoder.encode(entry.getValue()));
            stringBuffer.append("&");
        }
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2.endsWith("&")) {
            return stringBuffer2.substring(0, stringBuffer2.length() - 1);
        }
        return stringBuffer2;
    }
}
