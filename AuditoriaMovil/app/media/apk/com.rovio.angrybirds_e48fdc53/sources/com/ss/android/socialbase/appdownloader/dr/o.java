package com.ss.android.socialbase.appdownloader.dr;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class o extends dr {
    private final JSONObject g;

    public o(Context context, DownloadSetting downloadSetting, String str, JSONObject jSONObject) {
        super(context, downloadSetting, str);
        this.g = jSONObject;
    }

    @Override // com.ss.android.socialbase.appdownloader.dr.q
    public Intent ge() {
        String optString = this.g.optString(NativeProtocol.WEB_DIALOG_ACTION);
        String optString2 = this.g.optString("category");
        int optInt = this.g.optInt("flags", 1342210048);
        String optString3 = this.g.optString("path_extra_key");
        String optString4 = this.g.optString("path_data_key");
        JSONObject optJSONObject = this.g.optJSONObject("extra");
        JSONObject optJSONObject2 = this.g.optJSONObject("extra_type");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        Intent intent = new Intent(optString);
        if (!TextUtils.isEmpty(optString2)) {
            intent.addCategory(optString2);
        }
        if (!TextUtils.isEmpty(optString4)) {
            try {
                intent.setData(Uri.parse(String.format(optString4, this.o)));
            } catch (Throwable th) {
            }
        }
        intent.setFlags(optInt);
        if (!TextUtils.isEmpty(optString3)) {
            intent.putExtra(optString3, this.o);
        }
        dr(intent, optJSONObject, optJSONObject2);
        return intent;
    }

    private static void dr(Intent intent, JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys;
        if (jSONObject != null && jSONObject2 != null && jSONObject.length() == jSONObject2.length() && intent != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject2.optString(next);
                if (optString != null) {
                    dr(jSONObject, next, optString, intent);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void dr(JSONObject jSONObject, String str, String str2, Intent intent) {
        char c;
        switch (str2.hashCode()) {
            case -1325958191:
                if (str2.equals("double")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -891985903:
                if (str2.equals("string")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 104431:
                if (str2.equals("int")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3327612:
                if (str2.equals("long")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 64711720:
                if (str2.equals("boolean")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            intent.putExtra(str, jSONObject.optInt(str));
        } else if (c == 1) {
            intent.putExtra(str, jSONObject.optBoolean(str));
        } else if (c == 2) {
            intent.putExtra(str, jSONObject.optLong(str));
        } else if (c == 3) {
            intent.putExtra(str, jSONObject.optDouble(str));
        } else if (c == 4) {
            intent.putExtra(str, jSONObject.optString(str));
        }
    }
}
