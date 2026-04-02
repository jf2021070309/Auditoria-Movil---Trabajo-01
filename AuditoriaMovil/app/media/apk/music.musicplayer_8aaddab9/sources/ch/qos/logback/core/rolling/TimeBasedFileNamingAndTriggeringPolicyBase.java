package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.RollingCalendar;
import ch.qos.logback.core.spi.ContextAwareBase;
import e.a.d.a.a;
import java.io.File;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class TimeBasedFileNamingAndTriggeringPolicyBase<E> extends ContextAwareBase implements TimeBasedFileNamingAndTriggeringPolicy<E> {
    private static String COLLIDING_DATE_FORMAT_URL = "http://logback.qos.ch/codes.html#rfa_collision_in_dateFormat";
    public String elapsedPeriodsFileName;
    public long nextCheck;
    public RollingCalendar rc;
    public TimeBasedRollingPolicy<E> tbrp;
    public ArchiveRemover archiveRemover = null;
    public long artificialCurrentTime = -1;
    public Date dateInCurrentPeriod = null;
    public boolean started = false;
    public boolean errorFree = true;

    public void computeNextCheck() {
        this.nextCheck = this.rc.getNextTriggeringDate(this.dateInCurrentPeriod).getTime();
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public ArchiveRemover getArchiveRemover() {
        return this.archiveRemover;
    }

    public String getCurrentPeriodsFileNameWithoutCompressionSuffix() {
        return this.tbrp.fileNamePatternWithoutCompSuffix.convert(this.dateInCurrentPeriod);
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public long getCurrentTime() {
        long j2 = this.artificialCurrentTime;
        return j2 >= 0 ? j2 : System.currentTimeMillis();
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public String getElapsedPeriodsFileName() {
        return this.elapsedPeriodsFileName;
    }

    public boolean isErrorFree() {
        return this.errorFree;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public void setCurrentTime(long j2) {
        this.artificialCurrentTime = j2;
    }

    public void setDateInCurrentPeriod(long j2) {
        this.dateInCurrentPeriod.setTime(j2);
    }

    public void setDateInCurrentPeriod(Date date) {
        this.dateInCurrentPeriod = date;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public void setTimeBasedRollingPolicy(TimeBasedRollingPolicy<E> timeBasedRollingPolicy) {
        this.tbrp = timeBasedRollingPolicy;
    }

    public void start() {
        DateTokenConverter<Object> primaryDateTokenConverter = this.tbrp.fileNamePattern.getPrimaryDateTokenConverter();
        if (primaryDateTokenConverter == null) {
            StringBuilder y = a.y("FileNamePattern [");
            y.append(this.tbrp.fileNamePattern.getPattern());
            y.append("] does not contain a valid DateToken");
            throw new IllegalStateException(y.toString());
        }
        this.rc = primaryDateTokenConverter.getTimeZone() != null ? new RollingCalendar(primaryDateTokenConverter.getDatePattern(), primaryDateTokenConverter.getTimeZone(), Locale.US) : new RollingCalendar(primaryDateTokenConverter.getDatePattern());
        StringBuilder y2 = a.y("The date pattern is '");
        y2.append(primaryDateTokenConverter.getDatePattern());
        y2.append("' from file name pattern '");
        y2.append(this.tbrp.fileNamePattern.getPattern());
        y2.append("'.");
        addInfo(y2.toString());
        this.rc.printPeriodicity(this);
        if (!this.rc.isCollisionFree()) {
            addError("The date format in FileNamePattern will result in collisions in the names of archived log files.");
            addError(COLLIDING_DATE_FORMAT_URL);
            withErrors();
            return;
        }
        setDateInCurrentPeriod(new Date(getCurrentTime()));
        if (this.tbrp.getParentsRawFileProperty() != null) {
            File file = new File(this.tbrp.getParentsRawFileProperty());
            if (file.exists() && file.canRead()) {
                setDateInCurrentPeriod(new Date(file.lastModified()));
            }
        }
        StringBuilder y3 = a.y("Setting initial period to ");
        y3.append(this.dateInCurrentPeriod);
        addInfo(y3.toString());
        computeNextCheck();
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.started = false;
    }

    public void withErrors() {
        this.errorFree = false;
    }
}
