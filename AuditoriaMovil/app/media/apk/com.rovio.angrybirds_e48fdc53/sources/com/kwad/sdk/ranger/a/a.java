package com.kwad.sdk.ranger.a;

import android.text.TextUtils;
import android.util.Log;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.s;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class a extends com.kwad.sdk.core.response.a.a {
    public static final String TAG = "Ranger_" + a.class.getSimpleName();
    public Object aHi;
    public String aHj;
    public String aHk;
    public boolean aHl;
    public String aHm;
    public b aHn;
    public a aHo;

    /* renamed from: com.kwad.sdk.ranger.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0271a extends com.kwad.sdk.core.response.a.a {
        public String aHp;
        public String aHq;
        public String aHr;
        public List<String> aHs;
        public List<C0271a> aHt = new ArrayList();
        public Object aHu;
        public List<Object> aHv;
        public String className;
        public String fieldName;

        private Object Hs() {
            Object obj = null;
            try {
            } catch (Exception e) {
                c.d(a.TAG, Log.getStackTraceString(e));
            }
            if (TextUtils.isEmpty(this.className)) {
                c.w(a.TAG, "SpecialParam className is null");
                return null;
            }
            obj = s.fv(this.className);
            String str = a.TAG;
            c.d(str, "Class.forName(className):" + this.className + " value:" + obj);
            List<C0271a> list = this.aHt;
            if (list != null && !list.isEmpty()) {
                for (C0271a c0271a : this.aHt) {
                    c0271a.aHu = obj;
                    String str2 = a.TAG;
                    c.d(str2, "param.ob:" + c0271a.aHu);
                    try {
                        s.a(c0271a.aHu, c0271a.fieldName, c0271a.getValue());
                    } catch (Exception e2) {
                        c.d(a.TAG, Log.getStackTraceString(e2));
                    }
                }
            }
            String str3 = a.TAG;
            c.d(str3, "return value in special:" + obj);
            return obj;
        }

        private Object Ht() {
            if (TextUtils.isEmpty(this.aHr)) {
                return ai(this.aHp, this.aHq);
            }
            this.aHv = new ArrayList();
            for (String str : this.aHs) {
                Object ai = ai(this.aHr, str);
                if (ai != null) {
                    this.aHv.add(ai);
                }
            }
            return this.aHv;
        }

        private static Object ai(String str, String str2) {
            Object obj = null;
            try {
                Class<?> cls = Class.forName(str);
                if (cls == Integer.class) {
                    obj = Integer.valueOf(Integer.parseInt(str2));
                } else if (cls == Long.class) {
                    obj = Long.valueOf(Long.parseLong(str2));
                } else if (cls == Float.class) {
                    obj = Float.valueOf(Float.parseFloat(str2));
                } else if (cls == Boolean.class) {
                    obj = Boolean.valueOf(Boolean.parseBoolean(str2));
                } else if (cls == Double.class) {
                    obj = Double.valueOf(Double.parseDouble(str2));
                } else {
                    if (cls != String.class) {
                        str2 = null;
                    }
                    obj = str2;
                }
            } catch (Exception e) {
                c.w(a.TAG, Log.getStackTraceString(e));
            }
            return obj;
        }

        public final Object getValue() {
            return (TextUtils.isEmpty(this.aHp) && TextUtils.isEmpty(this.aHr)) ? Hs() : Ht();
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends com.kwad.sdk.core.response.a.a {
        public boolean aHw;
        public List<C0271a> aHx;
        public Object[] aHy;
        public String name;

        public final boolean Hr() {
            return TextUtils.isEmpty(this.name) && this.aHx == null && this.aHy == null;
        }

        public final Object[] Hu() {
            List<C0271a> list = this.aHx;
            if (list == null || list.isEmpty()) {
                return null;
            }
            Object[] objArr = new Object[this.aHx.size()];
            for (int i = 0; i < this.aHx.size(); i++) {
                objArr[i] = this.aHx.get(i).getValue();
            }
            return objArr;
        }
    }

    public final boolean Hr() {
        if (this.aHi == null && TextUtils.isEmpty(this.aHj) && TextUtils.isEmpty(this.aHk) && TextUtils.isEmpty(this.aHm)) {
            b bVar = this.aHn;
            if (bVar == null || bVar.Hr()) {
                a aVar = this.aHo;
                return aVar == null || aVar.Hr();
            }
            return false;
        }
        return false;
    }
}
