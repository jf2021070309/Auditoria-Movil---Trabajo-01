package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.b6.x;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzagb {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzafz zzafzVar, String str) {
        StringBuilder b = x.b("# ", str);
        zzd(zzafzVar, b, 0);
        return b.toString();
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            zzc(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzahh.zza(new zzado(((String) obj).getBytes(zzafa.zzb))));
                sb.append('\"');
            } else if (obj instanceof zzadr) {
                sb.append(": \"");
                sb.append(zzahh.zza((zzadr) obj));
                sb.append('\"');
            } else if (obj instanceof zzaet) {
                sb.append(" {");
                zzd((zzaet) obj, sb, i + 2);
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                zzb(sb, i3, "key", entry2.getKey());
                zzb(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    private static void zzd(zzafz zzafzVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzafzVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i, substring.substring(0, substring.length() - 4), zzaet.zzaI(method2, zzafzVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, substring.substring(0, substring.length() - 3), zzaet.zzaI(method, zzafzVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzaI = zzaet.zzaI(method4, zzafzVar, new Object[0]);
                    if (method5 == null) {
                        if (zzaI instanceof Boolean) {
                            if (!((Boolean) zzaI).booleanValue()) {
                            }
                            zzb(sb, i, substring, zzaI);
                        } else if (zzaI instanceof Integer) {
                            if (((Integer) zzaI).intValue() == 0) {
                            }
                            zzb(sb, i, substring, zzaI);
                        } else if (zzaI instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaI).floatValue()) == 0) {
                            }
                            zzb(sb, i, substring, zzaI);
                        } else if (zzaI instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzaI).doubleValue()) == 0) {
                            }
                            zzb(sb, i, substring, zzaI);
                        } else {
                            if (zzaI instanceof String) {
                                equals = zzaI.equals("");
                            } else if (zzaI instanceof zzadr) {
                                equals = zzaI.equals(zzadr.zzb);
                            } else if (zzaI instanceof zzafz) {
                                if (zzaI == ((zzafz) zzaI).zzaR()) {
                                }
                                zzb(sb, i, substring, zzaI);
                            } else {
                                if ((zzaI instanceof Enum) && ((Enum) zzaI).ordinal() == 0) {
                                }
                                zzb(sb, i, substring, zzaI);
                            }
                            if (equals) {
                            }
                            zzb(sb, i, substring, zzaI);
                        }
                    } else {
                        if (!((Boolean) zzaet.zzaI(method5, zzafzVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzaI);
                    }
                }
            }
            i2 = 3;
        }
        if (!(zzafzVar instanceof zzaeq)) {
            zzahk zzahkVar = ((zzaet) zzafzVar).zzc;
            if (zzahkVar != null) {
                zzahkVar.zzi(sb, i);
                return;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) zzafzVar;
        throw null;
    }
}
