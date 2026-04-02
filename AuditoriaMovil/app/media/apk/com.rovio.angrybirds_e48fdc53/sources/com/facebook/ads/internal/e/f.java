package com.facebook.ads.internal.e;

import com.qq.e.comm.constants.ErrorCode;
/* loaded from: classes2.dex */
abstract class f<T> {
    private a a;

    /* loaded from: classes2.dex */
    public enum a {
        UNKNOWN(ErrorCode.PrivateError.LOAD_TIME_OUT, "An unknown error has occurred."),
        DATABASE_SELECT(3001, "Failed to read from database."),
        DATABASE_INSERT(3002, "Failed to insert row into database."),
        DATABASE_UPDATE(3003, "Failed to update row in database."),
        DATABASE_DELETE(3004, "Failed to delete row from database.");
        
        private final int f;
        private final String g;

        a(int i, String str) {
            this.f = i;
            this.g = str;
        }

        public int a() {
            return this.f;
        }

        public String b() {
            return this.g;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(a aVar) {
        this.a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T b();

    public a c() {
        return this.a;
    }
}
