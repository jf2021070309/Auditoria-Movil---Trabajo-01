package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10;

import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {
    private String a;
    private String b;
    private int c;
    private String d;
    private double e;
    private double f;

    public e(String str, String str2, String str3, int i, String str4, double d, double d2) {
        this.a = str2;
        this.b = str3;
        this.c = i;
        this.d = str4;
        this.e = d;
        this.f = d2;
    }

    public static e a(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return null;
        }
        return new e(str, jSONObject.optString("label_name"), jSONObject.optString("timestamp"), jSONObject.optInt("label_id"), jSONObject.optString("label_version"), jSONObject.optDouble("upper_bound"), jSONObject.optDouble("lower_bound"));
    }

    public int a() {
        int i = this.c;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return i;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.d;
    }

    public double d() {
        double d = this.f;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return d;
    }

    public String e() {
        return this.b;
    }

    public double f() {
        double d = this.e;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return d;
    }
}
