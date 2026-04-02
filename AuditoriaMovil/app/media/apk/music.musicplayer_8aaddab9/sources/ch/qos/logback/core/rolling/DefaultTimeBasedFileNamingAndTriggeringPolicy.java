package ch.qos.logback.core.rolling;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import ch.qos.logback.core.rolling.helper.DefaultFileProvider;
import ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover;
import e.a.d.a.a;
import java.io.File;
import java.util.Date;
@NoAutoStart
/* loaded from: classes.dex */
public class DefaultTimeBasedFileNamingAndTriggeringPolicy<E> extends TimeBasedFileNamingAndTriggeringPolicyBase<E> {
    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e2) {
        long currentTime = getCurrentTime();
        if (currentTime >= this.nextCheck) {
            Date date = this.dateInCurrentPeriod;
            addInfo("Elapsed period: " + date);
            this.elapsedPeriodsFileName = this.tbrp.fileNamePatternWithoutCompSuffix.convert(date);
            setDateInCurrentPeriod(currentTime);
            computeNextCheck();
            return true;
        }
        return false;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        if (super.isErrorFree()) {
            if (this.tbrp.fileNamePattern.hasIntegerTokenCOnverter()) {
                StringBuilder y = a.y("Filename pattern [");
                y.append(this.tbrp.fileNamePattern);
                y.append("] contains an integer token converter, i.e. %i, INCOMPATIBLE with this configuration. Remove it.");
                addError(y.toString());
                return;
            }
            TimeBasedArchiveRemover timeBasedArchiveRemover = new TimeBasedArchiveRemover(this.tbrp.fileNamePattern, this.rc, new DefaultFileProvider());
            this.archiveRemover = timeBasedArchiveRemover;
            timeBasedArchiveRemover.setContext(this.context);
            this.started = true;
        }
    }

    public String toString() {
        return "c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy";
    }
}
