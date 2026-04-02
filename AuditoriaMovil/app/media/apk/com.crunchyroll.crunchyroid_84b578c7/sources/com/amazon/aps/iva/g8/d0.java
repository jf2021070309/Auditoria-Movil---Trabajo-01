package com.amazon.aps.iva.g8;

import android.net.Uri;
import com.amazon.aps.iva.g8.u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: NavDeepLink.kt */
/* loaded from: classes.dex */
public final class d0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Map<String, u.a>> {
    public final /* synthetic */ u h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(u uVar) {
        super(0);
        this.h = uVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Map<String, u.a> invoke() {
        boolean z;
        u uVar = this.h;
        uVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (((Boolean) uVar.g.getValue()).booleanValue()) {
            String str = uVar.a;
            Uri parse = Uri.parse(str);
            for (String str2 : parse.getQueryParameterNames()) {
                StringBuilder sb = new StringBuilder();
                List<String> queryParameters = parse.getQueryParameters(str2);
                int i = 0;
                if (queryParameters.size() <= 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String str3 = (String) com.amazon.aps.iva.lb0.x.v0(queryParameters);
                    if (str3 == null) {
                        uVar.i = true;
                        str3 = str2;
                    }
                    Matcher matcher = u.q.matcher(str3);
                    u.a aVar = new u.a();
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        com.amazon.aps.iva.yb0.j.d(group, "null cannot be cast to non-null type kotlin.String");
                        aVar.b.add(group);
                        com.amazon.aps.iva.yb0.j.e(str3, "queryParam");
                        String substring = str3.substring(i, matcher.start());
                        com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(Pattern.quote(substring));
                        sb.append("(.+?)?");
                        i = matcher.end();
                    }
                    if (i < str3.length()) {
                        String substring2 = str3.substring(i);
                        com.amazon.aps.iva.yb0.j.e(substring2, "this as java.lang.String).substring(startIndex)");
                        sb.append(Pattern.quote(substring2));
                    }
                    String sb2 = sb.toString();
                    com.amazon.aps.iva.yb0.j.e(sb2, "argRegex.toString()");
                    aVar.a = com.amazon.aps.iva.oe0.m.f0(sb2, ".*", "\\E.*\\Q");
                    com.amazon.aps.iva.yb0.j.e(str2, "paramName");
                    linkedHashMap.put(str2, aVar);
                } else {
                    throw new IllegalArgumentException(com.amazon.aps.iva.e4.e.b("Query parameter ", str2, " must only be present once in ", str, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
            }
        }
        return linkedHashMap;
    }
}
