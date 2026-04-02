package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.kuaishou.weapon.p0.jni.Engine;
/* loaded from: classes.dex */
public class bm {
    private Context a;

    public bm(Context context) {
        this.a = context;
    }

    public static String b(String str) {
        String str2;
        try {
            str2 = new String(c.a("a3NyaXNrY3RsYnVzaW5zc3Z4cHprd3NwYWlvcXBrc3M=".getBytes(), 2));
        } catch (Exception e) {
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            if (str2.length() < 16) {
                int length = str2.length();
                StringBuilder sb = new StringBuilder(str2);
                for (int i = 0; i < 16 - length; i++) {
                    sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                }
                str2 = sb.toString();
            } else if (str2.length() > 16) {
                str2 = str2.substring(0, 16);
            }
            return new String(d.b(i.a(b.b(str2.substring(0, 16), str2.substring(0, 16), c.a(str.getBytes(), 2)), str2.substring(0, 16))));
        } catch (Throwable th) {
            return null;
        }
    }

    public String a(String str) {
        try {
            return b(str, new String(c.a("a3NyaXNrY3RsYnVzaW5zc3Z4cHprd3NwYWlvcXBrc3M=".getBytes(), 2)));
        } catch (Exception e) {
            return null;
        }
    }

    public String a(String str, String str2) {
        try {
            return c(str, new String(c.a(str2.getBytes(), 2)));
        } catch (Exception e) {
            return null;
        }
    }

    public String b(String str, String str2) {
        byte[] a;
        try {
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            if (str2.length() < 16) {
                int length = str2.length();
                StringBuilder sb = new StringBuilder(str2);
                for (int i = 0; i < 16 - length; i++) {
                    sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                }
                str2 = sb.toString();
            } else if (str2.length() > 16) {
                str2 = str2.substring(0, 16);
            }
            byte[] a2 = c.a(str.getBytes(), 2);
            if (Engine.loadSuccess) {
                a = Engine.getInstance(this.a).dr(Engine.getInstance(this.a).dc(a2, str2.substring(0, 16).getBytes()), str2.getBytes());
            } else {
                try {
                    a = i.a(b.b(str2.substring(0, 16), str2.substring(0, 16), a2), str2.substring(0, 16));
                } catch (Throwable th) {
                    return null;
                }
            }
            return new String(d.b(a));
        } catch (Exception e) {
            return null;
        }
    }

    public String c(String str) {
        try {
            return c(str, new String(c.a("a3NyaXNrY3RsYnVzaW5zc3Z4cHprd3NwYWlvcXBrc3M=".getBytes(), 2)));
        } catch (Exception e) {
            return null;
        }
    }

    public String c(String str, String str2) {
        byte[] bArr;
        try {
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            if (str2.length() < 16) {
                int length = str2.length();
                StringBuilder sb = new StringBuilder(str2);
                for (int i = 0; i < 16 - length; i++) {
                    sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                }
                str2 = sb.toString();
            } else if (str2.length() > 16) {
                str2 = str2.substring(0, 16);
            }
            byte[] a = d.a(str.getBytes());
            if (Engine.loadSuccess) {
                bArr = Engine.getInstance(this.a).ac(Engine.getInstance(this.a).ar(a, str2.getBytes()), str2.substring(0, 16).getBytes());
            } else {
                try {
                    bArr = b.a(str2.substring(0, 16), str2.substring(0, 16), i.b(a, str2));
                } catch (Throwable th) {
                    bArr = null;
                }
            }
            if (bArr != null && bArr.length > 0) {
                return c.b(bArr, 2);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
