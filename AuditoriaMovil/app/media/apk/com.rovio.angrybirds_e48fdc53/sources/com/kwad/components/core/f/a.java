package com.kwad.components.core.f;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.components.offline.api.IOfflineCompo;
import com.kwad.sdk.components.d;
import com.kwad.sdk.components.f;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.at;
import com.kwad.sdk.utils.bc;
import com.kwad.sdk.utils.be;
import com.kwad.sdk.utils.y;
import com.yxcorp.kuaishou.addfp.KWEGIDDFP;
import com.yxcorp.kuaishou.addfp.ResponseDfpCallback;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a extends d implements f {
    private String Kq;
    private long Kr;
    private String Ks;
    private Context mContext;

    private void ab(Context context) {
        c.i("EncryptComponentsImpl", "initGId");
        try {
            if (at.IV()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("64", 0);
                KWEGIDDFP.handlePolicy(jSONObject);
            }
        } catch (Throwable th) {
            c.printStackTrace(th);
        }
        KWEGIDDFP.instance().getEGidByCallback(context, false, new ResponseDfpCallback() { // from class: com.kwad.components.core.f.a.1
            @Override // com.yxcorp.kuaishou.addfp.ResponseDfpCallback
            public final void onFailed(int i, String str) {
                c.e("EncryptComponentsImpl", "initGId onFailed errorCode:" + i + "errorMessage :" + str);
            }

            @Override // com.yxcorp.kuaishou.addfp.ResponseDfpCallback
            public final void onSuccess(String str, String str2) {
                c.d("initGId onSuccess", "deviceInfo：" + str2);
                a.this.nT();
                a.this.aq(str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq(String str) {
        if (this.mContext == null || bc.isNullString(str) || bc.isEquals(nY(), str)) {
            return;
        }
        this.Ks = str;
        y.ac(this.mContext, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nT() {
        String cd = y.cd(this.mContext);
        String JH = be.JH();
        if (TextUtils.isEmpty(cd)) {
            y.U(this.mContext, JH);
        } else if (TextUtils.equals(cd, JH)) {
        } else {
            this.Kq = "";
            this.Kr = 0L;
            this.Ks = "";
            y.T(this.mContext, "");
            y.d(this.mContext, this.Kr);
            y.ac(this.mContext, this.Ks);
            y.U(this.mContext, JH);
        }
    }

    private String nW() {
        if (TextUtils.isEmpty(this.Kq)) {
            this.Kq = y.ca(this.mContext);
        }
        return this.Kq;
    }

    private long nX() {
        if (this.Kr == 0) {
            this.Kr = y.cb(this.mContext);
        }
        return this.Kr;
    }

    private String nY() {
        if (TextUtils.isEmpty(this.Ks)) {
            this.Ks = y.cg(this.mContext);
        }
        return this.Ks;
    }

    @Override // com.kwad.sdk.components.f
    public final void ar(String str) {
        if (this.mContext == null || bc.isNullString(str) || bc.isEquals(nW(), str)) {
            return;
        }
        try {
            this.Kq = str;
            y.T(this.mContext, str);
            KWEGIDDFP.instance().setEgid(this.mContext, str);
        } catch (Throwable th) {
            c.e("EncryptComponentsImpl", "setEGid error : " + th);
        }
    }

    @Override // com.kwad.sdk.components.a
    public final Class getComponentsType() {
        return f.class;
    }

    @Override // com.kwad.sdk.components.a
    public final void init(Context context) {
        try {
            this.mContext = context;
            ab(context);
        } catch (Throwable th) {
            c.e("EncryptComponentsImpl", "initGId error : " + th);
        }
    }

    @Override // com.kwad.sdk.components.f
    public final String nU() {
        return (com.kwad.sdk.core.config.d.zr() || System.currentTimeMillis() >= nX() || TextUtils.isEmpty(nW())) ? nY() : "";
    }

    @Override // com.kwad.sdk.components.f
    public final com.kwad.sdk.core.a.f nV() {
        return new com.kwad.sdk.core.a.a();
    }

    @Override // com.kwad.sdk.components.d, com.kwad.sdk.components.a
    public final int priority() {
        return IOfflineCompo.Priority.HIGHEST;
    }

    @Override // com.kwad.sdk.components.f
    public final void t(long j) {
        if (this.mContext == null || j <= 0 || j == nX()) {
            return;
        }
        this.Kr = j;
        y.d(this.mContext, j);
    }
}
