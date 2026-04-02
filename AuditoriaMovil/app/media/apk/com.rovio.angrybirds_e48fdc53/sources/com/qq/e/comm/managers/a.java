package com.qq.e.comm.managers;

import com.qq.e.comm.managers.plugin.PM;
import com.qq.e.comm.managers.plugin.e;
import com.qq.e.comm.util.GDTLogger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class a implements Runnable {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        PM pm;
        try {
            pm = this.a.d;
            pm.getPOFactory();
            this.a.b = true;
        } catch (e e) {
            GDTLogger.e(e.getMessage(), e);
        }
    }
}
