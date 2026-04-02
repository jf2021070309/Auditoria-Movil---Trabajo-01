package ch.qos.logback.core.rolling;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.spi.NoAutoStart;
import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.DefaultFileProvider;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.SizeAndTimeBasedArchiveRemover;
import ch.qos.logback.core.util.DefaultInvocationGate;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.InvocationGate;
import java.io.File;
@NoAutoStart
/* loaded from: classes.dex */
public class SizeAndTimeBasedFNATP<E> extends TimeBasedFileNamingAndTriggeringPolicyBase<E> {
    public static String MISSING_DATE_TOKEN = "Missing date token, that is %d, in FileNamePattern [";
    public static String MISSING_INT_TOKEN = "Missing integer token, that is %i, in FileNamePattern [";
    public int currentPeriodsCounter;
    public InvocationGate invocationGate;
    public FileSize maxFileSize;
    private final a usage;

    /* loaded from: classes.dex */
    public enum a {
        EMBEDDED,
        DIRECT
    }

    public SizeAndTimeBasedFNATP() {
        this(a.DIRECT);
    }

    public SizeAndTimeBasedFNATP(a aVar) {
        this.currentPeriodsCounter = 0;
        this.invocationGate = new DefaultInvocationGate();
        this.usage = aVar;
    }

    private boolean validDateAndIntegerTokens() {
        boolean z;
        if (this.tbrp.fileNamePattern.getIntegerTokenConverter() == null) {
            addError(MISSING_INT_TOKEN + this.tbrp.fileNamePatternStr + "]");
            addError(CoreConstants.SEE_MISSING_INTEGER_TOKEN);
            z = true;
        } else {
            z = false;
        }
        if (this.tbrp.fileNamePattern.getPrimaryDateTokenConverter() == null) {
            addError(MISSING_DATE_TOKEN + this.tbrp.fileNamePatternStr + "]");
            z = true;
        }
        return !z;
    }

    public void computeCurrentPeriodsHighestCounterValue(String str) {
        File[] filesInFolderMatchingStemRegex = FileFilterUtil.filesInFolderMatchingStemRegex(new File(getCurrentPeriodsFileNameWithoutCompressionSuffix()).getParentFile(), str);
        if (filesInFolderMatchingStemRegex == null || filesInFolderMatchingStemRegex.length == 0) {
            this.currentPeriodsCounter = 0;
            return;
        }
        this.currentPeriodsCounter = FileFilterUtil.findHighestCounter(filesInFolderMatchingStemRegex, str);
        if (this.tbrp.getParentsRawFileProperty() == null && this.tbrp.compressionMode == CompressionMode.NONE) {
            return;
        }
        this.currentPeriodsCounter++;
    }

    public ArchiveRemover createArchiveRemover() {
        return new SizeAndTimeBasedArchiveRemover(this.tbrp.fileNamePattern, this.rc, new DefaultFileProvider());
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public String getCurrentPeriodsFileNameWithoutCompressionSuffix() {
        return this.tbrp.fileNamePatternWithoutCompSuffix.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.currentPeriodsCounter));
    }

    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e2) {
        String str;
        long currentTime = getCurrentTime();
        if (currentTime >= this.nextCheck) {
            this.elapsedPeriodsFileName = this.tbrp.fileNamePatternWithoutCompSuffix.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.currentPeriodsCounter));
            this.currentPeriodsCounter = 0;
            setDateInCurrentPeriod(currentTime);
            computeNextCheck();
            return true;
        } else if (this.invocationGate.isTooSoon(currentTime)) {
            return false;
        } else {
            if (file == null) {
                str = "activeFile == null";
            } else if (this.maxFileSize != null) {
                if (file.length() >= this.maxFileSize.getSize()) {
                    this.elapsedPeriodsFileName = this.tbrp.fileNamePatternWithoutCompSuffix.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.currentPeriodsCounter));
                    this.currentPeriodsCounter++;
                    return true;
                }
                return false;
            } else {
                str = "maxFileSize = null";
            }
            addWarn(str);
            return false;
        }
    }

    public void setMaxFileSize(FileSize fileSize) {
        this.maxFileSize = fileSize;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        if (this.usage == a.DIRECT) {
            addWarn(CoreConstants.SIZE_AND_TIME_BASED_FNATP_IS_DEPRECATED);
            addWarn("For more information see http://logback.qos.ch/manual/appenders.html#SizeAndTimeBasedRollingPolicy");
        }
        if (super.isErrorFree()) {
            if (this.maxFileSize == null) {
                addError("maxFileSize property is mandatory.");
                withErrors();
            }
            if (!validDateAndIntegerTokens()) {
                withErrors();
                return;
            }
            ArchiveRemover createArchiveRemover = createArchiveRemover();
            this.archiveRemover = createArchiveRemover;
            createArchiveRemover.setContext(this.context);
            computeCurrentPeriodsHighestCounterValue(FileFilterUtil.afterLastSlash(this.tbrp.fileNamePattern.toRegexForFixedDate(this.dateInCurrentPeriod)));
            if (isErrorFree()) {
                this.started = true;
            }
        }
    }
}
