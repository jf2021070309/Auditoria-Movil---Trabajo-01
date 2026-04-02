package ch.qos.logback.classic;

import e.a.d.a.a;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class Level implements Serializable {
    public static final int DEBUG_INT = 10000;
    public static final int OFF_INT = Integer.MAX_VALUE;
    public static final int WARN_INT = 30000;
    private static final long serialVersionUID = -814092767334282137L;
    public final int levelInt;
    public final String levelStr;
    public static final Integer OFF_INTEGER = Integer.MAX_VALUE;
    public static final int ERROR_INT = 40000;
    public static final Integer ERROR_INTEGER = Integer.valueOf((int) ERROR_INT);
    public static final Integer WARN_INTEGER = 30000;
    public static final int INFO_INT = 20000;
    public static final Integer INFO_INTEGER = Integer.valueOf((int) INFO_INT);
    public static final Integer DEBUG_INTEGER = 10000;
    public static final int TRACE_INT = 5000;
    public static final Integer TRACE_INTEGER = Integer.valueOf((int) TRACE_INT);
    public static final int ALL_INT = Integer.MIN_VALUE;
    public static final Integer ALL_INTEGER = Integer.valueOf((int) ALL_INT);
    public static final Level OFF = new Level(Integer.MAX_VALUE, "OFF");
    public static final Level ERROR = new Level(ERROR_INT, "ERROR");
    public static final Level WARN = new Level(30000, "WARN");
    public static final Level INFO = new Level(INFO_INT, "INFO");
    public static final Level DEBUG = new Level(10000, "DEBUG");
    public static final Level TRACE = new Level(TRACE_INT, "TRACE");
    public static final Level ALL = new Level(ALL_INT, "ALL");

    private Level(int i2, String str) {
        this.levelInt = i2;
        this.levelStr = str;
    }

    public static Level fromLocationAwareLoggerInteger(int i2) {
        if (i2 != 0) {
            if (i2 != 10) {
                if (i2 != 20) {
                    if (i2 != 30) {
                        if (i2 == 40) {
                            return ERROR;
                        }
                        throw new IllegalArgumentException(i2 + " not a valid level value");
                    }
                    return WARN;
                }
                return INFO;
            }
            return DEBUG;
        }
        return TRACE;
    }

    private Object readResolve() {
        return toLevel(this.levelInt);
    }

    public static Level toLevel(int i2) {
        return toLevel(i2, DEBUG);
    }

    public static Level toLevel(int i2, Level level) {
        return i2 != Integer.MIN_VALUE ? i2 != 5000 ? i2 != 10000 ? i2 != 20000 ? i2 != 30000 ? i2 != 40000 ? i2 != Integer.MAX_VALUE ? level : OFF : ERROR : WARN : INFO : DEBUG : TRACE : ALL;
    }

    public static Level toLevel(String str) {
        return toLevel(str, DEBUG);
    }

    public static Level toLevel(String str, Level level) {
        if (str == null) {
            return level;
        }
        String trim = str.trim();
        return trim.equalsIgnoreCase("ALL") ? ALL : trim.equalsIgnoreCase("TRACE") ? TRACE : trim.equalsIgnoreCase("DEBUG") ? DEBUG : trim.equalsIgnoreCase("INFO") ? INFO : trim.equalsIgnoreCase("WARN") ? WARN : trim.equalsIgnoreCase("ERROR") ? ERROR : trim.equalsIgnoreCase("OFF") ? OFF : level;
    }

    public static int toLocationAwareLoggerInteger(Level level) {
        if (level != null) {
            int i2 = level.toInt();
            if (i2 != 5000) {
                if (i2 != 10000) {
                    if (i2 != 20000) {
                        if (i2 != 30000) {
                            if (i2 == 40000) {
                                return 40;
                            }
                            throw new IllegalArgumentException(level + " not a valid level value");
                        }
                        return 30;
                    }
                    return 20;
                }
                return 10;
            }
            return 0;
        }
        throw new IllegalArgumentException("null level parameter is not admitted");
    }

    public static Level valueOf(String str) {
        return toLevel(str, DEBUG);
    }

    public boolean isGreaterOrEqual(Level level) {
        return this.levelInt >= level.levelInt;
    }

    public int toInt() {
        return this.levelInt;
    }

    public Integer toInteger() {
        int i2 = this.levelInt;
        if (i2 != Integer.MIN_VALUE) {
            if (i2 != 5000) {
                if (i2 != 10000) {
                    if (i2 != 20000) {
                        if (i2 != 30000) {
                            if (i2 != 40000) {
                                if (i2 == Integer.MAX_VALUE) {
                                    return OFF_INTEGER;
                                }
                                StringBuilder y = a.y("Level ");
                                y.append(this.levelStr);
                                y.append(", ");
                                throw new IllegalStateException(a.p(y, this.levelInt, " is unknown."));
                            }
                            return ERROR_INTEGER;
                        }
                        return WARN_INTEGER;
                    }
                    return INFO_INTEGER;
                }
                return DEBUG_INTEGER;
            }
            return TRACE_INTEGER;
        }
        return ALL_INTEGER;
    }

    public String toString() {
        return this.levelStr;
    }
}
