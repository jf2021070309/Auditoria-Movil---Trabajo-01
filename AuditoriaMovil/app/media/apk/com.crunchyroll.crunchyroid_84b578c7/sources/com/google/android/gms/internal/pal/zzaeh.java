package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.b6.x;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzaeh {
    public static String zza(zzaef zzaefVar, String str) {
        StringBuilder b = x.b("# ", str);
        zzd(zzaefVar, b, 0);
        return b.toString();
    }

    public static final void zzb(StringBuilder sb, int i, String str, Object obj) {
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
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzafg.zza(zzaby.zzp((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzaby) {
                sb.append(": \"");
                sb.append(zzafg.zza((zzaby) obj));
                sb.append('\"');
            } else if (obj instanceof zzacz) {
                sb.append(" {");
                zzd((zzacz) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                zzb(sb, i4, "key", entry2.getKey());
                zzb(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static final String zzc(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void zzd(zzaef zzaefVar, StringBuilder sb, int i) {
        Method[] declaredMethods;
        String str;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzaefVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String concat = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 4)));
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i, zzc(concat), zzacz.zzaD(method2, zzaefVar, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String concat2 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 3)));
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i, zzc(concat2), zzacz.zzaD(method3, zzaefVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(str))) != null && (!str.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(str.substring(0, str.length() - 5)))))) {
                String concat3 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object zzaD = zzacz.zzaD(method4, zzaefVar, new Object[0]);
                    if (method5 == null) {
                        if (zzaD instanceof Boolean) {
                            if (((Boolean) zzaD).booleanValue()) {
                                zzb(sb, i, zzc(concat3), zzaD);
                            }
                        } else if (zzaD instanceof Integer) {
                            if (((Integer) zzaD).intValue() != 0) {
                                zzb(sb, i, zzc(concat3), zzaD);
                            }
                        } else if (zzaD instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaD).floatValue()) != 0) {
                                zzb(sb, i, zzc(concat3), zzaD);
                            }
                        } else if (zzaD instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzaD).doubleValue()) != 0) {
                                zzb(sb, i, zzc(concat3), zzaD);
                            }
                        } else {
                            if (zzaD instanceof String) {
                                equals = zzaD.equals("");
                            } else if (zzaD instanceof zzaby) {
                                equals = zzaD.equals(zzaby.zzb);
                            } else if (zzaD instanceof zzaef) {
                                if (zzaD != ((zzaef) zzaD).zzaq()) {
                                    zzb(sb, i, zzc(concat3), zzaD);
                                }
                            } else {
                                if ((zzaD instanceof Enum) && ((Enum) zzaD).ordinal() == 0) {
                                }
                                zzb(sb, i, zzc(concat3), zzaD);
                            }
                            if (!equals) {
                                zzb(sb, i, zzc(concat3), zzaD);
                            }
                        }
                    } else if (((Boolean) zzacz.zzaD(method5, zzaefVar, new Object[0])).booleanValue()) {
                        zzb(sb, i, zzc(concat3), zzaD);
                    }
                }
            }
        }
        if (!(zzaefVar instanceof zzacw)) {
            zzafj zzafjVar = ((zzacz) zzaefVar).zzc;
            if (zzafjVar != null) {
                zzafjVar.zzg(sb, i);
                return;
            }
            return;
        }
        zzacw zzacwVar = (zzacw) zzaefVar;
        throw null;
    }
}
