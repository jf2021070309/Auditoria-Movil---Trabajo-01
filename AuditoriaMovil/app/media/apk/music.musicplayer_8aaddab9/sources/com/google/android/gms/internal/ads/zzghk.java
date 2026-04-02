package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import e.a.d.a.a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* loaded from: classes.dex */
public final class zzghk {
    public static String zza(zzghi zzghiVar, String str) {
        StringBuilder A = a.A("# ", str);
        zzc(zzghiVar, A, 0);
        return A.toString();
    }

    public static final void zzb(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i2, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i2, str, entry);
            }
        } else {
            sb.append('\n');
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzgim.zza(zzgex.zzv((String) obj)));
                sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof zzgex) {
                sb.append(": \"");
                sb.append(zzgim.zza((zzgex) obj));
                sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof zzgga) {
                sb.append(" {");
                zzc((zzgga) obj, sb, i2 + 2);
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj.toString());
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i5 = i2 + 2;
                zzb(sb, i5, Action.KEY_ATTRIBUTE, entry2.getKey());
                zzb(sb, i5, "value", entry2.getValue());
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            }
        }
    }

    private static void zzc(zzghi zzghiVar, StringBuilder sb, int i2) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzghiVar.getClass().getDeclaredMethods()) {
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
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i2, zzd(concat), zzgga.zzaA(method2, zzghiVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i2, zzd(concat2), zzgga.zzaA(method3, zzghiVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object zzaA = zzgga.zzaA(method4, zzghiVar, new Object[0]);
                    if (method5 == null) {
                        if (zzaA instanceof Boolean) {
                            if (((Boolean) zzaA).booleanValue()) {
                                zzb(sb, i2, zzd(concat3), zzaA);
                            }
                        } else if (zzaA instanceof Integer) {
                            if (((Integer) zzaA).intValue() != 0) {
                                zzb(sb, i2, zzd(concat3), zzaA);
                            }
                        } else if (zzaA instanceof Float) {
                            if (((Float) zzaA).floatValue() != 0.0f) {
                                zzb(sb, i2, zzd(concat3), zzaA);
                            }
                        } else if (!(zzaA instanceof Double)) {
                            if (zzaA instanceof String) {
                                equals = zzaA.equals("");
                            } else if (zzaA instanceof zzgex) {
                                equals = zzaA.equals(zzgex.zzb);
                            } else if (!(zzaA instanceof zzghi)) {
                                if ((zzaA instanceof Enum) && ((Enum) zzaA).ordinal() == 0) {
                                }
                                zzb(sb, i2, zzd(concat3), zzaA);
                            } else if (zzaA != ((zzghi) zzaA).zzbe()) {
                                zzb(sb, i2, zzd(concat3), zzaA);
                            }
                            if (!equals) {
                                zzb(sb, i2, zzd(concat3), zzaA);
                            }
                        } else if (((Double) zzaA).doubleValue() != 0.0d) {
                            zzb(sb, i2, zzd(concat3), zzaA);
                        }
                    } else if (((Boolean) zzgga.zzaA(method5, zzghiVar, new Object[0])).booleanValue()) {
                        zzb(sb, i2, zzd(concat3), zzaA);
                    }
                }
            }
        }
        if (zzghiVar instanceof zzgfx) {
            zzgfx zzgfxVar = (zzgfx) zzghiVar;
            throw null;
        }
        zzgip zzgipVar = ((zzgga) zzghiVar).zzc;
        if (zzgipVar != null) {
            zzgipVar.zzg(sb, i2);
        }
    }

    private static final String zzd(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
