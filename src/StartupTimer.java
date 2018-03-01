import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.ui.Messages;

public class StartupTimer extends AnAction {

  @Override
  public void actionPerformed(AnActionEvent e) {

    long startTime = ApplicationManager.getApplication().getStartTime();
    long finishedTime = StartupTimerService.getInstance().getFinishedTime();
    long costTime = finishedTime - startTime;

    String message =
          "启动时间是" + startTime + "\n"
        + "完成时间是" + finishedTime + "\n"
        + "消耗时间是" + costTime;
    Messages.showMessageDialog( message,"启动消耗时间", Messages.getInformationIcon());
    System.out.println(message);
  }
}
