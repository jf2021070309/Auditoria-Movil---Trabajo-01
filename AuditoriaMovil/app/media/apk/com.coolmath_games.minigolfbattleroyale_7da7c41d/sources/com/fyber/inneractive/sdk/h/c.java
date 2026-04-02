package com.fyber.inneractive.sdk.h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c implements com.fyber.inneractive.sdk.util.ah {
    public Handler c;
    public int d;
    final BlockingQueue<JSONObject> a = new LinkedBlockingQueue();
    private JSONArray g = new JSONArray();
    public boolean e = false;
    public boolean f = false;
    public final HandlerThread b = new HandlerThread("EventCollectorHandlerThread", 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [org.json.JSONObject] */
    @Override // com.fyber.inneractive.sdk.util.ah
    public final void a(Message message) {
        String str;
        if (message.what == 12312329 || message.what == 20150330) {
            if (this.e && this.a.size() > 0) {
                while (true) {
                    str = null;
                    if (this.a.size() <= 0) {
                        break;
                    }
                    try {
                        str = this.a.poll();
                    } catch (Throwable unused) {
                    }
                    if (str != null) {
                        this.g.put(str);
                    }
                }
                if (this.g.length() > 0) {
                    final JSONArray jSONArray = this.g;
                    final String a = com.fyber.inneractive.sdk.config.a.a();
                    final long currentTimeMillis = System.currentTimeMillis();
                    try {
                        str = jSONArray.toString();
                    } catch (Throwable unused2) {
                    }
                    if (str != null) {
                        IAConfigManager.h().a(new ad(new r<String>() { // from class: com.fyber.inneractive.sdk.h.c.2
                            @Override // com.fyber.inneractive.sdk.h.r
                            public final /* synthetic */ void a(String str2, Exception exc, boolean z) {
                                String str3 = str2;
                                IAlog.b("Event Request: Hitting URL finished: %s, body: %s", a, jSONArray);
                                if (exc == null) {
                                    IAlog.b("Event Request: Hitting URL response code: %s", str3);
                                } else {
                                    IAlog.b("Event Request: Hitting URL failed: %s", exc);
                                }
                                IAlog.b("Event Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                            }
                        }, a, str));
                    }
                    this.g = new JSONArray();
                }
            }
            Handler handler = this.c;
            if (handler != null) {
                handler.removeMessages(12312329);
                this.c.sendEmptyMessageDelayed(12312329, this.d * 1000);
            }
        }
    }

    public final void a() {
        Handler handler = this.c;
        if (handler == null || !handler.hasMessages(12312329)) {
            return;
        }
        this.c.removeMessages(12312329);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(h hVar) {
        JSONObject jSONObject = new JSONObject();
        if (hVar != null) {
            Map<String, Object> map = hVar.a;
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj != null) {
                    try {
                        jSONObject.put(str, obj);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        String c = hVar != null ? hVar.c() : null;
        if (c != null) {
            int length = c.length();
            if (length > 51200) {
                int indexOf = c.indexOf("iawrapper");
                if (indexOf == -1) {
                    indexOf = 0;
                }
                c = c.substring(indexOf, 51199);
                IAlog.b("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", Integer.valueOf(length), 51200);
            }
            try {
                jSONObject.put("ad", c);
            } catch (JSONException e) {
                IAlog.a("Failed inserting ad body to json", e, new Object[0]);
            }
        }
        if (IAlog.a == IAlog.b) {
            try {
                IAlog.a(IAlog.b, "%s, Event: %s", "SDK_EVENT", jSONObject.toString());
            } catch (Throwable unused2) {
            }
        }
        return jSONObject;
    }
}
