package com.bytedance.mapplog_dr;

import android.util.Log;
/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.bytedance.mapplog_dr.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0071a implements a {
        @Override // com.bytedance.mapplog_dr.a
        public void a(String str, String str2, Throwable th) {
            Log.v(str, str2, th);
        }

        @Override // com.bytedance.mapplog_dr.a
        public void b(String str, String str2, Throwable th) {
            Log.d(str, str2, th);
        }
    }

    void a(String str, String str2, Throwable th);

    void b(String str, String str2, Throwable th);
}
