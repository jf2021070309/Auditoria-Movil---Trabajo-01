package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
/* loaded from: classes2.dex */
final class q {
    private static final Object a = new Object();
    private static final Object[][] b = {new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", a, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", a, 20}, new Object[]{"22", a, 29}, new Object[]{"30", a, 8}, new Object[]{"37", a, 8}, new Object[]{"90", a, 30}, new Object[]{"91", a, 30}, new Object[]{"92", a, 30}, new Object[]{"93", a, 30}, new Object[]{"94", a, 30}, new Object[]{"95", a, 30}, new Object[]{"96", a, 30}, new Object[]{"97", a, 30}, new Object[]{"98", a, 30}, new Object[]{"99", a, 30}};
    private static final Object[][] c = {new Object[]{"240", a, 30}, new Object[]{"241", a, 30}, new Object[]{"242", a, 6}, new Object[]{"250", a, 30}, new Object[]{"251", a, 30}, new Object[]{"253", a, 17}, new Object[]{"254", a, 20}, new Object[]{"400", a, 30}, new Object[]{"401", a, 30}, new Object[]{"402", 17}, new Object[]{"403", a, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", a, 20}, new Object[]{"421", a, 15}, new Object[]{"422", 3}, new Object[]{"423", a, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
    private static final Object[][] d = {new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", a, 15}, new Object[]{"391", a, 18}, new Object[]{"392", a, 15}, new Object[]{"393", a, 18}, new Object[]{"703", a, 30}};
    private static final Object[][] e = {new Object[]{"7001", 13}, new Object[]{"7002", a, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", a, 20}, new Object[]{"8003", a, 30}, new Object[]{"8004", a, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", a, 30}, new Object[]{"8008", a, 12}, new Object[]{"8018", 18}, new Object[]{"8020", a, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", a, 70}, new Object[]{"8200", a, 70}};

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        Object[][] objArr;
        Object[][] objArr2;
        Object[][] objArr3;
        Object[][] objArr4;
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        String substring = str.substring(0, 2);
        for (Object[] objArr5 : b) {
            if (objArr5[0].equals(substring)) {
                if (objArr5[1] == a) {
                    return b(2, ((Integer) objArr5[2]).intValue(), str);
                } else {
                    return a(2, ((Integer) objArr5[1]).intValue(), str);
                }
            }
        }
        if (str.length() < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        String substring2 = str.substring(0, 3);
        for (Object[] objArr6 : c) {
            if (objArr6[0].equals(substring2)) {
                if (objArr6[1] == a) {
                    return b(3, ((Integer) objArr6[2]).intValue(), str);
                } else {
                    return a(3, ((Integer) objArr6[1]).intValue(), str);
                }
            }
        }
        for (Object[] objArr7 : d) {
            if (objArr7[0].equals(substring2)) {
                if (objArr7[1] == a) {
                    return b(4, ((Integer) objArr7[2]).intValue(), str);
                } else {
                    return a(4, ((Integer) objArr7[1]).intValue(), str);
                }
            }
        }
        if (str.length() < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        String substring3 = str.substring(0, 4);
        for (Object[] objArr8 : e) {
            if (objArr8[0].equals(substring3)) {
                if (objArr8[1] == a) {
                    return b(4, ((Integer) objArr8[2]).intValue(), str);
                } else {
                    return a(4, ((Integer) objArr8[1]).intValue(), str);
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static String a(int i, int i2, String str) {
        if (str.length() < i) {
            throw NotFoundException.getNotFoundInstance();
        }
        String substring = str.substring(0, i);
        if (str.length() < i + i2) {
            throw NotFoundException.getNotFoundInstance();
        }
        String substring2 = str.substring(i, i + i2);
        String str2 = "(" + substring + ')' + substring2;
        String a2 = a(str.substring(i + i2));
        return a2 == null ? str2 : str2 + a2;
    }

    private static String b(int i, int i2, String str) {
        int i3;
        String substring = str.substring(0, i);
        if (str.length() < i + i2) {
            i3 = str.length();
        } else {
            i3 = i + i2;
        }
        String substring2 = str.substring(i, i3);
        String substring3 = str.substring(i3);
        String str2 = "(" + substring + ')' + substring2;
        String a2 = a(substring3);
        return a2 == null ? str2 : str2 + a2;
    }
}
