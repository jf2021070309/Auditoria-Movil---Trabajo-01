package com.amazon.aps.iva.bo;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.ct.l;
import com.amazon.aps.iva.h2.e0;
import com.amazon.aps.iva.h2.y;
import com.amazon.aps.iva.h2.z;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.n4.v;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.sp.h;
import com.amazon.aps.iva.v90.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.JsonObject;
import java.io.Serializable;
/* compiled from: UserDataInteractorImpl.kt */
/* loaded from: classes2.dex */
public final class e implements e0, com.amazon.aps.iva.zj.b, h, com.amazon.aps.iva.ss.c, i {
    public static final e b = new e();

    public static final d c(com.amazon.aps.iva.jd.a aVar, l lVar, com.amazon.aps.iva.pm.b bVar, com.amazon.aps.iva.ve.l lVar2, f fVar, com.amazon.aps.iva.xb0.a aVar2) {
        j.f(aVar, "accountDataInteractor");
        j.f(lVar, "userBenefitsSynchronizer");
        j.f(bVar, "userProfileInteractor");
        j.f(lVar2, "userBillingStatusSynchronizer");
        j.f(fVar, "userState");
        j.f(aVar2, "identifyUser");
        return new d(aVar, lVar, bVar, lVar2, fVar, aVar2);
    }

    public static Typeface d(String str, y yVar, int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && j.a(yVar, y.g)) {
            if (str != null && str.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                Typeface typeface = Typeface.DEFAULT;
                j.e(typeface, "DEFAULT");
                return typeface;
            }
        }
        int l = k.l(yVar, i);
        if (str != null && str.length() != 0) {
            z3 = false;
        }
        if (z3) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(l);
            j.e(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, l);
        j.e(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }

    public static final void g(com.amazon.aps.iva.g70.f fVar, String str, View view, Serializable serializable) {
        String tag = fVar.getTag();
        if (tag != null) {
            FragmentManager parentFragmentManager = fVar.getParentFragmentManager();
            com.amazon.aps.iva.kb0.j[] jVarArr = new com.amazon.aps.iva.kb0.j[1];
            com.amazon.aps.iva.fs.b bVar = null;
            if (view != null) {
                bVar = r.p(view, null);
            }
            jVarArr[0] = new com.amazon.aps.iva.kb0.j(str, new com.amazon.aps.iva.g70.j(bVar, serializable));
            parentFragmentManager.a0(com.amazon.aps.iva.k3.e.a(jVarArr), tag);
        }
    }

