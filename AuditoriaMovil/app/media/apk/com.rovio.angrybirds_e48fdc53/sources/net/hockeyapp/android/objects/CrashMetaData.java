package net.hockeyapp.android.objects;
/* loaded from: classes4.dex */
public class CrashMetaData {
    private String a;
    private String b;
    private String c;

    public String getUserDescription() {
        return this.a;
    }

    public void setUserDescription(String str) {
        this.a = str;
    }

    public String getUserEmail() {
        return this.b;
    }

    public void setUserEmail(String str) {
        this.b = str;
    }

    public String getUserID() {
        return this.c;
    }

    public void setUserID(String str) {
        this.c = str;
    }

    public String toString() {
        return "\n" + CrashMetaData.class.getSimpleName() + "\nuserDescription " + this.a + "\nuserEmail       " + this.b + "\nuserID          " + this.c;
    }
}
