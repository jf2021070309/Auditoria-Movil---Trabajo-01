package com.yxcorp.kuaishou.addfp;

import android.content.Context;
import android.os.Build;
import com.yxcorp.kuaishou.addfp.android.a.c;
import com.yxcorp.kuaishou.addfp.android.b.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class a implements Runnable {
    final /* synthetic */ KWEGIDDFP a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(KWEGIDDFP kwegiddfp) {
        this.a = kwegiddfp;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        Context context2;
        String str;
        ResponseDfpCallback responseDfpCallback;
        ResponseDfpCallback responseDfpCallback2;
        Context unused;
        try {
            context = this.a.mParamContext;
            if (context == null) {
                responseDfpCallback2 = this.a.mCallBack;
                responseDfpCallback2.onFailed(-3, "parameter error");
                return;
            }
            unused = this.a.mParamContext;
            int i = f.c;
            if (Build.VERSION.SDK_INT >= 28) {
                f.a();
            }
            KWEGIDDFP kwegiddfp = this.a;
            context2 = kwegiddfp.mParamContext;
            kwegiddfp.mPkgName = context2.getPackageName();
            c c = c.c();
            str = this.a.mPkgName;
            c.b(str);
            KWEGIDDFP kwegiddfp2 = this.a;
            responseDfpCallback = kwegiddfp2.mCallBack;
            kwegiddfp2.getEGid(responseDfpCallback);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
