package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12;

import android.os.Handler;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class l implements bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.c {
    private static final Handler b = new Handler(ThreadHelper.getMSDKThreadLooper());
    private static final Runnable c = new b();
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.a<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> a;

    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.b b;
        final /* synthetic */ List c;

        a(List list, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.b bVar, List list2) {
            this.a = list;
            this.b = bVar;
            this.c = list2;
        }

        @Override // java.lang.Runnable
        public void run() {
            g a = l.this.a(this.a);
            if (this.b == null || a == null) {
                return;
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b bVar = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b(a.a, a.b, a.c, a.d, "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.a(bVar, this.c));
            this.b.a(arrayList);
            if (a.a) {
                l.b();
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.d("TMe", "--==--- upload event routine");
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.b.a();
            l.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g a(List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> list) {
        try {
            if (this.a == null) {
                this.a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.e();
            }
        } catch (Exception e) {
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.a<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> aVar = this.a;
        if (aVar == null) {
            return null;
        }
        return aVar.a(list);
    }

    private void a(JSONObject jSONObject, int i, long j, int i2, JSONObject jSONObject2) {
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("event_extra");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                JSONObject jSONObject3 = new JSONObject(optString);
                jSONObject3.putOpt("size", Integer.valueOf(i));
                jSONObject3.putOpt("batchId", Long.valueOf(j));
                jSONObject3.putOpt("batchIndex", Integer.valueOf(i2));
                jSONObject3.putOpt("preEventId", jSONObject2 != null ? jSONObject2.optString("event_id") : GMNetworkPlatformConst.AD_NETWORK_NO_PRICE);
                jSONObject.put("event_extra", jSONObject3.toString());
            } catch (Throwable th) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        Handler handler = b;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(c, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().q());
    }

    private void b(JSONObject jSONObject, int i, long j, int i2, JSONObject jSONObject2) {
        if (jSONObject != null) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
                if (optJSONObject != null) {
                    a(optJSONObject, i, j, i2, jSONObject2 != null ? jSONObject2.optJSONObject(NativeProtocol.WEB_DIALOG_PARAMS) : null);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.c
    public void a(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.b bVar) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do.b aVar;
        if (list != null && list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            JSONObject jSONObject = null;
            for (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar2 : list) {
                JSONObject b2 = aVar2.b();
                byte c2 = aVar2.c();
                byte f = aVar2.f();
                if (c2 == 2 && f == 3) {
                    b(b2, list.size(), currentTimeMillis, i, jSONObject);
                    aVar = new i(aVar2.i(), b2);
                } else if (c2 == 2 && f == 0) {
                    a(b2, list.size(), currentTimeMillis, i, jSONObject);
                    aVar = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a(aVar2.i(), b2);
                } else {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("not_v1v3", b2);
                        jSONObject2.putOpt("batchId", Long.valueOf(currentTimeMillis));
                        jSONObject2.putOpt("batchIndex", Integer.valueOf(i));
                        f0.a(jSONObject2);
                    } catch (Throwable th) {
                    }
                    i++;
                    jSONObject = b2;
                }
                arrayList.add(aVar);
                i++;
                jSONObject = b2;
            }
            if (arrayList.size() > 0) {
                ThreadHelper.getLogUploadExecutor().execute(new a(arrayList, bVar, list));
            }
        }
    }
}
