package l.c.a.u;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public final class k extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<Map.Entry<String, Long>> f9802b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentMap<Map.Entry<l.c.a.w.i, Locale>, Object> f9803c = new ConcurrentHashMap(16, 0.75f, 2);

    /* loaded from: classes2.dex */
    public class a implements Comparator<Map.Entry<String, Long>> {
        @Override // java.util.Comparator
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public final Map<l, Map<Long, String>> a;

        public b(Map<l, Map<Long, String>> map) {
            this.a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (l lVar : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Long, String> entry : map.get(lVar).entrySet()) {
                    String value = entry.getValue();
                    String value2 = entry.getValue();
                    Long key = entry.getKey();
                    Comparator<Map.Entry<String, Long>> comparator = k.f9802b;
                    hashMap2.put(value, new AbstractMap.SimpleImmutableEntry(value2, key));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Comparator<Map.Entry<String, Long>> comparator2 = k.f9802b;
                Collections.sort(arrayList2, k.f9802b);
                hashMap.put(lVar, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put(null, arrayList);
            }
            Comparator<Map.Entry<String, Long>> comparator3 = k.f9802b;
            Collections.sort(arrayList, k.f9802b);
        }

        public String a(long j2, l lVar) {
            Map<Long, String> map = this.a.get(lVar);
            if (map != null) {
                return map.get(Long.valueOf(j2));
            }
            return null;
        }
    }

    public static b b(Map<l, Map<Long, String>> map) {
        map.put(l.FULL_STANDALONE, map.get(l.FULL));
        map.put(l.SHORT_STANDALONE, map.get(l.SHORT));
        l lVar = l.NARROW;
        if (map.containsKey(lVar)) {
            l lVar2 = l.NARROW_STANDALONE;
            if (!map.containsKey(lVar2)) {
                map.put(lVar2, map.get(lVar));
            }
        }
        return new b(map);
    }

    @Override // l.c.a.u.g
    public String a(l.c.a.w.i iVar, long j2, l lVar, Locale locale) {
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        Object obj;
        k kVar = this;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(iVar, locale);
        Object obj2 = kVar.f9803c.get(simpleImmutableEntry2);
        if (obj2 == null) {
            if (iVar == l.c.a.w.a.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap = new HashMap();
                simpleImmutableEntry = simpleImmutableEntry2;
                String[] months = dateFormatSymbols.getMonths();
                HashMap hashMap2 = new HashMap();
                hashMap2.put(1L, months[0]);
                hashMap2.put(2L, months[1]);
                hashMap2.put(3L, months[2]);
                hashMap2.put(4L, months[3]);
                hashMap2.put(5L, months[4]);
                hashMap2.put(6L, months[5]);
                hashMap2.put(7L, months[6]);
                hashMap2.put(8L, months[7]);
                hashMap2.put(9L, months[8]);
                hashMap2.put(10L, months[9]);
                hashMap2.put(11L, months[10]);
                hashMap2.put(12L, months[11]);
                hashMap.put(l.FULL, hashMap2);
                HashMap hashMap3 = new HashMap();
                hashMap3.put(1L, d(1, months[0], locale));
                hashMap3.put(2L, d(2, months[1], locale));
                hashMap3.put(3L, d(3, months[2], locale));
                hashMap3.put(4L, d(4, months[3], locale));
                hashMap3.put(5L, d(5, months[4], locale));
                hashMap3.put(6L, d(6, months[5], locale));
                hashMap3.put(7L, d(7, months[6], locale));
                hashMap3.put(8L, d(8, months[7], locale));
                hashMap3.put(9L, d(9, months[8], locale));
                hashMap3.put(10L, d(10, months[9], locale));
                hashMap3.put(11L, d(11, months[10], locale));
                hashMap3.put(12L, d(12, months[11], locale));
                hashMap.put(l.NARROW, hashMap3);
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                HashMap hashMap4 = new HashMap();
                hashMap4.put(1L, shortMonths[0]);
                hashMap4.put(2L, shortMonths[1]);
                hashMap4.put(3L, shortMonths[2]);
                hashMap4.put(4L, shortMonths[3]);
                hashMap4.put(5L, shortMonths[4]);
                hashMap4.put(6L, shortMonths[5]);
                hashMap4.put(7L, shortMonths[6]);
                hashMap4.put(8L, shortMonths[7]);
                hashMap4.put(9L, shortMonths[8]);
                hashMap4.put(10L, shortMonths[9]);
                hashMap4.put(11L, shortMonths[10]);
                hashMap4.put(12L, shortMonths[11]);
                hashMap.put(l.SHORT, hashMap4);
                obj = b(hashMap);
                kVar = this;
            } else {
                simpleImmutableEntry = simpleImmutableEntry2;
                if (iVar == l.c.a.w.a.DAY_OF_WEEK) {
                    DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap5 = new HashMap();
                    String[] weekdays = dateFormatSymbols2.getWeekdays();
                    HashMap hashMap6 = new HashMap();
                    hashMap6.put(1L, weekdays[2]);
                    hashMap6.put(2L, weekdays[3]);
                    hashMap6.put(3L, weekdays[4]);
                    hashMap6.put(4L, weekdays[5]);
                    hashMap6.put(5L, weekdays[6]);
                    hashMap6.put(6L, weekdays[7]);
                    hashMap6.put(7L, weekdays[1]);
                    hashMap5.put(l.FULL, hashMap6);
                    HashMap hashMap7 = new HashMap();
                    hashMap7.put(1L, kVar.c(1, weekdays[2], locale));
                    hashMap7.put(2L, kVar.c(2, weekdays[3], locale));
                    hashMap7.put(3L, kVar.c(3, weekdays[4], locale));
                    hashMap7.put(4L, kVar.c(4, weekdays[5], locale));
                    hashMap7.put(5L, kVar.c(5, weekdays[6], locale));
                    hashMap7.put(6L, kVar.c(6, weekdays[7], locale));
                    hashMap7.put(7L, kVar.c(7, weekdays[1], locale));
                    hashMap5.put(l.NARROW, hashMap7);
                    String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
                    HashMap hashMap8 = new HashMap();
                    hashMap8.put(1L, shortWeekdays[2]);
                    hashMap8.put(2L, shortWeekdays[3]);
                    hashMap8.put(3L, shortWeekdays[4]);
                    hashMap8.put(4L, shortWeekdays[5]);
                    hashMap8.put(5L, shortWeekdays[6]);
                    hashMap8.put(6L, shortWeekdays[7]);
                    hashMap8.put(7L, shortWeekdays[1]);
                    hashMap5.put(l.SHORT, hashMap8);
                    obj = b(hashMap5);
                } else if (iVar == l.c.a.w.a.AMPM_OF_DAY) {
                    DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap9 = new HashMap();
                    String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
                    HashMap hashMap10 = new HashMap();
                    hashMap10.put(0L, amPmStrings[0]);
                    hashMap10.put(1L, amPmStrings[1]);
                    hashMap9.put(l.FULL, hashMap10);
                    hashMap9.put(l.SHORT, hashMap10);
                    obj = b(hashMap9);
                } else if (iVar == l.c.a.w.a.ERA) {
                    DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap11 = new HashMap();
                    String[] eras = dateFormatSymbols4.getEras();
                    HashMap hashMap12 = new HashMap();
                    hashMap12.put(0L, eras[0]);
                    hashMap12.put(1L, eras[1]);
                    hashMap11.put(l.SHORT, hashMap12);
                    if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                        HashMap hashMap13 = new HashMap();
                        hashMap13.put(0L, "Before Christ");
                        hashMap13.put(1L, "Anno Domini");
                        hashMap11.put(l.FULL, hashMap13);
                    } else {
                        hashMap11.put(l.FULL, hashMap12);
                    }
                    HashMap hashMap14 = new HashMap();
                    hashMap14.put(0L, eras[0].substring(0, 1));
                    hashMap14.put(1L, eras[1].substring(0, 1));
                    hashMap11.put(l.NARROW, hashMap14);
                    obj = b(hashMap11);
                } else if (iVar == l.c.a.w.c.a) {
                    HashMap hashMap15 = new HashMap();
                    HashMap hashMap16 = new HashMap();
                    hashMap16.put(1L, "Q1");
                    hashMap16.put(2L, "Q2");
                    hashMap16.put(3L, "Q3");
                    hashMap16.put(4L, "Q4");
                    hashMap15.put(l.SHORT, hashMap16);
                    HashMap hashMap17 = new HashMap();
                    hashMap17.put(1L, "1st quarter");
                    hashMap17.put(2L, "2nd quarter");
                    hashMap17.put(3L, "3rd quarter");
                    hashMap17.put(4L, "4th quarter");
                    hashMap15.put(l.FULL, hashMap17);
                    obj = b(hashMap15);
                } else {
                    obj = "";
                }
            }
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = simpleImmutableEntry;
            kVar.f9803c.putIfAbsent(simpleImmutableEntry3, obj);
            obj2 = kVar.f9803c.get(simpleImmutableEntry3);
        }
        if (obj2 instanceof b) {
            return ((b) obj2).a(j2, lVar);
        }
        return null;
    }

    public final String c(int i2, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i2) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i2) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    public final String d(int i2, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i2) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i2) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        return (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) ? Integer.toString(i2) : str.substring(0, 1);
    }
}
