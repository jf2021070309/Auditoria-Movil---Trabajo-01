package ch.qos.logback.core.rolling;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.RenameUtil;
import ch.qos.logback.core.util.FileSize;
import e.a.d.a.a;
import java.io.File;
import java.util.Date;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class TimeBasedRollingPolicy<E> extends RollingPolicyBase implements TriggeringPolicy<E> {
    public static final String FNP_NOT_SET = "The FileNamePattern option must be set before using TimeBasedRollingPolicy. ";
    private ArchiveRemover archiveRemover;
    public Future<?> cleanUpFuture;
    public Future<?> compressionFuture;
    private Compressor compressor;
    public FileNamePattern fileNamePatternWithoutCompSuffix;
    public TimeBasedFileNamingAndTriggeringPolicy<E> timeBasedFileNamingAndTriggeringPolicy;
    private RenameUtil renameUtil = new RenameUtil();
    private int maxHistory = 0;
    public FileSize totalSizeCap = new FileSize(0);
    public boolean cleanHistoryOnStart = false;

    private String transformFileNamePattern2ZipEntry(String str) {
        return FileFilterUtil.afterLastSlash(FileFilterUtil.slashify(str));
    }

    private void waitForAsynchronousJobToStop(Future<?> future, String str) {
        StringBuilder sb;
        String str2;
        if (future != null) {
            try {
                future.get(30L, TimeUnit.SECONDS);
            } catch (TimeoutException e2) {
                e = e2;
                sb = new StringBuilder();
                str2 = "Timeout while waiting for ";
                sb.append(str2);
                sb.append(str);
                sb.append(" job to finish");
                addError(sb.toString(), e);
            } catch (Exception e3) {
                e = e3;
                sb = new StringBuilder();
                str2 = "Unexpected exception while waiting for ";
                sb.append(str2);
                sb.append(str);
                sb.append(" job to finish");
                addError(sb.toString(), e);
            }
        }
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public String getActiveFileName() {
        String parentsRawFileProperty = getParentsRawFileProperty();
        return parentsRawFileProperty != null ? parentsRawFileProperty : this.timeBasedFileNamingAndTriggeringPolicy.getCurrentPeriodsFileNameWithoutCompressionSuffix();
    }

    public int getMaxHistory() {
        return this.maxHistory;
    }

    public TimeBasedFileNamingAndTriggeringPolicy<E> getTimeBasedFileNamingAndTriggeringPolicy() {
        return this.timeBasedFileNamingAndTriggeringPolicy;
    }

    public boolean isCleanHistoryOnStart() {
        return this.cleanHistoryOnStart;
    }

    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e2) {
        return this.timeBasedFileNamingAndTriggeringPolicy.isTriggeringEvent(file, e2);
    }

    public boolean isUnboundedTotalSizeCap() {
        return this.totalSizeCap.getSize() == 0;
    }

    public Future<?> renameRawAndAsyncCompress(String str, String str2) throws RolloverFailure {
        String parentsRawFileProperty = getParentsRawFileProperty();
        StringBuilder y = a.y(str);
        y.append(System.nanoTime());
        y.append(".tmp");
        String sb = y.toString();
        this.renameUtil.rename(parentsRawFileProperty, sb);
        return this.compressor.asyncCompress(sb, str, str2);
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public void rollover() throws RolloverFailure {
        String elapsedPeriodsFileName = this.timeBasedFileNamingAndTriggeringPolicy.getElapsedPeriodsFileName();
        String afterLastSlash = FileFilterUtil.afterLastSlash(elapsedPeriodsFileName);
        if (this.compressionMode != CompressionMode.NONE) {
            this.compressionFuture = getParentsRawFileProperty() == null ? this.compressor.asyncCompress(elapsedPeriodsFileName, elapsedPeriodsFileName, afterLastSlash) : renameRawAndAsyncCompress(elapsedPeriodsFileName, afterLastSlash);
        } else if (getParentsRawFileProperty() != null) {
            this.renameUtil.rename(getParentsRawFileProperty(), elapsedPeriodsFileName);
        }
        if (this.archiveRemover != null) {
            this.cleanUpFuture = this.archiveRemover.cleanAsynchronously(new Date(this.timeBasedFileNamingAndTriggeringPolicy.getCurrentTime()));
        }
    }

    public void setCleanHistoryOnStart(boolean z) {
        this.cleanHistoryOnStart = z;
    }

    public void setMaxHistory(int i2) {
        this.maxHistory = i2;
    }

    public void setTimeBasedFileNamingAndTriggeringPolicy(TimeBasedFileNamingAndTriggeringPolicy<E> timeBasedFileNamingAndTriggeringPolicy) {
        this.timeBasedFileNamingAndTriggeringPolicy = timeBasedFileNamingAndTriggeringPolicy;
    }

    public void setTotalSizeCap(FileSize fileSize) {
        StringBuilder y = a.y("setting totalSizeCap to ");
        y.append(fileSize.toString());
        addInfo(y.toString());
        this.totalSizeCap = fileSize;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.renameUtil.setContext(this.context);
        if (this.fileNamePatternStr == null) {
            addWarn(FNP_NOT_SET);
            addWarn(CoreConstants.SEE_FNP_NOT_SET);
            throw new IllegalStateException("The FileNamePattern option must be set before using TimeBasedRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
        }
        this.fileNamePattern = new FileNamePattern(this.fileNamePatternStr, this.context);
        determineCompressionMode();
        Compressor compressor = new Compressor(this.compressionMode);
        this.compressor = compressor;
        compressor.setContext(this.context);
        this.fileNamePatternWithoutCompSuffix = new FileNamePattern(Compressor.computeFileNameStrWithoutCompSuffix(this.fileNamePatternStr, this.compressionMode), this.context);
        StringBuilder y = a.y("Will use the pattern ");
        y.append(this.fileNamePatternWithoutCompSuffix);
        y.append(" for the active file");
        addInfo(y.toString());
        if (this.compressionMode == CompressionMode.ZIP) {
            this.zipEntryFileNamePattern = new FileNamePattern(transformFileNamePattern2ZipEntry(this.fileNamePatternStr), this.context);
        }
        if (this.timeBasedFileNamingAndTriggeringPolicy == null) {
            this.timeBasedFileNamingAndTriggeringPolicy = new DefaultTimeBasedFileNamingAndTriggeringPolicy();
        }
        this.timeBasedFileNamingAndTriggeringPolicy.setContext(this.context);
        this.timeBasedFileNamingAndTriggeringPolicy.setTimeBasedRollingPolicy(this);
        this.timeBasedFileNamingAndTriggeringPolicy.start();
        if (!this.timeBasedFileNamingAndTriggeringPolicy.isStarted()) {
            addWarn("Subcomponent did not start. TimeBasedRollingPolicy will not start.");
            return;
        }
        if (this.maxHistory != 0) {
            ArchiveRemover archiveRemover = this.timeBasedFileNamingAndTriggeringPolicy.getArchiveRemover();
            this.archiveRemover = archiveRemover;
            archiveRemover.setMaxHistory(this.maxHistory);
            this.archiveRemover.setTotalSizeCap(this.totalSizeCap.getSize());
            if (this.cleanHistoryOnStart) {
                addInfo("Cleaning on start up");
                this.cleanUpFuture = this.archiveRemover.cleanAsynchronously(new Date(this.timeBasedFileNamingAndTriggeringPolicy.getCurrentTime()));
            }
        } else if (!isUnboundedTotalSizeCap()) {
            StringBuilder y2 = a.y("'maxHistory' is not set, ignoring 'totalSizeCap' option with value [");
            y2.append(this.totalSizeCap);
            y2.append("]");
            addWarn(y2.toString());
        }
        super.start();
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            waitForAsynchronousJobToStop(this.compressionFuture, "compression");
            waitForAsynchronousJobToStop(this.cleanUpFuture, "clean-up");
            super.stop();
        }
    }

    public String toString() {
        StringBuilder y = a.y("c.q.l.core.rolling.TimeBasedRollingPolicy@");
        y.append(hashCode());
        return y.toString();
    }
}
