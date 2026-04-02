package net.hockeyapp.android.objects;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class ErrorObject implements Serializable {
    private static final long serialVersionUID = 1508110658372169868L;
    private int a;
    private String b;

    public int getCode() {
        return this.a;
    }

    public void setCode(int i) {
        this.a = i;
    }

    public String getMessage() {
        return this.b;
    }

    public void setMessage(String str) {
        this.b = str;
    }
}
