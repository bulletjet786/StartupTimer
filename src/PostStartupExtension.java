import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import org.jetbrains.annotations.NotNull;

/**
 * @author bullet
 * @time 2018-02-28 下午5:42
 */
public class PostStartupExtension implements StartupActivity {

  public long finishedTime;

  @Override
  public void runActivity(@NotNull Project project) {
    finishedTime = System.currentTimeMillis();
    StartupTimerService.getInstance().setFinishedTime(finishedTime);
    long costTime = finishedTime - ApplicationManager.getApplication().getStartTime();
    String message =
        "startTimes" + ApplicationManager.getApplication().getStartTime() + "\n"
            + "costTime是" + costTime + "\n";
    System.out.println(message);
  }
}