    public static final void h(FragmentManager fragmentManager, String str, o oVar, final com.amazon.aps.iva.xb0.l lVar, final com.amazon.aps.iva.xb0.l lVar2) {
        j.f(oVar, "lifecycleOwner");
        j.f(lVar, "onPositiveResult");
        j.f(lVar2, "onNegativeResult");
        fragmentManager.b0(str, oVar, new v() { // from class: com.amazon.aps.iva.g70.h
            @Override // com.amazon.aps.iva.n4.v
            public final void i6(Bundle bundle, String str2) {
                Object obj;
                Object obj2;
                com.amazon.aps.iva.xb0.l lVar3 = com.amazon.aps.iva.xb0.l.this;
                com.amazon.aps.iva.yb0.j.f(lVar3, "$onPositiveResult");
                com.amazon.aps.iva.xb0.l lVar4 = lVar2;
                com.amazon.aps.iva.yb0.j.f(lVar4, "$onNegativeResult");
                com.amazon.aps.iva.yb0.j.f(str2, "<anonymous parameter 0>");
                if (bundle.containsKey("positive_button_result")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        obj2 = bundle.getSerializable("positive_button_result", j.class);
                    } else {
                        obj2 = (j) bundle.getSerializable("positive_button_result");
                    }
                    com.amazon.aps.iva.yb0.j.c(obj2);
                    lVar3.invoke(obj2);
                } else if (bundle.containsKey("negative_button_result")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        obj = bundle.getSerializable("negative_button_result", j.class);
                    } else {
                        obj = (j) bundle.getSerializable("negative_button_result");
                    }
                    com.amazon.aps.iva.yb0.j.c(obj);
                    lVar4.invoke(obj);
                }
            }
        });
    }

    @Override // com.amazon.aps.iva.ss.c
    public com.amazon.aps.iva.ss.b a(String str) {
        String y0 = q.y0("P", str);
        Integer W = com.amazon.aps.iva.oe0.l.W(q.z0("D", y0));
        Integer W2 = com.amazon.aps.iva.oe0.l.W(q.z0("M", y0));
        Integer W3 = com.amazon.aps.iva.oe0.l.W(q.z0("Y", y0));
        if (W != null) {
            return new com.amazon.aps.iva.ss.b(W.intValue(), com.amazon.aps.iva.ss.a.DAY);
        }
        if (W2 != null) {
            return new com.amazon.aps.iva.ss.b(W2.intValue(), com.amazon.aps.iva.ss.a.MONTH);
        }
        if (W3 != null) {
            return new com.amazon.aps.iva.ss.b(W3.intValue(), com.amazon.aps.iva.ss.a.YEAR);
        }
        return new com.amazon.aps.iva.ss.b(14, com.amazon.aps.iva.ss.a.DAY);
    }

    @Override // com.amazon.aps.iva.h2.e0
    public Typeface b(y yVar, int i) {
        j.f(yVar, "fontWeight");
        return d(null, yVar, i);
    }

    @Override // com.amazon.aps.iva.v90.i
    public View e(View view, AttributeSet attributeSet) {
        if (view instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) view;
            Context context = toolbar.getContext();
            j.b(context, "context");
            int a = i.a.a(context, attributeSet, 16843233);
            Context context2 = toolbar.getContext();
            j.b(context2, "context");
            int a2 = i.a.a(context2, attributeSet, R.attr.title);
            Context context3 = toolbar.getContext();
            j.b(context3, "context");
            int a3 = i.a.a(context3, attributeSet, 16843473);
            Context context4 = toolbar.getContext();
            j.b(context4, "context");
            int a4 = i.a.a(context4, attributeSet, R.attr.subtitle);
            if (a > 0) {
                toolbar.setTitle(a);
            } else if (a2 > 0) {
                toolbar.setTitle(a2);
            }
            if (a3 > 0) {
                toolbar.setSubtitle(a3);
            } else if (a4 > 0) {
                toolbar.setSubtitle(a4);
            }
        }
        return view;
    }

    @Override // com.amazon.aps.iva.h2.e0
    public Typeface f(z zVar, y yVar, int i) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        j.f(zVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(yVar, "fontWeight");
        String str2 = zVar.c;
        j.f(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        int i2 = yVar.b / 100;
        boolean z6 = false;
        if (i2 >= 0 && i2 < 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = str2.concat("-thin");
        } else {
            if (2 <= i2 && i2 < 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str = str2.concat("-light");
            } else {
                if (i2 != 4) {
                    if (i2 == 5) {
                        str = str2.concat("-medium");
                    } else {
                        if (6 <= i2 && i2 < 8) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            if (8 <= i2 && i2 < 11) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                str = str2.concat("-black");
                            }
                        }
                    }
                }
                str = str2;
            }
        }
        if (str.length() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        Typeface typeface = null;
        if (!z5) {
            Typeface d = d(str, yVar, i);
            if (!j.a(d, Typeface.create(Typeface.DEFAULT, k.l(yVar, i))) && !j.a(d, d(null, yVar, i))) {
                z6 = true;
            }
            if (z6) {
                typeface = d;
            }
        }
        if (typeface == null) {
            return d(str2, yVar, i);
        }
        return typeface;
    }

    @Override // com.amazon.aps.iva.sp.h
    public String serialize(Object obj) {
        com.amazon.aps.iva.eq.a aVar = (com.amazon.aps.iva.eq.a) obj;
        j.f(aVar, "model");
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("connectivity", aVar.a.toJson());
        String str = aVar.b;
        if (str != null) {
            jsonObject.addProperty("carrier_name", str);
        }
        Long l = aVar.c;
        if (l != null) {
            jsonObject.addProperty("carrier_id", Long.valueOf(l.longValue()));
        }
        Long l2 = aVar.d;
        if (l2 != null) {
            jsonObject.addProperty("up_kbps", Long.valueOf(l2.longValue()));
        }
        Long l3 = aVar.e;
        if (l3 != null) {
            jsonObject.addProperty("down_kbps", Long.valueOf(l3.longValue()));
        }
        Long l4 = aVar.f;
        if (l4 != null) {
            jsonObject.addProperty("strength", Long.valueOf(l4.longValue()));
        }
        String str2 = aVar.g;
        if (str2 != null) {
            jsonObject.addProperty("cellular_technology", str2);
        }
        String jsonElement = jsonObject.getAsJsonObject().toString();
        j.e(jsonElement, "model.toJson().asJsonObject.toString()");
        return jsonElement;
    }
}
